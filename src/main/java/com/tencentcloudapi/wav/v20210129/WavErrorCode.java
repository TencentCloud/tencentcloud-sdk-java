package com.tencentcloudapi.wav.v20210129;
public enum WavErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 授权码无效。
     AUTHFAILURE_INVALIDAUTHORIZATIONCODE("AuthFailure.InvalidAuthorizationCode"),
     
    // 令牌无效。
     AUTHFAILURE_MISSINGACCESSTOKEN("AuthFailure.MissingAccessToken"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 开放平台访问错误。
     FAILEDOPERATION_OPENPLATFORMERROR("FailedOperation.OpenPlatformError"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 参数值时间跨度超出接口限制。
     INVALIDPARAMETERVALUE_TIMESPANLIMITEXCEEDED("InvalidParameterValue.TimeSpanLimitExceeded"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private WavErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

