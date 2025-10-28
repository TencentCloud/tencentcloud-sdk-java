package com.tencentcloudapi.lkeap.v20240522;
public enum LkeapErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 引擎层内部错误。 */
     FAILEDOPERATION_ENGINESERVERERROR("FailedOperation.EngineServerError"),
     
     /* 解析失败。 */
     FAILEDOPERATION_FILEPARSEERROR("FailedOperation.FileParseError"),
     
     /* 文档解析超时。 */
     FAILEDOPERATION_FILEPARSETIMEOUT("FailedOperation.FileParseTimeout"),
     
     /* 内部错误。 */
     FAILEDOPERATION_INTERNALERROR("FailedOperation.InternalError"),
     
     /* 暂不支持解析该文件。 */
     FAILEDOPERATION_NONSUPPORTPARSE("FailedOperation.NonsupportParse"),
     
     /* FailedOperation.OcrFailed */
     FAILEDOPERATION_OCRFAILED("FailedOperation.OcrFailed"),
     
     /* 内部未知错误。 */
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
     /* 服务未开通。 */
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
     /* 生成识别结果文件访问url失败，请稍后重试。 */
     FAILEDOPERATION_UPLOADRESULTFILEFAILED("FailedOperation.UploadResultFileFailed"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 文件url链接不正确。 */
     INVALIDPARAMETER_FILEURLINVALID("InvalidParameter.FileURLInvalid"),
     
     /* 无效的文件格式。 */
     INVALIDPARAMETER_INVALIDFILEFORMAT("InvalidParameter.InvalidFileFormat"),
     
     /* 无效的文件类型。 */
     INVALIDPARAMETER_INVALIDFILETYPE("InvalidParameter.InvalidFileType"),
     
     /* 参数值错误。 */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
     /* 超过最大文件页数限制 */
     LIMITEXCEEDED_EXCEEDEDMAXPAGESERROR("LimitExceeded.ExceededMaxPagesError"),
     
     /* 文件太大 */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* 请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* 账号已欠费。 */
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

