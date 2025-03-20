package com.tencentcloudapi.lkeap.v20240522;
public enum LkeapErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* FailedOperation.DownLoadError */
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
     /* 引擎层内部错误； */
     FAILEDOPERATION_ENGINESERVERERROR("FailedOperation.EngineServerError"),
     
     /* FailedOperation.FileDecodeFailed */
     FAILEDOPERATION_FILEDECODEFAILED("FailedOperation.FileDecodeFailed"),
     
     /* FailedOperation.ImageDecodeFailed */
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
     /* 暂不支持解析该文件 */
     FAILEDOPERATION_NONSUPPORTPARSE("FailedOperation.NonsupportParse"),
     
     /* 内部未知错误。 */
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
     /* FailedOperation.UnKnowFileTypeError */
     FAILEDOPERATION_UNKNOWFILETYPEERROR("FailedOperation.UnKnowFileTypeError"),
     
     /* 服务未开通。 */
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
     /* 生成识别结果文件访问url失败，请稍后重试。 */
     FAILEDOPERATION_UPLOADRESULTFILEFAILED("FailedOperation.UploadResultFileFailed"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数值错误。 */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
     /* 超过最大文件页数限制 */
     LIMITEXCEEDED_EXCEEDEDMAXPAGESERROR("LimitExceeded.ExceededMaxPagesError"),
     
     /* 文件太大 */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* 请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* 帐号已欠费。 */
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
     /* 账号资源包耗尽。 */
     RESOURCEUNAVAILABLE_RESOURCEPACKAGERUNOUT("ResourceUnavailable.ResourcePackageRunOut"),
     
     /* 计费状态异常。 */
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
    private String value;
    private LkeapErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

