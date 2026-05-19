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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesRequest extends AbstractModel {

    /**
    * <p>集群 ID（该参数必传，例如 cynosdbmysql-2u2mh111）。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>返回数量，默认为 20，最大值为 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>记录偏移量，默认值为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段，取值范围：</p><li> CREATETIME：创建时间</li><li> PERIODENDTIME：过期时间</li>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序类型，取值范围：</p><li> ASC：升序排序 </li><li> DESC：降序排序 </li>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * <p>搜索条件，若存在多个 Filter 时，Filter 间的关系为逻辑与（AND）关系。<br>说明：此参数当前仅支持 Status 和 ProxyGroupId 两种过滤条件。</p>
    */
    @SerializedName("Filters")
    @Expose
    private QueryParamFilter [] Filters;

    /**
     * Get <p>集群 ID（该参数必传，例如 cynosdbmysql-2u2mh111）。</p> 
     * @return ClusterId <p>集群 ID（该参数必传，例如 cynosdbmysql-2u2mh111）。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID（该参数必传，例如 cynosdbmysql-2u2mh111）。</p>
     * @param ClusterId <p>集群 ID（该参数必传，例如 cynosdbmysql-2u2mh111）。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>返回数量，默认为 20，最大值为 100</p> 
     * @return Limit <p>返回数量，默认为 20，最大值为 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为 20，最大值为 100</p>
     * @param Limit <p>返回数量，默认为 20，最大值为 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>记录偏移量，默认值为0</p> 
     * @return Offset <p>记录偏移量，默认值为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>记录偏移量，默认值为0</p>
     * @param Offset <p>记录偏移量，默认值为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段，取值范围：</p><li> CREATETIME：创建时间</li><li> PERIODENDTIME：过期时间</li> 
     * @return OrderBy <p>排序字段，取值范围：</p><li> CREATETIME：创建时间</li><li> PERIODENDTIME：过期时间</li>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，取值范围：</p><li> CREATETIME：创建时间</li><li> PERIODENDTIME：过期时间</li>
     * @param OrderBy <p>排序字段，取值范围：</p><li> CREATETIME：创建时间</li><li> PERIODENDTIME：过期时间</li>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序类型，取值范围：</p><li> ASC：升序排序 </li><li> DESC：降序排序 </li> 
     * @return OrderByType <p>排序类型，取值范围：</p><li> ASC：升序排序 </li><li> DESC：降序排序 </li>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>排序类型，取值范围：</p><li> ASC：升序排序 </li><li> DESC：降序排序 </li>
     * @param OrderByType <p>排序类型，取值范围：</p><li> ASC：升序排序 </li><li> DESC：降序排序 </li>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get <p>搜索条件，若存在多个 Filter 时，Filter 间的关系为逻辑与（AND）关系。<br>说明：此参数当前仅支持 Status 和 ProxyGroupId 两种过滤条件。</p> 
     * @return Filters <p>搜索条件，若存在多个 Filter 时，Filter 间的关系为逻辑与（AND）关系。<br>说明：此参数当前仅支持 Status 和 ProxyGroupId 两种过滤条件。</p>
     */
    public QueryParamFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>搜索条件，若存在多个 Filter 时，Filter 间的关系为逻辑与（AND）关系。<br>说明：此参数当前仅支持 Status 和 ProxyGroupId 两种过滤条件。</p>
     * @param Filters <p>搜索条件，若存在多个 Filter 时，Filter 间的关系为逻辑与（AND）关系。<br>说明：此参数当前仅支持 Status 和 ProxyGroupId 两种过滤条件。</p>
     */
    public void setFilters(QueryParamFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeProxiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesRequest(DescribeProxiesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Filters != null) {
            this.Filters = new QueryParamFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryParamFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

