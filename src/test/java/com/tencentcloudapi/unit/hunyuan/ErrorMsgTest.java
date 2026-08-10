package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.ErrorMsg;
import org.junit.Test;

import java.util.HashMap;

public class ErrorMsgTest {
    @Test
    public void testErrorMsg() {
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setMsg("msg");
        assert errorMsg.getMsg().equals("msg");

        errorMsg.setCode(1L);
        assert errorMsg.getCode() == 1L;

        new ErrorMsg(errorMsg);
        errorMsg.toMap(new HashMap<>(), "prefix");
    }
}
