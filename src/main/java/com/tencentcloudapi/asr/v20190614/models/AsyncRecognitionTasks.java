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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncRecognitionTasks extends AbstractModel{

    /**
    * 任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private AsyncRecognitionTaskInfo [] Tasks;

    /**
     * Get 任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsyncRecognitionTaskInfo [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(AsyncRecognitionTaskInfo [] Tasks) {
        this.Tasks = Tasks;
    }

    public AsyncRecognitionTasks() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncRecognitionTasks(AsyncRecognitionTasks source) {
        if (source.Tasks != null) {
            this.Tasks = new AsyncRecognitionTaskInfo[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new AsyncRecognitionTaskInfo(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);

    }
}

