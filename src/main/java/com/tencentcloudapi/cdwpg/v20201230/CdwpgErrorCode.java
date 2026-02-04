package com.tencentcloudapi.cdwpg.v20201230;
public enum CdwpgErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* InternalError.SystemError */
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private CdwpgErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

