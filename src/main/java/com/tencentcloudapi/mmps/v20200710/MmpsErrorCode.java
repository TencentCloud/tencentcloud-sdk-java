package com.tencentcloudapi.mmps.v20200710;
public enum MmpsErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private MmpsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

