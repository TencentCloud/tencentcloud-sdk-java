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

public class CreateCloudNativeAPIGatewayLLMModelAPIRequest extends AbstractModel {

    /**
    * <p>网关 id。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>模型 API 名称，最长 60 字符。同一网关下唯一。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>业务场景。</p><p>枚举值：</p><ul><li>Chat：聊天</li><li>Image：图像（需要网关版本 ≥ 3.9.3）</li></ul>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>请求协议（小写）。当前仅支持：</p><ul><li>openai</li></ul>
    */
    @SerializedName("RequestProtocol")
    @Expose
    private String RequestProtocol;

    /**
    * <p>关联的模型服务 ID 列表，长度 1-10。</p><p>注：字段名建议改为 ModelServiceIds，当前保留用于兼容。</p>
    */
    @SerializedName("ListModelServiceId")
    @Expose
    private String [] ListModelServiceId;

    /**
    * <p>路由列表，至少 1 条。每条包含 Methods/Paths/Hosts 等 Kong 路由属性。</p>
    */
    @SerializedName("RouteList")
    @Expose
    private DefaultKongRoute [] RouteList;

    /**
    * <p>统一前缀路径（可选）。例如 /v1/openai。</p>
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * <p>模型 API 描述。最长 200 字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>多模型服务路由策略。ListModelServiceId 多于 1 项时必填。</p>
    */
    @SerializedName("ModelServiceRoute")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRoute ModelServiceRoute;

    /**
    * <p>Header 路由匹配规则。当前仅支持 Operator=exact。</p>
    */
    @SerializedName("MatchHeaders")
    @Expose
    private AIGWKVMatch [] MatchHeaders;

    /**
    * <p>是否启用跨服务 Fallback。开启后需提供 CrossServiceFallbackConfig。</p>
    */
    @SerializedName("EnableCrossServiceFallback")
    @Expose
    private Boolean EnableCrossServiceFallback;

    /**
    * <p>跨服务 Fallback 配置。EnableCrossServiceFallback=true 时必填。</p>
    */
    @SerializedName("CrossServiceFallbackConfig")
    @Expose
    private AIGWCrossServiceFallbackConfig CrossServiceFallbackConfig;

    /**
    * <p>标签过滤策略。需要网关版本 ≥ 3.9.4。</p>
    */
    @SerializedName("TagFilter")
    @Expose
    private AIGWTagFilter TagFilter;

    /**
    * <p>日志输出配置（请求/响应 payload 落 LLM Log）。需要网关版本 ≥ 3.9.4。</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private AIGWLogConfig LogConfig;

    /**
     * Get <p>网关 id。</p> 
     * @return GatewayId <p>网关 id。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关 id。</p>
     * @param GatewayId <p>网关 id。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>模型 API 名称，最长 60 字符。同一网关下唯一。</p> 
     * @return Name <p>模型 API 名称，最长 60 字符。同一网关下唯一。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型 API 名称，最长 60 字符。同一网关下唯一。</p>
     * @param Name <p>模型 API 名称，最长 60 字符。同一网关下唯一。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>业务场景。</p><p>枚举值：</p><ul><li>Chat：聊天</li><li>Image：图像（需要网关版本 ≥ 3.9.3）</li></ul> 
     * @return SceneType <p>业务场景。</p><p>枚举值：</p><ul><li>Chat：聊天</li><li>Image：图像（需要网关版本 ≥ 3.9.3）</li></ul>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>业务场景。</p><p>枚举值：</p><ul><li>Chat：聊天</li><li>Image：图像（需要网关版本 ≥ 3.9.3）</li></ul>
     * @param SceneType <p>业务场景。</p><p>枚举值：</p><ul><li>Chat：聊天</li><li>Image：图像（需要网关版本 ≥ 3.9.3）</li></ul>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>请求协议（小写）。当前仅支持：</p><ul><li>openai</li></ul> 
     * @return RequestProtocol <p>请求协议（小写）。当前仅支持：</p><ul><li>openai</li></ul>
     */
    public String getRequestProtocol() {
        return this.RequestProtocol;
    }

    /**
     * Set <p>请求协议（小写）。当前仅支持：</p><ul><li>openai</li></ul>
     * @param RequestProtocol <p>请求协议（小写）。当前仅支持：</p><ul><li>openai</li></ul>
     */
    public void setRequestProtocol(String RequestProtocol) {
        this.RequestProtocol = RequestProtocol;
    }

    /**
     * Get <p>关联的模型服务 ID 列表，长度 1-10。</p><p>注：字段名建议改为 ModelServiceIds，当前保留用于兼容。</p> 
     * @return ListModelServiceId <p>关联的模型服务 ID 列表，长度 1-10。</p><p>注：字段名建议改为 ModelServiceIds，当前保留用于兼容。</p>
     */
    public String [] getListModelServiceId() {
        return this.ListModelServiceId;
    }

    /**
     * Set <p>关联的模型服务 ID 列表，长度 1-10。</p><p>注：字段名建议改为 ModelServiceIds，当前保留用于兼容。</p>
     * @param ListModelServiceId <p>关联的模型服务 ID 列表，长度 1-10。</p><p>注：字段名建议改为 ModelServiceIds，当前保留用于兼容。</p>
     */
    public void setListModelServiceId(String [] ListModelServiceId) {
        this.ListModelServiceId = ListModelServiceId;
    }

    /**
     * Get <p>路由列表，至少 1 条。每条包含 Methods/Paths/Hosts 等 Kong 路由属性。</p> 
     * @return RouteList <p>路由列表，至少 1 条。每条包含 Methods/Paths/Hosts 等 Kong 路由属性。</p>
     */
    public DefaultKongRoute [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set <p>路由列表，至少 1 条。每条包含 Methods/Paths/Hosts 等 Kong 路由属性。</p>
     * @param RouteList <p>路由列表，至少 1 条。每条包含 Methods/Paths/Hosts 等 Kong 路由属性。</p>
     */
    public void setRouteList(DefaultKongRoute [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get <p>统一前缀路径（可选）。例如 /v1/openai。</p> 
     * @return BasePath <p>统一前缀路径（可选）。例如 /v1/openai。</p>
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set <p>统一前缀路径（可选）。例如 /v1/openai。</p>
     * @param BasePath <p>统一前缀路径（可选）。例如 /v1/openai。</p>
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get <p>模型 API 描述。最长 200 字符。</p> 
     * @return Description <p>模型 API 描述。最长 200 字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型 API 描述。最长 200 字符。</p>
     * @param Description <p>模型 API 描述。最长 200 字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>多模型服务路由策略。ListModelServiceId 多于 1 项时必填。</p> 
     * @return ModelServiceRoute <p>多模型服务路由策略。ListModelServiceId 多于 1 项时必填。</p>
     */
    public CloudNativeAPIGatewayLLMModelServiceRoute getModelServiceRoute() {
        return this.ModelServiceRoute;
    }

    /**
     * Set <p>多模型服务路由策略。ListModelServiceId 多于 1 项时必填。</p>
     * @param ModelServiceRoute <p>多模型服务路由策略。ListModelServiceId 多于 1 项时必填。</p>
     */
    public void setModelServiceRoute(CloudNativeAPIGatewayLLMModelServiceRoute ModelServiceRoute) {
        this.ModelServiceRoute = ModelServiceRoute;
    }

    /**
     * Get <p>Header 路由匹配规则。当前仅支持 Operator=exact。</p> 
     * @return MatchHeaders <p>Header 路由匹配规则。当前仅支持 Operator=exact。</p>
     */
    public AIGWKVMatch [] getMatchHeaders() {
        return this.MatchHeaders;
    }

    /**
     * Set <p>Header 路由匹配规则。当前仅支持 Operator=exact。</p>
     * @param MatchHeaders <p>Header 路由匹配规则。当前仅支持 Operator=exact。</p>
     */
    public void setMatchHeaders(AIGWKVMatch [] MatchHeaders) {
        this.MatchHeaders = MatchHeaders;
    }

    /**
     * Get <p>是否启用跨服务 Fallback。开启后需提供 CrossServiceFallbackConfig。</p> 
     * @return EnableCrossServiceFallback <p>是否启用跨服务 Fallback。开启后需提供 CrossServiceFallbackConfig。</p>
     */
    public Boolean getEnableCrossServiceFallback() {
        return this.EnableCrossServiceFallback;
    }

    /**
     * Set <p>是否启用跨服务 Fallback。开启后需提供 CrossServiceFallbackConfig。</p>
     * @param EnableCrossServiceFallback <p>是否启用跨服务 Fallback。开启后需提供 CrossServiceFallbackConfig。</p>
     */
    public void setEnableCrossServiceFallback(Boolean EnableCrossServiceFallback) {
        this.EnableCrossServiceFallback = EnableCrossServiceFallback;
    }

    /**
     * Get <p>跨服务 Fallback 配置。EnableCrossServiceFallback=true 时必填。</p> 
     * @return CrossServiceFallbackConfig <p>跨服务 Fallback 配置。EnableCrossServiceFallback=true 时必填。</p>
     */
    public AIGWCrossServiceFallbackConfig getCrossServiceFallbackConfig() {
        return this.CrossServiceFallbackConfig;
    }

    /**
     * Set <p>跨服务 Fallback 配置。EnableCrossServiceFallback=true 时必填。</p>
     * @param CrossServiceFallbackConfig <p>跨服务 Fallback 配置。EnableCrossServiceFallback=true 时必填。</p>
     */
    public void setCrossServiceFallbackConfig(AIGWCrossServiceFallbackConfig CrossServiceFallbackConfig) {
        this.CrossServiceFallbackConfig = CrossServiceFallbackConfig;
    }

    /**
     * Get <p>标签过滤策略。需要网关版本 ≥ 3.9.4。</p> 
     * @return TagFilter <p>标签过滤策略。需要网关版本 ≥ 3.9.4。</p>
     */
    public AIGWTagFilter getTagFilter() {
        return this.TagFilter;
    }

    /**
     * Set <p>标签过滤策略。需要网关版本 ≥ 3.9.4。</p>
     * @param TagFilter <p>标签过滤策略。需要网关版本 ≥ 3.9.4。</p>
     */
    public void setTagFilter(AIGWTagFilter TagFilter) {
        this.TagFilter = TagFilter;
    }

    /**
     * Get <p>日志输出配置（请求/响应 payload 落 LLM Log）。需要网关版本 ≥ 3.9.4。</p> 
     * @return LogConfig <p>日志输出配置（请求/响应 payload 落 LLM Log）。需要网关版本 ≥ 3.9.4。</p>
     */
    public AIGWLogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>日志输出配置（请求/响应 payload 落 LLM Log）。需要网关版本 ≥ 3.9.4。</p>
     * @param LogConfig <p>日志输出配置（请求/响应 payload 落 LLM Log）。需要网关版本 ≥ 3.9.4。</p>
     */
    public void setLogConfig(AIGWLogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    public CreateCloudNativeAPIGatewayLLMModelAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayLLMModelAPIRequest(CreateCloudNativeAPIGatewayLLMModelAPIRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.RequestProtocol != null) {
            this.RequestProtocol = new String(source.RequestProtocol);
        }
        if (source.ListModelServiceId != null) {
            this.ListModelServiceId = new String[source.ListModelServiceId.length];
            for (int i = 0; i < source.ListModelServiceId.length; i++) {
                this.ListModelServiceId[i] = new String(source.ListModelServiceId[i]);
            }
        }
        if (source.RouteList != null) {
            this.RouteList = new DefaultKongRoute[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new DefaultKongRoute(source.RouteList[i]);
            }
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModelServiceRoute != null) {
            this.ModelServiceRoute = new CloudNativeAPIGatewayLLMModelServiceRoute(source.ModelServiceRoute);
        }
        if (source.MatchHeaders != null) {
            this.MatchHeaders = new AIGWKVMatch[source.MatchHeaders.length];
            for (int i = 0; i < source.MatchHeaders.length; i++) {
                this.MatchHeaders[i] = new AIGWKVMatch(source.MatchHeaders[i]);
            }
        }
        if (source.EnableCrossServiceFallback != null) {
            this.EnableCrossServiceFallback = new Boolean(source.EnableCrossServiceFallback);
        }
        if (source.CrossServiceFallbackConfig != null) {
            this.CrossServiceFallbackConfig = new AIGWCrossServiceFallbackConfig(source.CrossServiceFallbackConfig);
        }
        if (source.TagFilter != null) {
            this.TagFilter = new AIGWTagFilter(source.TagFilter);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new AIGWLogConfig(source.LogConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "RequestProtocol", this.RequestProtocol);
        this.setParamArraySimple(map, prefix + "ListModelServiceId.", this.ListModelServiceId);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "ModelServiceRoute.", this.ModelServiceRoute);
        this.setParamArrayObj(map, prefix + "MatchHeaders.", this.MatchHeaders);
        this.setParamSimple(map, prefix + "EnableCrossServiceFallback", this.EnableCrossServiceFallback);
        this.setParamObj(map, prefix + "CrossServiceFallbackConfig.", this.CrossServiceFallbackConfig);
        this.setParamObj(map, prefix + "TagFilter.", this.TagFilter);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);

    }
}

