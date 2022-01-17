package com.tencentcloudapi.apm.v20210622;
public enum ApmErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // AuthFailure.UnauthorizedOperation
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // appid和实例信息不匹配。
     FAILEDOPERATION_APPIDNOTMATCHINSTANCEINFO("FailedOperation.AppIdNotMatchInstanceInfo"),
     
    // 实例ID为空。
     FAILEDOPERATION_INSTANCEIDISEMPTY("FailedOperation.InstanceIdIsEmpty"),
     
    // apm实例不存在。
     FAILEDOPERATION_INSTANCENOTFOUND("FailedOperation.InstanceNotFound"),
     
    // 非内网vpc。
     FAILEDOPERATION_NOTINNERVPC("FailedOperation.NotInnerVPC"),
     
    // 发送查询请求失败。
     FAILEDOPERATION_SENDREQUEST("FailedOperation.SendRequest"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private ApmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

