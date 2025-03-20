package com.tencentcloudapi.trocket.v20230308;
public enum TrocketErrorCode {
     /*         操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /*         实例未就绪，请稍后重试。 */
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
     /*         已达到主题数上限。 */
     LIMITEXCEEDED_TOPICNUM("LimitExceeded.TopicNum"),
     
     /*         操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /*         资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /*         客户端不存在。 */
     RESOURCENOTFOUND_CLIENT("ResourceNotFound.Client"),
     
     /*         接入点不存在。 */
     RESOURCENOTFOUND_ENDPOINT("ResourceNotFound.Endpoint"),
     
     /*         消费组不存在，请检查后重试。 */
     RESOURCENOTFOUND_GROUP("ResourceNotFound.Group"),
     
     /*         实例不存在。 */
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
     /*         消息不存在。 */
     RESOURCENOTFOUND_MESSAGE("ResourceNotFound.Message"),
     
     /*         角色不存在，请检查后重试。 */
     RESOURCENOTFOUND_ROLE("ResourceNotFound.Role"),
     
     /*         主题不存在，请检查后重试。 */
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
     /*         资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /*         操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /*         实例Topic数量不能调整到已使用额度以下。 */
     UNSUPPORTEDOPERATION_INSTANCETOPICNUMDOWNGRADE("UnsupportedOperation.InstanceTopicNumDowngrade"),
     
     /*         资源已存在，请检查后重试。 */
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

