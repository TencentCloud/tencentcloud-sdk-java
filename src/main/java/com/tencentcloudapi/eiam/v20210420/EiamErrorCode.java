package com.tencentcloudapi.eiam.v20210420;
public enum EiamErrorCode {
    // 加入用户到用户组异常。
     FAILEDOPERATION_ADDUSERSTOUSERGROUP("FailedOperation.AddUsersToUserGroup"),
     
    // 应用ID不能为空。
     FAILEDOPERATION_APPIDISNULL("FailedOperation.AppIdIsNull"),
     
    // 应用ID不存在。
     FAILEDOPERATION_APPIDNOTFOUND("FailedOperation.AppIdNotFound"),
     
    // 应用不存在。
     FAILEDOPERATION_APPNOTEXISTED("FailedOperation.AppNotExisted"),
     
    // 其子机构中存在用户的机构节点不能被删除。
     FAILEDOPERATION_CHILDORGNODEWITHUSERSCANNOTBEDELETED("FailedOperation.ChildOrgNodeWithUsersCannotBeDeleted"),
     
    // 创建机构节点失败。
     FAILEDOPERATION_CREATEORGNODEFAILURE("FailedOperation.CreateOrgNodeFailure"),
     
    // 创建用户异常。
     FAILEDOPERATION_CREATEUSERFAILURE("FailedOperation.CreateUserFailure"),
     
    // 创建用户组异常。
     FAILEDOPERATION_CREATEUSERGROUPFAILURE("FailedOperation.CreateUserGroupFailure"),
     
    // 自定义机构节点对外ID已存在。
     FAILEDOPERATION_CUSTOMIZEDPARENTORGNODEIDEXISTED("FailedOperation.CustomizedParentOrgNodeIdExisted"),
     
    // 删除机构节点异常。
     FAILEDOPERATION_DELETEORGNODEFAILURE("FailedOperation.DeleteOrgNodeFailure"),
     
    // 删除用户组异常。
     FAILEDOPERATION_DELETEUSERGROUPFAILURE("FailedOperation.DeleteUserGroupFailure"),
     
    // 读取机构节点信息异常。
     FAILEDOPERATION_DESCRIBEORGNODEFAILURE("FailedOperation.DescribeOrgNodeFailure"),
     
    // EntityType取值不合法。
     FAILEDOPERATION_ENTITYTYPENOTEXISTED("FailedOperation.EntityTypeNotExisted"),
     
    // 期望返回的用户属性类型不存在。
     FAILEDOPERATION_EXPECTFIELDSNOTFOUND("FailedOperation.ExpectFieldsNotFound"),
     
    // 用户组ID未找到。
     FAILEDOPERATION_GROUPIDNOTFOUND("FailedOperation.GroupIdNotFound"),
     
    // 获取用户所在的用户组列表异常。
     FAILEDOPERATION_LISTUSERGROUPSOFUSERFAILURE("FailedOperation.ListUserGroupsOfUserFailure"),
     
    // 读取节点下用户异常。
     FAILEDOPERATION_LISTUSERSINORGNODEFAILURE("FailedOperation.ListUsersInOrgNodeFailure"),
     
    // 获取用户组中的用户列表异常。
     FAILEDOPERATION_LISTUSERSINUSERGROUPFAILURE("FailedOperation.ListUsersInUserGroupFailure"),
     
    // 操作失败。
     FAILEDOPERATION_OPERATIONFAILURE("FailedOperation.OperationFailure"),
     
    // 机构节点ID不存在。
     FAILEDOPERATION_ORGNODEIDNOTEXIST("FailedOperation.OrgNodeIdNotExist"),
     
    // 机构节点不存在。
     FAILEDOPERATION_ORGNODENOTEXIST("FailedOperation.OrgNodeNotExist"),
     
    // 机构根节点不能被删除。
     FAILEDOPERATION_ORGNODEROOTCANNOTBEDELETED("FailedOperation.OrgNodeRootCannotBeDeleted"),
     
    // 有用户存在的机构节点不能被删除。
     FAILEDOPERATION_ORGNODEWITHUSERSCANNOTBEDELETED("FailedOperation.OrgNodeWithUsersCannotBeDeleted"),
     
    // 父机构节点ID未找到。
     FAILEDOPERATION_PARENTORGNODEIDNOTFOUND("FailedOperation.ParentOrgNodeIdNotFound"),
     
    // 父机构节点ID为空。
     FAILEDOPERATION_PARENTORGNODEISEMPTY("FailedOperation.ParentOrgNodeIsEmpty"),
     
    // 身份主体未找到。
     FAILEDOPERATION_PERSONNOTFOUND("FailedOperation.PersonNotFound"),
     
    // 从用户组中移除用户异常。
     FAILEDOPERATION_REMOVEUSERSFROMUSERGROUPFAILURE("FailedOperation.RemoveUsersFromUserGroupFailure"),
     
    // 列表搜索条件不合法。
     FAILEDOPERATION_SEARCHCRITERIAISILLEGAL("FailedOperation.SearchCriteriaIsIllegal"),
     
    // 设定的时间格式不合法。
     FAILEDOPERATION_TIMEFORMATISILLEGAL("FailedOperation.TimeFormatIsIllegal"),
     
    // 用户已存在于该用户组。
     FAILEDOPERATION_USERALREADYEXISTEDINUSERGROUP("FailedOperation.UserAlreadyExistedInUserGroup"),
     
    // 获取用户被授权访问的应用列表失败。
     FAILEDOPERATION_USERAUTHLISTFAILED("FailedOperation.UserAuthListFailed"),
     
    // 设定的时间格式不合法。
     FAILEDOPERATION_USEREXPRIATIONTIMEISILLEGAL("FailedOperation.UserExpriationTimeIsIllegal"),
     
    // 用户组不存在。
     FAILEDOPERATION_USERGROUPNOTEXIST("FailedOperation.UserGroupNotExist"),
     
    // 用户组不存在。
     FAILEDOPERATION_USERGROUPNOTEXISTED("FailedOperation.UserGroupNotExisted"),
     
    // 用户信息分页展示的排列属性不合法。
     FAILEDOPERATION_USERINFOSORTKEYISILLEGAL("FailedOperation.UserInfoSortKeyIsIllegal"),
     
    // 用户名字已存在。
     FAILEDOPERATION_USERNAMEEXISTED("FailedOperation.UserNameExisted"),
     
    // 用户不存在于该用户组。
     FAILEDOPERATION_USERNOTEXISTEDINUSERGROUP("FailedOperation.UserNotExistedInUserGroup"),
     
    // 用户手机已存在。
     FAILEDOPERATION_USERPHONEEXISTED("FailedOperation.UserPhoneExisted"),
     
    // 输入参数超出长度限制。
     INVALIDPARAMETER_PARAMETEREXCEEDSLENGTHLIMIT("InvalidParameter.ParameterExceedsLengthLimit"),
     
    // 参数不合法。
     INVALIDPARAMETER_PARAMETERILLEGAL("InvalidParameter.ParameterIllegal"),
     
    // 参数不合法。
     INVALIDPARAMETER_PARAMETERLLLEGAL("InvalidParameter.Parameterlllegal"),
     
    // 输入密码不合法。
     INVALIDPARAMETER_PASSWORDISILLEGAL("InvalidParameter.PasswordIsIllegal");
     
    private String value;
    private EiamErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

