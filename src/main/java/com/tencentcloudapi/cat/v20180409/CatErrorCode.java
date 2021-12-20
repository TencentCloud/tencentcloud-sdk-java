package com.tencentcloudapi.cat.v20180409;
public enum CatErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 数据库查询错误。
     FAILEDOPERATION_DBQUERYFAILED("FailedOperation.DbQueryFailed"),
     
    // 数据库创建失败。
     FAILEDOPERATION_DBRECORDCREATEFAILED("FailedOperation.DbRecordCreateFailed"),
     
    // 数据库更新失败。
     FAILEDOPERATION_DBRECORDUPDATEFAILED("FailedOperation.DbRecordUpdateFailed"),
     
    // ES查询错误。
     FAILEDOPERATION_ESQUERYERROR("FailedOperation.ESQueryError"),
     
    // 无有效节点。
     FAILEDOPERATION_NOVALIDNODES("FailedOperation.NoValidNodes"),
     
    // 账单欠费。
     FAILEDOPERATION_ORDEROUTOFCREDIT("FailedOperation.OrderOutOfCredit"),
     
    // 资源不存在。
     FAILEDOPERATION_RESOURCENOTFOUND("FailedOperation.ResourceNotFound"),
     
    // 任务未运行。
     FAILEDOPERATION_TASKNOTRUNNING("FailedOperation.TaskNotRunning"),
     
    // 任务未暂停。
     FAILEDOPERATION_TASKNOTSUSPENDED("FailedOperation.TaskNotSuspended"),
     
    // 任务状态不允许当前操作。
     FAILEDOPERATION_TASKOPERATIONNOTALLOW("FailedOperation.TaskOperationNotAllow"),
     
    // 批量拨测任务的类型不相同。
     FAILEDOPERATION_TASKTYPENOTSAME("FailedOperation.TaskTypeNotSame"),
     
    // 试用任务量超时。
     FAILEDOPERATION_TRIALTASKEXCEED("FailedOperation.TrialTaskExceed"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private CatErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

