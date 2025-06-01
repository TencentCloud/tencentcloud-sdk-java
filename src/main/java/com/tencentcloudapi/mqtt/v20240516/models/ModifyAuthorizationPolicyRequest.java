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

public class ModifyAuthorizationPolicyRequest extends AbstractModel {

    /**
    * 授权策略ID，从 [查询授权策略](https://cloud.tencent.com/document/product/1778/111074) 接口获取
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略版本,默认为1，当前仅支持1
    */
    @SerializedName("PolicyVersion")
    @Expose
    private Long PolicyVersion;

    /**
    * 策略优先级，越小越优先，不能重复
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 决策：
allow 允许
deny 拒绝
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * 操作,支持多选，多个操作用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
connect：连接
pub：发布
sub：订阅
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * 资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * 条件-用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 条件-保留消息
1,匹配保留消息；
2,匹配非保留消息，
3.匹配保留和非保留消息
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * 条件：客户端ID，支持正则
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 条件：客户端IP地址，支持IP或者CIDR
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 条件：服务质量
0：最多一次
1：最少一次
2：精确一次
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * 备注信息，最长 128 字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 授权策略ID，从 [查询授权策略](https://cloud.tencent.com/document/product/1778/111074) 接口获取 
     * @return Id 授权策略ID，从 [查询授权策略](https://cloud.tencent.com/document/product/1778/111074) 接口获取
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 授权策略ID，从 [查询授权策略](https://cloud.tencent.com/document/product/1778/111074) 接口获取
     * @param Id 授权策略ID，从 [查询授权策略](https://cloud.tencent.com/document/product/1778/111074) 接口获取
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。

     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。 
     * @return PolicyName 策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。
     * @param PolicyName 策略名称，不能为空，3-64个字符，支持中文、字母、数字、“-”及“_”。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略版本,默认为1，当前仅支持1 
     * @return PolicyVersion 策略版本,默认为1，当前仅支持1
     */
    public Long getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set 策略版本,默认为1，当前仅支持1
     * @param PolicyVersion 策略版本,默认为1，当前仅支持1
     */
    public void setPolicyVersion(Long PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    /**
     * Get 策略优先级，越小越优先，不能重复 
     * @return Priority 策略优先级，越小越优先，不能重复
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 策略优先级，越小越优先，不能重复
     * @param Priority 策略优先级，越小越优先，不能重复
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 决策：
allow 允许
deny 拒绝 
     * @return Effect 决策：
allow 允许
deny 拒绝
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set 决策：
allow 允许
deny 拒绝
     * @param Effect 决策：
allow 允许
deny 拒绝
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get 操作,支持多选，多个操作用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
connect：连接
pub：发布
sub：订阅 
     * @return Actions 操作,支持多选，多个操作用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
connect：连接
pub：发布
sub：订阅
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set 操作,支持多选，多个操作用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
connect：连接
pub：发布
sub：订阅
     * @param Actions 操作,支持多选，多个操作用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
connect：连接
pub：发布
sub：订阅
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。
 
     * @return Resources 资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set 资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

     * @param Resources 资源，需要匹配的订阅，支持配置多条匹配规则，多个用英文逗号隔开。可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)。

     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 条件-用户名 
     * @return Username 条件-用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 条件-用户名
     * @param Username 条件-用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 条件-保留消息
1,匹配保留消息；
2,匹配非保留消息，
3.匹配保留和非保留消息 
     * @return Retain 条件-保留消息
1,匹配保留消息；
2,匹配非保留消息，
3.匹配保留和非保留消息
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set 条件-保留消息
1,匹配保留消息；
2,匹配非保留消息，
3.匹配保留和非保留消息
     * @param Retain 条件-保留消息
1,匹配保留消息；
2,匹配非保留消息，
3.匹配保留和非保留消息
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get 条件：客户端ID，支持正则 
     * @return ClientId 条件：客户端ID，支持正则
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 条件：客户端ID，支持正则
     * @param ClientId 条件：客户端ID，支持正则
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 条件：客户端IP地址，支持IP或者CIDR 
     * @return Ip 条件：客户端IP地址，支持IP或者CIDR
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 条件：客户端IP地址，支持IP或者CIDR
     * @param Ip 条件：客户端IP地址，支持IP或者CIDR
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 条件：服务质量
0：最多一次
1：最少一次
2：精确一次 
     * @return Qos 条件：服务质量
0：最多一次
1：最少一次
2：精确一次
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 条件：服务质量
0：最多一次
1：最少一次
2：精确一次
     * @param Qos 条件：服务质量
0：最多一次
1：最少一次
2：精确一次
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 备注信息，最长 128 字符 
     * @return Remark 备注信息，最长 128 字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，最长 128 字符
     * @param Remark 备注信息，最长 128 字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    }
}

