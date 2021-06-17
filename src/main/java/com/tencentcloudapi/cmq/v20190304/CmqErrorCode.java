package com.tencentcloudapi.cmq.v20190304;
public enum CmqErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 操作进行中，请稍后重试。
     FAILEDOPERATION_TRYLATER("FailedOperation.TryLater"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 任务Id不存在。
     INVALIDPARAMETERVALUE_NOTASKID("InvalidParameterValue.NoTaskId"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private CmqErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

