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

public class AssessmentRiskItem extends AbstractModel{

    /**
    * 脆弱项id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 脆弱性级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 风险类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 关联模版个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferTemplateCount")
    @Expose
    private Long ReferTemplateCount;

    /**
    * 支持的数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDataSource")
    @Expose
    private String [] SupportDataSource;

    /**
     * Get 脆弱项id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 脆弱项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 脆弱项id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 脆弱项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 脆弱性级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 脆弱性级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 脆弱性级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 脆弱性级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 风险类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskType 风险类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskType 风险类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 关联模版个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferTemplateCount 关联模版个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReferTemplateCount() {
        return this.ReferTemplateCount;
    }

    /**
     * Set 关联模版个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferTemplateCount 关联模版个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferTemplateCount(Long ReferTemplateCount) {
        this.ReferTemplateCount = ReferTemplateCount;
    }

    /**
     * Get 支持的数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDataSource 支持的数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportDataSource() {
        return this.SupportDataSource;
    }

    /**
     * Set 支持的数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDataSource 支持的数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDataSource(String [] SupportDataSource) {
        this.SupportDataSource = SupportDataSource;
    }

    public AssessmentRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessmentRiskItem(AssessmentRiskItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.ReferTemplateCount != null) {
            this.ReferTemplateCount = new Long(source.ReferTemplateCount);
        }
        if (source.SupportDataSource != null) {
            this.SupportDataSource = new String[source.SupportDataSource.length];
            for (int i = 0; i < source.SupportDataSource.length; i++) {
                this.SupportDataSource[i] = new String(source.SupportDataSource[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "ReferTemplateCount", this.ReferTemplateCount);
        this.setParamArraySimple(map, prefix + "SupportDataSource.", this.SupportDataSource);

    }
}

