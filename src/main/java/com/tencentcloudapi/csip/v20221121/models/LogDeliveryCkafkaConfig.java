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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogDeliveryCkafkaConfig extends AbstractModel {

    /**
    * <p>接入类型</p>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>虚拟ip  VipType 为7 有效</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>虚拟端口 VipType 为7有效</p>
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <p>域名  VipType 为1有效</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名端口 VipType 为1有效</p>
    */
    @SerializedName("DomainPort")
    @Expose
    private String DomainPort;

    /**
    * <p>实例地域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>实例vpc</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>实例子网</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例健康状态， 1：健康，2：告警，3：异常&#39;, 4: 实例不存在</p>
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * <p>日志类型</p>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * <p>投递的topicid</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>投递的topicname</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>投递状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>状态信息</p>
    */
    @SerializedName("StatusMessages")
    @Expose
    private String StatusMessages;

    /**
    * <p>开启or关闭，投递状态1为开启，0 关闭，默认开启，但是如果没有topic 则关闭</p>
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
     * Get <p>接入类型</p> 
     * @return VipType <p>接入类型</p>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>接入类型</p>
     * @param VipType <p>接入类型</p>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>虚拟ip  VipType 为7 有效</p> 
     * @return Vip <p>虚拟ip  VipType 为7 有效</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>虚拟ip  VipType 为7 有效</p>
     * @param Vip <p>虚拟ip  VipType 为7 有效</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>虚拟端口 VipType 为7有效</p> 
     * @return Vport <p>虚拟端口 VipType 为7有效</p>
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <p>虚拟端口 VipType 为7有效</p>
     * @param Vport <p>虚拟端口 VipType 为7有效</p>
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>域名  VipType 为1有效</p> 
     * @return Domain <p>域名  VipType 为1有效</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名  VipType 为1有效</p>
     * @param Domain <p>域名  VipType 为1有效</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名端口 VipType 为1有效</p> 
     * @return DomainPort <p>域名端口 VipType 为1有效</p>
     */
    public String getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set <p>域名端口 VipType 为1有效</p>
     * @param DomainPort <p>域名端口 VipType 为1有效</p>
     */
    public void setDomainPort(String DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get <p>实例地域</p> 
     * @return RegionId <p>实例地域</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>实例地域</p>
     * @param RegionId <p>实例地域</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>实例vpc</p> 
     * @return VpcId <p>实例vpc</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>实例vpc</p>
     * @param VpcId <p>实例vpc</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>实例子网</p> 
     * @return SubnetId <p>实例子网</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>实例子网</p>
     * @param SubnetId <p>实例子网</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例健康状态， 1：健康，2：告警，3：异常&#39;, 4: 实例不存在</p> 
     * @return Healthy <p>实例健康状态， 1：健康，2：告警，3：异常&#39;, 4: 实例不存在</p>
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set <p>实例健康状态， 1：健康，2：告警，3：异常&#39;, 4: 实例不存在</p>
     * @param Healthy <p>实例健康状态， 1：健康，2：告警，3：异常&#39;, 4: 实例不存在</p>
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get <p>日志类型</p> 
     * @return LogType <p>日志类型</p>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型</p>
     * @param LogType <p>日志类型</p>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>投递的topicid</p> 
     * @return TopicId <p>投递的topicid</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>投递的topicid</p>
     * @param TopicId <p>投递的topicid</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>投递的topicname</p> 
     * @return TopicName <p>投递的topicname</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>投递的topicname</p>
     * @param TopicName <p>投递的topicname</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>投递状态</p> 
     * @return Status <p>投递状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>投递状态</p>
     * @param Status <p>投递状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态信息</p> 
     * @return StatusMessages <p>状态信息</p>
     */
    public String getStatusMessages() {
        return this.StatusMessages;
    }

    /**
     * Set <p>状态信息</p>
     * @param StatusMessages <p>状态信息</p>
     */
    public void setStatusMessages(String StatusMessages) {
        this.StatusMessages = StatusMessages;
    }

    /**
     * Get <p>开启or关闭，投递状态1为开启，0 关闭，默认开启，但是如果没有topic 则关闭</p> 
     * @return IsOpen <p>开启or关闭，投递状态1为开启，0 关闭，默认开启，但是如果没有topic 则关闭</p>
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>开启or关闭，投递状态1为开启，0 关闭，默认开启，但是如果没有topic 则关闭</p>
     * @param IsOpen <p>开启or关闭，投递状态1为开启，0 关闭，默认开启，但是如果没有topic 则关闭</p>
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    public LogDeliveryCkafkaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDeliveryCkafkaConfig(LogDeliveryCkafkaConfig source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new String(source.DomainPort);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusMessages != null) {
            this.StatusMessages = new String(source.StatusMessages);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Long(source.IsOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessages", this.StatusMessages);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);

    }
}

