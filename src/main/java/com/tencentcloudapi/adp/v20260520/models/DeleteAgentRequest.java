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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAgentRequest extends AbstractModel {

    /**
    * <p>应用Id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>待删除AgentId</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 协作模式；0-Claw模式；1-Multi-Agent模式
    */
    @SerializedName("CollaborationMode")
    @Expose
    private Long CollaborationMode;

    /**
     * Get <p>应用Id</p> 
     * @return AppId <p>应用Id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用Id</p>
     * @param AppId <p>应用Id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>待删除AgentId</p> 
     * @return AgentId <p>待删除AgentId</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>待删除AgentId</p>
     * @param AgentId <p>待删除AgentId</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 协作模式；0-Claw模式；1-Multi-Agent模式 
     * @return CollaborationMode 协作模式；0-Claw模式；1-Multi-Agent模式
     */
    public Long getCollaborationMode() {
        return this.CollaborationMode;
    }

    /**
     * Set 协作模式；0-Claw模式；1-Multi-Agent模式
     * @param CollaborationMode 协作模式；0-Claw模式；1-Multi-Agent模式
     */
    public void setCollaborationMode(Long CollaborationMode) {
        this.CollaborationMode = CollaborationMode;
    }

    public DeleteAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAgentRequest(DeleteAgentRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.CollaborationMode != null) {
            this.CollaborationMode = new Long(source.CollaborationMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "CollaborationMode", this.CollaborationMode);

    }
}

