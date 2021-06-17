package com.tencentcloudapi.zj.v20190121;
public enum ZjErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 短信模板已存在,请勿重复创建。
     FAILEDOPERATION_SMSTEMPLATEEXISTS("FailedOperation.SmsTemplateExists"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
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
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 用户角色错误。
     UNAUTHORIZEDOPERATION_ROLEFAILURE("UnauthorizedOperation.RoleFailure"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private ZjErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

