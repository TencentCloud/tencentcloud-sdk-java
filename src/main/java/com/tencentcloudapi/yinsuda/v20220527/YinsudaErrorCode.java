package com.tencentcloudapi.yinsuda.v20220527;
public enum YinsudaErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 交易流水号重复
     FAILEDOPERATION_DUPLICATETRADESERIALNO("FailedOperation.DuplicateTradeSerialNo"),
     
    // 直播会员已经过期
     FAILEDOPERATION_USERLIVEVIPTIMEEXPIRE("FailedOperation.UserLiveVipTimeExpire"),
     
    // 非直播会员用户
     FAILEDOPERATION_USERNOTLIVEVIP("FailedOperation.UserNotLiveVip"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private YinsudaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

