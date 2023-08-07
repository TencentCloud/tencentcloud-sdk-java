package com.tencentcloudapi.trocket.v20230308;
public enum TrocketErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 实例不存在。
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance");
     
    private String value;
    private TrocketErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

