package com.tencentcloudapi.bpaas.v20181217;
public enum BpaasErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 数据上报失败。
     FAILEDOPERATION_SENDTOCKAFKA("FailedOperation.SendToCkafka"),
     
    // 鉴权失败。
     INTERNALERROR_CAUTHERROR("InternalError.CauthError"),
     
    // 插入db失败。
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // 已经审批。
     INVALIDPARAMETER_HASBEENAPPROVED("InvalidParameter.HasBeenApproved"),
     
    // id不存在。
     INVALIDPARAMETER_IDNOTEXIST("InvalidParameter.IdNotExist"),
     
    // 非法流程节点。
     INVALIDPARAMETER_ILLEGALNODE("InvalidParameter.IllegalNode"),
     
    // 没有权限审批。
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied");
     
    private String value;
    private BpaasErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

