package com.tencentcloudapi.tdai.v20250717;
public enum TdaiErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 错误实例名称 */
     INVALIDPARAMETER_INVALIDINSTANCENAME("InvalidParameter.InvalidInstanceName"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private TdaiErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

