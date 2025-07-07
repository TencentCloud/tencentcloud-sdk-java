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

public class TaskTypeExtParamDsVO extends AbstractModel {

    /**
    * TaskTypeExts的Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeExtKey")
    @Expose
    private String TaskTypeExtKey;

    /**
    * TaskTypeExts的Value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeExtValue")
    @Expose
    private TaskTypeExtDsVO TaskTypeExtValue;

    /**
     * Get TaskTypeExts的Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeExtKey TaskTypeExts的Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeExtKey() {
        return this.TaskTypeExtKey;
    }

    /**
     * Set TaskTypeExts的Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeExtKey TaskTypeExts的Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeExtKey(String TaskTypeExtKey) {
        this.TaskTypeExtKey = TaskTypeExtKey;
    }

    /**
     * Get TaskTypeExts的Value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeExtValue TaskTypeExts的Value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeExtDsVO getTaskTypeExtValue() {
        return this.TaskTypeExtValue;
    }

    /**
     * Set TaskTypeExts的Value
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeExtValue TaskTypeExts的Value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeExtValue(TaskTypeExtDsVO TaskTypeExtValue) {
        this.TaskTypeExtValue = TaskTypeExtValue;
    }

    public TaskTypeExtParamDsVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeExtParamDsVO(TaskTypeExtParamDsVO source) {
        if (source.TaskTypeExtKey != null) {
            this.TaskTypeExtKey = new String(source.TaskTypeExtKey);
        }
        if (source.TaskTypeExtValue != null) {
            this.TaskTypeExtValue = new TaskTypeExtDsVO(source.TaskTypeExtValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTypeExtKey", this.TaskTypeExtKey);
        this.setParamObj(map, prefix + "TaskTypeExtValue.", this.TaskTypeExtValue);

    }
}

