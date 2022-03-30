package com.tencentcloudapi.tcb.v20180608;
public enum TcbErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 您没有查看该资源的权限。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 部分失败（有一部分操作失败）。
     FAILEDOPERATION_PARTIALFAILURE("FailedOperation.PartialFailure"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 数据库错误。
     INTERNALERROR_DATABASE("InternalError.Database"),
     
    // 系统失败。
     INTERNALERROR_SYSTEMFAIL("InternalError.SystemFail"),
     
    // 服务超时。
     INTERNALERROR_TIMEOUT("InternalError.Timeout"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // API已经创建。
     INVALIDPARAMETER_APICREATED("InvalidParameter.APICreated"),
     
    // 接口名非法。
     INVALIDPARAMETER_ACTION("InvalidParameter.Action"),
     
    // 环境ID非法。
     INVALIDPARAMETER_ENVID("InvalidParameter.EnvId"),
     
    // 对应资源不存在。
     INVALIDPARAMETER_RESOURCENOTEXISTS("InvalidParameter.ResourceNotExists"),
     
    // 没有操作权限。
     INVALIDPARAMETER_SERVICEEVIL("InvalidParameter.ServiceEvil"),
     
    // 服务不存在。
     INVALIDPARAMETER_SERVICENOTEXIST("InvalidParameter.ServiceNotExist"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 并发请求超过配额限制。
     LIMITEXCEEDED_CONCURRENT("LimitExceeded.Concurrent"),
     
    // 命名空间超过配额。
     LIMITEXCEEDED_ERRNAMESPACEMAXLIMIT("LimitExceeded.ErrNamespaceMaxLimit"),
     
    // 镜像容器超过配额。
     LIMITEXCEEDED_ERRREPOMAXLIMIT("LimitExceeded.ErrRepoMaxLimit"),
     
    // 请求次数超过配额限制。
     LIMITEXCEEDED_REQUEST("LimitExceeded.Request"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 缺少必要参数。
     MISSINGPARAMETER_PARAM("MissingParameter.Param"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 操作失败：资源被冻结。
     OPERATIONDENIED_RESOURCEFROZEN("OperationDenied.ResourceFrozen"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 用户不存在。
     RESOURCENOTFOUND_USERNOTEXISTS("ResourceNotFound.UserNotExists"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源不可用-余额不足。
     RESOURCEUNAVAILABLE_BALANCENOTENOUGH("ResourceUnavailable.BalanceNotEnough"),
     
    // 资源不可用，CDN冻结。
     RESOURCEUNAVAILABLE_CDNFREEZED("ResourceUnavailable.CDNFreezed"),
     
    // 当前发票余额不足，无法退费。
     RESOURCEUNAVAILABLE_INVOICEAMOUNTLACK("ResourceUnavailable.InvoiceAmountLack"),
     
    // 资源过期。
     RESOURCEUNAVAILABLE_RESOURCEOVERDUE("ResourceUnavailable.ResourceOverdue"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 外部代码仓库未授权。
     UNAUTHORIZEDOPERATION_CODEOAUTHUNAUTHORIZED("UnauthorizedOperation.CodeOAuthUnauthorized"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 有正在进行中的任务。
     UNSUPPORTEDOPERATION_TASKEXISTED("UnsupportedOperation.TaskExisted");
     
    private String value;
    private TcbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

