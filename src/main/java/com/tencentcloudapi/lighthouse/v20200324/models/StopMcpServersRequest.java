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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopMcpServersRequest extends AbstractModel {

    /**
    * 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * MCP Server ID列表。可通过DescribeMcpServers接口返回值中的McpServerId获取。最大长度：10
    */
    @SerializedName("McpServerIds")
    @Expose
    private String [] McpServerIds;

    /**
     * Get 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。 
     * @return InstanceId 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     * @param InstanceId 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get MCP Server ID列表。可通过DescribeMcpServers接口返回值中的McpServerId获取。最大长度：10 
     * @return McpServerIds MCP Server ID列表。可通过DescribeMcpServers接口返回值中的McpServerId获取。最大长度：10
     */
    public String [] getMcpServerIds() {
        return this.McpServerIds;
    }

    /**
     * Set MCP Server ID列表。可通过DescribeMcpServers接口返回值中的McpServerId获取。最大长度：10
     * @param McpServerIds MCP Server ID列表。可通过DescribeMcpServers接口返回值中的McpServerId获取。最大长度：10
     */
    public void setMcpServerIds(String [] McpServerIds) {
        this.McpServerIds = McpServerIds;
    }

    public StopMcpServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopMcpServersRequest(StopMcpServersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.McpServerIds != null) {
            this.McpServerIds = new String[source.McpServerIds.length];
            for (int i = 0; i < source.McpServerIds.length; i++) {
                this.McpServerIds[i] = new String(source.McpServerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "McpServerIds.", this.McpServerIds);

    }
}

