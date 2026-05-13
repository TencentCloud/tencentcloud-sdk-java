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

public class DspmAssetAccountIdentify extends AbstractModel {

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 所属云账号uin用户。
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * 是否管理员
    */
    @SerializedName("IsManager")
    @Expose
    private Long IsManager;

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
    * 权限信息
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * 活跃状态。 0-不活跃 1-活跃
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
    * 访客权限申请次数
    */
    @SerializedName("PersonApplyCount")
    @Expose
    private Long PersonApplyCount;

    /**
    * 资产名
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 风险统计信息
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 所属个人用户信息。
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * 创建者账号uin用户。
    */
    @SerializedName("CreatorUin")
    @Expose
    private DspmUinUser CreatorUin;

    /**
    * 预设权限。
    */
    @SerializedName("PresetPrivilege")
    @Expose
    private DspmDbAccountPrivilege PresetPrivilege;

    /**
    * 内网访问地址，如果有多个，使用';'分割
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 身份id
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * 资产所属账号app id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 账号昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 资产所属账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
     * Get 是否管理员 
     * @return IsManager 是否管理员
     */
    public Long getIsManager() {
        return this.IsManager;
    }

    /**
     * Set 是否管理员
     * @param IsManager 是否管理员
     */
    public void setIsManager(Long IsManager) {
        this.IsManager = IsManager;
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
     * Get 活跃状态。 0-不活跃 1-活跃 
     * @return Status 活跃状态。 0-不活跃 1-活跃
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 活跃状态。 0-不活跃 1-活跃
     * @param Status 活跃状态。 0-不活跃 1-活跃
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
     * Get 访客权限申请次数 
     * @return PersonApplyCount 访客权限申请次数
     */
    public Long getPersonApplyCount() {
        return this.PersonApplyCount;
    }

    /**
     * Set 访客权限申请次数
     * @param PersonApplyCount 访客权限申请次数
     */
    public void setPersonApplyCount(Long PersonApplyCount) {
        this.PersonApplyCount = PersonApplyCount;
    }

    /**
     * Get 资产名 
     * @return AssetName 资产名
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
     * @param AssetName 资产名
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 所属地域 
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get 创建者账号uin用户。 
     * @return CreatorUin 创建者账号uin用户。
     */
    public DspmUinUser getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者账号uin用户。
     * @param CreatorUin 创建者账号uin用户。
     */
    public void setCreatorUin(DspmUinUser CreatorUin) {
        this.CreatorUin = CreatorUin;
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

    /**
     * Get 内网访问地址，如果有多个，使用';'分割 
     * @return PrivateIp 内网访问地址，如果有多个，使用';'分割
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网访问地址，如果有多个，使用';'分割
     * @param PrivateIp 内网访问地址，如果有多个，使用';'分割
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 身份id 
     * @return IdentifyId 身份id
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set 身份id
     * @param IdentifyId 身份id
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get 资产所属账号app id 
     * @return AppId 资产所属账号app id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资产所属账号app id
     * @param AppId 资产所属账号app id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号昵称 
     * @return NickName 账号昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号昵称
     * @param NickName 账号昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 资产所属账号uin 
     * @return Uin 资产所属账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 资产所属账号uin
     * @param Uin 资产所属账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public DspmAssetAccountIdentify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetAccountIdentify(DspmAssetAccountIdentify source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.IsManager != null) {
            this.IsManager = new Long(source.IsManager);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
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
        if (source.PersonApplyCount != null) {
            this.PersonApplyCount = new Long(source.PersonApplyCount);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new DspmUinUser(source.CreatorUin);
        }
        if (source.PresetPrivilege != null) {
            this.PresetPrivilege = new DspmDbAccountPrivilege(source.PresetPrivilege);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamSimple(map, prefix + "IsManager", this.IsManager);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PersonApplyCount", this.PersonApplyCount);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "CreatorUin.", this.CreatorUin);
        this.setParamObj(map, prefix + "PresetPrivilege.", this.PresetPrivilege);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

