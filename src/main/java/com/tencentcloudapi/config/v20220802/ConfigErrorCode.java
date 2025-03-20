package com.tencentcloudapi.config.v20220802;
public enum ConfigErrorCode {
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 账号组不存在。 */
     RESOURCENOTFOUND_ACCOUNTGROUPISNOTEXIST("ResourceNotFound.AccountGroupIsNotExist"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND_RESOURCENOTEXIST("ResourceNotFound.ResourceNotExist"),
     
     /* 规则不存在。 */
     RESOURCENOTFOUND_RULEISNOTEXIST("ResourceNotFound.RuleIsNotExist");
     
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

