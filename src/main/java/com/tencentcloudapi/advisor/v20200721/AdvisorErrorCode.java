package com.tencentcloudapi.advisor.v20200721;
public enum AdvisorErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 依赖的db出错。
     INTERNALERROR_DEPENDSDB("InternalError.DependsDb"),
     
    // 系统错误。
     INTERNALERROR_SYSTEM("InternalError.System"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数错误。
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private AdvisorErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

