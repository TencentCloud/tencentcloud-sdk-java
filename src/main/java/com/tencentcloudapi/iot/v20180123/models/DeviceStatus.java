package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeviceStatus  extends AbstractModel{


    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;
    

    /**
    * 设备状态（inactive, online, offline）
    */
    @SerializedName("Status")
    @Expose
    private String Status;
    

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取设备状态（inactive, online, offline）
     * @return Status 设备状态（inactive, online, offline）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置设备状态（inactive, online, offline）
     * @param Status 设备状态（inactive, online, offline）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

