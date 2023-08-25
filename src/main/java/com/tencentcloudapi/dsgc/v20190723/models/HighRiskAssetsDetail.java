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

public class HighRiskAssetsDetail extends AbstractModel{

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产对象名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetsName")
    @Expose
    private String AssetsName;

    /**
    * 高风险个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 风险类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 总的风险个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产对象名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetsName 资产对象名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetsName() {
        return this.AssetsName;
    }

    /**
     * Set 资产对象名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetsName 资产对象名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetsName(String AssetsName) {
        this.AssetsName = AssetsName;
    }

    /**
     * Get 高风险个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighRiskCount 高风险个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 高风险个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighRiskCount 高风险个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
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
     * Get 总的风险个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRiskCount 总的风险个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set 总的风险个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRiskCount 总的风险个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
    }

    public HighRiskAssetsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighRiskAssetsDetail(HighRiskAssetsDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AssetsName != null) {
            this.AssetsName = new String(source.AssetsName);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AssetsName", this.AssetsName);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);

    }
}

