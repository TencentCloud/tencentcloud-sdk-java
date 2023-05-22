package com.tencentcloudapi.csxg.v20230303;
public enum CsxgErrorCode {
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private CsxgErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

