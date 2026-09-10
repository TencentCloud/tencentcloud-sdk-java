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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwMCPToolImportTaskResult extends AbstractModel {

    /**
    * <p>导入失败的数量</p>
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * <p>已处理导入Tool的总数</p>
    */
    @SerializedName("ProcessedCount")
    @Expose
    private Long ProcessedCount;

    /**
    * <p>成功导入的Tool数量</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>End： 结束</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>导入结果详情</p>
    */
    @SerializedName("ToolsImportResult")
    @Expose
    private CNAPIGwMCPToolImportResult [] ToolsImportResult;

    /**
    * <p>待导入Tools的总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>导入失败的数量</p> 
     * @return FailedCount <p>导入失败的数量</p>
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set <p>导入失败的数量</p>
     * @param FailedCount <p>导入失败的数量</p>
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get <p>已处理导入Tool的总数</p> 
     * @return ProcessedCount <p>已处理导入Tool的总数</p>
     */
    public Long getProcessedCount() {
        return this.ProcessedCount;
    }

    /**
     * Set <p>已处理导入Tool的总数</p>
     * @param ProcessedCount <p>已处理导入Tool的总数</p>
     */
    public void setProcessedCount(Long ProcessedCount) {
        this.ProcessedCount = ProcessedCount;
    }

    /**
     * Get <p>成功导入的Tool数量</p> 
     * @return SuccessCount <p>成功导入的Tool数量</p>
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>成功导入的Tool数量</p>
     * @param SuccessCount <p>成功导入的Tool数量</p>
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskEndTime <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskEndTime <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStartTime <p>任务开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set <p>任务开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStartTime <p>任务开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>End： 结束</li></ul> 
     * @return TaskStatus <p>任务状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>End： 结束</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>End： 结束</li></ul>
     * @param TaskStatus <p>任务状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>End： 结束</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>导入结果详情</p> 
     * @return ToolsImportResult <p>导入结果详情</p>
     */
    public CNAPIGwMCPToolImportResult [] getToolsImportResult() {
        return this.ToolsImportResult;
    }

    /**
     * Set <p>导入结果详情</p>
     * @param ToolsImportResult <p>导入结果详情</p>
     */
    public void setToolsImportResult(CNAPIGwMCPToolImportResult [] ToolsImportResult) {
        this.ToolsImportResult = ToolsImportResult;
    }

    /**
     * Get <p>待导入Tools的总数</p> 
     * @return TotalCount <p>待导入Tools的总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>待导入Tools的总数</p>
     * @param TotalCount <p>待导入Tools的总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public CNAPIGwMCPToolImportTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwMCPToolImportTaskResult(CNAPIGwMCPToolImportTaskResult source) {
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.ProcessedCount != null) {
            this.ProcessedCount = new Long(source.ProcessedCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ToolsImportResult != null) {
            this.ToolsImportResult = new CNAPIGwMCPToolImportResult[source.ToolsImportResult.length];
            for (int i = 0; i < source.ToolsImportResult.length; i++) {
                this.ToolsImportResult[i] = new CNAPIGwMCPToolImportResult(source.ToolsImportResult[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "ProcessedCount", this.ProcessedCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArrayObj(map, prefix + "ToolsImportResult.", this.ToolsImportResult);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

