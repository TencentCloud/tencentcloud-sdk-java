package com.tencentcloudapi.ams.v20201229;
public enum AmsErrorCode {
     /* DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。 */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.ImageSizeTooSmall */
     INVALIDPARAMETER_IMAGESIZETOOSMALL("InvalidParameter.ImageSizeTooSmall"),
     
     /* InvalidParameter.InvalidImageContent */
     INVALIDPARAMETER_INVALIDIMAGECONTENT("InvalidParameter.InvalidImageContent"),
     
     /* InvalidParameter.ParameterError */
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* InvalidParameterValue.EmptyImageContent */
     INVALIDPARAMETERVALUE_EMPTYIMAGECONTENT("InvalidParameterValue.EmptyImageContent"),
     
     /* InvalidParameterValue.ImageSizeTooSmall */
     INVALIDPARAMETERVALUE_IMAGESIZETOOSMALL("InvalidParameterValue.ImageSizeTooSmall"),
     
     /* InvalidParameterValue.InvalidContent */
     INVALIDPARAMETERVALUE_INVALIDCONTENT("InvalidParameterValue.InvalidContent"),
     
     /* InvalidParameterValue.InvalidDataId */
     INVALIDPARAMETERVALUE_INVALIDDATAID("InvalidParameterValue.InvalidDataId"),
     
     /* InvalidParameterValue.InvalidFileContentSize */
     INVALIDPARAMETERVALUE_INVALIDFILECONTENTSIZE("InvalidParameterValue.InvalidFileContentSize"),
     
     /* InvalidParameterValue.InvalidImageContent */
     INVALIDPARAMETERVALUE_INVALIDIMAGECONTENT("InvalidParameterValue.InvalidImageContent"),
     
     /* InvalidParameterValue.InvalidParameter */
     INVALIDPARAMETERVALUE_INVALIDPARAMETER("InvalidParameterValue.InvalidParameter"),
     
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
     
     /* ResourceUnavailable.InvalidImageContent */
     RESOURCEUNAVAILABLE_INVALIDIMAGECONTENT("ResourceUnavailable.InvalidImageContent"),
     
     /* 资源售罄。 */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 未开通权限/无有效套餐包/账号已欠费。 */
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private AmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

