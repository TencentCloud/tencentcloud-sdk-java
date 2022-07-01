package com.tencentcloudapi.yinsuda.v20220527;
public enum YinsudaErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError");
     
    private String value;
    private YinsudaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

