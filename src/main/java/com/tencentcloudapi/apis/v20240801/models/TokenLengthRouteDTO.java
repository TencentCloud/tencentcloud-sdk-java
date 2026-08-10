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

public class TokenLengthRouteDTO extends AbstractModel {

    /**
    * <p>Token 区间下限</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinTokens")
    @Expose
    private Long MinTokens;

    /**
    * <p>Token 区间上限</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * <p>模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetModels")
    @Expose
    private TargetModelDTO [] TargetModels;

    /**
     * Get <p>Token 区间下限</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinTokens <p>Token 区间下限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinTokens() {
        return this.MinTokens;
    }

    /**
     * Set <p>Token 区间下限</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinTokens <p>Token 区间下限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinTokens(Long MinTokens) {
        this.MinTokens = MinTokens;
    }

    /**
     * Get <p>Token 区间上限</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTokens <p>Token 区间上限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>Token 区间上限</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTokens <p>Token 区间上限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetModels <p>模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetModelDTO [] getTargetModels() {
        return this.TargetModels;
    }

    /**
     * Set <p>模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetModels <p>模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetModels(TargetModelDTO [] TargetModels) {
        this.TargetModels = TargetModels;
    }

    public TokenLengthRouteDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenLengthRouteDTO(TokenLengthRouteDTO source) {
        if (source.MinTokens != null) {
            this.MinTokens = new Long(source.MinTokens);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.TargetModels != null) {
            this.TargetModels = new TargetModelDTO[source.TargetModels.length];
            for (int i = 0; i < source.TargetModels.length; i++) {
                this.TargetModels[i] = new TargetModelDTO(source.TargetModels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinTokens", this.MinTokens);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamArrayObj(map, prefix + "TargetModels.", this.TargetModels);

    }
}

