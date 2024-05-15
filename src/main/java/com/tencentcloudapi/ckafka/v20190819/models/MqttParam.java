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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MqttParam extends AbstractModel {

    /**
    * 需要同步的MQTT Topic列表, CSV格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topics")
    @Expose
    private String Topics;

    /**
    * MQTT clean-session
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CleanSession")
    @Expose
    private Boolean CleanSession;

    /**
    * MQTT instance-id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * MQTT实例VIP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * MQTT VIP 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * MQTT实例用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * MQTT实例内账户密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * QoS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTasks")
    @Expose
    private Long MaxTasks;

    /**
    * MQTT 实例的Service VIP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * MQTT实例的VPC ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否为自建集群, MQTT只支持非自建集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
     * Get 需要同步的MQTT Topic列表, CSV格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topics 需要同步的MQTT Topic列表, CSV格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopics() {
        return this.Topics;
    }

    /**
     * Set 需要同步的MQTT Topic列表, CSV格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topics 需要同步的MQTT Topic列表, CSV格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopics(String Topics) {
        this.Topics = Topics;
    }

    /**
     * Get MQTT clean-session
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CleanSession MQTT clean-session
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCleanSession() {
        return this.CleanSession;
    }

    /**
     * Set MQTT clean-session
注意：此字段可能返回 null，表示取不到有效值。
     * @param CleanSession MQTT clean-session
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCleanSession(Boolean CleanSession) {
        this.CleanSession = CleanSession;
    }

    /**
     * Get MQTT instance-id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource MQTT instance-id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set MQTT instance-id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource MQTT instance-id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get MQTT实例VIP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip MQTT实例VIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set MQTT实例VIP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip MQTT实例VIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get MQTT VIP 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port MQTT VIP 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set MQTT VIP 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port MQTT VIP 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get MQTT实例用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName MQTT实例用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set MQTT实例用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName MQTT实例用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get MQTT实例内账户密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password MQTT实例内账户密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set MQTT实例内账户密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password MQTT实例内账户密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get QoS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qos QoS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set QoS
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qos QoS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTasks tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTasks() {
        return this.MaxTasks;
    }

    /**
     * Set tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTasks tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTasks(Long MaxTasks) {
        this.MaxTasks = MaxTasks;
    }

    /**
     * Get MQTT 实例的Service VIP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceVip MQTT 实例的Service VIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set MQTT 实例的Service VIP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceVip MQTT 实例的Service VIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get MQTT实例的VPC ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId MQTT实例的VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set MQTT实例的VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId MQTT实例的VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否为自建集群, MQTT只支持非自建集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfBuilt 是否为自建集群, MQTT只支持非自建集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群, MQTT只支持非自建集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfBuilt 是否为自建集群, MQTT只支持非自建集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    public MqttParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MqttParam(MqttParam source) {
        if (source.Topics != null) {
            this.Topics = new String(source.Topics);
        }
        if (source.CleanSession != null) {
            this.CleanSession = new Boolean(source.CleanSession);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
        if (source.MaxTasks != null) {
            this.MaxTasks = new Long(source.MaxTasks);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topics", this.Topics);
        this.setParamSimple(map, prefix + "CleanSession", this.CleanSession);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "MaxTasks", this.MaxTasks);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);

    }
}

