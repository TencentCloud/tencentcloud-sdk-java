package com.tencentcloudapi.captcha.v20190722;
public enum CaptchaErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 鉴权失败。
     UNAUTHORIZEDOPERATION_ERRAUTH("UnauthorizedOperation.ErrAuth"),
     
    // 未开通权限。
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized");
     
    private String value;
    private CaptchaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

