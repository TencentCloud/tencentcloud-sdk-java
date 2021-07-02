package com.tencentcloudapi.eis.v20200715;
public enum EisErrorCode {
    // 鉴权失败。
     FAILEDOPERATION_AUTHENTICATIONFAILED("FailedOperation.AuthenticationFailed"),
     
    // 依赖服务错误。
     FAILEDOPERATION_METACOMPILERERROR("FailedOperation.MetaCompilerError"),
     
    // 数据库内部错误。
     INTERNALERROR_DATABASEERROR("InternalError.DatabaseError"),
     
    // rpc调用异常。
     INTERNALERROR_RPCPILOTSERVERERROR("InternalError.RpcPilotServerError"),
     
    // 连接器不存在。
     INVALIDPARAMETERVALUE_CONNECTORNOTEXIST("InvalidParameterValue.ConnectorNotExist"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
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

