package com.tencentcloudapi.gme.v20180711;
public enum GmeErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 登录态过期。
     FAILEDOPERATION_LOGINFAILED("FailedOperation.LoginFailed"),
     
    // 欠费不可操作。
     FAILEDOPERATION_USERFEENEGATIVE("FailedOperation.UserFeeNegative"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 回调地址不正确
     INVALIDPARAMETER_CALLBACKADDRESS("InvalidParameter.CallbackAddress"),
     
    // 日期无效。
     INVALIDPARAMETER_DATEINVALID("InvalidParameter.DateInvalid"),
     
    // 标签不正确
     INVALIDPARAMETER_TAGKEY("InvalidParameter.TagKey"),
     
    // 查询时间范围错误。
     INVALIDPARAMETER_TIMERANGEERROR("InvalidParameter.TimeRangeError"),
     
    // 创建应用数已达上限。
     LIMITEXCEEDED_APPLICATION("LimitExceeded.Application"),
     
    // 缺少参数。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 应用ID不正确
     RESOURCENOTFOUND_BIZIDISNOTFOUND("ResourceNotFound.BizidIsNotFound"),
     
    // 任务ID不正确
     RESOURCENOTFOUND_TASKNOTFOUND("ResourceNotFound.TaskNotFound"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 创建应用不被授权。
     UNAUTHORIZEDOPERATION_CREATEAPPDENIED("UnauthorizedOperation.CreateAppDenied"),
     
    // 该用户未进行实名认证。
     UNAUTHORIZEDOPERATION_UNREALNAMEAUTH("UnauthorizedOperation.UnRealNameAuth"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private GmeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

