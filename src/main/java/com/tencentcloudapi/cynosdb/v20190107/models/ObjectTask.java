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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTask extends AbstractModel{

    /**
    * 任务自增ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务ID（集群ID|实例组ID|实例ID）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
     * Get 任务自增ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务自增ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务自增ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务自增ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务ID（集群ID|实例组ID|实例ID）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectId 任务ID（集群ID|实例组ID|实例ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 任务ID（集群ID|实例组ID|实例ID）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectId 任务ID（集群ID|实例组ID|实例ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    public ObjectTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTask(ObjectTask source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);

    }
}

