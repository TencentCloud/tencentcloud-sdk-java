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
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Remote Write任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网络类型
1: 内网
2:外网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 私有网络id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 任务运行状态
1: 运行中
2:暂停
3: 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 目标服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 目标地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteWriteURL")
    @Expose
    private String RemoteWriteURL;

    /**
    * 鉴权类型
0: 无鉴权 1: basic_auth 2: token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 鉴权信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * 日志集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 后端服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Remote Write任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Remote Write任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Remote Write任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Remote Write任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网络类型
1: 内网
2:外网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType 网络类型
1: 内网
2:外网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型
1: 内网
2:外网
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType 网络类型
1: 内网
2:外网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 私有网络id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 任务运行状态
1: 运行中
2:暂停
3: 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务运行状态
1: 运行中
2:暂停
3: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务运行状态
1: 运行中
2:暂停
3: 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务运行状态
1: 运行中
2:暂停
3: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 目标服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Target 目标服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Target 目标服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 目标地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteWriteURL 目标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteWriteURL() {
        return this.RemoteWriteURL;
    }

    /**
     * Set 目标地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteWriteURL 目标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteWriteURL(String RemoteWriteURL) {
        this.RemoteWriteURL = RemoteWriteURL;
    }

    /**
     * Get 鉴权类型
0: 无鉴权 1: basic_auth 2: token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType 鉴权类型
0: 无鉴权 1: basic_auth 2: token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 鉴权类型
0: 无鉴权 1: basic_auth 2: token
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType 鉴权类型
0: 无鉴权 1: basic_auth 2: token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 鉴权信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthInfo 鉴权信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteWriteAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set 鉴权信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthInfo 鉴权信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthInfo(RemoteWriteAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get 日志集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetId 日志集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetId 日志集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 后端服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualGatewayType 后端服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set 后端服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualGatewayType 后端服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
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

    }
}

