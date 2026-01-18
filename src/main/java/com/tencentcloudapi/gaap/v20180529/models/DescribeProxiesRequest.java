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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesRequest extends AbstractModel {

    /**
    * <p>（旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件。 <br />每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。 <br />AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。  <br />RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。IPAddressVersion - String - 是否必填：否 - （过滤条件）按照IP版本过滤。PackageType - String - 是否必填：否 - （过滤条件）按照通道套餐类型过滤。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>（新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * <p>标签列表，当存在该字段时，拉取对应标签下的资源列表。最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * <p>当该字段为1时，仅拉取非通道组的通道，当该字段为0时，仅拉取通道组的通道，不存在该字段时，拉取所有通道，包括独立通道和通道组通道。</p>
    */
    @SerializedName("Independent")
    @Expose
    private Long Independent;

    /**
    * <p>输出通道列表的排列顺序。取值范围：asc：升序排列；desc：降序排列。默认为降序。</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>通道列表排序的依据字段。取值范围：create_time：依据通道的创建时间排序；proxy_id：依据通道的ID排序；bandwidth：依据通道带宽上限排序；concurrent_connections：依据通道并发排序；默认按通道创建时间排序。</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get <p>（旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p> 
     * @return InstanceIds <p>（旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>（旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
     * @param InstanceIds <p>（旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件。 <br />每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。 <br />AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。  <br />RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。IPAddressVersion - String - 是否必填：否 - （过滤条件）按照IP版本过滤。PackageType - String - 是否必填：否 - （过滤条件）按照通道套餐类型过滤。</p> 
     * @return Filters <p>过滤条件。 <br />每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。 <br />AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。  <br />RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。IPAddressVersion - String - 是否必填：否 - （过滤条件）按照IP版本过滤。PackageType - String - 是否必填：否 - （过滤条件）按照通道套餐类型过滤。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。 <br />每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。 <br />AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。  <br />RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。IPAddressVersion - String - 是否必填：否 - （过滤条件）按照IP版本过滤。PackageType - String - 是否必填：否 - （过滤条件）按照通道套餐类型过滤。</p>
     * @param Filters <p>过滤条件。 <br />每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。 <br />AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。  <br />RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。IPAddressVersion - String - 是否必填：否 - （过滤条件）按照IP版本过滤。PackageType - String - 是否必填：否 - （过滤条件）按照通道套餐类型过滤。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>（新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p> 
     * @return ProxyIds <p>（新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set <p>（新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
     * @param ProxyIds <p>（新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。</p>
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get <p>标签列表，当存在该字段时，拉取对应标签下的资源列表。最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。</p> 
     * @return TagSet <p>标签列表，当存在该字段时，拉取对应标签下的资源列表。最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。</p>
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签列表，当存在该字段时，拉取对应标签下的资源列表。最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。</p>
     * @param TagSet <p>标签列表，当存在该字段时，拉取对应标签下的资源列表。最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。</p>
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>当该字段为1时，仅拉取非通道组的通道，当该字段为0时，仅拉取通道组的通道，不存在该字段时，拉取所有通道，包括独立通道和通道组通道。</p> 
     * @return Independent <p>当该字段为1时，仅拉取非通道组的通道，当该字段为0时，仅拉取通道组的通道，不存在该字段时，拉取所有通道，包括独立通道和通道组通道。</p>
     */
    public Long getIndependent() {
        return this.Independent;
    }

    /**
     * Set <p>当该字段为1时，仅拉取非通道组的通道，当该字段为0时，仅拉取通道组的通道，不存在该字段时，拉取所有通道，包括独立通道和通道组通道。</p>
     * @param Independent <p>当该字段为1时，仅拉取非通道组的通道，当该字段为0时，仅拉取通道组的通道，不存在该字段时，拉取所有通道，包括独立通道和通道组通道。</p>
     */
    public void setIndependent(Long Independent) {
        this.Independent = Independent;
    }

    /**
     * Get <p>输出通道列表的排列顺序。取值范围：asc：升序排列；desc：降序排列。默认为降序。</p> 
     * @return Order <p>输出通道列表的排列顺序。取值范围：asc：升序排列；desc：降序排列。默认为降序。</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>输出通道列表的排列顺序。取值范围：asc：升序排列；desc：降序排列。默认为降序。</p>
     * @param Order <p>输出通道列表的排列顺序。取值范围：asc：升序排列；desc：降序排列。默认为降序。</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>通道列表排序的依据字段。取值范围：create_time：依据通道的创建时间排序；proxy_id：依据通道的ID排序；bandwidth：依据通道带宽上限排序；concurrent_connections：依据通道并发排序；默认按通道创建时间排序。</p> 
     * @return OrderField <p>通道列表排序的依据字段。取值范围：create_time：依据通道的创建时间排序；proxy_id：依据通道的ID排序；bandwidth：依据通道带宽上限排序；concurrent_connections：依据通道并发排序；默认按通道创建时间排序。</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>通道列表排序的依据字段。取值范围：create_time：依据通道的创建时间排序；proxy_id：依据通道的ID排序；bandwidth：依据通道带宽上限排序；concurrent_connections：依据通道并发排序；默认按通道创建时间排序。</p>
     * @param OrderField <p>通道列表排序的依据字段。取值范围：create_time：依据通道的创建时间排序；proxy_id：依据通道的ID排序；bandwidth：依据通道带宽上限排序；concurrent_connections：依据通道并发排序；默认按通道创建时间排序。</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeProxiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesRequest(DescribeProxiesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.Independent != null) {
            this.Independent = new Long(source.Independent);
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Independent", this.Independent);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

