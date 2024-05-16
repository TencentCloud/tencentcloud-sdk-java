package com.tencentcloudapi.vcg.v20240404;
public enum VcgErrorCode {
    // 下载视频出错。
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownloadError"),
     
    // 任务不存在。
     FAILEDOPERATION_TASKNOTEXIST("FailedOperation.TaskNotExist"),
     
    // 任务状态异常。
     FAILEDOPERATION_TASKSTATUSERROR("FailedOperation.TaskStatusError"),
     
    // 视频解码失败。
     FAILEDOPERATION_VIDEODECODEFAILED("FailedOperation.VideoDecodeFailed"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 视频时长超过限制。
     INVALIDPARAMETERVALUE_INVALIDVIDEODURATION("InvalidParameterValue.InvalidVideoDuration"),
     
    // 不支持的视频FPS。
     INVALIDPARAMETERVALUE_INVALIDVIDEOFPS("InvalidParameterValue.InvalidVideoFPS"),
     
    // 不支持的视频格式。
     INVALIDPARAMETERVALUE_INVALIDVIDEOFORMAT("InvalidParameterValue.InvalidVideoFormat"),
     
    // 不支持的分辨率。
     INVALIDPARAMETERVALUE_INVALIDVIDEORESOLUTION("InvalidParameterValue.InvalidVideoResolution"),
     
    // 参数字段或者值有误。
     INVALIDPARAMETERVALUE_PARAMETERVALUEERROR("InvalidParameterValue.ParameterValueError"),
     
    // 风格不存在。
     INVALIDPARAMETERVALUE_STYLENOTEXIST("InvalidParameterValue.StyleNotExist"),
     
    // 视频URL格式不合法。
     INVALIDPARAMETERVALUE_URLILLEGAL("InvalidParameterValue.UrlIllegal"),
     
    // 视频大小超过限制。
     INVALIDPARAMETERVALUE_VIDEOSIZEEXCEED("InvalidParameterValue.VideoSizeExceed"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 提交任务数超过最大并发。
     REQUESTLIMITEXCEEDED_JOBNUMEXCEED("RequestLimitExceeded.JobNumExceed"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 计费状态未知。
     RESOURCEUNAVAILABLE_NOTEXIST("ResourceUnavailable.NotExist");
     
    private String value;
    private VcgErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

