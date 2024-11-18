/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationPolicyItem extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 规则名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 规则语法版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 越小越优先
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * allow/deny
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * connect、pub、sub
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * 资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * client
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 0，1，2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * 1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 1713164969433
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 1713164969433
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 规则名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName 规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 规则名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 规则语法版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 规则语法版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 规则语法版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 规则语法版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 越小越优先
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 越小越优先
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 越小越优先
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 越小越优先
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get allow/deny
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Effect allow/deny
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set allow/deny
注意：此字段可能返回 null，表示取不到有效值。
     * @param Effect allow/deny
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get connect、pub、sub
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions connect、pub、sub
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set connect、pub、sub
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions connect、pub、sub
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set 资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get client
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId client
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set client
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId client
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 0，1，2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qos 0，1，2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 0，1，2
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qos 0，1，2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Retain 1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set 1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Retain 1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 1713164969433 
     * @return CreatedTime 1713164969433
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 1713164969433
     * @param CreatedTime 1713164969433
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 1713164969433 
     * @return UpdateTime 1713164969433
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 1713164969433
     * @param UpdateTime 1713164969433
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AuthorizationPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationPolicyItem(AuthorizationPolicyItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
        if (source.Actions != null) {
            this.Actions = new String(source.Actions);
        }
        if (source.Resources != null) {
            this.Resources = new String(source.Resources);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.Retain != null) {
            this.Retain = new Long(source.Retain);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

