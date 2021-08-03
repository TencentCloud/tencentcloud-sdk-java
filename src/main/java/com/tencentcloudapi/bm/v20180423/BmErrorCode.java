package com.tencentcloudapi.bm.v20180423;
public enum BmErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 存在未结束故障单，操作失败。
     FAILEDOPERATION_EXISTREPAIRTASK("FailedOperation.ExistRepairTask"),
     
    // Tsc Agent不在线。
     FAILEDOPERATION_TSCAGENTOFFLINE("FailedOperation.TscAgentOffline"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数值错误。
     INVALIDPARAMETERVALUE_INVALIDPARAMETER("InvalidParameterValue.InvalidParameter"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 脚本数量超过上限。
     LIMITEXCEEDED_USERCMDCOUNT("LimitExceeded.UserCmdCount"),
     
    // 流程操作繁忙，请稍后重试。
     RESOURCEINUSE_FLOWBUSY("ResourceInUse.FlowBusy"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 设备不足。
     RESOURCEINSUFFICIENT_DEVICEINSUFFICIENT("ResourceInsufficient.DeviceInsufficient"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 余额不足。
     UNSUPPORTEDOPERATION_FUNDINSUFFICIENT("UnsupportedOperation.FundInsufficient"),
     
    // 设备不支持此操作。
     UNSUPPORTEDOPERATION_INVALIDOPERATION("UnsupportedOperation.InvalidOperation");
     
    private String value;
    private BmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

