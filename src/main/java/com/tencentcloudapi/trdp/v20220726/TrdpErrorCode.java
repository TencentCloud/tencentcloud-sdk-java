package com.tencentcloudapi.trdp.v20220726;
public enum TrdpErrorCode {
    // 未发现有效的设备指纹数据。
     FAILEDOPERATION_DEVICEFINGERPRINTNOTFOUND("FailedOperation.DeviceFingerprintNotFound"),
     
    // ModelId 未开通。
     FAILEDOPERATION_UNKNOWNMODELID("FailedOperation.UnKnownModelId"),
     
    // 未知错误。
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // 请求参数不合法。
     INVALIDPARAMETER_PARAMETERILLEGAL("InvalidParameter.ParameterIllegal"),
     
    // 服务未开通。
     UNAUTHORIZEDOPERATION_TENANTNOTACTIVATED("UnauthorizedOperation.TenantNotActivated");
     
    private String value;
    private TrdpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

