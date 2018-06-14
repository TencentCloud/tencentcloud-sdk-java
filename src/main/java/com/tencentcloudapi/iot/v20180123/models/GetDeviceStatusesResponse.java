package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetDeviceStatusesResponse  extends AbstractModel{


    /**
    * 设备状态列表
    */
    @SerializedName("DeviceStatuses")
    @Expose
    private DeviceStatus [] DeviceStatuses;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取设备状态列表
     * @return DeviceStatuses 设备状态列表
     */
    public DeviceStatus [] getDeviceStatuses() {
        return this.DeviceStatuses;
    }

    /**
     * 设置设备状态列表
     * @param DeviceStatuses 设备状态列表
     */
    public void setDeviceStatuses(DeviceStatus [] DeviceStatuses) {
        this.DeviceStatuses = DeviceStatuses;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DeviceStatuses.", this.DeviceStatuses);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

