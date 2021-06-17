package com.tencentcloudapi.memcached.v20190318;
public enum MemcachedErrorCode {
    // 数据库操作异常
     FAILEDOPERATION_DBOPERATIONFAILED("FailedOperation.DbOperationFailed"),
     
    // 系统内部错误
     FAILEDOPERATION_SYSTEMERROR("FailedOperation.SystemError"),
     
    // 内部错误
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
    // 业务参数错误
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
    // 参数为空
     MISSINGPARAMETER_EMPTYPARAM("MissingParameter.EmptyParam"),
     
    // 未提供有效的账号
     RESOURCENOTFOUND_ACCOUNTDOESNOTEXISTS("ResourceNotFound.AccountDoesNotExists"),
     
    // Cam鉴权失败
     UNAUTHORIZEDOPERATION_NOCAMAUTHED("UnauthorizedOperation.NoCAMAuthed");
     
    private String value;
    private MemcachedErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

