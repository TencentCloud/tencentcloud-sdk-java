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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareAbstractInfo extends AbstractModel{

    /**
    * 对比结论: same,different
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * 任务状态: success,failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 总的表数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTables")
    @Expose
    private Long TotalTables;

    /**
    * 已校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckedTables")
    @Expose
    private Long CheckedTables;

    /**
    * 不一致的表数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DifferentTables")
    @Expose
    private Long DifferentTables;

    /**
    * 跳过校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkippedTables")
    @Expose
    private Long SkippedTables;

    /**
    * 不一致的数据行数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DifferentRows")
    @Expose
    private Long DifferentRows;

    /**
     * Get 对比结论: same,different
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conclusion 对比结论: same,different
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 对比结论: same,different
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conclusion 对比结论: same,different
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get 任务状态: success,failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态: success,failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态: success,failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态: success,failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 总的表数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTables 总的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTables() {
        return this.TotalTables;
    }

    /**
     * Set 总的表数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTables 总的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTables(Long TotalTables) {
        this.TotalTables = TotalTables;
    }

    /**
     * Get 已校验的表数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckedTables 已校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckedTables() {
        return this.CheckedTables;
    }

    /**
     * Set 已校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckedTables 已校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckedTables(Long CheckedTables) {
        this.CheckedTables = CheckedTables;
    }

    /**
     * Get 不一致的表数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DifferentTables 不一致的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDifferentTables() {
        return this.DifferentTables;
    }

    /**
     * Set 不一致的表数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DifferentTables 不一致的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDifferentTables(Long DifferentTables) {
        this.DifferentTables = DifferentTables;
    }

    /**
     * Get 跳过校验的表数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkippedTables 跳过校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSkippedTables() {
        return this.SkippedTables;
    }

    /**
     * Set 跳过校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkippedTables 跳过校验的表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkippedTables(Long SkippedTables) {
        this.SkippedTables = SkippedTables;
    }

    /**
     * Get 不一致的数据行数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DifferentRows 不一致的数据行数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDifferentRows() {
        return this.DifferentRows;
    }

    /**
     * Set 不一致的数据行数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DifferentRows 不一致的数据行数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDifferentRows(Long DifferentRows) {
        this.DifferentRows = DifferentRows;
    }

    public CompareAbstractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareAbstractInfo(CompareAbstractInfo source) {
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TotalTables != null) {
            this.TotalTables = new Long(source.TotalTables);
        }
        if (source.CheckedTables != null) {
            this.CheckedTables = new Long(source.CheckedTables);
        }
        if (source.DifferentTables != null) {
            this.DifferentTables = new Long(source.DifferentTables);
        }
        if (source.SkippedTables != null) {
            this.SkippedTables = new Long(source.SkippedTables);
        }
        if (source.DifferentRows != null) {
            this.DifferentRows = new Long(source.DifferentRows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalTables", this.TotalTables);
        this.setParamSimple(map, prefix + "CheckedTables", this.CheckedTables);
        this.setParamSimple(map, prefix + "DifferentTables", this.DifferentTables);
        this.setParamSimple(map, prefix + "SkippedTables", this.SkippedTables);
        this.setParamSimple(map, prefix + "DifferentRows", this.DifferentRows);

    }
}

