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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerAIWorkbenchTaskRequest extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>session会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>输入内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>幂等键，调用方保证同一事件重试时携带同一 key</p>
    */
    @SerializedName("IdempotencyKey")
    @Expose
    private String IdempotencyKey;

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
     * Get <p>session会话ID</p> 
     * @return SessionId <p>session会话ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>session会话ID</p>
     * @param SessionId <p>session会话ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>输入内容</p> 
     * @return Content <p>输入内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>输入内容</p>
     * @param Content <p>输入内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>幂等键，调用方保证同一事件重试时携带同一 key</p> 
     * @return IdempotencyKey <p>幂等键，调用方保证同一事件重试时携带同一 key</p>
     */
    public String getIdempotencyKey() {
        return this.IdempotencyKey;
    }

    /**
     * Set <p>幂等键，调用方保证同一事件重试时携带同一 key</p>
     * @param IdempotencyKey <p>幂等键，调用方保证同一事件重试时携带同一 key</p>
     */
    public void setIdempotencyKey(String IdempotencyKey) {
        this.IdempotencyKey = IdempotencyKey;
    }

    public TriggerAIWorkbenchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerAIWorkbenchTaskRequest(TriggerAIWorkbenchTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.IdempotencyKey != null) {
            this.IdempotencyKey = new String(source.IdempotencyKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "IdempotencyKey", this.IdempotencyKey);

    }
}

