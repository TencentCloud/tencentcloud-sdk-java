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
    * 校验配置参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
    * 一致性校验对比对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Objects")
    @Expose
    private CompareObject Objects;

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
    * 预估表总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NearlyTableCount")
    @Expose
    private Long NearlyTableCount;

    /**
    * 不一致的数据行数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DifferentRows")
    @Expose
    private Long DifferentRows;

    /**
    * 源库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcSampleRows")
    @Expose
    private Long SrcSampleRows;

    /**
    * 目标库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstSampleRows")
    @Expose
    private Long DstSampleRows;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
     * Get 校验配置参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Options 校验配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set 校验配置参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Options 校验配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    /**
     * Get 一致性校验对比对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Objects 一致性校验对比对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set 一致性校验对比对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Objects 一致性校验对比对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjects(CompareObject Objects) {
        this.Objects = Objects;
    }

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
     * Get 预估表总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NearlyTableCount 预估表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNearlyTableCount() {
        return this.NearlyTableCount;
    }

    /**
     * Set 预估表总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NearlyTableCount 预估表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNearlyTableCount(Long NearlyTableCount) {
        this.NearlyTableCount = NearlyTableCount;
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

    /**
     * Get 源库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcSampleRows 源库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSrcSampleRows() {
        return this.SrcSampleRows;
    }

    /**
     * Set 源库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcSampleRows 源库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcSampleRows(Long SrcSampleRows) {
        this.SrcSampleRows = SrcSampleRows;
    }

    /**
     * Get 目标库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstSampleRows 目标库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDstSampleRows() {
        return this.DstSampleRows;
    }

    /**
     * Set 目标库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstSampleRows 目标库行数，当对比类型为**行数对比**时此项有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstSampleRows(Long DstSampleRows) {
        this.DstSampleRows = DstSampleRows;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartedAt 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartedAt 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedAt 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedAt 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    public CompareAbstractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareAbstractInfo(CompareAbstractInfo source) {
        if (source.Options != null) {
            this.Options = new CompareOptions(source.Options);
        }
        if (source.Objects != null) {
            this.Objects = new CompareObject(source.Objects);
        }
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
        if (source.NearlyTableCount != null) {
            this.NearlyTableCount = new Long(source.NearlyTableCount);
        }
        if (source.DifferentRows != null) {
            this.DifferentRows = new Long(source.DifferentRows);
        }
        if (source.SrcSampleRows != null) {
            this.SrcSampleRows = new Long(source.SrcSampleRows);
        }
        if (source.DstSampleRows != null) {
            this.DstSampleRows = new Long(source.DstSampleRows);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalTables", this.TotalTables);
        this.setParamSimple(map, prefix + "CheckedTables", this.CheckedTables);
        this.setParamSimple(map, prefix + "DifferentTables", this.DifferentTables);
        this.setParamSimple(map, prefix + "SkippedTables", this.SkippedTables);
        this.setParamSimple(map, prefix + "NearlyTableCount", this.NearlyTableCount);
        this.setParamSimple(map, prefix + "DifferentRows", this.DifferentRows);
        this.setParamSimple(map, prefix + "SrcSampleRows", this.SrcSampleRows);
        this.setParamSimple(map, prefix + "DstSampleRows", this.DstSampleRows);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);

    }
}

