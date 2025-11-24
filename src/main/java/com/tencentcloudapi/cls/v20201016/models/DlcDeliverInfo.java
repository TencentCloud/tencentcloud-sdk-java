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
    * 任务id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 账号id。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 日志主题id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 任务名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 投递类型，0：实时投递，1：历史投递
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * 投递文件大小，单位MB
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 投递间隔 单位秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 投递时间范围的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 投递时间范围的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * dlc配置信息
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * 是否开启投递服务日志。1关闭，2开启
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * 任务状态。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务进度。历史投递任务生效。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 日志主题类型。0:标准主题，1:指标主题
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 任务修改时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 任务id。 
     * @return TaskId 任务id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id。
     * @param TaskId 任务id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 账号id。 
     * @return Uin 账号id。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 账号id。
     * @param Uin 账号id。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 日志主题id。 
     * @return TopicId 日志主题id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id。
     * @param TopicId 日志主题id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 任务名称。 
     * @return Name 任务名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称。
     * @param Name 任务名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 投递类型，0：实时投递，1：历史投递 
     * @return DeliverType 投递类型，0：实时投递，1：历史投递
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set 投递类型，0：实时投递，1：历史投递
     * @param DeliverType 投递类型，0：实时投递，1：历史投递
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get 投递文件大小，单位MB 
     * @return MaxSize 投递文件大小，单位MB
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 投递文件大小，单位MB
     * @param MaxSize 投递文件大小，单位MB
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 投递间隔 单位秒 
     * @return Interval 投递间隔 单位秒
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 投递间隔 单位秒
     * @param Interval 投递间隔 单位秒
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 投递时间范围的开始时间 
     * @return StartTime 投递时间范围的开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 投递时间范围的开始时间
     * @param StartTime 投递时间范围的开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 投递时间范围的结束时间 
     * @return EndTime 投递时间范围的结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 投递时间范围的结束时间
     * @param EndTime 投递时间范围的结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get dlc配置信息 
     * @return DlcInfo dlc配置信息
     */
    public DlcInfo getDlcInfo() {
        return this.DlcInfo;
    }

    /**
     * Set dlc配置信息
     * @param DlcInfo dlc配置信息
     */
    public void setDlcInfo(DlcInfo DlcInfo) {
        this.DlcInfo = DlcInfo;
    }

    /**
     * Get 是否开启投递服务日志。1关闭，2开启 
     * @return HasServicesLog 是否开启投递服务日志。1关闭，2开启
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set 是否开启投递服务日志。1关闭，2开启
     * @param HasServicesLog 是否开启投递服务日志。1关闭，2开启
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get 任务状态。 
     * @return Status 任务状态。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。
     * @param Status 任务状态。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度。历史投递任务生效。 
     * @return Progress 任务进度。历史投递任务生效。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度。历史投递任务生效。
     * @param Progress 任务进度。历史投递任务生效。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 日志主题类型。0:标准主题，1:指标主题 
     * @return BizType 日志主题类型。0:标准主题，1:指标主题
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 日志主题类型。0:标准主题，1:指标主题
     * @param BizType 日志主题类型。0:标准主题，1:指标主题
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务修改时间。 
     * @return UpdateTime 任务修改时间。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务修改时间。
     * @param UpdateTime 任务修改时间。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    }
}

