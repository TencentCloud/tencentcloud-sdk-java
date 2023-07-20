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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceTypeByTaskType extends AbstractModel{

    /**
    * 类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 可选数据源列表文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CandidateTexts")
    @Expose
    private String CandidateTexts;

    /**
    * 可选数据源列表取值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CandidateValues")
    @Expose
    private String CandidateValues;

    /**
     * Get 类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId 类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId 类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 可选数据源列表文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CandidateTexts 可选数据源列表文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCandidateTexts() {
        return this.CandidateTexts;
    }

    /**
     * Set 可选数据源列表文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CandidateTexts 可选数据源列表文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCandidateTexts(String CandidateTexts) {
        this.CandidateTexts = CandidateTexts;
    }

    /**
     * Get 可选数据源列表取值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CandidateValues 可选数据源列表取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCandidateValues() {
        return this.CandidateValues;
    }

    /**
     * Set 可选数据源列表取值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CandidateValues 可选数据源列表取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCandidateValues(String CandidateValues) {
        this.CandidateValues = CandidateValues;
    }

    public DatasourceTypeByTaskType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceTypeByTaskType(DatasourceTypeByTaskType source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.CandidateTexts != null) {
            this.CandidateTexts = new String(source.CandidateTexts);
        }
        if (source.CandidateValues != null) {
            this.CandidateValues = new String(source.CandidateValues);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "CandidateTexts", this.CandidateTexts);
        this.setParamSimple(map, prefix + "CandidateValues", this.CandidateValues);

    }
}

