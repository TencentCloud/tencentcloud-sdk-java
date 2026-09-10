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

public class ModifyCloudNativeAPIGatewayAIServiceSourceRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>服务来源名字</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>服务来源类型</p><p>枚举值：</p><ul><li>Registry： 普通注册中心</li><li>MCPRegistry： MCP注册中心</li><li>DNS： 域名服务</li></ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>服务来源id</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>来源信息</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private CNAPIGwAIServiceSourceInfo SourceInfo;

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
     * Get <p>服务来源名字</p> 
     * @return SourceName <p>服务来源名字</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>服务来源名字</p>
     * @param SourceName <p>服务来源名字</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
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
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>来源信息</p> 
     * @return SourceInfo <p>来源信息</p>
     */
    public CNAPIGwAIServiceSourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>来源信息</p>
     * @param SourceInfo <p>来源信息</p>
     */
    public void setSourceInfo(CNAPIGwAIServiceSourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public ModifyCloudNativeAPIGatewayAIServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayAIServiceSourceRequest(ModifyCloudNativeAPIGatewayAIServiceSourceRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new CNAPIGwAIServiceSourceInfo(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

