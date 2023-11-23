package com.tencentcloudapi.hunyuan.v20230901;
public enum HunyuanErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 引擎层请求超时；请稍后重试。
     FAILEDOPERATION_ENGINEREQUESTTIMEOUT("FailedOperation.EngineRequestTimeout"),
     
    // 引擎层内部错误；请稍后重试。
     FAILEDOPERATION_ENGINESERVERERROR("FailedOperation.EngineServerError"),
     
    // 引擎层请求超过限额；请稍后重试。
     FAILEDOPERATION_ENGINESERVERLIMITEXCEEDED("FailedOperation.EngineServerLimitExceeded"),
     
    // 免费资源包余量已用尽，请购买资源包或开通后付费。
     FAILEDOPERATION_FREERESOURCEPACKEXHAUSTED("FailedOperation.FreeResourcePackExhausted"),
     
    // 资源包余量已用尽，请购买资源包或开通后付费。
     FAILEDOPERATION_RESOURCEPACKEXHAUSTED("FailedOperation.ResourcePackExhausted"),
     
    // 服务未开通，请前往控制台申请试用。
     FAILEDOPERATION_SERVICENOTACTIVATED("FailedOperation.ServiceNotActivated"),
     
    // 用户主动停服。
     FAILEDOPERATION_SERVICESTOP("FailedOperation.ServiceStop"),
     
    // 欠费停服。
     FAILEDOPERATION_SERVICESTOPARREARS("FailedOperation.ServiceStopArrears"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 非白名单帐号，请前往控制台申请试用。
     UNSUPPORTEDOPERATION_NONWHITELISTACCOUNT("UnsupportedOperation.NonWhitelistAccount");
     
    private String value;
    private HunyuanErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

