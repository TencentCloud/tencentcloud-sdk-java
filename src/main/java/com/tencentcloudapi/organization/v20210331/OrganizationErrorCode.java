package com.tencentcloudapi.organization.v20210331;
public enum OrganizationErrorCode {
    // 操作策略失败。
     FAILEDOPERATION_OPERATEPOLICY("FailedOperation.OperatePolicy"),
     
    // 子账号不存在。
     FAILEDOPERATION_SUBACCOUNTNOTEXIST("FailedOperation.SubAccountNotExist"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 成员不存在。
     RESOURCENOTFOUND_MEMBERNOTEXIST("ResourceNotFound.MemberNotExist"),
     
    // 组织成员策略不存在。
     RESOURCENOTFOUND_MEMBERPOLICYNOTEXIST("ResourceNotFound.MemberPolicyNotExist"),
     
    // 企业组织不存在。
     RESOURCENOTFOUND_ORGANIZATIONNOTEXIST("ResourceNotFound.OrganizationNotExist");
     
    private String value;
    private OrganizationErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

