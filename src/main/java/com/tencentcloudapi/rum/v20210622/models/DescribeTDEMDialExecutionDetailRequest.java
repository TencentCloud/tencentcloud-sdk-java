/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMDialExecutionDetailRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间，毫秒时间戳</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，毫秒时间戳，必须大于 StartTime</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>任务 ID。不传表示不过滤。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>拨测批次 ID</p>
    */
    @SerializedName("TaskSessionId")
    @Expose
    private String TaskSessionId;

    /**
    * <p>客户端平台。不传表示不过滤。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>应用版本。不传表示不过滤。</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>设备机型，对应 device_type。不传表示不过滤。</p>
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * <p>网络类型，对应 network_type。不传表示不过滤。</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>客户端运营商，对应 isp。不传表示不过滤。不是目标 IP 运营商。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>客户端地区，对应 province。云 API 公共参数已占用 Region，筛选入参名为 ClientRegion。不传表示不过滤。不是目标 IP 地区。</p>
    */
    @SerializedName("ClientRegion")
    @Expose
    private String ClientRegion;

    /**
    * <p>目标 IP。不传表示不过滤。</p>
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * <p>环境。可选。不传表示不过滤。</p>
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间，毫秒时间戳</p> 
     * @return StartTime <p>开始时间，毫秒时间戳</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，毫秒时间戳</p>
     * @param StartTime <p>开始时间，毫秒时间戳</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，毫秒时间戳，必须大于 StartTime</p> 
     * @return EndTime <p>结束时间，毫秒时间戳，必须大于 StartTime</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，毫秒时间戳，必须大于 StartTime</p>
     * @param EndTime <p>结束时间，毫秒时间戳，必须大于 StartTime</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务 ID。不传表示不过滤。</p> 
     * @return TaskId <p>任务 ID。不传表示不过滤。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID。不传表示不过滤。</p>
     * @param TaskId <p>任务 ID。不传表示不过滤。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>拨测批次 ID</p> 
     * @return TaskSessionId <p>拨测批次 ID</p>
     */
    public String getTaskSessionId() {
        return this.TaskSessionId;
    }

    /**
     * Set <p>拨测批次 ID</p>
     * @param TaskSessionId <p>拨测批次 ID</p>
     */
    public void setTaskSessionId(String TaskSessionId) {
        this.TaskSessionId = TaskSessionId;
    }

    /**
     * Get <p>客户端平台。不传表示不过滤。</p> 
     * @return Platform <p>客户端平台。不传表示不过滤。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>客户端平台。不传表示不过滤。</p>
     * @param Platform <p>客户端平台。不传表示不过滤。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>应用版本。不传表示不过滤。</p> 
     * @return AppVersion <p>应用版本。不传表示不过滤。</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用版本。不传表示不过滤。</p>
     * @param AppVersion <p>应用版本。不传表示不过滤。</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>设备机型，对应 device_type。不传表示不过滤。</p> 
     * @return Device <p>设备机型，对应 device_type。不传表示不过滤。</p>
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set <p>设备机型，对应 device_type。不传表示不过滤。</p>
     * @param Device <p>设备机型，对应 device_type。不传表示不过滤。</p>
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get <p>网络类型，对应 network_type。不传表示不过滤。</p> 
     * @return NetType <p>网络类型，对应 network_type。不传表示不过滤。</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型，对应 network_type。不传表示不过滤。</p>
     * @param NetType <p>网络类型，对应 network_type。不传表示不过滤。</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>客户端运营商，对应 isp。不传表示不过滤。不是目标 IP 运营商。</p> 
     * @return Operator <p>客户端运营商，对应 isp。不传表示不过滤。不是目标 IP 运营商。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>客户端运营商，对应 isp。不传表示不过滤。不是目标 IP 运营商。</p>
     * @param Operator <p>客户端运营商，对应 isp。不传表示不过滤。不是目标 IP 运营商。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>客户端地区，对应 province。云 API 公共参数已占用 Region，筛选入参名为 ClientRegion。不传表示不过滤。不是目标 IP 地区。</p> 
     * @return ClientRegion <p>客户端地区，对应 province。云 API 公共参数已占用 Region，筛选入参名为 ClientRegion。不传表示不过滤。不是目标 IP 地区。</p>
     */
    public String getClientRegion() {
        return this.ClientRegion;
    }

    /**
     * Set <p>客户端地区，对应 province。云 API 公共参数已占用 Region，筛选入参名为 ClientRegion。不传表示不过滤。不是目标 IP 地区。</p>
     * @param ClientRegion <p>客户端地区，对应 province。云 API 公共参数已占用 Region，筛选入参名为 ClientRegion。不传表示不过滤。不是目标 IP 地区。</p>
     */
    public void setClientRegion(String ClientRegion) {
        this.ClientRegion = ClientRegion;
    }

    /**
     * Get <p>目标 IP。不传表示不过滤。</p> 
     * @return TargetIp <p>目标 IP。不传表示不过滤。</p>
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set <p>目标 IP。不传表示不过滤。</p>
     * @param TargetIp <p>目标 IP。不传表示不过滤。</p>
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get <p>环境。可选。不传表示不过滤。</p> 
     * @return Environment <p>环境。可选。不传表示不过滤。</p>
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set <p>环境。可选。不传表示不过滤。</p>
     * @param Environment <p>环境。可选。不传表示不过滤。</p>
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public DescribeTDEMDialExecutionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMDialExecutionDetailRequest(DescribeTDEMDialExecutionDetailRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskSessionId != null) {
            this.TaskSessionId = new String(source.TaskSessionId);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.ClientRegion != null) {
            this.ClientRegion = new String(source.ClientRegion);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskSessionId", this.TaskSessionId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ClientRegion", this.ClientRegion);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

