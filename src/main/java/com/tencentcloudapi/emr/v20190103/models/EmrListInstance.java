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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrListInstance extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>集群名字</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群地域</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>用户APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>运行时间</p>
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * <p>集群IP</p>
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * <p>集群版本</p>
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * <p>集群计费类型</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * <p>emr ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>区域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>地区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>告警信息</p>
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * <p>是否是woodpecker集群</p>
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * <p>Vpc中文</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>子网中文</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>字符串VpcId</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>字符串子网</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>集群类型</p>
    */
    @SerializedName("ClusterClass")
    @Expose
    private String ClusterClass;

    /**
    * <p>是否为跨AZ集群</p>
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * <p>是否手戳集群</p>
    */
    @SerializedName("IsHandsCluster")
    @Expose
    private Boolean IsHandsCluster;

    /**
    * <p>体外客户端组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutSideSoftInfo")
    @Expose
    private SoftDependInfo [] OutSideSoftInfo;

    /**
    * <p>当前集群的应用场景是否支持体外客户端</p>
    */
    @SerializedName("IsSupportOutsideCluster")
    @Expose
    private Boolean IsSupportOutsideCluster;

    /**
    * <p>是否专有集群场景集群</p>
    */
    @SerializedName("IsDedicatedCluster")
    @Expose
    private Boolean IsDedicatedCluster;

    /**
    * <p>集群支持克隆</p>
    */
    @SerializedName("IsSupportClone")
    @Expose
    private Boolean IsSupportClone;

    /**
    * <p>集群包含的组件</p>
    */
    @SerializedName("Soft")
    @Expose
    private String [] Soft;

    /**
    * <p>是否开启了实例保护</p>
    */
    @SerializedName("IsTerminateProtection")
    @Expose
    private Boolean IsTerminateProtection;

    /**
    * <p>mcp密码信息</p>
    */
    @SerializedName("McpPasswordInfo")
    @Expose
    private McpPasswordInfo McpPasswordInfo;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除</p> 
     * @return StatusDesc <p>常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除</p>
     * @param StatusDesc <p>常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>集群名字</p> 
     * @return ClusterName <p>集群名字</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名字</p>
     * @param ClusterName <p>集群名字</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群地域</p> 
     * @return ZoneId <p>集群地域</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>集群地域</p>
     * @param ZoneId <p>集群地域</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>用户APPID</p> 
     * @return AppId <p>用户APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户APPID</p>
     * @param AppId <p>用户APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建时间</p> 
     * @return AddTime <p>创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param AddTime <p>创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>运行时间</p> 
     * @return RunTime <p>运行时间</p>
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set <p>运行时间</p>
     * @param RunTime <p>运行时间</p>
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get <p>集群IP</p> 
     * @return MasterIp <p>集群IP</p>
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set <p>集群IP</p>
     * @param MasterIp <p>集群IP</p>
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get <p>集群版本</p> 
     * @return EmrVersion <p>集群版本</p>
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set <p>集群版本</p>
     * @param EmrVersion <p>集群版本</p>
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get <p>集群计费类型</p> 
     * @return ChargeType <p>集群计费类型</p>
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>集群计费类型</p>
     * @param ChargeType <p>集群计费类型</p>
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>emr ID</p> 
     * @return Id <p>emr ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>emr ID</p>
     * @param Id <p>emr ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>区域</p> 
     * @return RegionId <p>区域</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>区域</p>
     * @param RegionId <p>区域</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>网络ID</p> 
     * @return VpcId <p>网络ID</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>网络ID</p>
     * @param VpcId <p>网络ID</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>地区</p> 
     * @return Zone <p>地区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>地区</p>
     * @param Zone <p>地区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)</p> 
     * @return Status <p>状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)</p>
     * @param Status <p>状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>告警信息</p> 
     * @return AlarmInfo <p>告警信息</p>
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set <p>告警信息</p>
     * @param AlarmInfo <p>告警信息</p>
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get <p>是否是woodpecker集群</p> 
     * @return IsWoodpeckerCluster <p>是否是woodpecker集群</p>
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set <p>是否是woodpecker集群</p>
     * @param IsWoodpeckerCluster <p>是否是woodpecker集群</p>
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get <p>Vpc中文</p> 
     * @return VpcName <p>Vpc中文</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>Vpc中文</p>
     * @param VpcName <p>Vpc中文</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>子网中文</p> 
     * @return SubnetName <p>子网中文</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网中文</p>
     * @param SubnetName <p>子网中文</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>字符串VpcId</p> 
     * @return UniqVpcId <p>字符串VpcId</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>字符串VpcId</p>
     * @param UniqVpcId <p>字符串VpcId</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>字符串子网</p> 
     * @return UniqSubnetId <p>字符串子网</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>字符串子网</p>
     * @param UniqSubnetId <p>字符串子网</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>集群类型</p> 
     * @return ClusterClass <p>集群类型</p>
     */
    public String getClusterClass() {
        return this.ClusterClass;
    }

    /**
     * Set <p>集群类型</p>
     * @param ClusterClass <p>集群类型</p>
     */
    public void setClusterClass(String ClusterClass) {
        this.ClusterClass = ClusterClass;
    }

    /**
     * Get <p>是否为跨AZ集群</p> 
     * @return IsMultiZoneCluster <p>是否为跨AZ集群</p>
     */
    public Boolean getIsMultiZoneCluster() {
        return this.IsMultiZoneCluster;
    }

    /**
     * Set <p>是否为跨AZ集群</p>
     * @param IsMultiZoneCluster <p>是否为跨AZ集群</p>
     */
    public void setIsMultiZoneCluster(Boolean IsMultiZoneCluster) {
        this.IsMultiZoneCluster = IsMultiZoneCluster;
    }

    /**
     * Get <p>是否手戳集群</p> 
     * @return IsHandsCluster <p>是否手戳集群</p>
     */
    public Boolean getIsHandsCluster() {
        return this.IsHandsCluster;
    }

    /**
     * Set <p>是否手戳集群</p>
     * @param IsHandsCluster <p>是否手戳集群</p>
     */
    public void setIsHandsCluster(Boolean IsHandsCluster) {
        this.IsHandsCluster = IsHandsCluster;
    }

    /**
     * Get <p>体外客户端组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutSideSoftInfo <p>体外客户端组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SoftDependInfo [] getOutSideSoftInfo() {
        return this.OutSideSoftInfo;
    }

    /**
     * Set <p>体外客户端组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutSideSoftInfo <p>体外客户端组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutSideSoftInfo(SoftDependInfo [] OutSideSoftInfo) {
        this.OutSideSoftInfo = OutSideSoftInfo;
    }

    /**
     * Get <p>当前集群的应用场景是否支持体外客户端</p> 
     * @return IsSupportOutsideCluster <p>当前集群的应用场景是否支持体外客户端</p>
     */
    public Boolean getIsSupportOutsideCluster() {
        return this.IsSupportOutsideCluster;
    }

    /**
     * Set <p>当前集群的应用场景是否支持体外客户端</p>
     * @param IsSupportOutsideCluster <p>当前集群的应用场景是否支持体外客户端</p>
     */
    public void setIsSupportOutsideCluster(Boolean IsSupportOutsideCluster) {
        this.IsSupportOutsideCluster = IsSupportOutsideCluster;
    }

    /**
     * Get <p>是否专有集群场景集群</p> 
     * @return IsDedicatedCluster <p>是否专有集群场景集群</p>
     */
    public Boolean getIsDedicatedCluster() {
        return this.IsDedicatedCluster;
    }

    /**
     * Set <p>是否专有集群场景集群</p>
     * @param IsDedicatedCluster <p>是否专有集群场景集群</p>
     */
    public void setIsDedicatedCluster(Boolean IsDedicatedCluster) {
        this.IsDedicatedCluster = IsDedicatedCluster;
    }

    /**
     * Get <p>集群支持克隆</p> 
     * @return IsSupportClone <p>集群支持克隆</p>
     */
    public Boolean getIsSupportClone() {
        return this.IsSupportClone;
    }

    /**
     * Set <p>集群支持克隆</p>
     * @param IsSupportClone <p>集群支持克隆</p>
     */
    public void setIsSupportClone(Boolean IsSupportClone) {
        this.IsSupportClone = IsSupportClone;
    }

    /**
     * Get <p>集群包含的组件</p> 
     * @return Soft <p>集群包含的组件</p>
     */
    public String [] getSoft() {
        return this.Soft;
    }

    /**
     * Set <p>集群包含的组件</p>
     * @param Soft <p>集群包含的组件</p>
     */
    public void setSoft(String [] Soft) {
        this.Soft = Soft;
    }

    /**
     * Get <p>是否开启了实例保护</p> 
     * @return IsTerminateProtection <p>是否开启了实例保护</p>
     */
    public Boolean getIsTerminateProtection() {
        return this.IsTerminateProtection;
    }

    /**
     * Set <p>是否开启了实例保护</p>
     * @param IsTerminateProtection <p>是否开启了实例保护</p>
     */
    public void setIsTerminateProtection(Boolean IsTerminateProtection) {
        this.IsTerminateProtection = IsTerminateProtection;
    }

    /**
     * Get <p>mcp密码信息</p> 
     * @return McpPasswordInfo <p>mcp密码信息</p>
     */
    public McpPasswordInfo getMcpPasswordInfo() {
        return this.McpPasswordInfo;
    }

    /**
     * Set <p>mcp密码信息</p>
     * @param McpPasswordInfo <p>mcp密码信息</p>
     */
    public void setMcpPasswordInfo(McpPasswordInfo McpPasswordInfo) {
        this.McpPasswordInfo = McpPasswordInfo;
    }

    public EmrListInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrListInstance(EmrListInstance source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.RunTime != null) {
            this.RunTime = new String(source.RunTime);
        }
        if (source.MasterIp != null) {
            this.MasterIp = new String(source.MasterIp);
        }
        if (source.EmrVersion != null) {
            this.EmrVersion = new String(source.EmrVersion);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AlarmInfo != null) {
            this.AlarmInfo = new String(source.AlarmInfo);
        }
        if (source.IsWoodpeckerCluster != null) {
            this.IsWoodpeckerCluster = new Long(source.IsWoodpeckerCluster);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ClusterClass != null) {
            this.ClusterClass = new String(source.ClusterClass);
        }
        if (source.IsMultiZoneCluster != null) {
            this.IsMultiZoneCluster = new Boolean(source.IsMultiZoneCluster);
        }
        if (source.IsHandsCluster != null) {
            this.IsHandsCluster = new Boolean(source.IsHandsCluster);
        }
        if (source.OutSideSoftInfo != null) {
            this.OutSideSoftInfo = new SoftDependInfo[source.OutSideSoftInfo.length];
            for (int i = 0; i < source.OutSideSoftInfo.length; i++) {
                this.OutSideSoftInfo[i] = new SoftDependInfo(source.OutSideSoftInfo[i]);
            }
        }
        if (source.IsSupportOutsideCluster != null) {
            this.IsSupportOutsideCluster = new Boolean(source.IsSupportOutsideCluster);
        }
        if (source.IsDedicatedCluster != null) {
            this.IsDedicatedCluster = new Boolean(source.IsDedicatedCluster);
        }
        if (source.IsSupportClone != null) {
            this.IsSupportClone = new Boolean(source.IsSupportClone);
        }
        if (source.Soft != null) {
            this.Soft = new String[source.Soft.length];
            for (int i = 0; i < source.Soft.length; i++) {
                this.Soft[i] = new String(source.Soft[i]);
            }
        }
        if (source.IsTerminateProtection != null) {
            this.IsTerminateProtection = new Boolean(source.IsTerminateProtection);
        }
        if (source.McpPasswordInfo != null) {
            this.McpPasswordInfo = new McpPasswordInfo(source.McpPasswordInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamSimple(map, prefix + "MasterIp", this.MasterIp);
        this.setParamSimple(map, prefix + "EmrVersion", this.EmrVersion);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AlarmInfo", this.AlarmInfo);
        this.setParamSimple(map, prefix + "IsWoodpeckerCluster", this.IsWoodpeckerCluster);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ClusterClass", this.ClusterClass);
        this.setParamSimple(map, prefix + "IsMultiZoneCluster", this.IsMultiZoneCluster);
        this.setParamSimple(map, prefix + "IsHandsCluster", this.IsHandsCluster);
        this.setParamArrayObj(map, prefix + "OutSideSoftInfo.", this.OutSideSoftInfo);
        this.setParamSimple(map, prefix + "IsSupportOutsideCluster", this.IsSupportOutsideCluster);
        this.setParamSimple(map, prefix + "IsDedicatedCluster", this.IsDedicatedCluster);
        this.setParamSimple(map, prefix + "IsSupportClone", this.IsSupportClone);
        this.setParamArraySimple(map, prefix + "Soft.", this.Soft);
        this.setParamSimple(map, prefix + "IsTerminateProtection", this.IsTerminateProtection);
        this.setParamObj(map, prefix + "McpPasswordInfo.", this.McpPasswordInfo);

    }
}

