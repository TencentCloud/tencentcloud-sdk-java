package com.tencentcloudapi.chc.v20230418;
public enum ChcErrorCode {
     /* 结束时间必须大于起始时间 */
     INVALIDPARAMETERVALUE_ENDTIMELOWERTHANSTARTTIME("InvalidParameterValue.EndTimeLowerThanStartTime"),
     
     /* 时间格式不符合规范 */
     INVALIDPARAMETERVALUE_INVALIDTIMEFORMAT("InvalidParameterValue.InvalidTimeFormat"),
     
     /* 非法的工单类型 */
     INVALIDPARAMETERVALUE_INVALIDWORKORDERTYPE("InvalidParameterValue.InvalidWorkOrderType");
     
    private String value;
    private ChcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

