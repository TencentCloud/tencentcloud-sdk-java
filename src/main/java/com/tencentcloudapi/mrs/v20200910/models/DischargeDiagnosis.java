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

public class DischargeDiagnosis extends AbstractModel{

    /**
    * 表格位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIndex")
    @Expose
    private Long TableIndex;

    /**
    * 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutDiagnosis")
    @Expose
    private BlockInfo OutDiagnosis;

    /**
    * 疾病编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseaseCode")
    @Expose
    private BlockInfo DiseaseCode;

    /**
    * 入院情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InStatus")
    @Expose
    private BlockInfo InStatus;

    /**
    * 出院情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutStatus")
    @Expose
    private BlockInfo OutStatus;

    /**
     * Get 表格位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIndex 表格位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableIndex() {
        return this.TableIndex;
    }

    /**
     * Set 表格位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIndex 表格位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIndex(Long TableIndex) {
        this.TableIndex = TableIndex;
    }

    /**
     * Get 出院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutDiagnosis 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getOutDiagnosis() {
        return this.OutDiagnosis;
    }

    /**
     * Set 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutDiagnosis 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutDiagnosis(BlockInfo OutDiagnosis) {
        this.OutDiagnosis = OutDiagnosis;
    }

    /**
     * Get 疾病编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseaseCode 疾病编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getDiseaseCode() {
        return this.DiseaseCode;
    }

    /**
     * Set 疾病编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseaseCode 疾病编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseaseCode(BlockInfo DiseaseCode) {
        this.DiseaseCode = DiseaseCode;
    }

    /**
     * Get 入院情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InStatus 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getInStatus() {
        return this.InStatus;
    }

    /**
     * Set 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param InStatus 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInStatus(BlockInfo InStatus) {
        this.InStatus = InStatus;
    }

    /**
     * Get 出院情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutStatus 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getOutStatus() {
        return this.OutStatus;
    }

    /**
     * Set 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutStatus 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutStatus(BlockInfo OutStatus) {
        this.OutStatus = OutStatus;
    }

    public DischargeDiagnosis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DischargeDiagnosis(DischargeDiagnosis source) {
        if (source.TableIndex != null) {
            this.TableIndex = new Long(source.TableIndex);
        }
        if (source.OutDiagnosis != null) {
            this.OutDiagnosis = new BlockInfo(source.OutDiagnosis);
        }
        if (source.DiseaseCode != null) {
            this.DiseaseCode = new BlockInfo(source.DiseaseCode);
        }
        if (source.InStatus != null) {
            this.InStatus = new BlockInfo(source.InStatus);
        }
        if (source.OutStatus != null) {
            this.OutStatus = new BlockInfo(source.OutStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableIndex", this.TableIndex);
        this.setParamObj(map, prefix + "OutDiagnosis.", this.OutDiagnosis);
        this.setParamObj(map, prefix + "DiseaseCode.", this.DiseaseCode);
        this.setParamObj(map, prefix + "InStatus.", this.InStatus);
        this.setParamObj(map, prefix + "OutStatus.", this.OutStatus);

    }
}

