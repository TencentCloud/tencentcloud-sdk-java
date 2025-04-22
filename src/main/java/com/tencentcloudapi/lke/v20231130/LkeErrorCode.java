package com.tencentcloudapi.lke.v20231130;
public enum LkeErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 文件下载失败。 */
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
     /* 文件解码失败 */
     FAILEDOPERATION_FILEDECODEFAILED("FailedOperation.FileDecodeFailed"),
     
     /* 图片解码失败。 */
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
     /* 图片尺寸过大，请参考输入参数中关于图片大小限制的说明。 */
     FAILEDOPERATION_IMAGESIZETOOLARGE("FailedOperation.ImageSizeTooLarge"),
     
     /* OCR识别失败。 */
     FAILEDOPERATION_OCRFAILED("FailedOperation.OcrFailed"),
     
     /* 未知错误。 */
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
     /* 未知的文件类型 */
     FAILEDOPERATION_UNKNOWFILETYPEERROR("FailedOperation.UnKnowFileTypeError"),
     
     /* 服务未开通。 */
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数值错误。 */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
     /* 文件内容太大。 */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 账号已欠费。 */
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
     /* 账号资源包耗尽。 */
     RESOURCEUNAVAILABLE_RESOURCEPACKAGERUNOUT("ResourceUnavailable.ResourcePackageRunOut"),
     
     /* 计费状态异常。 */
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
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

