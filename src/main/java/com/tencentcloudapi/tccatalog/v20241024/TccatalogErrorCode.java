package com.tencentcloudapi.tccatalog.v20241024;
public enum TccatalogErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 时间格式异常，仅支持：YYYY-mm-dd HH:MM:SS
     INVALIDPARAMETER_INVALIDTIMEFORMAT("InvalidParameter.InvalidTimeFormat"),
     
    // 无效的时间，结束时间应大于起始时间
     INVALIDPARAMETER_INVALIDTIMEPARAMETER("InvalidParameter.InvalidTimeParameter"),
     
    // 集群未处于运行状态
     RESOURCEUNAVAILABLE_CLUSTERUNAVAILABLE("ResourceUnavailable.ClusterUnavailable"),
     
    // 该用户禁止当前操作
     UNAUTHORIZEDOPERATION_USERNOTALLOWOPERATION("UnauthorizedOperation.UserNotAllowOperation");
     
    private String value;
    private TccatalogErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

