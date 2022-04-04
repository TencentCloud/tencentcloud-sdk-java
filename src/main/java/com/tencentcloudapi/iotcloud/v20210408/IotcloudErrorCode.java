package com.tencentcloudapi.iotcloud.v20210408;
public enum IotcloudErrorCode {
    // 白名单校验未开启，用户不可创建设备，平台会根据设备认证时携带的设备名称自动创建设备。
     FAILEDOPERATION_TIDWHITELISTNOTOPEN("FailedOperation.TidWhiteListNotOpen"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // CA证书内容错误。
     INVALIDPARAMETERVALUE_CACERTINVALID("InvalidParameterValue.CACertInvalid"),
     
    // CA验证证书不匹配。
     INVALIDPARAMETERVALUE_CACERTNOTMATCH("InvalidParameterValue.CACertNotMatch"),
     
    // 格式错误，DefinedPsk需为Base64格式的字符串。
     INVALIDPARAMETERVALUE_DEFINEDPSKNOTBASE64("InvalidParameterValue.DefinedPskNotBase64"),
     
    // 创建的设备名已存在。
     INVALIDPARAMETERVALUE_DEVICEALREADYEXIST("InvalidParameterValue.DeviceAlreadyExist"),
     
    // 消息Payload超出限制。
     INVALIDPARAMETERVALUE_PAYLOADOVERLIMIT("InvalidParameterValue.PayloadOverLimit"),
     
    // 产品类型不支持。
     INVALIDPARAMETERVALUE_PRODUCTTYPENOTSUPPORT("InvalidParameterValue.ProductTypeNotSupport"),
     
    // CA证书已经绑定了产品，无法操作。
     LIMITEXCEEDED_CAALREADYBINDPRODUCT("LimitExceeded.CAAlreadyBindProduct"),
     
    // 不支持私有证书操作。
     LIMITEXCEEDED_CACERTNOTSUPPORT("LimitExceeded.CACertNotSupport"),
     
    // CA证书重复。
     LIMITEXCEEDED_CAREPEAT("LimitExceeded.CARepeat"),
     
    // 设备数量超过限制。
     LIMITEXCEEDED_DEVICEEXCEEDLIMIT("LimitExceeded.DeviceExceedLimit"),
     
    // CA证书不存在。
     RESOURCENOTFOUND_CACERTNOTEXIST("ResourceNotFound.CACertNotExist"),
     
    // 设备不存在。
     RESOURCENOTFOUND_DEVICENOTEXIST("ResourceNotFound.DeviceNotExist"),
     
    // 产品不存在。
     RESOURCENOTFOUND_PRODUCTNOTEXIST("ResourceNotFound.ProductNotExist"),
     
    // 该设备绑定了网关设备，无法删除。
     UNAUTHORIZEDOPERATION_DEVICEHASALREADYBINDGATEWAY("UnauthorizedOperation.DeviceHasAlreadyBindGateway"),
     
    // 设备未启用。
     UNAUTHORIZEDOPERATION_DEVICEISNOTENABLED("UnauthorizedOperation.DeviceIsNotEnabled"),
     
    // 删除的产品下还包括未删除的设备。
     UNAUTHORIZEDOPERATION_DEVICESEXISTUNDERPRODUCT("UnauthorizedOperation.DevicesExistUnderProduct"),
     
    // 该设备下仍有绑定的设备。
     UNAUTHORIZEDOPERATION_GATEWAYHASBINDEDDEVICES("UnauthorizedOperation.GatewayHasBindedDevices"),
     
    // 该产品类型不能创建LoRa设备。
     UNAUTHORIZEDOPERATION_PRODUCTCANTHAVELORADEVICE("UnauthorizedOperation.ProductCantHaveLoRaDevice"),
     
    // NB-IoT产品不允许创建普通设备。
     UNAUTHORIZEDOPERATION_PRODUCTCANTHAVENORMALDEVICE("UnauthorizedOperation.ProductCantHaveNormalDevice"),
     
    // 该产品类型只能创建LoRa设备。
     UNAUTHORIZEDOPERATION_PRODUCTCANTHAVENOTLORADEVICE("UnauthorizedOperation.ProductCantHaveNotLoRaDevice"),
     
    // 产品禁用了该功能。
     UNAUTHORIZEDOPERATION_PRODUCTISFORBIDDEN("UnauthorizedOperation.ProductIsForbidden"),
     
    // 产品不支持密钥认证。
     UNAUTHORIZEDOPERATION_PRODUCTNOTSUPPORTPSK("UnauthorizedOperation.ProductNotSupportPSK"),
     
    // 设备ota升级中。
     UNSUPPORTEDOPERATION_DEVICEOTATASKINPROGRESS("UnsupportedOperation.DeviceOtaTaskInProgress"),
     
    // 网关产品下存在绑定的子产品，无法删除。
     UNSUPPORTEDOPERATION_GATEWAYPRODUCTHASBINDEDPRODUCT("UnsupportedOperation.GatewayProductHasBindedProduct"),
     
    // 存在网关设备绑定当前产品，无法删除。
     UNSUPPORTEDOPERATION_PRODUCTHASBINDGATEWAY("UnsupportedOperation.ProductHasBindGateway"),
     
    // 产品存在绑定的网关产品，无法删除。
     UNSUPPORTEDOPERATION_PRODUCTHASBINDEDGATEWAYPRODUCT("UnsupportedOperation.ProductHasBindedGatewayProduct"),
     
    // 产品为Suite token类型，无法创建新设备。
     UNSUPPORTEDOPERATION_SUITETOKENNOCREATE("UnsupportedOperation.SuiteTokenNoCreate");
     
    private String value;
    private IotcloudErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

