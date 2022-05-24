package com.tencentcloudapi.lowcode.v20210108;
public enum LowcodeErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private LowcodeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

