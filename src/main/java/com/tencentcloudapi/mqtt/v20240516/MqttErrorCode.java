package com.tencentcloudapi.mqtt.v20240516;
public enum MqttErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // FailedOperation.InstanceNotReady
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
    // FailedOperation.PublicKeyVerifyFailed
     FAILEDOPERATION_PUBLICKEYVERIFYFAILED("FailedOperation.PublicKeyVerifyFailed"),
     
    // LimitExceeded.TopicNum
     LIMITEXCEEDED_TOPICNUM("LimitExceeded.TopicNum"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // ResourceNotFound.Instance
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
    // ResourceNotFound.Role
     RESOURCENOTFOUND_ROLE("ResourceNotFound.Role"),
     
    // ResourceNotFound.Topic
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // UnsupportedOperation.ResourceAlreadyExists
     UNSUPPORTEDOPERATION_RESOURCEALREADYEXISTS("UnsupportedOperation.ResourceAlreadyExists");
     
    private String value;
    private MqttErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

