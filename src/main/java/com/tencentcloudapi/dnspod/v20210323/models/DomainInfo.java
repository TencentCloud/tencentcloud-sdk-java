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

public class DomainInfo extends AbstractModel{

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名套餐等级
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 域名分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 是否星标域名
    */
    @SerializedName("IsMark")
    @Expose
    private String IsMark;

    /**
    * TTL(DNS记录缓存时间)
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * cname加速启用状态
    */
    @SerializedName("CnameSpeedup")
    @Expose
    private String CnameSpeedup;

    /**
    * 域名备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 域名Punycode
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * 域名DNS状态
    */
    @SerializedName("DnsStatus")
    @Expose
    private String DnsStatus;

    /**
    * 域名的NS列表
    */
    @SerializedName("DnspodNsList")
    @Expose
    private String [] DnspodNsList;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名等级代号
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * 域名所属的用户ID
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 是否为付费域名
    */
    @SerializedName("IsVip")
    @Expose
    private String IsVip;

    /**
    * 域名所有者的账号
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 域名等级的描述
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * 域名创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 最后操作时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 腾讯云账户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 域名实际使用的NS列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActualNsList")
    @Expose
    private String [] ActualNsList;

    /**
    * 域名的记录数量
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 域名所有者的账户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerNick")
    @Expose
    private String OwnerNick;

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名状态 
     * @return Status 域名状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态
     * @param Status 域名状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名套餐等级 
     * @return Grade 域名套餐等级
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 域名套餐等级
     * @param Grade 域名套餐等级
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 域名分组ID 
     * @return GroupId 域名分组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 域名分组ID
     * @param GroupId 域名分组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否星标域名 
     * @return IsMark 是否星标域名
     */
    public String getIsMark() {
        return this.IsMark;
    }

    /**
     * Set 是否星标域名
     * @param IsMark 是否星标域名
     */
    public void setIsMark(String IsMark) {
        this.IsMark = IsMark;
    }

    /**
     * Get TTL(DNS记录缓存时间) 
     * @return TTL TTL(DNS记录缓存时间)
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL(DNS记录缓存时间)
     * @param TTL TTL(DNS记录缓存时间)
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get cname加速启用状态 
     * @return CnameSpeedup cname加速启用状态
     */
    public String getCnameSpeedup() {
        return this.CnameSpeedup;
    }

    /**
     * Set cname加速启用状态
     * @param CnameSpeedup cname加速启用状态
     */
    public void setCnameSpeedup(String CnameSpeedup) {
        this.CnameSpeedup = CnameSpeedup;
    }

    /**
     * Get 域名备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 域名备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 域名备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 域名备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 域名Punycode 
     * @return Punycode 域名Punycode
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set 域名Punycode
     * @param Punycode 域名Punycode
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get 域名DNS状态 
     * @return DnsStatus 域名DNS状态
     */
    public String getDnsStatus() {
        return this.DnsStatus;
    }

    /**
     * Set 域名DNS状态
     * @param DnsStatus 域名DNS状态
     */
    public void setDnsStatus(String DnsStatus) {
        this.DnsStatus = DnsStatus;
    }

    /**
     * Get 域名的NS列表 
     * @return DnspodNsList 域名的NS列表
     */
    public String [] getDnspodNsList() {
        return this.DnspodNsList;
    }

    /**
     * Set 域名的NS列表
     * @param DnspodNsList 域名的NS列表
     */
    public void setDnspodNsList(String [] DnspodNsList) {
        this.DnspodNsList = DnspodNsList;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get 域名所属的用户ID 
     * @return UserId 域名所属的用户ID
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 域名所属的用户ID
     * @param UserId 域名所属的用户ID
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 是否为付费域名 
     * @return IsVip 是否为付费域名
     */
    public String getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否为付费域名
     * @param IsVip 是否为付费域名
     */
    public void setIsVip(String IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get 域名所有者的账号 
     * @return Owner 域名所有者的账号
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 域名所有者的账号
     * @param Owner 域名所有者的账号
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 域名等级的描述 
     * @return GradeTitle 域名等级的描述
     */
    public String getGradeTitle() {
        return this.GradeTitle;
    }

    /**
     * Set 域名等级的描述
     * @param GradeTitle 域名等级的描述
     */
    public void setGradeTitle(String GradeTitle) {
        this.GradeTitle = GradeTitle;
    }

    /**
     * Get 域名创建时间 
     * @return CreatedOn 域名创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 域名创建时间
     * @param CreatedOn 域名创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 最后操作时间 
     * @return UpdatedOn 最后操作时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 最后操作时间
     * @param UpdatedOn 最后操作时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 腾讯云账户Uin 
     * @return Uin 腾讯云账户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云账户Uin
     * @param Uin 腾讯云账户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 域名实际使用的NS列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActualNsList 域名实际使用的NS列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getActualNsList() {
        return this.ActualNsList;
    }

    /**
     * Set 域名实际使用的NS列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActualNsList 域名实际使用的NS列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActualNsList(String [] ActualNsList) {
        this.ActualNsList = ActualNsList;
    }

    /**
     * Get 域名的记录数量 
     * @return RecordCount 域名的记录数量
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 域名的记录数量
     * @param RecordCount 域名的记录数量
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 域名所有者的账户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerNick 域名所有者的账户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerNick() {
        return this.OwnerNick;
    }

    /**
     * Set 域名所有者的账户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerNick 域名所有者的账户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerNick(String OwnerNick) {
        this.OwnerNick = OwnerNick;
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

    }
}

