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

public class CreateCloudNativeAPIGatewayMCPToolRequest extends AbstractModel {

    /**
    * <p>网关实例 id</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>MCP Server Id</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>内容类型</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>方法</p><p>枚举值：</p><ul><li>GET： GET</li><li>POST： POST</li><li>PUT： PUT</li><li>DELETE： DELETE</li><li>PATCH： PATCH</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>展示名字</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>服务 id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>输入</p>
    */
    @SerializedName("InputParams")
    @Expose
    private CNAPIGwMCPToolParam [] InputParams;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get <p>MCP Server Id</p> 
     * @return ServerId <p>MCP Server Id</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCP Server Id</p>
     * @param ServerId <p>MCP Server Id</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>内容类型</p> 
     * @return ContentType <p>内容类型</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>内容类型</p>
     * @param ContentType <p>内容类型</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>名字</p> 
     * @return Name <p>名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字</p>
     * @param Name <p>名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>方法</p><p>枚举值：</p><ul><li>GET： GET</li><li>POST： POST</li><li>PUT： PUT</li><li>DELETE： DELETE</li><li>PATCH： PATCH</li></ul> 
     * @return Method <p>方法</p><p>枚举值：</p><ul><li>GET： GET</li><li>POST： POST</li><li>PUT： PUT</li><li>DELETE： DELETE</li><li>PATCH： PATCH</li></ul>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>方法</p><p>枚举值：</p><ul><li>GET： GET</li><li>POST： POST</li><li>PUT： PUT</li><li>DELETE： DELETE</li><li>PATCH： PATCH</li></ul>
     * @param Method <p>方法</p><p>枚举值：</p><ul><li>GET： GET</li><li>POST： POST</li><li>PUT： PUT</li><li>DELETE： DELETE</li><li>PATCH： PATCH</li></ul>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>路径</p> 
     * @return Path <p>路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>路径</p>
     * @param Path <p>路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>展示名字</p> 
     * @return DisplayName <p>展示名字</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>展示名字</p>
     * @param DisplayName <p>展示名字</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>服务 id</p> 
     * @return ServiceId <p>服务 id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务 id</p>
     * @param ServiceId <p>服务 id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>输入</p> 
     * @return InputParams <p>输入</p>
     */
    public CNAPIGwMCPToolParam [] getInputParams() {
        return this.InputParams;
    }

    /**
     * Set <p>输入</p>
     * @param InputParams <p>输入</p>
     */
    public void setInputParams(CNAPIGwMCPToolParam [] InputParams) {
        this.InputParams = InputParams;
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

    public CreateCloudNativeAPIGatewayMCPToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayMCPToolRequest(CreateCloudNativeAPIGatewayMCPToolRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.InputParams != null) {
            this.InputParams = new CNAPIGwMCPToolParam[source.InputParams.length];
            for (int i = 0; i < source.InputParams.length; i++) {
                this.InputParams[i] = new CNAPIGwMCPToolParam(source.InputParams[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArrayObj(map, prefix + "InputParams.", this.InputParams);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

