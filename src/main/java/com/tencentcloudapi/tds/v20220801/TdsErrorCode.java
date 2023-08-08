package com.tencentcloudapi.tds.v20220801;
public enum TdsErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient");
     
    private String value;
    private TdsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

