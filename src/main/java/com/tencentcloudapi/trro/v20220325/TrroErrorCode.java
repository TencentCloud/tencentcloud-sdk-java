package com.tencentcloudapi.trro.v20220325;
public enum TrroErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private TrroErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

