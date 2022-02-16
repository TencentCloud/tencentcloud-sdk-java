package com.tencentcloudapi.gs.v20191118;
public enum GsErrorCode {
    // 锁定机器超时或未调用TrylockWorker。
     FAILEDOPERATION_LOCKTIMEOUT("FailedOperation.LockTimeout"),
     
    // 处理超时。
     FAILEDOPERATION_PROCESSTIMEOUT("FailedOperation.ProcessTimeout"),
     
    // 请降低访问频率。
     FAILEDOPERATION_SLOWDOWN("FailedOperation.SlowDown"),
     
    // 操作超时。
     FAILEDOPERATION_TIMEOUT("FailedOperation.Timeout"),
     
    // 请求太频繁。
     FAILEDOPERATION_TOOFREQUENTLY("FailedOperation.TooFrequently"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // Json解析失败。
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 【多人游戏】对应的角色人数超过限制。
     LIMITEXCEEDED_ROLE("LimitExceeded.Role"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 没有空闲机器。
     RESOURCENOTFOUND_NOIDLE("ResourceNotFound.NoIdle"),
     
    // 会话未找到。
     RESOURCENOTFOUND_SESSIONNOTFOUND("ResourceNotFound.SessionNotFound"),
     
    // 访问并发实例失败。
     RESOURCEUNAVAILABLE_ACCESSFAILED("ResourceUnavailable.AccessFailed"),
     
    // 机器还在初始化中。
     RESOURCEUNAVAILABLE_INITIALIZATION("ResourceUnavailable.Initialization"),
     
    // 机器未运行。
     UNSUPPORTEDOPERATION_NOTRUNNING("UnsupportedOperation.NotRunning"),
     
    // 退出游戏中。
     UNSUPPORTEDOPERATION_STOPPING("UnsupportedOperation.Stopping");
     
    private String value;
    private GsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

