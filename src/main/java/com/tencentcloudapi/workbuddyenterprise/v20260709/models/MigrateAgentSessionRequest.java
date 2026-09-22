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

public class MigrateAgentSessionRequest extends AbstractModel {

    /**
    * <p>待迁移的会话 ID（必填）</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>目标 Agent 业务 ID（必填），必须与 Session 原 Agent 相同</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>目标版本 ID（必填，字符串形式）。需归属同一 Agent 且未被废弃</p>
    */
    @SerializedName("TargetVersionId")
    @Expose
    private String TargetVersionId;

    /**
     * Get <p>待迁移的会话 ID（必填）</p> 
     * @return SessionId <p>待迁移的会话 ID（必填）</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>待迁移的会话 ID（必填）</p>
     * @param SessionId <p>待迁移的会话 ID（必填）</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>目标 Agent 业务 ID（必填），必须与 Session 原 Agent 相同</p> 
     * @return AgentId <p>目标 Agent 业务 ID（必填），必须与 Session 原 Agent 相同</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>目标 Agent 业务 ID（必填），必须与 Session 原 Agent 相同</p>
     * @param AgentId <p>目标 Agent 业务 ID（必填），必须与 Session 原 Agent 相同</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>目标版本 ID（必填，字符串形式）。需归属同一 Agent 且未被废弃</p> 
     * @return TargetVersionId <p>目标版本 ID（必填，字符串形式）。需归属同一 Agent 且未被废弃</p>
     */
    public String getTargetVersionId() {
        return this.TargetVersionId;
    }

    /**
     * Set <p>目标版本 ID（必填，字符串形式）。需归属同一 Agent 且未被废弃</p>
     * @param TargetVersionId <p>目标版本 ID（必填，字符串形式）。需归属同一 Agent 且未被废弃</p>
     */
    public void setTargetVersionId(String TargetVersionId) {
        this.TargetVersionId = TargetVersionId;
    }

    public MigrateAgentSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateAgentSessionRequest(MigrateAgentSessionRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.TargetVersionId != null) {
            this.TargetVersionId = new String(source.TargetVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "TargetVersionId", this.TargetVersionId);

    }
}

