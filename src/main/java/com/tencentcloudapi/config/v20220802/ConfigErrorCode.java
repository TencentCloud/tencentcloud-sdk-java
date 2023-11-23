package com.tencentcloudapi.config.v20220802;
public enum ConfigErrorCode {
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 账号组不存在。
     RESOURCENOTFOUND_ACCOUNTGROUPISNOTEXIST("ResourceNotFound.AccountGroupIsNotExist");
     
    private String value;
    private ConfigErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

