package com.tencentcloudapi.ckafka.v20190819;
public enum CkafkaErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
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
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
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

