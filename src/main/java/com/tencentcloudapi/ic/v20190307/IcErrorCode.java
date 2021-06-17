package com.tencentcloudapi.ic.v20190307;
public enum IcErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 应用id不存在。
     RESOURCENOTFOUND_APPNOTFOUND("ResourceNotFound.AppNotFound");
     
    private String value;
    private IcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

