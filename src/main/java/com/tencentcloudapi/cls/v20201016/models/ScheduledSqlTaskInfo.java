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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledSqlTaskInfo extends AbstractModel{

    /**
    * ScheduledSql任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * ScheduledSql任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 源日志主题id
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * 源日志主题名称
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * 定时SQL分析目标主题
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题

5: 访问权限问题 6:内部故障 7:其他故障
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务启用状态，1开启,  2关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 查询语句
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * 调度开始时间
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * 调度类型，1:持续运行 2:指定时间范围
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * 调度结束时间，当process_type=2时为必传字段
    */
    @SerializedName("ProcessEndTime")
    @Expose
    private String ProcessEndTime;

    /**
    * 调度周期(分钟)
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * 查询的时间窗口. @m-15m, @m，意为近15分钟
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * 执行延迟(秒)
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * 源topicId的地域信息
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * 语法规则，0：Lucene语法，1：CQL语法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get ScheduledSql任务id 
     * @return TaskId ScheduledSql任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ScheduledSql任务id
     * @param TaskId ScheduledSql任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get ScheduledSql任务名称 
     * @return Name ScheduledSql任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ScheduledSql任务名称
     * @param Name ScheduledSql任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 源日志主题id 
     * @return SrcTopicId 源日志主题id
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set 源日志主题id
     * @param SrcTopicId 源日志主题id
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get 源日志主题名称 
     * @return SrcTopicName 源日志主题名称
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set 源日志主题名称
     * @param SrcTopicName 源日志主题名称
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get 定时SQL分析目标主题 
     * @return DstResource 定时SQL分析目标主题
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set 定时SQL分析目标主题
     * @param DstResource 定时SQL分析目标主题
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间 
     * @return UpdateTime 任务更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间
     * @param UpdateTime 任务更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题

5: 访问权限问题 6:内部故障 7:其他故障 
     * @return Status 任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题

5: 访问权限问题 6:内部故障 7:其他故障
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题

5: 访问权限问题 6:内部故障 7:其他故障
     * @param Status 任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题

5: 访问权限问题 6:内部故障 7:其他故障
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务启用状态，1开启,  2关闭 
     * @return EnableFlag 任务启用状态，1开启,  2关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启用状态，1开启,  2关闭
     * @param EnableFlag 任务启用状态，1开启,  2关闭
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get 查询语句 
     * @return ScheduledSqlContent 查询语句
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set 查询语句
     * @param ScheduledSqlContent 查询语句
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get 调度开始时间 
     * @return ProcessStartTime 调度开始时间
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set 调度开始时间
     * @param ProcessStartTime 调度开始时间
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get 调度类型，1:持续运行 2:指定时间范围 
     * @return ProcessType 调度类型，1:持续运行 2:指定时间范围
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 调度类型，1:持续运行 2:指定时间范围
     * @param ProcessType 调度类型，1:持续运行 2:指定时间范围
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 调度结束时间，当process_type=2时为必传字段 
     * @return ProcessEndTime 调度结束时间，当process_type=2时为必传字段
     */
    public String getProcessEndTime() {
        return this.ProcessEndTime;
    }

    /**
     * Set 调度结束时间，当process_type=2时为必传字段
     * @param ProcessEndTime 调度结束时间，当process_type=2时为必传字段
     */
    public void setProcessEndTime(String ProcessEndTime) {
        this.ProcessEndTime = ProcessEndTime;
    }

    /**
     * Get 调度周期(分钟) 
     * @return ProcessPeriod 调度周期(分钟)
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set 调度周期(分钟)
     * @param ProcessPeriod 调度周期(分钟)
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get 查询的时间窗口. @m-15m, @m，意为近15分钟 
     * @return ProcessTimeWindow 查询的时间窗口. @m-15m, @m，意为近15分钟
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set 查询的时间窗口. @m-15m, @m，意为近15分钟
     * @param ProcessTimeWindow 查询的时间窗口. @m-15m, @m，意为近15分钟
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get 执行延迟(秒) 
     * @return ProcessDelay 执行延迟(秒)
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set 执行延迟(秒)
     * @param ProcessDelay 执行延迟(秒)
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get 源topicId的地域信息 
     * @return SrcTopicRegion 源topicId的地域信息
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set 源topicId的地域信息
     * @param SrcTopicRegion 源topicId的地域信息
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get 语法规则，0：Lucene语法，1：CQL语法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyntaxRule 语法规则，0：Lucene语法，1：CQL语法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set 语法规则，0：Lucene语法，1：CQL语法
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyntaxRule 语法规则，0：Lucene语法，1：CQL语法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public ScheduledSqlTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledSqlTaskInfo(ScheduledSqlTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.SrcTopicName != null) {
            this.SrcTopicName = new String(source.SrcTopicName);
        }
        if (source.DstResource != null) {
            this.DstResource = new ScheduledSqlResouceInfo(source.DstResource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.ScheduledSqlContent != null) {
            this.ScheduledSqlContent = new String(source.ScheduledSqlContent);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new String(source.ProcessStartTime);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.ProcessEndTime != null) {
            this.ProcessEndTime = new String(source.ProcessEndTime);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessTimeWindow != null) {
            this.ProcessTimeWindow = new String(source.ProcessTimeWindow);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.SrcTopicRegion != null) {
            this.SrcTopicRegion = new String(source.SrcTopicRegion);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "SrcTopicName", this.SrcTopicName);
        this.setParamObj(map, prefix + "DstResource.", this.DstResource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ScheduledSqlContent", this.ScheduledSqlContent);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "ProcessEndTime", this.ProcessEndTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessTimeWindow", this.ProcessTimeWindow);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "SrcTopicRegion", this.SrcTopicRegion);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}

