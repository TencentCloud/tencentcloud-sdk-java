package com.tencentcloudapi.tcex.v20200727;
public enum TcexErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 数据库查询错误。
     FAILEDOPERATION_DATABASEFINDERROR("FailedOperation.DatabaseFindError"),
     
    // 文件不存在。
     FAILEDOPERATION_FILENOTEXISTS("FailedOperation.FileNotExists"),
     
    // 权限不足。
     FAILEDOPERATION_INSUFFICIENTPRIVILEGE("FailedOperation.InsufficientPrivilege"),
     
    // 指定的服务不存在。
     FAILEDOPERATION_SERVICENOTFOUND("FailedOperation.ServiceNotFound"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数值不能为空。
     INVALIDPARAMETER_EMPTYPARAMETERS("InvalidParameter.EmptyParameters"),
     
    // 文件格式解析失败。
     INVALIDPARAMETER_INVALIDFILEFORMAT("InvalidParameter.InvalidFileFormat"),
     
    // 文件大小不符合要求。
     INVALIDPARAMETER_INVALIDFILESIZE("InvalidParameter.InvalidFileSize"),
     
    // 参数取值错误。
     INVALIDPARAMETER_INVALIDPARAMETERVALUE("InvalidParameter.InvalidParameterValue"),
     
    // 参数解析失败。
     INVALIDPARAMETER_REQUESTPARSEERROR("InvalidParameter.RequestParseError");
     
    private String value;
    private TcexErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

