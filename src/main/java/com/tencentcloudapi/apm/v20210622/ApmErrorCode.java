package com.tencentcloudapi.apm.v20210622;
public enum ApmErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // AuthFailure.UnauthorizedOperation
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
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

