package com.tencentcloudapi.captcha.v20190722;
public enum CaptchaErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 鉴权失败。
     UNAUTHORIZEDOPERATION_ERRAUTH("UnauthorizedOperation.ErrAuth"),
     
    // 未开通权限/无有效套餐包/账号已欠费。
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

