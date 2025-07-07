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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageListItem extends AbstractModel {

    /**
    * 域名ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名的原始格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 套餐等级代码
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 套餐名称
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * 付费套餐开通时间
    */
    @SerializedName("VipStartAt")
    @Expose
    private String VipStartAt;

    /**
    * 付费套餐到期时间
    */
    @SerializedName("VipEndAt")
    @Expose
    private String VipEndAt;

    /**
    * 域名是否开通VIP自动续费，是：YES，否：NO，默认：DEFAULT
    */
    @SerializedName("VipAutoRenew")
    @Expose
    private String VipAutoRenew;

    /**
    * 套餐剩余换绑/绑定域名次数
    */
    @SerializedName("RemainTimes")
    @Expose
    private Long RemainTimes;

    /**
    * 套餐资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 域名等级代号
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * 套餐绑定的域名的状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 套餐是否处于宽限期
    */
    @SerializedName("IsGracePeriod")
    @Expose
    private String IsGracePeriod;

    /**
    * 是否降级
    */
    @SerializedName("Downgrade")
    @Expose
    private Boolean Downgrade;

    /**
    * 关联安全防护信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityInfo")
    @Expose
    private SecurityInfo SecurityInfo;

    /**
    * 套餐绑定的域名是否为子域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSubDomain")
    @Expose
    private Boolean IsSubDomain;

    /**
     * Get 域名ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainId 域名ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainId 域名ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名的原始格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名的原始格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名的原始格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名的原始格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 套餐等级代码 
     * @return Grade 套餐等级代码
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 套餐等级代码
     * @param Grade 套餐等级代码
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 套餐名称 
     * @return GradeTitle 套餐名称
     */
    public String getGradeTitle() {
        return this.GradeTitle;
    }

    /**
     * Set 套餐名称
     * @param GradeTitle 套餐名称
     */
    public void setGradeTitle(String GradeTitle) {
        this.GradeTitle = GradeTitle;
    }

    /**
     * Get 付费套餐开通时间 
     * @return VipStartAt 付费套餐开通时间
     */
    public String getVipStartAt() {
        return this.VipStartAt;
    }

    /**
     * Set 付费套餐开通时间
     * @param VipStartAt 付费套餐开通时间
     */
    public void setVipStartAt(String VipStartAt) {
        this.VipStartAt = VipStartAt;
    }

    /**
     * Get 付费套餐到期时间 
     * @return VipEndAt 付费套餐到期时间
     */
    public String getVipEndAt() {
        return this.VipEndAt;
    }

    /**
     * Set 付费套餐到期时间
     * @param VipEndAt 付费套餐到期时间
     */
    public void setVipEndAt(String VipEndAt) {
        this.VipEndAt = VipEndAt;
    }

    /**
     * Get 域名是否开通VIP自动续费，是：YES，否：NO，默认：DEFAULT 
     * @return VipAutoRenew 域名是否开通VIP自动续费，是：YES，否：NO，默认：DEFAULT
     */
    public String getVipAutoRenew() {
        return this.VipAutoRenew;
    }

    /**
     * Set 域名是否开通VIP自动续费，是：YES，否：NO，默认：DEFAULT
     * @param VipAutoRenew 域名是否开通VIP自动续费，是：YES，否：NO，默认：DEFAULT
     */
    public void setVipAutoRenew(String VipAutoRenew) {
        this.VipAutoRenew = VipAutoRenew;
    }

    /**
     * Get 套餐剩余换绑/绑定域名次数 
     * @return RemainTimes 套餐剩余换绑/绑定域名次数
     */
    public Long getRemainTimes() {
        return this.RemainTimes;
    }

    /**
     * Set 套餐剩余换绑/绑定域名次数
     * @param RemainTimes 套餐剩余换绑/绑定域名次数
     */
    public void setRemainTimes(Long RemainTimes) {
        this.RemainTimes = RemainTimes;
    }

    /**
     * Get 套餐资源ID 
     * @return ResourceId 套餐资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 套餐资源ID
     * @param ResourceId 套餐资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 域名等级代号 
     * @return GradeLevel 域名等级代号
     */
    public Long getGradeLevel() {
        return this.GradeLevel;
    }

    /**
     * Set 域名等级代号
     * @param GradeLevel 域名等级代号
     */
    public void setGradeLevel(Long GradeLevel) {
        this.GradeLevel = GradeLevel;
    }

    /**
     * Get 套餐绑定的域名的状态 
     * @return Status 套餐绑定的域名的状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 套餐绑定的域名的状态
     * @param Status 套餐绑定的域名的状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 套餐是否处于宽限期 
     * @return IsGracePeriod 套餐是否处于宽限期
     */
    public String getIsGracePeriod() {
        return this.IsGracePeriod;
    }

    /**
     * Set 套餐是否处于宽限期
     * @param IsGracePeriod 套餐是否处于宽限期
     */
    public void setIsGracePeriod(String IsGracePeriod) {
        this.IsGracePeriod = IsGracePeriod;
    }

    /**
     * Get 是否降级 
     * @return Downgrade 是否降级
     */
    public Boolean getDowngrade() {
        return this.Downgrade;
    }

    /**
     * Set 是否降级
     * @param Downgrade 是否降级
     */
    public void setDowngrade(Boolean Downgrade) {
        this.Downgrade = Downgrade;
    }

    /**
     * Get 关联安全防护信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityInfo 关联安全防护信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityInfo getSecurityInfo() {
        return this.SecurityInfo;
    }

    /**
     * Set 关联安全防护信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityInfo 关联安全防护信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityInfo(SecurityInfo SecurityInfo) {
        this.SecurityInfo = SecurityInfo;
    }

    /**
     * Get 套餐绑定的域名是否为子域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSubDomain 套餐绑定的域名是否为子域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSubDomain() {
        return this.IsSubDomain;
    }

    /**
     * Set 套餐绑定的域名是否为子域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSubDomain 套餐绑定的域名是否为子域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSubDomain(Boolean IsSubDomain) {
        this.IsSubDomain = IsSubDomain;
    }

    public PackageListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageListItem(PackageListItem source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.GradeTitle != null) {
            this.GradeTitle = new String(source.GradeTitle);
        }
        if (source.VipStartAt != null) {
            this.VipStartAt = new String(source.VipStartAt);
        }
        if (source.VipEndAt != null) {
            this.VipEndAt = new String(source.VipEndAt);
        }
        if (source.VipAutoRenew != null) {
            this.VipAutoRenew = new String(source.VipAutoRenew);
        }
        if (source.RemainTimes != null) {
            this.RemainTimes = new Long(source.RemainTimes);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.GradeLevel != null) {
            this.GradeLevel = new Long(source.GradeLevel);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsGracePeriod != null) {
            this.IsGracePeriod = new String(source.IsGracePeriod);
        }
        if (source.Downgrade != null) {
            this.Downgrade = new Boolean(source.Downgrade);
        }
        if (source.SecurityInfo != null) {
            this.SecurityInfo = new SecurityInfo(source.SecurityInfo);
        }
        if (source.IsSubDomain != null) {
            this.IsSubDomain = new Boolean(source.IsSubDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GradeTitle", this.GradeTitle);
        this.setParamSimple(map, prefix + "VipStartAt", this.VipStartAt);
        this.setParamSimple(map, prefix + "VipEndAt", this.VipEndAt);
        this.setParamSimple(map, prefix + "VipAutoRenew", this.VipAutoRenew);
        this.setParamSimple(map, prefix + "RemainTimes", this.RemainTimes);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "GradeLevel", this.GradeLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsGracePeriod", this.IsGracePeriod);
        this.setParamSimple(map, prefix + "Downgrade", this.Downgrade);
        this.setParamObj(map, prefix + "SecurityInfo.", this.SecurityInfo);
        this.setParamSimple(map, prefix + "IsSubDomain", this.IsSubDomain);

    }
}

