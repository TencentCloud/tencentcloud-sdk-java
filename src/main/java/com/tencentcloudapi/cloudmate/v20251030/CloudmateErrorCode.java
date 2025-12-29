package com.tencentcloudapi.cloudmate.v20251030;
public enum CloudmateErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数内容超出限制 */
     INVALIDPARAMETERVALUE_OUTOFRANGE("InvalidParameterValue.OutOfRange"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 空间不存在 */
     RESOURCENOTFOUND_WORKSPACENOTEXIST("ResourceNotFound.WorkspaceNotExist");
     
    private String value;
    private CloudmateErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

