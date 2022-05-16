package com.tencentcloudapi.bi.v20220105;
public enum BiErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 内部错误。
     INTERNALERROR_INTERNAL("InternalError.Internal"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 报表嵌出类错误。
     INVALIDPARAMETER_EMBED("InvalidParameter.Embed"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 必填参数缺失。
     MISSINGPARAMETER_MISSINGPARAM("MissingParameter.MissingParam"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 权限错误。
     UNAUTHORIZEDOPERATION_AUTHORIZE("UnauthorizedOperation.Authorize"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 默认业务异常。
     UNSUPPORTEDOPERATION_BIERROR("UnsupportedOperation.BIError");
     
    private String value;
    private BiErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

