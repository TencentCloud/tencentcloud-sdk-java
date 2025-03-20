package com.tencentcloudapi.csip.v20221121;
public enum CsipErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。 */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 无效的过滤器 */
     INVALIDFILTER("InvalidFilter"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Decrypt error */
     INVALIDPARAMETER_DECRYPTERROR("InvalidParameter.DecryptError"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 地域错误 */
     REGIONERROR("RegionError"),
     
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
     
     /* 未授权操作“操作审计”产品 */
     UNAUTHORIZEDOPERATION_CLOUDAUDIT("UnauthorizedOperation.CloudAudit"),
     
     /* 未授权操作“对象存储”产品 */
     UNAUTHORIZEDOPERATION_COS("UnauthorizedOperation.Cos"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CsipErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

