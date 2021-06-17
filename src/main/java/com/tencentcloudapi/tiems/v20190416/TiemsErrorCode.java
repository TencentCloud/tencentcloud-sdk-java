package com.tencentcloudapi.tiems.v20190416;
public enum TiemsErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 已经存在同名资源。
     FAILEDOPERATION_ALREADYEXISTS("FailedOperation.AlreadyExists"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TiemsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

