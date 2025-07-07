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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticInfo extends AbstractModel {

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 首Token耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTokenCost")
    @Expose
    private Long FirstTokenCost;

    /**
    * 总耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCost")
    @Expose
    private Long TotalCost;

    /**
    * 输入Token数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * 输出Token数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * 总Token数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 首Token耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTokenCost 首Token耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstTokenCost() {
        return this.FirstTokenCost;
    }

    /**
     * Set 首Token耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTokenCost 首Token耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTokenCost(Long FirstTokenCost) {
        this.FirstTokenCost = FirstTokenCost;
    }

    /**
     * Get 总耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCost 总耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 总耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCost 总耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCost(Long TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 输入Token数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputTokens 输入Token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set 输入Token数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputTokens 输入Token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get 输出Token数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputTokens 输出Token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set 输出Token数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputTokens 输出Token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get 总Token数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTokens 总Token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 总Token数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTokens 总Token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public StatisticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticInfo(StatisticInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.FirstTokenCost != null) {
            this.FirstTokenCost = new Long(source.FirstTokenCost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Long(source.TotalCost);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "FirstTokenCost", this.FirstTokenCost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

