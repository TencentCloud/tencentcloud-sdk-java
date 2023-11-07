package com.tencentcloudapi.wedata.v20210820;
public enum WedataErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 未登陆或登陆已过期。
     AUTHFAILURE_SIGNATUREEXPIRE("AuthFailure.SignatureExpire"),
     
    // CAM未授权，请联系主账号到CAM中授权QcloudWeDataFullAccess策略给该账户。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 外部系统调用异常。
     INTERNALERROR_CALLSCHEDULERAPIERROR("InternalError.CallSchedulerApiError"),
     
    // 调用云API失败。
     INTERNALERROR_INTERNALCALLCLOUDAPIERROR("InternalError.InternalCallCloudApiError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // ClientIp未被授权。
     INVALIDPARAMETER_CLIENTIPNOTAUTHORIZED("InvalidParameter.ClientIpNotAuthorized"),
     
    // 数据引擎实例不存在。
     INVALIDPARAMETER_DATAENGINEINSTANCENOTEXISTS("InvalidParameter.DataEngineInstanceNotExists"),
     
    // 名称重复。
     INVALIDPARAMETER_DUPLICATENAME("InvalidParameter.DuplicateName"),
     
    // 查询过滤条件参数错误。
     INVALIDPARAMETER_INVALIDFILTERPARAMETER("InvalidParameter.InvalidFilterParameter"),
     
    // 规则不存在。
     INVALIDPARAMETER_RULENOTEXIST("InvalidParameter.RuleNotExist"),
     
    // 规则模版不存在。
     INVALIDPARAMETER_RULETEMPLATENOTEXIST("InvalidParameter.RuleTemplateNotExist"),
     
    // 服务繁忙，请稍后重试。
     INVALIDPARAMETER_SERVICEISBUSY("InvalidParameter.ServiceIsBusy"),
     
    // WeData_QCSRole不存在，请进行服务授权。
     INVALIDPARAMETER_WEDATAROLENOTEXISTS("InvalidParameter.WeDataRoleNotExists"),
     
    // 工作空间不存在。
     INVALIDPARAMETER_WORKSPACENOTEXIST("InvalidParameter.WorkspaceNotExist"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 用户不在白名单。
     OPERATIONDENIED_USERNOTINWHITELISTERROR("OperationDenied.UserNotInWhitelistError"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 用户不是当前项目成员。
     UNAUTHORIZEDOPERATION_USERNOTINPROJECT("UnauthorizedOperation.UserNotInProject"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 请先配置不少于一个规则。
     UNSUPPORTEDOPERATION_NORULEINRULEGROUP("UnsupportedOperation.NoRuleInRuleGroup");
     
    private String value;
    private WedataErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

