package com.tencentcloudapi.cdwpg.v20201230;
public enum CdwpgErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // InternalError.SystemError
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError");
     
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

