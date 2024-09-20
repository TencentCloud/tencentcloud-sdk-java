package com.tencentcloudapi.mqtt.v20240516;
public enum MqttErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // ResourceNotFound.Instance
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance");
     
    private String value;
    private MqttErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

