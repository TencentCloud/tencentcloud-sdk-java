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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskVersionDsDTO extends AbstractModel {

    /**
    * 版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * 版本备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 版本更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最新调度计划变更时间 生产态存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * 版本是否正在使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedVersion")
    @Expose
    private Long UsedVersion;

    /**
    * 任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private TaskDsDTO TaskInfo;

    /**
    * 任务参数信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskParaInfo")
    @Expose
    private ParameterTaskDsDto [] TaskParaInfo;

    /**
    * TaskInputParam输入参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInputParam")
    @Expose
    private ParameterTaskInDsDto [] TaskInputParam;

    /**
    * TaskOutputParam输出参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskOutputParam")
    @Expose
    private ParameterTaskOutDsDto [] TaskOutputParam;

    /**
    * 任务上游依赖信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLinkInfo")
    @Expose
    private TaskLinkDsDTO [] TaskLinkInfo;

    /**
    * 审批状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
     * Get 版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get 版本备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionRemark 版本备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set 版本备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionRemark 版本备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get 版本创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 版本创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 版本更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 版本更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 版本更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 版本更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最新调度计划变更时间 生产态存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerCommitTime 最新调度计划变更时间 生产态存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set 最新调度计划变更时间 生产态存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerCommitTime 最新调度计划变更时间 生产态存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get 版本是否正在使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedVersion 版本是否正在使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedVersion() {
        return this.UsedVersion;
    }

    /**
     * Set 版本是否正在使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedVersion 版本是否正在使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedVersion(Long UsedVersion) {
        this.UsedVersion = UsedVersion;
    }

    /**
     * Get 任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTO getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(TaskDsDTO TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get 任务参数信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskParaInfo 任务参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskDsDto [] getTaskParaInfo() {
        return this.TaskParaInfo;
    }

    /**
     * Set 任务参数信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskParaInfo 任务参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskParaInfo(ParameterTaskDsDto [] TaskParaInfo) {
        this.TaskParaInfo = TaskParaInfo;
    }

    /**
     * Get TaskInputParam输入参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInputParam TaskInputParam输入参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskInDsDto [] getTaskInputParam() {
        return this.TaskInputParam;
    }

    /**
     * Set TaskInputParam输入参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInputParam TaskInputParam输入参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInputParam(ParameterTaskInDsDto [] TaskInputParam) {
        this.TaskInputParam = TaskInputParam;
    }

    /**
     * Get TaskOutputParam输出参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskOutputParam TaskOutputParam输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskOutDsDto [] getTaskOutputParam() {
        return this.TaskOutputParam;
    }

    /**
     * Set TaskOutputParam输出参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskOutputParam TaskOutputParam输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskOutputParam(ParameterTaskOutDsDto [] TaskOutputParam) {
        this.TaskOutputParam = TaskOutputParam;
    }

    /**
     * Get 任务上游依赖信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLinkInfo 任务上游依赖信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLinkDsDTO [] getTaskLinkInfo() {
        return this.TaskLinkInfo;
    }

    /**
     * Set 任务上游依赖信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLinkInfo 任务上游依赖信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLinkInfo(TaskLinkDsDTO [] TaskLinkInfo) {
        this.TaskLinkInfo = TaskLinkInfo;
    }

    /**
     * Get 审批状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus 审批状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 审批状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus 审批状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    public TaskVersionDsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskVersionDsDTO(TaskVersionDsDTO source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastSchedulerCommitTime != null) {
            this.LastSchedulerCommitTime = new String(source.LastSchedulerCommitTime);
        }
        if (source.UsedVersion != null) {
            this.UsedVersion = new Long(source.UsedVersion);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new TaskDsDTO(source.TaskInfo);
        }
        if (source.TaskParaInfo != null) {
            this.TaskParaInfo = new ParameterTaskDsDto[source.TaskParaInfo.length];
            for (int i = 0; i < source.TaskParaInfo.length; i++) {
                this.TaskParaInfo[i] = new ParameterTaskDsDto(source.TaskParaInfo[i]);
            }
        }
        if (source.TaskInputParam != null) {
            this.TaskInputParam = new ParameterTaskInDsDto[source.TaskInputParam.length];
            for (int i = 0; i < source.TaskInputParam.length; i++) {
                this.TaskInputParam[i] = new ParameterTaskInDsDto(source.TaskInputParam[i]);
            }
        }
        if (source.TaskOutputParam != null) {
            this.TaskOutputParam = new ParameterTaskOutDsDto[source.TaskOutputParam.length];
            for (int i = 0; i < source.TaskOutputParam.length; i++) {
                this.TaskOutputParam[i] = new ParameterTaskOutDsDto(source.TaskOutputParam[i]);
            }
        }
        if (source.TaskLinkInfo != null) {
            this.TaskLinkInfo = new TaskLinkDsDTO[source.TaskLinkInfo.length];
            for (int i = 0; i < source.TaskLinkInfo.length; i++) {
                this.TaskLinkInfo[i] = new TaskLinkDsDTO(source.TaskLinkInfo[i]);
            }
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new String(source.ApproveStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "UsedVersion", this.UsedVersion);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamArrayObj(map, prefix + "TaskParaInfo.", this.TaskParaInfo);
        this.setParamArrayObj(map, prefix + "TaskInputParam.", this.TaskInputParam);
        this.setParamArrayObj(map, prefix + "TaskOutputParam.", this.TaskOutputParam);
        this.setParamArrayObj(map, prefix + "TaskLinkInfo.", this.TaskLinkInfo);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);

    }
}

