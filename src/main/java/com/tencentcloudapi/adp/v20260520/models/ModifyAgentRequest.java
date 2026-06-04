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

public class ModifyAgentRequest extends AbstractModel {

    /**
    * <p>应用Id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Agent Id</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>修改后的Agent的信息</p>
    */
    @SerializedName("Agent")
    @Expose
    private AgentSpec Agent;

    /**
    * <p>需要更新的字段路径，如 [&quot;instructions&quot;, &quot;model&quot;, &quot;tool_list&quot;, &quot;plugin_list&quot;, &quot;skill_list&quot;, &quot;advanced_config&quot;]</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

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
     * Get <p>Agent Id</p> 
     * @return AgentId <p>Agent Id</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent Id</p>
     * @param AgentId <p>Agent Id</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>修改后的Agent的信息</p> 
     * @return Agent <p>修改后的Agent的信息</p>
     */
    public AgentSpec getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>修改后的Agent的信息</p>
     * @param Agent <p>修改后的Agent的信息</p>
     */
    public void setAgent(AgentSpec Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>需要更新的字段路径，如 [&quot;instructions&quot;, &quot;model&quot;, &quot;tool_list&quot;, &quot;plugin_list&quot;, &quot;skill_list&quot;, &quot;advanced_config&quot;]</p> 
     * @return UpdateMask <p>需要更新的字段路径，如 [&quot;instructions&quot;, &quot;model&quot;, &quot;tool_list&quot;, &quot;plugin_list&quot;, &quot;skill_list&quot;, &quot;advanced_config&quot;]</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>需要更新的字段路径，如 [&quot;instructions&quot;, &quot;model&quot;, &quot;tool_list&quot;, &quot;plugin_list&quot;, &quot;skill_list&quot;, &quot;advanced_config&quot;]</p>
     * @param UpdateMask <p>需要更新的字段路径，如 [&quot;instructions&quot;, &quot;model&quot;, &quot;tool_list&quot;, &quot;plugin_list&quot;, &quot;skill_list&quot;, &quot;advanced_config&quot;]</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRequest(ModifyAgentRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Agent != null) {
            this.Agent = new AgentSpec(source.Agent);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

