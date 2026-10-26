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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayConsumerListRequest extends AbstractModel {

    /**
    * <p>网关实例id</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>页显示条数，最大20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>起始位置</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>ModelAPI： 模型API</li><li>MCPServer： MCP服务</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>消费者来源筛选：manual / sync（小写），与现有控制面校验一致。</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>目录消费者状态筛选：active / disabled / soft_deleted（小写）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>仅查询指定同步源产生的消费者。</p>
    */
    @SerializedName("SyncSourceId")
    @Expose
    private String SyncSourceId;

    /**
    * <p>仅查询不属于外部同步源的消费者；不能与 SyncSourceId 同时设置。</p>
    */
    @SerializedName("WithoutSyncSource")
    @Expose
    private Boolean WithoutSyncSource;

    /**
     * Get <p>网关实例id</p> 
     * @return GatewayId <p>网关实例id</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例id</p>
     * @param GatewayId <p>网关实例id</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>页显示条数，最大20</p> 
     * @return Limit <p>页显示条数，最大20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>页显示条数，最大20</p>
     * @param Limit <p>页显示条数，最大20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>起始位置</p> 
     * @return Offset <p>起始位置</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始位置</p>
     * @param Offset <p>起始位置</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>ModelAPI： 模型API</li><li>MCPServer： MCP服务</li></ul> 
     * @return ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>ModelAPI： 模型API</li><li>MCPServer： MCP服务</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>ModelAPI： 模型API</li><li>MCPServer： MCP服务</li></ul>
     * @param ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>ModelAPI： 模型API</li><li>MCPServer： MCP服务</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>消费者来源筛选：manual / sync（小写），与现有控制面校验一致。</p> 
     * @return Origin <p>消费者来源筛选：manual / sync（小写），与现有控制面校验一致。</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>消费者来源筛选：manual / sync（小写），与现有控制面校验一致。</p>
     * @param Origin <p>消费者来源筛选：manual / sync（小写），与现有控制面校验一致。</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>目录消费者状态筛选：active / disabled / soft_deleted（小写）。</p> 
     * @return Status <p>目录消费者状态筛选：active / disabled / soft_deleted（小写）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>目录消费者状态筛选：active / disabled / soft_deleted（小写）。</p>
     * @param Status <p>目录消费者状态筛选：active / disabled / soft_deleted（小写）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>仅查询指定同步源产生的消费者。</p> 
     * @return SyncSourceId <p>仅查询指定同步源产生的消费者。</p>
     */
    public String getSyncSourceId() {
        return this.SyncSourceId;
    }

    /**
     * Set <p>仅查询指定同步源产生的消费者。</p>
     * @param SyncSourceId <p>仅查询指定同步源产生的消费者。</p>
     */
    public void setSyncSourceId(String SyncSourceId) {
        this.SyncSourceId = SyncSourceId;
    }

    /**
     * Get <p>仅查询不属于外部同步源的消费者；不能与 SyncSourceId 同时设置。</p> 
     * @return WithoutSyncSource <p>仅查询不属于外部同步源的消费者；不能与 SyncSourceId 同时设置。</p>
     */
    public Boolean getWithoutSyncSource() {
        return this.WithoutSyncSource;
    }

    /**
     * Set <p>仅查询不属于外部同步源的消费者；不能与 SyncSourceId 同时设置。</p>
     * @param WithoutSyncSource <p>仅查询不属于外部同步源的消费者；不能与 SyncSourceId 同时设置。</p>
     */
    public void setWithoutSyncSource(Boolean WithoutSyncSource) {
        this.WithoutSyncSource = WithoutSyncSource;
    }

    public DescribeCloudNativeAPIGatewayConsumerListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayConsumerListRequest(DescribeCloudNativeAPIGatewayConsumerListRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SyncSourceId != null) {
            this.SyncSourceId = new String(source.SyncSourceId);
        }
        if (source.WithoutSyncSource != null) {
            this.WithoutSyncSource = new Boolean(source.WithoutSyncSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SyncSourceId", this.SyncSourceId);
        this.setParamSimple(map, prefix + "WithoutSyncSource", this.WithoutSyncSource);

    }
}

