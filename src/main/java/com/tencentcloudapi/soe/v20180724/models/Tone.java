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
package com.tencentcloudapi.soe.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tone extends AbstractModel{

    /**
    * 检测结果是否有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Valid")
    @Expose
    private Boolean Valid;

    /**
    * 文本标准声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefTone")
    @Expose
    private Long RefTone;

    /**
    * 实际发音声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HypothesisTone")
    @Expose
    private Long HypothesisTone;

    /**
     * Get 检测结果是否有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Valid 检测结果是否有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getValid() {
        return this.Valid;
    }

    /**
     * Set 检测结果是否有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Valid 检测结果是否有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    /**
     * Get 文本标准声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefTone 文本标准声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefTone() {
        return this.RefTone;
    }

    /**
     * Set 文本标准声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefTone 文本标准声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefTone(Long RefTone) {
        this.RefTone = RefTone;
    }

    /**
     * Get 实际发音声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HypothesisTone 实际发音声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHypothesisTone() {
        return this.HypothesisTone;
    }

    /**
     * Set 实际发音声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
     * @param HypothesisTone 实际发音声调，数值范围[-1,1,2,3,4]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHypothesisTone(Long HypothesisTone) {
        this.HypothesisTone = HypothesisTone;
    }

    public Tone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tone(Tone source) {
        if (source.Valid != null) {
            this.Valid = new Boolean(source.Valid);
        }
        if (source.RefTone != null) {
            this.RefTone = new Long(source.RefTone);
        }
        if (source.HypothesisTone != null) {
            this.HypothesisTone = new Long(source.HypothesisTone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Valid", this.Valid);
        this.setParamSimple(map, prefix + "RefTone", this.RefTone);
        this.setParamSimple(map, prefix + "HypothesisTone", this.HypothesisTone);

    }
}

