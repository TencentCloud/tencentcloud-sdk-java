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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgFinancialByMonth extends AbstractModel{

    /**
    * 记录ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 月份，格式：yyyy-mm，示例：2021-01。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 消耗金额，单元：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * 比上月增长率%。正数增长，负数下降，空值无法统计。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrowthRate")
    @Expose
    private String GrowthRate;

    /**
     * Get 记录ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 记录ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 记录ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 月份，格式：yyyy-mm，示例：2021-01。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Month 月份，格式：yyyy-mm，示例：2021-01。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，格式：yyyy-mm，示例：2021-01。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Month 月份，格式：yyyy-mm，示例：2021-01。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 消耗金额，单元：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCost 消耗金额，单元：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 消耗金额，单元：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCost 消耗金额，单元：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 比上月增长率%。正数增长，负数下降，空值无法统计。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrowthRate 比上月增长率%。正数增长，负数下降，空值无法统计。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrowthRate() {
        return this.GrowthRate;
    }

    /**
     * Set 比上月增长率%。正数增长，负数下降，空值无法统计。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrowthRate 比上月增长率%。正数增长，负数下降，空值无法统计。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrowthRate(String GrowthRate) {
        this.GrowthRate = GrowthRate;
    }

    public OrgFinancialByMonth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgFinancialByMonth(OrgFinancialByMonth source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.GrowthRate != null) {
            this.GrowthRate = new String(source.GrowthRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "GrowthRate", this.GrowthRate);

    }
}

