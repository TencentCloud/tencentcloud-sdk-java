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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Zone extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 同名站点标识。允许输入数字、英文、"." 、"-" 和 "_" 组合，长度 200 个字符以内。
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * 站点加速区域，取值有：
<li> global：全球可用区；</li>
<li> mainland：中国大陆可用区；</li>
<li> overseas：全球可用区（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 站点接入类型，取值有：
<li> full：NS 接入类型；</li>
<li> partial：CNAME 接入类型；</li>
<li> noDomainAccess：无域名接入类型；</li>
<li>dnsPodAccess：DNSPod 托管类型，该类型要求您的域名已托管在腾讯云 DNSPod；</li>
<li> pages：Pages 类型。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 站点关联的标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 计费资源列表。
    */
    @SerializedName("Resources")
    @Expose
    private Resource [] Resources;

    /**
    * NS 类型站点详情。仅当 Type = full 时返回值。
    */
    @SerializedName("NSDetail")
    @Expose
    private NSDetail NSDetail;

    /**
    * CNAME 类型站点详情。仅当 Type = partial 时返回值。
    */
    @SerializedName("CNAMEDetail")
    @Expose
    private CNAMEDetail CNAMEDetail;

    /**
    * DNSPod 托管类型站点详情。仅当 Type = dnsPodAccess 时返回值。
    */
    @SerializedName("DNSPodDetail")
    @Expose
    private DNSPodDetail DNSPodDetail;

    /**
    * 站点创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 站点修改时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
<li> initializing：待绑定套餐。 </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CNAME 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * 展示状态，取值有：
<li> active：已启用；</li>
<li> inactive：未生效；</li>
<li> paused：已停用。</li>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private String ActiveStatus;

    /**
    * 锁定状态，取值有：<li> enable：正常，允许进行修改操作；</li><li> disable：锁定中，不允许进行修改操作；</li><li> plan_migrate：套餐迁移中，不允许进行修改操作。</li>
    */
    @SerializedName("LockStatus")
    @Expose
    private String LockStatus;

    /**
    * 站点是否关闭。
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * 是否伪站点（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * 是否开启 CNAME 加速（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * 归属权验证信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * 站点当前使用的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * 腾讯云分配的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * 用户自定义 NS 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * 用户自定义 NS IP 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
    * 版本管理配置组工作模式。站点各配置模块可按照配置组维度开启「版本管理模式」或「即时生效模式」，详情请参考 [版本管理](https://cloud.tencent.com/document/product/1552/113690)。
    */
    @SerializedName("WorkModeInfos")
    @Expose
    private ConfigGroupWorkModeInfo [] WorkModeInfos;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 同名站点标识。允许输入数字、英文、"." 、"-" 和 "_" 组合，长度 200 个字符以内。 
     * @return AliasZoneName 同名站点标识。允许输入数字、英文、"." 、"-" 和 "_" 组合，长度 200 个字符以内。
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set 同名站点标识。允许输入数字、英文、"." 、"-" 和 "_" 组合，长度 200 个字符以内。
     * @param AliasZoneName 同名站点标识。允许输入数字、英文、"." 、"-" 和 "_" 组合，长度 200 个字符以内。
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get 站点加速区域，取值有：
<li> global：全球可用区；</li>
<li> mainland：中国大陆可用区；</li>
<li> overseas：全球可用区（不含中国大陆）。</li> 
     * @return Area 站点加速区域，取值有：
<li> global：全球可用区；</li>
<li> mainland：中国大陆可用区；</li>
<li> overseas：全球可用区（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 站点加速区域，取值有：
<li> global：全球可用区；</li>
<li> mainland：中国大陆可用区；</li>
<li> overseas：全球可用区（不含中国大陆）。</li>
     * @param Area 站点加速区域，取值有：
<li> global：全球可用区；</li>
<li> mainland：中国大陆可用区；</li>
<li> overseas：全球可用区（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 站点接入类型，取值有：
<li> full：NS 接入类型；</li>
<li> partial：CNAME 接入类型；</li>
<li> noDomainAccess：无域名接入类型；</li>
<li>dnsPodAccess：DNSPod 托管类型，该类型要求您的域名已托管在腾讯云 DNSPod；</li>
<li> pages：Pages 类型。</li> 
     * @return Type 站点接入类型，取值有：
<li> full：NS 接入类型；</li>
<li> partial：CNAME 接入类型；</li>
<li> noDomainAccess：无域名接入类型；</li>
<li>dnsPodAccess：DNSPod 托管类型，该类型要求您的域名已托管在腾讯云 DNSPod；</li>
<li> pages：Pages 类型。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入类型，取值有：
<li> full：NS 接入类型；</li>
<li> partial：CNAME 接入类型；</li>
<li> noDomainAccess：无域名接入类型；</li>
<li>dnsPodAccess：DNSPod 托管类型，该类型要求您的域名已托管在腾讯云 DNSPod；</li>
<li> pages：Pages 类型。</li>
     * @param Type 站点接入类型，取值有：
<li> full：NS 接入类型；</li>
<li> partial：CNAME 接入类型；</li>
<li> noDomainAccess：无域名接入类型；</li>
<li>dnsPodAccess：DNSPod 托管类型，该类型要求您的域名已托管在腾讯云 DNSPod；</li>
<li> pages：Pages 类型。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 站点关联的标签。 
     * @return Tags 站点关联的标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 站点关联的标签。
     * @param Tags 站点关联的标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 计费资源列表。 
     * @return Resources 计费资源列表。
     */
    public Resource [] getResources() {
        return this.Resources;
    }

    /**
     * Set 计费资源列表。
     * @param Resources 计费资源列表。
     */
    public void setResources(Resource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get NS 类型站点详情。仅当 Type = full 时返回值。 
     * @return NSDetail NS 类型站点详情。仅当 Type = full 时返回值。
     */
    public NSDetail getNSDetail() {
        return this.NSDetail;
    }

    /**
     * Set NS 类型站点详情。仅当 Type = full 时返回值。
     * @param NSDetail NS 类型站点详情。仅当 Type = full 时返回值。
     */
    public void setNSDetail(NSDetail NSDetail) {
        this.NSDetail = NSDetail;
    }

    /**
     * Get CNAME 类型站点详情。仅当 Type = partial 时返回值。 
     * @return CNAMEDetail CNAME 类型站点详情。仅当 Type = partial 时返回值。
     */
    public CNAMEDetail getCNAMEDetail() {
        return this.CNAMEDetail;
    }

    /**
     * Set CNAME 类型站点详情。仅当 Type = partial 时返回值。
     * @param CNAMEDetail CNAME 类型站点详情。仅当 Type = partial 时返回值。
     */
    public void setCNAMEDetail(CNAMEDetail CNAMEDetail) {
        this.CNAMEDetail = CNAMEDetail;
    }

    /**
     * Get DNSPod 托管类型站点详情。仅当 Type = dnsPodAccess 时返回值。 
     * @return DNSPodDetail DNSPod 托管类型站点详情。仅当 Type = dnsPodAccess 时返回值。
     */
    public DNSPodDetail getDNSPodDetail() {
        return this.DNSPodDetail;
    }

    /**
     * Set DNSPod 托管类型站点详情。仅当 Type = dnsPodAccess 时返回值。
     * @param DNSPodDetail DNSPod 托管类型站点详情。仅当 Type = dnsPodAccess 时返回值。
     */
    public void setDNSPodDetail(DNSPodDetail DNSPodDetail) {
        this.DNSPodDetail = DNSPodDetail;
    }

    /**
     * Get 站点创建时间。 
     * @return CreatedOn 站点创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 站点创建时间。
     * @param CreatedOn 站点创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 站点修改时间。 
     * @return ModifiedOn 站点修改时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 站点修改时间。
     * @param ModifiedOn 站点修改时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
<li> initializing：待绑定套餐。 </li> 
     * @return Status 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
<li> initializing：待绑定套餐。 </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
<li> initializing：待绑定套餐。 </li>
     * @param Status 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
<li> initializing：待绑定套餐。 </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CNAME 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li> 
     * @return CnameStatus CNAME 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set CNAME 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
     * @param CnameStatus CNAME 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get 展示状态，取值有：
<li> active：已启用；</li>
<li> inactive：未生效；</li>
<li> paused：已停用。</li> 
     * @return ActiveStatus 展示状态，取值有：
<li> active：已启用；</li>
<li> inactive：未生效；</li>
<li> paused：已停用。</li>
     */
    public String getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set 展示状态，取值有：
<li> active：已启用；</li>
<li> inactive：未生效；</li>
<li> paused：已停用。</li>
     * @param ActiveStatus 展示状态，取值有：
<li> active：已启用；</li>
<li> inactive：未生效；</li>
<li> paused：已停用。</li>
     */
    public void setActiveStatus(String ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get 锁定状态，取值有：<li> enable：正常，允许进行修改操作；</li><li> disable：锁定中，不允许进行修改操作；</li><li> plan_migrate：套餐迁移中，不允许进行修改操作。</li> 
     * @return LockStatus 锁定状态，取值有：<li> enable：正常，允许进行修改操作；</li><li> disable：锁定中，不允许进行修改操作；</li><li> plan_migrate：套餐迁移中，不允许进行修改操作。</li>
     */
    public String getLockStatus() {
        return this.LockStatus;
    }

    /**
     * Set 锁定状态，取值有：<li> enable：正常，允许进行修改操作；</li><li> disable：锁定中，不允许进行修改操作；</li><li> plan_migrate：套餐迁移中，不允许进行修改操作。</li>
     * @param LockStatus 锁定状态，取值有：<li> enable：正常，允许进行修改操作；</li><li> disable：锁定中，不允许进行修改操作；</li><li> plan_migrate：套餐迁移中，不允许进行修改操作。</li>
     */
    public void setLockStatus(String LockStatus) {
        this.LockStatus = LockStatus;
    }

    /**
     * Get 站点是否关闭。 
     * @return Paused 站点是否关闭。
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set 站点是否关闭。
     * @param Paused 站点是否关闭。
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get 是否伪站点（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>
 
     * @return IsFake 是否伪站点（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set 是否伪站点（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

     * @param IsFake 是否伪站点（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get 是否开启 CNAME 加速（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li> 
     * @return CnameSpeedUp 是否开启 CNAME 加速（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set 是否开启 CNAME 加速（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     * @param CnameSpeedUp 是否开启 CNAME 加速（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段），取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get 归属权验证信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnershipVerification 归属权验证信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set 归属权验证信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnershipVerification 归属权验证信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get 站点当前使用的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段） 
     * @return OriginalNameServers 站点当前使用的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set 站点当前使用的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
     * @param OriginalNameServers 站点当前使用的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get 腾讯云分配的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段） 
     * @return NameServers 腾讯云分配的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 腾讯云分配的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
     * @param NameServers 腾讯云分配的 NS 列表。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get 用户自定义 NS 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VanityNameServers 用户自定义 NS 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set 用户自定义 NS 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VanityNameServers 用户自定义 NS 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get 用户自定义 NS IP 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VanityNameServersIps 用户自定义 NS IP 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set 用户自定义 NS IP 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VanityNameServersIps 用户自定义 NS IP 信息。（该字段为历史保留字段，已不再维护，请根据站点类型参考对应字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    /**
     * Get 版本管理配置组工作模式。站点各配置模块可按照配置组维度开启「版本管理模式」或「即时生效模式」，详情请参考 [版本管理](https://cloud.tencent.com/document/product/1552/113690)。 
     * @return WorkModeInfos 版本管理配置组工作模式。站点各配置模块可按照配置组维度开启「版本管理模式」或「即时生效模式」，详情请参考 [版本管理](https://cloud.tencent.com/document/product/1552/113690)。
     */
    public ConfigGroupWorkModeInfo [] getWorkModeInfos() {
        return this.WorkModeInfos;
    }

    /**
     * Set 版本管理配置组工作模式。站点各配置模块可按照配置组维度开启「版本管理模式」或「即时生效模式」，详情请参考 [版本管理](https://cloud.tencent.com/document/product/1552/113690)。
     * @param WorkModeInfos 版本管理配置组工作模式。站点各配置模块可按照配置组维度开启「版本管理模式」或「即时生效模式」，详情请参考 [版本管理](https://cloud.tencent.com/document/product/1552/113690)。
     */
    public void setWorkModeInfos(ConfigGroupWorkModeInfo [] WorkModeInfos) {
        this.WorkModeInfos = WorkModeInfos;
    }

    public Zone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Zone(Zone source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new Resource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new Resource(source.Resources[i]);
            }
        }
        if (source.NSDetail != null) {
            this.NSDetail = new NSDetail(source.NSDetail);
        }
        if (source.CNAMEDetail != null) {
            this.CNAMEDetail = new CNAMEDetail(source.CNAMEDetail);
        }
        if (source.DNSPodDetail != null) {
            this.DNSPodDetail = new DNSPodDetail(source.DNSPodDetail);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new String(source.CnameStatus);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new String(source.ActiveStatus);
        }
        if (source.LockStatus != null) {
            this.LockStatus = new String(source.LockStatus);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.IsFake != null) {
            this.IsFake = new Long(source.IsFake);
        }
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.VanityNameServersIps != null) {
            this.VanityNameServersIps = new VanityNameServersIps[source.VanityNameServersIps.length];
            for (int i = 0; i < source.VanityNameServersIps.length; i++) {
                this.VanityNameServersIps[i] = new VanityNameServersIps(source.VanityNameServersIps[i]);
            }
        }
        if (source.WorkModeInfos != null) {
            this.WorkModeInfos = new ConfigGroupWorkModeInfo[source.WorkModeInfos.length];
            for (int i = 0; i < source.WorkModeInfos.length; i++) {
                this.WorkModeInfos[i] = new ConfigGroupWorkModeInfo(source.WorkModeInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "NSDetail.", this.NSDetail);
        this.setParamObj(map, prefix + "CNAMEDetail.", this.CNAMEDetail);
        this.setParamObj(map, prefix + "DNSPodDetail.", this.DNSPodDetail);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);
        this.setParamSimple(map, prefix + "LockStatus", this.LockStatus);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamSimple(map, prefix + "IsFake", this.IsFake);
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);
        this.setParamArrayObj(map, prefix + "WorkModeInfos.", this.WorkModeInfos);

    }
}

