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

public class CompareCloudNativeAPIGatewayMCPToolVersionRequest extends AbstractModel {

    /**
    * <p>对比源版本号</p>
    */
    @SerializedName("BaseVersion")
    @Expose
    private String BaseVersion;

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
    * <p>对比目标版本号</p>
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
    * <p>工具 id</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
     * Get <p>对比源版本号</p> 
     * @return BaseVersion <p>对比源版本号</p>
     */
    public String getBaseVersion() {
        return this.BaseVersion;
    }

    /**
     * Set <p>对比源版本号</p>
     * @param BaseVersion <p>对比源版本号</p>
     */
    public void setBaseVersion(String BaseVersion) {
        this.BaseVersion = BaseVersion;
    }

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
     * Get <p>对比目标版本号</p> 
     * @return TargetVersion <p>对比目标版本号</p>
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set <p>对比目标版本号</p>
     * @param TargetVersion <p>对比目标版本号</p>
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
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

    public CompareCloudNativeAPIGatewayMCPToolVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareCloudNativeAPIGatewayMCPToolVersionRequest(CompareCloudNativeAPIGatewayMCPToolVersionRequest source) {
        if (source.BaseVersion != null) {
            this.BaseVersion = new String(source.BaseVersion);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.TargetVersion != null) {
            this.TargetVersion = new String(source.TargetVersion);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaseVersion", this.BaseVersion);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "TargetVersion", this.TargetVersion);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);

    }
}

