package com.tencentcloudapi.drm.v20181115;
public enum DrmErrorCode {
    // pem id 不存在。
     FAILEDOPERATION_PEMIDNOTEXIST("FailedOperation.PemIdNotExist"),
     
    // 系统中存在的私钥数超过两个。
     FAILEDOPERATION_PEMNUMTOOMUCH("FailedOperation.PemNumTooMuch"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private DrmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

