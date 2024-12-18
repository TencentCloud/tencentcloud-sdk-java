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

public class TaskImportInfo extends AbstractModel {

    /**
    * 是否导入编排空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsImport")
    @Expose
    private Boolean IsImport;

    /**
    * 是否新建工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewWorkFlow")
    @Expose
    private Boolean IsNewWorkFlow;

    /**
    * 工作流所属目录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowFolderId")
    @Expose
    private String WorkFlowFolderId;

    /**
    * 工作流所属目录名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowFolderName")
    @Expose
    private String WorkFlowFolderName;

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowName")
    @Expose
    private String WorkFlowName;

    /**
    * 重名任务处理策略, 0:跳过,不导入; 1: 重命名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNameExistMode")
    @Expose
    private Long TaskNameExistMode;

    /**
     * Get 是否导入编排空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsImport 是否导入编排空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsImport() {
        return this.IsImport;
    }

    /**
     * Set 是否导入编排空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsImport 是否导入编排空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsImport(Boolean IsImport) {
        this.IsImport = IsImport;
    }

    /**
     * Get 是否新建工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNewWorkFlow 是否新建工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNewWorkFlow() {
        return this.IsNewWorkFlow;
    }

    /**
     * Set 是否新建工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNewWorkFlow 是否新建工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNewWorkFlow(Boolean IsNewWorkFlow) {
        this.IsNewWorkFlow = IsNewWorkFlow;
    }

    /**
     * Get 工作流所属目录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowFolderId 工作流所属目录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowFolderId() {
        return this.WorkFlowFolderId;
    }

    /**
     * Set 工作流所属目录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowFolderId 工作流所属目录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowFolderId(String WorkFlowFolderId) {
        this.WorkFlowFolderId = WorkFlowFolderId;
    }

    /**
     * Get 工作流所属目录名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowFolderName 工作流所属目录名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowFolderName() {
        return this.WorkFlowFolderName;
    }

    /**
     * Set 工作流所属目录名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowFolderName 工作流所属目录名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowFolderName(String WorkFlowFolderName) {
        this.WorkFlowFolderName = WorkFlowFolderName;
    }

    /**
     * Get 工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowName() {
        return this.WorkFlowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowName(String WorkFlowName) {
        this.WorkFlowName = WorkFlowName;
    }

    /**
     * Get 重名任务处理策略, 0:跳过,不导入; 1: 重命名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNameExistMode 重名任务处理策略, 0:跳过,不导入; 1: 重命名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskNameExistMode() {
        return this.TaskNameExistMode;
    }

    /**
     * Set 重名任务处理策略, 0:跳过,不导入; 1: 重命名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNameExistMode 重名任务处理策略, 0:跳过,不导入; 1: 重命名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNameExistMode(Long TaskNameExistMode) {
        this.TaskNameExistMode = TaskNameExistMode;
    }

    public TaskImportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskImportInfo(TaskImportInfo source) {
        if (source.IsImport != null) {
            this.IsImport = new Boolean(source.IsImport);
        }
        if (source.IsNewWorkFlow != null) {
            this.IsNewWorkFlow = new Boolean(source.IsNewWorkFlow);
        }
        if (source.WorkFlowFolderId != null) {
            this.WorkFlowFolderId = new String(source.WorkFlowFolderId);
        }
        if (source.WorkFlowFolderName != null) {
            this.WorkFlowFolderName = new String(source.WorkFlowFolderName);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.WorkFlowName != null) {
            this.WorkFlowName = new String(source.WorkFlowName);
        }
        if (source.TaskNameExistMode != null) {
            this.TaskNameExistMode = new Long(source.TaskNameExistMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsImport", this.IsImport);
        this.setParamSimple(map, prefix + "IsNewWorkFlow", this.IsNewWorkFlow);
        this.setParamSimple(map, prefix + "WorkFlowFolderId", this.WorkFlowFolderId);
        this.setParamSimple(map, prefix + "WorkFlowFolderName", this.WorkFlowFolderName);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "WorkFlowName", this.WorkFlowName);
        this.setParamSimple(map, prefix + "TaskNameExistMode", this.TaskNameExistMode);

    }
}

