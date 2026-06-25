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

public class ModifyCloudNativeAPIGatewayMCPToolACLRequest extends AbstractModel {

    /**
    * <p>网关实例ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>MCP服务ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>MCP工具ID</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
    */
    @SerializedName("ACLType")
    @Expose
    private String ACLType;

    /**
    * <p>需要关联的消费者ID列表</p>
    */
    @SerializedName("ACLConsumerIds")
    @Expose
    private String [] ACLConsumerIds;

    /**
    * <p>需要关联的消费者组ID列表</p>
    */
    @SerializedName("ACLConsumerGroupIds")
    @Expose
    private String [] ACLConsumerGroupIds;

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
     * Get <p>MCP服务ID</p> 
     * @return ServerId <p>MCP服务ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCP服务ID</p>
     * @param ServerId <p>MCP服务ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>MCP工具ID</p> 
     * @return ToolId <p>MCP工具ID</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>MCP工具ID</p>
     * @param ToolId <p>MCP工具ID</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul> 
     * @return ACLType <p>鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     */
    public String getACLType() {
        return this.ACLType;
    }

    /**
     * Set <p>鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     * @param ACLType <p>鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     */
    public void setACLType(String ACLType) {
        this.ACLType = ACLType;
    }

    /**
     * Get <p>需要关联的消费者ID列表</p> 
     * @return ACLConsumerIds <p>需要关联的消费者ID列表</p>
     */
    public String [] getACLConsumerIds() {
        return this.ACLConsumerIds;
    }

    /**
     * Set <p>需要关联的消费者ID列表</p>
     * @param ACLConsumerIds <p>需要关联的消费者ID列表</p>
     */
    public void setACLConsumerIds(String [] ACLConsumerIds) {
        this.ACLConsumerIds = ACLConsumerIds;
    }

    /**
     * Get <p>需要关联的消费者组ID列表</p> 
     * @return ACLConsumerGroupIds <p>需要关联的消费者组ID列表</p>
     */
    public String [] getACLConsumerGroupIds() {
        return this.ACLConsumerGroupIds;
    }

    /**
     * Set <p>需要关联的消费者组ID列表</p>
     * @param ACLConsumerGroupIds <p>需要关联的消费者组ID列表</p>
     */
    public void setACLConsumerGroupIds(String [] ACLConsumerGroupIds) {
        this.ACLConsumerGroupIds = ACLConsumerGroupIds;
    }

    public ModifyCloudNativeAPIGatewayMCPToolACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayMCPToolACLRequest(ModifyCloudNativeAPIGatewayMCPToolACLRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ACLType != null) {
            this.ACLType = new String(source.ACLType);
        }
        if (source.ACLConsumerIds != null) {
            this.ACLConsumerIds = new String[source.ACLConsumerIds.length];
            for (int i = 0; i < source.ACLConsumerIds.length; i++) {
                this.ACLConsumerIds[i] = new String(source.ACLConsumerIds[i]);
            }
        }
        if (source.ACLConsumerGroupIds != null) {
            this.ACLConsumerGroupIds = new String[source.ACLConsumerGroupIds.length];
            for (int i = 0; i < source.ACLConsumerGroupIds.length; i++) {
                this.ACLConsumerGroupIds[i] = new String(source.ACLConsumerGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ACLType", this.ACLType);
        this.setParamArraySimple(map, prefix + "ACLConsumerIds.", this.ACLConsumerIds);
        this.setParamArraySimple(map, prefix + "ACLConsumerGroupIds.", this.ACLConsumerGroupIds);

    }
}

