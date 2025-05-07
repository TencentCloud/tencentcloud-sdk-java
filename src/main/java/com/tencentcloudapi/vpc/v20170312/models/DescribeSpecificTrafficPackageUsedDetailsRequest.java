/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecificTrafficPackageUsedDetailsRequest extends AbstractModel {

    /**
    * 共享流量包唯一ID。可以使用[DescribeTrafficPackages](https://cloud.tencent.com/document/product/215/80090?locationSource=from%3Ddoc-search%26scope%3Dcurrent%26keyword%3D%E6%B5%81%E9%87%8F%E5%8C%85)接口获取TrafficPackageId。
    */
    @SerializedName("TrafficPackageId")
    @Expose
    private String TrafficPackageId;

    /**
    * 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<ul style="margin:0"><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 EIP、BWP、LB。 </li>
<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。以下补充资源ID获取方式：<ul><li>EIP：可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取资源ID。</li>
<li>BWP：可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口获取资源ID。</li>
<li>LB：可以使用[DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685)接口获取资源ID。</li></ul></li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 开始时间。待查询的共享流量包用量开始时间。不传默认为当前时间往前推30天。
时间格式：YYYY-MM-DD hh:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。待查询的共享流量包用量结束时间。不传默认为当前时间。
时间格式：YYYY-MM-DD hh:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 中的相关小节
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20。关于Limit的更进一步介绍请参考 API 中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 共享流量包唯一ID。可以使用[DescribeTrafficPackages](https://cloud.tencent.com/document/product/215/80090?locationSource=from%3Ddoc-search%26scope%3Dcurrent%26keyword%3D%E6%B5%81%E9%87%8F%E5%8C%85)接口获取TrafficPackageId。 
     * @return TrafficPackageId 共享流量包唯一ID。可以使用[DescribeTrafficPackages](https://cloud.tencent.com/document/product/215/80090?locationSource=from%3Ddoc-search%26scope%3Dcurrent%26keyword%3D%E6%B5%81%E9%87%8F%E5%8C%85)接口获取TrafficPackageId。
     */
    public String getTrafficPackageId() {
        return this.TrafficPackageId;
    }

    /**
     * Set 共享流量包唯一ID。可以使用[DescribeTrafficPackages](https://cloud.tencent.com/document/product/215/80090?locationSource=from%3Ddoc-search%26scope%3Dcurrent%26keyword%3D%E6%B5%81%E9%87%8F%E5%8C%85)接口获取TrafficPackageId。
     * @param TrafficPackageId 共享流量包唯一ID。可以使用[DescribeTrafficPackages](https://cloud.tencent.com/document/product/215/80090?locationSource=from%3Ddoc-search%26scope%3Dcurrent%26keyword%3D%E6%B5%81%E9%87%8F%E5%8C%85)接口获取TrafficPackageId。
     */
    public void setTrafficPackageId(String TrafficPackageId) {
        this.TrafficPackageId = TrafficPackageId;
    }

    /**
     * Get 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<ul style="margin:0"><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 EIP、BWP、LB。 </li>
<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。以下补充资源ID获取方式：<ul><li>EIP：可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取资源ID。</li>
<li>BWP：可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口获取资源ID。</li>
<li>LB：可以使用[DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685)接口获取资源ID。</li></ul></li></ul> 
     * @return Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<ul style="margin:0"><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 EIP、BWP、LB。 </li>
<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。以下补充资源ID获取方式：<ul><li>EIP：可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取资源ID。</li>
<li>BWP：可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口获取资源ID。</li>
<li>LB：可以使用[DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685)接口获取资源ID。</li></ul></li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<ul style="margin:0"><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 EIP、BWP、LB。 </li>
<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。以下补充资源ID获取方式：<ul><li>EIP：可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取资源ID。</li>
<li>BWP：可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口获取资源ID。</li>
<li>LB：可以使用[DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685)接口获取资源ID。</li></ul></li></ul>
     * @param Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<ul style="margin:0"><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 EIP、BWP、LB。 </li>
<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。以下补充资源ID获取方式：<ul><li>EIP：可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取资源ID。</li>
<li>BWP：可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口获取资源ID。</li>
<li>LB：可以使用[DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685)接口获取资源ID。</li></ul></li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction 
     * @return OrderField 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
     * @param OrderField 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0 
     * @return OrderType 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
     * @param OrderType 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 开始时间。待查询的共享流量包用量开始时间。不传默认为当前时间往前推30天。
时间格式：YYYY-MM-DD hh:mm:ss 
     * @return StartTime 开始时间。待查询的共享流量包用量开始时间。不传默认为当前时间往前推30天。
时间格式：YYYY-MM-DD hh:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。待查询的共享流量包用量开始时间。不传默认为当前时间往前推30天。
时间格式：YYYY-MM-DD hh:mm:ss
     * @param StartTime 开始时间。待查询的共享流量包用量开始时间。不传默认为当前时间往前推30天。
时间格式：YYYY-MM-DD hh:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。待查询的共享流量包用量结束时间。不传默认为当前时间。
时间格式：YYYY-MM-DD hh:mm:ss 
     * @return EndTime 结束时间。待查询的共享流量包用量结束时间。不传默认为当前时间。
时间格式：YYYY-MM-DD hh:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。待查询的共享流量包用量结束时间。不传默认为当前时间。
时间格式：YYYY-MM-DD hh:mm:ss
     * @param EndTime 结束时间。待查询的共享流量包用量结束时间。不传默认为当前时间。
时间格式：YYYY-MM-DD hh:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 中的相关小节 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 中的相关小节
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 中的相关小节
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 中的相关小节
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20。关于Limit的更进一步介绍请参考 API 中的相关小节。 
     * @return Limit 返回数量，默认为20。关于Limit的更进一步介绍请参考 API 中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20。关于Limit的更进一步介绍请参考 API 中的相关小节。
     * @param Limit 返回数量，默认为20。关于Limit的更进一步介绍请参考 API 中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSpecificTrafficPackageUsedDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecificTrafficPackageUsedDetailsRequest(DescribeSpecificTrafficPackageUsedDetailsRequest source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

