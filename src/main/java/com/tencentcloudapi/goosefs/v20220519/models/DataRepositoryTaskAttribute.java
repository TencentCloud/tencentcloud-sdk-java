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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataRepositoryTaskAttribute extends AbstractModel {

    /**
    * <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者Bucket到文件系统(COS_TO_FS)</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>bucket名</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>bucket路径</p>
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * <p>总的容量(单位Byte)</p>
    */
    @SerializedName("TotalCapacity")
    @Expose
    private Long TotalCapacity;

    /**
    * <p>已完成的数据量(单位Byte)</p>
    */
    @SerializedName("FinishedCapacity")
    @Expose
    private Long FinishedCapacity;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * <p>任务开始执行时间</p>
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * <p>INIT(任务初始化中) RUNNING(任务执行中) SUCCESS(任务已完成) FAIL(任务失败)</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务失败原因</p>
    */
    @SerializedName("TaskFailMsg")
    @Expose
    private String TaskFailMsg;

    /**
    * <p>总共的文件个数</p>
    */
    @SerializedName("TotalFileNumber")
    @Expose
    private Long TotalFileNumber;

    /**
    * <p>已完成的文件个数</p>
    */
    @SerializedName("FinishedFileNumber")
    @Expose
    private Long FinishedFileNumber;

    /**
    * <p>列表地址</p>
    */
    @SerializedName("TextLocation")
    @Expose
    private String TextLocation;

    /**
    * <p>执行器类型</p>
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * <p>是否自定义路径</p>
    */
    @SerializedName("EnableDataFlowSubPath")
    @Expose
    private Boolean EnableDataFlowSubPath;

    /**
    * <p>自定义路径</p>
    */
    @SerializedName("DataFlowSubPath")
    @Expose
    private String DataFlowSubPath;

    /**
    * <p>是否支持自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
    */
    @SerializedName("EnableCustomDestPath")
    @Expose
    private Boolean EnableCustomDestPath;

    /**
    * <p>自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
    */
    @SerializedName("CustomDestPath")
    @Expose
    private String CustomDestPath;

    /**
    * <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
    */
    @SerializedName("IsTaskPathAbsolute")
    @Expose
    private Boolean IsTaskPathAbsolute;

    /**
    * <p>任务内容输出桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputBucket")
    @Expose
    private String OutputBucket;

    /**
    * <p>任务内容输出桶前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputPrefix")
    @Expose
    private String OutputPrefix;

    /**
    * <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableCustomSrcPath")
    @Expose
    private Boolean EnableCustomSrcPath;

    /**
    * <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomSrcPath")
    @Expose
    private String CustomSrcPath;

    /**
     * Get <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者Bucket到文件系统(COS_TO_FS)</p> 
     * @return TaskType <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者Bucket到文件系统(COS_TO_FS)</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者Bucket到文件系统(COS_TO_FS)</p>
     * @param TaskType <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者Bucket到文件系统(COS_TO_FS)</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>bucket名</p> 
     * @return Bucket <p>bucket名</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>bucket名</p>
     * @param Bucket <p>bucket名</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>bucket路径</p> 
     * @return TaskPath <p>bucket路径</p>
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set <p>bucket路径</p>
     * @param TaskPath <p>bucket路径</p>
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get <p>总的容量(单位Byte)</p> 
     * @return TotalCapacity <p>总的容量(单位Byte)</p>
     */
    public Long getTotalCapacity() {
        return this.TotalCapacity;
    }

    /**
     * Set <p>总的容量(单位Byte)</p>
     * @param TotalCapacity <p>总的容量(单位Byte)</p>
     */
    public void setTotalCapacity(Long TotalCapacity) {
        this.TotalCapacity = TotalCapacity;
    }

    /**
     * Get <p>已完成的数据量(单位Byte)</p> 
     * @return FinishedCapacity <p>已完成的数据量(单位Byte)</p>
     */
    public Long getFinishedCapacity() {
        return this.FinishedCapacity;
    }

    /**
     * Set <p>已完成的数据量(单位Byte)</p>
     * @param FinishedCapacity <p>已完成的数据量(单位Byte)</p>
     */
    public void setFinishedCapacity(Long FinishedCapacity) {
        this.FinishedCapacity = FinishedCapacity;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return TaskCreateTime <p>任务创建时间</p>
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param TaskCreateTime <p>任务创建时间</p>
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get <p>任务开始执行时间</p> 
     * @return TaskStartTime <p>任务开始执行时间</p>
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set <p>任务开始执行时间</p>
     * @param TaskStartTime <p>任务开始执行时间</p>
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
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
     * Get <p>INIT(任务初始化中) RUNNING(任务执行中) SUCCESS(任务已完成) FAIL(任务失败)</p> 
     * @return TaskStatus <p>INIT(任务初始化中) RUNNING(任务执行中) SUCCESS(任务已完成) FAIL(任务失败)</p>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>INIT(任务初始化中) RUNNING(任务执行中) SUCCESS(任务已完成) FAIL(任务失败)</p>
     * @param TaskStatus <p>INIT(任务初始化中) RUNNING(任务执行中) SUCCESS(任务已完成) FAIL(任务失败)</p>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
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
     * Get <p>任务名</p> 
     * @return TaskName <p>任务名</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名</p>
     * @param TaskName <p>任务名</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务失败原因</p> 
     * @return TaskFailMsg <p>任务失败原因</p>
     */
    public String getTaskFailMsg() {
        return this.TaskFailMsg;
    }

    /**
     * Set <p>任务失败原因</p>
     * @param TaskFailMsg <p>任务失败原因</p>
     */
    public void setTaskFailMsg(String TaskFailMsg) {
        this.TaskFailMsg = TaskFailMsg;
    }

    /**
     * Get <p>总共的文件个数</p> 
     * @return TotalFileNumber <p>总共的文件个数</p>
     */
    public Long getTotalFileNumber() {
        return this.TotalFileNumber;
    }

    /**
     * Set <p>总共的文件个数</p>
     * @param TotalFileNumber <p>总共的文件个数</p>
     */
    public void setTotalFileNumber(Long TotalFileNumber) {
        this.TotalFileNumber = TotalFileNumber;
    }

    /**
     * Get <p>已完成的文件个数</p> 
     * @return FinishedFileNumber <p>已完成的文件个数</p>
     */
    public Long getFinishedFileNumber() {
        return this.FinishedFileNumber;
    }

    /**
     * Set <p>已完成的文件个数</p>
     * @param FinishedFileNumber <p>已完成的文件个数</p>
     */
    public void setFinishedFileNumber(Long FinishedFileNumber) {
        this.FinishedFileNumber = FinishedFileNumber;
    }

    /**
     * Get <p>列表地址</p> 
     * @return TextLocation <p>列表地址</p>
     */
    public String getTextLocation() {
        return this.TextLocation;
    }

    /**
     * Set <p>列表地址</p>
     * @param TextLocation <p>列表地址</p>
     */
    public void setTextLocation(String TextLocation) {
        this.TextLocation = TextLocation;
    }

    /**
     * Get <p>执行器类型</p> 
     * @return RepositoryType <p>执行器类型</p>
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set <p>执行器类型</p>
     * @param RepositoryType <p>执行器类型</p>
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get <p>是否自定义路径</p> 
     * @return EnableDataFlowSubPath <p>是否自定义路径</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableDataFlowSubPath() {
        return this.EnableDataFlowSubPath;
    }

    /**
     * Set <p>是否自定义路径</p>
     * @param EnableDataFlowSubPath <p>是否自定义路径</p>
     * @deprecated
     */
    @Deprecated
    public void setEnableDataFlowSubPath(Boolean EnableDataFlowSubPath) {
        this.EnableDataFlowSubPath = EnableDataFlowSubPath;
    }

    /**
     * Get <p>自定义路径</p> 
     * @return DataFlowSubPath <p>自定义路径</p>
     * @deprecated
     */
    @Deprecated
    public String getDataFlowSubPath() {
        return this.DataFlowSubPath;
    }

    /**
     * Set <p>自定义路径</p>
     * @param DataFlowSubPath <p>自定义路径</p>
     * @deprecated
     */
    @Deprecated
    public void setDataFlowSubPath(String DataFlowSubPath) {
        this.DataFlowSubPath = DataFlowSubPath;
    }

    /**
     * Get <p>是否支持自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p> 
     * @return EnableCustomDestPath <p>是否支持自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
     */
    public Boolean getEnableCustomDestPath() {
        return this.EnableCustomDestPath;
    }

    /**
     * Set <p>是否支持自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
     * @param EnableCustomDestPath <p>是否支持自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
     */
    public void setEnableCustomDestPath(Boolean EnableCustomDestPath) {
        this.EnableCustomDestPath = EnableCustomDestPath;
    }

    /**
     * Get <p>自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p> 
     * @return CustomDestPath <p>自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
     */
    public String getCustomDestPath() {
        return this.CustomDestPath;
    }

    /**
     * Set <p>自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
     * @param CustomDestPath <p>自定义目的路径（沉降表示桶前缀，预热表示本地路径）</p>
     */
    public void setCustomDestPath(String CustomDestPath) {
        this.CustomDestPath = CustomDestPath;
    }

    /**
     * Get <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p> 
     * @return IsTaskPathAbsolute <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
     */
    public Boolean getIsTaskPathAbsolute() {
        return this.IsTaskPathAbsolute;
    }

    /**
     * Set <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
     * @param IsTaskPathAbsolute <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
     */
    public void setIsTaskPathAbsolute(Boolean IsTaskPathAbsolute) {
        this.IsTaskPathAbsolute = IsTaskPathAbsolute;
    }

    /**
     * Get <p>任务内容输出桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputBucket <p>任务内容输出桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputBucket() {
        return this.OutputBucket;
    }

    /**
     * Set <p>任务内容输出桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputBucket <p>任务内容输出桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputBucket(String OutputBucket) {
        this.OutputBucket = OutputBucket;
    }

    /**
     * Get <p>任务内容输出桶前缀</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputPrefix <p>任务内容输出桶前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputPrefix() {
        return this.OutputPrefix;
    }

    /**
     * Set <p>任务内容输出桶前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputPrefix <p>任务内容输出桶前缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputPrefix(String OutputPrefix) {
        this.OutputPrefix = OutputPrefix;
    }

    /**
     * Get <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableCustomSrcPath <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableCustomSrcPath() {
        return this.EnableCustomSrcPath;
    }

    /**
     * Set <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableCustomSrcPath <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableCustomSrcPath(Boolean EnableCustomSrcPath) {
        this.EnableCustomSrcPath = EnableCustomSrcPath;
    }

    /**
     * Get <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomSrcPath <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomSrcPath() {
        return this.CustomSrcPath;
    }

    /**
     * Set <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomSrcPath <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomSrcPath(String CustomSrcPath) {
        this.CustomSrcPath = CustomSrcPath;
    }

    public DataRepositoryTaskAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataRepositoryTaskAttribute(DataRepositoryTaskAttribute source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.TotalCapacity != null) {
            this.TotalCapacity = new Long(source.TotalCapacity);
        }
        if (source.FinishedCapacity != null) {
            this.FinishedCapacity = new Long(source.FinishedCapacity);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskFailMsg != null) {
            this.TaskFailMsg = new String(source.TaskFailMsg);
        }
        if (source.TotalFileNumber != null) {
            this.TotalFileNumber = new Long(source.TotalFileNumber);
        }
        if (source.FinishedFileNumber != null) {
            this.FinishedFileNumber = new Long(source.FinishedFileNumber);
        }
        if (source.TextLocation != null) {
            this.TextLocation = new String(source.TextLocation);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.EnableDataFlowSubPath != null) {
            this.EnableDataFlowSubPath = new Boolean(source.EnableDataFlowSubPath);
        }
        if (source.DataFlowSubPath != null) {
            this.DataFlowSubPath = new String(source.DataFlowSubPath);
        }
        if (source.EnableCustomDestPath != null) {
            this.EnableCustomDestPath = new Boolean(source.EnableCustomDestPath);
        }
        if (source.CustomDestPath != null) {
            this.CustomDestPath = new String(source.CustomDestPath);
        }
        if (source.IsTaskPathAbsolute != null) {
            this.IsTaskPathAbsolute = new Boolean(source.IsTaskPathAbsolute);
        }
        if (source.OutputBucket != null) {
            this.OutputBucket = new String(source.OutputBucket);
        }
        if (source.OutputPrefix != null) {
            this.OutputPrefix = new String(source.OutputPrefix);
        }
        if (source.EnableCustomSrcPath != null) {
            this.EnableCustomSrcPath = new Boolean(source.EnableCustomSrcPath);
        }
        if (source.CustomSrcPath != null) {
            this.CustomSrcPath = new String(source.CustomSrcPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "TotalCapacity", this.TotalCapacity);
        this.setParamSimple(map, prefix + "FinishedCapacity", this.FinishedCapacity);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskFailMsg", this.TaskFailMsg);
        this.setParamSimple(map, prefix + "TotalFileNumber", this.TotalFileNumber);
        this.setParamSimple(map, prefix + "FinishedFileNumber", this.FinishedFileNumber);
        this.setParamSimple(map, prefix + "TextLocation", this.TextLocation);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "EnableDataFlowSubPath", this.EnableDataFlowSubPath);
        this.setParamSimple(map, prefix + "DataFlowSubPath", this.DataFlowSubPath);
        this.setParamSimple(map, prefix + "EnableCustomDestPath", this.EnableCustomDestPath);
        this.setParamSimple(map, prefix + "CustomDestPath", this.CustomDestPath);
        this.setParamSimple(map, prefix + "IsTaskPathAbsolute", this.IsTaskPathAbsolute);
        this.setParamSimple(map, prefix + "OutputBucket", this.OutputBucket);
        this.setParamSimple(map, prefix + "OutputPrefix", this.OutputPrefix);
        this.setParamSimple(map, prefix + "EnableCustomSrcPath", this.EnableCustomSrcPath);
        this.setParamSimple(map, prefix + "CustomSrcPath", this.CustomSrcPath);

    }
}

