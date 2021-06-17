package com.tencentcloudapi.cim.v20190318;
public enum CimErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter");
     
    private String value;
    private CimErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

