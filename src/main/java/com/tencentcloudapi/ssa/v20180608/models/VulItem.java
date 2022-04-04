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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulItem extends AbstractModel{

    /**
    * 标识
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 处理状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发现时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 影响资产数
    */
    @SerializedName("ImpactAssetNum")
    @Expose
    private Long ImpactAssetNum;

    /**
    * 影响资产id
    */
    @SerializedName("ImpactAsset")
    @Expose
    private String ImpactAsset;

    /**
    * 影响资产名称
    */
    @SerializedName("ImpactAssetName")
    @Expose
    private String ImpactAssetName;

    /**
    * 漏洞描述
    */
    @SerializedName("VulDetail")
    @Expose
    private String VulDetail;

    /**
    * 参考链接
    */
    @SerializedName("VulRefLink")
    @Expose
    private String VulRefLink;

    /**
    * Md5值
    */
    @SerializedName("OldIdMd5")
    @Expose
    private String OldIdMd5;

    /**
    * 漏洞唯一标识
    */
    @SerializedName("UniqId")
    @Expose
    private String UniqId;

    /**
    * 忽略时间
    */
    @SerializedName("OperateTime")
    @Expose
    private String OperateTime;

    /**
    * 受影响资产是否下线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAssetDeleted")
    @Expose
    private String IsAssetDeleted;

    /**
    * 漏洞首次发现时间
    */
    @SerializedName("DiscoverTime")
    @Expose
    private String DiscoverTime;

    /**
    * 主机源信息标识符
    */
    @SerializedName("OriginId")
    @Expose
    private Long OriginId;

    /**
    * 资产区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vpcid")
    @Expose
    private String Vpcid;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetSubType")
    @Expose
    private String AssetSubType;

    /**
    * 资产IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIpAll")
    @Expose
    private String [] AssetIpAll;

    /**
    * cvm类型的公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * cvm类型的内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulSource")
    @Expose
    private String VulSource;

    /**
    * 影响URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedUrl")
    @Expose
    private String AffectedUrl;

    /**
    * 资产归属
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaAssetCategory")
    @Expose
    private Long SsaAssetCategory;

    /**
    * 影响url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulUrl")
    @Expose
    private String VulUrl;

    /**
    * 是否扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
    * 御知主机id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YzHostId")
    @Expose
    private Long YzHostId;

    /**
    * 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulRepairPlan")
    @Expose
    private String VulRepairPlan;

    /**
    * 漏洞文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulPath")
    @Expose
    private String VulPath;

    /**
     * Get 标识 
     * @return Id 标识
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 标识
     * @param Id 标识
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞类型 
     * @return Type 漏洞类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 漏洞类型
     * @param Type 漏洞类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 处理状态 
     * @return Status 处理状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
     * @param Status 处理状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 发现时间 
     * @return Time 发现时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 发现时间
     * @param Time 发现时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 影响资产数 
     * @return ImpactAssetNum 影响资产数
     */
    public Long getImpactAssetNum() {
        return this.ImpactAssetNum;
    }

    /**
     * Set 影响资产数
     * @param ImpactAssetNum 影响资产数
     */
    public void setImpactAssetNum(Long ImpactAssetNum) {
        this.ImpactAssetNum = ImpactAssetNum;
    }

    /**
     * Get 影响资产id 
     * @return ImpactAsset 影响资产id
     */
    public String getImpactAsset() {
        return this.ImpactAsset;
    }

    /**
     * Set 影响资产id
     * @param ImpactAsset 影响资产id
     */
    public void setImpactAsset(String ImpactAsset) {
        this.ImpactAsset = ImpactAsset;
    }

    /**
     * Get 影响资产名称 
     * @return ImpactAssetName 影响资产名称
     */
    public String getImpactAssetName() {
        return this.ImpactAssetName;
    }

    /**
     * Set 影响资产名称
     * @param ImpactAssetName 影响资产名称
     */
    public void setImpactAssetName(String ImpactAssetName) {
        this.ImpactAssetName = ImpactAssetName;
    }

    /**
     * Get 漏洞描述 
     * @return VulDetail 漏洞描述
     */
    public String getVulDetail() {
        return this.VulDetail;
    }

    /**
     * Set 漏洞描述
     * @param VulDetail 漏洞描述
     */
    public void setVulDetail(String VulDetail) {
        this.VulDetail = VulDetail;
    }

    /**
     * Get 参考链接 
     * @return VulRefLink 参考链接
     */
    public String getVulRefLink() {
        return this.VulRefLink;
    }

    /**
     * Set 参考链接
     * @param VulRefLink 参考链接
     */
    public void setVulRefLink(String VulRefLink) {
        this.VulRefLink = VulRefLink;
    }

    /**
     * Get Md5值 
     * @return OldIdMd5 Md5值
     */
    public String getOldIdMd5() {
        return this.OldIdMd5;
    }

    /**
     * Set Md5值
     * @param OldIdMd5 Md5值
     */
    public void setOldIdMd5(String OldIdMd5) {
        this.OldIdMd5 = OldIdMd5;
    }

    /**
     * Get 漏洞唯一标识 
     * @return UniqId 漏洞唯一标识
     */
    public String getUniqId() {
        return this.UniqId;
    }

    /**
     * Set 漏洞唯一标识
     * @param UniqId 漏洞唯一标识
     */
    public void setUniqId(String UniqId) {
        this.UniqId = UniqId;
    }

    /**
     * Get 忽略时间 
     * @return OperateTime 忽略时间
     */
    public String getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set 忽略时间
     * @param OperateTime 忽略时间
     */
    public void setOperateTime(String OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get 受影响资产是否下线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAssetDeleted 受影响资产是否下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsAssetDeleted() {
        return this.IsAssetDeleted;
    }

    /**
     * Set 受影响资产是否下线
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAssetDeleted 受影响资产是否下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAssetDeleted(String IsAssetDeleted) {
        this.IsAssetDeleted = IsAssetDeleted;
    }

    /**
     * Get 漏洞首次发现时间 
     * @return DiscoverTime 漏洞首次发现时间
     */
    public String getDiscoverTime() {
        return this.DiscoverTime;
    }

    /**
     * Set 漏洞首次发现时间
     * @param DiscoverTime 漏洞首次发现时间
     */
    public void setDiscoverTime(String DiscoverTime) {
        this.DiscoverTime = DiscoverTime;
    }

    /**
     * Get 主机源信息标识符 
     * @return OriginId 主机源信息标识符
     */
    public Long getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 主机源信息标识符
     * @param OriginId 主机源信息标识符
     */
    public void setOriginId(Long OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 资产区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 资产区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资产区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 资产区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vpcid 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcid() {
        return this.Vpcid;
    }

    /**
     * Set 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vpcid 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcid(String Vpcid) {
        this.Vpcid = Vpcid;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 资产子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetSubType 资产子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetSubType() {
        return this.AssetSubType;
    }

    /**
     * Set 资产子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetSubType 资产子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetSubType(String AssetSubType) {
        this.AssetSubType = AssetSubType;
    }

    /**
     * Get 资产IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetIpAll 资产IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetIpAll() {
        return this.AssetIpAll;
    }

    /**
     * Set 资产IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetIpAll 资产IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetIpAll(String [] AssetIpAll) {
        this.AssetIpAll = AssetIpAll;
    }

    /**
     * Get cvm类型的公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses cvm类型的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set cvm类型的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses cvm类型的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get cvm类型的内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIpAddresses cvm类型的内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set cvm类型的内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIpAddresses cvm类型的内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulSource 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulSource() {
        return this.VulSource;
    }

    /**
     * Set 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulSource 漏洞来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulSource(String VulSource) {
        this.VulSource = VulSource;
    }

    /**
     * Get 影响URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedUrl 影响URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAffectedUrl() {
        return this.AffectedUrl;
    }

    /**
     * Set 影响URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedUrl 影响URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedUrl(String AffectedUrl) {
        this.AffectedUrl = AffectedUrl;
    }

    /**
     * Get 资产归属
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaAssetCategory 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSsaAssetCategory() {
        return this.SsaAssetCategory;
    }

    /**
     * Set 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaAssetCategory 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaAssetCategory(Long SsaAssetCategory) {
        this.SsaAssetCategory = SsaAssetCategory;
    }

    /**
     * Get 影响url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulUrl 影响url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulUrl() {
        return this.VulUrl;
    }

    /**
     * Set 影响url
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulUrl 影响url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulUrl(String VulUrl) {
        this.VulUrl = VulUrl;
    }

    /**
     * Get 是否扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpen 是否扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 是否扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpen 是否扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get 御知主机id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YzHostId 御知主机id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getYzHostId() {
        return this.YzHostId;
    }

    /**
     * Set 御知主机id
注意：此字段可能返回 null，表示取不到有效值。
     * @param YzHostId 御知主机id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYzHostId(Long YzHostId) {
        this.YzHostId = YzHostId;
    }

    /**
     * Get 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulRepairPlan 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulRepairPlan() {
        return this.VulRepairPlan;
    }

    /**
     * Set 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulRepairPlan 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulRepairPlan(String VulRepairPlan) {
        this.VulRepairPlan = VulRepairPlan;
    }

    /**
     * Get 漏洞文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulPath 漏洞文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulPath() {
        return this.VulPath;
    }

    /**
     * Set 漏洞文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulPath 漏洞文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulPath(String VulPath) {
        this.VulPath = VulPath;
    }

    public VulItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulItem(VulItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ImpactAssetNum != null) {
            this.ImpactAssetNum = new Long(source.ImpactAssetNum);
        }
        if (source.ImpactAsset != null) {
            this.ImpactAsset = new String(source.ImpactAsset);
        }
        if (source.ImpactAssetName != null) {
            this.ImpactAssetName = new String(source.ImpactAssetName);
        }
        if (source.VulDetail != null) {
            this.VulDetail = new String(source.VulDetail);
        }
        if (source.VulRefLink != null) {
            this.VulRefLink = new String(source.VulRefLink);
        }
        if (source.OldIdMd5 != null) {
            this.OldIdMd5 = new String(source.OldIdMd5);
        }
        if (source.UniqId != null) {
            this.UniqId = new String(source.UniqId);
        }
        if (source.OperateTime != null) {
            this.OperateTime = new String(source.OperateTime);
        }
        if (source.IsAssetDeleted != null) {
            this.IsAssetDeleted = new String(source.IsAssetDeleted);
        }
        if (source.DiscoverTime != null) {
            this.DiscoverTime = new String(source.DiscoverTime);
        }
        if (source.OriginId != null) {
            this.OriginId = new Long(source.OriginId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vpcid != null) {
            this.Vpcid = new String(source.Vpcid);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetSubType != null) {
            this.AssetSubType = new String(source.AssetSubType);
        }
        if (source.AssetIpAll != null) {
            this.AssetIpAll = new String[source.AssetIpAll.length];
            for (int i = 0; i < source.AssetIpAll.length; i++) {
                this.AssetIpAll[i] = new String(source.AssetIpAll[i]);
            }
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.VulSource != null) {
            this.VulSource = new String(source.VulSource);
        }
        if (source.AffectedUrl != null) {
            this.AffectedUrl = new String(source.AffectedUrl);
        }
        if (source.SsaAssetCategory != null) {
            this.SsaAssetCategory = new Long(source.SsaAssetCategory);
        }
        if (source.VulUrl != null) {
            this.VulUrl = new String(source.VulUrl);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
        if (source.YzHostId != null) {
            this.YzHostId = new Long(source.YzHostId);
        }
        if (source.VulRepairPlan != null) {
            this.VulRepairPlan = new String(source.VulRepairPlan);
        }
        if (source.VulPath != null) {
            this.VulPath = new String(source.VulPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ImpactAssetNum", this.ImpactAssetNum);
        this.setParamSimple(map, prefix + "ImpactAsset", this.ImpactAsset);
        this.setParamSimple(map, prefix + "ImpactAssetName", this.ImpactAssetName);
        this.setParamSimple(map, prefix + "VulDetail", this.VulDetail);
        this.setParamSimple(map, prefix + "VulRefLink", this.VulRefLink);
        this.setParamSimple(map, prefix + "OldIdMd5", this.OldIdMd5);
        this.setParamSimple(map, prefix + "UniqId", this.UniqId);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "IsAssetDeleted", this.IsAssetDeleted);
        this.setParamSimple(map, prefix + "DiscoverTime", this.DiscoverTime);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vpcid", this.Vpcid);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetSubType", this.AssetSubType);
        this.setParamArraySimple(map, prefix + "AssetIpAll.", this.AssetIpAll);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "VulSource", this.VulSource);
        this.setParamSimple(map, prefix + "AffectedUrl", this.AffectedUrl);
        this.setParamSimple(map, prefix + "SsaAssetCategory", this.SsaAssetCategory);
        this.setParamSimple(map, prefix + "VulUrl", this.VulUrl);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "YzHostId", this.YzHostId);
        this.setParamSimple(map, prefix + "VulRepairPlan", this.VulRepairPlan);
        this.setParamSimple(map, prefix + "VulPath", this.VulPath);

    }
}

