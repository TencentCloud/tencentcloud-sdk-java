package com.tencentcloudapi.mqtt.v20240516;
public enum MqttErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 交易异常 */
     FAILEDOPERATION_CALLTRADE("FailedOperation.CallTrade"),
     
     /* FailedOperation.CertificateVerificationFailed */
     FAILEDOPERATION_CERTIFICATEVERIFICATIONFAILED("FailedOperation.CertificateVerificationFailed"),
     
     /* 策略优先级重复 */
     FAILEDOPERATION_DUPLICATEAUTHORIZATIONIDORPRIORITY("FailedOperation.DuplicateAuthorizationIdOrPriority"),
     
     /* FailedOperation.InstanceNotReady */
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
     /* FailedOperation.InstanceRegistrationCodeEmpty */
     FAILEDOPERATION_INSTANCEREGISTRATIONCODEEMPTY("FailedOperation.InstanceRegistrationCodeEmpty"),
     
     /* 授权策略不支持关闭。 */
     FAILEDOPERATION_NOTSUPPORTDISABLEAUTHORIZATIONPOLICY("FailedOperation.NotSupportDisableAuthorizationPolicy"),
     
     /* FailedOperation.PublicKeyVerifyFailed */
     FAILEDOPERATION_PUBLICKEYVERIFYFAILED("FailedOperation.PublicKeyVerifyFailed"),
     
     /* FailedOperation.RegistrationCodeVerifyFailed */
     FAILEDOPERATION_REGISTRATIONCODEVERIFYFAILED("FailedOperation.RegistrationCodeVerifyFailed"),
     
     /* RelatedDeviceCertificateExists */
     FAILEDOPERATION_RELATEDDEVICECERTIFICATEEXISTS("FailedOperation.RelatedDeviceCertificateExists"),
     
     /* LimitExceeded.TopicNum */
     LIMITEXCEEDED_TOPICNUM("LimitExceeded.TopicNum"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 授权策略未找到 */
     RESOURCENOTFOUND_AUTHORIZATIONPOLICY("ResourceNotFound.AuthorizationPolicy"),
     
     /* ResourceNotFound.Instance */
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
     /* ResourceNotFound.Role */
     RESOURCENOTFOUND_ROLE("ResourceNotFound.Role"),
     
     /* ResourceNotFound.Topic */
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
     /* 用户名未找到 */
     RESOURCENOTFOUND_USERNAME("ResourceNotFound.Username"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* UnsupportedOperation.ResourceAlreadyExists */
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

