package com.tencentcloudapi.dsgc.v20190723;
public enum DsgcErrorCode {
     /*         CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /*         未授权的操作。 */
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
     /*         操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /*         内部错误。 */
     INTERNALERROR("InternalError"),
     
     /*         参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /*         参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /*         超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /*         缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /*         操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /*         请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /*         资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /*         资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /*         资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /*         扫描任务已被禁用。 */
     RESOURCEUNAVAILABLE_TASKDISABLED("ResourceUnavailable.TaskDisabled"),
     
     /*         未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /*         未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /*         操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /*         不允许多次人工打标，请回退后重试！ */
     UNSUPPORTEDOPERATION_MULTIPLEMARKINGNOTALLOWED("UnsupportedOperation.MultipleMarkingNotAllowed");
     
    private String value;
    private DsgcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

