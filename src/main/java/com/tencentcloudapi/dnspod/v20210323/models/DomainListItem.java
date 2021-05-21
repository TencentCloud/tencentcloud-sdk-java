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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainListItem extends AbstractModel{

    /**
    * 系统分配给域名的唯一标识
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名的原始格式
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 域名的状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名默认的解析记录默认TTL值
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 是否开启CNAME加速，开启：ENABLE，未开启：DISABLE
    */
    @SerializedName("CNAMESpeedup")
    @Expose
    private String CNAMESpeedup;

    /**
    * DNS 设置状态，错误：DNSERROR，正常：空字符串
    */
    @SerializedName("DNSStatus")
    @Expose
    private String DNSStatus;

    /**
    * 域名的套餐等级代码
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 域名所属的分组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 是否开启搜索引擎推送优化，是：YES，否：NO
    */
    @SerializedName("SearchEnginePush")
    @Expose
    private String SearchEnginePush;

    /**
    * 域名备注说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 经过punycode编码后的域名格式
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * 系统为域名分配的有效DNS
    */
    @SerializedName("EffectiveDNS")
    @Expose
    private String [] EffectiveDNS;

    /**
    * 域名套餐等级对应的序号
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * 套餐名称
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * 是否是付费套餐
    */
    @SerializedName("IsVip")
    @Expose
    private String IsVip;

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
    * 域名下的记录数量
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 域名添加时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 域名更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 域名所属账号
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get 系统分配给域名的唯一标识 
     * @return DomainId 系统分配给域名的唯一标识
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 系统分配给域名的唯一标识
     * @param DomainId 系统分配给域名的唯一标识
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名的原始格式 
     * @return Name 域名的原始格式
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 域名的原始格式
     * @param Name 域名的原始格式
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 域名的状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM 
     * @return Status 域名的状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名的状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM
     * @param Status 域名的状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名默认的解析记录默认TTL值 
     * @return TTL 域名默认的解析记录默认TTL值
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 域名默认的解析记录默认TTL值
     * @param TTL 域名默认的解析记录默认TTL值
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 是否开启CNAME加速，开启：ENABLE，未开启：DISABLE 
     * @return CNAMESpeedup 是否开启CNAME加速，开启：ENABLE，未开启：DISABLE
     */
    public String getCNAMESpeedup() {
        return this.CNAMESpeedup;
    }

    /**
     * Set 是否开启CNAME加速，开启：ENABLE，未开启：DISABLE
     * @param CNAMESpeedup 是否开启CNAME加速，开启：ENABLE，未开启：DISABLE
     */
    public void setCNAMESpeedup(String CNAMESpeedup) {
        this.CNAMESpeedup = CNAMESpeedup;
    }

    /**
     * Get DNS 设置状态，错误：DNSERROR，正常：空字符串 
     * @return DNSStatus DNS 设置状态，错误：DNSERROR，正常：空字符串
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * Set DNS 设置状态，错误：DNSERROR，正常：空字符串
     * @param DNSStatus DNS 设置状态，错误：DNSERROR，正常：空字符串
     */
    public void setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
    }

    /**
     * Get 域名的套餐等级代码 
     * @return Grade 域名的套餐等级代码
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 域名的套餐等级代码
     * @param Grade 域名的套餐等级代码
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 域名所属的分组Id 
     * @return GroupId 域名所属的分组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 域名所属的分组Id
     * @param GroupId 域名所属的分组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否开启搜索引擎推送优化，是：YES，否：NO 
     * @return SearchEnginePush 是否开启搜索引擎推送优化，是：YES，否：NO
     */
    public String getSearchEnginePush() {
        return this.SearchEnginePush;
    }

    /**
     * Set 是否开启搜索引擎推送优化，是：YES，否：NO
     * @param SearchEnginePush 是否开启搜索引擎推送优化，是：YES，否：NO
     */
    public void setSearchEnginePush(String SearchEnginePush) {
        this.SearchEnginePush = SearchEnginePush;
    }

    /**
     * Get 域名备注说明 
     * @return Remark 域名备注说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 域名备注说明
     * @param Remark 域名备注说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 经过punycode编码后的域名格式 
     * @return Punycode 经过punycode编码后的域名格式
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set 经过punycode编码后的域名格式
     * @param Punycode 经过punycode编码后的域名格式
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get 系统为域名分配的有效DNS 
     * @return EffectiveDNS 系统为域名分配的有效DNS
     */
    public String [] getEffectiveDNS() {
        return this.EffectiveDNS;
    }

    /**
     * Set 系统为域名分配的有效DNS
     * @param EffectiveDNS 系统为域名分配的有效DNS
     */
    public void setEffectiveDNS(String [] EffectiveDNS) {
        this.EffectiveDNS = EffectiveDNS;
    }

    /**
     * Get 域名套餐等级对应的序号 
     * @return GradeLevel 域名套餐等级对应的序号
     */
    public Long getGradeLevel() {
        return this.GradeLevel;
    }

    /**
     * Set 域名套餐等级对应的序号
     * @param GradeLevel 域名套餐等级对应的序号
     */
    public void setGradeLevel(Long GradeLevel) {
        this.GradeLevel = GradeLevel;
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
     * Get 是否是付费套餐 
     * @return IsVip 是否是付费套餐
     */
    public String getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否是付费套餐
     * @param IsVip 是否是付费套餐
     */
    public void setIsVip(String IsVip) {
        this.IsVip = IsVip;
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
     * Get 域名下的记录数量 
     * @return RecordCount 域名下的记录数量
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 域名下的记录数量
     * @param RecordCount 域名下的记录数量
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 域名添加时间 
     * @return CreatedOn 域名添加时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 域名添加时间
     * @param CreatedOn 域名添加时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 域名更新时间 
     * @return UpdatedOn 域名更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 域名更新时间
     * @param UpdatedOn 域名更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 域名所属账号 
     * @return Owner 域名所属账号
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 域名所属账号
     * @param Owner 域名所属账号
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public DomainListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainListItem(DomainListItem source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.CNAMESpeedup != null) {
            this.CNAMESpeedup = new String(source.CNAMESpeedup);
        }
        if (source.DNSStatus != null) {
            this.DNSStatus = new String(source.DNSStatus);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.SearchEnginePush != null) {
            this.SearchEnginePush = new String(source.SearchEnginePush);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Punycode != null) {
            this.Punycode = new String(source.Punycode);
        }
        if (source.EffectiveDNS != null) {
            this.EffectiveDNS = new String[source.EffectiveDNS.length];
            for (int i = 0; i < source.EffectiveDNS.length; i++) {
                this.EffectiveDNS[i] = new String(source.EffectiveDNS[i]);
            }
        }
        if (source.GradeLevel != null) {
            this.GradeLevel = new Long(source.GradeLevel);
        }
        if (source.GradeTitle != null) {
            this.GradeTitle = new String(source.GradeTitle);
        }
        if (source.IsVip != null) {
            this.IsVip = new String(source.IsVip);
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
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "CNAMESpeedup", this.CNAMESpeedup);
        this.setParamSimple(map, prefix + "DNSStatus", this.DNSStatus);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SearchEnginePush", this.SearchEnginePush);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Punycode", this.Punycode);
        this.setParamArraySimple(map, prefix + "EffectiveDNS.", this.EffectiveDNS);
        this.setParamSimple(map, prefix + "GradeLevel", this.GradeLevel);
        this.setParamSimple(map, prefix + "GradeTitle", this.GradeTitle);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "VipStartAt", this.VipStartAt);
        this.setParamSimple(map, prefix + "VipEndAt", this.VipEndAt);
        this.setParamSimple(map, prefix + "VipAutoRenew", this.VipAutoRenew);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

