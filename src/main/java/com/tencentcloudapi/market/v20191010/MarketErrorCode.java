package com.tencentcloudapi.market.v20191010;
public enum MarketErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private MarketErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

