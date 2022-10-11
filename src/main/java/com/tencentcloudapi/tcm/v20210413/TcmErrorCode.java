package com.tencentcloudapi.tcm.v20210413;
public enum TcmErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // Cluster RBAC权限限制。
     FAILEDOPERATION_RBACFORBIDDEN("FailedOperation.RBACForbidden"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private TcmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

