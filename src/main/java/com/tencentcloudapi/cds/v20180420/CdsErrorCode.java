package com.tencentcloudapi.cds.v20180420;
public enum CdsErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。 */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 账户余额不足，操作失败。 */
     FAILEDOPERATION_DASBAMOUNTNOTENOUGH("FailedOperation.DasbAmountNotEnough"),
     
     /* Dasb产品操作失败错误码。 */
     FAILEDOPERATION_DASBERRORCODE("FailedOperation.DasbErrorCode"),
     
     /* SecretId错误，操作失败。 */
     FAILEDOPERATION_DASBINVALIDSECRETID("FailedOperation.DasbInvalidSecretId"),
     
     /* SecretKey错误，操作失败。 */
     FAILEDOPERATION_DASBINVALIDSECRETKEY("FailedOperation.DasbInvalidSecretKey"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 无效的资源ID，用于资源不存在或已过期。 */
     INVALIDPARAMETER_RESOURCEID("InvalidParameter.ResourceId"),
     
     /* 审计资源ID 错误。 */
     INVALIDPARAMETER_RESOURCEIDERROR("InvalidParameter.ResourceIdError"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不足。 */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* 资源售罄。 */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 无操作权限。 */
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CdsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

