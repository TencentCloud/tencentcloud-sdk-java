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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryComplianceGroup extends AbstractModel {

    /**
    * 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceGroupId")
    @Expose
    private Long ComplianceGroupId;

    /**
    * 合规组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合规组描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceGroupType")
    @Expose
    private Long ComplianceGroupType;

    /**
    * 合规组对应的规则项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceGroupRules")
    @Expose
    private DspaDiscoveryComplianceGroupRuleInfo [] ComplianceGroupRules;

    /**
    * 合规组对应的分级组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelGroupId")
    @Expose
    private Long LevelGroupId;

    /**
     * Get 合规组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceGroupId 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComplianceGroupId() {
        return this.ComplianceGroupId;
    }

    /**
     * Set 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceGroupId 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceGroupId(Long ComplianceGroupId) {
        this.ComplianceGroupId = ComplianceGroupId;
    }

    /**
     * Get 合规组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 合规组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合规组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 合规组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合规组描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 合规组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 合规组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 合规组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceGroupType 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComplianceGroupType() {
        return this.ComplianceGroupType;
    }

    /**
     * Set 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceGroupType 合规组类型；0 默认合规组，1 系统合规组（除默认合规组外）, 2 自定义合规组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceGroupType(Long ComplianceGroupType) {
        this.ComplianceGroupType = ComplianceGroupType;
    }

    /**
     * Get 合规组对应的规则项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceGroupRules 合规组对应的规则项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryComplianceGroupRuleInfo [] getComplianceGroupRules() {
        return this.ComplianceGroupRules;
    }

    /**
     * Set 合规组对应的规则项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceGroupRules 合规组对应的规则项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceGroupRules(DspaDiscoveryComplianceGroupRuleInfo [] ComplianceGroupRules) {
        this.ComplianceGroupRules = ComplianceGroupRules;
    }

    /**
     * Get 合规组对应的分级组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelGroupId 合规组对应的分级组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelGroupId() {
        return this.LevelGroupId;
    }

    /**
     * Set 合规组对应的分级组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelGroupId 合规组对应的分级组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelGroupId(Long LevelGroupId) {
        this.LevelGroupId = LevelGroupId;
    }

    public DspaDiscoveryComplianceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryComplianceGroup(DspaDiscoveryComplianceGroup source) {
        if (source.ComplianceGroupId != null) {
            this.ComplianceGroupId = new Long(source.ComplianceGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ComplianceGroupType != null) {
            this.ComplianceGroupType = new Long(source.ComplianceGroupType);
        }
        if (source.ComplianceGroupRules != null) {
            this.ComplianceGroupRules = new DspaDiscoveryComplianceGroupRuleInfo[source.ComplianceGroupRules.length];
            for (int i = 0; i < source.ComplianceGroupRules.length; i++) {
                this.ComplianceGroupRules[i] = new DspaDiscoveryComplianceGroupRuleInfo(source.ComplianceGroupRules[i]);
            }
        }
        if (source.LevelGroupId != null) {
            this.LevelGroupId = new Long(source.LevelGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceGroupId", this.ComplianceGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ComplianceGroupType", this.ComplianceGroupType);
        this.setParamArrayObj(map, prefix + "ComplianceGroupRules.", this.ComplianceGroupRules);
        this.setParamSimple(map, prefix + "LevelGroupId", this.LevelGroupId);

    }
}

