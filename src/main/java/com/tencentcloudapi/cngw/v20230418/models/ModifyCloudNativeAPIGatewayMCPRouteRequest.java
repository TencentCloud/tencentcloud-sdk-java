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

public class ModifyCloudNativeAPIGatewayMCPRouteRequest extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>Route ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>MCP Server ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Header 匹配规则</p>
    */
    @SerializedName("HeaderMatch")
    @Expose
    private AIGWHeaderRule [] HeaderMatch;

    /**
    * <p>http method</p>
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * <p>路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

    /**
    * <p>路由优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>Route ID</p> 
     * @return RouteId <p>Route ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>Route ID</p>
     * @param RouteId <p>Route ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>MCP Server ID</p> 
     * @return ServerId <p>MCP Server ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCP Server ID</p>
     * @param ServerId <p>MCP Server ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
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
     * Get <p>Header 匹配规则</p> 
     * @return HeaderMatch <p>Header 匹配规则</p>
     */
    public AIGWHeaderRule [] getHeaderMatch() {
        return this.HeaderMatch;
    }

    /**
     * Set <p>Header 匹配规则</p>
     * @param HeaderMatch <p>Header 匹配规则</p>
     */
    public void setHeaderMatch(AIGWHeaderRule [] HeaderMatch) {
        this.HeaderMatch = HeaderMatch;
    }

    /**
     * Get <p>http method</p> 
     * @return Methods <p>http method</p>
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set <p>http method</p>
     * @param Methods <p>http method</p>
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
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
     * Get <p>匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul> 
     * @return PathMatchType <p>匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set <p>匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     * @param PathMatchType <p>匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
    }

    /**
     * Get <p>路由优先级</p> 
     * @return Priority <p>路由优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>路由优先级</p>
     * @param Priority <p>路由优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public ModifyCloudNativeAPIGatewayMCPRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayMCPRouteRequest(ModifyCloudNativeAPIGatewayMCPRouteRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HeaderMatch != null) {
            this.HeaderMatch = new AIGWHeaderRule[source.HeaderMatch.length];
            for (int i = 0; i < source.HeaderMatch.length; i++) {
                this.HeaderMatch[i] = new AIGWHeaderRule(source.HeaderMatch[i]);
            }
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.PathMatchType != null) {
            this.PathMatchType = new String(source.PathMatchType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "HeaderMatch.", this.HeaderMatch);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "PathMatchType", this.PathMatchType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

