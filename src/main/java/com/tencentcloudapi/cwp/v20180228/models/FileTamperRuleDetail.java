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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTamperRuleDetail extends AbstractModel {

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 状态 0: 启用 1: 已关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则
    */
    @SerializedName("Rule")
    @Expose
    private FileTamperRule [] Rule;

    /**
    * 生效主机uuid,空表示全部主机，通过参数可控制返回的条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 规则id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 是否全局规则(默认否) 0：否 ，1：是
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 生效主机的总数
    */
    @SerializedName("UuidTotalCount")
    @Expose
    private Long UuidTotalCount;

    /**
    * 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddWhiteType")
    @Expose
    private String AddWhiteType;

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 状态 0: 启用 1: 已关闭 
     * @return Status 状态 0: 启用 1: 已关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 启用 1: 已关闭
     * @param Status 状态 0: 启用 1: 已关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则 
     * @return Rule 规则
     */
    public FileTamperRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 规则
     * @param Rule 规则
     */
    public void setRule(FileTamperRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 生效主机uuid,空表示全部主机，通过参数可控制返回的条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuids 生效主机uuid,空表示全部主机，通过参数可控制返回的条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 生效主机uuid,空表示全部主机，通过参数可控制返回的条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuids 生效主机uuid,空表示全部主机，通过参数可控制返回的条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 规则id 
     * @return Id 规则id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id
     * @param Id 规则id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 是否全局规则(默认否) 0：否 ，1：是 
     * @return IsGlobal 是否全局规则(默认否) 0：否 ，1：是
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则(默认否) 0：否 ，1：是
     * @param IsGlobal 是否全局规则(默认否) 0：否 ，1：是
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 风险等级 0：无， 1: 高危， 2:中危， 3: 低危 
     * @return Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     * @param Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 生效主机的总数 
     * @return UuidTotalCount 生效主机的总数
     */
    public Long getUuidTotalCount() {
        return this.UuidTotalCount;
    }

    /**
     * Set 生效主机的总数
     * @param UuidTotalCount 生效主机的总数
     */
    public void setUuidTotalCount(Long UuidTotalCount) {
        this.UuidTotalCount = UuidTotalCount;
    }

    /**
     * Get 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddWhiteType 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddWhiteType() {
        return this.AddWhiteType;
    }

    /**
     * Set 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddWhiteType 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddWhiteType(String AddWhiteType) {
        this.AddWhiteType = AddWhiteType;
    }

    public FileTamperRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperRuleDetail(FileTamperRuleDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new FileTamperRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new FileTamperRule(source.Rule[i]);
            }
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.UuidTotalCount != null) {
            this.UuidTotalCount = new Long(source.UuidTotalCount);
        }
        if (source.AddWhiteType != null) {
            this.AddWhiteType = new String(source.AddWhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "UuidTotalCount", this.UuidTotalCount);
        this.setParamSimple(map, prefix + "AddWhiteType", this.AddWhiteType);

    }
}

