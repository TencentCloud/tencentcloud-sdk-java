package com.tencentcloudapi.cms.v20190321;
public enum CmsErrorCode {
    // 内部错误
     INTERNALERROR("InternalError"),
     
    // 参数不可用
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
    // 渠道AppId参数错误
     INVALIDPARAMETERVALUE_CUSTOMAPPID("InvalidParameterValue.CustomAppId"),
     
    // 重复提交ContentID
     INVALIDPARAMETERVALUE_DUPLICATECONTENTID("InvalidParameterValue.DuplicateContentID"),
     
    // Action参数值错误
     INVALIDPARAMETERVALUE_ERRACTION("InvalidParameterValue.ErrAction"),
     
    // AppId参数值错误
     INVALIDPARAMETERVALUE_ERRAPPID("InvalidParameterValue.ErrAppId"),
     
    // FileContent不可用：需Base64编码
     INVALIDPARAMETERVALUE_ERRFILECONTENT("InvalidParameterValue.ErrFileContent"),
     
    // RequestID参数值错误
     INVALIDPARAMETERVALUE_ERRREQUESTID("InvalidParameterValue.ErrRequestID"),
     
    // RequestSource请求参数错误或请求失败
     INVALIDPARAMETERVALUE_ERRREQUESTSOURCE("InvalidParameterValue.ErrRequestSource"),
     
    // 文本内容类型错误：需base64编码
     INVALIDPARAMETERVALUE_ERRTEXTCONTENTTYPE("InvalidParameterValue.ErrTextContentType"),
     
    // Uin参数值错误
     INVALIDPARAMETERVALUE_ERRUIN("InvalidParameterValue.ErrUin"),
     
    // BatchId取值错误
     INVALIDPARAMETERVALUE_INVALIDBATCHID("InvalidParameterValue.InvalidBatchId"),
     
    // Content参数错误
     INVALIDPARAMETERVALUE_INVALIDCONTENT("InvalidParameterValue.InvalidContent"),
     
    // ContentID参数错误
     INVALIDPARAMETERVALUE_INVALIDCONTENTID("InvalidParameterValue.InvalidContentID"),
     
    // ContentType取值错误 1 图片 2 视频 3 文本 4 音频
     INVALIDPARAMETERVALUE_INVALIDCONTENTTYPE("InvalidParameterValue.InvalidContentType"),
     
    // 渠道AppId参数错误
     INVALIDPARAMETERVALUE_INVALIDCUSTOMAPPID("InvalidParameterValue.InvalidCustomAppId"),
     
    // 图片内容错误
     INVALIDPARAMETERVALUE_INVALIDIMAGECONTENT("InvalidParameterValue.InvalidImageContent"),
     
    // 参数取值错误
     INVALIDPARAMETERVALUE_INVALIDPARAMETER("InvalidParameterValue.InvalidParameter"),
     
    // Priority取值错误
     INVALIDPARAMETERVALUE_INVALIDPRIORITY("InvalidParameterValue.InvalidPriority"),
     
    // Title取值错误
     INVALIDPARAMETERVALUE_INVALIDTITLE("InvalidParameterValue.InvalidTitle"),
     
    // FileUrl或FileContent都为空
     MISSINGPARAMETER_ERRFILEURL("MissingParameter.ErrFileUrl"),
     
    // 文件链接下载内部错误
     RESOURCENOTFOUND_ERRDOWDOWNINTERNALERROR("ResourceNotFound.ErrDowdownInternalError"),
     
    // 文件链接下载服务参数异常
     RESOURCENOTFOUND_ERRDOWDOWNPARAMSERROR("ResourceNotFound.ErrDowdownParamsError"),
     
    // 文件链接下载源错误
     RESOURCENOTFOUND_ERRDOWDOWNSOURCEERROR("ResourceNotFound.ErrDowdownSourceError"),
     
    // 文件链接下载超时
     RESOURCENOTFOUND_ERRDOWDOWNTIMEOUT("ResourceNotFound.ErrDowdownTimeOut"),
     
    // 图片识别服务超时
     RESOURCEUNAVAILABLE_ERRIMAGETIMEOUT("ResourceUnavailable.ErrImageTimeOut"),
     
    // 文本识别服务超时
     RESOURCEUNAVAILABLE_ERRTEXTTIMEOUT("ResourceUnavailable.ErrTextTimeOut"),
     
    // 鉴权失败
     UNAUTHORIZEDOPERATION_ERRAUTH("UnauthorizedOperation.ErrAuth"),
     
    // 未开通权限
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized");
     
    private String value;
    private CmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

