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
    * <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>选择业务场景,  选项：Chat（聊天）。</p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>业务场景对应的请求协议，选项：OpenAI（目前只支持 OpenAI）。</p>
    */
    @SerializedName("RequestProtocol")
    @Expose
    private String RequestProtocol;

    /**
    * <p>初始化关联的模型服务列表。</p>
    */
    @SerializedName("ListModelServiceId")
    @Expose
    private String [] ListModelServiceId;

    /**
    * <p>路由列表</p>
    */
    @SerializedName("RouteList")
    @Expose
    private DefaultKongRoute [] RouteList;

    /**
    * <p>为API设置统一的前缀，格式：以/开头，支持字母、数字、短横线。</p>
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * <p>模型 API 的相关描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型服务路由策略（是指如何路由到模型服务）</p>
    */
    @SerializedName("ModelServiceRoute")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRoute ModelServiceRoute;

    /**
    * <p>路由 Header 匹配规则</p>
    */
    @SerializedName("MatchHeaders")
    @Expose
    private AIGWKVMatch [] MatchHeaders;

    /**
    * <p>跨服务 fallback 开关</p>
    */
    @SerializedName("EnableCrossServiceFallback")
    @Expose
    private Boolean EnableCrossServiceFallback;

    /**
    * <p>跨服务 fallback 配置</p>
    */
    @SerializedName("CrossServiceFallbackConfig")
    @Expose
    private AIGWCrossServiceFallbackConfig CrossServiceFallbackConfig;

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
     * Get <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p> 
     * @return Name <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
     * @param Name <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>选择业务场景,  选项：Chat（聊天）。</p> 
     * @return SceneType <p>选择业务场景,  选项：Chat（聊天）。</p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>选择业务场景,  选项：Chat（聊天）。</p>
     * @param SceneType <p>选择业务场景,  选项：Chat（聊天）。</p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>业务场景对应的请求协议，选项：OpenAI（目前只支持 OpenAI）。</p> 
     * @return RequestProtocol <p>业务场景对应的请求协议，选项：OpenAI（目前只支持 OpenAI）。</p>
     */
    public String getRequestProtocol() {
        return this.RequestProtocol;
    }

    /**
     * Set <p>业务场景对应的请求协议，选项：OpenAI（目前只支持 OpenAI）。</p>
     * @param RequestProtocol <p>业务场景对应的请求协议，选项：OpenAI（目前只支持 OpenAI）。</p>
     */
    public void setRequestProtocol(String RequestProtocol) {
        this.RequestProtocol = RequestProtocol;
    }

    /**
     * Get <p>初始化关联的模型服务列表。</p> 
     * @return ListModelServiceId <p>初始化关联的模型服务列表。</p>
     */
    public String [] getListModelServiceId() {
        return this.ListModelServiceId;
    }

    /**
     * Set <p>初始化关联的模型服务列表。</p>
     * @param ListModelServiceId <p>初始化关联的模型服务列表。</p>
     */
    public void setListModelServiceId(String [] ListModelServiceId) {
        this.ListModelServiceId = ListModelServiceId;
    }

    /**
     * Get <p>路由列表</p> 
     * @return RouteList <p>路由列表</p>
     */
    public DefaultKongRoute [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set <p>路由列表</p>
     * @param RouteList <p>路由列表</p>
     */
    public void setRouteList(DefaultKongRoute [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get <p>为API设置统一的前缀，格式：以/开头，支持字母、数字、短横线。</p> 
     * @return BasePath <p>为API设置统一的前缀，格式：以/开头，支持字母、数字、短横线。</p>
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set <p>为API设置统一的前缀，格式：以/开头，支持字母、数字、短横线。</p>
     * @param BasePath <p>为API设置统一的前缀，格式：以/开头，支持字母、数字、短横线。</p>
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get <p>模型 API 的相关描述。</p> 
     * @return Description <p>模型 API 的相关描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型 API 的相关描述。</p>
     * @param Description <p>模型 API 的相关描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模型服务路由策略（是指如何路由到模型服务）</p> 
     * @return ModelServiceRoute <p>模型服务路由策略（是指如何路由到模型服务）</p>
     */
    public CloudNativeAPIGatewayLLMModelServiceRoute getModelServiceRoute() {
        return this.ModelServiceRoute;
    }

    /**
     * Set <p>模型服务路由策略（是指如何路由到模型服务）</p>
     * @param ModelServiceRoute <p>模型服务路由策略（是指如何路由到模型服务）</p>
     */
    public void setModelServiceRoute(CloudNativeAPIGatewayLLMModelServiceRoute ModelServiceRoute) {
        this.ModelServiceRoute = ModelServiceRoute;
    }

    /**
     * Get <p>路由 Header 匹配规则</p> 
     * @return MatchHeaders <p>路由 Header 匹配规则</p>
     */
    public AIGWKVMatch [] getMatchHeaders() {
        return this.MatchHeaders;
    }

    /**
     * Set <p>路由 Header 匹配规则</p>
     * @param MatchHeaders <p>路由 Header 匹配规则</p>
     */
    public void setMatchHeaders(AIGWKVMatch [] MatchHeaders) {
        this.MatchHeaders = MatchHeaders;
    }

    /**
     * Get <p>跨服务 fallback 开关</p> 
     * @return EnableCrossServiceFallback <p>跨服务 fallback 开关</p>
     */
    public Boolean getEnableCrossServiceFallback() {
        return this.EnableCrossServiceFallback;
    }

    /**
     * Set <p>跨服务 fallback 开关</p>
     * @param EnableCrossServiceFallback <p>跨服务 fallback 开关</p>
     */
    public void setEnableCrossServiceFallback(Boolean EnableCrossServiceFallback) {
        this.EnableCrossServiceFallback = EnableCrossServiceFallback;
    }

    /**
     * Get <p>跨服务 fallback 配置</p> 
     * @return CrossServiceFallbackConfig <p>跨服务 fallback 配置</p>
     */
    public AIGWCrossServiceFallbackConfig getCrossServiceFallbackConfig() {
        return this.CrossServiceFallbackConfig;
    }

    /**
     * Set <p>跨服务 fallback 配置</p>
     * @param CrossServiceFallbackConfig <p>跨服务 fallback 配置</p>
     */
    public void setCrossServiceFallbackConfig(AIGWCrossServiceFallbackConfig CrossServiceFallbackConfig) {
        this.CrossServiceFallbackConfig = CrossServiceFallbackConfig;
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

    }
}

