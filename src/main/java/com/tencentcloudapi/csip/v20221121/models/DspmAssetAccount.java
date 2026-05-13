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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmAssetAccount extends AbstractModel {

    /**
    * 账号名
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 账号类型。 0-未定义 1-服务账号 2-个人账号 3-临时账号
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 所属对象。uin或个人id
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 权限信息
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * 状态。 0-不活跃 1-活跃 2-已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 账号创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 访问权限生效时间。
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * 访问权限失效时间。
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 是否新账号
    */
    @SerializedName("IsNewAccount")
    @Expose
    private Long IsNewAccount;

    /**
    * 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 所属云账号uin用户。
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * 所属个人用户信息。
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * 风险统计信息
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * 预设权限。
    */
    @SerializedName("PresetPrivilege")
    @Expose
    private DspmDbAccountPrivilege PresetPrivilege;

    /**
     * Get 账号名 
     * @return Account 账号名
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号名
     * @param Account 账号名
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 主机地址 
     * @return Host 主机地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机地址
     * @param Host 主机地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 账号类型。 0-未定义 1-服务账号 2-个人账号 3-临时账号 
     * @return AccountType 账号类型。 0-未定义 1-服务账号 2-个人账号 3-临时账号
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账号类型。 0-未定义 1-服务账号 2-个人账号 3-临时账号
     * @param AccountType 账号类型。 0-未定义 1-服务账号 2-个人账号 3-临时账号
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 所属对象。uin或个人id 
     * @return Subject 所属对象。uin或个人id
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 所属对象。uin或个人id
     * @param Subject 所属对象。uin或个人id
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 权限信息 
     * @return Privilege 权限信息
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 权限信息
     * @param Privilege 权限信息
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 状态。 0-不活跃 1-活跃 2-已删除 
     * @return Status 状态。 0-不活跃 1-活跃 2-已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。 0-不活跃 1-活跃 2-已删除
     * @param Status 状态。 0-不活跃 1-活跃 2-已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 账号创建时间。 
     * @return CreateTime 账号创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 账号创建时间。
     * @param CreateTime 账号创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 访问权限生效时间。 
     * @return ValidateFrom 访问权限生效时间。
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set 访问权限生效时间。
     * @param ValidateFrom 访问权限生效时间。
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get 访问权限失效时间。 
     * @return ValidateTo 访问权限失效时间。
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set 访问权限失效时间。
     * @param ValidateTo 访问权限失效时间。
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 是否新账号 
     * @return IsNewAccount 是否新账号
     */
    public Long getIsNewAccount() {
        return this.IsNewAccount;
    }

    /**
     * Set 是否新账号
     * @param IsNewAccount 是否新账号
     */
    public void setIsNewAccount(Long IsNewAccount) {
        this.IsNewAccount = IsNewAccount;
    }

    /**
     * Get 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份 
     * @return IdentifyType 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
     * @param IdentifyType 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 所属云账号uin用户。 
     * @return OwnerUin 所属云账号uin用户。
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属云账号uin用户。
     * @param OwnerUin 所属云账号uin用户。
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 所属个人用户信息。 
     * @return Person 所属个人用户信息。
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set 所属个人用户信息。
     * @param Person 所属个人用户信息。
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get 风险统计信息 
     * @return RiskCount 风险统计信息
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险统计信息
     * @param RiskCount 风险统计信息
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 预设权限。 
     * @return PresetPrivilege 预设权限。
     */
    public DspmDbAccountPrivilege getPresetPrivilege() {
        return this.PresetPrivilege;
    }

    /**
     * Set 预设权限。
     * @param PresetPrivilege 预设权限。
     */
    public void setPresetPrivilege(DspmDbAccountPrivilege PresetPrivilege) {
        this.PresetPrivilege = PresetPrivilege;
    }

    public DspmAssetAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetAccount(DspmAssetAccount source) {
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.IsNewAccount != null) {
            this.IsNewAccount = new Long(source.IsNewAccount);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.PresetPrivilege != null) {
            this.PresetPrivilege = new DspmDbAccountPrivilege(source.PresetPrivilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "IsNewAccount", this.IsNewAccount);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamObj(map, prefix + "PresetPrivilege.", this.PresetPrivilege);

    }
}

