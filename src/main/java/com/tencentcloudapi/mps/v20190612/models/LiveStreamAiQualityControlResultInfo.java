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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiQualityControlResultInfo extends AbstractModel {

    /**
    * 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityControlResults")
    @Expose
    private QualityControlResult [] QualityControlResults;

    /**
    * 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnoseResults")
    @Expose
    private DiagnoseResult [] DiagnoseResults;

    /**
    * 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnoseResultSet")
    @Expose
    private DiagnoseResult [] DiagnoseResultSet;

    /**
     * Get 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityControlResults 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public QualityControlResult [] getQualityControlResults() {
        return this.QualityControlResults;
    }

    /**
     * Set 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityControlResults 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setQualityControlResults(QualityControlResult [] QualityControlResults) {
        this.QualityControlResults = QualityControlResults;
    }

    /**
     * Get 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnoseResults 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public DiagnoseResult [] getDiagnoseResults() {
        return this.DiagnoseResults;
    }

    /**
     * Set 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnoseResults 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDiagnoseResults(DiagnoseResult [] DiagnoseResults) {
        this.DiagnoseResults = DiagnoseResults;
    }

    /**
     * Get 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityControlResultSet 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityControlResultSet 内容质检结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnoseResultSet 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagnoseResult [] getDiagnoseResultSet() {
        return this.DiagnoseResultSet;
    }

    /**
     * Set 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnoseResultSet 格式诊断结果列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnoseResultSet(DiagnoseResult [] DiagnoseResultSet) {
        this.DiagnoseResultSet = DiagnoseResultSet;
    }

    public LiveStreamAiQualityControlResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiQualityControlResultInfo(LiveStreamAiQualityControlResultInfo source) {
        if (source.QualityControlResults != null) {
            this.QualityControlResults = new QualityControlResult[source.QualityControlResults.length];
            for (int i = 0; i < source.QualityControlResults.length; i++) {
                this.QualityControlResults[i] = new QualityControlResult(source.QualityControlResults[i]);
            }
        }
        if (source.DiagnoseResults != null) {
            this.DiagnoseResults = new DiagnoseResult[source.DiagnoseResults.length];
            for (int i = 0; i < source.DiagnoseResults.length; i++) {
                this.DiagnoseResults[i] = new DiagnoseResult(source.DiagnoseResults[i]);
            }
        }
        if (source.QualityControlResultSet != null) {
            this.QualityControlResultSet = new QualityControlResult[source.QualityControlResultSet.length];
            for (int i = 0; i < source.QualityControlResultSet.length; i++) {
                this.QualityControlResultSet[i] = new QualityControlResult(source.QualityControlResultSet[i]);
            }
        }
        if (source.DiagnoseResultSet != null) {
            this.DiagnoseResultSet = new DiagnoseResult[source.DiagnoseResultSet.length];
            for (int i = 0; i < source.DiagnoseResultSet.length; i++) {
                this.DiagnoseResultSet[i] = new DiagnoseResult(source.DiagnoseResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "QualityControlResults.", this.QualityControlResults);
        this.setParamArrayObj(map, prefix + "DiagnoseResults.", this.DiagnoseResults);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);
        this.setParamArrayObj(map, prefix + "DiagnoseResultSet.", this.DiagnoseResultSet);

    }
}

