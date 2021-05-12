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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogExportTaskInfo extends AbstractModel{

    /**
    * 异步任务Id。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 任务开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务执行进度。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 导出日志开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogStartTime")
    @Expose
    private String LogStartTime;

    /**
    * 导出日志结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogEndTime")
    @Expose
    private String LogEndTime;

    /**
    * 日志文件总大小，单位KB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 风险等级列表。0 无风险；1 低风险；2 中风险；3 高风险。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
     * Get 异步任务Id。 
     * @return AsyncRequestId 异步任务Id。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务Id。
     * @param AsyncRequestId 异步任务Id。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 任务开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务状态。 
     * @return Status 任务状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。
     * @param Status 任务状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务执行进度。 
     * @return Progress 任务执行进度。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务执行进度。
     * @param Progress 任务执行进度。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 导出日志开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogStartTime 导出日志开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogStartTime() {
        return this.LogStartTime;
    }

    /**
     * Set 导出日志开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogStartTime 导出日志开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogStartTime(String LogStartTime) {
        this.LogStartTime = LogStartTime;
    }

    /**
     * Get 导出日志结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogEndTime 导出日志结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogEndTime() {
        return this.LogEndTime;
    }

    /**
     * Set 导出日志结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogEndTime 导出日志结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogEndTime(String LogEndTime) {
        this.LogEndTime = LogEndTime;
    }

    /**
     * Get 日志文件总大小，单位KB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize 日志文件总大小，单位KB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 日志文件总大小，单位KB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize 日志文件总大小，单位KB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 风险等级列表。0 无风险；1 低风险；2 中风险；3 高风险。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DangerLevels 风险等级列表。0 无风险；1 低风险；2 中风险；3 高风险。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set 风险等级列表。0 无风险；1 低风险；2 中风险；3 高风险。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DangerLevels 风险等级列表。0 无风险；1 低风险；2 中风险；3 高风险。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    public SecLogExportTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogExportTaskInfo(SecLogExportTaskInfo source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.LogStartTime != null) {
            this.LogStartTime = new String(source.LogStartTime);
        }
        if (source.LogEndTime != null) {
            this.LogEndTime = new String(source.LogEndTime);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.DangerLevels != null) {
            this.DangerLevels = new Long[source.DangerLevels.length];
            for (int i = 0; i < source.DangerLevels.length; i++) {
                this.DangerLevels[i] = new Long(source.DangerLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LogStartTime", this.LogStartTime);
        this.setParamSimple(map, prefix + "LogEndTime", this.LogEndTime);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamArraySimple(map, prefix + "DangerLevels.", this.DangerLevels);

    }
}

