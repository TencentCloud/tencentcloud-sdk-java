package com.tencentcloudapi.dtf.v20200506;
public enum DtfErrorCode {
    // 事务分组ID称未填写。
     MISSINGPARAMETER_GROUPIDREQUIRED("MissingParameter.GroupIdRequired"),
     
    // 事务分组不存在。
     RESOURCENOTFOUND_GROUPNOTEXIST("ResourceNotFound.GroupNotExist");
     
    private String value;
    private DtfErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

