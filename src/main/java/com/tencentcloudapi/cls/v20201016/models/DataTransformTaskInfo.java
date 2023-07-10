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

public class DataTransformTaskInfo extends AbstractModel{

    /**
    * 数据加工任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据加工任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务启用状态，默认为1，正常开启,  2关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 加工任务类型，1： DSL， 2：SQL
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 源日志主题
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * 当前加工任务状态（1准备中/2运行中/3停止中/4已停止）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 加工任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最后启用时间，如果需要重建集群，修改该时间
    */
    @SerializedName("LastEnableTime")
    @Expose
    private String LastEnableTime;

    /**
    * 日志主题名称
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * 日志集id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 加工任务目的topic_id以及别名
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * 加工逻辑函数
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
     * Get 数据加工任务名称 
     * @return Name 数据加工任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据加工任务名称
     * @param Name 数据加工任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据加工任务id 
     * @return TaskId 数据加工任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 数据加工任务id
     * @param TaskId 数据加工任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务启用状态，默认为1，正常开启,  2关闭 
     * @return EnableFlag 任务启用状态，默认为1，正常开启,  2关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启用状态，默认为1，正常开启,  2关闭
     * @param EnableFlag 任务启用状态，默认为1，正常开启,  2关闭
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get 加工任务类型，1： DSL， 2：SQL 
     * @return Type 加工任务类型，1： DSL， 2：SQL
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 加工任务类型，1： DSL， 2：SQL
     * @param Type 加工任务类型，1： DSL， 2：SQL
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 源日志主题 
     * @return SrcTopicId 源日志主题
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set 源日志主题
     * @param SrcTopicId 源日志主题
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get 当前加工任务状态（1准备中/2运行中/3停止中/4已停止） 
     * @return Status 当前加工任务状态（1准备中/2运行中/3停止中/4已停止）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前加工任务状态（1准备中/2运行中/3停止中/4已停止）
     * @param Status 当前加工任务状态（1准备中/2运行中/3停止中/4已停止）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 加工任务创建时间 
     * @return CreateTime 加工任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 加工任务创建时间
     * @param CreateTime 加工任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间 
     * @return UpdateTime 最近修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近修改时间
     * @param UpdateTime 最近修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最后启用时间，如果需要重建集群，修改该时间 
     * @return LastEnableTime 最后启用时间，如果需要重建集群，修改该时间
     */
    public String getLastEnableTime() {
        return this.LastEnableTime;
    }

    /**
     * Set 最后启用时间，如果需要重建集群，修改该时间
     * @param LastEnableTime 最后启用时间，如果需要重建集群，修改该时间
     */
    public void setLastEnableTime(String LastEnableTime) {
        this.LastEnableTime = LastEnableTime;
    }

    /**
     * Get 日志主题名称 
     * @return SrcTopicName 日志主题名称
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set 日志主题名称
     * @param SrcTopicName 日志主题名称
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get 日志集id 
     * @return LogsetId 日志集id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
     * @param LogsetId 日志集id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 加工任务目的topic_id以及别名 
     * @return DstResources 加工任务目的topic_id以及别名
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set 加工任务目的topic_id以及别名
     * @param DstResources 加工任务目的topic_id以及别名
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get 加工逻辑函数 
     * @return EtlContent 加工逻辑函数
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set 加工逻辑函数
     * @param EtlContent 加工逻辑函数
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    public DataTransformTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformTaskInfo(DataTransformTaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastEnableTime != null) {
            this.LastEnableTime = new String(source.LastEnableTime);
        }
        if (source.SrcTopicName != null) {
            this.SrcTopicName = new String(source.SrcTopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastEnableTime", this.LastEnableTime);
        this.setParamSimple(map, prefix + "SrcTopicName", this.SrcTopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);

    }
}

