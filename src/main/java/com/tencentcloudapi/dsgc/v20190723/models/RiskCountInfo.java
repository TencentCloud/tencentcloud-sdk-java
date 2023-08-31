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

public class RiskCountInfo extends AbstractModel{

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 该等级风险项数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 风险等级名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 该等级风险项数量 
     * @return Count 该等级风险项数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该等级风险项数量
     * @param Count 该等级风险项数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 风险等级名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevelName 风险等级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevelName 风险等级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    public RiskCountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCountInfo(RiskCountInfo source) {
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);

    }
}

