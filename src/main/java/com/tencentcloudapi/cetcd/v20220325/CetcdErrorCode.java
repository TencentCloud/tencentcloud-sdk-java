package com.tencentcloudapi.cetcd.v20220325;
public enum CetcdErrorCode {
     /* 资源已存在。 */
     FAILEDOPERATION_RESOURCEEXISTALREADY("FailedOperation.ResourceExistAlready"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 记录未找到。 */
     INTERNALERROR_DBRECORDNOTFOUND("InternalError.DbRecordNotFound"),
     
     /* 内部错误。 */
     INTERNALERROR_UNEXPECTEDINTERNAL("InternalError.UnexpectedInternal"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_PARAM("InvalidParameter.Param"),
     
     /* etcd配额达到限制。 */
     LIMITEXCEEDED_QUOTAETCDLIMIT("LimitExceeded.QuotaEtcdLimit"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Prometheus状态异常。 */
     RESOURCEUNAVAILABLE_PROMETHEUSSTATUSERROR("ResourceUnavailable.PrometheusStatusError"),
     
     /* CAM权限校验失败。 */
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CetcdErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

