package com.tencentcloudapi.cloudstudio.v20230508;
public enum CloudstudioErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 工作空间名称重复
     FAILEDOPERATION_WORKSPACENAMEDUPLICATE("FailedOperation.WorkspaceNameDuplicate"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded");
     
    private String value;
    private CloudstudioErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

