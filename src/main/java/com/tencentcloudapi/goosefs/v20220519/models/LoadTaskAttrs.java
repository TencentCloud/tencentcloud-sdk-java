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

public class LoadTaskAttrs extends AbstractModel {

    /**
    * <p>预热任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务描述，支持中文</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
    */
    @SerializedName("MetadataLoadAttrs")
    @Expose
    private MetadataLoadAttrs MetadataLoadAttrs;

    /**
    * <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
    */
    @SerializedName("DistributedLoadAttrs")
    @Expose
    private DistributedLoadAttrs DistributedLoadAttrs;

    /**
    * <p>仅预热数据参数。入参数TaskType为LoadData时，该参数不应为空。</p>
    */
    @SerializedName("LoadDataAttrs")
    @Expose
    private LoadDataAttrs LoadDataAttrs;

    /**
    * <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

    /**
    * <p>枚举，Completed，Running，Waiting，Cancelled</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息</p>
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * <p>预热任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>预热任务变更时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>任务提交账号，子账号或服务角色 ID</p>
    */
    @SerializedName("Requester")
    @Expose
    private String Requester;

    /**
     * Get <p>预热任务 ID</p> 
     * @return TaskId <p>预热任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>预热任务 ID</p>
     * @param TaskId <p>预热任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad</p> 
     * @return TaskType <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad</p>
     * @param TaskType <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务描述，支持中文</p> 
     * @return Description <p>任务描述，支持中文</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述，支持中文</p>
     * @param Description <p>任务描述，支持中文</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p> 
     * @return Priority <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
     * @param Priority <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p> 
     * @return MetadataLoadAttrs <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
     */
    public MetadataLoadAttrs getMetadataLoadAttrs() {
        return this.MetadataLoadAttrs;
    }

    /**
     * Set <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
     * @param MetadataLoadAttrs <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
     */
    public void setMetadataLoadAttrs(MetadataLoadAttrs MetadataLoadAttrs) {
        this.MetadataLoadAttrs = MetadataLoadAttrs;
    }

    /**
     * Get <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p> 
     * @return DistributedLoadAttrs <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
     */
    public DistributedLoadAttrs getDistributedLoadAttrs() {
        return this.DistributedLoadAttrs;
    }

    /**
     * Set <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
     * @param DistributedLoadAttrs <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
     */
    public void setDistributedLoadAttrs(DistributedLoadAttrs DistributedLoadAttrs) {
        this.DistributedLoadAttrs = DistributedLoadAttrs;
    }

    /**
     * Get <p>仅预热数据参数。入参数TaskType为LoadData时，该参数不应为空。</p> 
     * @return LoadDataAttrs <p>仅预热数据参数。入参数TaskType为LoadData时，该参数不应为空。</p>
     */
    public LoadDataAttrs getLoadDataAttrs() {
        return this.LoadDataAttrs;
    }

    /**
     * Set <p>仅预热数据参数。入参数TaskType为LoadData时，该参数不应为空。</p>
     * @param LoadDataAttrs <p>仅预热数据参数。入参数TaskType为LoadData时，该参数不应为空。</p>
     */
    public void setLoadDataAttrs(LoadDataAttrs LoadDataAttrs) {
        this.LoadDataAttrs = LoadDataAttrs;
    }

    /**
     * Get <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p> 
     * @return ReportPath <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
     * @param ReportPath <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
    }

    /**
     * Get <p>枚举，Completed，Running，Waiting，Cancelled</p> 
     * @return State <p>枚举，Completed，Running，Waiting，Cancelled</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>枚举，Completed，Running，Waiting，Cancelled</p>
     * @param State <p>枚举，Completed，Running，Waiting，Cancelled</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息</p> 
     * @return TaskMessage <p>任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息</p>
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set <p>任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息</p>
     * @param TaskMessage <p>任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息</p>
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    /**
     * Get <p>预热任务创建时间</p> 
     * @return CreateTime <p>预热任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>预热任务创建时间</p>
     * @param CreateTime <p>预热任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>预热任务变更时间</p> 
     * @return ModifyTime <p>预热任务变更时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>预热任务变更时间</p>
     * @param ModifyTime <p>预热任务变更时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>任务提交账号，子账号或服务角色 ID</p> 
     * @return Requester <p>任务提交账号，子账号或服务角色 ID</p>
     */
    public String getRequester() {
        return this.Requester;
    }

    /**
     * Set <p>任务提交账号，子账号或服务角色 ID</p>
     * @param Requester <p>任务提交账号，子账号或服务角色 ID</p>
     */
    public void setRequester(String Requester) {
        this.Requester = Requester;
    }

    public LoadTaskAttrs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadTaskAttrs(LoadTaskAttrs source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.MetadataLoadAttrs != null) {
            this.MetadataLoadAttrs = new MetadataLoadAttrs(source.MetadataLoadAttrs);
        }
        if (source.DistributedLoadAttrs != null) {
            this.DistributedLoadAttrs = new DistributedLoadAttrs(source.DistributedLoadAttrs);
        }
        if (source.LoadDataAttrs != null) {
            this.LoadDataAttrs = new LoadDataAttrs(source.LoadDataAttrs);
        }
        if (source.ReportPath != null) {
            this.ReportPath = new String(source.ReportPath);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.TaskMessage != null) {
            this.TaskMessage = new String(source.TaskMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Requester != null) {
            this.Requester = new String(source.Requester);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "MetadataLoadAttrs.", this.MetadataLoadAttrs);
        this.setParamObj(map, prefix + "DistributedLoadAttrs.", this.DistributedLoadAttrs);
        this.setParamObj(map, prefix + "LoadDataAttrs.", this.LoadDataAttrs);
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Requester", this.Requester);

    }
}

