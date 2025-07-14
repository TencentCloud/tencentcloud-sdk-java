package com.tencentcloudapi.monitor.v20230616;
public enum MonitorErrorCode {
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private MonitorErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

