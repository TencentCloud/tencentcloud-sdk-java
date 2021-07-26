package com.tencentcloudapi.tse.v20201207;
public enum TseErrorCode {
    // 查询内部错误。
     INTERNALERROR_QUERYERROR("InternalError.QueryError"),
     
    // 请求格式不正确。
     INVALIDPARAMETERVALUE_BADREQUESTFORMAT("InvalidParameterValue.BadRequestFormat"),
     
    // 无效请求参数，查询失败。
     INVALIDPARAMETERVALUE_QUERYERROR("InvalidParameterValue.QueryError"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound");
     
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

