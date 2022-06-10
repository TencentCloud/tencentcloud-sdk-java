package com.tencentcloudapi.tse.v20201207;
public enum TseErrorCode {
    // 未授权操作错误。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 创建内部错误。
     INTERNALERROR_CREATEERROR("InternalError.CreateError"),
     
    // 获取凭证失败。
     INTERNALERROR_GETCREDENTIAL("InternalError.GetCredential"),
     
    // 操作失败。
     INTERNALERROR_OPERATIONFAILED("InternalError.OperationFailed"),
     
    // 查询内部错误。
     INTERNALERROR_QUERYERROR("InternalError.QueryError"),
     
    // TKE相关操作失败。
     INTERNALERROR_TKEFAILURE("InternalError.TKEFailure"),
     
    // 标签操作失败。
     INTERNALERROR_TAGFAILURE("InternalError.TagFailure"),
     
    // 未知错误。
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // 更新内部错误。
     INTERNALERROR_UPDATEERROR("InternalError.UpdateError"),
     
    // 访问VPC内部错误。
     INTERNALERROR_VPCFAILURE("InternalError.VPCFailure"),
     
    // 请求格式不正确。
     INVALIDPARAMETERVALUE_BADREQUESTFORMAT("InvalidParameterValue.BadRequestFormat"),
     
    // 无效请求参数导致创建失败。
     INVALIDPARAMETERVALUE_CREATEERROR("InvalidParameterValue.CreateError"),
     
    // 无效请求参数，查询失败。
     INVALIDPARAMETERVALUE_QUERYERROR("InvalidParameterValue.QueryError"),
     
    // 无效请求参数导致更新失败。
     INVALIDPARAMETERVALUE_UPDATEERROR("InvalidParameterValue.UpdateError"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺失参数导致创建失败。
     MISSINGPARAMETER_CREATEERROR("MissingParameter.CreateError"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // cam认证失败。
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth"),
     
    // 子账号缺少passRole权限。
     UNAUTHORIZEDOPERATION_CAMPASSROLENOTEXIST("UnauthorizedOperation.CamPassRoleNotExist");
     
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

