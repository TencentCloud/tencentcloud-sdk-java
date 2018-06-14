package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetDeviceDataResponse  extends AbstractModel{


    /**
    * 设备数据
    */
    @SerializedName("DeviceData")
    @Expose
    private Object DeviceData;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取设备数据
     * @return DeviceData 设备数据
     */
    public Object getDeviceData() {
        return this.DeviceData;
    }

    /**
     * 设置设备数据
     * @param DeviceData 设备数据
     */
    public void setDeviceData(Object DeviceData) {
        this.DeviceData = DeviceData;
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
        this.setParamObj(map, prefix + "DeviceData.", this.DeviceData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

