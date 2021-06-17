package com.tencentcloudapi.yunsou.v20191115;
public enum YunsouErrorCode {
    // 查询用户信息失败。
     FAILEDOPERATION_ACCOUNTINFO("FailedOperation.AccountInfo"),
     
    // 查询应用信息失败。
     FAILEDOPERATION_APPINFO("FailedOperation.AppInfo"),
     
    // 搜索接口异常。
     FAILEDOPERATION_SEARCH("FailedOperation.Search"),
     
    // 数据上传异常。
     FAILEDOPERATION_UPLOADDATAAPIFAIL("FailedOperation.UploadDataApiFail"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 数据文件无效。
     INVALIDPARAMETER_DATACONTENT("InvalidParameter.DataContent"),
     
    // 请求的次数超过了频率限制。
     LIMITEXCEEDED_SEARCH("LimitExceeded.Search"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private YunsouErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

