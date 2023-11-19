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

public class BatchCreateTaskVersionDsDTOLite extends AbstractModel {

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 版本备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * 任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private TaskDsDTOLiteV2 TaskInfo;

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
     * Get 任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTOLiteV2 getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(TaskDsDTOLiteV2 TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    public BatchCreateTaskVersionDsDTOLite() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateTaskVersionDsDTOLite(BatchCreateTaskVersionDsDTOLite source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new TaskDsDTOLiteV2(source.TaskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);

    }
}

