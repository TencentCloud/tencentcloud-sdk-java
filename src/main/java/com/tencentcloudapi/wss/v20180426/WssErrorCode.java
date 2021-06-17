package com.tencentcloudapi.wss.v20180426;
public enum WssErrorCode {
    // 证书类型错误。
     FAILEDOPERATION_CERTINVALIDPARAM("FailedOperation.CertInvalidParam"),
     
    // 证书与密钥不对应。
     FAILEDOPERATION_CERTMISMATCH("FailedOperation.CertMismatch"),
     
    // 证书格式错误。
     FAILEDOPERATION_INVALIDCERT("FailedOperation.InvalidCert"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 网络错误，请稍后重试。
     INTERNALERROR_DOMAININTERNALERROR("InternalError.DomainInternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 请求类型错误。
     INVALIDPARAMETER_REPTYPEISINVALID("InvalidParameter.RepTypeIsInvalid");
     
    private String value;
    private WssErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

