package com.tencentcloudapi.eis.v20210601;
public enum EisErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 鉴权失败。 */
     FAILEDOPERATION_AUTHENTICATIONFAILED("FailedOperation.AuthenticationFailed"),
     
     /* 接口处理超时。 */
     FAILEDOPERATION_INNERLOGICTIMEOUT("FailedOperation.InnerLogicTimeOut"),
     
     /* 依赖服务错误。 */
     FAILEDOPERATION_METACOMPILERERROR("FailedOperation.MetaCompilerError"),
     
     /* 不支持的操作类型。 */
     FAILEDOPERATION_UNSUPPORTEDOPERATIONTYPE("FailedOperation.UnSupportedOperationType"),
     
     /* 检查运行时失败。 */
     INTERNALERROR_CHECKRUNTIMEFAILED("InternalError.CheckRuntimeFailed"),
     
     /* connector不存在。 */
     INTERNALERROR_CONNECTORNOTEXIST("InternalError.ConnectorNotExist"),
     
     /* 获取运行时应用数量失败。 */
     INTERNALERROR_COUNTRUNTIMEINSTANCESFAILED("InternalError.CountRuntimeInstancesFailed"),
     
     /* 数据库内部错误。 */
     INTERNALERROR_DATABASEERROR("InternalError.DatabaseError"),
     
     /* 获取运行时应用列表失败。 */
     INTERNALERROR_LISTRUNTIMEINSTANCESFAILED("InternalError.ListRuntimeInstancesFailed"),
     
     /* 获取运行时列表失败。 */
     INTERNALERROR_LISTRUNTIMESFAILED("InternalError.ListRuntimesFailed"),
     
     /* 依赖模块metacompiler错误。 */
     INTERNALERROR_METACOMPILERERROR("InternalError.MetaCompilerError"),
     
     /* rpc调用异常。 */
     INTERNALERROR_RPCPILOTSERVERERROR("InternalError.RpcPilotServerError"),
     
     /* 指标查询参数错误。 */
     INVALIDPARAMETERVALUE_INVALIDRUNTIMEMETRICSEARCHCONDITION("InvalidParameterValue.InvalidRuntimeMetricSearchCondition"),
     
     /* 共享运行时不支持此操作。 */
     INVALIDPARAMETERVALUE_NOTSUPPORTEDACTIONFORPUBLICRUNTIME("InvalidParameterValue.NotSupportedActionForPublicRuntime"),
     
     /* 不支持的Zone。 */
     INVALIDPARAMETERVALUE_PILOTZONENOTSUPPORTED("InvalidParameterValue.PilotZoneNotSupported"),
     
     /* 应用和实例不匹配。 */
     INVALIDPARAMETERVALUE_PROJECTANDINSTANCENOTMATCH("InvalidParameterValue.ProjectAndInstanceNotMatch"),
     
     /* 应用实例ID不存在。 */
     INVALIDPARAMETERVALUE_PROJECTINSTANCENOTFOUND("InvalidParameterValue.ProjectInstanceNotFound"),
     
     /* 运行时已删除。 */
     INVALIDPARAMETERVALUE_RUNTIMEALREADYDELETED("InvalidParameterValue.RuntimeAlreadyDeleted"),
     
     /* 运行时不存在。 */
     INVALIDPARAMETERVALUE_RUNTIMEIDNOTEXIST("InvalidParameterValue.RuntimeIdNotExist"),
     
     /* 当前指标不支持查询百分比。 */
     INVALIDPARAMETERVALUE_RUNTIMEMETRICRATENOTSUPPORT("InvalidParameterValue.RuntimeMetricRateNotSupport"),
     
     /* 运行时命名空间不合法。 */
     INVALIDPARAMETERVALUE_RUNTIMENAMESPACEINVALID("InvalidParameterValue.RuntimeNamespaceInvalid"),
     
     /* 运行时地域不存在。 */
     INVALIDPARAMETERVALUE_RUNTIMEZONENOTEXISTED("InvalidParameterValue.RuntimeZoneNotExisted"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private EisErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

