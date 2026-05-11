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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommitIntegrationTaskRequest extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>0.仅提交，1.立即启动，2.停止线上作业，丢弃作业状态数据，重新启动运行，3.暂停线上作业，保留作业状态数据，继续运行，4.保留作业状态数据，继续运行</p>
    */
    @SerializedName("CommitType")
    @Expose
    private Long CommitType;

    /**
    * <p>实时任务 201   离线任务 202  默认实时任务</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>额外参数</p>
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * <p>提交版本描述</p>
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * <p>提交版本号</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * <p>前端操作类型描述</p>
    */
    @SerializedName("EventDesc")
    @Expose
    private String EventDesc;

    /**
    * <p>提交时任务状态</p><p>枚举值：</p><ul><li>3： 运行中</li></ul>
    */
    @SerializedName("CurrentStatus")
    @Expose
    private Long CurrentStatus;

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>0.仅提交，1.立即启动，2.停止线上作业，丢弃作业状态数据，重新启动运行，3.暂停线上作业，保留作业状态数据，继续运行，4.保留作业状态数据，继续运行</p> 
     * @return CommitType <p>0.仅提交，1.立即启动，2.停止线上作业，丢弃作业状态数据，重新启动运行，3.暂停线上作业，保留作业状态数据，继续运行，4.保留作业状态数据，继续运行</p>
     */
    public Long getCommitType() {
        return this.CommitType;
    }

    /**
     * Set <p>0.仅提交，1.立即启动，2.停止线上作业，丢弃作业状态数据，重新启动运行，3.暂停线上作业，保留作业状态数据，继续运行，4.保留作业状态数据，继续运行</p>
     * @param CommitType <p>0.仅提交，1.立即启动，2.停止线上作业，丢弃作业状态数据，重新启动运行，3.暂停线上作业，保留作业状态数据，继续运行，4.保留作业状态数据，继续运行</p>
     */
    public void setCommitType(Long CommitType) {
        this.CommitType = CommitType;
    }

    /**
     * Get <p>实时任务 201   离线任务 202  默认实时任务</p> 
     * @return TaskType <p>实时任务 201   离线任务 202  默认实时任务</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>实时任务 201   离线任务 202  默认实时任务</p>
     * @param TaskType <p>实时任务 201   离线任务 202  默认实时任务</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>额外参数</p> 
     * @return ExtConfig <p>额外参数</p>
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set <p>额外参数</p>
     * @param ExtConfig <p>额外参数</p>
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get <p>提交版本描述</p> 
     * @return VersionDesc <p>提交版本描述</p>
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set <p>提交版本描述</p>
     * @param VersionDesc <p>提交版本描述</p>
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get <p>提交版本号</p> 
     * @return InstanceVersion <p>提交版本号</p>
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>提交版本号</p>
     * @param InstanceVersion <p>提交版本号</p>
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get <p>前端操作类型描述</p> 
     * @return EventDesc <p>前端操作类型描述</p>
     */
    public String getEventDesc() {
        return this.EventDesc;
    }

    /**
     * Set <p>前端操作类型描述</p>
     * @param EventDesc <p>前端操作类型描述</p>
     */
    public void setEventDesc(String EventDesc) {
        this.EventDesc = EventDesc;
    }

    /**
     * Get <p>提交时任务状态</p><p>枚举值：</p><ul><li>3： 运行中</li></ul> 
     * @return CurrentStatus <p>提交时任务状态</p><p>枚举值：</p><ul><li>3： 运行中</li></ul>
     */
    public Long getCurrentStatus() {
        return this.CurrentStatus;
    }

    /**
     * Set <p>提交时任务状态</p><p>枚举值：</p><ul><li>3： 运行中</li></ul>
     * @param CurrentStatus <p>提交时任务状态</p><p>枚举值：</p><ul><li>3： 运行中</li></ul>
     */
    public void setCurrentStatus(Long CurrentStatus) {
        this.CurrentStatus = CurrentStatus;
    }

    public CommitIntegrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitIntegrationTaskRequest(CommitIntegrationTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CommitType != null) {
            this.CommitType = new Long(source.CommitType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.EventDesc != null) {
            this.EventDesc = new String(source.EventDesc);
        }
        if (source.CurrentStatus != null) {
            this.CurrentStatus = new Long(source.CurrentStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CommitType", this.CommitType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "EventDesc", this.EventDesc);
        this.setParamSimple(map, prefix + "CurrentStatus", this.CurrentStatus);

    }
}

