package com.tencentcloudapi.dbs.v20211108;
public enum DbsErrorCode {
     /* 权限不足 */
     AUTHFAILURE_UNAUTHORIZEDOPERATIONERROR("AuthFailure.UnauthorizedOperationError"),
     
     /* 创建备份失败 */
     FAILEDOPERATION_CREATEBACKUPERR("FailedOperation.CreateBackupErr"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 数据库访问错误。 */
     INTERNALERROR_DATABASEACCESSERROR("InternalError.DatabaseAccessError"),
     
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* 内部请求失败错误 */
     INTERNALERROR_INTERNALHTTPSERVERERROR("InternalError.InternalHttpServerError"),
     
     /* InternalError.InternalInnerCommonError */
     INTERNALERROR_INTERNALINNERCOMMONERROR("InternalError.InternalInnerCommonError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.InvalidParameter */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 参数值无效或超出范围。 */
     INVALIDPARAMETERVALUE_BIZINVALIDPARAMETERVALUEERROR("InvalidParameterValue.BizInvalidParameterValueError"),
     
     /* InvalidParameterValue.InvalidParameterValue */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
     /* MissingParameter.MissingParameter */
     MISSINGPARAMETER_MISSINGPARAMETER("MissingParameter.MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 不允许的操作 */
     OPERATIONDENIED_BIZOPERATIONDENIEDERROR("OperationDenied.BizOperationDeniedError"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* ResourceNotFound.BizResourceNotFoundError */
     RESOURCENOTFOUND_BIZRESOURCENOTFOUNDERROR("ResourceNotFound.BizResourceNotFoundError"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* UnauthorizedOperation.UnauthorizedOperation */
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDOPERATION("UnauthorizedOperation.UnauthorizedOperation"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private DbsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

