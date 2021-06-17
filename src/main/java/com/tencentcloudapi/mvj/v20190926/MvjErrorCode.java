package com.tencentcloudapi.mvj.v20190926;
public enum MvjErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 请求超时,请重试。
     INTERNALERROR_ERRTIMEOUT("InternalError.ErrTimeOut"),
     
    // 账号未开通服务。
     INVALIDPARAMETERVALUE_ACCOUNTNOTFOUND("InvalidParameterValue.AccountNotFound"),
     
    // 无效的公网ip地址。
     INVALIDPARAMETERVALUE_INVALIDIP("InvalidParameterValue.InvalidIp"),
     
    // 手机号码无效。
     INVALIDPARAMETERVALUE_INVALIDMOBILENUMBER("InvalidParameterValue.InvalidMobileNumber");
     
    private String value;
    private MvjErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

