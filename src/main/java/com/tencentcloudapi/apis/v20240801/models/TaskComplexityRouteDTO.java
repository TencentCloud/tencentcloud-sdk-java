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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskComplexityRouteDTO extends AbstractModel {

    /**
    * <p>倾向度</p><p>取值范围：[0, 1]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexityBias")
    @Expose
    private Float ComplexityBias;

    /**
    * <p>简单模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimpleTargetModels")
    @Expose
    private TargetModelDTO [] SimpleTargetModels;

    /**
    * <p>复杂模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexTargetModels")
    @Expose
    private TargetModelDTO [] ComplexTargetModels;

    /**
     * Get <p>倾向度</p><p>取值范围：[0, 1]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexityBias <p>倾向度</p><p>取值范围：[0, 1]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getComplexityBias() {
        return this.ComplexityBias;
    }

    /**
     * Set <p>倾向度</p><p>取值范围：[0, 1]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexityBias <p>倾向度</p><p>取值范围：[0, 1]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexityBias(Float ComplexityBias) {
        this.ComplexityBias = ComplexityBias;
    }

    /**
     * Get <p>简单模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimpleTargetModels <p>简单模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetModelDTO [] getSimpleTargetModels() {
        return this.SimpleTargetModels;
    }

    /**
     * Set <p>简单模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimpleTargetModels <p>简单模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimpleTargetModels(TargetModelDTO [] SimpleTargetModels) {
        this.SimpleTargetModels = SimpleTargetModels;
    }

    /**
     * Get <p>复杂模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexTargetModels <p>复杂模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetModelDTO [] getComplexTargetModels() {
        return this.ComplexTargetModels;
    }

    /**
     * Set <p>复杂模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexTargetModels <p>复杂模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexTargetModels(TargetModelDTO [] ComplexTargetModels) {
        this.ComplexTargetModels = ComplexTargetModels;
    }

    public TaskComplexityRouteDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskComplexityRouteDTO(TaskComplexityRouteDTO source) {
        if (source.ComplexityBias != null) {
            this.ComplexityBias = new Float(source.ComplexityBias);
        }
        if (source.SimpleTargetModels != null) {
            this.SimpleTargetModels = new TargetModelDTO[source.SimpleTargetModels.length];
            for (int i = 0; i < source.SimpleTargetModels.length; i++) {
                this.SimpleTargetModels[i] = new TargetModelDTO(source.SimpleTargetModels[i]);
            }
        }
        if (source.ComplexTargetModels != null) {
            this.ComplexTargetModels = new TargetModelDTO[source.ComplexTargetModels.length];
            for (int i = 0; i < source.ComplexTargetModels.length; i++) {
                this.ComplexTargetModels[i] = new TargetModelDTO(source.ComplexTargetModels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplexityBias", this.ComplexityBias);
        this.setParamArrayObj(map, prefix + "SimpleTargetModels.", this.SimpleTargetModels);
        this.setParamArrayObj(map, prefix + "ComplexTargetModels.", this.ComplexTargetModels);

    }
}

