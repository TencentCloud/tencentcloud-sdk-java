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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrListInstance extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群地域
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 用户APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 运行时间
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * 集群IP
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * 集群版本
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * 集群计费类型
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * emr ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 区域
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 地区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 告警信息
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * 是否是woodpecker集群
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * Vpc中文
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子网中文
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 字符串VpcId
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 字符串子网
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 集群类型
    */
    @SerializedName("ClusterClass")
    @Expose
    private String ClusterClass;

    /**
    * 是否为跨AZ集群
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * 是否手戳集群
    */
    @SerializedName("IsHandsCluster")
    @Expose
    private Boolean IsHandsCluster;

    /**
    * 体外客户端组件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutSideSoftInfo")
    @Expose
    private SoftDependInfo [] OutSideSoftInfo;

    /**
    * 当前集群的应用场景是否支持体外客户端
    */
    @SerializedName("IsSupportOutsideCluster")
    @Expose
    private Boolean IsSupportOutsideCluster;

    /**
    * 是否专有集群场景集群
    */
    @SerializedName("IsDedicatedCluster")
    @Expose
    private Boolean IsDedicatedCluster;

    /**
    * 集群支持克隆
    */
    @SerializedName("IsSupportClone")
    @Expose
    private Boolean IsSupportClone;

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
     * Get 常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除 
     * @return StatusDesc 常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除
     * @param StatusDesc 常见状态描述：集群生产中,集群运行中,集群创建中,集群已关闭,集群已删除
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群地域 
     * @return ZoneId 集群地域
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 集群地域
     * @param ZoneId 集群地域
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户APPID 
     * @return AppId 用户APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID
     * @param AppId 用户APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 运行时间 
     * @return RunTime 运行时间
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set 运行时间
     * @param RunTime 运行时间
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get 集群IP 
     * @return MasterIp 集群IP
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set 集群IP
     * @param MasterIp 集群IP
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get 集群版本 
     * @return EmrVersion 集群版本
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set 集群版本
     * @param EmrVersion 集群版本
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get 集群计费类型 
     * @return ChargeType 集群计费类型
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 集群计费类型
     * @param ChargeType 集群计费类型
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get emr ID 
     * @return Id emr ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set emr ID
     * @param Id emr ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 区域 
     * @return RegionId 区域
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域
     * @param RegionId 区域
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 网络ID 
     * @return VpcId 网络ID
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网络ID
     * @param VpcId 网络ID
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 地区 
     * @return Zone 地区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地区
     * @param Zone 地区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中) 
     * @return Status 状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)
     * @param Status 状态码, 取值为-2(集群已删除), -1(集群已关闭), 0(集群生产中), 2(集群运行中), 3(集群创建中)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 实例标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 实例标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 告警信息 
     * @return AlarmInfo 告警信息
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set 告警信息
     * @param AlarmInfo 告警信息
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get 是否是woodpecker集群 
     * @return IsWoodpeckerCluster 是否是woodpecker集群
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set 是否是woodpecker集群
     * @param IsWoodpeckerCluster 是否是woodpecker集群
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get Vpc中文 
     * @return VpcName Vpc中文
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set Vpc中文
     * @param VpcName Vpc中文
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子网中文 
     * @return SubnetName 子网中文
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网中文
     * @param SubnetName 子网中文
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 字符串VpcId 
     * @return UniqVpcId 字符串VpcId
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 字符串VpcId
     * @param UniqVpcId 字符串VpcId
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 字符串子网 
     * @return UniqSubnetId 字符串子网
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 字符串子网
     * @param UniqSubnetId 字符串子网
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 集群类型 
     * @return ClusterClass 集群类型
     */
    public String getClusterClass() {
        return this.ClusterClass;
    }

    /**
     * Set 集群类型
     * @param ClusterClass 集群类型
     */
    public void setClusterClass(String ClusterClass) {
        this.ClusterClass = ClusterClass;
    }

    /**
     * Get 是否为跨AZ集群 
     * @return IsMultiZoneCluster 是否为跨AZ集群
     */
    public Boolean getIsMultiZoneCluster() {
        return this.IsMultiZoneCluster;
    }

    /**
     * Set 是否为跨AZ集群
     * @param IsMultiZoneCluster 是否为跨AZ集群
     */
    public void setIsMultiZoneCluster(Boolean IsMultiZoneCluster) {
        this.IsMultiZoneCluster = IsMultiZoneCluster;
    }

    /**
     * Get 是否手戳集群 
     * @return IsHandsCluster 是否手戳集群
     */
    public Boolean getIsHandsCluster() {
        return this.IsHandsCluster;
    }

    /**
     * Set 是否手戳集群
     * @param IsHandsCluster 是否手戳集群
     */
    public void setIsHandsCluster(Boolean IsHandsCluster) {
        this.IsHandsCluster = IsHandsCluster;
    }

    /**
     * Get 体外客户端组件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutSideSoftInfo 体外客户端组件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SoftDependInfo [] getOutSideSoftInfo() {
        return this.OutSideSoftInfo;
    }

    /**
     * Set 体外客户端组件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutSideSoftInfo 体外客户端组件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutSideSoftInfo(SoftDependInfo [] OutSideSoftInfo) {
        this.OutSideSoftInfo = OutSideSoftInfo;
    }

    /**
     * Get 当前集群的应用场景是否支持体外客户端 
     * @return IsSupportOutsideCluster 当前集群的应用场景是否支持体外客户端
     */
    public Boolean getIsSupportOutsideCluster() {
        return this.IsSupportOutsideCluster;
    }

    /**
     * Set 当前集群的应用场景是否支持体外客户端
     * @param IsSupportOutsideCluster 当前集群的应用场景是否支持体外客户端
     */
    public void setIsSupportOutsideCluster(Boolean IsSupportOutsideCluster) {
        this.IsSupportOutsideCluster = IsSupportOutsideCluster;
    }

    /**
     * Get 是否专有集群场景集群 
     * @return IsDedicatedCluster 是否专有集群场景集群
     */
    public Boolean getIsDedicatedCluster() {
        return this.IsDedicatedCluster;
    }

    /**
     * Set 是否专有集群场景集群
     * @param IsDedicatedCluster 是否专有集群场景集群
     */
    public void setIsDedicatedCluster(Boolean IsDedicatedCluster) {
        this.IsDedicatedCluster = IsDedicatedCluster;
    }

    /**
     * Get 集群支持克隆 
     * @return IsSupportClone 集群支持克隆
     */
    public Boolean getIsSupportClone() {
        return this.IsSupportClone;
    }

    /**
     * Set 集群支持克隆
     * @param IsSupportClone 集群支持克隆
     */
    public void setIsSupportClone(Boolean IsSupportClone) {
        this.IsSupportClone = IsSupportClone;
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

    }
}

