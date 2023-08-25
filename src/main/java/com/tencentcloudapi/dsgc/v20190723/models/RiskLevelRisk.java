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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskLevelRisk extends AbstractModel{

    /**
    * 风险id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 风险等级列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevelDescription")
    @Expose
    private String RiskLevelDescription;

    /**
    * 引用的分类分级模版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentifyComplianceName")
    @Expose
    private String IdentifyComplianceName;

    /**
    * 类型，区分自定义还是系统内置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 风险id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 风险id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 风险id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 风险id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 风险等级列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevelName 风险等级列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevelName 风险等级列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevelDescription 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevelDescription() {
        return this.RiskLevelDescription;
    }

    /**
     * Set 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevelDescription 风险级别描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevelDescription(String RiskLevelDescription) {
        this.RiskLevelDescription = RiskLevelDescription;
    }

    /**
     * Get 引用的分类分级模版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentifyComplianceName 引用的分类分级模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentifyComplianceName() {
        return this.IdentifyComplianceName;
    }

    /**
     * Set 引用的分类分级模版
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentifyComplianceName 引用的分类分级模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifyComplianceName(String IdentifyComplianceName) {
        this.IdentifyComplianceName = IdentifyComplianceName;
    }

    /**
     * Get 类型，区分自定义还是系统内置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型，区分自定义还是系统内置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，区分自定义还是系统内置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型，区分自定义还是系统内置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RiskLevelRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskLevelRisk(RiskLevelRisk source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.RiskLevelDescription != null) {
            this.RiskLevelDescription = new String(source.RiskLevelDescription);
        }
        if (source.IdentifyComplianceName != null) {
            this.IdentifyComplianceName = new String(source.IdentifyComplianceName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "RiskLevelDescription", this.RiskLevelDescription);
        this.setParamSimple(map, prefix + "IdentifyComplianceName", this.IdentifyComplianceName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

