package com.tencentcloudapi.cdwch.v20200915;
public enum CdwchErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError");
     
    private String value;
    private CdwchErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

