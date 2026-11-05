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

public class DescribeAIGWCustomGuardrailPolicyListRequest extends AbstractModel {

    /**
    * <p>网关实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>单页数量，范围 1～100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>按策略名称或描述模糊搜索</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>策略过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private CustomGuardrailPolicyFilter [] Filters;

    /**
    * <p>分页偏移量，最小 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>网关实例 ID</p> 
     * @return GatewayId <p>网关实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例 ID</p>
     * @param GatewayId <p>网关实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>单页数量，范围 1～100</p> 
     * @return Limit <p>单页数量，范围 1～100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页数量，范围 1～100</p>
     * @param Limit <p>单页数量，范围 1～100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>按策略名称或描述模糊搜索</p> 
     * @return Keyword <p>按策略名称或描述模糊搜索</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>按策略名称或描述模糊搜索</p>
     * @param Keyword <p>按策略名称或描述模糊搜索</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>策略过滤条件</p> 
     * @return Filters <p>策略过滤条件</p>
     */
    public CustomGuardrailPolicyFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>策略过滤条件</p>
     * @param Filters <p>策略过滤条件</p>
     */
    public void setFilters(CustomGuardrailPolicyFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页偏移量，最小 0</p> 
     * @return Offset <p>分页偏移量，最小 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，最小 0</p>
     * @param Offset <p>分页偏移量，最小 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAIGWCustomGuardrailPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIGWCustomGuardrailPolicyListRequest(DescribeAIGWCustomGuardrailPolicyListRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Filters != null) {
            this.Filters = new CustomGuardrailPolicyFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CustomGuardrailPolicyFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

