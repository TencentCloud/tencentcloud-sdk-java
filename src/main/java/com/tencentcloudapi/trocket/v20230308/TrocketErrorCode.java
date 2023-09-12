package com.tencentcloudapi.trocket.v20230308;
public enum TrocketErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 实例未就绪，请稍后重试。
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
    // 已达到主题数上限。
     LIMITEXCEEDED_TOPICNUM("LimitExceeded.TopicNum"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 消费组不存在，请检查后重试。
     RESOURCENOTFOUND_GROUP("ResourceNotFound.Group"),
     
    // 实例不存在。
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
    // 主题不存在，请检查后重试。
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源已存在，请检查后重试。
     UNSUPPORTEDOPERATION_RESOURCEALREADYEXISTS("UnsupportedOperation.ResourceAlreadyExists");
     
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

