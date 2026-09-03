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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteWriteInfo extends AbstractModel {

    /**
    * <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Remote Write任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>网络类型<br>1: 内网<br>2:外网</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>私有网络id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>任务运行状态<br>1: 运行中<br>2:暂停<br>3: 失败</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>目标服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>目标地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteWriteURL")
    @Expose
    private String RemoteWriteURL;

    /**
    * <p>鉴权类型<br>0: 无鉴权 1: basic_auth 2: token</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>鉴权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * <p>日志集</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>后端服务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * <p>云时序数据库实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId <p>日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId <p>日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Remote Write任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>Remote Write任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Remote Write任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>Remote Write任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>网络类型<br>1: 内网<br>2:外网</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType <p>网络类型<br>1: 内网<br>2:外网</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型<br>1: 内网<br>2:外网</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType <p>网络类型<br>1: 内网<br>2:外网</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>私有网络id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>私有网络id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>私有网络id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>任务运行状态<br>1: 运行中<br>2:暂停<br>3: 失败</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>任务运行状态<br>1: 运行中<br>2:暂停<br>3: 失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务运行状态<br>1: 运行中<br>2:暂停<br>3: 失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>任务运行状态<br>1: 运行中<br>2:暂停<br>3: 失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>目标服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Target <p>目标服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Target <p>目标服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>目标地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteWriteURL <p>目标地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteWriteURL() {
        return this.RemoteWriteURL;
    }

    /**
     * Set <p>目标地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteWriteURL <p>目标地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteWriteURL(String RemoteWriteURL) {
        this.RemoteWriteURL = RemoteWriteURL;
    }

    /**
     * Get <p>鉴权类型<br>0: 无鉴权 1: basic_auth 2: token</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType <p>鉴权类型<br>0: 无鉴权 1: basic_auth 2: token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>鉴权类型<br>0: 无鉴权 1: basic_auth 2: token</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType <p>鉴权类型<br>0: 无鉴权 1: basic_auth 2: token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>鉴权信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthInfo <p>鉴权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteWriteAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set <p>鉴权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthInfo <p>鉴权信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthInfo(RemoteWriteAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get <p>日志集</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetId <p>日志集</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetId <p>日志集</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>后端服务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualGatewayType <p>后端服务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set <p>后端服务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualGatewayType <p>后端服务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get <p>云时序数据库实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>云时序数据库实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云时序数据库实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>云时序数据库实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public RemoteWriteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteWriteInfo(RemoteWriteInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.RemoteWriteURL != null) {
            this.RemoteWriteURL = new String(source.RemoteWriteURL);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new RemoteWriteAuthInfo(source.AuthInfo);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RemoteWriteURL", this.RemoteWriteURL);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

