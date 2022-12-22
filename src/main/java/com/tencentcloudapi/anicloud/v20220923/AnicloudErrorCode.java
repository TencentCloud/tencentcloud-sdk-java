package com.tencentcloudapi.anicloud.v20220923;
public enum AnicloudErrorCode {
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private AnicloudErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

