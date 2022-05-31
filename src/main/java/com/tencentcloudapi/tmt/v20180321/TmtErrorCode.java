package com.tencentcloudapi.tmt.v20180321;
public enum TmtErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 本月免费额度已用完，如需继续使用您可以在机器翻译控制台升级为付费使用。
     FAILEDOPERATION_NOFREEAMOUNT("FailedOperation.NoFreeAmount"),
     
    // 账号因为欠费停止服务，请在腾讯云账户充值。
     FAILEDOPERATION_SERVICEISOLATE("FailedOperation.ServiceIsolate"),
     
    // 服务未开通，请在腾讯云官网机器翻译控制台开通服务。
     FAILEDOPERATION_USERNOTREGISTERED("FailedOperation.UserNotRegistered"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 后台服务超时，请稍后重试。
     INTERNALERROR_BACKENDTIMEOUT("InternalError.BackendTimeout"),
     
    // 未知错误。
     INTERNALERROR_ERRORUNKNOWN("InternalError.ErrorUnknown"),
     
    // 请求失败。
     INTERNALERROR_REQUESTFAILED("InternalError.RequestFailed"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 重复的SessionUuid和Seq组合。
     INVALIDPARAMETER_DUPLICATEDSESSIONIDANDSEQ("InvalidParameter.DuplicatedSessionIdAndSeq"),
     
    // 参数错误。
     INVALIDPARAMETER_MISSINGPARAMETER("InvalidParameter.MissingParameter"),
     
    // Seq之间的间隙请不要大于2000。
     INVALIDPARAMETER_SEQINTERVALTOOLARGE("InvalidParameter.SeqIntervalTooLarge"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 超出请求频率。
     LIMITEXCEEDED_LIMITEDACCESSFREQUENCY("LimitExceeded.LimitedAccessFrequency"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 请填写正确的Action字段名称。
     UNAUTHORIZEDOPERATION_ACTIONNOTFOUND("UnauthorizedOperation.ActionNotFound"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 音频分片长度超过限制，请保证分片长度小于8s。
     UNSUPPORTEDOPERATION_AUDIODURATIONEXCEED("UnsupportedOperation.AudioDurationExceed"),
     
    // 单次请求text超过长度限制，请保证单次请求⻓度低于2000。
     UNSUPPORTEDOPERATION_TEXTTOOLONG("UnsupportedOperation.TextTooLong"),
     
    // 不支持的目标语言，请参照语言列表。
     UNSUPPORTEDOPERATION_UNSUPPORTEDTARGETLANGUAGE("UnsupportedOperation.UnSupportedTargetLanguage"),
     
    // 不支持的语言，请参照语言列表。
     UNSUPPORTEDOPERATION_UNSUPPORTEDLANGUAGE("UnsupportedOperation.UnsupportedLanguage"),
     
    // 不支持的源语言，请参照语言列表。
     UNSUPPORTEDOPERATION_UNSUPPORTEDSOURCELANGUAGE("UnsupportedOperation.UnsupportedSourceLanguage");
     
    private String value;
    private TmtErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

