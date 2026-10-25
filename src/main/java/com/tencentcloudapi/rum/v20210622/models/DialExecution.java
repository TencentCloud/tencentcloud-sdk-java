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

public class DialExecution extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称。任务已删除时仍返回当时名称，找不到则为空。</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>拨测批次 ID</p>
    */
    @SerializedName("TaskSessionId")
    @Expose
    private String TaskSessionId;

    /**
    * <p>批次开始时间，毫秒时间戳</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>客户端平台</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>应用版本</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>设备机型</p>
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * <p>网络类型</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>客户端运营商。不是目标 IP 运营商。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>客户端地区。不是目标 IP 地区。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>本批次探测到的目标 IP，顺序与 TargetIpGeo 一致</p>
    */
    @SerializedName("TargetIps")
    @Expose
    private String [] TargetIps;

    /**
    * <p>每个目标 IP 的地区和运营商</p>
    */
    @SerializedName("TargetIpGeo")
    @Expose
    private DialTargetIpGeo [] TargetIpGeo;

    /**
    * <p>本批次是否全部探测成功</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * <p>本批次是否未实际探测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotProbed")
    @Expose
    private Boolean NotProbed;

    /**
    * <p>本批次成功目标的平均时延，单位毫秒</p>
    */
    @SerializedName("AvgDuration")
    @Expose
    private Float AvgDuration;

    /**
    * <p>本批次是否包含路由追踪</p>
    */
    @SerializedName("HasMTR")
    @Expose
    private Boolean HasMTR;

    /**
    * <p>所属用户会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称。任务已删除时仍返回当时名称，找不到则为空。</p> 
     * @return TaskName <p>任务名称。任务已删除时仍返回当时名称，找不到则为空。</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称。任务已删除时仍返回当时名称，找不到则为空。</p>
     * @param TaskName <p>任务名称。任务已删除时仍返回当时名称，找不到则为空。</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get <p>批次开始时间，毫秒时间戳</p> 
     * @return StartTime <p>批次开始时间，毫秒时间戳</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>批次开始时间，毫秒时间戳</p>
     * @param StartTime <p>批次开始时间，毫秒时间戳</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>客户端平台</p> 
     * @return Platform <p>客户端平台</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>客户端平台</p>
     * @param Platform <p>客户端平台</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>应用版本</p> 
     * @return AppVersion <p>应用版本</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用版本</p>
     * @param AppVersion <p>应用版本</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>设备机型</p> 
     * @return Device <p>设备机型</p>
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set <p>设备机型</p>
     * @param Device <p>设备机型</p>
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get <p>网络类型</p> 
     * @return NetType <p>网络类型</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型</p>
     * @param NetType <p>网络类型</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>客户端运营商。不是目标 IP 运营商。</p> 
     * @return Operator <p>客户端运营商。不是目标 IP 运营商。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>客户端运营商。不是目标 IP 运营商。</p>
     * @param Operator <p>客户端运营商。不是目标 IP 运营商。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>客户端地区。不是目标 IP 地区。</p> 
     * @return Region <p>客户端地区。不是目标 IP 地区。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>客户端地区。不是目标 IP 地区。</p>
     * @param Region <p>客户端地区。不是目标 IP 地区。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>本批次探测到的目标 IP，顺序与 TargetIpGeo 一致</p> 
     * @return TargetIps <p>本批次探测到的目标 IP，顺序与 TargetIpGeo 一致</p>
     */
    public String [] getTargetIps() {
        return this.TargetIps;
    }

    /**
     * Set <p>本批次探测到的目标 IP，顺序与 TargetIpGeo 一致</p>
     * @param TargetIps <p>本批次探测到的目标 IP，顺序与 TargetIpGeo 一致</p>
     */
    public void setTargetIps(String [] TargetIps) {
        this.TargetIps = TargetIps;
    }

    /**
     * Get <p>每个目标 IP 的地区和运营商</p> 
     * @return TargetIpGeo <p>每个目标 IP 的地区和运营商</p>
     */
    public DialTargetIpGeo [] getTargetIpGeo() {
        return this.TargetIpGeo;
    }

    /**
     * Set <p>每个目标 IP 的地区和运营商</p>
     * @param TargetIpGeo <p>每个目标 IP 的地区和运营商</p>
     */
    public void setTargetIpGeo(DialTargetIpGeo [] TargetIpGeo) {
        this.TargetIpGeo = TargetIpGeo;
    }

    /**
     * Get <p>本批次是否全部探测成功</p> 
     * @return Success <p>本批次是否全部探测成功</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>本批次是否全部探测成功</p>
     * @param Success <p>本批次是否全部探测成功</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get <p>本批次是否未实际探测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotProbed <p>本批次是否未实际探测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNotProbed() {
        return this.NotProbed;
    }

    /**
     * Set <p>本批次是否未实际探测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotProbed <p>本批次是否未实际探测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotProbed(Boolean NotProbed) {
        this.NotProbed = NotProbed;
    }

    /**
     * Get <p>本批次成功目标的平均时延，单位毫秒</p> 
     * @return AvgDuration <p>本批次成功目标的平均时延，单位毫秒</p>
     */
    public Float getAvgDuration() {
        return this.AvgDuration;
    }

    /**
     * Set <p>本批次成功目标的平均时延，单位毫秒</p>
     * @param AvgDuration <p>本批次成功目标的平均时延，单位毫秒</p>
     */
    public void setAvgDuration(Float AvgDuration) {
        this.AvgDuration = AvgDuration;
    }

    /**
     * Get <p>本批次是否包含路由追踪</p> 
     * @return HasMTR <p>本批次是否包含路由追踪</p>
     */
    public Boolean getHasMTR() {
        return this.HasMTR;
    }

    /**
     * Set <p>本批次是否包含路由追踪</p>
     * @param HasMTR <p>本批次是否包含路由追踪</p>
     */
    public void setHasMTR(Boolean HasMTR) {
        this.HasMTR = HasMTR;
    }

    /**
     * Get <p>所属用户会话 ID</p> 
     * @return SessionId <p>所属用户会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>所属用户会话 ID</p>
     * @param SessionId <p>所属用户会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DialExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DialExecution(DialExecution source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskSessionId != null) {
            this.TaskSessionId = new String(source.TaskSessionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TargetIps != null) {
            this.TargetIps = new String[source.TargetIps.length];
            for (int i = 0; i < source.TargetIps.length; i++) {
                this.TargetIps[i] = new String(source.TargetIps[i]);
            }
        }
        if (source.TargetIpGeo != null) {
            this.TargetIpGeo = new DialTargetIpGeo[source.TargetIpGeo.length];
            for (int i = 0; i < source.TargetIpGeo.length; i++) {
                this.TargetIpGeo[i] = new DialTargetIpGeo(source.TargetIpGeo[i]);
            }
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.NotProbed != null) {
            this.NotProbed = new Boolean(source.NotProbed);
        }
        if (source.AvgDuration != null) {
            this.AvgDuration = new Float(source.AvgDuration);
        }
        if (source.HasMTR != null) {
            this.HasMTR = new Boolean(source.HasMTR);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskSessionId", this.TaskSessionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "TargetIps.", this.TargetIps);
        this.setParamArrayObj(map, prefix + "TargetIpGeo.", this.TargetIpGeo);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "NotProbed", this.NotProbed);
        this.setParamSimple(map, prefix + "AvgDuration", this.AvgDuration);
        this.setParamSimple(map, prefix + "HasMTR", this.HasMTR);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

