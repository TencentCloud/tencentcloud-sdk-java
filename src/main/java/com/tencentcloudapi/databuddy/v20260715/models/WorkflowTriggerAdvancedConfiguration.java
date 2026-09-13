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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTriggerAdvancedConfiguration extends AbstractModel {

    /**
    * 任务重试模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRetryMode")
    @Expose
    private String TaskRetryMode;

    /**
     * Get 任务重试模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRetryMode 任务重试模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskRetryMode() {
        return this.TaskRetryMode;
    }

    /**
     * Set 任务重试模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRetryMode 任务重试模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRetryMode(String TaskRetryMode) {
        this.TaskRetryMode = TaskRetryMode;
    }

    public WorkflowTriggerAdvancedConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTriggerAdvancedConfiguration(WorkflowTriggerAdvancedConfiguration source) {
        if (source.TaskRetryMode != null) {
            this.TaskRetryMode = new String(source.TaskRetryMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskRetryMode", this.TaskRetryMode);

    }
}

