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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateZone extends AbstractModel{

    /**
    * 私有域id: zone-xxxxxxxx
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 域名所有者uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 私有域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 修改时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 记录数
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 绑定的Vpc列表
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * 私有域状态：正常解析：ENABLED, 暂停解析：SUSPEND, 锁定：FROZEN
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名递归解析状态：开通：ENABLED, 关闭，DISABLED
    */
    @SerializedName("DnsForwardStatus")
    @Expose
    private String DnsForwardStatus;

    /**
    * 标签键值对集合
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 绑定的关联账号的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfoOutput [] AccountVpcSet;

    /**
    * 是否自定义TLD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCustomTld")
    @Expose
    private Boolean IsCustomTld;

    /**
     * Get 私有域id: zone-xxxxxxxx 
     * @return ZoneId 私有域id: zone-xxxxxxxx
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域id: zone-xxxxxxxx
     * @param ZoneId 私有域id: zone-xxxxxxxx
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 域名所有者uin 
     * @return OwnerUin 域名所有者uin
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 域名所有者uin
     * @param OwnerUin 域名所有者uin
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 私有域名 
     * @return Domain 私有域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 私有域名
     * @param Domain 私有域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 修改时间 
     * @return UpdatedOn 修改时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 修改时间
     * @param UpdatedOn 修改时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 记录数 
     * @return RecordCount 记录数
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 记录数
     * @param RecordCount 记录数
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 绑定的Vpc列表 
     * @return VpcSet 绑定的Vpc列表
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set 绑定的Vpc列表
     * @param VpcSet 绑定的Vpc列表
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get 私有域状态：正常解析：ENABLED, 暂停解析：SUSPEND, 锁定：FROZEN 
     * @return Status 私有域状态：正常解析：ENABLED, 暂停解析：SUSPEND, 锁定：FROZEN
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 私有域状态：正常解析：ENABLED, 暂停解析：SUSPEND, 锁定：FROZEN
     * @param Status 私有域状态：正常解析：ENABLED, 暂停解析：SUSPEND, 锁定：FROZEN
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名递归解析状态：开通：ENABLED, 关闭，DISABLED 
     * @return DnsForwardStatus 域名递归解析状态：开通：ENABLED, 关闭，DISABLED
     */
    public String getDnsForwardStatus() {
        return this.DnsForwardStatus;
    }

    /**
     * Set 域名递归解析状态：开通：ENABLED, 关闭，DISABLED
     * @param DnsForwardStatus 域名递归解析状态：开通：ENABLED, 关闭，DISABLED
     */
    public void setDnsForwardStatus(String DnsForwardStatus) {
        this.DnsForwardStatus = DnsForwardStatus;
    }

    /**
     * Get 标签键值对集合 
     * @return Tags 标签键值对集合
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签键值对集合
     * @param Tags 标签键值对集合
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 绑定的关联账号的vpc列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountVpcSet 绑定的关联账号的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccountVpcInfoOutput [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set 绑定的关联账号的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountVpcSet 绑定的关联账号的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountVpcSet(AccountVpcInfoOutput [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    /**
     * Get 是否自定义TLD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCustomTld 是否自定义TLD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCustomTld() {
        return this.IsCustomTld;
    }

    /**
     * Set 是否自定义TLD
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCustomTld 是否自定义TLD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCustomTld(Boolean IsCustomTld) {
        this.IsCustomTld = IsCustomTld;
    }

    public PrivateZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateZone(PrivateZone source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnsForwardStatus != null) {
            this.DnsForwardStatus = new String(source.DnsForwardStatus);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfoOutput[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfoOutput(source.AccountVpcSet[i]);
            }
        }
        if (source.IsCustomTld != null) {
            this.IsCustomTld = new Boolean(source.IsCustomTld);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DnsForwardStatus", this.DnsForwardStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);
        this.setParamSimple(map, prefix + "IsCustomTld", this.IsCustomTld);

    }
}

