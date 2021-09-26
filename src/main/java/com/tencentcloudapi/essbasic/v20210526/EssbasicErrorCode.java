package com.tencentcloudapi.essbasic.v20210526;
public enum EssbasicErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 其他API错误。
     INTERNALERROR_API("InternalError.Api"),
     
    // 数据库错误。
     INTERNALERROR_DB("InternalError.Db"),
     
    // 解密错误。
     INTERNALERROR_DECRYPTION("InternalError.Decryption"),
     
    // 加密错误。
     INTERNALERROR_ENCRYPTION("InternalError.Encryption"),
     
    // 生成唯一ID错误。
     INTERNALERROR_GENERATEID("InternalError.GenerateId"),
     
    // 第三方错误。
     INTERNALERROR_THIRDPARTY("InternalError.ThirdParty"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 应用号不存在。
     INVALIDPARAMETER_APPLICATION("InvalidParameter.Application"),
     
    // 重复添加签署人。
     INVALIDPARAMETER_BIZAPPROVERALREADYEXISTS("InvalidParameter.BizApproverAlreadyExists"),
     
    // 数据不存在。
     INVALIDPARAMETER_DATANOTFOUND("InvalidParameter.DataNotFound"),
     
    // 参数错误。
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 应用号已被禁止。
     OPERATIONDENIED_BANNEDAPPLICATION("OperationDenied.BannedApplication"),
     
    // 没有API权限。
     OPERATIONDENIED_NOAPIAUTH("OperationDenied.NoApiAuth"),
     
    // 用户与企业不对应。
     OPERATIONDENIED_USERNOTINORGANIZATION("OperationDenied.UserNotInOrganization"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 应用号不存在。
     RESOURCENOTFOUND_APPLICATION("ResourceNotFound.Application"),
     
    // 模板不存在。
     RESOURCENOTFOUND_TEMPLATE("ResourceNotFound.Template"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private EssbasicErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

