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

public class DescribeCloudNativeAPIGatewayLLMModelServicesRequest extends AbstractModel {

    /**
    * <p>网关 id。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>返回数量，默认为 10，最大值为 1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件，多个过滤条件之间是“与”的关系，支持 Name</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>通过模型 API 筛选模型服务</p>
    */
    @SerializedName("ModelAPIId")
    @Expose
    private String ModelAPIId;

    /**
    * <p>通过密匙查询绑定的模型服务</p>
    */
    @SerializedName("SecretKeyId")
    @Expose
    private String SecretKeyId;

    /**
    * <p>搜索关键词，模糊匹配 name 和 description</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

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
     * Get <p>返回数量，默认为 10，最大值为 1000。</p> 
     * @return Limit <p>返回数量，默认为 10，最大值为 1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为 10，最大值为 1000。</p>
     * @param Limit <p>返回数量，默认为 10，最大值为 1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为 0。</p> 
     * @return Offset <p>偏移量，默认为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为 0。</p>
     * @param Offset <p>偏移量，默认为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件，多个过滤条件之间是“与”的关系，支持 Name</p> 
     * @return Filters <p>过滤条件，多个过滤条件之间是“与”的关系，支持 Name</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，多个过滤条件之间是“与”的关系，支持 Name</p>
     * @param Filters <p>过滤条件，多个过滤条件之间是“与”的关系，支持 Name</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>通过模型 API 筛选模型服务</p> 
     * @return ModelAPIId <p>通过模型 API 筛选模型服务</p>
     */
    public String getModelAPIId() {
        return this.ModelAPIId;
    }

    /**
     * Set <p>通过模型 API 筛选模型服务</p>
     * @param ModelAPIId <p>通过模型 API 筛选模型服务</p>
     */
    public void setModelAPIId(String ModelAPIId) {
        this.ModelAPIId = ModelAPIId;
    }

    /**
     * Get <p>通过密匙查询绑定的模型服务</p> 
     * @return SecretKeyId <p>通过密匙查询绑定的模型服务</p>
     */
    public String getSecretKeyId() {
        return this.SecretKeyId;
    }

    /**
     * Set <p>通过密匙查询绑定的模型服务</p>
     * @param SecretKeyId <p>通过密匙查询绑定的模型服务</p>
     */
    public void setSecretKeyId(String SecretKeyId) {
        this.SecretKeyId = SecretKeyId;
    }

    /**
     * Get <p>搜索关键词，模糊匹配 name 和 description</p> 
     * @return Keyword <p>搜索关键词，模糊匹配 name 和 description</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索关键词，模糊匹配 name 和 description</p>
     * @param Keyword <p>搜索关键词，模糊匹配 name 和 description</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeCloudNativeAPIGatewayLLMModelServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayLLMModelServicesRequest(DescribeCloudNativeAPIGatewayLLMModelServicesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ModelAPIId != null) {
            this.ModelAPIId = new String(source.ModelAPIId);
        }
        if (source.SecretKeyId != null) {
            this.SecretKeyId = new String(source.SecretKeyId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ModelAPIId", this.ModelAPIId);
        this.setParamSimple(map, prefix + "SecretKeyId", this.SecretKeyId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

