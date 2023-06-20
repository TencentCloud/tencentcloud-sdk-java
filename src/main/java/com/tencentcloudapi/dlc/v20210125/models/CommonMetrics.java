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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMetrics extends AbstractModel{

    /**
    * 创建任务时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTaskTime")
    @Expose
    private Float CreateTaskTime;

    /**
    * 预处理总时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessTime")
    @Expose
    private Float ProcessTime;

    /**
    * 排队时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueTime")
    @Expose
    private Float QueueTime;

    /**
    * 执行时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTime")
    @Expose
    private Float ExecutionTime;

    /**
    * 是否命中结果缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsResultCacheHit")
    @Expose
    private Boolean IsResultCacheHit;

    /**
    * 匹配物化视图数据量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchedMVBytes")
    @Expose
    private Long MatchedMVBytes;

    /**
    * 匹配物化视图列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchedMVs")
    @Expose
    private String MatchedMVs;

    /**
    * 结果数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedBytes")
    @Expose
    private String AffectedBytes;

    /**
    * 	结果行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedRows")
    @Expose
    private Long AffectedRows;

    /**
    * 扫描数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessedBytes")
    @Expose
    private Long ProcessedBytes;

    /**
    * 	扫描行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessedRows")
    @Expose
    private Long ProcessedRows;

    /**
     * Get 创建任务时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTaskTime 创建任务时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCreateTaskTime() {
        return this.CreateTaskTime;
    }

    /**
     * Set 创建任务时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTaskTime 创建任务时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTaskTime(Float CreateTaskTime) {
        this.CreateTaskTime = CreateTaskTime;
    }

    /**
     * Get 预处理总时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessTime 预处理总时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProcessTime() {
        return this.ProcessTime;
    }

    /**
     * Set 预处理总时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessTime 预处理总时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessTime(Float ProcessTime) {
        this.ProcessTime = ProcessTime;
    }

    /**
     * Get 排队时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueTime 排队时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getQueueTime() {
        return this.QueueTime;
    }

    /**
     * Set 排队时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueTime 排队时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueTime(Float QueueTime) {
        this.QueueTime = QueueTime;
    }

    /**
     * Get 执行时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTime 执行时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set 执行时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTime 执行时长，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTime(Float ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get 是否命中结果缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsResultCacheHit 是否命中结果缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsResultCacheHit() {
        return this.IsResultCacheHit;
    }

    /**
     * Set 是否命中结果缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsResultCacheHit 是否命中结果缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsResultCacheHit(Boolean IsResultCacheHit) {
        this.IsResultCacheHit = IsResultCacheHit;
    }

    /**
     * Get 匹配物化视图数据量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchedMVBytes 匹配物化视图数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMatchedMVBytes() {
        return this.MatchedMVBytes;
    }

    /**
     * Set 匹配物化视图数据量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchedMVBytes 匹配物化视图数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchedMVBytes(Long MatchedMVBytes) {
        this.MatchedMVBytes = MatchedMVBytes;
    }

    /**
     * Get 匹配物化视图列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchedMVs 匹配物化视图列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchedMVs() {
        return this.MatchedMVs;
    }

    /**
     * Set 匹配物化视图列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchedMVs 匹配物化视图列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchedMVs(String MatchedMVs) {
        this.MatchedMVs = MatchedMVs;
    }

    /**
     * Get 结果数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedBytes 结果数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAffectedBytes() {
        return this.AffectedBytes;
    }

    /**
     * Set 结果数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedBytes 结果数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedBytes(String AffectedBytes) {
        this.AffectedBytes = AffectedBytes;
    }

    /**
     * Get 	结果行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedRows 	结果行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectedRows() {
        return this.AffectedRows;
    }

    /**
     * Set 	结果行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedRows 	结果行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedRows(Long AffectedRows) {
        this.AffectedRows = AffectedRows;
    }

    /**
     * Get 扫描数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessedBytes 扫描数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessedBytes() {
        return this.ProcessedBytes;
    }

    /**
     * Set 扫描数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessedBytes 扫描数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessedBytes(Long ProcessedBytes) {
        this.ProcessedBytes = ProcessedBytes;
    }

    /**
     * Get 	扫描行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessedRows 	扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessedRows() {
        return this.ProcessedRows;
    }

    /**
     * Set 	扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessedRows 	扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessedRows(Long ProcessedRows) {
        this.ProcessedRows = ProcessedRows;
    }

    public CommonMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMetrics(CommonMetrics source) {
        if (source.CreateTaskTime != null) {
            this.CreateTaskTime = new Float(source.CreateTaskTime);
        }
        if (source.ProcessTime != null) {
            this.ProcessTime = new Float(source.ProcessTime);
        }
        if (source.QueueTime != null) {
            this.QueueTime = new Float(source.QueueTime);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new Float(source.ExecutionTime);
        }
        if (source.IsResultCacheHit != null) {
            this.IsResultCacheHit = new Boolean(source.IsResultCacheHit);
        }
        if (source.MatchedMVBytes != null) {
            this.MatchedMVBytes = new Long(source.MatchedMVBytes);
        }
        if (source.MatchedMVs != null) {
            this.MatchedMVs = new String(source.MatchedMVs);
        }
        if (source.AffectedBytes != null) {
            this.AffectedBytes = new String(source.AffectedBytes);
        }
        if (source.AffectedRows != null) {
            this.AffectedRows = new Long(source.AffectedRows);
        }
        if (source.ProcessedBytes != null) {
            this.ProcessedBytes = new Long(source.ProcessedBytes);
        }
        if (source.ProcessedRows != null) {
            this.ProcessedRows = new Long(source.ProcessedRows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTaskTime", this.CreateTaskTime);
        this.setParamSimple(map, prefix + "ProcessTime", this.ProcessTime);
        this.setParamSimple(map, prefix + "QueueTime", this.QueueTime);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "IsResultCacheHit", this.IsResultCacheHit);
        this.setParamSimple(map, prefix + "MatchedMVBytes", this.MatchedMVBytes);
        this.setParamSimple(map, prefix + "MatchedMVs", this.MatchedMVs);
        this.setParamSimple(map, prefix + "AffectedBytes", this.AffectedBytes);
        this.setParamSimple(map, prefix + "AffectedRows", this.AffectedRows);
        this.setParamSimple(map, prefix + "ProcessedBytes", this.ProcessedBytes);
        this.setParamSimple(map, prefix + "ProcessedRows", this.ProcessedRows);

    }
}

