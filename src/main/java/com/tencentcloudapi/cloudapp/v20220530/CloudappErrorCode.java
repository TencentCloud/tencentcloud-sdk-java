package com.tencentcloudapi.cloudapp.v20220530;
public enum CloudappErrorCode {
    // DBError
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // 找不到该License
     RESOURCENOTFOUND_LICENSENOTFOUNDERR("ResourceNotFound.LicenseNotFoundErr");
     
    private String value;
    private CloudappErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

