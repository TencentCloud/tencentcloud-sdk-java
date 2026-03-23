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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentAppMcpServersRequest extends AbstractModel {

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 应用ID
    */
    @SerializedName("AgentAppIDs")
    @Expose
    private String [] AgentAppIDs;

    /**
    * 关联的mcp
    */
    @SerializedName("McpServerIDs")
    @Expose
    private String [] McpServerIDs;

    /**
    * 凭据ID
    */
    @SerializedName("AgentCredentialIDs")
    @Expose
    private String [] AgentCredentialIDs;

    /**
    * 关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 应用ID 
     * @return AgentAppIDs 应用ID
     */
    public String [] getAgentAppIDs() {
        return this.AgentAppIDs;
    }

    /**
     * Set 应用ID
     * @param AgentAppIDs 应用ID
     */
    public void setAgentAppIDs(String [] AgentAppIDs) {
        this.AgentAppIDs = AgentAppIDs;
    }

    /**
     * Get 关联的mcp 
     * @return McpServerIDs 关联的mcp
     */
    public String [] getMcpServerIDs() {
        return this.McpServerIDs;
    }

    /**
     * Set 关联的mcp
     * @param McpServerIDs 关联的mcp
     */
    public void setMcpServerIDs(String [] McpServerIDs) {
        this.McpServerIDs = McpServerIDs;
    }

    /**
     * Get 凭据ID 
     * @return AgentCredentialIDs 凭据ID
     */
    public String [] getAgentCredentialIDs() {
        return this.AgentCredentialIDs;
    }

    /**
     * Set 凭据ID
     * @param AgentCredentialIDs 凭据ID
     */
    public void setAgentCredentialIDs(String [] AgentCredentialIDs) {
        this.AgentCredentialIDs = AgentCredentialIDs;
    }

    /**
     * Get 关键词 
     * @return Keyword 关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词
     * @param Keyword 关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeAgentAppMcpServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentAppMcpServersRequest(DescribeAgentAppMcpServersRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.AgentAppIDs != null) {
            this.AgentAppIDs = new String[source.AgentAppIDs.length];
            for (int i = 0; i < source.AgentAppIDs.length; i++) {
                this.AgentAppIDs[i] = new String(source.AgentAppIDs[i]);
            }
        }
        if (source.McpServerIDs != null) {
            this.McpServerIDs = new String[source.McpServerIDs.length];
            for (int i = 0; i < source.McpServerIDs.length; i++) {
                this.McpServerIDs[i] = new String(source.McpServerIDs[i]);
            }
        }
        if (source.AgentCredentialIDs != null) {
            this.AgentCredentialIDs = new String[source.AgentCredentialIDs.length];
            for (int i = 0; i < source.AgentCredentialIDs.length; i++) {
                this.AgentCredentialIDs[i] = new String(source.AgentCredentialIDs[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "AgentAppIDs.", this.AgentAppIDs);
        this.setParamArraySimple(map, prefix + "McpServerIDs.", this.McpServerIDs);
        this.setParamArraySimple(map, prefix + "AgentCredentialIDs.", this.AgentCredentialIDs);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

