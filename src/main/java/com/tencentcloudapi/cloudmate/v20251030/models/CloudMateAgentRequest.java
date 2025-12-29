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
package com.tencentcloudapi.cloudmate.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudMateAgentRequest extends AbstractModel {

    /**
    * 空间 ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 用户提问内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 场景 ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 会话 ID

- 填写上一次接口调用返回的会话 ID（SessionId），可在原有会话基础上继续对话
- 未填写会话 ID 时，创建新会话
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 是否使用流式响应，默认为 false，不启用流式响应
    */
    @SerializedName("Streaming")
    @Expose
    private Boolean Streaming;

    /**
     * Get 空间 ID 
     * @return WorkspaceId 空间 ID
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 空间 ID
     * @param WorkspaceId 空间 ID
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 用户提问内容 
     * @return Message 用户提问内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 用户提问内容
     * @param Message 用户提问内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 场景 ID 
     * @return ScenarioId 场景 ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景 ID
     * @param ScenarioId 场景 ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 会话 ID

- 填写上一次接口调用返回的会话 ID（SessionId），可在原有会话基础上继续对话
- 未填写会话 ID 时，创建新会话 
     * @return SessionId 会话 ID

- 填写上一次接口调用返回的会话 ID（SessionId），可在原有会话基础上继续对话
- 未填写会话 ID 时，创建新会话
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID

- 填写上一次接口调用返回的会话 ID（SessionId），可在原有会话基础上继续对话
- 未填写会话 ID 时，创建新会话
     * @param SessionId 会话 ID

- 填写上一次接口调用返回的会话 ID（SessionId），可在原有会话基础上继续对话
- 未填写会话 ID 时，创建新会话
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 是否使用流式响应，默认为 false，不启用流式响应 
     * @return Streaming 是否使用流式响应，默认为 false，不启用流式响应
     */
    public Boolean getStreaming() {
        return this.Streaming;
    }

    /**
     * Set 是否使用流式响应，默认为 false，不启用流式响应
     * @param Streaming 是否使用流式响应，默认为 false，不启用流式响应
     */
    public void setStreaming(Boolean Streaming) {
        this.Streaming = Streaming;
    }

    public CloudMateAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudMateAgentRequest(CloudMateAgentRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Streaming != null) {
            this.Streaming = new Boolean(source.Streaming);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Streaming", this.Streaming);

    }
}

