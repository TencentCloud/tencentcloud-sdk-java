package com.tencentcloudapi.tem.v20201221;
public enum TemErrorCode {
    // 创建服务失败。
     INTERNALERROR_CREATESERVICEERROR("InternalError.CreateServiceError");
     
    private String value;
    private TemErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

