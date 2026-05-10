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

public class RecordingRuleYamlTaskInfo extends AbstractModel {

    /**
    * yaml配置文件id
    */
    @SerializedName("YamlId")
    @Expose
    private String YamlId;

    /**
    * 源日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 写入描述的日志主题id
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

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
    * 调度开始时间
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * 调度周期(分钟)
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * 执行延迟(秒)
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * 是否开启投递服务日志。1：关闭，2：开启。
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * yaml配置文件名称
    */
    @SerializedName("YamlConfigName")
    @Expose
    private String YamlConfigName;

    /**
    * yaml配置文件内容
    */
    @SerializedName("YamlContent")
    @Expose
    private String YamlContent;

    /**
    * yaml文件子任务数量
    */
    @SerializedName("SubTaskCount")
    @Expose
    private Long SubTaskCount;

    /**
     * Get yaml配置文件id 
     * @return YamlId yaml配置文件id
     */
    public String getYamlId() {
        return this.YamlId;
    }

    /**
     * Set yaml配置文件id
     * @param YamlId yaml配置文件id
     */
    public void setYamlId(String YamlId) {
        this.YamlId = YamlId;
    }

    /**
     * Get 源日志主题id 
     * @return TopicId 源日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 源日志主题id
     * @param TopicId 源日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 写入描述的日志主题id 
     * @return DstTopicId 写入描述的日志主题id
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set 写入描述的日志主题id
     * @param DstTopicId 写入描述的日志主题id
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
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
     * Get 调度开始时间 
     * @return ProcessStartTime 调度开始时间
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set 调度开始时间
     * @param ProcessStartTime 调度开始时间
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
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
     * Get 是否开启投递服务日志。1：关闭，2：开启。 
     * @return HasServicesLog 是否开启投递服务日志。1：关闭，2：开启。
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set 是否开启投递服务日志。1：关闭，2：开启。
     * @param HasServicesLog 是否开启投递服务日志。1：关闭，2：开启。
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get yaml配置文件名称 
     * @return YamlConfigName yaml配置文件名称
     */
    public String getYamlConfigName() {
        return this.YamlConfigName;
    }

    /**
     * Set yaml配置文件名称
     * @param YamlConfigName yaml配置文件名称
     */
    public void setYamlConfigName(String YamlConfigName) {
        this.YamlConfigName = YamlConfigName;
    }

    /**
     * Get yaml配置文件内容 
     * @return YamlContent yaml配置文件内容
     */
    public String getYamlContent() {
        return this.YamlContent;
    }

    /**
     * Set yaml配置文件内容
     * @param YamlContent yaml配置文件内容
     */
    public void setYamlContent(String YamlContent) {
        this.YamlContent = YamlContent;
    }

    /**
     * Get yaml文件子任务数量 
     * @return SubTaskCount yaml文件子任务数量
     */
    public Long getSubTaskCount() {
        return this.SubTaskCount;
    }

    /**
     * Set yaml文件子任务数量
     * @param SubTaskCount yaml文件子任务数量
     */
    public void setSubTaskCount(Long SubTaskCount) {
        this.SubTaskCount = SubTaskCount;
    }

    public RecordingRuleYamlTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordingRuleYamlTaskInfo(RecordingRuleYamlTaskInfo source) {
        if (source.YamlId != null) {
            this.YamlId = new String(source.YamlId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
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
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new Long(source.ProcessStartTime);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.YamlConfigName != null) {
            this.YamlConfigName = new String(source.YamlConfigName);
        }
        if (source.YamlContent != null) {
            this.YamlContent = new String(source.YamlContent);
        }
        if (source.SubTaskCount != null) {
            this.SubTaskCount = new Long(source.SubTaskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "YamlId", this.YamlId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "YamlConfigName", this.YamlConfigName);
        this.setParamSimple(map, prefix + "YamlContent", this.YamlContent);
        this.setParamSimple(map, prefix + "SubTaskCount", this.SubTaskCount);

    }
}

