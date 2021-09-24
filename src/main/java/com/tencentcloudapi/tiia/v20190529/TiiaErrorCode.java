package com.tencentcloudapi.tiia.v20190529;
public enum TiiaErrorCode {
    // 认证失败。
     AUTHFAILURE_INVALIDAUTHORIZATION("AuthFailure.InvalidAuthorization"),
     
    // 文件下载失败。
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
    // 图片内容为空。
     FAILEDOPERATION_EMPTYIMAGEERROR("FailedOperation.EmptyImageError"),
     
    // 图片解码失败。
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
    // 不支持的图片文件。
     FAILEDOPERATION_IMAGENOTSUPPORTED("FailedOperation.ImageNotSupported"),
     
    // 图片不满足检测要求。
     FAILEDOPERATION_IMAGEUNQUALIFIED("FailedOperation.ImageUnQualified"),
     
    // 调用计费返回失败。
     FAILEDOPERATION_INVOKECHARGEERROR("FailedOperation.InvokeChargeError"),
     
    // 车辆识别失败。
     FAILEDOPERATION_RECOGNIZEFAILDED("FailedOperation.RecognizeFailded"),
     
    // 后端服务超时。
     FAILEDOPERATION_REQUESTTIMEOUT("FailedOperation.RequestTimeout"),
     
    // 算法服务异常，请重试。
     FAILEDOPERATION_SERVERERROR("FailedOperation.ServerError"),
     
    // 文件太大。
     FAILEDOPERATION_TOOLARGEFILEERROR("FailedOperation.TooLargeFileError"),
     
    // 内部错误。
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
    // 服务未开通。
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
    // 参数值错误。
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
    // 图片中未检测到人脸。
     INVALIDPARAMETERVALUE_NOFACEINPHOTO("InvalidParameterValue.NoFaceInPhoto"),
     
    // 文件太大。
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
    // 账号已欠费。
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
    // 计费状态未知，请确认是否已在控制台开通服务。
     RESOURCEUNAVAILABLE_NOTEXIST("ResourceUnavailable.NotExist"),
     
    // 计费状态异常。
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
    private String value;
    private TiiaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

