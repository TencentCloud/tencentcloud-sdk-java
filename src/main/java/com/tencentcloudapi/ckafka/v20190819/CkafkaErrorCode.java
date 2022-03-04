package com.tencentcloudapi.ckafka.v20190819;
public enum CkafkaErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 实例不存在。
     INVALIDPARAMETERVALUE_INSTANCENOTEXIST("InvalidParameterValue.InstanceNotExist"),
     
    // 参数不允许为空。
     INVALIDPARAMETERVALUE_NOTALLOWEDEMPTY("InvalidParameterValue.NotAllowedEmpty"),
     
    // 已存在相同参数。
     INVALIDPARAMETERVALUE_REPETITIONVALUE("InvalidParameterValue.RepetitionValue"),
     
    // 无效的子网id。
     INVALIDPARAMETERVALUE_SUBNETIDINVALID("InvalidParameterValue.SubnetIdInvalid"),
     
    // 子网不属于zone。
     INVALIDPARAMETERVALUE_SUBNETNOTBELONGTOZONE("InvalidParameterValue.SubnetNotBelongToZone"),
     
    // 无效的 Vpc Id。
     INVALIDPARAMETERVALUE_VPCIDINVALID("InvalidParameterValue.VpcIdInvalid"),
     
    // Action参数取值错误。
     INVALIDPARAMETERVALUE_WRONGACTION("InvalidParameterValue.WrongAction"),
     
    // zone不支持。
     INVALIDPARAMETERVALUE_ZONENOTSUPPORT("InvalidParameterValue.ZoneNotSupport"),
     
    // 路由数超过限制。
     LIMITEXCEEDED_ROUTEOVERLIMIT("LimitExceeded.RouteOverLimit"),
     
    // SASL路由超过限制。
     LIMITEXCEEDED_ROUTESASLOVERLIMIT("LimitExceeded.RouteSASLOverLimit"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 任务资源暂停。
     OPERATIONDENIED_RESOURCETASKPAUSED("OperationDenied.ResourceTaskPaused"),
     
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
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 批量删除实例限制。
     UNSUPPORTEDOPERATION_BATCHDELINSTANCELIMIT("UnsupportedOperation.BatchDelInstanceLimit"),
     
    // Oss拒绝该操作。
     UNSUPPORTEDOPERATION_OSSREJECT("UnsupportedOperation.OssReject");
     
    private String value;
    private CkafkaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

