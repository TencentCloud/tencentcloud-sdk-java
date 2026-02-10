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
    * 预热任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 预热任务类型，枚举值，MetadataLoad｜DistributedLoad
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务描述，支持中文
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
    */
    @SerializedName("MetadataLoadAttrs")
    @Expose
    private MetadataLoadAttrs MetadataLoadAttrs;

    /**
    * 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
    */
    @SerializedName("DistributedLoadAttrs")
    @Expose
    private DistributedLoadAttrs DistributedLoadAttrs;

    /**
    * 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

    /**
    * 枚举，Completed，Running，Waiting，Cancelled
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息 
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * 预热任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 预热任务变更时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 任务提交账号，子账号或服务角色 ID
    */
    @SerializedName("Requester")
    @Expose
    private String Requester;

    /**
     * Get 预热任务 ID 
     * @return TaskId 预热任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 预热任务 ID
     * @param TaskId 预热任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 预热任务类型，枚举值，MetadataLoad｜DistributedLoad 
     * @return TaskType 预热任务类型，枚举值，MetadataLoad｜DistributedLoad
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 预热任务类型，枚举值，MetadataLoad｜DistributedLoad
     * @param TaskType 预热任务类型，枚举值，MetadataLoad｜DistributedLoad
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务描述，支持中文 
     * @return Description 任务描述，支持中文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述，支持中文
     * @param Description 任务描述，支持中文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1 
     * @return Priority 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     * @param Priority 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。 
     * @return MetadataLoadAttrs 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
     */
    public MetadataLoadAttrs getMetadataLoadAttrs() {
        return this.MetadataLoadAttrs;
    }

    /**
     * Set 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
     * @param MetadataLoadAttrs 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
     */
    public void setMetadataLoadAttrs(MetadataLoadAttrs MetadataLoadAttrs) {
        this.MetadataLoadAttrs = MetadataLoadAttrs;
    }

    /**
     * Get 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。 
     * @return DistributedLoadAttrs 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
     */
    public DistributedLoadAttrs getDistributedLoadAttrs() {
        return this.DistributedLoadAttrs;
    }

    /**
     * Set 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
     * @param DistributedLoadAttrs 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
     */
    public void setDistributedLoadAttrs(DistributedLoadAttrs DistributedLoadAttrs) {
        this.DistributedLoadAttrs = DistributedLoadAttrs;
    }

    /**
     * Get 将任务执行报告写入 COS 的路径，如果不需要报告则入参空 
     * @return ReportPath 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
     * @param ReportPath 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
    }

    /**
     * Get 枚举，Completed，Running，Waiting，Cancelled 
     * @return State 枚举，Completed，Running，Waiting，Cancelled
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 枚举，Completed，Running，Waiting，Cancelled
     * @param State 枚举，Completed，Running，Waiting，Cancelled
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息  
     * @return TaskMessage 任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息 
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set 任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息 
     * @param TaskMessage 任务执行信息，打印预热文件成功个数，失败个数，预热耗时信息 
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    /**
     * Get 预热任务创建时间 
     * @return CreateTime 预热任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 预热任务创建时间
     * @param CreateTime 预热任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 预热任务变更时间 
     * @return ModifyTime 预热任务变更时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 预热任务变更时间
     * @param ModifyTime 预热任务变更时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 任务提交账号，子账号或服务角色 ID 
     * @return Requester 任务提交账号，子账号或服务角色 ID
     */
    public String getRequester() {
        return this.Requester;
    }

    /**
     * Set 任务提交账号，子账号或服务角色 ID
     * @param Requester 任务提交账号，子账号或服务角色 ID
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
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Requester", this.Requester);

    }
}

