package com.tencentcloudapi.cloudstudio.v20210524;
public enum CloudstudioErrorCode {
    // 工作空间名称重复
     FAILEDOPERATION_WORKSPACENAMEDUPLICATE("FailedOperation.WorkspaceNameDuplicate"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
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

