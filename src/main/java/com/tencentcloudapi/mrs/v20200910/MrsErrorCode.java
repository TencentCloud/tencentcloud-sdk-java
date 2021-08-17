package com.tencentcloudapi.mrs.v20200910;
public enum MrsErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 用量消息推送失败。
     FAILEDOPERATION_PUSHUSAGEMESSAGEERROR("FailedOperation.PushUsageMessageError"),
     
    // 服务未开通。
     FAILEDOPERATION_SERVICENOTOPEN("FailedOperation.ServiceNotOpen"),
     
    // 未知错误。
     FAILEDOPERATION_UNKNOWNERROR("FailedOperation.UnknownError"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 图片ocr识别异常。
     INTERNALERROR_IMAGEOCRERROR("InternalError.ImageOcrError"),
     
    // 图片处理异常。
     INTERNALERROR_IMAGEPROCESSERROR("InternalError.ImageProcessError"),
     
    // 服务调用超时。
     INTERNALERROR_SERVERTIMEOUTERROR("InternalError.ServerTimeOutError"),
     
    // 报告结构化异常。
     INTERNALERROR_STRUCTIONERROR("InternalError.StructionError"),
     
    // 报告文本分类异常。
     INTERNALERROR_TEXTCLASSIFYERROR("InternalError.TextClassifyError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数AutoFitDirection无效。
     INVALIDPARAMETER_AUTOFITDIRECTION("InvalidParameter.AutoFitDirection"),
     
    // 参数ImageInfoList无效。
     INVALIDPARAMETER_IMAGEINFOLIST("InvalidParameter.ImageInfoList"),
     
    // 参数ImageOriginalSize无效。
     INVALIDPARAMETER_IMAGEORIGINALSIZE("InvalidParameter.ImageOriginalSize"),
     
    // 请求Action无效。
     INVALIDPARAMETER_INVALIDACTION("InvalidParameter.InvalidAction"),
     
    // 参数OcrEngineType无效。
     INVALIDPARAMETER_OCRENGINETYPE("InvalidParameter.OcrEngineType"),
     
    // 参数RotateTheAngle无效。
     INVALIDPARAMETER_ROTATETHEANGLE("InvalidParameter.RotateTheAngle"),
     
    // 参数Text无效。
     INVALIDPARAMETER_TEXT("InvalidParameter.Text"),
     
    // 图片编码无效。
     INVALIDPARAMETERVALUE_IMAGECODEINVALID("InvalidParameterValue.ImageCodeInvalid"),
     
    // 图片没有文字。
     INVALIDPARAMETERVALUE_IMAGEISNOTEXT("InvalidParameterValue.ImageIsNoText"),
     
    // 图片URL无效。
     INVALIDPARAMETERVALUE_IMAGEURLINVALID("InvalidParameterValue.ImageURLInvalid"),
     
    // 不支持的报告类型。
     OPERATIONDENIED_UNSUPPORTTHISTYPE("OperationDenied.UnSupportThisType"),
     
    // 当前无权限，请检查BisinsessId。
     UNAUTHORIZEDOPERATION_PERMISSIONDENIEDERROR("UnauthorizedOperation.PermissionDeniedError"),
     
    // 当前报告类型不支持。
     UNSUPPORTEDOPERATION_UNSUPPORTTHISTYPE("UnsupportedOperation.UnSupportThisType");
     
    private String value;
    private MrsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

