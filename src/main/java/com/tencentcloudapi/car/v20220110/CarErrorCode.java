package com.tencentcloudapi.car.v20220110;
public enum CarErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 未申请并发或申请后超时。
     FAILEDOPERATION_LOCKTIMEOUT("FailedOperation.LockTimeout"),
     
    // 路径无法找到
     FAILEDOPERATION_PATHNOTFOUND("FailedOperation.PathNotFound"),
     
    // 处理超时。
     FAILEDOPERATION_PROCESSTIMEOUT("FailedOperation.ProcessTimeout"),
     
    // 该UserId请求正在处理中，请稍后再试。
     FAILEDOPERATION_SLOWDOWN("FailedOperation.SlowDown"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // Json 解析失败。
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 【多人互动】对应的角色人数超过限制。
     LIMITEXCEEDED_ROLE("LimitExceeded.Role"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 没有空闲并发。
     RESOURCENOTFOUND_NOIDLE("ResourceNotFound.NoIdle"),
     
    // 未找到会话。
     RESOURCENOTFOUND_SESSIONNOTFOUND("ResourceNotFound.SessionNotFound"),
     
    // 访问并发实例失败。
     RESOURCEUNAVAILABLE_ACCESSFAILED("ResourceUnavailable.AccessFailed"),
     
    // 初始化中。
     RESOURCEUNAVAILABLE_INITIALIZATION("ResourceUnavailable.Initialization"),
     
    // 销毁会话中。
     UNSUPPORTEDOPERATION_STOPPING("UnsupportedOperation.Stopping");
     
    private String value;
    private CarErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

