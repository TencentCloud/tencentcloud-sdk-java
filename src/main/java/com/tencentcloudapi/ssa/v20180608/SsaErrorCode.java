package com.tencentcloudapi.ssa.v20180608;
public enum SsaErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 云上资产、安全配置、合规风险配置、互联网攻击面测绘模块未授权。
     AUTHFAILURE_AUTHMODULEFAILED("AuthFailure.AuthModuleFailed"),
     
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

