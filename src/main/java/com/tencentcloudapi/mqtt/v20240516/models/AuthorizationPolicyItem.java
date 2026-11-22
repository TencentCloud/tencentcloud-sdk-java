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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationPolicyItem extends AbstractModel {

    /**
    * <p>策略规则ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>MQTT集群ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>策略规则名</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>规则语法版本，当前仅支持1，默认为1</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>策略优先级，优先级ID越小表示策略越优先检查生效。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>决策<br>allow：允许符合该策略的设备的访问请求。<br>deny：拒绝覆盖该策略的设备的访问请求。<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * <p>操作<br>connect：连接<br>pub：发布mqtt消息<br>sub：订阅mqtt消息<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * <p>资源，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * <p>条件-连接设备ID，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>授权资源，支持函数表达式</p>
    */
    @SerializedName("ResourceItems")
    @Expose
    private String [] ResourceItems;

    /**
    * <p>条件-用户名，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>条件-客户端IP地址，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>条件-服务质量，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * <p>条件-保留消息，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>1：表示匹配retain消息<br>2：表示匹配非retain消息<br>3：表示匹配retain和非retain消息</p>
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * <p>备注，长度不超过128个字符。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间。毫秒级时间戳 。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * <p>更新时间。毫秒级时间戳 。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>策略规则ID</p> 
     * @return Id <p>策略规则ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>策略规则ID</p>
     * @param Id <p>策略规则ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>MQTT集群ID</p> 
     * @return InstanceId <p>MQTT集群ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>MQTT集群ID</p>
     * @param InstanceId <p>MQTT集群ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>策略规则名</p> 
     * @return PolicyName <p>策略规则名</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>策略规则名</p>
     * @param PolicyName <p>策略规则名</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>规则语法版本，当前仅支持1，默认为1</p> 
     * @return Version <p>规则语法版本，当前仅支持1，默认为1</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>规则语法版本，当前仅支持1，默认为1</p>
     * @param Version <p>规则语法版本，当前仅支持1，默认为1</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>策略优先级，优先级ID越小表示策略越优先检查生效。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Priority <p>策略优先级，优先级ID越小表示策略越优先检查生效。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>策略优先级，优先级ID越小表示策略越优先检查生效。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Priority <p>策略优先级，优先级ID越小表示策略越优先检查生效。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>决策<br>allow：允许符合该策略的设备的访问请求。<br>deny：拒绝覆盖该策略的设备的访问请求。<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Effect <p>决策<br>allow：允许符合该策略的设备的访问请求。<br>deny：拒绝覆盖该策略的设备的访问请求。<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set <p>决策<br>allow：允许符合该策略的设备的访问请求。<br>deny：拒绝覆盖该策略的设备的访问请求。<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Effect <p>决策<br>allow：允许符合该策略的设备的访问请求。<br>deny：拒绝覆盖该策略的设备的访问请求。<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get <p>操作<br>connect：连接<br>pub：发布mqtt消息<br>sub：订阅mqtt消息<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Actions <p>操作<br>connect：连接<br>pub：发布mqtt消息<br>sub：订阅mqtt消息<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set <p>操作<br>connect：连接<br>pub：发布mqtt消息<br>sub：订阅mqtt消息<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Actions <p>操作<br>connect：连接<br>pub：发布mqtt消息<br>sub：订阅mqtt消息<br>可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get <p>资源，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Resources <p>资源，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Resources <p>资源，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>条件-连接设备ID，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return ClientId <p>条件-连接设备ID，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>条件-连接设备ID，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param ClientId <p>条件-连接设备ID，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>授权资源，支持函数表达式</p> 
     * @return ResourceItems <p>授权资源，支持函数表达式</p>
     */
    public String [] getResourceItems() {
        return this.ResourceItems;
    }

    /**
     * Set <p>授权资源，支持函数表达式</p>
     * @param ResourceItems <p>授权资源，支持函数表达式</p>
     */
    public void setResourceItems(String [] ResourceItems) {
        this.ResourceItems = ResourceItems;
    }

    /**
     * Get <p>条件-用户名，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Username <p>条件-用户名，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>条件-用户名，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Username <p>条件-用户名，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>条件-客户端IP地址，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Ip <p>条件-客户端IP地址，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>条件-客户端IP地址，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Ip <p>条件-客户端IP地址，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>条件-服务质量，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Qos <p>条件-服务质量，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set <p>条件-服务质量，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Qos <p>条件-服务质量，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>条件-保留消息，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>1：表示匹配retain消息<br>2：表示匹配非retain消息<br>3：表示匹配retain和非retain消息</p> 
     * @return Retain <p>条件-保留消息，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>1：表示匹配retain消息<br>2：表示匹配非retain消息<br>3：表示匹配retain和非retain消息</p>
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set <p>条件-保留消息，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>1：表示匹配retain消息<br>2：表示匹配非retain消息<br>3：表示匹配retain和非retain消息</p>
     * @param Retain <p>条件-保留消息，可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>1：表示匹配retain消息<br>2：表示匹配非retain消息<br>3：表示匹配retain和非retain消息</p>
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get <p>备注，长度不超过128个字符。</p> 
     * @return Remark <p>备注，长度不超过128个字符。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注，长度不超过128个字符。</p>
     * @param Remark <p>备注，长度不超过128个字符。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间。毫秒级时间戳 。</p> 
     * @return CreatedTime <p>创建时间。毫秒级时间戳 。</p>
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。毫秒级时间戳 。</p>
     * @param CreatedTime <p>创建时间。毫秒级时间戳 。</p>
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间。毫秒级时间戳 。</p> 
     * @return UpdateTime <p>更新时间。毫秒级时间戳 。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间。毫秒级时间戳 。</p>
     * @param UpdateTime <p>更新时间。毫秒级时间戳 。</p>
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
        if (source.ResourceItems != null) {
            this.ResourceItems = new String[source.ResourceItems.length];
            for (int i = 0; i < source.ResourceItems.length; i++) {
                this.ResourceItems[i] = new String(source.ResourceItems[i]);
            }
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
        this.setParamArraySimple(map, prefix + "ResourceItems.", this.ResourceItems);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

