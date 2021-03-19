package com.cs.personal.utils;

import com.cs.personal.dto.Result;
import org.springframework.stereotype.Component;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/11 17:23
 * @description：前端请求返回展示`
 * @version: 1.0$
 */
@Component
public class ResultUtil {

    private static final Result RESULT = new Result();

    public Result success() {
        RESULT.setCode("200");
        RESULT.setMessage("成功");
        return RESULT;
    }

    public Result successWithMsgBody(Object obj) {
        RESULT.setCode("200");
        RESULT.setMessage("成功");
        RESULT.setMsgBody(obj);
        return RESULT;
    }

    public Result fail() {
        RESULT.setCode("500");
        RESULT.setMessage("失败");
        return RESULT;
    }
}
