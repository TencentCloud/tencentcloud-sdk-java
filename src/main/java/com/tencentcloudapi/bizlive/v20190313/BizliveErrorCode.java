package com.tencentcloudapi.bizlive.v20190313;
public enum BizliveErrorCode {
    // 操作失败
     FAILEDOPERATION("FailedOperation"),
     
    // 带宽不足
     FAILEDOPERATION_LACKBANDWIDTH("FailedOperation.LackBandwidth"),
     
    // 内部错误
     INTERNALERROR("InternalError"),
     
    // 调用内部服务错误。
     INTERNALERROR_CALLOTHERSVRERROR("InternalError.CallOtherSvrError"),
     
    // 配置不存在。
     INTERNALERROR_CONFIGNOTEXIST("InternalError.ConfigNotExist"),
     
    // DB执行错误。
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // 获取用户账号错误。
     INTERNALERROR_GETBIZIDERROR("InternalError.GetBizidError"),
     
    // 获取流信息失败。
     INTERNALERROR_GETSTREAMINFOERROR("InternalError.GetStreamInfoError"),
     
    // 获取直播源信息错误。
     INTERNALERROR_GETUPSTREAMINFOERROR("InternalError.GetUpstreamInfoError"),
     
    // 无权限操作。
     INTERNALERROR_NOTPERMMITOPERAT("InternalError.NotPermmitOperat"),
     
    // 流状态异常。
     INTERNALERROR_STREAMSTATUSERROR("InternalError.StreamStatusError"),
     
    // 更新数据失败。
     INTERNALERROR_UPDATEDATAERROR("InternalError.UpdateDataError"),
     
    // 参数错误
     INVALIDPARAMETER("InvalidParameter"),
     
    // Json解析失败
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
    // 参数取值错误
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 确认插件是否有IM能力
     LIMITEXCEEDED_NOIMABILITY("LimitExceeded.NoIMAbility"),
     
    // 缺少参数错误
     MISSINGPARAMETER("MissingParameter"),
     
    // 没有空闲机器
     RESOURCENOTFOUND_NOIDLE("ResourceNotFound.NoIdle");
     
    private String value;
    private BizliveErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

