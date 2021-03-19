package com.cs.personal.controller;

import com.cs.personal.dto.BillDto;
import com.cs.personal.dto.Result;
import com.cs.personal.service.BillService;
import com.cs.personal.utils.ResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/15 16:55
 * @description：账单控制层
 * @version: 1.0$
 */
@RestController
@RequestMapping(value = "/api/v1/bill")
public class BillController {

    @Resource
    private BillService billService;

    @Resource
    private ResultUtil resultUtil;

    @GetMapping(value = "/query/{id}")
    public Result queryBill(@PathVariable(value = "id") Integer id) {
        BillDto billDto = billService.selectBillById(id);
        return resultUtil.successWithMsgBody(billDto);
    }

    @PostMapping(value = "/add")
    public Result addBill(@RequestBody BillDto billDto) {
        billService.insertBill(billDto);
        return resultUtil.success();
    }

    @PostMapping(value = "/update")
    public Result updateBill(@RequestBody BillDto billDto) {
        BillDto billDto1 = billService.updateBill(billDto);
        return resultUtil.successWithMsgBody(billDto1);
    }


}
