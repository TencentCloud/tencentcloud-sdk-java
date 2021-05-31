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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbClusterDetail extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * vpc唯一id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 字符集
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 使用容量
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * 读写分离Vport
    */
    @SerializedName("RoAddr")
    @Expose
    private Addr [] RoAddr;

    /**
    * 实例信息
    */
    @SerializedName("InstanceSet")
    @Expose
    private ClusterInstanceDetail [] InstanceSet;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * vip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例绑定的tag数组信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get VPC名称 
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get vpc唯一id 
     * @return VpcId vpc唯一id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc唯一id
     * @param VpcId vpc唯一id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 字符集 
     * @return Charset 字符集
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 字符集
     * @param Charset 字符集
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据库类型 
     * @return DbType 数据库类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
     * @param DbType 数据库类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 数据库版本 
     * @return DbVersion 数据库版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
     * @param DbVersion 数据库版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 使用容量 
     * @return UsedStorage 使用容量
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set 使用容量
     * @param UsedStorage 使用容量
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get 读写分离Vport 
     * @return RoAddr 读写分离Vport
     */
    public Addr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set 读写分离Vport
     * @param RoAddr 读写分离Vport
     */
    public void setRoAddr(Addr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get 实例信息 
     * @return InstanceSet 实例信息
     */
    public ClusterInstanceDetail [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 实例信息
     * @param InstanceSet 实例信息
     */
    public void setInstanceSet(ClusterInstanceDetail [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 到期时间 
     * @return PeriodEndTime 到期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 到期时间
     * @param PeriodEndTime 到期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get vip地址 
     * @return Vip vip地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip地址
     * @param Vip vip地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport端口 
     * @return Vport vport端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport端口
     * @param Vport vport端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 项目id 
     * @return ProjectID 项目id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
     * @param ProjectID 项目id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例绑定的tag数组信息 
     * @return ResourceTags 实例绑定的tag数组信息
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例绑定的tag数组信息
     * @param ResourceTags 实例绑定的tag数组信息
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing 
     * @return ServerlessStatus 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
     * @param ServerlessStatus 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    public CynosdbClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbClusterDetail(CynosdbClusterDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.RoAddr != null) {
            this.RoAddr = new Addr[source.RoAddr.length];
            for (int i = 0; i < source.RoAddr.length; i++) {
                this.RoAddr[i] = new Addr(source.RoAddr[i]);
            }
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new ClusterInstanceDetail[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new ClusterInstanceDetail(source.InstanceSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamArrayObj(map, prefix + "RoAddr.", this.RoAddr);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);

    }
}

