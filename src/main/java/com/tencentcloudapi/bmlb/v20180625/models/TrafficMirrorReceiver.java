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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirrorReceiver  extends AbstractModel{

    /**
    * 接收机实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接收机接收端口。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 接收机权重。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
    * 流量镜像ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 接收机别名。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 接收机内网IP地址。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 接收机所在的子网的ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 接收机所在的子网的名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 接收机所在的子网的Cidr。
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * 接收机所在的私有网络的ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 接收机所在的私有网络的名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 接收机所在的私有网络的Cidr。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 接收机的健康状态。
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
     * 获取接收机实例ID。
     * @return InstanceId 接收机实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置接收机实例ID。
     * @param InstanceId 接收机实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取接收机接收端口。
     * @return Port 接收机接收端口。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置接收机接收端口。
     * @param Port 接收机接收端口。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取接收机权重。
     * @return Weight 接收机权重。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置接收机权重。
     * @param Weight 接收机权重。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取流量镜像ID。
     * @return TrafficMirrorId 流量镜像ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * 设置流量镜像ID。
     * @param TrafficMirrorId 流量镜像ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * 获取接收机别名。
     * @return Alias 接收机别名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置接收机别名。
     * @param Alias 接收机别名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取接收机内网IP地址。
     * @return LanIp 接收机内网IP地址。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置接收机内网IP地址。
     * @param LanIp 接收机内网IP地址。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取接收机所在的子网的ID。
     * @return SubnetId 接收机所在的子网的ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置接收机所在的子网的ID。
     * @param SubnetId 接收机所在的子网的ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取接收机所在的子网的名称。
     * @return SubnetName 接收机所在的子网的名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置接收机所在的子网的名称。
     * @param SubnetName 接收机所在的子网的名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取接收机所在的子网的Cidr。
     * @return SubnetCidrBlock 接收机所在的子网的Cidr。
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * 设置接收机所在的子网的Cidr。
     * @param SubnetCidrBlock 接收机所在的子网的Cidr。
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * 获取接收机所在的私有网络的ID。
     * @return VpcId 接收机所在的私有网络的ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置接收机所在的私有网络的ID。
     * @param VpcId 接收机所在的私有网络的ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取接收机所在的私有网络的名称。
     * @return VpcName 接收机所在的私有网络的名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置接收机所在的私有网络的名称。
     * @param VpcName 接收机所在的私有网络的名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取接收机所在的私有网络的Cidr。
     * @return VpcCidrBlock 接收机所在的私有网络的Cidr。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置接收机所在的私有网络的Cidr。
     * @param VpcCidrBlock 接收机所在的私有网络的Cidr。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取接收机的健康状态。
     * @return HealthStatus 接收机的健康状态。
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * 设置接收机的健康状态。
     * @param HealthStatus 接收机的健康状态。
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);

    }
}

