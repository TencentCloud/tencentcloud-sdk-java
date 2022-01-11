package com.tencentcloudapi.ape.v20200513;
public enum ApeErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 图片使用期限已过期。
     LIMITEXCEEDED_ORDEREXPIREDERROR("LimitExceeded.OrderExpiredError"),
     
    // 下单频率超过限制。
     LIMITEXCEEDED_ORDERLIMITERROR("LimitExceeded.OrderLimitError"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 图片涉嫌违禁内容
     RESOURCENOTFOUND_SENSITIVEIMAGE("ResourceNotFound.SensitiveImage"),
     
    // 包含敏感词汇。
     RESOURCENOTFOUND_SENSITIVESEARCH("ResourceNotFound.SensitiveSearch"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private ApeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

