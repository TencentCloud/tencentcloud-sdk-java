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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisCommonInstanceList extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例所属项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例接入区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例接入zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例状态信息，0-创建中，1-运行中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例网络ip
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * 实例网络端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例创建时间
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * 计费类型，0-按量计费，1-包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 网络类型，0-基础网络，1-VPC网络
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户id 
     * @return AppId 用户id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户id
     * @param AppId 用户id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例所属项目id 
     * @return ProjectId 实例所属项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目id
     * @param ProjectId 实例所属项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例接入区域 
     * @return Region 实例接入区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例接入区域
     * @param Region 实例接入区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例接入zone 
     * @return Zone 实例接入zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例接入zone
     * @param Zone 实例接入zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例网络id 
     * @return VpcId 实例网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例网络id
     * @param VpcId 实例网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例状态信息，0-创建中，1-运行中 
     * @return Status 实例状态信息，0-创建中，1-运行中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态信息，0-创建中，1-运行中
     * @param Status 实例状态信息，0-创建中，1-运行中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例网络ip 
     * @return Vips 实例网络ip
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 实例网络ip
     * @param Vips 实例网络ip
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get 实例网络端口 
     * @return Vport 实例网络端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例网络端口
     * @param Vport 实例网络端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例创建时间 
     * @return Createtime 实例创建时间
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 实例创建时间
     * @param Createtime 实例创建时间
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 计费类型，0-按量计费，1-包年包月 
     * @return PayMode 计费类型，0-按量计费，1-包年包月
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型，0-按量计费，1-包年包月
     * @param PayMode 计费类型，0-按量计费，1-包年包月
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 网络类型，0-基础网络，1-VPC网络 
     * @return NetType 网络类型，0-基础网络，1-VPC网络
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型，0-基础网络，1-VPC网络
     * @param NetType 网络类型，0-基础网络，1-VPC网络
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

