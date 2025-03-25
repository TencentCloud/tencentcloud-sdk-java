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
    * 策略规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * MQTT集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略规则名
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 规则语法版本，当前仅支持1，默认为1
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 策略优先级，优先级ID越小表示策略越优先检查生效。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 决策
allow：允许符合该策略的设备的访问请求。
deny：拒绝覆盖该策略的设备的访问请求。
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * 操作
connect：连接
pub：发布mqtt消息
sub：订阅mqtt消息
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * 资源，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * 条件-连接设备ID，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 条件-用户名，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 条件-客户端IP地址，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 条件-服务质量，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * 条件-保留消息，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * 备注，长度不超过128个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间。毫秒级时间戳 。
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 更新时间。毫秒级时间戳 。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 策略规则ID 
     * @return Id 策略规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 策略规则ID
     * @param Id 策略规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get MQTT集群ID 
     * @return InstanceId MQTT集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set MQTT集群ID
     * @param InstanceId MQTT集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 策略规则名 
     * @return PolicyName 策略规则名
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略规则名
     * @param PolicyName 策略规则名
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 规则语法版本，当前仅支持1，默认为1 
     * @return Version 规则语法版本，当前仅支持1，默认为1
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 规则语法版本，当前仅支持1，默认为1
     * @param Version 规则语法版本，当前仅支持1，默认为1
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 策略优先级，优先级ID越小表示策略越优先检查生效。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return Priority 策略优先级，优先级ID越小表示策略越优先检查生效。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 策略优先级，优先级ID越小表示策略越优先检查生效。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param Priority 策略优先级，优先级ID越小表示策略越优先检查生效。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 决策
allow：允许符合该策略的设备的访问请求。
deny：拒绝覆盖该策略的设备的访问请求。
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return Effect 决策
allow：允许符合该策略的设备的访问请求。
deny：拒绝覆盖该策略的设备的访问请求。
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set 决策
allow：允许符合该策略的设备的访问请求。
deny：拒绝覆盖该策略的设备的访问请求。
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param Effect 决策
allow：允许符合该策略的设备的访问请求。
deny：拒绝覆盖该策略的设备的访问请求。
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get 操作
connect：连接
pub：发布mqtt消息
sub：订阅mqtt消息
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return Actions 操作
connect：连接
pub：发布mqtt消息
sub：订阅mqtt消息
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set 操作
connect：连接
pub：发布mqtt消息
sub：订阅mqtt消息
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param Actions 操作
connect：连接
pub：发布mqtt消息
sub：订阅mqtt消息
可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 资源，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return Resources 资源，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set 资源，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param Resources 资源，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 条件-连接设备ID，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return ClientId 条件-连接设备ID，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 条件-连接设备ID，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param ClientId 条件-连接设备ID，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 条件-用户名，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
 
     * @return Username 条件-用户名，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 条件-用户名，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

     * @param Username 条件-用户名，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 条件-客户端IP地址，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return Ip 条件-客户端IP地址，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 条件-客户端IP地址，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param Ip 条件-客户端IP地址，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 条件-服务质量，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。 
     * @return Qos 条件-服务质量，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 条件-服务质量，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     * @param Qos 条件-服务质量，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 条件-保留消息，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息 
     * @return Retain 条件-保留消息，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set 条件-保留消息，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
     * @param Retain 条件-保留消息，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
1：表示匹配retain消息
2：表示匹配非retain消息
3：表示匹配retain和非retain消息
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get 备注，长度不超过128个字符。 
     * @return Remark 备注，长度不超过128个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，长度不超过128个字符。
     * @param Remark 备注，长度不超过128个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间。毫秒级时间戳 。 
     * @return CreatedTime 创建时间。毫秒级时间戳 。
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。毫秒级时间戳 。
     * @param CreatedTime 创建时间。毫秒级时间戳 。
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间。毫秒级时间戳 。 
     * @return UpdateTime 更新时间。毫秒级时间戳 。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。毫秒级时间戳 。
     * @param UpdateTime 更新时间。毫秒级时间戳 。
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

