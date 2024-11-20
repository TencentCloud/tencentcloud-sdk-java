package com.tencentcloudapi.bh.v20230418;
public enum BhErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // FailedOperation.AuthFailed
     FAILEDOPERATION_AUTHFAILED("FailedOperation.AuthFailed"),
     
    // FailedOperation.ConnectionFailed
     FAILEDOPERATION_CONNECTIONFAILED("FailedOperation.ConnectionFailed"),
     
    // FailedOperation.DataNotFound
     FAILEDOPERATION_DATANOTFOUND("FailedOperation.DataNotFound"),
     
    // FailedOperation.DuplicateData
     FAILEDOPERATION_DUPLICATEDATA("FailedOperation.DuplicateData"),
     
    // FailedOperation.TooFrequent
     FAILEDOPERATION_TOOFREQUENT("FailedOperation.TooFrequent"),
     
    // FailedOperation.VPCDeployed
     FAILEDOPERATION_VPCDEPLOYED("FailedOperation.VPCDeployed"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 无效的过滤器
     INVALIDFILTER("InvalidFilter"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // InvalidParameter.ResourceId
     INVALIDPARAMETER_RESOURCEID("InvalidParameter.ResourceId"),
     
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
     
    // UnauthorizedOperation.NoPermission
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private BhErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

