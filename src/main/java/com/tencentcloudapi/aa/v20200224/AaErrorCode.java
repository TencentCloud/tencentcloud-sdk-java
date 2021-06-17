package com.tencentcloudapi.aa.v20200224;
public enum AaErrorCode {
    // 验证码签名错误。
     AUTHFAILURE_CAPSIGERROR("AuthFailure.CapSigError"),
     
    // 请求过期。
     AUTHFAILURE_EXPIRED("AuthFailure.Expired"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 业务系统逻辑错误。
     INTERNALERROR_BACKENDLOGICERROR("InternalError.BackendLogicError"),
     
    // 连接数据库超时。
     INTERNALERROR_CONNECTDBTIMEOUT("InternalError.ConnectDBTimeout"),
     
    // Sign后端错误。
     INTERNALERROR_SIGNBACKENDERROR("InternalError.SignBackendError"),
     
    // 验证码签名错误。
     INVALIDPARAMETER_CAPSIGERROR("InvalidParameter.CapSigError"),
     
    // 参数错误。
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // URL错误。
     INVALIDPARAMETER_URLERROR("InvalidParameter.UrlError"),
     
    // 版本错误。
     INVALIDPARAMETER_VERSIONERROR("InvalidParameter.VersionError"),
     
    // BadBody。
     INVALIDPARAMETERVALUE_BADBODY("InvalidParameterValue.BadBody"),
     
    // 请求包过大。
     INVALIDPARAMETERVALUE_BODYTOOLARGE("InvalidParameterValue.BodyTooLarge"),
     
    // 验证码不匹配。
     INVALIDPARAMETERVALUE_CAPMISMATCH("InvalidParameterValue.CapMisMatch"),
     
    // HTTP方法错误。
     INVALIDPARAMETERVALUE_HTTPMETHODERROR("InvalidParameterValue.HttpMethodError"),
     
    // 日期取值错误。
     INVALIDPARAMETERVALUE_INVALIDDATE("InvalidParameterValue.InvalidDate"),
     
    // PageLimit取值错误。
     INVALIDPARAMETERVALUE_INVALIDLIMIT("InvalidParameterValue.InvalidLimit"),
     
    // PageNum取值错误。
     INVALIDPARAMETERVALUE_INVALIDNUM("InvalidParameterValue.InvalidNum"),
     
    // SrvId取值错误。
     INVALIDPARAMETERVALUE_INVALIDSRVID("InvalidParameterValue.InvalidSrvId"),
     
    // Stride取值错误。
     INVALIDPARAMETERVALUE_INVALIDSTRIDE("InvalidParameterValue.InvalidStride"),
     
    // 超过配额。
     LIMITEXCEEDED_FREQCNT("LimitExceeded.FreqCnt"),
     
    // 超过配额（用户IP）。
     LIMITEXCEEDED_IPFREQCNT("LimitExceeded.IpFreqCnt"),
     
    // 关键词频控限制。
     LIMITEXCEEDED_KEYFREQCNT("LimitExceeded.KeyFreqCnt"),
     
    // 重放攻击。
     LIMITEXCEEDED_REPLAYATTACK("LimitExceeded.ReplayAttack"),
     
    // 接口不存在。
     RESOURCENOTFOUND_INTERFACENOTFOUND("ResourceNotFound.InterfaceNotFound"),
     
    // 未开通服务权限。
     RESOURCEUNAVAILABLE_PERMISSIONDENIED("ResourceUnavailable.PermissionDenied"),
     
    // 鉴权失败。
     UNAUTHORIZEDOPERATION_AUTHFAILED("UnauthorizedOperation.AuthFailed"),
     
    // 密钥不存在。
     UNKNOWNPARAMETER_SECRETIDNOTEXISTS("UnknownParameter.SecretIdNotExists");
     
    private String value;
    private AaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

