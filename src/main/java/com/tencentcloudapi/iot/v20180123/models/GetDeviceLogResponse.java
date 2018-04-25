package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetDeviceLogResponse  extends AbstractModel{


    /**
    * 设备日志
    */
    @SerializedName("DeviceLog")
    @Expose
    private Object [] DeviceLog;
    

    /**
    * 查询游标
    */
    @SerializedName("ScrollId")
    @Expose
    private String [] ScrollId;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取设备日志
     * @return DeviceLog 设备日志
     */
    public Object [] getDeviceLog() {
        return this.DeviceLog;
    }

    /**
     * 设置设备日志
     * @param DeviceLog 设备日志
     */
    public void setDeviceLog(Object [] DeviceLog) {
        this.DeviceLog = DeviceLog;
    }

    /**
     * 获取查询游标
     * @return ScrollId 查询游标
     */
    public String [] getScrollId() {
        return this.ScrollId;
    }

    /**
     * 设置查询游标
     * @param ScrollId 查询游标
     */
    public void setScrollId(String [] ScrollId) {
        this.ScrollId = ScrollId;
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
        this.setParamArrayObj(map, prefix + "DeviceLog.", this.DeviceLog);
        this.setParamArraySimple(map, prefix + "ScrollId.", this.ScrollId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

