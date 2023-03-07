package com.tencentcloudapi.intlpartnersmgt.v20220928;
public enum IntlpartnersmgtErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // FailedOperation.MailIsRegistered
     FAILEDOPERATION_MAILISREGISTERED("FailedOperation.MailIsRegistered"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // InvalidParameter.AccountTypeContentIncorrect
     INVALIDPARAMETER_ACCOUNTTYPECONTENTINCORRECT("InvalidParameter.AccountTypeContentIncorrect"),
     
    // InvalidParameter.AreaContentIncorrect
     INVALIDPARAMETER_AREACONTENTINCORRECT("InvalidParameter.AreaContentIncorrect"),
     
    // InvalidParameter.AreaFormatIncorrect
     INVALIDPARAMETER_AREAFORMATINCORRECT("InvalidParameter.AreaFormatIncorrect"),
     
    // InvalidParameter.ConfirmPasswordContentIncorrect
     INVALIDPARAMETER_CONFIRMPASSWORDCONTENTINCORRECT("InvalidParameter.ConfirmPasswordContentIncorrect"),
     
    // InvalidParameter.CountryCodeContentIncorrect
     INVALIDPARAMETER_COUNTRYCODECONTENTINCORRECT("InvalidParameter.CountryCodeContentIncorrect"),
     
    // InvalidParameter.CountryCodeFormatIncorrect
     INVALIDPARAMETER_COUNTRYCODEFORMATINCORRECT("InvalidParameter.CountryCodeFormatIncorrect"),
     
    // InvalidParameter.MailFormatIncorrect
     INVALIDPARAMETER_MAILFORMATINCORRECT("InvalidParameter.MailFormatIncorrect"),
     
    // InvalidParameter.PasswordContentIncorrect
     INVALIDPARAMETER_PASSWORDCONTENTINCORRECT("InvalidParameter.PasswordContentIncorrect"),
     
    // InvalidParameter.PasswordFormatIncorrect
     INVALIDPARAMETER_PASSWORDFORMATINCORRECT("InvalidParameter.PasswordFormatIncorrect"),
     
    // InvalidParameter.PhoneNumFormatIncorrect
     INVALIDPARAMETER_PHONENUMFORMATINCORRECT("InvalidParameter.PhoneNumFormatIncorrect"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // InvalidParameterValue.AccountTypeEmpty
     INVALIDPARAMETERVALUE_ACCOUNTTYPEEMPTY("InvalidParameterValue.AccountTypeEmpty"),
     
    // InvalidParameterValue.AreaEmpty
     INVALIDPARAMETERVALUE_AREAEMPTY("InvalidParameterValue.AreaEmpty"),
     
    // InvalidParameterValue.CountryCodeEmpty
     INVALIDPARAMETERVALUE_COUNTRYCODEEMPTY("InvalidParameterValue.CountryCodeEmpty"),
     
    // InvalidParameterValue.MailEmpty
     INVALIDPARAMETERVALUE_MAILEMPTY("InvalidParameterValue.MailEmpty"),
     
    // InvalidParameterValue.PasswordEmpty
     INVALIDPARAMETERVALUE_PASSWORDEMPTY("InvalidParameterValue.PasswordEmpty"),
     
    // InvalidParameterValue.PhoneNumEmpty
     INVALIDPARAMETERVALUE_PHONENUMEMPTY("InvalidParameterValue.PhoneNumEmpty"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private IntlpartnersmgtErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

