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
    * <p>要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。</p>
    */
    @SerializedName("ProtectGroupType")
    @Expose
    private String ProtectGroupType;

    /**
    * <p>要查询的容灾保护组ID列表。</p>
    */
    @SerializedName("ProtectGroupIds")
    @Expose
    private String [] ProtectGroupIds;

    /**
    * <p>过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。</p>
    */
    @SerializedName("Filters")
    @Expose
    private FilterModel [] Filters;

    /**
    * <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>输出结果按升序还是降序</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>输出结果的排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get <p>要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。</p> 
     * @return ProtectGroupType <p>要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。</p>
     */
    public String getProtectGroupType() {
        return this.ProtectGroupType;
    }

    /**
     * Set <p>要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。</p>
     * @param ProtectGroupType <p>要查询的容灾保护组产品类型，枚举值：DISK / INSTANCE / CFS。</p>
     */
    public void setProtectGroupType(String ProtectGroupType) {
        this.ProtectGroupType = ProtectGroupType;
    }

    /**
     * Get <p>要查询的容灾保护组ID列表。</p> 
     * @return ProtectGroupIds <p>要查询的容灾保护组ID列表。</p>
     */
    public String [] getProtectGroupIds() {
        return this.ProtectGroupIds;
    }

    /**
     * Set <p>要查询的容灾保护组ID列表。</p>
     * @param ProtectGroupIds <p>要查询的容灾保护组ID列表。</p>
     */
    public void setProtectGroupIds(String [] ProtectGroupIds) {
        this.ProtectGroupIds = ProtectGroupIds;
    }

    /**
     * Get <p>过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。</p> 
     * @return Filters <p>过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。</p>
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。</p>
     * @param Filters <p>过滤条件（过滤项由 core handler 定义，如 disaster-recovery-protect-group-id 等）。</p>
     */
    public void setFilters(FilterModel [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。</p> 
     * @return Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。</p>
     * @param Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>输出结果按升序还是降序</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p> 
     * @return Order <p>输出结果按升序还是降序</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>输出结果按升序还是降序</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
     * @param Order <p>输出结果按升序还是降序</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>输出结果的排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p> 
     * @return OrderField <p>输出结果的排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>输出结果的排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     * @param OrderField <p>输出结果的排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
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

