package com.tencentcloudapi.dc.v20180410;
public enum DcErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // CAM签名/鉴权错误，未授权的操作。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 互联IP错误。
     INVALIDPARAMETER_ADDRESSERROR("InvalidParameter.AddressError"),
     
    // 物理专线不属于该账号。
     INVALIDPARAMETER_DIRECTCONNECTIDISNOTUIN("InvalidParameter.DirectConnectIdIsNotUin"),
     
    // 该账号ID不存在。
     INVALIDPARAMETER_UINISNOTEXIST("InvalidParameter.UinIsNotExist"),
     
    // vlan冲突。
     INVALIDPARAMETER_VLANCONFLICT("InvalidParameter.VlanConflict"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // vlan冲突。
     INVALIDPARAMETERVALUE_VLANCONFLICT("InvalidParameterValue.VlanConfLict"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 物理专线数已达上限。
     LIMITEXCEEDED_DIRECTCONNECTLIMITEXCEEDED("LimitExceeded.DirectConnectLimitExceeded"),
     
    // 物理专线的专用通道数已达上限。
     LIMITEXCEEDED_DIRECTCONNECTTUNNELLIMITEXCEEDED("LimitExceeded.DirectConnectTunnelLimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 物理专线的vpc已经存在。
     RESOURCEINUSE_DCVPCISEXIST("ResourceInUse.DcVpcIsExist"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 专用通道不存在。
     RESOURCENOTFOUND_DIRECTCONNECTTUNNELIDISNOTEXIST("ResourceNotFound.DirectConnectTunnelIdIsNotExist"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 对不起您的帐号已欠费，欠费状态下无法开通产品，请您先行充值。
     RESOURCEUNAVAILABLE_INSUFFICIENTBALANCE("ResourceUnavailable.InsufficientBalance"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 不允许创建跨境专用通道，请您联系我们。
     UNSUPPORTEDOPERATION_CROSSBORDERDIRECTCONNECTTUNNEL("UnsupportedOperation.CrossBorderDirectConnectTunnel"),
     
    // 状态冲突。
     UNSUPPORTEDOPERATION_STATECONFLICT("UnsupportedOperation.StateConfLict");
     
    private String value;
    private DcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

