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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceDetail extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("TaskRunId")
    @Expose
    private String TaskRunId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例数据运行时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 实例实际运行时间
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * InLong任务Id
    */
    @SerializedName("InlongTaskId")
    @Expose
    private String InlongTaskId;

    /**
    * 执行资源组id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 任务类型(1 调试运行,2 调度执行)
    */
    @SerializedName("TaskRunType")
    @Expose
    private Long TaskRunType;

    /**
    * 任务状态(1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行)
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 实例开始运行时间，格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例结束运行时间，格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Broker IP
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 运行实例的EKS Pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 下一个调度周期的数据运行时间
    */
    @SerializedName("NextRunDate")
    @Expose
    private String NextRunDate;

    /**
    * 创建者的账号Id
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 操作者的账号Id
    */
    @SerializedName("OperatorUin")
    @Expose
    private Long OperatorUin;

    /**
    * 拥有者的账号Id
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * App Id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * WeData项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
     * Get 实例id 
     * @return TaskRunId 实例id
     */
    public String getTaskRunId() {
        return this.TaskRunId;
    }

    /**
     * Set 实例id
     * @param TaskRunId 实例id
     */
    public void setTaskRunId(String TaskRunId) {
        this.TaskRunId = TaskRunId;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例数据运行时间 
     * @return CurRunDate 实例数据运行时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 实例数据运行时间
     * @param CurRunDate 实例数据运行时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 实例实际运行时间 
     * @return IssueDate 实例实际运行时间
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 实例实际运行时间
     * @param IssueDate 实例实际运行时间
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get InLong任务Id 
     * @return InlongTaskId InLong任务Id
     */
    public String getInlongTaskId() {
        return this.InlongTaskId;
    }

    /**
     * Set InLong任务Id
     * @param InlongTaskId InLong任务Id
     */
    public void setInlongTaskId(String InlongTaskId) {
        this.InlongTaskId = InlongTaskId;
    }

    /**
     * Get 执行资源组id 
     * @return ExecutorGroupId 执行资源组id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组id
     * @param ExecutorGroupId 执行资源组id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 任务类型(1 调试运行,2 调度执行) 
     * @return TaskRunType 任务类型(1 调试运行,2 调度执行)
     */
    public Long getTaskRunType() {
        return this.TaskRunType;
    }

    /**
     * Set 任务类型(1 调试运行,2 调度执行)
     * @param TaskRunType 任务类型(1 调试运行,2 调度执行)
     */
    public void setTaskRunType(Long TaskRunType) {
        this.TaskRunType = TaskRunType;
    }

    /**
     * Get 任务状态(1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行) 
     * @return State 任务状态(1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行)
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态(1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行)
     * @param State 任务状态(1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行)
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 实例开始运行时间，格式：yyyy-MM-dd HH:mm:ss 
     * @return StartTime 实例开始运行时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 实例开始运行时间，格式：yyyy-MM-dd HH:mm:ss
     * @param StartTime 实例开始运行时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例结束运行时间，格式：yyyy-MM-dd HH:mm:ss 
     * @return EndTime 实例结束运行时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 实例结束运行时间，格式：yyyy-MM-dd HH:mm:ss
     * @param EndTime 实例结束运行时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Broker IP 
     * @return BrokerIp Broker IP
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Broker IP
     * @param BrokerIp Broker IP
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 运行实例的EKS Pod名称 
     * @return PodName 运行实例的EKS Pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 运行实例的EKS Pod名称
     * @param PodName 运行实例的EKS Pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 下一个调度周期的数据运行时间 
     * @return NextRunDate 下一个调度周期的数据运行时间
     */
    public String getNextRunDate() {
        return this.NextRunDate;
    }

    /**
     * Set 下一个调度周期的数据运行时间
     * @param NextRunDate 下一个调度周期的数据运行时间
     */
    public void setNextRunDate(String NextRunDate) {
        this.NextRunDate = NextRunDate;
    }

    /**
     * Get 创建者的账号Id 
     * @return CreateUin 创建者的账号Id
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者的账号Id
     * @param CreateUin 创建者的账号Id
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 操作者的账号Id 
     * @return OperatorUin 操作者的账号Id
     */
    public Long getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 操作者的账号Id
     * @param OperatorUin 操作者的账号Id
     */
    public void setOperatorUin(Long OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get 拥有者的账号Id 
     * @return OwnerUin 拥有者的账号Id
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 拥有者的账号Id
     * @param OwnerUin 拥有者的账号Id
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get App Id 
     * @return AppId App Id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App Id
     * @param AppId App Id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get WeData项目id 
     * @return ProjectId WeData项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set WeData项目id
     * @param ProjectId WeData项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public TaskInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceDetail(TaskInstanceDetail source) {
        if (source.TaskRunId != null) {
            this.TaskRunId = new String(source.TaskRunId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.InlongTaskId != null) {
            this.InlongTaskId = new String(source.InlongTaskId);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.TaskRunType != null) {
            this.TaskRunType = new Long(source.TaskRunType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.NextRunDate != null) {
            this.NextRunDate = new String(source.NextRunDate);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new Long(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskRunId", this.TaskRunId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "InlongTaskId", this.InlongTaskId);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "TaskRunType", this.TaskRunType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "NextRunDate", this.NextRunDate);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);

    }
}

