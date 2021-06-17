package com.tencentcloudapi.solar.v20181011;
public enum SolarErrorCode {
    // 生成Token失败。
     FAILEDOPERATION_GENERATETOKENERROR("FailedOperation.GenerateTokenError"),
     
    // 奖品库存不足。
     FAILEDOPERATION_INSUFFICIENTPRIZESTOCK("FailedOperation.InsufficientPrizeStock"),
     
    // 内部错误
     INTERNALERROR("InternalError"),
     
    // 操作失败，请重试。
     INTERNALERROR_THIRDSERVERERROR("InternalError.ThirdServerError"),
     
    // 渠道不存在。
     RESOURCENOTFOUND_CHANNEL("ResourceNotFound.Channel"),
     
    // 工单不存在。
     RESOURCENOTFOUND_FLOW("ResourceNotFound.Flow"),
     
    // 项目不存在。
     RESOURCENOTFOUND_PROJECT("ResourceNotFound.Project"),
     
    // 仅编辑中和已下线的项目允许删除!。
     UNSUPPORTEDOPERATION_PROJECTNOTALLOWEDTODELETE("UnsupportedOperation.ProjectNotAllowedToDelete"),
     
    // 仅运营中项目允许下线。
     UNSUPPORTEDOPERATION_STATUSOFFLINEPROJECT("UnsupportedOperation.StatusOffLineProject");
     
    private String value;
    private SolarErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

