package com.tencentcloudapi.pds.v20210701;
public enum PdsErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 服务超时。
     INTERNALERROR_SERVICETIMEOUT("InternalError.ServiceTimeout"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 重放攻击。
     LIMITEXCEEDED_REPLAYATTACK("LimitExceeded.ReplayAttack"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private PdsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

