package com.tencentcloudapi.tms.v20200713;
public enum TmsErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 请求超时。
     INTERNALERROR_ERRTEXTTIMEOUT("InternalError.ErrTextTimeOut"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 错误的action。
     INVALIDPARAMETER_ERRACTION("InvalidParameter.ErrAction"),
     
    // 请求的文本长度过长。
     INVALIDPARAMETER_ERRTEXTCONTENTLEN("InvalidParameter.ErrTextContentLen"),
     
    // 文本类型错误，需要base64的文本。
     INVALIDPARAMETER_ERRTEXTCONTENTTYPE("InvalidParameter.ErrTextContentType"),
     
    // 参数内容格式错误。
     INVALIDPARAMETER_INVALIDPARAMETERCONTENT("InvalidParameter.InvalidParameterContent"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 请求的文本格式错误（需要base64编码格式的文本）。
     INVALIDPARAMETERVALUE_ERRTEXTCONTENTTYPE("InvalidParameterValue.ErrTextContentType"),
     
    // EvilContent参数太长。
     INVALIDPARAMETERVALUE_INVALIDEVILCONTENT("InvalidParameterValue.InvalidEvilContent"),
     
    // EvilType取值错误。
     INVALIDPARAMETERVALUE_INVALIDEVILTYPE("InvalidParameterValue.InvalidEvilType"),
     
    // ReportedAccount参数错误。
     INVALIDPARAMETERVALUE_INVALIDREPORTEDACCOUNT("InvalidParameterValue.InvalidReportedAccount"),
     
    // ReportedAccount参数太长。
     INVALIDPARAMETERVALUE_INVALIDREPORTEDACCOUNTLENGTH("InvalidParameterValue.InvalidReportedAccountLength"),
     
    // ReportedAccountType参数错误。
     INVALIDPARAMETERVALUE_INVALIDREPORTEDACCOUNTTYPE("InvalidParameterValue.InvalidReportedAccountType"),
     
    // SenderAccount参数错误。
     INVALIDPARAMETERVALUE_INVALIDSENDERACCOUNT("InvalidParameterValue.InvalidSenderAccount"),
     
    // SenderAccount参数太长。
     INVALIDPARAMETERVALUE_INVALIDSENDERACCOUNTLENGTH("InvalidParameterValue.InvalidSenderAccountLength"),
     
    // SenderAccountType参数错误。
     INVALIDPARAMETERVALUE_INVALIDSENDERACCOUNTTYPE("InvalidParameterValue.InvalidSenderAccountType"),
     
    // SenderIP参数错误。
     INVALIDPARAMETERVALUE_INVALIDSENDERIP("InvalidParameterValue.InvalidSenderIP"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
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

