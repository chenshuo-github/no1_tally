package com.cs.personal.utils;

import com.cs.personal.dto.ResultObject;
import org.springframework.stereotype.Component;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/11 17:23
 * @description：前端请求返回展示`
 * @version: 1.0$
 */
@Component
public class ResultUtil {

    private static final ResultObject resultObject = new ResultObject();

    public ResultObject success() {
        resultObject.setCode("200");
        resultObject.setMessage("成功");
        return resultObject;
    }

    public ResultObject successWithMsgBody(Object obj) {
        resultObject.setCode("200");
        resultObject.setMessage("成功");
        resultObject.setMsgBody(obj);
        return resultObject;
    }

    public ResultObject fail() {
        resultObject.setCode("500");
        resultObject.setMessage("失败");
        return resultObject;
    }
}
