package com.tencentcloudapi.dlc.v20210125;
public enum DlcErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 另一个请求正在处理中，请稍后再试。
     FAILEDOPERATION_ANOTHERREQUESTPROCESSING("FailedOperation.AnotherRequestProcessing"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 重复的工作组名称。
     INVALIDPARAMETER_DUPLICATEGROUPNAME("InvalidParameter.DuplicateGroupName"),
     
    // 重复的用户名。
     INVALIDPARAMETER_DUPLICATEUSERNAME("InvalidParameter.DuplicateUserName"),
     
    // 无效的描述信息。
     INVALIDPARAMETER_INVALIDDESCRIPTION("InvalidParameter.InvalidDescription"),
     
    // 无效的容错策略。
     INVALIDPARAMETER_INVALIDFAILURETOLERANCE("InvalidParameter.InvalidFailureTolerance"),
     
    // 无效的工作组Id。
     INVALIDPARAMETER_INVALIDGROUPID("InvalidParameter.InvalidGroupId"),
     
    // 无效的Offset值。
     INVALIDPARAMETER_INVALIDOFFSET("InvalidParameter.InvalidOffset"),
     
    // SQL解析失败。
     INVALIDPARAMETER_INVALIDSQL("InvalidParameter.InvalidSQL"),
     
    // 不支持的排序类型。
     INVALIDPARAMETER_INVALIDSORTBYTYPE("InvalidParameter.InvalidSortByType"),
     
    // 存储位置错误。
     INVALIDPARAMETER_INVALIDSTORELOCATION("InvalidParameter.InvalidStoreLocation"),
     
    // 无效的用户名。
     INVALIDPARAMETER_INVALIDUSERNAME("InvalidParameter.InvalidUserName"),
     
    // 无效的工作组名。
     INVALIDPARAMETER_INVALIDWORKGROUPNAME("InvalidParameter.InvalidWorkGroupName"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 指定数据源连接没有找到。
     RESOURCENOTFOUND_DATASOURCENOTFOUND("ResourceNotFound.DatasourceNotFound"),
     
    // 无法修改主账号。
     UNSUPPORTEDOPERATION_MODIFYOWNERUNSUPPORTED("UnsupportedOperation.ModifyOwnerUnsupported");
     
    private String value;
    private DlcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

