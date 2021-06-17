package com.tencentcloudapi.iottid.v20190411;
public enum IottidErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // AppId错误。
     INVALIDPARAMETERVALUE_APPID("InvalidParameterValue.AppId"),
     
    // 数量错误。
     INVALIDPARAMETERVALUE_COUNT("InvalidParameterValue.Count"),
     
    // 验证数据错误。
     INVALIDPARAMETERVALUE_DATA("InvalidParameterValue.Data"),
     
    // 输入字符串为空。
     INVALIDPARAMETERVALUE_EMPTYSTRING("InvalidParameterValue.EmptyString"),
     
    // 超过数量限制。
     INVALIDPARAMETERVALUE_LIMIT("InvalidParameterValue.Limit"),
     
    // 订单编号错误。
     INVALIDPARAMETERVALUE_ORDERID("InvalidParameterValue.OrderId"),
     
    // 超过数量限制。
     INVALIDPARAMETERVALUE_OVERLIMIT("InvalidParameterValue.OverLimit"),
     
    // 无权限操作。
     INVALIDPARAMETERVALUE_PERMISSIONDENIED("InvalidParameterValue.PermissionDenied"),
     
    // 数量错误。
     INVALIDPARAMETERVALUE_QUANTITY("InvalidParameterValue.Quantity"),
     
    // TID编码错误。
     INVALIDPARAMETERVALUE_TID("InvalidParameterValue.Tid");
     
    private String value;
    private IottidErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

