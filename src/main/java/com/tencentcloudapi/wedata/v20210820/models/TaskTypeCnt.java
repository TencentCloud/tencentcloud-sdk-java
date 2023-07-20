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

public class TaskTypeCnt extends AbstractModel{

    /**
    * 统计值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
     * Get 统计值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number 统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 统计值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number 统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
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
     * Get 类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeName 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeName 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    public TaskTypeCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeCnt(TaskTypeCnt source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);

    }
}

