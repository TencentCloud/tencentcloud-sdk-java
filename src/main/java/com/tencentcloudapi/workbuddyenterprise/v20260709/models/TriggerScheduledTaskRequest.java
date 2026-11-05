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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerScheduledTaskRequest extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>覆盖 Prompt，为空则使用任务原 Prompt</p>
    */
    @SerializedName("OverridePrompt")
    @Expose
    private String OverridePrompt;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>覆盖 Prompt，为空则使用任务原 Prompt</p> 
     * @return OverridePrompt <p>覆盖 Prompt，为空则使用任务原 Prompt</p>
     */
    public String getOverridePrompt() {
        return this.OverridePrompt;
    }

    /**
     * Set <p>覆盖 Prompt，为空则使用任务原 Prompt</p>
     * @param OverridePrompt <p>覆盖 Prompt，为空则使用任务原 Prompt</p>
     */
    public void setOverridePrompt(String OverridePrompt) {
        this.OverridePrompt = OverridePrompt;
    }

    public TriggerScheduledTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerScheduledTaskRequest(TriggerScheduledTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.OverridePrompt != null) {
            this.OverridePrompt = new String(source.OverridePrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "OverridePrompt", this.OverridePrompt);

    }
}

