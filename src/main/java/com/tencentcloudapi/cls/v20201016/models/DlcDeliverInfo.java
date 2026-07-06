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

public class DlcDeliverInfo extends AbstractModel {

    /**
    * <p>任务id。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>账号id。</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>日志主题id。</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>任务名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>投递类型，0：实时投递，1：历史投递</p>
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * <p>投递文件大小，单位MB</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>投递间隔 单位秒</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>投递时间范围的开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>投递时间范围的结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>dlc配置信息</p>
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * <p>是否开启投递服务日志。1关闭，2开启</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>任务状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>任务进度。历史投递任务生效。</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>日志主题类型。0:标准主题，1:指标主题</p>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * <p>任务创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>任务修改时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>自动创建dlc字段</p><p>默认值：false</p><p>当您的日志中有新增字段时，系统自动将其投递至DLC</p>
    */
    @SerializedName("AutoCreateField")
    @Expose
    private Boolean AutoCreateField;

    /**
    * <p>将投递失败的日志存储至DLC表</p>
    */
    @SerializedName("DlcFailHandle")
    @Expose
    private DlcFailHandle DlcFailHandle;

    /**
    * <p>日志预过滤-数据写入 Splunk 的原始数据进行预过滤处理</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>任务id。</p> 
     * @return TaskId <p>任务id。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id。</p>
     * @param TaskId <p>任务id。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>账号id。</p> 
     * @return Uin <p>账号id。</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>账号id。</p>
     * @param Uin <p>账号id。</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>日志主题id。</p> 
     * @return TopicId <p>日志主题id。</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id。</p>
     * @param TopicId <p>日志主题id。</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>任务名称。</p> 
     * @return Name <p>任务名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称。</p>
     * @param Name <p>任务名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>投递类型，0：实时投递，1：历史投递</p> 
     * @return DeliverType <p>投递类型，0：实时投递，1：历史投递</p>
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>投递类型，0：实时投递，1：历史投递</p>
     * @param DeliverType <p>投递类型，0：实时投递，1：历史投递</p>
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get <p>投递文件大小，单位MB</p> 
     * @return MaxSize <p>投递文件大小，单位MB</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>投递文件大小，单位MB</p>
     * @param MaxSize <p>投递文件大小，单位MB</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>投递间隔 单位秒</p> 
     * @return Interval <p>投递间隔 单位秒</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>投递间隔 单位秒</p>
     * @param Interval <p>投递间隔 单位秒</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>投递时间范围的开始时间</p> 
     * @return StartTime <p>投递时间范围的开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>投递时间范围的开始时间</p>
     * @param StartTime <p>投递时间范围的开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>投递时间范围的结束时间</p> 
     * @return EndTime <p>投递时间范围的结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>投递时间范围的结束时间</p>
     * @param EndTime <p>投递时间范围的结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>dlc配置信息</p> 
     * @return DlcInfo <p>dlc配置信息</p>
     */
    public DlcInfo getDlcInfo() {
        return this.DlcInfo;
    }

    /**
     * Set <p>dlc配置信息</p>
     * @param DlcInfo <p>dlc配置信息</p>
     */
    public void setDlcInfo(DlcInfo DlcInfo) {
        this.DlcInfo = DlcInfo;
    }

    /**
     * Get <p>是否开启投递服务日志。1关闭，2开启</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1关闭，2开启</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1关闭，2开启</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1关闭，2开启</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>任务状态。</p> 
     * @return Status <p>任务状态。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p>
     * @param Status <p>任务状态。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务进度。历史投递任务生效。</p> 
     * @return Progress <p>任务进度。历史投递任务生效。</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>任务进度。历史投递任务生效。</p>
     * @param Progress <p>任务进度。历史投递任务生效。</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>日志主题类型。0:标准主题，1:指标主题</p> 
     * @return BizType <p>日志主题类型。0:标准主题，1:指标主题</p>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>日志主题类型。0:标准主题，1:指标主题</p>
     * @param BizType <p>日志主题类型。0:标准主题，1:指标主题</p>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>任务创建时间。</p> 
     * @return CreateTime <p>任务创建时间。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间。</p>
     * @param CreateTime <p>任务创建时间。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务修改时间。</p> 
     * @return UpdateTime <p>任务修改时间。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务修改时间。</p>
     * @param UpdateTime <p>任务修改时间。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>自动创建dlc字段</p><p>默认值：false</p><p>当您的日志中有新增字段时，系统自动将其投递至DLC</p> 
     * @return AutoCreateField <p>自动创建dlc字段</p><p>默认值：false</p><p>当您的日志中有新增字段时，系统自动将其投递至DLC</p>
     */
    public Boolean getAutoCreateField() {
        return this.AutoCreateField;
    }

    /**
     * Set <p>自动创建dlc字段</p><p>默认值：false</p><p>当您的日志中有新增字段时，系统自动将其投递至DLC</p>
     * @param AutoCreateField <p>自动创建dlc字段</p><p>默认值：false</p><p>当您的日志中有新增字段时，系统自动将其投递至DLC</p>
     */
    public void setAutoCreateField(Boolean AutoCreateField) {
        this.AutoCreateField = AutoCreateField;
    }

    /**
     * Get <p>将投递失败的日志存储至DLC表</p> 
     * @return DlcFailHandle <p>将投递失败的日志存储至DLC表</p>
     */
    public DlcFailHandle getDlcFailHandle() {
        return this.DlcFailHandle;
    }

    /**
     * Set <p>将投递失败的日志存储至DLC表</p>
     * @param DlcFailHandle <p>将投递失败的日志存储至DLC表</p>
     */
    public void setDlcFailHandle(DlcFailHandle DlcFailHandle) {
        this.DlcFailHandle = DlcFailHandle;
    }

    /**
     * Get <p>日志预过滤-数据写入 Splunk 的原始数据进行预过滤处理</p> 
     * @return DSLFilter <p>日志预过滤-数据写入 Splunk 的原始数据进行预过滤处理</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>日志预过滤-数据写入 Splunk 的原始数据进行预过滤处理</p>
     * @param DSLFilter <p>日志预过滤-数据写入 Splunk 的原始数据进行预过滤处理</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public DlcDeliverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcDeliverInfo(DlcDeliverInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new Long(source.DeliverType);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DlcInfo != null) {
            this.DlcInfo = new DlcInfo(source.DlcInfo);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.AutoCreateField != null) {
            this.AutoCreateField = new Boolean(source.AutoCreateField);
        }
        if (source.DlcFailHandle != null) {
            this.DlcFailHandle = new DlcFailHandle(source.DlcFailHandle);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "DlcInfo.", this.DlcInfo);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AutoCreateField", this.AutoCreateField);
        this.setParamObj(map, prefix + "DlcFailHandle.", this.DlcFailHandle);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

