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

public class DescribeAIGWCustomGuardrailBindableResourcesRequest extends AbstractModel {

    /**
    * <p>网关实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>资源类型：model_api、mcp_server 或 agent_api</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>当前策略 ID；用于排除自身占用</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>按资源名称或路径模糊搜索</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>分页偏移量，最小 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单页数量，范围 1～100，默认 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>网关实例 ID</p> 
     * @return GatewayId <p>网关实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例 ID</p>
     * @param GatewayId <p>网关实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>资源类型：model_api、mcp_server 或 agent_api</p> 
     * @return ResourceType <p>资源类型：model_api、mcp_server 或 agent_api</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型：model_api、mcp_server 或 agent_api</p>
     * @param ResourceType <p>资源类型：model_api、mcp_server 或 agent_api</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>当前策略 ID；用于排除自身占用</p> 
     * @return PolicyId <p>当前策略 ID；用于排除自身占用</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>当前策略 ID；用于排除自身占用</p>
     * @param PolicyId <p>当前策略 ID；用于排除自身占用</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>按资源名称或路径模糊搜索</p> 
     * @return Keyword <p>按资源名称或路径模糊搜索</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>按资源名称或路径模糊搜索</p>
     * @param Keyword <p>按资源名称或路径模糊搜索</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>分页偏移量，最小 0</p> 
     * @return Offset <p>分页偏移量，最小 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，最小 0</p>
     * @param Offset <p>分页偏移量，最小 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单页数量，范围 1～100，默认 20</p> 
     * @return Limit <p>单页数量，范围 1～100，默认 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页数量，范围 1～100，默认 20</p>
     * @param Limit <p>单页数量，范围 1～100，默认 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAIGWCustomGuardrailBindableResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIGWCustomGuardrailBindableResourcesRequest(DescribeAIGWCustomGuardrailBindableResourcesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

