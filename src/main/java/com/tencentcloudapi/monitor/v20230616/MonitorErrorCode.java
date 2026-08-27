package com.tencentcloudapi.monitor.v20230616;
public enum MonitorErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* FailedOperation.Db */
     FAILEDOPERATION_DB("FailedOperation.Db"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.Param */
     INVALIDPARAMETER_PARAM("InvalidParameter.Param"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private MonitorErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

