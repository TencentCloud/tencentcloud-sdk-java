package com.tencentcloudapi.hai.v20230812;
public enum HaiErrorCode {
    // 欠费账户不能创建实例
     FAILEDOPERATION_ARREARSACCOUNTCANNOTRUNINSTANCES("FailedOperation.ArrearsAccountCannotRunInstances"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 指定的应用不存在
     INVALIDPARAMETERVALUE_APPLICATIONIDNOTFOUND("InvalidParameterValue.ApplicationIdNotFound"),
     
    // 算力套餐类型不存在
     INVALIDPARAMETERVALUE_BUNDLETYPENOTFOUND("InvalidParameterValue.BundleTypeNotFound"),
     
    // 实例名称过长
     INVALIDPARAMETERVALUE_INSTANCENAMETOOLONG("InvalidParameterValue.InstanceNameTooLong"),
     
    // 应用ID格式非法
     INVALIDPARAMETERVALUE_INVALIDAPPLICATIONIDMALFORMED("InvalidParameterValue.InvalidApplicationIdMalformed"),
     
    // 每次购买的实例数目不在合理范围内
     INVALIDPARAMETERVALUE_INVALIDINSTANCECOUNT("InvalidParameterValue.InvalidInstanceCount"),
     
    // 指定的算力套餐库存不足
     RESOURCEINSUFFICIENT_BUNDLEINVENTORYSHORTAGE("ResourceInsufficient.BundleInventoryShortage"),
     
    // 用户账号的网络类型是传统型，不允许使用HAI
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDNETWORKUSER("UnauthorizedOperation.UnauthorizedNetworkUser"),
     
    // 客户未授权使用本产品
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDUSER("UnauthorizedOperation.UnauthorizedUser");
     
    private String value;
    private HaiErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

