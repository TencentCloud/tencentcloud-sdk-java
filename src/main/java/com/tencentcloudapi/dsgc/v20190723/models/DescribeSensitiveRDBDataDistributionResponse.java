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

public class DescribeSensitiveRDBDataDistributionResponse extends AbstractModel{

    /**
    * 分级分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelDistribution")
    @Expose
    private Note [] LevelDistribution;

    /**
    * 分类分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryDistribution")
    @Expose
    private Note [] CategoryDistribution;

    /**
    * 敏感规则分布详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleDistribution")
    @Expose
    private RuleDistribution [] RuleDistribution;

    /**
    * 计算占比字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveDataNum")
    @Expose
    private Long SensitiveDataNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分级分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelDistribution 分级分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Note [] getLevelDistribution() {
        return this.LevelDistribution;
    }

    /**
     * Set 分级分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelDistribution 分级分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelDistribution(Note [] LevelDistribution) {
        this.LevelDistribution = LevelDistribution;
    }

    /**
     * Get 分类分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryDistribution 分类分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Note [] getCategoryDistribution() {
        return this.CategoryDistribution;
    }

    /**
     * Set 分类分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryDistribution 分类分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryDistribution(Note [] CategoryDistribution) {
        this.CategoryDistribution = CategoryDistribution;
    }

    /**
     * Get 敏感规则分布详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleDistribution 敏感规则分布详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleDistribution [] getRuleDistribution() {
        return this.RuleDistribution;
    }

    /**
     * Set 敏感规则分布详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleDistribution 敏感规则分布详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleDistribution(RuleDistribution [] RuleDistribution) {
        this.RuleDistribution = RuleDistribution;
    }

    /**
     * Get 计算占比字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveDataNum 计算占比字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveDataNum() {
        return this.SensitiveDataNum;
    }

    /**
     * Set 计算占比字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveDataNum 计算占比字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveDataNum(Long SensitiveDataNum) {
        this.SensitiveDataNum = SensitiveDataNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSensitiveRDBDataDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSensitiveRDBDataDistributionResponse(DescribeSensitiveRDBDataDistributionResponse source) {
        if (source.LevelDistribution != null) {
            this.LevelDistribution = new Note[source.LevelDistribution.length];
            for (int i = 0; i < source.LevelDistribution.length; i++) {
                this.LevelDistribution[i] = new Note(source.LevelDistribution[i]);
            }
        }
        if (source.CategoryDistribution != null) {
            this.CategoryDistribution = new Note[source.CategoryDistribution.length];
            for (int i = 0; i < source.CategoryDistribution.length; i++) {
                this.CategoryDistribution[i] = new Note(source.CategoryDistribution[i]);
            }
        }
        if (source.RuleDistribution != null) {
            this.RuleDistribution = new RuleDistribution[source.RuleDistribution.length];
            for (int i = 0; i < source.RuleDistribution.length; i++) {
                this.RuleDistribution[i] = new RuleDistribution(source.RuleDistribution[i]);
            }
        }
        if (source.SensitiveDataNum != null) {
            this.SensitiveDataNum = new Long(source.SensitiveDataNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LevelDistribution.", this.LevelDistribution);
        this.setParamArrayObj(map, prefix + "CategoryDistribution.", this.CategoryDistribution);
        this.setParamArrayObj(map, prefix + "RuleDistribution.", this.RuleDistribution);
        this.setParamSimple(map, prefix + "SensitiveDataNum", this.SensitiveDataNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

