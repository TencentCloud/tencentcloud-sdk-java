package com.tencentcloudapi.hunyuan.v20230901;
public enum HunyuanErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 控制台服务异常。
     FAILEDOPERATION_CONSOLESERVERERROR("FailedOperation.ConsoleServerError"),
     
    // 引擎层请求超时；请稍后重试。
     FAILEDOPERATION_ENGINEREQUESTTIMEOUT("FailedOperation.EngineRequestTimeout"),
     
    // 引擎层内部错误；请稍后重试。
     FAILEDOPERATION_ENGINESERVERERROR("FailedOperation.EngineServerError"),
     
    // 引擎层请求超过限额；请稍后重试。
     FAILEDOPERATION_ENGINESERVERLIMITEXCEEDED("FailedOperation.EngineServerLimitExceeded"),
     
    // 免费资源包余量已用尽，请购买资源包或开通后付费。
     FAILEDOPERATION_FREERESOURCEPACKEXHAUSTED("FailedOperation.FreeResourcePackExhausted"),
     
    // 水印图解码失败
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
    // LogoUrl或LogoImage有误，水印图下载失败。
     FAILEDOPERATION_IMAGEDOWNLOADERROR("FailedOperation.ImageDownloadError"),
     
    // 合作伙伴账号不允许开通，请更换账号。
     FAILEDOPERATION_PARTNERACCOUNTUNSUPPORT("FailedOperation.PartnerAccountUnSupport"),
     
    // 资源包余量已用尽，请购买资源包或开通后付费。
     FAILEDOPERATION_RESOURCEPACKEXHAUSTED("FailedOperation.ResourcePackExhausted"),
     
    // 服务未开通，请前往控制台申请试用。
     FAILEDOPERATION_SERVICENOTACTIVATED("FailedOperation.ServiceNotActivated"),
     
    // 用户主动停服。
     FAILEDOPERATION_SERVICESTOP("FailedOperation.ServiceStop"),
     
    // 欠费停服。
     FAILEDOPERATION_SERVICESTOPARREARS("FailedOperation.ServiceStopArrears"),
     
    // 后付费设置次数超过每月限制。
     FAILEDOPERATION_SETPAYMODEEXCEED("FailedOperation.SetPayModeExceed"),
     
    // 用户未实名，请先进行实名认证。
     FAILEDOPERATION_USERUNAUTHERROR("FailedOperation.UserUnAuthError"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 模型不存在。
     INVALIDPARAMETERVALUE_MODEL("InvalidParameterValue.Model"),
     
    // 参数字段或者值有误
     INVALIDPARAMETERVALUE_PARAMETERVALUEERROR("InvalidParameterValue.ParameterValueError"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 图片可能包含敏感信息，请重试
     OPERATIONDENIED_IMAGEILLEGALDETECTED("OperationDenied.ImageIllegalDetected"),
     
    // 账号已欠费。
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
    // 余额不足。
     RESOURCEUNAVAILABLE_LOWBALANCE("ResourceUnavailable.LowBalance");
     
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

