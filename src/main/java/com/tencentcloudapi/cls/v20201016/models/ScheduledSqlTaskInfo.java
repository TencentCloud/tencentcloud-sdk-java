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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledSqlTaskInfo extends AbstractModel {

    /**
    * <p>ScheduledSql任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>ScheduledSql任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>源日志主题id</p>
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * <p>源日志主题名称</p>
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * <p>定时SQL分析目标主题</p>
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * <p>任务创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务更新时间，格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题</p><p>5: 访问权限问题 6:内部故障 7:其他故障</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>任务启用状态，1开启,  2关闭</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>查询语句</p>
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * <p>调度开始时间，格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * <p>调度类型，1:持续运行 2:指定时间范围</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>调度结束时间，格式：yyyy-MM-dd HH:mm:ss，当process_type=2时为必传字段</p>
    */
    @SerializedName("ProcessEndTime")
    @Expose
    private String ProcessEndTime;

    /**
    * <p>调度周期(分钟)，1~1440分钟</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>查询的时间窗口. @m-15m, @m，意为近15分钟</p>
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * <p>执行延迟(秒)，0~120秒，默认60秒</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>源topicId的地域信息，支持地域见 <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档。</p>
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * <p>语法规则，0：Lucene语法，1：CQL语法</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>全文检索标记。1：关闭，2：打开。</p>
    */
    @SerializedName("FullQuery")
    @Expose
    private Long FullQuery;

    /**
    * <p>调度周期时间单位</p><p>取值范围：[1, 2]</p><p>默认值：1</p><p>默认值1（分钟），其他值2（秒）</p>
    */
    @SerializedName("ProcessPeriodUnit")
    @Expose
    private Long ProcessPeriodUnit;

    /**
     * Get <p>ScheduledSql任务id</p> 
     * @return TaskId <p>ScheduledSql任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>ScheduledSql任务id</p>
     * @param TaskId <p>ScheduledSql任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>ScheduledSql任务名称</p> 
     * @return Name <p>ScheduledSql任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>ScheduledSql任务名称</p>
     * @param Name <p>ScheduledSql任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>源日志主题id</p> 
     * @return SrcTopicId <p>源日志主题id</p>
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set <p>源日志主题id</p>
     * @param SrcTopicId <p>源日志主题id</p>
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get <p>源日志主题名称</p> 
     * @return SrcTopicName <p>源日志主题名称</p>
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set <p>源日志主题名称</p>
     * @param SrcTopicName <p>源日志主题名称</p>
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get <p>定时SQL分析目标主题</p> 
     * @return DstResource <p>定时SQL分析目标主题</p>
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set <p>定时SQL分析目标主题</p>
     * @param DstResource <p>定时SQL分析目标主题</p>
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get <p>任务创建时间。格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>任务创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>任务创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务更新时间，格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return UpdateTime <p>任务更新时间，格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务更新时间，格式：yyyy-MM-dd HH:mm:ss</p>
     * @param UpdateTime <p>任务更新时间，格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题</p><p>5: 访问权限问题 6:内部故障 7:其他故障</p> 
     * @return Status <p>任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题</p><p>5: 访问权限问题 6:内部故障 7:其他故障</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题</p><p>5: 访问权限问题 6:内部故障 7:其他故障</p>
     * @param Status <p>任务状态，1:运行 2:停止 3:异常-找不到源日志主题 4:异常-找不到目标主题</p><p>5: 访问权限问题 6:内部故障 7:其他故障</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务启用状态，1开启,  2关闭</p> 
     * @return EnableFlag <p>任务启用状态，1开启,  2关闭</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>任务启用状态，1开启,  2关闭</p>
     * @param EnableFlag <p>任务启用状态，1开启,  2关闭</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>查询语句</p> 
     * @return ScheduledSqlContent <p>查询语句</p>
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set <p>查询语句</p>
     * @param ScheduledSqlContent <p>查询语句</p>
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get <p>调度开始时间，格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return ProcessStartTime <p>调度开始时间，格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>调度开始时间，格式：yyyy-MM-dd HH:mm:ss</p>
     * @param ProcessStartTime <p>调度开始时间，格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>调度类型，1:持续运行 2:指定时间范围</p> 
     * @return ProcessType <p>调度类型，1:持续运行 2:指定时间范围</p>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>调度类型，1:持续运行 2:指定时间范围</p>
     * @param ProcessType <p>调度类型，1:持续运行 2:指定时间范围</p>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>调度结束时间，格式：yyyy-MM-dd HH:mm:ss，当process_type=2时为必传字段</p> 
     * @return ProcessEndTime <p>调度结束时间，格式：yyyy-MM-dd HH:mm:ss，当process_type=2时为必传字段</p>
     */
    public String getProcessEndTime() {
        return this.ProcessEndTime;
    }

    /**
     * Set <p>调度结束时间，格式：yyyy-MM-dd HH:mm:ss，当process_type=2时为必传字段</p>
     * @param ProcessEndTime <p>调度结束时间，格式：yyyy-MM-dd HH:mm:ss，当process_type=2时为必传字段</p>
     */
    public void setProcessEndTime(String ProcessEndTime) {
        this.ProcessEndTime = ProcessEndTime;
    }

    /**
     * Get <p>调度周期(分钟)，1~1440分钟</p> 
     * @return ProcessPeriod <p>调度周期(分钟)，1~1440分钟</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>调度周期(分钟)，1~1440分钟</p>
     * @param ProcessPeriod <p>调度周期(分钟)，1~1440分钟</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>查询的时间窗口. @m-15m, @m，意为近15分钟</p> 
     * @return ProcessTimeWindow <p>查询的时间窗口. @m-15m, @m，意为近15分钟</p>
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set <p>查询的时间窗口. @m-15m, @m，意为近15分钟</p>
     * @param ProcessTimeWindow <p>查询的时间窗口. @m-15m, @m，意为近15分钟</p>
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get <p>执行延迟(秒)，0~120秒，默认60秒</p> 
     * @return ProcessDelay <p>执行延迟(秒)，0~120秒，默认60秒</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>执行延迟(秒)，0~120秒，默认60秒</p>
     * @param ProcessDelay <p>执行延迟(秒)，0~120秒，默认60秒</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>源topicId的地域信息，支持地域见 <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档。</p> 
     * @return SrcTopicRegion <p>源topicId的地域信息，支持地域见 <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档。</p>
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set <p>源topicId的地域信息，支持地域见 <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档。</p>
     * @param SrcTopicRegion <p>源topicId的地域信息，支持地域见 <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档。</p>
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get <p>语法规则，0：Lucene语法，1：CQL语法</p> 
     * @return SyntaxRule <p>语法规则，0：Lucene语法，1：CQL语法</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>语法规则，0：Lucene语法，1：CQL语法</p>
     * @param SyntaxRule <p>语法规则，0：Lucene语法，1：CQL语法</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>全文检索标记。1：关闭，2：打开。</p> 
     * @return FullQuery <p>全文检索标记。1：关闭，2：打开。</p>
     */
    public Long getFullQuery() {
        return this.FullQuery;
    }

    /**
     * Set <p>全文检索标记。1：关闭，2：打开。</p>
     * @param FullQuery <p>全文检索标记。1：关闭，2：打开。</p>
     */
    public void setFullQuery(Long FullQuery) {
        this.FullQuery = FullQuery;
    }

    /**
     * Get <p>调度周期时间单位</p><p>取值范围：[1, 2]</p><p>默认值：1</p><p>默认值1（分钟），其他值2（秒）</p> 
     * @return ProcessPeriodUnit <p>调度周期时间单位</p><p>取值范围：[1, 2]</p><p>默认值：1</p><p>默认值1（分钟），其他值2（秒）</p>
     */
    public Long getProcessPeriodUnit() {
        return this.ProcessPeriodUnit;
    }

    /**
     * Set <p>调度周期时间单位</p><p>取值范围：[1, 2]</p><p>默认值：1</p><p>默认值1（分钟），其他值2（秒）</p>
     * @param ProcessPeriodUnit <p>调度周期时间单位</p><p>取值范围：[1, 2]</p><p>默认值：1</p><p>默认值1（分钟），其他值2（秒）</p>
     */
    public void setProcessPeriodUnit(Long ProcessPeriodUnit) {
        this.ProcessPeriodUnit = ProcessPeriodUnit;
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
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.FullQuery != null) {
            this.FullQuery = new Long(source.FullQuery);
        }
        if (source.ProcessPeriodUnit != null) {
            this.ProcessPeriodUnit = new Long(source.ProcessPeriodUnit);
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
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "FullQuery", this.FullQuery);
        this.setParamSimple(map, prefix + "ProcessPeriodUnit", this.ProcessPeriodUnit);

    }
}

