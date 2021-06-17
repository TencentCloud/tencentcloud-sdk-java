package com.tencentcloudapi.ssa.v20180608;
public enum SsaErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 参数校验失败。
     INTERNALERROR_PARAMERROR("InternalError.ParamError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private SsaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

