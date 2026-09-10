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

public class DeleteCloudNativeAPIGatewayAIServiceSourceRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>服务来源id</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>服务来源类型</p><p>枚举值：</p><ul><li>Registry： 普通注册中心</li><li>MCPRegistry： MCP注册中心</li><li>DNS： 域名服务</li></ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get <p>实例 ID</p> 
     * @return GatewayId <p>实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param GatewayId <p>实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>服务来源id</p> 
     * @return SourceId <p>服务来源id</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>服务来源id</p>
     * @param SourceId <p>服务来源id</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>服务来源类型</p><p>枚举值：</p><ul><li>Registry： 普通注册中心</li><li>MCPRegistry： MCP注册中心</li><li>DNS： 域名服务</li></ul> 
     * @return SourceType <p>服务来源类型</p><p>枚举值：</p><ul><li>Registry： 普通注册中心</li><li>MCPRegistry： MCP注册中心</li><li>DNS： 域名服务</li></ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>服务来源类型</p><p>枚举值：</p><ul><li>Registry： 普通注册中心</li><li>MCPRegistry： MCP注册中心</li><li>DNS： 域名服务</li></ul>
     * @param SourceType <p>服务来源类型</p><p>枚举值：</p><ul><li>Registry： 普通注册中心</li><li>MCPRegistry： MCP注册中心</li><li>DNS： 域名服务</li></ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public DeleteCloudNativeAPIGatewayAIServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayAIServiceSourceRequest(DeleteCloudNativeAPIGatewayAIServiceSourceRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

