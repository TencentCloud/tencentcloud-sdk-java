package com.tencentcloudapi.tse.v20201207;
public enum TseErrorCode {
    // 查询内部错误。
     INTERNALERROR_QUERYERROR("InternalError.QueryError"),
     
    // 标签操作失败。
     INTERNALERROR_TAGFAILURE("InternalError.TagFailure"),
     
    // 未知错误。
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // 请求格式不正确。
     INVALIDPARAMETERVALUE_BADREQUESTFORMAT("InvalidParameterValue.BadRequestFormat"),
     
    // 无效请求参数，查询失败。
     INVALIDPARAMETERVALUE_QUERYERROR("InvalidParameterValue.QueryError"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // cam认证失败。
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth");
     
    private String value;
    private TseErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

