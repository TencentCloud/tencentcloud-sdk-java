package com.tencentcloudapi.bri.v20190328;
public enum BriErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 查询超时
     INTERNALERROR_TIMEOUT("InternalError.Timeout"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // CertMd5参数错误
     INVALIDPARAMETER_CERTMD5("InvalidParameter.CertMd5"),
     
    // FileMd5参数错误
     INVALIDPARAMETER_FILEMD5("InvalidParameter.FileMd5"),
     
    // FileSize参数错误
     INVALIDPARAMETER_FILESIZE("InvalidParameter.FileSize"),
     
    // Imei参数错误
     INVALIDPARAMETER_IMEI("InvalidParameter.Imei"),
     
    // 接口不存在
     INVALIDPARAMETER_INVALIDACTION("InvalidParameter.InvalidAction"),
     
    // IP参数错误
     INVALIDPARAMETER_IP("InvalidParameter.Ip"),
     
    // 包名填写错误
     INVALIDPARAMETER_PACKAGENAME("InvalidParameter.PackageName"),
     
    // PhoneNumber参数错误
     INVALIDPARAMETER_PHONENUMBER("InvalidParameter.PhoneNumber"),
     
    // QQ参数错误
     INVALIDPARAMETER_QQ("InvalidParameter.QQ"),
     
    // Service参数错误
     INVALIDPARAMETER_SERVICE("InvalidParameter.Service"),
     
    // Url参数错误
     INVALIDPARAMETER_URL("InvalidParameter.Url"),
     
    // Wechat参数错误
     INVALIDPARAMETER_WECHAT("InvalidParameter.Wechat"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private BriErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

