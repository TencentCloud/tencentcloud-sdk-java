package com.tencentcloudapi.cynosdb.v20190107;
public enum CynosdbErrorCode {
    // 创建并支付订单失败。
     FAILEDOPERATION_CREATEORDER("FailedOperation.CreateOrder"),
     
    // 账号余额不足。
     FAILEDOPERATION_INSUFFICIENTBALANCE("FailedOperation.InsufficientBalance"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 查询数据库失败。
     INTERNALERROR_DBOPERATIONFAILED("InternalError.DbOperationFailed"),
     
    // 获取安全组信息失败。
     INTERNALERROR_GETSECURITYGROUPDETAILFAILED("InternalError.GetSecurityGroupDetailFailed"),
     
    // 获取子网失败。
     INTERNALERROR_GETSUBNETFAILED("InternalError.GetSubnetFailed"),
     
    // 获取VPC失败。
     INTERNALERROR_GETVPCFAILED("InternalError.GetVpcFailed"),
     
    // 安全组查询实例失败。
     INTERNALERROR_LISTINSTANCEFAILED("InternalError.ListInstanceFailed"),
     
    // 操作不支持。
     INTERNALERROR_OPERATIONNOTSUPPORT("InternalError.OperationNotSupport"),
     
    // 查询数据库失败。
     INTERNALERROR_QUERYDATABASEFAILED("InternalError.QueryDatabaseFailed"),
     
    // 系统内部错误。
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // 当前实例不可隔离。
     INVALIDPARAMETER_ISOLATENOTALLOWED("InvalidParameter.IsolateNotAllowed"),
     
    // 未查询到集群。
     INVALIDPARAMETERVALUE_CLUSTERNOTFOUND("InvalidParameterValue.ClusterNotFound"),
     
    // 不支持的实例类型。
     INVALIDPARAMETERVALUE_DBTYPENOTFOUND("InvalidParameterValue.DBTypeNotFound"),
     
    // 未查询到订单id。
     INVALIDPARAMETERVALUE_DEALNAMENOTFOUND("InvalidParameterValue.DealNameNotFound"),
     
    // 实例名称字符非法。
     INVALIDPARAMETERVALUE_ILLEGALINSTANCENAME("InvalidParameterValue.IllegalInstanceName"),
     
    // 无效的排序字段。
     INVALIDPARAMETERVALUE_ILLEGALORDERBY("InvalidParameterValue.IllegalOrderBy"),
     
    // 密码不符合要求。
     INVALIDPARAMETERVALUE_ILLEGALPASSWORD("InvalidParameterValue.IllegalPassword"),
     
    // 实例不存在。
     INVALIDPARAMETERVALUE_INSTANCENOTFOUND("InvalidParameterValue.InstanceNotFound"),
     
    // 实例版本非法。
     INVALIDPARAMETERVALUE_INVALIDDBVERSION("InvalidParameterValue.InvalidDBVersion"),
     
    // 实例规格非法。
     INVALIDPARAMETERVALUE_INVALIDSPEC("InvalidParameterValue.InvalidSpec"),
     
    // 参数错误。
     INVALIDPARAMETERVALUE_PARAMERROR("InvalidParameterValue.ParamError"),
     
    // 所选地域和可用区不可用。
     INVALIDPARAMETERVALUE_REGIONZONEUNAVAILABLE("InvalidParameterValue.RegionZoneUnavailable"),
     
    // 未找到相关存储pool。
     INVALIDPARAMETERVALUE_STORAGEPOOLNOTFOUND("InvalidParameterValue.StoragePoolNotFound"),
     
    // 找不到所选子网。
     INVALIDPARAMETERVALUE_SUBNETNOTFOUND("InvalidParameterValue.SubnetNotFound"),
     
    // 找不到所选VPC网络。
     INVALIDPARAMETERVALUE_VPCNOTFOUND("InvalidParameterValue.VpcNotFound"),
     
    // 用户实例个数超出限制。
     LIMITEXCEEDED_USERINSTANCELIMIT("LimitExceeded.UserInstanceLimit"),
     
    // 锁定实例失败，暂时不可操作。
     RESOURCEUNAVAILABLE_INSTANCELOCKFAIL("ResourceUnavailable.InstanceLockFail"),
     
    // 实例状态异常，暂时不可操作。
     RESOURCEUNAVAILABLE_INSTANCESTATUSABNORMAL("ResourceUnavailable.InstanceStatusAbnormal"),
     
    // 非实名用户禁止购买。
     UNAUTHORIZEDOPERATION_NOTREALNAMEACCOUNT("UnauthorizedOperation.NotRealNameAccount"),
     
    // CAM鉴权不通过。
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied");
     
    private String value;
    private CynosdbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

