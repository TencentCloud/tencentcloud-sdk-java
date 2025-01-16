package com.tencentcloudapi.vpc.v20170312;
public enum VpcErrorCode {
    // 调用VPCOSS失败
     FAILEDOPERATION_CALLVPCOSSFAILED("FailedOperation.CallVpcOssFailed"),
     
    // 指定过滤条件不存在。
     INVALIDPARAMETER_FILTERINVALIDKEY("InvalidParameter.FilterInvalidKey"),
     
    // 指定过滤选项值不是列表。
     INVALIDPARAMETER_FILTERVALUESNOTLIST("InvalidParameter.FilterValuesNotList"),
     
    // 参数值超出限制。
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // 入参格式不合法。
     INVALIDPARAMETERVALUE_MALFORMED("InvalidParameterValue.Malformed"),
     
    // 参数值不在指定范围。
     INVALIDPARAMETERVALUE_RANGE("InvalidParameterValue.Range"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private VpcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

