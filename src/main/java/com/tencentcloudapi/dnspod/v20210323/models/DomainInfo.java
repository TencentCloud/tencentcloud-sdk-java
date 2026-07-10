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

public class DomainInfo extends AbstractModel {

    /**
    * <p>域名ID</p>
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * <p>域名状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>域名套餐等级</p>
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * <p>域名分组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>是否星标域名</p>
    */
    @SerializedName("IsMark")
    @Expose
    private String IsMark;

    /**
    * <p>TTL(DNS记录缓存时间)，单位：秒</p>
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * <p>CNAME加速启用状态</p>
    */
    @SerializedName("CnameSpeedup")
    @Expose
    private String CnameSpeedup;

    /**
    * <p>域名备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>域名Punycode</p>
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
    */
    @SerializedName("DnsStatus")
    @Expose
    private String DnsStatus;

    /**
    * <p>域名的NS列表</p>
    */
    @SerializedName("DnspodNsList")
    @Expose
    private String [] DnspodNsList;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名等级代号</p>
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * <p>域名所属的用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * <p>是否为付费域名</p>
    */
    @SerializedName("IsVip")
    @Expose
    private String IsVip;

    /**
    * <p>域名所有者的账号</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>域名等级的描述</p>
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * <p>域名创建时间</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>最后操作时间</p>
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * <p>腾讯云账户Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>域名实际使用的NS列表</p>
    */
    @SerializedName("ActualNsList")
    @Expose
    private String [] ActualNsList;

    /**
    * <p>域名的记录数量</p>
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * <p>域名所有者的账户昵称</p>
    */
    @SerializedName("OwnerNick")
    @Expose
    private String OwnerNick;

    /**
    * <p>是否在付费套餐宽限期</p>
    */
    @SerializedName("IsGracePeriod")
    @Expose
    private String IsGracePeriod;

    /**
    * <p>是否在付费套餐缓冲期</p>
    */
    @SerializedName("VipBuffered")
    @Expose
    private String VipBuffered;

    /**
    * <p>VIP套餐有效期开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipStartAt")
    @Expose
    private String VipStartAt;

    /**
    * <p>VIP套餐有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipEndAt")
    @Expose
    private String VipEndAt;

    /**
    * <p>VIP套餐自动续费标识。可能的值为：default-默认；no-不自动续费；yes-自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipAutoRenew")
    @Expose
    private String VipAutoRenew;

    /**
    * <p>VIP套餐资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipResourceId")
    @Expose
    private String VipResourceId;

    /**
    * <p>是否是子域名。</p>
    */
    @SerializedName("IsSubDomain")
    @Expose
    private Boolean IsSubDomain;

    /**
    * <p>域名关联的标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagItem [] TagList;

    /**
    * <p>是否启用搜索引擎推送</p>
    */
    @SerializedName("SearchEnginePush")
    @Expose
    private String SearchEnginePush;

    /**
    * <p>是否开启辅助 DNS</p>
    */
    @SerializedName("SlaveDNS")
    @Expose
    private String SlaveDNS;

    /**
    * <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
    */
    @SerializedName("DNSStatus")
    @Expose
    private String DNSStatus;

    /**
    * <p>CNAME加速启用状态</p>
    */
    @SerializedName("CNAMESpeedup")
    @Expose
    private String CNAMESpeedup;

    /**
     * Get <p>域名ID</p> 
     * @return DomainId <p>域名ID</p>
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名ID</p>
     * @param DomainId <p>域名ID</p>
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>域名状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM</p> 
     * @return Status <p>域名状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>域名状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM</p>
     * @param Status <p>域名状态，正常：ENABLE，暂停：PAUSE，封禁：SPAM</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>域名套餐等级</p> 
     * @return Grade <p>域名套餐等级</p>
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set <p>域名套餐等级</p>
     * @param Grade <p>域名套餐等级</p>
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get <p>域名分组ID</p> 
     * @return GroupId <p>域名分组ID</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>域名分组ID</p>
     * @param GroupId <p>域名分组ID</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>是否星标域名</p> 
     * @return IsMark <p>是否星标域名</p>
     */
    public String getIsMark() {
        return this.IsMark;
    }

    /**
     * Set <p>是否星标域名</p>
     * @param IsMark <p>是否星标域名</p>
     */
    public void setIsMark(String IsMark) {
        this.IsMark = IsMark;
    }

    /**
     * Get <p>TTL(DNS记录缓存时间)，单位：秒</p> 
     * @return TTL <p>TTL(DNS记录缓存时间)，单位：秒</p>
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set <p>TTL(DNS记录缓存时间)，单位：秒</p>
     * @param TTL <p>TTL(DNS记录缓存时间)，单位：秒</p>
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get <p>CNAME加速启用状态</p> 
     * @return CnameSpeedup <p>CNAME加速启用状态</p>
     * @deprecated
     */
    @Deprecated
    public String getCnameSpeedup() {
        return this.CnameSpeedup;
    }

    /**
     * Set <p>CNAME加速启用状态</p>
     * @param CnameSpeedup <p>CNAME加速启用状态</p>
     * @deprecated
     */
    @Deprecated
    public void setCnameSpeedup(String CnameSpeedup) {
        this.CnameSpeedup = CnameSpeedup;
    }

    /**
     * Get <p>域名备注</p> 
     * @return Remark <p>域名备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>域名备注</p>
     * @param Remark <p>域名备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>域名Punycode</p> 
     * @return Punycode <p>域名Punycode</p>
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set <p>域名Punycode</p>
     * @param Punycode <p>域名Punycode</p>
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get <p>域名DNS状态，错误：dnserror，正常：空字符串</p> 
     * @return DnsStatus <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
     * @deprecated
     */
    @Deprecated
    public String getDnsStatus() {
        return this.DnsStatus;
    }

    /**
     * Set <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
     * @param DnsStatus <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
     * @deprecated
     */
    @Deprecated
    public void setDnsStatus(String DnsStatus) {
        this.DnsStatus = DnsStatus;
    }

    /**
     * Get <p>域名的NS列表</p> 
     * @return DnspodNsList <p>域名的NS列表</p>
     */
    public String [] getDnspodNsList() {
        return this.DnspodNsList;
    }

    /**
     * Set <p>域名的NS列表</p>
     * @param DnspodNsList <p>域名的NS列表</p>
     */
    public void setDnspodNsList(String [] DnspodNsList) {
        this.DnspodNsList = DnspodNsList;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名等级代号</p> 
     * @return GradeLevel <p>域名等级代号</p>
     */
    public Long getGradeLevel() {
        return this.GradeLevel;
    }

    /**
     * Set <p>域名等级代号</p>
     * @param GradeLevel <p>域名等级代号</p>
     */
    public void setGradeLevel(Long GradeLevel) {
        this.GradeLevel = GradeLevel;
    }

    /**
     * Get <p>域名所属的用户ID</p> 
     * @return UserId <p>域名所属的用户ID</p>
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>域名所属的用户ID</p>
     * @param UserId <p>域名所属的用户ID</p>
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>是否为付费域名</p> 
     * @return IsVip <p>是否为付费域名</p>
     */
    public String getIsVip() {
        return this.IsVip;
    }

    /**
     * Set <p>是否为付费域名</p>
     * @param IsVip <p>是否为付费域名</p>
     */
    public void setIsVip(String IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get <p>域名所有者的账号</p> 
     * @return Owner <p>域名所有者的账号</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>域名所有者的账号</p>
     * @param Owner <p>域名所有者的账号</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>域名等级的描述</p> 
     * @return GradeTitle <p>域名等级的描述</p>
     */
    public String getGradeTitle() {
        return this.GradeTitle;
    }

    /**
     * Set <p>域名等级的描述</p>
     * @param GradeTitle <p>域名等级的描述</p>
     */
    public void setGradeTitle(String GradeTitle) {
        this.GradeTitle = GradeTitle;
    }

    /**
     * Get <p>域名创建时间</p> 
     * @return CreatedOn <p>域名创建时间</p>
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>域名创建时间</p>
     * @param CreatedOn <p>域名创建时间</p>
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>最后操作时间</p> 
     * @return UpdatedOn <p>最后操作时间</p>
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set <p>最后操作时间</p>
     * @param UpdatedOn <p>最后操作时间</p>
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get <p>腾讯云账户Uin</p> 
     * @return Uin <p>腾讯云账户Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>腾讯云账户Uin</p>
     * @param Uin <p>腾讯云账户Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>域名实际使用的NS列表</p> 
     * @return ActualNsList <p>域名实际使用的NS列表</p>
     */
    public String [] getActualNsList() {
        return this.ActualNsList;
    }

    /**
     * Set <p>域名实际使用的NS列表</p>
     * @param ActualNsList <p>域名实际使用的NS列表</p>
     */
    public void setActualNsList(String [] ActualNsList) {
        this.ActualNsList = ActualNsList;
    }

    /**
     * Get <p>域名的记录数量</p> 
     * @return RecordCount <p>域名的记录数量</p>
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set <p>域名的记录数量</p>
     * @param RecordCount <p>域名的记录数量</p>
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get <p>域名所有者的账户昵称</p> 
     * @return OwnerNick <p>域名所有者的账户昵称</p>
     */
    public String getOwnerNick() {
        return this.OwnerNick;
    }

    /**
     * Set <p>域名所有者的账户昵称</p>
     * @param OwnerNick <p>域名所有者的账户昵称</p>
     */
    public void setOwnerNick(String OwnerNick) {
        this.OwnerNick = OwnerNick;
    }

    /**
     * Get <p>是否在付费套餐宽限期</p> 
     * @return IsGracePeriod <p>是否在付费套餐宽限期</p>
     */
    public String getIsGracePeriod() {
        return this.IsGracePeriod;
    }

    /**
     * Set <p>是否在付费套餐宽限期</p>
     * @param IsGracePeriod <p>是否在付费套餐宽限期</p>
     */
    public void setIsGracePeriod(String IsGracePeriod) {
        this.IsGracePeriod = IsGracePeriod;
    }

    /**
     * Get <p>是否在付费套餐缓冲期</p> 
     * @return VipBuffered <p>是否在付费套餐缓冲期</p>
     */
    public String getVipBuffered() {
        return this.VipBuffered;
    }

    /**
     * Set <p>是否在付费套餐缓冲期</p>
     * @param VipBuffered <p>是否在付费套餐缓冲期</p>
     */
    public void setVipBuffered(String VipBuffered) {
        this.VipBuffered = VipBuffered;
    }

    /**
     * Get <p>VIP套餐有效期开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipStartAt <p>VIP套餐有效期开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipStartAt() {
        return this.VipStartAt;
    }

    /**
     * Set <p>VIP套餐有效期开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipStartAt <p>VIP套餐有效期开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipStartAt(String VipStartAt) {
        this.VipStartAt = VipStartAt;
    }

    /**
     * Get <p>VIP套餐有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipEndAt <p>VIP套餐有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipEndAt() {
        return this.VipEndAt;
    }

    /**
     * Set <p>VIP套餐有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipEndAt <p>VIP套餐有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipEndAt(String VipEndAt) {
        this.VipEndAt = VipEndAt;
    }

    /**
     * Get <p>VIP套餐自动续费标识。可能的值为：default-默认；no-不自动续费；yes-自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipAutoRenew <p>VIP套餐自动续费标识。可能的值为：default-默认；no-不自动续费；yes-自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipAutoRenew() {
        return this.VipAutoRenew;
    }

    /**
     * Set <p>VIP套餐自动续费标识。可能的值为：default-默认；no-不自动续费；yes-自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipAutoRenew <p>VIP套餐自动续费标识。可能的值为：default-默认；no-不自动续费；yes-自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipAutoRenew(String VipAutoRenew) {
        this.VipAutoRenew = VipAutoRenew;
    }

    /**
     * Get <p>VIP套餐资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipResourceId <p>VIP套餐资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipResourceId() {
        return this.VipResourceId;
    }

    /**
     * Set <p>VIP套餐资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipResourceId <p>VIP套餐资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipResourceId(String VipResourceId) {
        this.VipResourceId = VipResourceId;
    }

    /**
     * Get <p>是否是子域名。</p> 
     * @return IsSubDomain <p>是否是子域名。</p>
     */
    public Boolean getIsSubDomain() {
        return this.IsSubDomain;
    }

    /**
     * Set <p>是否是子域名。</p>
     * @param IsSubDomain <p>是否是子域名。</p>
     */
    public void setIsSubDomain(Boolean IsSubDomain) {
        this.IsSubDomain = IsSubDomain;
    }

    /**
     * Get <p>域名关联的标签列表</p> 
     * @return TagList <p>域名关联的标签列表</p>
     */
    public TagItem [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>域名关联的标签列表</p>
     * @param TagList <p>域名关联的标签列表</p>
     */
    public void setTagList(TagItem [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>是否启用搜索引擎推送</p> 
     * @return SearchEnginePush <p>是否启用搜索引擎推送</p>
     */
    public String getSearchEnginePush() {
        return this.SearchEnginePush;
    }

    /**
     * Set <p>是否启用搜索引擎推送</p>
     * @param SearchEnginePush <p>是否启用搜索引擎推送</p>
     */
    public void setSearchEnginePush(String SearchEnginePush) {
        this.SearchEnginePush = SearchEnginePush;
    }

    /**
     * Get <p>是否开启辅助 DNS</p> 
     * @return SlaveDNS <p>是否开启辅助 DNS</p>
     */
    public String getSlaveDNS() {
        return this.SlaveDNS;
    }

    /**
     * Set <p>是否开启辅助 DNS</p>
     * @param SlaveDNS <p>是否开启辅助 DNS</p>
     */
    public void setSlaveDNS(String SlaveDNS) {
        this.SlaveDNS = SlaveDNS;
    }

    /**
     * Get <p>域名DNS状态，错误：dnserror，正常：空字符串</p> 
     * @return DNSStatus <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * Set <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
     * @param DNSStatus <p>域名DNS状态，错误：dnserror，正常：空字符串</p>
     */
    public void setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
    }

    /**
     * Get <p>CNAME加速启用状态</p> 
     * @return CNAMESpeedup <p>CNAME加速启用状态</p>
     */
    public String getCNAMESpeedup() {
        return this.CNAMESpeedup;
    }

    /**
     * Set <p>CNAME加速启用状态</p>
     * @param CNAMESpeedup <p>CNAME加速启用状态</p>
     */
    public void setCNAMESpeedup(String CNAMESpeedup) {
        this.CNAMESpeedup = CNAMESpeedup;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.IsMark != null) {
            this.IsMark = new String(source.IsMark);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.CnameSpeedup != null) {
            this.CnameSpeedup = new String(source.CnameSpeedup);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Punycode != null) {
            this.Punycode = new String(source.Punycode);
        }
        if (source.DnsStatus != null) {
            this.DnsStatus = new String(source.DnsStatus);
        }
        if (source.DnspodNsList != null) {
            this.DnspodNsList = new String[source.DnspodNsList.length];
            for (int i = 0; i < source.DnspodNsList.length; i++) {
                this.DnspodNsList[i] = new String(source.DnspodNsList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GradeLevel != null) {
            this.GradeLevel = new Long(source.GradeLevel);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.IsVip != null) {
            this.IsVip = new String(source.IsVip);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.GradeTitle != null) {
            this.GradeTitle = new String(source.GradeTitle);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ActualNsList != null) {
            this.ActualNsList = new String[source.ActualNsList.length];
            for (int i = 0; i < source.ActualNsList.length; i++) {
                this.ActualNsList[i] = new String(source.ActualNsList[i]);
            }
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.OwnerNick != null) {
            this.OwnerNick = new String(source.OwnerNick);
        }
        if (source.IsGracePeriod != null) {
            this.IsGracePeriod = new String(source.IsGracePeriod);
        }
        if (source.VipBuffered != null) {
            this.VipBuffered = new String(source.VipBuffered);
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
        if (source.VipResourceId != null) {
            this.VipResourceId = new String(source.VipResourceId);
        }
        if (source.IsSubDomain != null) {
            this.IsSubDomain = new Boolean(source.IsSubDomain);
        }
        if (source.TagList != null) {
            this.TagList = new TagItem[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagItem(source.TagList[i]);
            }
        }
        if (source.SearchEnginePush != null) {
            this.SearchEnginePush = new String(source.SearchEnginePush);
        }
        if (source.SlaveDNS != null) {
            this.SlaveDNS = new String(source.SlaveDNS);
        }
        if (source.DNSStatus != null) {
            this.DNSStatus = new String(source.DNSStatus);
        }
        if (source.CNAMESpeedup != null) {
            this.CNAMESpeedup = new String(source.CNAMESpeedup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "IsMark", this.IsMark);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "CnameSpeedup", this.CnameSpeedup);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Punycode", this.Punycode);
        this.setParamSimple(map, prefix + "DnsStatus", this.DnsStatus);
        this.setParamArraySimple(map, prefix + "DnspodNsList.", this.DnspodNsList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GradeLevel", this.GradeLevel);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "GradeTitle", this.GradeTitle);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArraySimple(map, prefix + "ActualNsList.", this.ActualNsList);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "OwnerNick", this.OwnerNick);
        this.setParamSimple(map, prefix + "IsGracePeriod", this.IsGracePeriod);
        this.setParamSimple(map, prefix + "VipBuffered", this.VipBuffered);
        this.setParamSimple(map, prefix + "VipStartAt", this.VipStartAt);
        this.setParamSimple(map, prefix + "VipEndAt", this.VipEndAt);
        this.setParamSimple(map, prefix + "VipAutoRenew", this.VipAutoRenew);
        this.setParamSimple(map, prefix + "VipResourceId", this.VipResourceId);
        this.setParamSimple(map, prefix + "IsSubDomain", this.IsSubDomain);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "SearchEnginePush", this.SearchEnginePush);
        this.setParamSimple(map, prefix + "SlaveDNS", this.SlaveDNS);
        this.setParamSimple(map, prefix + "DNSStatus", this.DNSStatus);
        this.setParamSimple(map, prefix + "CNAMESpeedup", this.CNAMESpeedup);

    }
}

