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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathologicalDiagnosisDetailBlock extends AbstractModel{

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private String Part;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistologicalType")
    @Expose
    private String HistologicalType;

    /**
    * 等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistologicalGrade")
    @Expose
    private String HistologicalGrade;

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(String Part) {
        this.Part = Part;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistologicalType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHistologicalType() {
        return this.HistologicalType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistologicalType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistologicalType(String HistologicalType) {
        this.HistologicalType = HistologicalType;
    }

    /**
     * Get 等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistologicalGrade 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHistologicalGrade() {
        return this.HistologicalGrade;
    }

    /**
     * Set 等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistologicalGrade 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistologicalGrade(String HistologicalGrade) {
        this.HistologicalGrade = HistologicalGrade;
    }

    public PathologicalDiagnosisDetailBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathologicalDiagnosisDetailBlock(PathologicalDiagnosisDetailBlock source) {
        if (source.Part != null) {
            this.Part = new String(source.Part);
        }
        if (source.HistologicalType != null) {
            this.HistologicalType = new String(source.HistologicalType);
        }
        if (source.HistologicalGrade != null) {
            this.HistologicalGrade = new String(source.HistologicalGrade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Part", this.Part);
        this.setParamSimple(map, prefix + "HistologicalType", this.HistologicalType);
        this.setParamSimple(map, prefix + "HistologicalGrade", this.HistologicalGrade);

    }
}

