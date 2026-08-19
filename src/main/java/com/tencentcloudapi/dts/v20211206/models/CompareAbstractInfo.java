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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareAbstractInfo extends AbstractModel {

    /**
    * <p>校验配置参数</p>
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
    * <p>一致性校验对比对象</p>
    */
    @SerializedName("Objects")
    @Expose
    private CompareObject Objects;

    /**
    * <p>对比结论: same,different</p>
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * <p>任务状态: success,failed</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>总的表数量</p>
    */
    @SerializedName("TotalTables")
    @Expose
    private Long TotalTables;

    /**
    * <p>已校验的表数量</p>
    */
    @SerializedName("CheckedTables")
    @Expose
    private Long CheckedTables;

    /**
    * <p>不一致的表数量</p>
    */
    @SerializedName("DifferentTables")
    @Expose
    private Long DifferentTables;

    /**
    * <p>跳过校验的表数量</p>
    */
    @SerializedName("SkippedTables")
    @Expose
    private Long SkippedTables;

    /**
    * <p>预估表总数</p>
    */
    @SerializedName("NearlyTableCount")
    @Expose
    private Long NearlyTableCount;

    /**
    * <p>不一致的数据行数量</p>
    */
    @SerializedName("DifferentRows")
    @Expose
    private Long DifferentRows;

    /**
    * <p>源库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
    */
    @SerializedName("SrcSampleRows")
    @Expose
    private Long SrcSampleRows;

    /**
    * <p>目标库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
    */
    @SerializedName("DstSampleRows")
    @Expose
    private Long DstSampleRows;

    /**
    * <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
     * Get <p>校验配置参数</p> 
     * @return Options <p>校验配置参数</p>
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set <p>校验配置参数</p>
     * @param Options <p>校验配置参数</p>
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    /**
     * Get <p>一致性校验对比对象</p> 
     * @return Objects <p>一致性校验对比对象</p>
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set <p>一致性校验对比对象</p>
     * @param Objects <p>一致性校验对比对象</p>
     */
    public void setObjects(CompareObject Objects) {
        this.Objects = Objects;
    }

    /**
     * Get <p>对比结论: same,different</p> 
     * @return Conclusion <p>对比结论: same,different</p>
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set <p>对比结论: same,different</p>
     * @param Conclusion <p>对比结论: same,different</p>
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get <p>任务状态: success,failed</p> 
     * @return Status <p>任务状态: success,failed</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态: success,failed</p>
     * @param Status <p>任务状态: success,failed</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>总的表数量</p> 
     * @return TotalTables <p>总的表数量</p>
     */
    public Long getTotalTables() {
        return this.TotalTables;
    }

    /**
     * Set <p>总的表数量</p>
     * @param TotalTables <p>总的表数量</p>
     */
    public void setTotalTables(Long TotalTables) {
        this.TotalTables = TotalTables;
    }

    /**
     * Get <p>已校验的表数量</p> 
     * @return CheckedTables <p>已校验的表数量</p>
     */
    public Long getCheckedTables() {
        return this.CheckedTables;
    }

    /**
     * Set <p>已校验的表数量</p>
     * @param CheckedTables <p>已校验的表数量</p>
     */
    public void setCheckedTables(Long CheckedTables) {
        this.CheckedTables = CheckedTables;
    }

    /**
     * Get <p>不一致的表数量</p> 
     * @return DifferentTables <p>不一致的表数量</p>
     */
    public Long getDifferentTables() {
        return this.DifferentTables;
    }

    /**
     * Set <p>不一致的表数量</p>
     * @param DifferentTables <p>不一致的表数量</p>
     */
    public void setDifferentTables(Long DifferentTables) {
        this.DifferentTables = DifferentTables;
    }

    /**
     * Get <p>跳过校验的表数量</p> 
     * @return SkippedTables <p>跳过校验的表数量</p>
     */
    public Long getSkippedTables() {
        return this.SkippedTables;
    }

    /**
     * Set <p>跳过校验的表数量</p>
     * @param SkippedTables <p>跳过校验的表数量</p>
     */
    public void setSkippedTables(Long SkippedTables) {
        this.SkippedTables = SkippedTables;
    }

    /**
     * Get <p>预估表总数</p> 
     * @return NearlyTableCount <p>预估表总数</p>
     */
    public Long getNearlyTableCount() {
        return this.NearlyTableCount;
    }

    /**
     * Set <p>预估表总数</p>
     * @param NearlyTableCount <p>预估表总数</p>
     */
    public void setNearlyTableCount(Long NearlyTableCount) {
        this.NearlyTableCount = NearlyTableCount;
    }

    /**
     * Get <p>不一致的数据行数量</p> 
     * @return DifferentRows <p>不一致的数据行数量</p>
     */
    public Long getDifferentRows() {
        return this.DifferentRows;
    }

    /**
     * Set <p>不一致的数据行数量</p>
     * @param DifferentRows <p>不一致的数据行数量</p>
     */
    public void setDifferentRows(Long DifferentRows) {
        this.DifferentRows = DifferentRows;
    }

    /**
     * Get <p>源库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p> 
     * @return SrcSampleRows <p>源库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
     */
    public Long getSrcSampleRows() {
        return this.SrcSampleRows;
    }

    /**
     * Set <p>源库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
     * @param SrcSampleRows <p>源库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
     */
    public void setSrcSampleRows(Long SrcSampleRows) {
        this.SrcSampleRows = SrcSampleRows;
    }

    /**
     * Get <p>目标库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p> 
     * @return DstSampleRows <p>目标库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
     */
    public Long getDstSampleRows() {
        return this.DstSampleRows;
    }

    /**
     * Set <p>目标库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
     * @param DstSampleRows <p>目标库行数，当对比类型为<strong>行数对比</strong>时此项有意义</p>
     */
    public void setDstSampleRows(Long DstSampleRows) {
        this.DstSampleRows = DstSampleRows;
    }

    /**
     * Get <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return StartedAt <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param StartedAt <p>开始时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return FinishedAt <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param FinishedAt <p>结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
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

