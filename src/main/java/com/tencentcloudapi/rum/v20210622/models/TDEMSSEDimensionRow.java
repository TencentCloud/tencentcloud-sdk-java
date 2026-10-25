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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TDEMSSEDimensionRow extends AbstractModel {

    /**
    * <p>维度取值。空值保留为空字符串。</p>
    */
    @SerializedName("DimensionValue")
    @Expose
    private String DimensionValue;

    /**
    * <p>该取值的对话次数。</p>
    */
    @SerializedName("ConversationCount")
    @Expose
    private Long ConversationCount;

    /**
    * <p>该取值上当前指标的值。没有可计算样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get <p>维度取值。空值保留为空字符串。</p> 
     * @return DimensionValue <p>维度取值。空值保留为空字符串。</p>
     */
    public String getDimensionValue() {
        return this.DimensionValue;
    }

    /**
     * Set <p>维度取值。空值保留为空字符串。</p>
     * @param DimensionValue <p>维度取值。空值保留为空字符串。</p>
     */
    public void setDimensionValue(String DimensionValue) {
        this.DimensionValue = DimensionValue;
    }

    /**
     * Get <p>该取值的对话次数。</p> 
     * @return ConversationCount <p>该取值的对话次数。</p>
     */
    public Long getConversationCount() {
        return this.ConversationCount;
    }

    /**
     * Set <p>该取值的对话次数。</p>
     * @param ConversationCount <p>该取值的对话次数。</p>
     */
    public void setConversationCount(Long ConversationCount) {
        this.ConversationCount = ConversationCount;
    }

    /**
     * Get <p>该取值上当前指标的值。没有可计算样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>该取值上当前指标的值。没有可计算样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set <p>该取值上当前指标的值。没有可计算样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>该取值上当前指标的值。没有可计算样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public TDEMSSEDimensionRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDEMSSEDimensionRow(TDEMSSEDimensionRow source) {
        if (source.DimensionValue != null) {
            this.DimensionValue = new String(source.DimensionValue);
        }
        if (source.ConversationCount != null) {
            this.ConversationCount = new Long(source.ConversationCount);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimensionValue", this.DimensionValue);
        this.setParamSimple(map, prefix + "ConversationCount", this.ConversationCount);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

