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

public class DescribeCloudNativeAPIGatewayLLMModelAPIsRequest extends AbstractModel {

    /**
    * 网关 id。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 返回数量，默认为 10，最大值为 1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，多个过滤条件之间是“与”的关系
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 搜索关键词，模糊匹配 name 和 description
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 通过消费者组Id筛选，UseToBind 为 true 时ConsumerGroupId不为空
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
    * 筛选可被绑定的数据， 比如模型API里面绑定模型服务筛选时，如果设置true, 返回结果只会有可以被绑定的数据。
    */
    @SerializedName("UseToBind")
    @Expose
    private Boolean UseToBind;

    /**
     * Get 网关 id。 
     * @return GatewayId 网关 id。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关 id。
     * @param GatewayId 网关 id。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 返回数量，默认为 10，最大值为 1000。 
     * @return Limit 返回数量，默认为 10，最大值为 1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 10，最大值为 1000。
     * @param Limit 返回数量，默认为 10，最大值为 1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，多个过滤条件之间是“与”的关系 
     * @return Filters 过滤条件，多个过滤条件之间是“与”的关系
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，多个过滤条件之间是“与”的关系
     * @param Filters 过滤条件，多个过滤条件之间是“与”的关系
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 搜索关键词，模糊匹配 name 和 description 
     * @return Keyword 搜索关键词，模糊匹配 name 和 description
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键词，模糊匹配 name 和 description
     * @param Keyword 搜索关键词，模糊匹配 name 和 description
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 通过消费者组Id筛选，UseToBind 为 true 时ConsumerGroupId不为空 
     * @return ConsumerGroupId 通过消费者组Id筛选，UseToBind 为 true 时ConsumerGroupId不为空
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set 通过消费者组Id筛选，UseToBind 为 true 时ConsumerGroupId不为空
     * @param ConsumerGroupId 通过消费者组Id筛选，UseToBind 为 true 时ConsumerGroupId不为空
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
    }

    /**
     * Get 筛选可被绑定的数据， 比如模型API里面绑定模型服务筛选时，如果设置true, 返回结果只会有可以被绑定的数据。 
     * @return UseToBind 筛选可被绑定的数据， 比如模型API里面绑定模型服务筛选时，如果设置true, 返回结果只会有可以被绑定的数据。
     */
    public Boolean getUseToBind() {
        return this.UseToBind;
    }

    /**
     * Set 筛选可被绑定的数据， 比如模型API里面绑定模型服务筛选时，如果设置true, 返回结果只会有可以被绑定的数据。
     * @param UseToBind 筛选可被绑定的数据， 比如模型API里面绑定模型服务筛选时，如果设置true, 返回结果只会有可以被绑定的数据。
     */
    public void setUseToBind(Boolean UseToBind) {
        this.UseToBind = UseToBind;
    }

    public DescribeCloudNativeAPIGatewayLLMModelAPIsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayLLMModelAPIsRequest(DescribeCloudNativeAPIGatewayLLMModelAPIsRequest source) {
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
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ConsumerGroupId != null) {
            this.ConsumerGroupId = new String(source.ConsumerGroupId);
        }
        if (source.UseToBind != null) {
            this.UseToBind = new Boolean(source.UseToBind);
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
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ConsumerGroupId", this.ConsumerGroupId);
        this.setParamSimple(map, prefix + "UseToBind", this.UseToBind);

    }
}

