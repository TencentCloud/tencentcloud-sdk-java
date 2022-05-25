package com.tencentcloudapi.es.v20180416;
public enum EsErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作未授权。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnAuthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 集群资源配额限制错误。
     FAILEDOPERATION_CLUSTERRESOURCELIMITERROR("FailedOperation.ClusterResourceLimitError"),
     
    // 节点磁盘块数参数检查失败。
     FAILEDOPERATION_DISKCOUNTPARAMERROR("FailedOperation.DiskCountParamError"),
     
    // 集群状态错误。
     FAILEDOPERATION_ERRORCLUSTERSTATE("FailedOperation.ErrorClusterState"),
     
    // 集群索引没有副本存在。
     FAILEDOPERATION_ERRORCLUSTERSTATENOREPLICATION("FailedOperation.ErrorClusterStateNoReplication"),
     
    // 集群状态不健康。
     FAILEDOPERATION_ERRORCLUSTERSTATEUNHEALTH("FailedOperation.ErrorClusterStateUnhealth"),
     
    // 账户未绑定信用卡或paypal，无法支付。
     FAILEDOPERATION_NOPAYMENT("FailedOperation.NoPayment"),
     
    // 用户未实名认证。
     FAILEDOPERATION_NOTAUTHENTICATED("FailedOperation.NotAuthenticated"),
     
    // 不支持在滚动重启扩容计算资源同时扩容磁盘数量。
     FAILEDOPERATION_UNSUPPORTRESETNODETYPEANDSCALEOUTDISK("FailedOperation.UnsupportResetNodeTypeAndScaleoutDisk"),
     
    // 不支持滚动缩容计算资源同时修改磁盘大小。
     FAILEDOPERATION_UNSUPPORTRESETSCALEDOWNANDMODIFYDISK("FailedOperation.UnsupportResetScaledownAndModifyDisk"),
     
    // 不支持反向调节节点配置和磁盘容量。
     FAILEDOPERATION_UNSUPPORTREVERSEREGULATIONNODETYPEANDDISK("FailedOperation.UnsupportReverseRegulationNodeTypeAndDisk"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 账户余额不足。
     RESOURCEINSUFFICIENT_BALANCE("ResourceInsufficient.Balance"),
     
    // 隐藏可用区专用主节点资源不足。
     RESOURCEINSUFFICIENT_HIDDENZONE("ResourceInsufficient.HiddenZone"),
     
    // 子网剩余ip数量不足。
     RESOURCEINSUFFICIENT_SUBNET("ResourceInsufficient.Subnet"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private EsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

