package com.tencentcloudapi.cws.v20180312;
public enum CwsErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // url已经添加。
     INVALIDPARAMETER_DUPLICATE("InvalidParameter.Duplicate"),
     
    // 错误的数据格式。
     INVALIDPARAMETER_MALFORMED("InvalidParameter.Malformed"),
     
    // 请求的数据不存在。
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
    // 站点已添加至其他监控，不能重复添加。
     LIMITEXCEEDED_MONITORQUOTA("LimitExceeded.MonitorQuota"),
     
    // 超出购买的扫描次数。
     LIMITEXCEEDED_SCANQUOTA("LimitExceeded.ScanQuota"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private CwsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

