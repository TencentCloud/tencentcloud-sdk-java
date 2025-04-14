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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupInstancesRequest extends AbstractModel {

    /**
    * 过滤条件，当前仅支持TargetGroupId，BindIP，InstanceId过滤。

- TargetGroupId - String - 是否必填：否 - （过滤条件）目标组ID，如“lbtg-5xunivs0”。可通过[DescribeTargetGroupList](https://cloud.tencent.com/document/api/1782/111692)接口获取。
- BindIP - String - 是否必填：否 - （过滤条件）目标组绑定实例的内网IP地址，如“10.1.1.1”。
- InstanceId - String - 是否必填：否 - （过滤条件）目标组绑定实例的名称，如“ins-mxzlf9ke”。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728) 接口获取。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 显示数量限制，默认20，最大1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 显示的偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 过滤条件，当前仅支持TargetGroupId，BindIP，InstanceId过滤。

- TargetGroupId - String - 是否必填：否 - （过滤条件）目标组ID，如“lbtg-5xunivs0”。可通过[DescribeTargetGroupList](https://cloud.tencent.com/document/api/1782/111692)接口获取。
- BindIP - String - 是否必填：否 - （过滤条件）目标组绑定实例的内网IP地址，如“10.1.1.1”。
- InstanceId - String - 是否必填：否 - （过滤条件）目标组绑定实例的名称，如“ins-mxzlf9ke”。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728) 接口获取。 
     * @return Filters 过滤条件，当前仅支持TargetGroupId，BindIP，InstanceId过滤。

- TargetGroupId - String - 是否必填：否 - （过滤条件）目标组ID，如“lbtg-5xunivs0”。可通过[DescribeTargetGroupList](https://cloud.tencent.com/document/api/1782/111692)接口获取。
- BindIP - String - 是否必填：否 - （过滤条件）目标组绑定实例的内网IP地址，如“10.1.1.1”。
- InstanceId - String - 是否必填：否 - （过滤条件）目标组绑定实例的名称，如“ins-mxzlf9ke”。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728) 接口获取。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，当前仅支持TargetGroupId，BindIP，InstanceId过滤。

- TargetGroupId - String - 是否必填：否 - （过滤条件）目标组ID，如“lbtg-5xunivs0”。可通过[DescribeTargetGroupList](https://cloud.tencent.com/document/api/1782/111692)接口获取。
- BindIP - String - 是否必填：否 - （过滤条件）目标组绑定实例的内网IP地址，如“10.1.1.1”。
- InstanceId - String - 是否必填：否 - （过滤条件）目标组绑定实例的名称，如“ins-mxzlf9ke”。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728) 接口获取。
     * @param Filters 过滤条件，当前仅支持TargetGroupId，BindIP，InstanceId过滤。

- TargetGroupId - String - 是否必填：否 - （过滤条件）目标组ID，如“lbtg-5xunivs0”。可通过[DescribeTargetGroupList](https://cloud.tencent.com/document/api/1782/111692)接口获取。
- BindIP - String - 是否必填：否 - （过滤条件）目标组绑定实例的内网IP地址，如“10.1.1.1”。
- InstanceId - String - 是否必填：否 - （过滤条件）目标组绑定实例的名称，如“ins-mxzlf9ke”。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728) 接口获取。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 显示数量限制，默认20，最大1000。 
     * @return Limit 显示数量限制，默认20，最大1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 显示数量限制，默认20，最大1000。
     * @param Limit 显示数量限制，默认20，最大1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 显示的偏移量，默认为0。 
     * @return Offset 显示的偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 显示的偏移量，默认为0。
     * @param Offset 显示的偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTargetGroupInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupInstancesRequest(DescribeTargetGroupInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

