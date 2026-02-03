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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLibraDBClustersRequest extends AbstractModel {

    /**
    * 数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例初始化信息
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private LibraDBInstanceInitInfo [] InstanceInitInfos;

    /**
    * 用户密码
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * 是否自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否自动选择代金券
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 下单模式
    */
    @SerializedName("DealMode")
    @Expose
    private String DealMode;

    /**
    * 加密方法
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
    * LibraDBVersion 版本，缺省为最新版本
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * 订单来源
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 安全组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 实例创建绑定Tag数组信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 集群所在vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群所在SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get 数量 
     * @return Count 数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
     * @param Count 数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get 实例初始化信息 
     * @return InstanceInitInfos 实例初始化信息
     */
    public LibraDBInstanceInitInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set 实例初始化信息
     * @param InstanceInitInfos 实例初始化信息
     */
    public void setInstanceInitInfos(LibraDBInstanceInitInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get 用户密码 
     * @return AdminPassword 用户密码
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 用户密码
     * @param AdminPassword 用户密码
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get 是否自动续费 
     * @return AutoRenewFlag 是否自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费
     * @param AutoRenewFlag 是否自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否自动选择代金券 
     * @return AutoVoucher 是否自动选择代金券
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券
     * @param AutoVoucher 是否自动选择代金券
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
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
     * Get 下单模式 
     * @return DealMode 下单模式
     */
    public String getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 下单模式
     * @param DealMode 下单模式
     */
    public void setDealMode(String DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get 加密方法 
     * @return EncryptMethod 加密方法
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方法
     * @param EncryptMethod 加密方法
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get LibraDBVersion 版本，缺省为最新版本 
     * @return LibraDBVersion LibraDBVersion 版本，缺省为最新版本
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set LibraDBVersion 版本，缺省为最新版本
     * @param LibraDBVersion LibraDBVersion 版本，缺省为最新版本
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get 订单来源 
     * @return OrderSource 订单来源
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set 订单来源
     * @param OrderSource 订单来源
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
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
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 安全组 
     * @return SecurityGroupIds 安全组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组
     * @param SecurityGroupIds 安全组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 时长 
     * @return TimeSpan 时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时长
     * @param TimeSpan 时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时间单位 
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 实例创建绑定Tag数组信息 
     * @return ResourceTags 实例创建绑定Tag数组信息
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例创建绑定Tag数组信息
     * @param ResourceTags 实例创建绑定Tag数组信息
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 集群所在vpcId 
     * @return VpcId 集群所在vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群所在vpcId
     * @param VpcId 集群所在vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群所在SubnetId 
     * @return SubnetId 集群所在SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 集群所在SubnetId
     * @param SubnetId 集群所在SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public CreateLibraDBClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraDBClustersRequest(CreateLibraDBClustersRequest source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new LibraDBInstanceInitInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new LibraDBInstanceInitInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.DealMode != null) {
            this.DealMode = new String(source.DealMode);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

