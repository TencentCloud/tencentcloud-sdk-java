package com.tencentcloudapi.thpc.v20211109;
public enum ThpcErrorCode {
    // 参数格式有误。
     INVALIDPARAMETER_MALFORMED("InvalidParameter.Malformed"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 参数值过大。
     INVALIDPARAMETERVALUE_TOOLARGE("InvalidParameterValue.TooLarge"),
     
    // 参数长度过长。
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
    // 参数值过小。
     INVALIDPARAMETERVALUE_TOOSMALL("InvalidParameterValue.TooSmall"),
     
    // 集群不存在。
     RESOURCENOTFOUND_CLUSTERID("ResourceNotFound.ClusterId");
     
    private String value;
    private ThpcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

