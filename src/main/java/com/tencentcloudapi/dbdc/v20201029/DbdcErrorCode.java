package com.tencentcloudapi.dbdc.v20201029;
public enum DbdcErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 修改资源信息失败。
     FAILEDOPERATION_MODIFYRESOURCEINFOERROR("FailedOperation.ModifyResourceInfoError"),
     
    // 访问管控服务失败，请稍后重试。如果持续不成功，请联系客服进行处理。
     FAILEDOPERATION_OSSACCESSERROR("FailedOperation.OssAccessError"),
     
    // 查询资源信息失败。
     FAILEDOPERATION_QUERYRESOURCEERROR("FailedOperation.QueryResourceError"),
     
    // 获取独享集群规格信息失败。
     FAILEDOPERATION_QUERYSPECINFOERROR("FailedOperation.QuerySpecInfoError"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 参数值传入错误。
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUEERROR("InvalidParameterValue.InvalidParameterValueError"),
     
    // 集群的参数非法。
     INVALIDPARAMETERVALUE_RESOURCEPARAMETERERROR("InvalidParameterValue.ResourceParameterError"),
     
    // 获取资源失败，AppId：{{1}}，ResourceId：{{2}}。
     RESOURCENOTFOUND_FETCHRESOURCEERROR("ResourceNotFound.FetchResourceError"),
     
    // 获取资源列表失败，ErrMsg：{{1}}。
     RESOURCENOTFOUND_FETCHRESOURCELISTERROR("ResourceNotFound.FetchResourceListError");
     
    private String value;
    private DbdcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

