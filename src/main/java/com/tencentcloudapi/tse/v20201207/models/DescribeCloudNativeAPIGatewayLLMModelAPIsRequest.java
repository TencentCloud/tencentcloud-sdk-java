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
    * <p>网关 id。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>每页条数，范围 [1, 1000]，默认 10。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>起始位置，从 0 开始。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件。当前未启用具体字段。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>模糊匹配模型 API 名称。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>消费者组 ID（以 cg- 开头），与 UseToBind 搭配使用。</p>
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
    * <p>是否用于绑定场景。true 时仅返回可被绑定到指定消费者组的模型 API。</p>
    */
    @SerializedName("UseToBind")
    @Expose
    private Boolean UseToBind;

    /**
    * <p>消费者ID</p>
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

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
     * Get <p>每页条数，范围 [1, 1000]，默认 10。</p> 
     * @return Limit <p>每页条数，范围 [1, 1000]，默认 10。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数，范围 [1, 1000]，默认 10。</p>
     * @param Limit <p>每页条数，范围 [1, 1000]，默认 10。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>起始位置，从 0 开始。</p> 
     * @return Offset <p>起始位置，从 0 开始。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始位置，从 0 开始。</p>
     * @param Offset <p>起始位置，从 0 开始。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件。当前未启用具体字段。</p> 
     * @return Filters <p>过滤条件。当前未启用具体字段。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。当前未启用具体字段。</p>
     * @param Filters <p>过滤条件。当前未启用具体字段。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>模糊匹配模型 API 名称。</p> 
     * @return Keyword <p>模糊匹配模型 API 名称。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>模糊匹配模型 API 名称。</p>
     * @param Keyword <p>模糊匹配模型 API 名称。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>消费者组 ID（以 cg- 开头），与 UseToBind 搭配使用。</p> 
     * @return ConsumerGroupId <p>消费者组 ID（以 cg- 开头），与 UseToBind 搭配使用。</p>
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set <p>消费者组 ID（以 cg- 开头），与 UseToBind 搭配使用。</p>
     * @param ConsumerGroupId <p>消费者组 ID（以 cg- 开头），与 UseToBind 搭配使用。</p>
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
    }

    /**
     * Get <p>是否用于绑定场景。true 时仅返回可被绑定到指定消费者组的模型 API。</p> 
     * @return UseToBind <p>是否用于绑定场景。true 时仅返回可被绑定到指定消费者组的模型 API。</p>
     */
    public Boolean getUseToBind() {
        return this.UseToBind;
    }

    /**
     * Set <p>是否用于绑定场景。true 时仅返回可被绑定到指定消费者组的模型 API。</p>
     * @param UseToBind <p>是否用于绑定场景。true 时仅返回可被绑定到指定消费者组的模型 API。</p>
     */
    public void setUseToBind(Boolean UseToBind) {
        this.UseToBind = UseToBind;
    }

    /**
     * Get <p>消费者ID</p> 
     * @return ConsumerId <p>消费者ID</p>
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set <p>消费者ID</p>
     * @param ConsumerId <p>消费者ID</p>
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
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
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
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
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);

    }
}

