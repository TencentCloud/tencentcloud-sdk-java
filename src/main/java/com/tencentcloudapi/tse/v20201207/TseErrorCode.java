package com.tencentcloudapi.tse.v20201207;
public enum TseErrorCode {
    // 未授权操作错误。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 操作失败。
     FAILEDOPERATION_FAILEDOPERATION("FailedOperation.FailedOperation"),
     
    // 操作失败，内部错误。
     FAILEDOPERATION_INTERNALERROR("FailedOperation.InternalError"),
     
    // 获取临时密钥失败
     FAILEDOPERATION_ROLE("FailedOperation.Role"),
     
    // 调用VPC服务失败
     FAILEDOPERATION_VPC("FailedOperation.Vpc"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 创建内部错误。
     INTERNALERROR_CREATEERROR("InternalError.CreateError"),
     
    // 获取凭证失败。
     INTERNALERROR_GETCREDENTIAL("InternalError.GetCredential"),
     
    // 角色获取错误。
     INTERNALERROR_GETROLEERROR("InternalError.GetRoleError"),
     
    // 状态码错误。
     INTERNALERROR_HTTPSTATUSCODEERROR("InternalError.HttpStatusCodeError"),
     
    // 内部服务调用异常。
     INTERNALERROR_IOERROR("InternalError.IOError"),
     
    // 服务内部错误。
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
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
     
    // 旧实例不支持此操作。
     INVALIDPARAMETERVALUE_ACTION("InvalidParameterValue.Action"),
     
    // 请求格式不正确。
     INVALIDPARAMETERVALUE_BADREQUESTFORMAT("InvalidParameterValue.BadRequestFormat"),
     
    // 无效请求参数导致创建失败。
     INVALIDPARAMETERVALUE_CREATEERROR("InvalidParameterValue.CreateError"),
     
    // 无效的参数值。
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
    // 无效请求参数导致操作失败。
     INVALIDPARAMETERVALUE_OPERATIONFAILED("InvalidParameterValue.OperationFailed"),
     
    // 无效请求参数，查询失败。
     INVALIDPARAMETERVALUE_QUERYERROR("InvalidParameterValue.QueryError"),
     
    // 无效的Region。
     INVALIDPARAMETERVALUE_REGION("InvalidParameterValue.Region"),
     
    // 资源已经存在。
     INVALIDPARAMETERVALUE_RESOURCEALREADYEXIST("InvalidParameterValue.ResourceAlreadyExist"),
     
    // 网关规格参数内容错误
     INVALIDPARAMETERVALUE_SPECIFICATION("InvalidParameterValue.Specification"),
     
    // 网关类型参数内容错误
     INVALIDPARAMETERVALUE_TYPE("InvalidParameterValue.Type"),
     
    // 无效请求参数导致更新失败。
     INVALIDPARAMETERVALUE_UPDATEERROR("InvalidParameterValue.UpdateError"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 缺失参数导致创建失败。
     MISSINGPARAMETER_CREATEERROR("MissingParameter.CreateError"),
     
    // 缺少参数。
     MISSINGPARAMETER_MISSPARAMETER("MissingParameter.MissParameter"),
     
    // 缺失参数导致更新失败。
     MISSINGPARAMETER_UPDATEERROR("MissingParameter.UpdateError"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 实例不存在。
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
    // 资源不存在。
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // cam认证失败。
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth"),
     
    // 子账号缺少passRole权限。
     UNAUTHORIZEDOPERATION_CAMPASSROLENOTEXIST("UnauthorizedOperation.CamPassRoleNotExist"),
     
    // Uin未授权
     UNAUTHORIZEDOPERATION_UIN("UnauthorizedOperation.Uin"),
     
    // 未授权的操作。
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDOPERATION("UnauthorizedOperation.UnauthorizedOperation");
     
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

