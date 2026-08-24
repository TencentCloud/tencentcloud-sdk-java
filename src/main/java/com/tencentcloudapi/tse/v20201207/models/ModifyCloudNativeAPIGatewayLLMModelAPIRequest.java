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

public class ModifyCloudNativeAPIGatewayLLMModelAPIRequest extends AbstractModel {

    /**
    * <p>网关 id。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>模型 API ID，全局唯一标识。</p>
    */
    @SerializedName("ModelAPIId")
    @Expose
    private String ModelAPIId;

    /**
    * <p>修改模型 API 名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * <p>关联的模型服务列表（支持填多个模型服务）</p>
    */
    @SerializedName("ListModelServiceId")
    @Expose
    private String [] ListModelServiceId;

    /**
    * <p>模型服务路由策略（是指如何路由到模型服务）</p>
    */
    @SerializedName("ModelServiceRoute")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRoute ModelServiceRoute;

    /**
    * <p>headers 路由匹配</p>
    */
    @SerializedName("MatchHeaders")
    @Expose
    private AIGWKVMatch [] MatchHeaders;

    /**
    * <p>跨服务 fallback</p>
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
    * <p>标签</p>
    */
    @SerializedName("TagFilter")
    @Expose
    private AIGWTagFilter TagFilter;

    /**
    * <p>模型 API 日志配置</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private AIGWLogConfig LogConfig;

    /**
    * <p>Rerank场景最大文档数配置</p>
    */
    @SerializedName("MaxDocumentsConfig")
    @Expose
    private AIGWRerankMaxDocumentsConfig MaxDocumentsConfig;

    /**
    * <p>敏感词路由配置</p>
    */
    @SerializedName("SensitiveWordRoute")
    @Expose
    private AIGWSensitiveWordRoute SensitiveWordRoute;

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
     * Get <p>模型 API ID，全局唯一标识。</p> 
     * @return ModelAPIId <p>模型 API ID，全局唯一标识。</p>
     */
    public String getModelAPIId() {
        return this.ModelAPIId;
    }

    /**
     * Set <p>模型 API ID，全局唯一标识。</p>
     * @param ModelAPIId <p>模型 API ID，全局唯一标识。</p>
     */
    public void setModelAPIId(String ModelAPIId) {
        this.ModelAPIId = ModelAPIId;
    }

    /**
     * Get <p>修改模型 API 名称</p> 
     * @return Name <p>修改模型 API 名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>修改模型 API 名称</p>
     * @param Name <p>修改模型 API 名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>关联的模型服务列表（支持填多个模型服务）</p> 
     * @return ListModelServiceId <p>关联的模型服务列表（支持填多个模型服务）</p>
     */
    public String [] getListModelServiceId() {
        return this.ListModelServiceId;
    }

    /**
     * Set <p>关联的模型服务列表（支持填多个模型服务）</p>
     * @param ListModelServiceId <p>关联的模型服务列表（支持填多个模型服务）</p>
     */
    public void setListModelServiceId(String [] ListModelServiceId) {
        this.ListModelServiceId = ListModelServiceId;
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
     * Get <p>headers 路由匹配</p> 
     * @return MatchHeaders <p>headers 路由匹配</p>
     */
    public AIGWKVMatch [] getMatchHeaders() {
        return this.MatchHeaders;
    }

    /**
     * Set <p>headers 路由匹配</p>
     * @param MatchHeaders <p>headers 路由匹配</p>
     */
    public void setMatchHeaders(AIGWKVMatch [] MatchHeaders) {
        this.MatchHeaders = MatchHeaders;
    }

    /**
     * Get <p>跨服务 fallback</p> 
     * @return EnableCrossServiceFallback <p>跨服务 fallback</p>
     */
    public Boolean getEnableCrossServiceFallback() {
        return this.EnableCrossServiceFallback;
    }

    /**
     * Set <p>跨服务 fallback</p>
     * @param EnableCrossServiceFallback <p>跨服务 fallback</p>
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

    /**
     * Get <p>标签</p> 
     * @return TagFilter <p>标签</p>
     */
    public AIGWTagFilter getTagFilter() {
        return this.TagFilter;
    }

    /**
     * Set <p>标签</p>
     * @param TagFilter <p>标签</p>
     */
    public void setTagFilter(AIGWTagFilter TagFilter) {
        this.TagFilter = TagFilter;
    }

    /**
     * Get <p>模型 API 日志配置</p> 
     * @return LogConfig <p>模型 API 日志配置</p>
     */
    public AIGWLogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>模型 API 日志配置</p>
     * @param LogConfig <p>模型 API 日志配置</p>
     */
    public void setLogConfig(AIGWLogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>Rerank场景最大文档数配置</p> 
     * @return MaxDocumentsConfig <p>Rerank场景最大文档数配置</p>
     */
    public AIGWRerankMaxDocumentsConfig getMaxDocumentsConfig() {
        return this.MaxDocumentsConfig;
    }

    /**
     * Set <p>Rerank场景最大文档数配置</p>
     * @param MaxDocumentsConfig <p>Rerank场景最大文档数配置</p>
     */
    public void setMaxDocumentsConfig(AIGWRerankMaxDocumentsConfig MaxDocumentsConfig) {
        this.MaxDocumentsConfig = MaxDocumentsConfig;
    }

    /**
     * Get <p>敏感词路由配置</p> 
     * @return SensitiveWordRoute <p>敏感词路由配置</p>
     */
    public AIGWSensitiveWordRoute getSensitiveWordRoute() {
        return this.SensitiveWordRoute;
    }

    /**
     * Set <p>敏感词路由配置</p>
     * @param SensitiveWordRoute <p>敏感词路由配置</p>
     */
    public void setSensitiveWordRoute(AIGWSensitiveWordRoute SensitiveWordRoute) {
        this.SensitiveWordRoute = SensitiveWordRoute;
    }

    public ModifyCloudNativeAPIGatewayLLMModelAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayLLMModelAPIRequest(ModifyCloudNativeAPIGatewayLLMModelAPIRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ModelAPIId != null) {
            this.ModelAPIId = new String(source.ModelAPIId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ListModelServiceId != null) {
            this.ListModelServiceId = new String[source.ListModelServiceId.length];
            for (int i = 0; i < source.ListModelServiceId.length; i++) {
                this.ListModelServiceId[i] = new String(source.ListModelServiceId[i]);
            }
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
        if (source.MaxDocumentsConfig != null) {
            this.MaxDocumentsConfig = new AIGWRerankMaxDocumentsConfig(source.MaxDocumentsConfig);
        }
        if (source.SensitiveWordRoute != null) {
            this.SensitiveWordRoute = new AIGWSensitiveWordRoute(source.SensitiveWordRoute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ModelAPIId", this.ModelAPIId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "ListModelServiceId.", this.ListModelServiceId);
        this.setParamObj(map, prefix + "ModelServiceRoute.", this.ModelServiceRoute);
        this.setParamArrayObj(map, prefix + "MatchHeaders.", this.MatchHeaders);
        this.setParamSimple(map, prefix + "EnableCrossServiceFallback", this.EnableCrossServiceFallback);
        this.setParamObj(map, prefix + "CrossServiceFallbackConfig.", this.CrossServiceFallbackConfig);
        this.setParamObj(map, prefix + "TagFilter.", this.TagFilter);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamObj(map, prefix + "MaxDocumentsConfig.", this.MaxDocumentsConfig);
        this.setParamObj(map, prefix + "SensitiveWordRoute.", this.SensitiveWordRoute);

    }
}

