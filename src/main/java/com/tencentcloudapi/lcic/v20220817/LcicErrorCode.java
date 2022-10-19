package com.tencentcloudapi.lcic.v20220817;
public enum LcicErrorCode {
    // 课堂时长不能超过5小时。
     FAILEDOPERATION_CLASSTOOLONG("FailedOperation.ClassTooLong"),
     
    // 源账号已存在。
     FAILEDOPERATION_ORIGINIDEXISTS("FailedOperation.OriginIdExists"),
     
    // 房间暂未结束。
     FAILEDOPERATION_ROOMNOTEND("FailedOperation.RoomNotEnd"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 结束时间不能早于开始时间。
     INVALIDPARAMETER_ENDTIME("InvalidParameter.EndTime"),
     
    // SdkAppId参数错误。
     INVALIDPARAMETER_SDKAPPID("InvalidParameter.SdkAppId"),
     
    // 开始时间不能早于当前时间。
     INVALIDPARAMETER_STARTTIME("InvalidParameter.StartTime"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 存储空间已无剩余，无法使用存储功能。
     RESOURCEINSUFFICIENT_RECORD("ResourceInsufficient.Record"),
     
    // 打开课堂失败，请前往控制台查看用量情况。
     RESOURCEINSUFFICIENT_ROOM("ResourceInsufficient.Room"),
     
    // 文档不存在。
     RESOURCENOTFOUND_DOCUMENT("ResourceNotFound.Document"),
     
    // 房间不存在。
     RESOURCENOTFOUND_ROOM("ResourceNotFound.Room"),
     
    // 用户不存在。
     RESOURCENOTFOUND_USER("ResourceNotFound.User"),
     
    // 房间统计结果计算中，请稍候。
     RESOURCEUNAVAILABLE_ROOMSTATISTICS("ResourceUnavailable.RoomStatistics");
     
    private String value;
    private LcicErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

