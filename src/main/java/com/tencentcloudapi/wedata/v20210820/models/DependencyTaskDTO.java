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

public class DependencyTaskDTO extends AbstractModel {

    /**
    * 已选任务id
    */
    @SerializedName("SelectedTaskId")
    @Expose
    private String SelectedTaskId;

    /**
    * 已选任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectedTaskName")
    @Expose
    private String SelectedTaskName;

    /**
    * 依赖任务id
    */
    @SerializedName("DependencyTaskId")
    @Expose
    private String DependencyTaskId;

    /**
    * 依赖任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyTaskName")
    @Expose
    private String DependencyTaskName;

    /**
    * 依赖任务是否跨项目
    */
    @SerializedName("CrossProject")
    @Expose
    private Boolean CrossProject;

    /**
    * 依赖任务对应项目id
    */
    @SerializedName("DependencyProjectId")
    @Expose
    private String DependencyProjectId;

    /**
    * 依赖任务对应项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyProjectName")
    @Expose
    private String DependencyProjectName;

    /**
    * 依赖任务虚拟标识
    */
    @SerializedName("DependencyTaskVirtualFlag")
    @Expose
    private Boolean DependencyTaskVirtualFlag;

    /**
    * 边依赖标识
    */
    @SerializedName("LinkDependency")
    @Expose
    private Boolean LinkDependency;

    /**
    * 已选任务虚拟标识
    */
    @SerializedName("SelectedTaskVirtualFlag")
    @Expose
    private Boolean SelectedTaskVirtualFlag;

    /**
    * 依赖任务工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyTaskWorkflowName")
    @Expose
    private String DependencyTaskWorkflowName;

    /**
     * Get 已选任务id 
     * @return SelectedTaskId 已选任务id
     */
    public String getSelectedTaskId() {
        return this.SelectedTaskId;
    }

    /**
     * Set 已选任务id
     * @param SelectedTaskId 已选任务id
     */
    public void setSelectedTaskId(String SelectedTaskId) {
        this.SelectedTaskId = SelectedTaskId;
    }

    /**
     * Get 已选任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectedTaskName 已选任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelectedTaskName() {
        return this.SelectedTaskName;
    }

    /**
     * Set 已选任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectedTaskName 已选任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectedTaskName(String SelectedTaskName) {
        this.SelectedTaskName = SelectedTaskName;
    }

    /**
     * Get 依赖任务id 
     * @return DependencyTaskId 依赖任务id
     */
    public String getDependencyTaskId() {
        return this.DependencyTaskId;
    }

    /**
     * Set 依赖任务id
     * @param DependencyTaskId 依赖任务id
     */
    public void setDependencyTaskId(String DependencyTaskId) {
        this.DependencyTaskId = DependencyTaskId;
    }

    /**
     * Get 依赖任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyTaskName 依赖任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyTaskName() {
        return this.DependencyTaskName;
    }

    /**
     * Set 依赖任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyTaskName 依赖任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyTaskName(String DependencyTaskName) {
        this.DependencyTaskName = DependencyTaskName;
    }

    /**
     * Get 依赖任务是否跨项目 
     * @return CrossProject 依赖任务是否跨项目
     */
    public Boolean getCrossProject() {
        return this.CrossProject;
    }

    /**
     * Set 依赖任务是否跨项目
     * @param CrossProject 依赖任务是否跨项目
     */
    public void setCrossProject(Boolean CrossProject) {
        this.CrossProject = CrossProject;
    }

    /**
     * Get 依赖任务对应项目id 
     * @return DependencyProjectId 依赖任务对应项目id
     */
    public String getDependencyProjectId() {
        return this.DependencyProjectId;
    }

    /**
     * Set 依赖任务对应项目id
     * @param DependencyProjectId 依赖任务对应项目id
     */
    public void setDependencyProjectId(String DependencyProjectId) {
        this.DependencyProjectId = DependencyProjectId;
    }

    /**
     * Get 依赖任务对应项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyProjectName 依赖任务对应项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyProjectName() {
        return this.DependencyProjectName;
    }

    /**
     * Set 依赖任务对应项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyProjectName 依赖任务对应项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyProjectName(String DependencyProjectName) {
        this.DependencyProjectName = DependencyProjectName;
    }

    /**
     * Get 依赖任务虚拟标识 
     * @return DependencyTaskVirtualFlag 依赖任务虚拟标识
     */
    public Boolean getDependencyTaskVirtualFlag() {
        return this.DependencyTaskVirtualFlag;
    }

    /**
     * Set 依赖任务虚拟标识
     * @param DependencyTaskVirtualFlag 依赖任务虚拟标识
     */
    public void setDependencyTaskVirtualFlag(Boolean DependencyTaskVirtualFlag) {
        this.DependencyTaskVirtualFlag = DependencyTaskVirtualFlag;
    }

    /**
     * Get 边依赖标识 
     * @return LinkDependency 边依赖标识
     */
    public Boolean getLinkDependency() {
        return this.LinkDependency;
    }

    /**
     * Set 边依赖标识
     * @param LinkDependency 边依赖标识
     */
    public void setLinkDependency(Boolean LinkDependency) {
        this.LinkDependency = LinkDependency;
    }

    /**
     * Get 已选任务虚拟标识 
     * @return SelectedTaskVirtualFlag 已选任务虚拟标识
     */
    public Boolean getSelectedTaskVirtualFlag() {
        return this.SelectedTaskVirtualFlag;
    }

    /**
     * Set 已选任务虚拟标识
     * @param SelectedTaskVirtualFlag 已选任务虚拟标识
     */
    public void setSelectedTaskVirtualFlag(Boolean SelectedTaskVirtualFlag) {
        this.SelectedTaskVirtualFlag = SelectedTaskVirtualFlag;
    }

    /**
     * Get 依赖任务工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyTaskWorkflowName 依赖任务工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyTaskWorkflowName() {
        return this.DependencyTaskWorkflowName;
    }

    /**
     * Set 依赖任务工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyTaskWorkflowName 依赖任务工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyTaskWorkflowName(String DependencyTaskWorkflowName) {
        this.DependencyTaskWorkflowName = DependencyTaskWorkflowName;
    }

    public DependencyTaskDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyTaskDTO(DependencyTaskDTO source) {
        if (source.SelectedTaskId != null) {
            this.SelectedTaskId = new String(source.SelectedTaskId);
        }
        if (source.SelectedTaskName != null) {
            this.SelectedTaskName = new String(source.SelectedTaskName);
        }
        if (source.DependencyTaskId != null) {
            this.DependencyTaskId = new String(source.DependencyTaskId);
        }
        if (source.DependencyTaskName != null) {
            this.DependencyTaskName = new String(source.DependencyTaskName);
        }
        if (source.CrossProject != null) {
            this.CrossProject = new Boolean(source.CrossProject);
        }
        if (source.DependencyProjectId != null) {
            this.DependencyProjectId = new String(source.DependencyProjectId);
        }
        if (source.DependencyProjectName != null) {
            this.DependencyProjectName = new String(source.DependencyProjectName);
        }
        if (source.DependencyTaskVirtualFlag != null) {
            this.DependencyTaskVirtualFlag = new Boolean(source.DependencyTaskVirtualFlag);
        }
        if (source.LinkDependency != null) {
            this.LinkDependency = new Boolean(source.LinkDependency);
        }
        if (source.SelectedTaskVirtualFlag != null) {
            this.SelectedTaskVirtualFlag = new Boolean(source.SelectedTaskVirtualFlag);
        }
        if (source.DependencyTaskWorkflowName != null) {
            this.DependencyTaskWorkflowName = new String(source.DependencyTaskWorkflowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectedTaskId", this.SelectedTaskId);
        this.setParamSimple(map, prefix + "SelectedTaskName", this.SelectedTaskName);
        this.setParamSimple(map, prefix + "DependencyTaskId", this.DependencyTaskId);
        this.setParamSimple(map, prefix + "DependencyTaskName", this.DependencyTaskName);
        this.setParamSimple(map, prefix + "CrossProject", this.CrossProject);
        this.setParamSimple(map, prefix + "DependencyProjectId", this.DependencyProjectId);
        this.setParamSimple(map, prefix + "DependencyProjectName", this.DependencyProjectName);
        this.setParamSimple(map, prefix + "DependencyTaskVirtualFlag", this.DependencyTaskVirtualFlag);
        this.setParamSimple(map, prefix + "LinkDependency", this.LinkDependency);
        this.setParamSimple(map, prefix + "SelectedTaskVirtualFlag", this.SelectedTaskVirtualFlag);
        this.setParamSimple(map, prefix + "DependencyTaskWorkflowName", this.DependencyTaskWorkflowName);

    }
}

