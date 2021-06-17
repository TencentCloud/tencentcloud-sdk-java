package com.tencentcloudapi.iir.v20200417;
public enum IirErrorCode {
    // 文件下载失败。
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
    // 图片解码失败。
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
    // 不支持的图片文件。
     FAILEDOPERATION_IMAGENOTSUPPORTED("FailedOperation.ImageNotSupported"),
     
    // 图片不满足检测要求。
     FAILEDOPERATION_IMAGEUNQUALIFIED("FailedOperation.ImageUnQualified"),
     
    // 后端服务超时。
     FAILEDOPERATION_REQUESTTIMEOUT("FailedOperation.RequestTimeout"),
     
    // 算法服务异常，请重试。
     FAILEDOPERATION_SERVERERROR("FailedOperation.ServerError"),
     
    // 内部错误。
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
    // 服务未开通。
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
    // 参数值错误。
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
    // 文件太大。
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
    // 计费状态未知，请确认是否已在控制台开通服务。
     RESOURCEUNAVAILABLE_NOTEXIST("ResourceUnavailable.NotExist");
     
    private String value;
    private IirErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

