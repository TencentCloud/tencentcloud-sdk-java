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

public class DescribeCloudNativeAPIGatewayMCPToolsFromFileRequest extends AbstractModel {

    /**
    * <p>OpenAPI文件内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>文件内容格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

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
     * Get <p>OpenAPI文件内容</p> 
     * @return Content <p>OpenAPI文件内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>OpenAPI文件内容</p>
     * @param Content <p>OpenAPI文件内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>文件内容格式</p> 
     * @return Format <p>文件内容格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>文件内容格式</p>
     * @param Format <p>文件内容格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

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

    public DescribeCloudNativeAPIGatewayMCPToolsFromFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayMCPToolsFromFileRequest(DescribeCloudNativeAPIGatewayMCPToolsFromFileRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.MCPServerId != null) {
            this.MCPServerId = new String(source.MCPServerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "MCPServerId", this.MCPServerId);

    }
}

