package com.tencentcloudapi.lke.v20231130;
public enum LkeErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter");
     
    private String value;
    private LkeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

