package com.tencentcloudapi.acp.v20220105;
public enum AcpErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private AcpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

