package com.tencentcloudapi.rum.v20210622;
public enum RumErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // CLS调用失败
     FAILEDOPERATION_CLSCALLFAIL("FailedOperation.ClsCallFail"),
     
    // 数据操作异常
     FAILEDOPERATION_DATABASEEXCEPTION("FailedOperation.DataBaseException"),
     
    // 第三方依赖异常。
     FAILEDOPERATION_INFRASTRUCTUREERROR("FailedOperation.InfrastructureError"),
     
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
     
    // 实例不存在
     RESOURCENOTFOUND_NOINSTANCE("ResourceNotFound.NoInstance"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private RumErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

