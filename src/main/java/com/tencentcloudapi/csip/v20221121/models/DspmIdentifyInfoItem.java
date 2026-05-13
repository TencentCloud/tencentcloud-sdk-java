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

public class DspmIdentifyInfoItem extends AbstractModel {

    /**
    * 身份id。
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 身份类型。0-未定义 2-长期身份 3-临时身份
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * 创建者账号uin用户。
    */
    @SerializedName("CreatorUin")
    @Expose
    private DspmUinUser CreatorUin;

    /**
    * 关联资产。
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 状态。0-不活跃 1-活跃
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * 关联数据资产统计信息。
    */
    @SerializedName("AssetStatistic")
    @Expose
    private DspmIdentifyAssetStatistic AssetStatistic;

    /**
    * 风险统计信息
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * 安全建议。 Resolve 立即解决 Reinforcement 加固 None 暂无异常
    */
    @SerializedName("SafetyAdvice")
    @Expose
    private String SafetyAdvice;

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
     * Get 身份id。 
     * @return IdentifyId 身份id。
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set 身份id。
     * @param IdentifyId 身份id。
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 身份类型。0-未定义 2-长期身份 3-临时身份 
     * @return IdentifyType 身份类型。0-未定义 2-长期身份 3-临时身份
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 身份类型。0-未定义 2-长期身份 3-临时身份
     * @param IdentifyType 身份类型。0-未定义 2-长期身份 3-临时身份
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
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
     * Get 关联资产。 
     * @return AssetCount 关联资产。
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 关联资产。
     * @param AssetCount 关联资产。
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 状态。0-不活跃 1-活跃 
     * @return Status 状态。0-不活跃 1-活跃
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。0-不活跃 1-活跃
     * @param Status 状态。0-不活跃 1-活跃
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Person 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Person 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get 关联数据资产统计信息。 
     * @return AssetStatistic 关联数据资产统计信息。
     */
    public DspmIdentifyAssetStatistic getAssetStatistic() {
        return this.AssetStatistic;
    }

    /**
     * Set 关联数据资产统计信息。
     * @param AssetStatistic 关联数据资产统计信息。
     */
    public void setAssetStatistic(DspmIdentifyAssetStatistic AssetStatistic) {
        this.AssetStatistic = AssetStatistic;
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
     * Get 安全建议。 Resolve 立即解决 Reinforcement 加固 None 暂无异常 
     * @return SafetyAdvice 安全建议。 Resolve 立即解决 Reinforcement 加固 None 暂无异常
     */
    public String getSafetyAdvice() {
        return this.SafetyAdvice;
    }

    /**
     * Set 安全建议。 Resolve 立即解决 Reinforcement 加固 None 暂无异常
     * @param SafetyAdvice 安全建议。 Resolve 立即解决 Reinforcement 加固 None 暂无异常
     */
    public void setSafetyAdvice(String SafetyAdvice) {
        this.SafetyAdvice = SafetyAdvice;
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

    public DspmIdentifyInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyInfoItem(DspmIdentifyInfoItem source) {
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new DspmUinUser(source.CreatorUin);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.AssetStatistic != null) {
            this.AssetStatistic = new DspmIdentifyAssetStatistic(source.AssetStatistic);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.SafetyAdvice != null) {
            this.SafetyAdvice = new String(source.SafetyAdvice);
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
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "CreatorUin.", this.CreatorUin);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "AssetStatistic.", this.AssetStatistic);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamSimple(map, prefix + "SafetyAdvice", this.SafetyAdvice);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

