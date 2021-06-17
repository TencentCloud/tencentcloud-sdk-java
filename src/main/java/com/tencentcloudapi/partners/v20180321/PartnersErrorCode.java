package com.tencentcloudapi.partners.v20180321;
public enum PartnersErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private PartnersErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

