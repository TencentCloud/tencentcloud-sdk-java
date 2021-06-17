package com.tencentcloudapi.ticm.v20181127;
public enum TicmErrorCode {
    // 文件下载失败。
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
    // 调用计费返回失败。
     FAILEDOPERATION_INVOKECHARGEERROR("FailedOperation.InvokeChargeError"),
     
    // 未知错误。
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
    // 服务未开通。
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
    // 参数值错误。
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
    // 文件内容太大。
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
    // 计费状态异常。
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
    private String value;
    private TicmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

