package com.tencentcloudapi.monitor.v20230616;
public enum MonitorErrorCode {
     /*         未开通。 */
     FAILEDOPERATION_ERRNOTOPEN("FailedOperation.ErrNotOpen"),
     
     /*         欠费。 */
     FAILEDOPERATION_ERROWED("FailedOperation.ErrOwed"),
     
     /*         内部错误。 */
     INTERNALERROR("InternalError"),
     
     /*         参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /*         操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
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

