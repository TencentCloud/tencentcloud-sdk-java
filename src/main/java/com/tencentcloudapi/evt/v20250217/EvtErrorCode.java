package com.tencentcloudapi.evt.v20250217;
public enum EvtErrorCode {
     /* 数据源事件没配置数据源插件 */
     FAILEDOPERATION_DATASOURCEEVENTPLUGINNOTCONFIGURED("FailedOperation.DatasourceEventPluginNotConfigured"),
     
     /* 事件MessageConfig配置缺失 */
     FAILEDOPERATION_MESSAGECONFIGNOTCONFIGURED("FailedOperation.MessageConfigNotConfigured"),
     
     /* 数据源事件不支持通过EventId触发 */
     INVALIDPARAMETERVALUE_DATASOURCETRIGGERBYEVENTIDNOTSUPPORTED("InvalidParameterValue.DatasourceTriggerByEventIdNotSupported");
     
    private String value;
    private EvtErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

