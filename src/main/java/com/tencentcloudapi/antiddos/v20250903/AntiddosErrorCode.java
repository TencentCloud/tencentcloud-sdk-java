package com.tencentcloudapi.antiddos.v20250903;
public enum AntiddosErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded");
     
    private String value;
    private AntiddosErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

