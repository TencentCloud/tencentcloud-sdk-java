package com.tencentcloudapi.cat.v20180409;
public enum CatErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private CatErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

