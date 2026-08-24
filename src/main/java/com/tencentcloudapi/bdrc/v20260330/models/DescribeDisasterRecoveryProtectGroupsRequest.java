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

public class DescribeDisasterRecoveryProtectGroupsRequest extends AbstractModel {

    /**
    * 要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。
    */
    @SerializedName("ProtectGroupType")
    @Expose
    private String ProtectGroupType;

    /**
    * 要查询的容灾保护组ID列表。
    */
    @SerializedName("ProtectGroupIds")
    @Expose
    private String [] ProtectGroupIds;

    /**
    * 过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。
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
    * 输出结果按升序还是降序
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
     * Get 要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。 
     * @return ProtectGroupType 要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。
     */
    public String getProtectGroupType() {
        return this.ProtectGroupType;
    }

    /**
     * Set 要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。
     * @param ProtectGroupType 要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。
     */
    public void setProtectGroupType(String ProtectGroupType) {
        this.ProtectGroupType = ProtectGroupType;
    }

    /**
     * Get 要查询的容灾保护组ID列表。 
     * @return ProtectGroupIds 要查询的容灾保护组ID列表。
     */
    public String [] getProtectGroupIds() {
        return this.ProtectGroupIds;
    }

    /**
     * Set 要查询的容灾保护组ID列表。
     * @param ProtectGroupIds 要查询的容灾保护组ID列表。
     */
    public void setProtectGroupIds(String [] ProtectGroupIds) {
        this.ProtectGroupIds = ProtectGroupIds;
    }

    /**
     * Get 过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。 
     * @return Filters 过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。
     * @param Filters 过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。
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
     * Get 输出结果按升序还是降序 
     * @return Order 输出结果按升序还是降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出结果按升序还是降序
     * @param Order 输出结果按升序还是降序
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

    public DescribeDisasterRecoveryProtectGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisasterRecoveryProtectGroupsRequest(DescribeDisasterRecoveryProtectGroupsRequest source) {
        if (source.ProtectGroupType != null) {
            this.ProtectGroupType = new String(source.ProtectGroupType);
        }
        if (source.ProtectGroupIds != null) {
            this.ProtectGroupIds = new String[source.ProtectGroupIds.length];
            for (int i = 0; i < source.ProtectGroupIds.length; i++) {
                this.ProtectGroupIds[i] = new String(source.ProtectGroupIds[i]);
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
        this.setParamSimple(map, prefix + "ProtectGroupType", this.ProtectGroupType);
        this.setParamArraySimple(map, prefix + "ProtectGroupIds.", this.ProtectGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

