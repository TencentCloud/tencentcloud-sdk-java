package com.tencentcloudapi.gse.v20191112;
public enum GseErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 资源未授权。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 超过云联网配额限制。
     LIMITEXCEEDED_CCNLIMITEXCEEDED("LimitExceeded.CcnLimitExceeded"),
     
    // 服务器舰队个数超限。
     LIMITEXCEEDED_FLEETLIMITEXCEEDED("LimitExceeded.FleetLimitExceeded"),
     
    // 服务器个数超限。
     LIMITEXCEEDED_INSTANCELIMITEXCEEDED("LimitExceeded.InstanceLimitExceeded"),
     
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
     
    // 云联网资源不存在。
     RESOURCENOTFOUND_CCNRESOURCENOTFOUND("ResourceNotFound.CcnResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 没有开通服务。
     UNAUTHORIZEDOPERATION_SERVICENOTOPENED("UnauthorizedOperation.ServiceNotOpened"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 云联网重复关联。
     UNSUPPORTEDOPERATION_CCNATTACHED("UnsupportedOperation.CcnAttached"),
     
    // 账号ID不存在。
     UNSUPPORTEDOPERATION_UINNOTFOUND("UnsupportedOperation.UinNotFound"),
     
    // 不支持跨境打通。
     UNSUPPORTEDOPERATION_UNABLECROSSBORDER("UnsupportedOperation.UnableCrossBorder");
     
    private String value;
    private GseErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

