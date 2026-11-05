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

public class CustomGuardrailResourceRefInput extends AbstractModel {

    /**
    * <p>被审核的业务资源类型：model_api 模型 API；mcp_server MCP Server（当前支持 Streamable HTTP）；agent_api Agent API（当前支持 A2A）。</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>上述类型的管控业务资源 ID，可从 DescribeAIGWCustomGuardrailBindableResources 获取；不是审核引擎 ServiceId，也不是 Kong RouteId。请原样使用接口返回 ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>被审核的业务资源类型：model_api 模型 API；mcp_server MCP Server（当前支持 Streamable HTTP）；agent_api Agent API（当前支持 A2A）。</p> 
     * @return ResourceType <p>被审核的业务资源类型：model_api 模型 API；mcp_server MCP Server（当前支持 Streamable HTTP）；agent_api Agent API（当前支持 A2A）。</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>被审核的业务资源类型：model_api 模型 API；mcp_server MCP Server（当前支持 Streamable HTTP）；agent_api Agent API（当前支持 A2A）。</p>
     * @param ResourceType <p>被审核的业务资源类型：model_api 模型 API；mcp_server MCP Server（当前支持 Streamable HTTP）；agent_api Agent API（当前支持 A2A）。</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>上述类型的管控业务资源 ID，可从 DescribeAIGWCustomGuardrailBindableResources 获取；不是审核引擎 ServiceId，也不是 Kong RouteId。请原样使用接口返回 ID。</p> 
     * @return ResourceId <p>上述类型的管控业务资源 ID，可从 DescribeAIGWCustomGuardrailBindableResources 获取；不是审核引擎 ServiceId，也不是 Kong RouteId。请原样使用接口返回 ID。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>上述类型的管控业务资源 ID，可从 DescribeAIGWCustomGuardrailBindableResources 获取；不是审核引擎 ServiceId，也不是 Kong RouteId。请原样使用接口返回 ID。</p>
     * @param ResourceId <p>上述类型的管控业务资源 ID，可从 DescribeAIGWCustomGuardrailBindableResources 获取；不是审核引擎 ServiceId，也不是 Kong RouteId。请原样使用接口返回 ID。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public CustomGuardrailResourceRefInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailResourceRefInput(CustomGuardrailResourceRefInput source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

