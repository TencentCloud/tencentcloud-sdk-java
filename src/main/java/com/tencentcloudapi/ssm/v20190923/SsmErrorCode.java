package com.tencentcloudapi.ssm.v20190923;
public enum SsmErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // KMS操作失败。
     FAILEDOPERATION_ACCESSKMSERROR("FailedOperation.AccessKmsError"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 标签键重复。
     INVALIDPARAMETERVALUE_TAGKEYSDUPLICATED("InvalidParameterValue.TagKeysDuplicated"),
     
    // 标签键或标签值不存在。
     INVALIDPARAMETERVALUE_TAGSNOTEXISTED("InvalidParameterValue.TagsNotExisted"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 凭据名已存在。
     RESOURCEINUSE_SECRETEXISTS("ResourceInUse.SecretExists"),
     
    // 版本号已存在。
     RESOURCEINUSE_VERSIONIDEXISTS("ResourceInUse.VersionIdExists"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 服务未购买。
     RESOURCEUNAVAILABLE_NOTPURCHASED("ResourceUnavailable.NotPurchased"),
     
    // 凭据被禁用。
     RESOURCEUNAVAILABLE_RESOURCEDISABLED("ResourceUnavailable.ResourceDisabled"),
     
    // 凭据处于计划删除状态。
     RESOURCEUNAVAILABLE_RESOURCEPENDINGDELETED("ResourceUnavailable.ResourcePendingDeleted"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private SsmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

