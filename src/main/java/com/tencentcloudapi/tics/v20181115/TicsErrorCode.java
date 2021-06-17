package com.tencentcloudapi.tics.v20181115;
public enum TicsErrorCode {
    // 内部系统错误，组件异常。
     INTERNALERROR_CACHEERR("InternalError.CacheErr"),
     
    // 内部系统错误，逻辑错误。
     INTERNALERROR_LOCALERR("InternalError.LocalErr"),
     
    // 内部系统错误，超时等异常。
     INTERNALERROR_TIMEOUT("InternalError.Timeout"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded");
     
    private String value;
    private TicsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

