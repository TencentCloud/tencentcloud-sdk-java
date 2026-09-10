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

public class CheckCloudNativeAPIGatewayMCPRouteMatchRequest extends AbstractModel {

    /**
    * <p>网关 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>MCP Server ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>Modify时用于排除自身的Route ID</p>
    */
    @SerializedName("ExcludeRouteId")
    @Expose
    private String ExcludeRouteId;

    /**
    * <p>Head匹配规则</p>
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
    * <p>path的匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

    /**
     * Get <p>网关 ID</p> 
     * @return GatewayId <p>网关 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关 ID</p>
     * @param GatewayId <p>网关 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
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
     * Get <p>Modify时用于排除自身的Route ID</p> 
     * @return ExcludeRouteId <p>Modify时用于排除自身的Route ID</p>
     */
    public String getExcludeRouteId() {
        return this.ExcludeRouteId;
    }

    /**
     * Set <p>Modify时用于排除自身的Route ID</p>
     * @param ExcludeRouteId <p>Modify时用于排除自身的Route ID</p>
     */
    public void setExcludeRouteId(String ExcludeRouteId) {
        this.ExcludeRouteId = ExcludeRouteId;
    }

    /**
     * Get <p>Head匹配规则</p> 
     * @return HeaderMatch <p>Head匹配规则</p>
     */
    public AIGWHeaderRule [] getHeaderMatch() {
        return this.HeaderMatch;
    }

    /**
     * Set <p>Head匹配规则</p>
     * @param HeaderMatch <p>Head匹配规则</p>
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
     * Get <p>path的匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul> 
     * @return PathMatchType <p>path的匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set <p>path的匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     * @param PathMatchType <p>path的匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
    }

    public CheckCloudNativeAPIGatewayMCPRouteMatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckCloudNativeAPIGatewayMCPRouteMatchRequest(CheckCloudNativeAPIGatewayMCPRouteMatchRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.ExcludeRouteId != null) {
            this.ExcludeRouteId = new String(source.ExcludeRouteId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "ExcludeRouteId", this.ExcludeRouteId);
        this.setParamArrayObj(map, prefix + "HeaderMatch.", this.HeaderMatch);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "PathMatchType", this.PathMatchType);

    }
}

