package com.tencentcloudapi.msp.v20180319;
public enum MspErrorCode {
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private MspErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

