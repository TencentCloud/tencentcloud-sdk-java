package com.tencentcloudapi.pts.v20210728;
public enum PtsErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 获取标签失败。
     FAILEDOPERATION_ACCESSTAGFAIL("FailedOperation.AccessTagFail"),
     
    // 数据库查询失败。
     FAILEDOPERATION_DBQUERYFAILED("FailedOperation.DbQueryFailed"),
     
    // 数据库创建记录失败。
     FAILEDOPERATION_DBRECORDCREATEFAILED("FailedOperation.DbRecordCreateFailed"),
     
    // 数据库记录更新失败。
     FAILEDOPERATION_DBRECORDUPDATEFAILED("FailedOperation.DbRecordUpdateFailed"),
     
    // 任务状态不是运行中。
     FAILEDOPERATION_JOBSTATUSNOTRUNNING("FailedOperation.JobStatusNotRunning"),
     
    // 任务中没有task。
     FAILEDOPERATION_NOTASKSINJOB("FailedOperation.NoTasksInJob"),
     
    // 当前环境不支持。
     FAILEDOPERATION_NOTSUPPORTEDINENV("FailedOperation.NotSupportedInEnv"),
     
    // 资源不存在。
     FAILEDOPERATION_RESOURCENOTFOUND("FailedOperation.ResourceNotFound"),
     
    // 请求发送失败。
     FAILEDOPERATION_SENDREQUEST("FailedOperation.SendRequest"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private PtsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

