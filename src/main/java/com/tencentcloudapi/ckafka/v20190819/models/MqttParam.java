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
    * <p>需要同步的MQTT Topic列表, CSV格式</p>
    */
    @SerializedName("Topics")
    @Expose
    private String Topics;

    /**
    * <p>用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。</p>
    */
    @SerializedName("CleanSession")
    @Expose
    private Boolean CleanSession;

    /**
    * <p>MQTT instance-id</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>MQTT实例VIP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>MQTT VIP 端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>MQTT实例用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>MQTT实例内账户密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>QoS</p>
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * <p>tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription</p>
    */
    @SerializedName("MaxTasks")
    @Expose
    private Long MaxTasks;

    /**
    * <p>MQTT 实例的Service VIP</p>
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * <p>MQTT实例的VPC ID</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>是否为自建集群, MQTT只支持非自建集群</p>
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * <p>MQTT消息过滤sql语句</p>
    */
    @SerializedName("SqlFilter")
    @Expose
    private String SqlFilter;

    /**
     * Get <p>需要同步的MQTT Topic列表, CSV格式</p> 
     * @return Topics <p>需要同步的MQTT Topic列表, CSV格式</p>
     */
    public String getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>需要同步的MQTT Topic列表, CSV格式</p>
     * @param Topics <p>需要同步的MQTT Topic列表, CSV格式</p>
     */
    public void setTopics(String Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。</p> 
     * @return CleanSession <p>用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。</p>
     */
    public Boolean getCleanSession() {
        return this.CleanSession;
    }

    /**
     * Set <p>用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。</p>
     * @param CleanSession <p>用于控制会话的持久性。cleanSession 为true时，连接时会创建一个全新的会话。 cleanSession = false时，连接时会恢复之前的会话。</p>
     */
    public void setCleanSession(Boolean CleanSession) {
        this.CleanSession = CleanSession;
    }

    /**
     * Get <p>MQTT instance-id</p> 
     * @return Resource <p>MQTT instance-id</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>MQTT instance-id</p>
     * @param Resource <p>MQTT instance-id</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>MQTT实例VIP</p> 
     * @return Ip <p>MQTT实例VIP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>MQTT实例VIP</p>
     * @param Ip <p>MQTT实例VIP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>MQTT VIP 端口</p> 
     * @return Port <p>MQTT VIP 端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>MQTT VIP 端口</p>
     * @param Port <p>MQTT VIP 端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>MQTT实例用户名</p> 
     * @return UserName <p>MQTT实例用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>MQTT实例用户名</p>
     * @param UserName <p>MQTT实例用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>MQTT实例内账户密码</p> 
     * @return Password <p>MQTT实例内账户密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>MQTT实例内账户密码</p>
     * @param Password <p>MQTT实例内账户密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>QoS</p> 
     * @return Qos <p>QoS</p>
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set <p>QoS</p>
     * @param Qos <p>QoS</p>
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription</p> 
     * @return MaxTasks <p>tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription</p>
     */
    public Long getMaxTasks() {
        return this.MaxTasks;
    }

    /**
     * Set <p>tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription</p>
     * @param MaxTasks <p>tasks.max 订阅Topic的并发Task个数, 默认为1; 当设置大于1时, 使用Shared Subscription</p>
     */
    public void setMaxTasks(Long MaxTasks) {
        this.MaxTasks = MaxTasks;
    }

    /**
     * Get <p>MQTT 实例的Service VIP</p> 
     * @return ServiceVip <p>MQTT 实例的Service VIP</p>
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set <p>MQTT 实例的Service VIP</p>
     * @param ServiceVip <p>MQTT 实例的Service VIP</p>
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get <p>MQTT实例的VPC ID</p> 
     * @return UniqVpcId <p>MQTT实例的VPC ID</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>MQTT实例的VPC ID</p>
     * @param UniqVpcId <p>MQTT实例的VPC ID</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>是否为自建集群, MQTT只支持非自建集群</p> 
     * @return SelfBuilt <p>是否为自建集群, MQTT只支持非自建集群</p>
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set <p>是否为自建集群, MQTT只支持非自建集群</p>
     * @param SelfBuilt <p>是否为自建集群, MQTT只支持非自建集群</p>
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get <p>MQTT消息过滤sql语句</p> 
     * @return SqlFilter <p>MQTT消息过滤sql语句</p>
     */
    public String getSqlFilter() {
        return this.SqlFilter;
    }

    /**
     * Set <p>MQTT消息过滤sql语句</p>
     * @param SqlFilter <p>MQTT消息过滤sql语句</p>
     */
    public void setSqlFilter(String SqlFilter) {
        this.SqlFilter = SqlFilter;
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
        if (source.SqlFilter != null) {
            this.SqlFilter = new String(source.SqlFilter);
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
        this.setParamSimple(map, prefix + "SqlFilter", this.SqlFilter);

    }
}

