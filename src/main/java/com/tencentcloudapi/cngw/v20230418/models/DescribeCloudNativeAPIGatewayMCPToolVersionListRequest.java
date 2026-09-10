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

public class DescribeCloudNativeAPIGatewayMCPToolVersionListRequest extends AbstractModel {

    /**
    * <p>网关实例 id</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>MCPserverId</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>工具 id</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>分页查询limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>网关实例 id</p> 
     * @return GatewayId <p>网关实例 id</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例 id</p>
     * @param GatewayId <p>网关实例 id</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>MCPserverId</p> 
     * @return ServerId <p>MCPserverId</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCPserverId</p>
     * @param ServerId <p>MCPserverId</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>工具 id</p> 
     * @return ToolId <p>工具 id</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>工具 id</p>
     * @param ToolId <p>工具 id</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>分页查询limit</p> 
     * @return Limit <p>分页查询limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询limit</p>
     * @param Limit <p>分页查询limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询偏移</p> 
     * @return Offset <p>分页查询偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移</p>
     * @param Offset <p>分页查询偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCloudNativeAPIGatewayMCPToolVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayMCPToolVersionListRequest(DescribeCloudNativeAPIGatewayMCPToolVersionListRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

