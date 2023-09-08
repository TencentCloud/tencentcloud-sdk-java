package com.tencentcloudapi.trocket.v20230308;
public enum TrocketErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 实例未就绪，请稍后重试。
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 实例不存在。
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private TrocketErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

