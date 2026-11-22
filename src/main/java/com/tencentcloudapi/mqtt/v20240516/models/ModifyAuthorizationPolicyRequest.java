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

public class ModifyAuthorizationPolicyRequest extends AbstractModel {

    /**
    * <p>授权策略ID，从 <a href="https://cloud.tencent.com/document/product/1778/111074">查询授权策略</a> 接口获取</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>策略版本,默认为1，当前仅支持1</p>
    */
    @SerializedName("PolicyVersion")
    @Expose
    private Long PolicyVersion;

    /**
    * <p>策略优先级，越小越优先，不能重复</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>决策：<br>allow 允许<br>deny 拒绝</p>
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * <p>操作,支持多选，多个操作用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>connect：连接<br>pub：发布<br>sub：订阅</p>
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * <p>资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * <p>条件-用户名</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>条件-保留消息<br>1,匹配保留消息；<br>2,匹配非保留消息，<br>3.匹配保留和非保留消息</p>
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * <p>条件：客户端ID，支持正则</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>条件：客户端IP地址，支持IP或者CIDR</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>条件：服务质量<br>0：最多一次<br>1：最少一次<br>2：精确一次</p>
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * <p>备注信息，最长 128 字符</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>授权资源列表，支持函数表达式</p>
    */
    @SerializedName("ResourceItems")
    @Expose
    private String [] ResourceItems;

    /**
     * Get <p>授权策略ID，从 <a href="https://cloud.tencent.com/document/product/1778/111074">查询授权策略</a> 接口获取</p> 
     * @return Id <p>授权策略ID，从 <a href="https://cloud.tencent.com/document/product/1778/111074">查询授权策略</a> 接口获取</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>授权策略ID，从 <a href="https://cloud.tencent.com/document/product/1778/111074">查询授权策略</a> 接口获取</p>
     * @param Id <p>授权策略ID，从 <a href="https://cloud.tencent.com/document/product/1778/111074">查询授权策略</a> 接口获取</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。</p> 
     * @return PolicyName <p>策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。</p>
     * @param PolicyName <p>策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>策略版本,默认为1，当前仅支持1</p> 
     * @return PolicyVersion <p>策略版本,默认为1，当前仅支持1</p>
     */
    public Long getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set <p>策略版本,默认为1，当前仅支持1</p>
     * @param PolicyVersion <p>策略版本,默认为1，当前仅支持1</p>
     */
    public void setPolicyVersion(Long PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    /**
     * Get <p>策略优先级，越小越优先，不能重复</p> 
     * @return Priority <p>策略优先级，越小越优先，不能重复</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>策略优先级，越小越优先，不能重复</p>
     * @param Priority <p>策略优先级，越小越优先，不能重复</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>决策：<br>allow 允许<br>deny 拒绝</p> 
     * @return Effect <p>决策：<br>allow 允许<br>deny 拒绝</p>
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set <p>决策：<br>allow 允许<br>deny 拒绝</p>
     * @param Effect <p>决策：<br>allow 允许<br>deny 拒绝</p>
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get <p>操作,支持多选，多个操作用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>connect：连接<br>pub：发布<br>sub：订阅</p> 
     * @return Actions <p>操作,支持多选，多个操作用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>connect：连接<br>pub：发布<br>sub：订阅</p>
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set <p>操作,支持多选，多个操作用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>connect：连接<br>pub：发布<br>sub：订阅</p>
     * @param Actions <p>操作,支持多选，多个操作用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。<br>connect：连接<br>pub：发布<br>sub：订阅</p>
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get <p>资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p> 
     * @return Resources <p>资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     * @param Resources <p>资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 <a href="https://cloud.tencent.com/document/product/1778/109715">数据面授权策略说明</a>。</p>
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>条件-用户名</p> 
     * @return Username <p>条件-用户名</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>条件-用户名</p>
     * @param Username <p>条件-用户名</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>条件-保留消息<br>1,匹配保留消息；<br>2,匹配非保留消息，<br>3.匹配保留和非保留消息</p> 
     * @return Retain <p>条件-保留消息<br>1,匹配保留消息；<br>2,匹配非保留消息，<br>3.匹配保留和非保留消息</p>
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set <p>条件-保留消息<br>1,匹配保留消息；<br>2,匹配非保留消息，<br>3.匹配保留和非保留消息</p>
     * @param Retain <p>条件-保留消息<br>1,匹配保留消息；<br>2,匹配非保留消息，<br>3.匹配保留和非保留消息</p>
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get <p>条件：客户端ID，支持正则</p> 
     * @return ClientId <p>条件：客户端ID，支持正则</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>条件：客户端ID，支持正则</p>
     * @param ClientId <p>条件：客户端ID，支持正则</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>条件：客户端IP地址，支持IP或者CIDR</p> 
     * @return Ip <p>条件：客户端IP地址，支持IP或者CIDR</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>条件：客户端IP地址，支持IP或者CIDR</p>
     * @param Ip <p>条件：客户端IP地址，支持IP或者CIDR</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>条件：服务质量<br>0：最多一次<br>1：最少一次<br>2：精确一次</p> 
     * @return Qos <p>条件：服务质量<br>0：最多一次<br>1：最少一次<br>2：精确一次</p>
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set <p>条件：服务质量<br>0：最多一次<br>1：最少一次<br>2：精确一次</p>
     * @param Qos <p>条件：服务质量<br>0：最多一次<br>1：最少一次<br>2：精确一次</p>
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>备注信息，最长 128 字符</p> 
     * @return Remark <p>备注信息，最长 128 字符</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息，最长 128 字符</p>
     * @param Remark <p>备注信息，最长 128 字符</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>授权资源列表，支持函数表达式</p> 
     * @return ResourceItems <p>授权资源列表，支持函数表达式</p>
     */
    public String [] getResourceItems() {
        return this.ResourceItems;
    }

    /**
     * Set <p>授权资源列表，支持函数表达式</p>
     * @param ResourceItems <p>授权资源列表，支持函数表达式</p>
     */
    public void setResourceItems(String [] ResourceItems) {
        this.ResourceItems = ResourceItems;
    }

    public ModifyAuthorizationPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuthorizationPolicyRequest(ModifyAuthorizationPolicyRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new Long(source.PolicyVersion);
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
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Retain != null) {
            this.Retain = new Long(source.Retain);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ResourceItems != null) {
            this.ResourceItems = new String[source.ResourceItems.length];
            for (int i = 0; i < source.ResourceItems.length; i++) {
                this.ResourceItems[i] = new String(source.ResourceItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "ResourceItems.", this.ResourceItems);

    }
}

