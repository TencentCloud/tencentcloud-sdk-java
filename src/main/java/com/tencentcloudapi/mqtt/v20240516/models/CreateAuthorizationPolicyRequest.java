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

public class CreateAuthorizationPolicyRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略版本
    */
    @SerializedName("PolicyVersion")
    @Expose
    private Long PolicyVersion;

    /**
    * 策略优先级，越小越优先
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * allow、deny
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * connect、pub、sub
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * 1,匹配保留消息；2,匹配非保留消息，3.匹配所有消息
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * 0、1、2
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * 资源
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 客户端
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略版本 
     * @return PolicyVersion 策略版本
     */
    public Long getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set 策略版本
     * @param PolicyVersion 策略版本
     */
    public void setPolicyVersion(Long PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    /**
     * Get 策略优先级，越小越优先 
     * @return Priority 策略优先级，越小越优先
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 策略优先级，越小越优先
     * @param Priority 策略优先级，越小越优先
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get allow、deny 
     * @return Effect allow、deny
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set allow、deny
     * @param Effect allow、deny
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get connect、pub、sub 
     * @return Actions connect、pub、sub
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set connect、pub、sub
     * @param Actions connect、pub、sub
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 1,匹配保留消息；2,匹配非保留消息，3.匹配所有消息 
     * @return Retain 1,匹配保留消息；2,匹配非保留消息，3.匹配所有消息
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set 1,匹配保留消息；2,匹配非保留消息，3.匹配所有消息
     * @param Retain 1,匹配保留消息；2,匹配非保留消息，3.匹配所有消息
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get 0、1、2 
     * @return Qos 0、1、2
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 0、1、2
     * @param Qos 0、1、2
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 资源 
     * @return Resources 资源
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set 资源
     * @param Resources 资源
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 客户端 
     * @return ClientId 客户端
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端
     * @param ClientId 客户端
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateAuthorizationPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuthorizationPolicyRequest(CreateAuthorizationPolicyRequest source) {
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
        if (source.Retain != null) {
            this.Retain = new Long(source.Retain);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.Resources != null) {
            this.Resources = new String(source.Resources);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

