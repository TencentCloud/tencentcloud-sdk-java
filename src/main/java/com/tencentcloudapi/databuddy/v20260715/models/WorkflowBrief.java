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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowBrief extends AbstractModel {

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>工作流负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * <p>工作流负责人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserUin")
    @Expose
    private String OwnerUserUin;

    /**
    * <p>工作流负责人展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerDisplayName")
    @Expose
    private String OwnerDisplayName;

    /**
    * <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelList")
    @Expose
    private LabelBrief [] LabelList;

    /**
    * <p>工作流调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTriggerConfiguration [] Trigger;

    /**
    * <p>工作流运行人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * <p>工作流运行人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserName")
    @Expose
    private String RunUserName;

    /**
    * <p>工作流任务节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskList")
    @Expose
    private WorkflowTaskNodeBrief [] TaskList;

    /**
    * <p>工作流运行情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunList")
    @Expose
    private WorkflowRunBrief [] WorkflowRunList;

    /**
    * <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * <p>工作流权限信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * <p>工作流绑定的 Bundle 唯一标识，未绑定时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>Bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>Git配置ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GitConfigId")
    @Expose
    private String GitConfigId;

    /**
    * <p>Git分支信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GitBranch")
    @Expose
    private String GitBranch;

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>工作流负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserName <p>工作流负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set <p>工作流负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserName <p>工作流负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get <p>工作流负责人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserUin <p>工作流负责人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserUin() {
        return this.OwnerUserUin;
    }

    /**
     * Set <p>工作流负责人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserUin <p>工作流负责人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserUin(String OwnerUserUin) {
        this.OwnerUserUin = OwnerUserUin;
    }

    /**
     * Get <p>工作流负责人展示名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerDisplayName <p>工作流负责人展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerDisplayName() {
        return this.OwnerDisplayName;
    }

    /**
     * Set <p>工作流负责人展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerDisplayName <p>工作流负责人展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerDisplayName(String OwnerDisplayName) {
        this.OwnerDisplayName = OwnerDisplayName;
    }

    /**
     * Get <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelList <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LabelBrief [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelList <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelList(LabelBrief [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get <p>工作流调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trigger <p>工作流调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTriggerConfiguration [] getTrigger() {
        return this.Trigger;
    }

    /**
     * Set <p>工作流调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trigger <p>工作流调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrigger(WorkflowTriggerConfiguration [] Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get <p>工作流运行人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserUin <p>工作流运行人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set <p>工作流运行人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserUin <p>工作流运行人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get <p>工作流运行人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserName <p>工作流运行人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserName() {
        return this.RunUserName;
    }

    /**
     * Set <p>工作流运行人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserName <p>工作流运行人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserName(String RunUserName) {
        this.RunUserName = RunUserName;
    }

    /**
     * Get <p>工作流任务节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskList <p>工作流任务节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTaskNodeBrief [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set <p>工作流任务节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskList <p>工作流任务节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskList(WorkflowTaskNodeBrief [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get <p>工作流运行情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunList <p>工作流运行情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowRunBrief [] getWorkflowRunList() {
        return this.WorkflowRunList;
    }

    /**
     * Set <p>工作流运行情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunList <p>工作流运行情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunList(WorkflowRunBrief [] WorkflowRunList) {
        this.WorkflowRunList = WorkflowRunList;
    }

    /**
     * Get <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupInfoList <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceGroupInfo [] getResourceGroupInfoList() {
        return this.ResourceGroupInfoList;
    }

    /**
     * Set <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupInfoList <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupInfoList(ResourceGroupInfo [] ResourceGroupInfoList) {
        this.ResourceGroupInfoList = ResourceGroupInfoList;
    }

    /**
     * Get <p>工作流权限信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission <p>工作流权限信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>工作流权限信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission <p>工作流权限信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>工作流绑定的 Bundle 唯一标识，未绑定时为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>工作流绑定的 Bundle 唯一标识，未绑定时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>工作流绑定的 Bundle 唯一标识，未绑定时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>工作流绑定的 Bundle 唯一标识，未绑定时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>Bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo <p>Bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>Bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo <p>Bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>Git配置ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GitConfigId <p>Git配置ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGitConfigId() {
        return this.GitConfigId;
    }

    /**
     * Set <p>Git配置ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GitConfigId <p>Git配置ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGitConfigId(String GitConfigId) {
        this.GitConfigId = GitConfigId;
    }

    /**
     * Get <p>Git分支信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GitBranch <p>Git分支信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGitBranch() {
        return this.GitBranch;
    }

    /**
     * Set <p>Git分支信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GitBranch <p>Git分支信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGitBranch(String GitBranch) {
        this.GitBranch = GitBranch;
    }

    public WorkflowBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowBrief(WorkflowBrief source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.OwnerUserUin != null) {
            this.OwnerUserUin = new String(source.OwnerUserUin);
        }
        if (source.OwnerDisplayName != null) {
            this.OwnerDisplayName = new String(source.OwnerDisplayName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LabelList != null) {
            this.LabelList = new LabelBrief[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new LabelBrief(source.LabelList[i]);
            }
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTriggerConfiguration[source.Trigger.length];
            for (int i = 0; i < source.Trigger.length; i++) {
                this.Trigger[i] = new WorkflowTriggerConfiguration(source.Trigger[i]);
            }
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.RunUserName != null) {
            this.RunUserName = new String(source.RunUserName);
        }
        if (source.TaskList != null) {
            this.TaskList = new WorkflowTaskNodeBrief[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new WorkflowTaskNodeBrief(source.TaskList[i]);
            }
        }
        if (source.WorkflowRunList != null) {
            this.WorkflowRunList = new WorkflowRunBrief[source.WorkflowRunList.length];
            for (int i = 0; i < source.WorkflowRunList.length; i++) {
                this.WorkflowRunList[i] = new WorkflowRunBrief(source.WorkflowRunList[i]);
            }
        }
        if (source.ResourceGroupInfoList != null) {
            this.ResourceGroupInfoList = new ResourceGroupInfo[source.ResourceGroupInfoList.length];
            for (int i = 0; i < source.ResourceGroupInfoList.length; i++) {
                this.ResourceGroupInfoList[i] = new ResourceGroupInfo(source.ResourceGroupInfoList[i]);
            }
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.GitConfigId != null) {
            this.GitConfigId = new String(source.GitConfigId);
        }
        if (source.GitBranch != null) {
            this.GitBranch = new String(source.GitBranch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "OwnerUserUin", this.OwnerUserUin);
        this.setParamSimple(map, prefix + "OwnerDisplayName", this.OwnerDisplayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamArrayObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "RunUserName", this.RunUserName);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamArrayObj(map, prefix + "WorkflowRunList.", this.WorkflowRunList);
        this.setParamArrayObj(map, prefix + "ResourceGroupInfoList.", this.ResourceGroupInfoList);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "GitConfigId", this.GitConfigId);
        this.setParamSimple(map, prefix + "GitBranch", this.GitBranch);

    }
}

