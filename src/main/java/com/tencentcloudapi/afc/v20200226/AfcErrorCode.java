package com.tencentcloudapi.afc.v20200226;
public enum AfcErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 验证码签名错误。
     AUTHFAILURE_CAPSIGERROR("AuthFailure.CapSigError"),
     
    // 请求过期。
     AUTHFAILURE_EXPIRED("AuthFailure.Expired"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 业务系统逻辑错误。
     INTERNALERROR_BACKENDLOGICERROR("InternalError.BackendLogicError"),
     
    // Sign后端错误。
     INTERNALERROR_SIGNBACKENDERROR("InternalError.SignBackendError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数错误。
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // URL错误。
     INVALIDPARAMETER_URLERROR("InvalidParameter.UrlError"),
     
    // 版本错误。
     INVALIDPARAMETER_VERSIONERROR("InvalidParameter.VersionError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
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
     
    // SrvName取值错误。
     INVALIDPARAMETERVALUE_INVALIDSRVNAME("InvalidParameterValue.InvalidSrvName"),
     
    // Stride取值错误。
     INVALIDPARAMETERVALUE_INVALIDSTRIDE("InvalidParameterValue.InvalidStride"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 超过配额。
     LIMITEXCEEDED_FREQCNT("LimitExceeded.FreqCnt"),
     
    // 超过配额。
     LIMITEXCEEDED_IPFREQCNT("LimitExceeded.IpFreqCnt"),
     
    // 关键词频控限制。
     LIMITEXCEEDED_KEYFREQCNT("LimitExceeded.KeyFreqCnt"),
     
    // 重放攻击。
     LIMITEXCEEDED_REPLAYATTACK("LimitExceeded.ReplayAttack"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 接口不存在。
     RESOURCENOTFOUND_INTERFACENOTFOUND("ResourceNotFound.InterfaceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未开通服务权限。
     RESOURCEUNAVAILABLE_PERMISSIONDENIED("ResourceUnavailable.PermissionDenied"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 鉴权失败。
     UNAUTHORIZEDOPERATION_AUTHFAILED("UnauthorizedOperation.AuthFailed"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 密钥不存在。
     UNKNOWNPARAMETER_SECRETIDNOTEXISTS("UnknownParameter.SecretIdNotExists"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private AfcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

