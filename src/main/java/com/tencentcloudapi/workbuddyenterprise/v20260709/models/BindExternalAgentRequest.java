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

public class BindExternalAgentRequest extends AbstractModel {

    /**
    * TMA managed agent 业务 ID（CloudAgentID）
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 已注册的外部 A2A agent ID
    */
    @SerializedName("A2AAgentId")
    @Expose
    private String A2AAgentId;

    /**
    * 版本 ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get TMA managed agent 业务 ID（CloudAgentID） 
     * @return AgentId TMA managed agent 业务 ID（CloudAgentID）
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set TMA managed agent 业务 ID（CloudAgentID）
     * @param AgentId TMA managed agent 业务 ID（CloudAgentID）
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 已注册的外部 A2A agent ID 
     * @return A2AAgentId 已注册的外部 A2A agent ID
     */
    public String getA2AAgentId() {
        return this.A2AAgentId;
    }

    /**
     * Set 已注册的外部 A2A agent ID
     * @param A2AAgentId 已注册的外部 A2A agent ID
     */
    public void setA2AAgentId(String A2AAgentId) {
        this.A2AAgentId = A2AAgentId;
    }

    /**
     * Get 版本 ID 
     * @return VersionId 版本 ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID
     * @param VersionId 版本 ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public BindExternalAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindExternalAgentRequest(BindExternalAgentRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.A2AAgentId != null) {
            this.A2AAgentId = new String(source.A2AAgentId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "A2AAgentId", this.A2AAgentId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

