package com.tencentcloudapi.svp.v20240125;
public enum SvpErrorCode {
    // 账号没有cam授权。
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth");
     
    private String value;
    private SvpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

