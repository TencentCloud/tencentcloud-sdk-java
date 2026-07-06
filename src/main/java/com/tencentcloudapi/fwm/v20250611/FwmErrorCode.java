package com.tencentcloudapi.fwm.v20250611;
public enum FwmErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。 */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* InternalError.Unknown */
     INTERNALERROR_UNKNOWN("InternalError.Unknown"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* MissingParameter.CommonParam */
     MISSINGPARAMETER_COMMONPARAM("MissingParameter.CommonParam"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不足。 */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* ResourceNotFound.NotFound */
     RESOURCENOTFOUND_NOTFOUND("ResourceNotFound.NotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private FwmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

