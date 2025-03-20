package com.tencentcloudapi.cdwch.v20200915;
public enum CdwchErrorCode {
     /*         操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /*         内部错误。 */
     INTERNALERROR("InternalError"),
     
     /*         资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private CdwchErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

