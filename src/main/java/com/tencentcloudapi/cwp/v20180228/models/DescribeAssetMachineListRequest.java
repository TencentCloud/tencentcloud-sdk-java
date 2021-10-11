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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetMachineListRequest extends AbstractModel{

    /**
    * 需要返回的数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>OsType - String - 是否必填：否 - windows或linux</li>
<li>CpuLoad - Int - 是否必填：否 - 
0: 未知  1: 低负载
2: 中负载  3: 高负载</li>
<li>DiskLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>Quuid：主机Quuid</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 可选排序：PartitionCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式，asc升序 或 desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>OsType - String - 是否必填：否 - windows或linux</li>
<li>CpuLoad - Int - 是否必填：否 - 
0: 未知  1: 低负载
2: 中负载  3: 高负载</li>
<li>DiskLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>Quuid：主机Quuid</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li> 
     * @return Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>OsType - String - 是否必填：否 - windows或linux</li>
<li>CpuLoad - Int - 是否必填：否 - 
0: 未知  1: 低负载
2: 中负载  3: 高负载</li>
<li>DiskLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>Quuid：主机Quuid</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>OsType - String - 是否必填：否 - windows或linux</li>
<li>CpuLoad - Int - 是否必填：否 - 
0: 未知  1: 低负载
2: 中负载  3: 高负载</li>
<li>DiskLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>Quuid：主机Quuid</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
     * @param Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>OsType - String - 是否必填：否 - windows或linux</li>
<li>CpuLoad - Int - 是否必填：否 - 
0: 未知  1: 低负载
2: 中负载  3: 高负载</li>
<li>DiskLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - 是否必填：否 - 
0: 0%或未知  1: 0%～20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>Quuid：主机Quuid</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 可选排序：PartitionCount 
     * @return By 可选排序：PartitionCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 可选排序：PartitionCount
     * @param By 可选排序：PartitionCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式，asc升序 或 desc降序 
     * @return Order 排序方式，asc升序 或 desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc升序 或 desc降序
     * @param Order 排序方式，asc升序 或 desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAssetMachineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetMachineListRequest(DescribeAssetMachineListRequest source) {
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
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

