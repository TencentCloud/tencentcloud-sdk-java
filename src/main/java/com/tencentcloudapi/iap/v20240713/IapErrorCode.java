package com.tencentcloudapi.iap.v20240713;
public enum IapErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 身份提供商名称已经使用。
     INVALIDPARAMETER_IDENTITYNAMEINUSE("InvalidParameter.IdentityNameInUse"),
     
    // 身份提供商元数据文档错误。
     INVALIDPARAMETER_METADATAERROR("InvalidParameter.MetadataError"),
     
    // 参数错误
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // OIDC签名公钥错误。
     INVALIDPARAMETERVALUE_IDENTITYKEYERROR("InvalidParameterValue.IdentityKeyError"),
     
    // 身份提供商URL错误。
     INVALIDPARAMETERVALUE_IDENTITYURLERROR("InvalidParameterValue.IdentityUrlError"),
     
    // 身份提供商名称错误。
     INVALIDPARAMETERVALUE_NAMEERROR("InvalidParameterValue.NameError"),
     
    // 身份提供商已达到上限。
     LIMITEXCEEDED_IDENTITYFULL("LimitExceeded.IdentityFull"),
     
    // 身份提供商不存在。
     RESOURCENOTFOUND_IDENTITYNOTEXIST("ResourceNotFound.IdentityNotExist"),
     
    // 没有数据
     RESOURCENOTFOUND_RECORDNOTEXISTS("ResourceNotFound.RecordNotExists");
     
    private String value;
    private IapErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

