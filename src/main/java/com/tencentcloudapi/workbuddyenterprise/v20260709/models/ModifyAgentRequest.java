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

public class ModifyAgentRequest extends AbstractModel {

    /**
    * Agent 业务 ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Agent 名称（可选，仅传递需要更新的字段）
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Agent 描述（可选）
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 头像 URL（可选）
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
     * Get Agent 业务 ID 
     * @return AgentId Agent 业务 ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID
     * @param AgentId Agent 业务 ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Agent 名称（可选，仅传递需要更新的字段） 
     * @return AgentName Agent 名称（可选，仅传递需要更新的字段）
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent 名称（可选，仅传递需要更新的字段）
     * @param AgentName Agent 名称（可选，仅传递需要更新的字段）
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Agent 描述（可选） 
     * @return Description Agent 描述（可选）
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Agent 描述（可选）
     * @param Description Agent 描述（可选）
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 头像 URL（可选） 
     * @return AvatarUrl 头像 URL（可选）
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像 URL（可选）
     * @param AvatarUrl 头像 URL（可选）
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    public ModifyAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRequest(ModifyAgentRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);

    }
}

