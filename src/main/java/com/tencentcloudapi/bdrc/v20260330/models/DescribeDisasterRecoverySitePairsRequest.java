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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDisasterRecoverySitePairsRequest extends AbstractModel {

    /**
    * 要查询的容灾策略产品类型。取值范围：DISK / INSTANCE / CFS。
    */
    @SerializedName("SitePairType")
    @Expose
    private String SitePairType;

    /**
    * 要查询的容灾策略ID列表。
    */
    @SerializedName("SitePairIds")
    @Expose
    private String [] SitePairIds;

    /**
    * 过滤条件，详见定期快照过滤条件表。
    */
    @SerializedName("Filters")
    @Expose
    private FilterModel [] Filters;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 输出结果按升序还是降序，DESC表示降序，ASC表示升序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 输出结果的排序字段
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get 要查询的容灾策略产品类型。取值范围：DISK / INSTANCE / CFS。 
     * @return SitePairType 要查询的容灾策略产品类型。取值范围：DISK / INSTANCE / CFS。
     */
    public String getSitePairType() {
        return this.SitePairType;
    }

    /**
     * Set 要查询的容灾策略产品类型。取值范围：DISK / INSTANCE / CFS。
     * @param SitePairType 要查询的容灾策略产品类型。取值范围：DISK / INSTANCE / CFS。
     */
    public void setSitePairType(String SitePairType) {
        this.SitePairType = SitePairType;
    }

    /**
     * Get 要查询的容灾策略ID列表。 
     * @return SitePairIds 要查询的容灾策略ID列表。
     */
    public String [] getSitePairIds() {
        return this.SitePairIds;
    }

    /**
     * Set 要查询的容灾策略ID列表。
     * @param SitePairIds 要查询的容灾策略ID列表。
     */
    public void setSitePairIds(String [] SitePairIds) {
        this.SitePairIds = SitePairIds;
    }

    /**
     * Get 过滤条件，详见定期快照过滤条件表。 
     * @return Filters 过滤条件，详见定期快照过滤条件表。
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，详见定期快照过滤条件表。
     * @param Filters 过滤条件，详见定期快照过滤条件表。
     */
    public void setFilters(FilterModel [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 输出结果按升序还是降序，DESC表示降序，ASC表示升序 
     * @return Order 输出结果按升序还是降序，DESC表示降序，ASC表示升序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出结果按升序还是降序，DESC表示降序，ASC表示升序
     * @param Order 输出结果按升序还是降序，DESC表示降序，ASC表示升序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 输出结果的排序字段 
     * @return OrderField 输出结果的排序字段
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 输出结果的排序字段
     * @param OrderField 输出结果的排序字段
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeDisasterRecoverySitePairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisasterRecoverySitePairsRequest(DescribeDisasterRecoverySitePairsRequest source) {
        if (source.SitePairType != null) {
            this.SitePairType = new String(source.SitePairType);
        }
        if (source.SitePairIds != null) {
            this.SitePairIds = new String[source.SitePairIds.length];
            for (int i = 0; i < source.SitePairIds.length; i++) {
                this.SitePairIds[i] = new String(source.SitePairIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new FilterModel[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterModel(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SitePairType", this.SitePairType);
        this.setParamArraySimple(map, prefix + "SitePairIds.", this.SitePairIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

