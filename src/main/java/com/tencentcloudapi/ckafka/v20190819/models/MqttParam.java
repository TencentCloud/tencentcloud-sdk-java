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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MqttParam extends AbstractModel {

    /**
    * 需要同步的MQTT Topic列表, CSV格式
    */
    @SerializedName("Topics")
    @Expose
    private String Topics;

    /**
    * 用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。
    */
    @SerializedName("CleanSession")
    @Expose
    private Boolean CleanSession;

    /**
    * MQTT instance-id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * MQTT实例VIP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * MQTT VIP 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * MQTT实例用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * MQTT实例内账户密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * QoS
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
    */
    @SerializedName("MaxTasks")
    @Expose
    private Long MaxTasks;

    /**
    * MQTT 实例的Service VIP
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * MQTT实例的VPC ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否为自建集群, MQTT只支持非自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
     * Get 需要同步的MQTT Topic列表, CSV格式 
     * @return Topics 需要同步的MQTT Topic列表, CSV格式
     */
    public String getTopics() {
        return this.Topics;
    }

    /**
     * Set 需要同步的MQTT Topic列表, CSV格式
     * @param Topics 需要同步的MQTT Topic列表, CSV格式
     */
    public void setTopics(String Topics) {
        this.Topics = Topics;
    }

    /**
     * Get 用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。 
     * @return CleanSession 用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。
     */
    public Boolean getCleanSession() {
        return this.CleanSession;
    }

    /**
     * Set 用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。
     * @param CleanSession 用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。
     */
    public void setCleanSession(Boolean CleanSession) {
        this.CleanSession = CleanSession;
    }

    /**
     * Get MQTT instance-id 
     * @return Resource MQTT instance-id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set MQTT instance-id
     * @param Resource MQTT instance-id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get MQTT实例VIP 
     * @return Ip MQTT实例VIP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set MQTT实例VIP
     * @param Ip MQTT实例VIP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get MQTT VIP 端口 
     * @return Port MQTT VIP 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set MQTT VIP 端口
     * @param Port MQTT VIP 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get MQTT实例用户名 
     * @return UserName MQTT实例用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set MQTT实例用户名
     * @param UserName MQTT实例用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get MQTT实例内账户密码 
     * @return Password MQTT实例内账户密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set MQTT实例内账户密码
     * @param Password MQTT实例内账户密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get QoS 
     * @return Qos QoS
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set QoS
     * @param Qos QoS
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription 
     * @return MaxTasks tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
     */
    public Long getMaxTasks() {
        return this.MaxTasks;
    }

    /**
     * Set tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
     * @param MaxTasks tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription
     */
    public void setMaxTasks(Long MaxTasks) {
        this.MaxTasks = MaxTasks;
    }

    /**
     * Get MQTT 实例的Service VIP 
     * @return ServiceVip MQTT 实例的Service VIP
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set MQTT 实例的Service VIP
     * @param ServiceVip MQTT 实例的Service VIP
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get MQTT实例的VPC ID 
     * @return UniqVpcId MQTT实例的VPC ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set MQTT实例的VPC ID
     * @param UniqVpcId MQTT实例的VPC ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否为自建集群, MQTT只支持非自建集群 
     * @return SelfBuilt 是否为自建集群, MQTT只支持非自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群, MQTT只支持非自建集群
     * @param SelfBuilt 是否为自建集群, MQTT只支持非自建集群
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

