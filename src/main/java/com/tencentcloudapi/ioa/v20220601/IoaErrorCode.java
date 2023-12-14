package com.tencentcloudapi.ioa.v20220601;
public enum IoaErrorCode {
    // 查询数据失败。
     FAILEDOPERATION_QUERYDATA("FailedOperation.QueryData"),
     
    // 内部错误，数据库异常。
     INTERNALERROR_DATABASEEXCEPTION("InternalError.DatabaseException"),
     
    // 内部未知错误。
     INTERNALERROR_UNKNOWN("InternalError.Unknown"),
     
    // 请求参数错误。
     INVALIDPARAMETER_REQUESTPARAM("InvalidParameter.RequestParam"),
     
    // 缺少公共参数。
     MISSINGPARAMETER_COMMONPARAM("MissingParameter.CommonParam"),
     
    // 资源不存在。
     RESOURCENOTFOUND_NOTFOUND("ResourceNotFound.NotFound"),
     
    // 未授权的操作。
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied");
     
    private String value;
    private IoaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

