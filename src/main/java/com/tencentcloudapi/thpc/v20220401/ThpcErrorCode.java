package com.tencentcloudapi.thpc.v20220401;
public enum ThpcErrorCode {
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // cvm调用失败。
     INTERNALERROR_CALLCVM("InternalError.CallCvm"),
     
    // 参数格式有误。
     INVALIDPARAMETER_MALFORMED("InvalidParameter.Malformed"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 不支持该参数值。
     INVALIDPARAMETERVALUE_NOTSUPPORTED("InvalidParameterValue.NotSupported"),
     
    // 参数值过大。
     INVALIDPARAMETERVALUE_TOOLARGE("InvalidParameterValue.TooLarge"),
     
    // 参数长度过长。
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
    // 参数值过小。
     INVALIDPARAMETERVALUE_TOOSMALL("InvalidParameterValue.TooSmall"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 集群不存在。
     RESOURCENOTFOUND_CLUSTERID("ResourceNotFound.ClusterId"),
     
    // 无法找到ID对应的弹性伸缩启动配置。
     RESOURCENOTFOUND_LAUNCHCONFIGURATIONID("ResourceNotFound.LaunchConfigurationId"),
     
    // 无法找到ID对应节点。
     RESOURCENOTFOUND_NODEID("ResourceNotFound.NodeId"),
     
    // 该伸缩组已绑定集群，请更换伸缩组。
     UNSUPPORTEDOPERATION_AUTOSCALINGGROUPALREADYBINDED("UnsupportedOperation.AutoScalingGroupAlreadyBinded"),
     
    // 该集群当前状态不支持该操作。
     UNSUPPORTEDOPERATION_CLUSTERSTATUSNOTSUPPORT("UnsupportedOperation.ClusterStatusNotSupport"),
     
    // 类型节点不支持当前操作。
     UNSUPPORTEDOPERATION_INVALIDNODEROLE("UnsupportedOperation.InvalidNodeRole");
     
    private String value;
    private ThpcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

