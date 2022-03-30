package com.tencentcloudapi.tem.v20210701;
public enum TemErrorCode {
    // 请求响应超时。
     INTERNALERROR_ACTIONREADTIMEOUT("InternalError.ActionReadTimeout"),
     
    // 创建apm资源失败。
     INTERNALERROR_CREATEAPMRESOURCEERROR("InternalError.CreateApmResourceError"),
     
    // 底层集群创建失败。
     INTERNALERROR_CREATEEKSCLUSTERERROR("InternalError.CreateEksClusterError"),
     
    // 创建服务失败。
     INTERNALERROR_CREATESERVICEERROR("InternalError.CreateServiceError"),
     
    // 服务器繁忙,请稍后再试。
     INTERNALERROR_DEFAULTINTERNALERROR("InternalError.DefaultInternalError"),
     
    // 删除应用失败。
     INTERNALERROR_DELETESERVICEERROR("InternalError.DeleteServiceError"),
     
    // 版本部署调用失败。
     INTERNALERROR_DEPLOYVERSIONERROR("InternalError.DeployVersionError"),
     
    // 查询实例信息失败。
     INTERNALERROR_DESCRIBERUNPODLISTERROR("InternalError.DescribeRunPodListError"),
     
    // 重启失败。
     INTERNALERROR_RESTARTAPPLICATIONERROR("InternalError.RestartApplicationError"),
     
    // 更新 ingress 失败。
     INTERNALERROR_UPDATEINGRESSERROR("InternalError.UpdateIngressError"),
     
    // 版本号格式非法。
     INVALIDPARAMETERVALUE_INVALIDDEPLOYVERSION("InvalidParameterValue.InvalidDeployVersion"),
     
    // 环境重复。
     INVALIDPARAMETERVALUE_NAMESPACEDUPLICATEERROR("InvalidParameterValue.NamespaceDuplicateError"),
     
    // 命名空间不属于用户。
     INVALIDPARAMETERVALUE_NAMESPACENOTBELONGTOAPPID("InvalidParameterValue.NamespaceNotBelongToAppid"),
     
    // 环境创建失败，达到上限。
     INVALIDPARAMETERVALUE_NAMESPACEREACHMAXIMUM("InvalidParameterValue.NamespaceReachMaximum"),
     
    // 环境资源创建失败，达到上限。
     INVALIDPARAMETERVALUE_NAMESPACERESOURCEREACHMAXIMUM("InvalidParameterValue.NamespaceResourceReachMaximum"),
     
    // 应用存在正在运行的实例。
     INVALIDPARAMETERVALUE_SERVICEFOUNDRUNNINGVERSION("InvalidParameterValue.ServiceFoundRunningVersion"),
     
    // 应用名已存在。
     INVALIDPARAMETERVALUE_SERVICENAMEDUPLICATEERROR("InvalidParameterValue.ServiceNameDuplicateError"),
     
    // 非 JAVA 应用不支持链路追踪特性。
     INVALIDPARAMETERVALUE_TRAITSTRACINGNOTSUPPORTED("InvalidParameterValue.TraitsTracingNotSupported"),
     
    // 版本必须小写。
     INVALIDPARAMETERVALUE_VERSIONLOWERCASE("InvalidParameterValue.VersionLowerCase"),
     
    // 版本的路由流量不为0。
     INVALIDPARAMETERVALUE_VERSIONROUTERATENOTZERO("InvalidParameterValue.VersionRouteRateNotZero"),
     
    // 部署版本不能为空。
     MISSINGPARAMETER_DEPLOYVERSIONNULL("MissingParameter.DeployVersionNull"),
     
    // 环境ID不能为空。
     MISSINGPARAMETER_NAMESPACEIDNULL("MissingParameter.NamespaceIdNull"),
     
    // 服务ID不能为空。
     MISSINGPARAMETER_SERVICEIDNULL("MissingParameter.ServiceIdNull"),
     
    // 目标微服务已离线。
     RESOURCENOTFOUND_MICROSERVICEOFFLINE("ResourceNotFound.MicroserviceOffline"),
     
    // 环境不存在。
     RESOURCENOTFOUND_NAMESPACENOTFOUND("ResourceNotFound.NamespaceNotFound"),
     
    // 找不到应用。
     RESOURCENOTFOUND_SERVICENOTFOUND("ResourceNotFound.ServiceNotFound"),
     
    // 找不到运行的服务实例。
     RESOURCENOTFOUND_SERVICERUNNINGVERSIONNOTFOUND("ResourceNotFound.ServiceRunningVersionNotFound"),
     
    // 找不到版本对应的环境。
     RESOURCENOTFOUND_VERSIONNAMESPACENOTFOUND("ResourceNotFound.VersionNamespaceNotFound"),
     
    // 找不到版本对应的应用。
     RESOURCENOTFOUND_VERSIONSERVICENOTFOUND("ResourceNotFound.VersionServiceNotFound"),
     
    // 等待组件安装。
     RESOURCEUNAVAILABLE_WAITFORKRUISE("ResourceUnavailable.WaitForKruise"),
     
    // 未授权。
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDOPERATION("UnauthorizedOperation.UnauthorizedOperation");
     
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

