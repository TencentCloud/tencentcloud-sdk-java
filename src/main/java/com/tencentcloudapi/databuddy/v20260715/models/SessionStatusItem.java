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

public class SessionStatusItem extends AbstractModel {

    /**
    * 对话 Session ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 沙箱 Runtime ID
    */
    @SerializedName("RuntimeId")
    @Expose
    private String RuntimeId;

    /**
    * 任务运行状态: planning/working/pending/completed/failed
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get 对话 Session ID 
     * @return SessionId 对话 Session ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 对话 Session ID
     * @param SessionId 对话 Session ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 沙箱 Runtime ID 
     * @return RuntimeId 沙箱 Runtime ID
     */
    public String getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 沙箱 Runtime ID
     * @param RuntimeId 沙箱 Runtime ID
     */
    public void setRuntimeId(String RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get 任务运行状态: planning/working/pending/completed/failed 
     * @return TaskStatus 任务运行状态: planning/working/pending/completed/failed
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务运行状态: planning/working/pending/completed/failed
     * @param TaskStatus 任务运行状态: planning/working/pending/completed/failed
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public SessionStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionStatusItem(SessionStatusItem source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RuntimeId != null) {
            this.RuntimeId = new String(source.RuntimeId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RuntimeId", this.RuntimeId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

