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

public class CloudNativeAPIGatewayLLMModelAPI extends AbstractModel {

    /**
    * <p>模型 API ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：2-50 字符，支持英文、数字、下划线。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>选择业务场景,xa0 选项：Chat（聊天）。</p>
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
    * <p>路径简化，<br>启用时：客户端请求路径 → 移除Base Path → 后端接收简洁路径<br>禁用时：客户端请求路径 → 完整传递给后端。</p>
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * <p>模型 API 的相关描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型服务Id</p>
    */
    @SerializedName("ModelServiceId")
    @Expose
    private String ModelServiceId;

    /**
    * <p>模型服务名称</p>
    */
    @SerializedName("ModelServiceName")
    @Expose
    private String ModelServiceName;

    /**
    * <p>模型服务路由策略（是指如何路由到模型服务）</p>
    */
    @SerializedName("ModelServiceRoute")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRoute ModelServiceRoute;

    /**
    * <p>无</p>
    */
    @SerializedName("MatchHeaders")
    @Expose
    private AIGWKVMatch [] MatchHeaders;

    /**
    * <p>是否开启跨服务fallback</p>
    */
    @SerializedName("EnableCrossServiceFallback")
    @Expose
    private Boolean EnableCrossServiceFallback;

    /**
    * <p>跨服务fallback配置详情</p>
    */
    @SerializedName("CrossServiceFallbackConfig")
    @Expose
    private AIGWCrossServiceFallbackConfig CrossServiceFallbackConfig;

    /**
    * <p>是否展示模型API</p>
    */
    @SerializedName("DescribeCloudNativeAPIGatewayLLMModelAPI")
    @Expose
    private Boolean DescribeCloudNativeAPIGatewayLLMModelAPI;

    /**
     * Get <p>模型 API ID。</p> 
     * @return Id <p>模型 API ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>模型 API ID。</p>
     * @param Id <p>模型 API ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：2-50 字符，支持英文、数字、下划线。</p> 
     * @return Name <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：2-50 字符，支持英文、数字、下划线。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：2-50 字符，支持英文、数字、下划线。</p>
     * @param Name <p>AI 网关 LLM 模型 API 的唯一标识名称，格式规则：2-50 字符，支持英文、数字、下划线。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>选择业务场景,xa0 选项：Chat（聊天）。</p> 
     * @return SceneType <p>选择业务场景,xa0 选项：Chat（聊天）。</p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>选择业务场景,xa0 选项：Chat（聊天）。</p>
     * @param SceneType <p>选择业务场景,xa0 选项：Chat（聊天）。</p>
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
     * Get <p>路径简化，<br>启用时：客户端请求路径 → 移除Base Path → 后端接收简洁路径<br>禁用时：客户端请求路径 → 完整传递给后端。</p> 
     * @return StripPath <p>路径简化，<br>启用时：客户端请求路径 → 移除Base Path → 后端接收简洁路径<br>禁用时：客户端请求路径 → 完整传递给后端。</p>
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set <p>路径简化，<br>启用时：客户端请求路径 → 移除Base Path → 后端接收简洁路径<br>禁用时：客户端请求路径 → 完整传递给后端。</p>
     * @param StripPath <p>路径简化，<br>启用时：客户端请求路径 → 移除Base Path → 后端接收简洁路径<br>禁用时：客户端请求路径 → 完整传递给后端。</p>
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
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
     * Get <p>模型服务Id</p> 
     * @return ModelServiceId <p>模型服务Id</p>
     */
    public String getModelServiceId() {
        return this.ModelServiceId;
    }

    /**
     * Set <p>模型服务Id</p>
     * @param ModelServiceId <p>模型服务Id</p>
     */
    public void setModelServiceId(String ModelServiceId) {
        this.ModelServiceId = ModelServiceId;
    }

    /**
     * Get <p>模型服务名称</p> 
     * @return ModelServiceName <p>模型服务名称</p>
     */
    public String getModelServiceName() {
        return this.ModelServiceName;
    }

    /**
     * Set <p>模型服务名称</p>
     * @param ModelServiceName <p>模型服务名称</p>
     */
    public void setModelServiceName(String ModelServiceName) {
        this.ModelServiceName = ModelServiceName;
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
     * Get <p>无</p> 
     * @return MatchHeaders <p>无</p>
     */
    public AIGWKVMatch [] getMatchHeaders() {
        return this.MatchHeaders;
    }

    /**
     * Set <p>无</p>
     * @param MatchHeaders <p>无</p>
     */
    public void setMatchHeaders(AIGWKVMatch [] MatchHeaders) {
        this.MatchHeaders = MatchHeaders;
    }

    /**
     * Get <p>是否开启跨服务fallback</p> 
     * @return EnableCrossServiceFallback <p>是否开启跨服务fallback</p>
     */
    public Boolean getEnableCrossServiceFallback() {
        return this.EnableCrossServiceFallback;
    }

    /**
     * Set <p>是否开启跨服务fallback</p>
     * @param EnableCrossServiceFallback <p>是否开启跨服务fallback</p>
     */
    public void setEnableCrossServiceFallback(Boolean EnableCrossServiceFallback) {
        this.EnableCrossServiceFallback = EnableCrossServiceFallback;
    }

    /**
     * Get <p>跨服务fallback配置详情</p> 
     * @return CrossServiceFallbackConfig <p>跨服务fallback配置详情</p>
     */
    public AIGWCrossServiceFallbackConfig getCrossServiceFallbackConfig() {
        return this.CrossServiceFallbackConfig;
    }

    /**
     * Set <p>跨服务fallback配置详情</p>
     * @param CrossServiceFallbackConfig <p>跨服务fallback配置详情</p>
     */
    public void setCrossServiceFallbackConfig(AIGWCrossServiceFallbackConfig CrossServiceFallbackConfig) {
        this.CrossServiceFallbackConfig = CrossServiceFallbackConfig;
    }

    /**
     * Get <p>是否展示模型API</p> 
     * @return DescribeCloudNativeAPIGatewayLLMModelAPI <p>是否展示模型API</p>
     */
    public Boolean getDescribeCloudNativeAPIGatewayLLMModelAPI() {
        return this.DescribeCloudNativeAPIGatewayLLMModelAPI;
    }

    /**
     * Set <p>是否展示模型API</p>
     * @param DescribeCloudNativeAPIGatewayLLMModelAPI <p>是否展示模型API</p>
     */
    public void setDescribeCloudNativeAPIGatewayLLMModelAPI(Boolean DescribeCloudNativeAPIGatewayLLMModelAPI) {
        this.DescribeCloudNativeAPIGatewayLLMModelAPI = DescribeCloudNativeAPIGatewayLLMModelAPI;
    }

    public CloudNativeAPIGatewayLLMModelAPI() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayLLMModelAPI(CloudNativeAPIGatewayLLMModelAPI source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        if (source.RouteList != null) {
            this.RouteList = new DefaultKongRoute[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new DefaultKongRoute(source.RouteList[i]);
            }
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.StripPath != null) {
            this.StripPath = new Boolean(source.StripPath);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModelServiceId != null) {
            this.ModelServiceId = new String(source.ModelServiceId);
        }
        if (source.ModelServiceName != null) {
            this.ModelServiceName = new String(source.ModelServiceName);
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
        if (source.DescribeCloudNativeAPIGatewayLLMModelAPI != null) {
            this.DescribeCloudNativeAPIGatewayLLMModelAPI = new Boolean(source.DescribeCloudNativeAPIGatewayLLMModelAPI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "RequestProtocol", this.RequestProtocol);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "StripPath", this.StripPath);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModelServiceId", this.ModelServiceId);
        this.setParamSimple(map, prefix + "ModelServiceName", this.ModelServiceName);
        this.setParamObj(map, prefix + "ModelServiceRoute.", this.ModelServiceRoute);
        this.setParamArrayObj(map, prefix + "MatchHeaders.", this.MatchHeaders);
        this.setParamSimple(map, prefix + "EnableCrossServiceFallback", this.EnableCrossServiceFallback);
        this.setParamObj(map, prefix + "CrossServiceFallbackConfig.", this.CrossServiceFallbackConfig);
        this.setParamSimple(map, prefix + "DescribeCloudNativeAPIGatewayLLMModelAPI", this.DescribeCloudNativeAPIGatewayLLMModelAPI);

    }
}

