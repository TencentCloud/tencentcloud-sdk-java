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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerManageTaskInfo extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 变更类型
    */
    @SerializedName("ChangeType")
    @Expose
    private String ChangeType;

    /**
    * 发布类型
    */
    @SerializedName("ReleaseType")
    @Expose
    private String ReleaseType;

    /**
    * 部署类型
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * 上一个版本名
    */
    @SerializedName("PreVersionName")
    @Expose
    private String PreVersionName;

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 流水线Id
    */
    @SerializedName("PipelineId")
    @Expose
    private Long PipelineId;

    /**
    * 流水线任务Id
    */
    @SerializedName("PipelineTaskId")
    @Expose
    private Long PipelineTaskId;

    /**
    * 发布单Id
    */
    @SerializedName("ReleaseId")
    @Expose
    private Long ReleaseId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 步骤信息
    */
    @SerializedName("Steps")
    @Expose
    private TaskStepInfo [] Steps;

    /**
    * 失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 操作标识
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
     * Get 任务Id 
     * @return Id 任务Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务Id
     * @param Id 任务Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
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
     * Get 变更类型 
     * @return ChangeType 变更类型
     */
    public String getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set 变更类型
     * @param ChangeType 变更类型
     */
    public void setChangeType(String ChangeType) {
        this.ChangeType = ChangeType;
    }

    /**
     * Get 发布类型 
     * @return ReleaseType 发布类型
     */
    public String getReleaseType() {
        return this.ReleaseType;
    }

    /**
     * Set 发布类型
     * @param ReleaseType 发布类型
     */
    public void setReleaseType(String ReleaseType) {
        this.ReleaseType = ReleaseType;
    }

    /**
     * Get 部署类型 
     * @return DeployType 部署类型
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set 部署类型
     * @param DeployType 部署类型
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get 上一个版本名 
     * @return PreVersionName 上一个版本名
     */
    public String getPreVersionName() {
        return this.PreVersionName;
    }

    /**
     * Set 上一个版本名
     * @param PreVersionName 上一个版本名
     */
    public void setPreVersionName(String PreVersionName) {
        this.PreVersionName = PreVersionName;
    }

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 流水线Id 
     * @return PipelineId 流水线Id
     */
    public Long getPipelineId() {
        return this.PipelineId;
    }

    /**
     * Set 流水线Id
     * @param PipelineId 流水线Id
     */
    public void setPipelineId(Long PipelineId) {
        this.PipelineId = PipelineId;
    }

    /**
     * Get 流水线任务Id 
     * @return PipelineTaskId 流水线任务Id
     */
    public Long getPipelineTaskId() {
        return this.PipelineTaskId;
    }

    /**
     * Set 流水线任务Id
     * @param PipelineTaskId 流水线任务Id
     */
    public void setPipelineTaskId(Long PipelineTaskId) {
        this.PipelineTaskId = PipelineTaskId;
    }

    /**
     * Get 发布单Id 
     * @return ReleaseId 发布单Id
     */
    public Long getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set 发布单Id
     * @param ReleaseId 发布单Id
     */
    public void setReleaseId(Long ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 步骤信息 
     * @return Steps 步骤信息
     */
    public TaskStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 步骤信息
     * @param Steps 步骤信息
     */
    public void setSteps(TaskStepInfo [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get 失败原因 
     * @return FailReason 失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
     * @param FailReason 失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 操作标识 
     * @return OperatorRemark 操作标识
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作标识
     * @param OperatorRemark 操作标识
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    public ServerManageTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerManageTaskInfo(ServerManageTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ChangeType != null) {
            this.ChangeType = new String(source.ChangeType);
        }
        if (source.ReleaseType != null) {
            this.ReleaseType = new String(source.ReleaseType);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.PreVersionName != null) {
            this.PreVersionName = new String(source.PreVersionName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.PipelineId != null) {
            this.PipelineId = new Long(source.PipelineId);
        }
        if (source.PipelineTaskId != null) {
            this.PipelineTaskId = new Long(source.PipelineTaskId);
        }
        if (source.ReleaseId != null) {
            this.ReleaseId = new Long(source.ReleaseId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Steps != null) {
            this.Steps = new TaskStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new TaskStepInfo(source.Steps[i]);
            }
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);
        this.setParamSimple(map, prefix + "ReleaseType", this.ReleaseType);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "PreVersionName", this.PreVersionName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "PipelineId", this.PipelineId);
        this.setParamSimple(map, prefix + "PipelineTaskId", this.PipelineTaskId);
        this.setParamSimple(map, prefix + "ReleaseId", this.ReleaseId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

