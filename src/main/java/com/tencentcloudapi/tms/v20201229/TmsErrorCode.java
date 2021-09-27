package com.tencentcloudapi.tms.v20201229;
public enum TmsErrorCode {
    // 请求超时。
     INTERNALERROR_ERRTEXTTIMEOUT("InternalError.ErrTextTimeOut"),
     
    // 错误的action。
     INVALIDPARAMETER_ERRACTION("InvalidParameter.ErrAction"),
     
    // 请求的文本长度过长。
     INVALIDPARAMETER_ERRTEXTCONTENTLEN("InvalidParameter.ErrTextContentLen"),
     
    // 文本类型错误，需要base64的文本。
     INVALIDPARAMETER_ERRTEXTCONTENTTYPE("InvalidParameter.ErrTextContentType"),
     
    // 请求的文本长度超过限制。
     INVALIDPARAMETERVALUE_ERRTEXTCONTENTLEN("InvalidParameterValue.ErrTextContentLen"),
     
    // 请求的文本格式错误（需要base64编码格式的文本）。
     INVALIDPARAMETERVALUE_ERRTEXTCONTENTTYPE("InvalidParameterValue.ErrTextContentType"),
     
    // 未获取到接口授权。
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized");
     
    private String value;
    private TmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

