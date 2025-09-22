package com.tencentcloudapi.wedata.v20250806;
public enum WedataErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* ClientIp未被授权。 */
     INVALIDPARAMETER_CLIENTIPNOTAUTHORIZED("InvalidParameter.ClientIpNotAuthorized"),
     
     /* Missing Servlet Request Parameter */
     INVALIDPARAMETER_MISSINGREQUESTPARAMETER("InvalidParameter.MissingRequestParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 告警规则名称重复 */
     INVALIDPARAMETERVALUE_RULENAMEREPEATED("InvalidParameterValue.RuleNameRepeated"),
     
     /* Param Validation Error */
     INVALIDPARAMETERVALUE_VALIDATIONERROR("InvalidParameterValue.ValidationError"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private WedataErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

