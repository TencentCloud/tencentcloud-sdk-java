package com.tencentcloudapi.tic.v20201117;
public enum TicErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // HTTP请求错误。
     FAILEDOPERATION_HTTPREQUESTERROR("FailedOperation.HttpRequestError"),
     
    // 资源不存在。
     FAILEDOPERATION_NOTEXIST("FailedOperation.NotExist"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 使用的云存储错误。
     INTERNALERROR_COSERROR("InternalError.CosError"),
     
    // 数据库操作错误。
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // 使用的消息队列错误。
     INTERNALERROR_MQERROR("InternalError.MqError"),
     
    // 系统错误。
     INTERNALERROR_SYSTEM("InternalError.System"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数错误。
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // 禁止操作。
     UNSUPPORTEDOPERATION_FORBIDOP("UnsupportedOperation.ForbidOp");
     
    private String value;
    private TicErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

