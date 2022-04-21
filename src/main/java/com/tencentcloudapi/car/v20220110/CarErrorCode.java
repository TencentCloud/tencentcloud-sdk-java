package com.tencentcloudapi.car.v20220110;
public enum CarErrorCode {
    // 未申请并发或申请后超时。
     FAILEDOPERATION_LOCKTIMEOUT("FailedOperation.LockTimeout"),
     
    // 处理超时。
     FAILEDOPERATION_PROCESSTIMEOUT("FailedOperation.ProcessTimeout"),
     
    // 请降低访问频率。
     FAILEDOPERATION_SLOWDOWN("FailedOperation.SlowDown"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // Json 解析失败。
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
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

