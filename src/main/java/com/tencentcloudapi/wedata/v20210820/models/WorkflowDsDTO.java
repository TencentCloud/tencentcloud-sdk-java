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

public class WorkflowDsDTO extends AbstractModel {

    /**
    * <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>SparkSQL参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkParams")
    @Expose
    private String SparkParams;

    /**
    * <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDsDTO [] Tasks;

    /**
    * <p>任务链接列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Links")
    @Expose
    private TaskLinkDsDTO [] Links;

    /**
    * <p>参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ParameterTaskDsDto [] Params;

    /**
    * <p>工作流类型, 取值示例</p><ul><li>cycle 周期工作流</li><li>manual 手动工作流</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * <p>最近更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>最近更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * <p>BundleId CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>BundleId信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * <p>运行账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

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
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

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
     * Get <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>SparkSQL参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkParams <p>SparkSQL参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkParams() {
        return this.SparkParams;
    }

    /**
     * Set <p>SparkSQL参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkParams <p>SparkSQL参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkParams(String SparkParams) {
        this.SparkParams = SparkParams;
    }

    /**
     * Get <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskDsDTO [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>任务链接列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Links <p>任务链接列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLinkDsDTO [] getLinks() {
        return this.Links;
    }

    /**
     * Set <p>任务链接列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Links <p>任务链接列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinks(TaskLinkDsDTO [] Links) {
        this.Links = Links;
    }

    /**
     * Get <p>参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params <p>参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskDsDto [] getParams() {
        return this.Params;
    }

    /**
     * Set <p>参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params <p>参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ParameterTaskDsDto [] Params) {
        this.Params = Params;
    }

    /**
     * Get <p>工作流类型, 取值示例</p><ul><li>cycle 周期工作流</li><li>manual 手动工作流</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType <p>工作流类型, 取值示例</p><ul><li>cycle 周期工作流</li><li>manual 手动工作流</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set <p>工作流类型, 取值示例</p><ul><li>cycle 周期工作流</li><li>manual 手动工作流</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType <p>工作流类型, 取值示例</p><ul><li>cycle 周期工作流</li><li>manual 手动工作流</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get <p>最近更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser <p>最近更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>最近更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser <p>最近更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>最近更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId <p>最近更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set <p>最近更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId <p>最近更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get <p>BundleId CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>BundleId CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>BundleId CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>BundleId信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo <p>BundleId信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>BundleId信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo <p>BundleId信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserUin <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserUin <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get <p>运行账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserName <p>运行账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set <p>运行账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserName <p>运行账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
    }

    public WorkflowDsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowDsDTO(WorkflowDsDTO source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.SparkParams != null) {
            this.SparkParams = new String(source.SparkParams);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskDsDTO[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskDsDTO(source.Tasks[i]);
            }
        }
        if (source.Links != null) {
            this.Links = new TaskLinkDsDTO[source.Links.length];
            for (int i = 0; i < source.Links.length; i++) {
                this.Links[i] = new TaskLinkDsDTO(source.Links[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new ParameterTaskDsDto[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ParameterTaskDsDto(source.Params[i]);
            }
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.ExecuteUserName != null) {
            this.ExecuteUserName = new String(source.ExecuteUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "SparkParams", this.SparkParams);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "Links.", this.Links);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "ExecuteUserName", this.ExecuteUserName);

    }
}

