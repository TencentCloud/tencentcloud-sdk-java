package com.tencentcloudapi.lke.v20231130;
public enum LkeErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation");
     
    private String value;
    private LkeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

