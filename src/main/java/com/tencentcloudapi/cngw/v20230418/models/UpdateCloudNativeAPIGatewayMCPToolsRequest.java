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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCloudNativeAPIGatewayMCPToolsRequest extends AbstractModel {

    /**
    * <p>网关实例ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>MCP Server ID</p>
    */
    @SerializedName("MCPServerId")
    @Expose
    private String MCPServerId;

    /**
    * <p>待导入的MCP Tools列表</p>
    */
    @SerializedName("Tools")
    @Expose
    private CNAPIGwMCPTool [] Tools;

    /**
     * Get <p>网关实例ID</p> 
     * @return GatewayId <p>网关实例ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例ID</p>
     * @param GatewayId <p>网关实例ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>MCP Server ID</p> 
     * @return MCPServerId <p>MCP Server ID</p>
     */
    public String getMCPServerId() {
        return this.MCPServerId;
    }

    /**
     * Set <p>MCP Server ID</p>
     * @param MCPServerId <p>MCP Server ID</p>
     */
    public void setMCPServerId(String MCPServerId) {
        this.MCPServerId = MCPServerId;
    }

    /**
     * Get <p>待导入的MCP Tools列表</p> 
     * @return Tools <p>待导入的MCP Tools列表</p>
     */
    public CNAPIGwMCPTool [] getTools() {
        return this.Tools;
    }

    /**
     * Set <p>待导入的MCP Tools列表</p>
     * @param Tools <p>待导入的MCP Tools列表</p>
     */
    public void setTools(CNAPIGwMCPTool [] Tools) {
        this.Tools = Tools;
    }

    public UpdateCloudNativeAPIGatewayMCPToolsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCloudNativeAPIGatewayMCPToolsRequest(UpdateCloudNativeAPIGatewayMCPToolsRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.MCPServerId != null) {
            this.MCPServerId = new String(source.MCPServerId);
        }
        if (source.Tools != null) {
            this.Tools = new CNAPIGwMCPTool[source.Tools.length];
            for (int i = 0; i < source.Tools.length; i++) {
                this.Tools[i] = new CNAPIGwMCPTool(source.Tools[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "MCPServerId", this.MCPServerId);
        this.setParamArrayObj(map, prefix + "Tools.", this.Tools);

    }
}

