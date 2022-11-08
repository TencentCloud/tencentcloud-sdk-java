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

public class OfflineInstance extends AbstractModel{

    /**
    * 创建账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 操作账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * 主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 项目Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 下发时间
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * 资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InlongTaskId")
    @Expose
    private String InlongTaskId;

    /**
    * 资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 实例类型
    */
    @SerializedName("TaskRunType")
    @Expose
    private Long TaskRunType;

    /**
    * 实例状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 唯一key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
     * Get 创建账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 创建账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 创建账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 操作账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUin 操作账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 操作账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUin 操作账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get 主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 项目Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据时间 
     * @return CurRunDate 数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
     * @param CurRunDate 数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 下发时间 
     * @return IssueId 下发时间
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set 下发时间
     * @param IssueId 下发时间
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get 资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InlongTaskId 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInlongTaskId() {
        return this.InlongTaskId;
    }

    /**
     * Set 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InlongTaskId 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInlongTaskId(String InlongTaskId) {
        this.InlongTaskId = InlongTaskId;
    }

    /**
     * Get 资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 实例类型 
     * @return TaskRunType 实例类型
     */
    public Long getTaskRunType() {
        return this.TaskRunType;
    }

    /**
     * Set 实例类型
     * @param TaskRunType 实例类型
     */
    public void setTaskRunType(Long TaskRunType) {
        this.TaskRunType = TaskRunType;
    }

    /**
     * Get 实例状态 
     * @return State 实例状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态
     * @param State 实例状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后更新时间 
     * @return UpdateTime 最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 唯一key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey 唯一key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 唯一key
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey 唯一key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    public OfflineInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineInstance(OfflineInstance source) {
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.InlongTaskId != null) {
            this.InlongTaskId = new String(source.InlongTaskId);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.TaskRunType != null) {
            this.TaskRunType = new Long(source.TaskRunType);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "InlongTaskId", this.InlongTaskId);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "TaskRunType", this.TaskRunType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);

    }
}

