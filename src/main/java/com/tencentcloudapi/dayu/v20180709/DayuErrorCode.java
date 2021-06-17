package com.tencentcloudapi.dayu.v20180709;
public enum DayuErrorCode {
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
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private DayuErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

