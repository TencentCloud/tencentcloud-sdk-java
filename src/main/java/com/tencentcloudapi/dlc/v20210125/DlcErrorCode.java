package com.tencentcloudapi.dlc.v20210125;
public enum DlcErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // SQL解析失败。
     INVALIDPARAMETER_INVALIDSQL("InvalidParameter.InvalidSQL"),
     
    // 存储位置错误。
     INVALIDPARAMETER_INVALIDSTORELOCATION("InvalidParameter.InvalidStoreLocation"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 指定数据源连接没有找到。
     RESOURCENOTFOUND_DATASOURCENOTFOUND("ResourceNotFound.DatasourceNotFound");
     
    private String value;
    private DlcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

