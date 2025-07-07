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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoutineMaintenanceTaskRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自动化运维类别
    */
    @SerializedName("MaintenanceType")
    @Expose
    private String MaintenanceType;

    /**
    * INSTANCE_STORAGE_CAPACITY(磁盘自动扩容)/MESSAGE_RETENTION_PERIOD(磁盘动态消息保留策略)
    */
    @SerializedName("MaintenanceSubtype")
    @Expose
    private String MaintenanceSubtype;

    /**
    * 主题名
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 任务触发阈值
    */
    @SerializedName("ConfigureThreshold")
    @Expose
    private Long ConfigureThreshold;

    /**
    * 任务调整步长
    */
    @SerializedName("ConfigureStepSize")
    @Expose
    private Long ConfigureStepSize;

    /**
    * 任务调整上限
    */
    @SerializedName("ConfigureLimit")
    @Expose
    private Long ConfigureLimit;

    /**
    * 任务预期触发时间，存储从当日 0AM 开始偏移的秒数
    */
    @SerializedName("PlannedTime")
    @Expose
    private Long PlannedTime;

    /**
    * 任务额外信息
    */
    @SerializedName("ExtraConfig")
    @Expose
    private String ExtraConfig;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 执行week day
    */
    @SerializedName("Week")
    @Expose
    private String Week;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 自动化运维类别 
     * @return MaintenanceType 自动化运维类别
     */
    public String getMaintenanceType() {
        return this.MaintenanceType;
    }

    /**
     * Set 自动化运维类别
     * @param MaintenanceType 自动化运维类别
     */
    public void setMaintenanceType(String MaintenanceType) {
        this.MaintenanceType = MaintenanceType;
    }

    /**
     * Get INSTANCE_STORAGE_CAPACITY(磁盘自动扩容)/MESSAGE_RETENTION_PERIOD(磁盘动态消息保留策略) 
     * @return MaintenanceSubtype INSTANCE_STORAGE_CAPACITY(磁盘自动扩容)/MESSAGE_RETENTION_PERIOD(磁盘动态消息保留策略)
     */
    public String getMaintenanceSubtype() {
        return this.MaintenanceSubtype;
    }

    /**
     * Set INSTANCE_STORAGE_CAPACITY(磁盘自动扩容)/MESSAGE_RETENTION_PERIOD(磁盘动态消息保留策略)
     * @param MaintenanceSubtype INSTANCE_STORAGE_CAPACITY(磁盘自动扩容)/MESSAGE_RETENTION_PERIOD(磁盘动态消息保留策略)
     */
    public void setMaintenanceSubtype(String MaintenanceSubtype) {
        this.MaintenanceSubtype = MaintenanceSubtype;
    }

    /**
     * Get 主题名 
     * @return TopicName 主题名
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名
     * @param TopicName 主题名
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 任务触发阈值 
     * @return ConfigureThreshold 任务触发阈值
     */
    public Long getConfigureThreshold() {
        return this.ConfigureThreshold;
    }

    /**
     * Set 任务触发阈值
     * @param ConfigureThreshold 任务触发阈值
     */
    public void setConfigureThreshold(Long ConfigureThreshold) {
        this.ConfigureThreshold = ConfigureThreshold;
    }

    /**
     * Get 任务调整步长 
     * @return ConfigureStepSize 任务调整步长
     */
    public Long getConfigureStepSize() {
        return this.ConfigureStepSize;
    }

    /**
     * Set 任务调整步长
     * @param ConfigureStepSize 任务调整步长
     */
    public void setConfigureStepSize(Long ConfigureStepSize) {
        this.ConfigureStepSize = ConfigureStepSize;
    }

    /**
     * Get 任务调整上限 
     * @return ConfigureLimit 任务调整上限
     */
    public Long getConfigureLimit() {
        return this.ConfigureLimit;
    }

    /**
     * Set 任务调整上限
     * @param ConfigureLimit 任务调整上限
     */
    public void setConfigureLimit(Long ConfigureLimit) {
        this.ConfigureLimit = ConfigureLimit;
    }

    /**
     * Get 任务预期触发时间，存储从当日 0AM 开始偏移的秒数 
     * @return PlannedTime 任务预期触发时间，存储从当日 0AM 开始偏移的秒数
     */
    public Long getPlannedTime() {
        return this.PlannedTime;
    }

    /**
     * Set 任务预期触发时间，存储从当日 0AM 开始偏移的秒数
     * @param PlannedTime 任务预期触发时间，存储从当日 0AM 开始偏移的秒数
     */
    public void setPlannedTime(Long PlannedTime) {
        this.PlannedTime = PlannedTime;
    }

    /**
     * Get 任务额外信息 
     * @return ExtraConfig 任务额外信息
     */
    public String getExtraConfig() {
        return this.ExtraConfig;
    }

    /**
     * Set 任务额外信息
     * @param ExtraConfig 任务额外信息
     */
    public void setExtraConfig(String ExtraConfig) {
        this.ExtraConfig = ExtraConfig;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 执行week day 
     * @return Week 执行week day
     */
    public String getWeek() {
        return this.Week;
    }

    /**
     * Set 执行week day
     * @param Week 执行week day
     */
    public void setWeek(String Week) {
        this.Week = Week;
    }

    public ModifyRoutineMaintenanceTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoutineMaintenanceTaskRequest(ModifyRoutineMaintenanceTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaintenanceType != null) {
            this.MaintenanceType = new String(source.MaintenanceType);
        }
        if (source.MaintenanceSubtype != null) {
            this.MaintenanceSubtype = new String(source.MaintenanceSubtype);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ConfigureThreshold != null) {
            this.ConfigureThreshold = new Long(source.ConfigureThreshold);
        }
        if (source.ConfigureStepSize != null) {
            this.ConfigureStepSize = new Long(source.ConfigureStepSize);
        }
        if (source.ConfigureLimit != null) {
            this.ConfigureLimit = new Long(source.ConfigureLimit);
        }
        if (source.PlannedTime != null) {
            this.PlannedTime = new Long(source.PlannedTime);
        }
        if (source.ExtraConfig != null) {
            this.ExtraConfig = new String(source.ExtraConfig);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Week != null) {
            this.Week = new String(source.Week);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaintenanceType", this.MaintenanceType);
        this.setParamSimple(map, prefix + "MaintenanceSubtype", this.MaintenanceSubtype);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ConfigureThreshold", this.ConfigureThreshold);
        this.setParamSimple(map, prefix + "ConfigureStepSize", this.ConfigureStepSize);
        this.setParamSimple(map, prefix + "ConfigureLimit", this.ConfigureLimit);
        this.setParamSimple(map, prefix + "PlannedTime", this.PlannedTime);
        this.setParamSimple(map, prefix + "ExtraConfig", this.ExtraConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Week", this.Week);

    }
}

