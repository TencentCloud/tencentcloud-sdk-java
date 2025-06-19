package com.tencentcloudapi.tke.v20220501;
public enum TkeErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* db错误。 */
     INTERNALERROR_DB("InternalError.Db"),
     
     /* DB错误。 */
     INTERNALERROR_DBAFFECTIVEDROWS("InternalError.DbAffectivedRows"),
     
     /* 记录未找到。 */
     INTERNALERROR_DBRECORDNOTFOUND("InternalError.DbRecordNotFound"),
     
     /* 初始化master失败。 */
     INTERNALERROR_INITMASTERFAILED("InternalError.InitMasterFailed"),
     
     /* 参数错误。 */
     INTERNALERROR_PARAM("InternalError.Param"),
     
     /* 公共集群不支持扩展节点。 */
     INTERNALERROR_PUBLICCLUSTEROPNOTSUPPORT("InternalError.PublicClusterOpNotSupport"),
     
     /* 内部错误。 */
     INTERNALERROR_UNEXCEPTEDINTERNAL("InternalError.UnexceptedInternal"),
     
     /* 未知的内部错误。 */
     INTERNALERROR_UNEXPECTEDINTERNAL("InternalError.UnexpectedInternal"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 集群ID不存在。 */
     INVALIDPARAMETER_CLUSTERNOTFOUND("InvalidParameter.ClusterNotFound"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_PARAM("InvalidParameter.Param"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 集群不存在。 */
     RESOURCENOTFOUND_CLUSTERNOTFOUND("ResourceNotFound.ClusterNotFound"),
     
     /* 集群状态不支持该操作。 */
     RESOURCEUNAVAILABLE_CLUSTERSTATE("ResourceUnavailable.ClusterState"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TkeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

