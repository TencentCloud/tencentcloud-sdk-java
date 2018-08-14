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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerInstance  extends AbstractModel{

    /**
    * 容器实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 容器实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 容器实例所属VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 容器实例所属SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 容器实例状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 容器列表
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
    * 重启策略
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Vpc名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VpcCidr
    */
    @SerializedName("VpcCidr")
    @Expose
    private String VpcCidr;

    /**
    * SubnetName
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网Cidr
    */
    @SerializedName("SubnetCidr")
    @Expose
    private String SubnetCidr;

    /**
    * 内网IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
     * 获取容器实例ID
     * @return InstanceId 容器实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置容器实例ID
     * @param InstanceId 容器实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取容器实例名称
     * @return InstanceName 容器实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置容器实例名称
     * @param InstanceName 容器实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取容器实例所属VpcId
     * @return VpcId 容器实例所属VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置容器实例所属VpcId
     * @param VpcId 容器实例所属VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取容器实例所属SubnetId
     * @return SubnetId 容器实例所属SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置容器实例所属SubnetId
     * @param SubnetId 容器实例所属SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取容器实例状态
     * @return State 容器实例状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置容器实例状态
     * @param State 容器实例状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取容器列表
     * @return Containers 容器列表
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * 设置容器列表
     * @param Containers 容器列表
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * 获取重启策略
     * @return RestartPolicy 重启策略
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * 设置重启策略
     * @param RestartPolicy 重启策略
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取启动时间
     * @return StartTime 启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置启动时间
     * @param StartTime 启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取Vpc名称
     * @return VpcName Vpc名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置Vpc名称
     * @param VpcName Vpc名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取VpcCidr
     * @return VpcCidr VpcCidr
     */
    public String getVpcCidr() {
        return this.VpcCidr;
    }

    /**
     * 设置VpcCidr
     * @param VpcCidr VpcCidr
     */
    public void setVpcCidr(String VpcCidr) {
        this.VpcCidr = VpcCidr;
    }

    /**
     * 获取SubnetName
     * @return SubnetName SubnetName
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置SubnetName
     * @param SubnetName SubnetName
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取子网Cidr
     * @return SubnetCidr 子网Cidr
     */
    public String getSubnetCidr() {
        return this.SubnetCidr;
    }

    /**
     * 设置子网Cidr
     * @param SubnetCidr 子网Cidr
     */
    public void setSubnetCidr(String SubnetCidr) {
        this.SubnetCidr = SubnetCidr;
    }

    /**
     * 获取内网IP
     * @return LanIp 内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置内网IP
     * @param LanIp 内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidr", this.VpcCidr);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetCidr", this.SubnetCidr);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);

    }
}

