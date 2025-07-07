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
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * SparkSQL参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkParams")
    @Expose
    private String SparkParams;

    /**
    * 任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDsDTO [] Tasks;

    /**
    * 任务链接列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Links")
    @Expose
    private TaskLinkDsDTO [] Links;

    /**
    * 参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ParameterTaskDsDto [] Params;

    /**
    * 工作流类型, 取值示例

- cycle 周期工作流
- manual 手动工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 责任人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 工作流描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get SparkSQL参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkParams SparkSQL参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkParams() {
        return this.SparkParams;
    }

    /**
     * Set SparkSQL参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkParams SparkSQL参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkParams(String SparkParams) {
        this.SparkParams = SparkParams;
    }

    /**
     * Get 任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskDsDTO [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 任务链接列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Links 任务链接列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLinkDsDTO [] getLinks() {
        return this.Links;
    }

    /**
     * Set 任务链接列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Links 任务链接列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinks(TaskLinkDsDTO [] Links) {
        this.Links = Links;
    }

    /**
     * Get 参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskDsDto [] getParams() {
        return this.Params;
    }

    /**
     * Set 参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ParameterTaskDsDto [] Params) {
        this.Params = Params;
    }

    /**
     * Get 工作流类型, 取值示例

- cycle 周期工作流
- manual 手动工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType 工作流类型, 取值示例

- cycle 周期工作流
- manual 手动工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set 工作流类型, 取值示例

- cycle 周期工作流
- manual 手动工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType 工作流类型, 取值示例

- cycle 周期工作流
- manual 手动工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
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

    }
}

