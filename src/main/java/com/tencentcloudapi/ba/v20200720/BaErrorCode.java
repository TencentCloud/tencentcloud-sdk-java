package com.tencentcloudapi.ba.v20200720;
public enum BaErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 资源未找到。
     INTERNALERROR_RESOURCENOTFOUND("InternalError.ResourceNotFound"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private BaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

