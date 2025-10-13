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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceRelationTaskInfo extends AbstractModel {

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 数据源关联任务信息，本期仅支持数据开发任务接口返回数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private RelateTask [] TaskInfo;

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 数据源关联任务信息，本期仅支持数据开发任务接口返回数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo 数据源关联任务信息，本期仅支持数据开发任务接口返回数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelateTask [] getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 数据源关联任务信息，本期仅支持数据开发任务接口返回数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo 数据源关联任务信息，本期仅支持数据开发任务接口返回数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(RelateTask [] TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    public DatasourceRelationTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceRelationTaskInfo(DatasourceRelationTaskInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new RelateTask[source.TaskInfo.length];
            for (int i = 0; i < source.TaskInfo.length; i++) {
                this.TaskInfo[i] = new RelateTask(source.TaskInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamArrayObj(map, prefix + "TaskInfo.", this.TaskInfo);

    }
}

