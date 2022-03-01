package com.tencentcloudapi.smpn.v20190822;
public enum SmpnErrorCode {
    // 内部请求超时。
     INTERNALERROR_TIMEOUT("InternalError.Timeout"),
     
    // 错误的名称。
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
    // 号码格式错误。
     INVALIDPARAMETER_PHONENUMBER("InvalidParameter.PhoneNumber"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private SmpnErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

