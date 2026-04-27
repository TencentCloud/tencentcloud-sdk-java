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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelServiceGroupsRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序的依据字段， 取值范围 &quot;CreateTime&quot; &quot;UpdateTime&quot;</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>分页参数，支持的分页过滤Name包括：<br>[&quot;ClusterId&quot;, &quot;ServiceId&quot;, &quot;ServiceGroupName&quot;, &quot;ServiceGroupId&quot;,&quot;Status&quot;,&quot;CreatedBy&quot;,&quot;ModelVersionId&quot;]</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>标签过滤参数</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>服务分类</p>
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100</p>
     * @param Limit <p>返回数量，默认为20，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列</p> 
     * @return Order <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列</p>
     * @param Order <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序的依据字段， 取值范围 &quot;CreateTime&quot; &quot;UpdateTime&quot;</p> 
     * @return OrderField <p>排序的依据字段， 取值范围 &quot;CreateTime&quot; &quot;UpdateTime&quot;</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序的依据字段， 取值范围 &quot;CreateTime&quot; &quot;UpdateTime&quot;</p>
     * @param OrderField <p>排序的依据字段， 取值范围 &quot;CreateTime&quot; &quot;UpdateTime&quot;</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>分页参数，支持的分页过滤Name包括：<br>[&quot;ClusterId&quot;, &quot;ServiceId&quot;, &quot;ServiceGroupName&quot;, &quot;ServiceGroupId&quot;,&quot;Status&quot;,&quot;CreatedBy&quot;,&quot;ModelVersionId&quot;]</p> 
     * @return Filters <p>分页参数，支持的分页过滤Name包括：<br>[&quot;ClusterId&quot;, &quot;ServiceId&quot;, &quot;ServiceGroupName&quot;, &quot;ServiceGroupId&quot;,&quot;Status&quot;,&quot;CreatedBy&quot;,&quot;ModelVersionId&quot;]</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>分页参数，支持的分页过滤Name包括：<br>[&quot;ClusterId&quot;, &quot;ServiceId&quot;, &quot;ServiceGroupName&quot;, &quot;ServiceGroupId&quot;,&quot;Status&quot;,&quot;CreatedBy&quot;,&quot;ModelVersionId&quot;]</p>
     * @param Filters <p>分页参数，支持的分页过滤Name包括：<br>[&quot;ClusterId&quot;, &quot;ServiceId&quot;, &quot;ServiceGroupName&quot;, &quot;ServiceGroupId&quot;,&quot;Status&quot;,&quot;CreatedBy&quot;,&quot;ModelVersionId&quot;]</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>标签过滤参数</p> 
     * @return TagFilters <p>标签过滤参数</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤参数</p>
     * @param TagFilters <p>标签过滤参数</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>服务分类</p> 
     * @return ServiceCategory <p>服务分类</p>
     * @deprecated
     */
    @Deprecated
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set <p>服务分类</p>
     * @param ServiceCategory <p>服务分类</p>
     * @deprecated
     */
    @Deprecated
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    public DescribeModelServiceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServiceGroupsRequest(DescribeModelServiceGroupsRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
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
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);

    }
}

