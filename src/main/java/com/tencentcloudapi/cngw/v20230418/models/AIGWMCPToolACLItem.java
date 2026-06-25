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

public class AIGWMCPToolACLItem extends AbstractModel {

    /**
    * <p>MCP工具ID</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>MCP工具名称</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>MCP工具鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
    */
    @SerializedName("ACLType")
    @Expose
    private String ACLType;

    /**
    * <p>关联的消费者ID列表</p>
    */
    @SerializedName("ACLConsumers")
    @Expose
    private AIGWACLSubject [] ACLConsumers;

    /**
    * <p>关联的消费者组ID列表</p>
    */
    @SerializedName("ACLConsumerGroups")
    @Expose
    private AIGWACLSubject [] ACLConsumerGroups;

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
     * Get <p>MCP工具名称</p> 
     * @return ToolName <p>MCP工具名称</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>MCP工具名称</p>
     * @param ToolName <p>MCP工具名称</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>MCP工具鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul> 
     * @return ACLType <p>MCP工具鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     */
    public String getACLType() {
        return this.ACLType;
    }

    /**
     * Set <p>MCP工具鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     * @param ACLType <p>MCP工具鉴权类型</p><p>枚举值：</p><ul><li>None： 继承server鉴权类型</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     */
    public void setACLType(String ACLType) {
        this.ACLType = ACLType;
    }

    /**
     * Get <p>关联的消费者ID列表</p> 
     * @return ACLConsumers <p>关联的消费者ID列表</p>
     */
    public AIGWACLSubject [] getACLConsumers() {
        return this.ACLConsumers;
    }

    /**
     * Set <p>关联的消费者ID列表</p>
     * @param ACLConsumers <p>关联的消费者ID列表</p>
     */
    public void setACLConsumers(AIGWACLSubject [] ACLConsumers) {
        this.ACLConsumers = ACLConsumers;
    }

    /**
     * Get <p>关联的消费者组ID列表</p> 
     * @return ACLConsumerGroups <p>关联的消费者组ID列表</p>
     */
    public AIGWACLSubject [] getACLConsumerGroups() {
        return this.ACLConsumerGroups;
    }

    /**
     * Set <p>关联的消费者组ID列表</p>
     * @param ACLConsumerGroups <p>关联的消费者组ID列表</p>
     */
    public void setACLConsumerGroups(AIGWACLSubject [] ACLConsumerGroups) {
        this.ACLConsumerGroups = ACLConsumerGroups;
    }

    public AIGWMCPToolACLItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPToolACLItem(AIGWMCPToolACLItem source) {
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ACLType != null) {
            this.ACLType = new String(source.ACLType);
        }
        if (source.ACLConsumers != null) {
            this.ACLConsumers = new AIGWACLSubject[source.ACLConsumers.length];
            for (int i = 0; i < source.ACLConsumers.length; i++) {
                this.ACLConsumers[i] = new AIGWACLSubject(source.ACLConsumers[i]);
            }
        }
        if (source.ACLConsumerGroups != null) {
            this.ACLConsumerGroups = new AIGWACLSubject[source.ACLConsumerGroups.length];
            for (int i = 0; i < source.ACLConsumerGroups.length; i++) {
                this.ACLConsumerGroups[i] = new AIGWACLSubject(source.ACLConsumerGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ACLType", this.ACLType);
        this.setParamArrayObj(map, prefix + "ACLConsumers.", this.ACLConsumers);
        this.setParamArrayObj(map, prefix + "ACLConsumerGroups.", this.ACLConsumerGroups);

    }
}

