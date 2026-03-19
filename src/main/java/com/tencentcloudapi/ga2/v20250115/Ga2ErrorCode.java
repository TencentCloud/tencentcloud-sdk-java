package com.tencentcloudapi.ga2.v20250115;
public enum Ga2ErrorCode {
     /* 请求中传入参数 `%(key)s` 必选再 `%(value)s` 范围内。 */
     INVALIDPARAMETER_INPUTOUTOFRANGE("InvalidParameter.InputOutOfRange"),
     
     /* 参数 `%(parameter)s` 值 `%(value)s` 是无效的。正确且完整的值形如 `%(template)s`。 */
     INVALIDPARAMETERVALUE_MALFORMED("InvalidParameterValue.Malformed");
     
    private String value;
    private Ga2ErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

