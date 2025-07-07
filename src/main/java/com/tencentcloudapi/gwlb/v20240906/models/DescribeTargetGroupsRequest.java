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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupsRequest extends AbstractModel {

    /**
    * 目标组ID。
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
    * 显示条数限制，默认为20，最大值为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 显示的偏移起始量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件数组。
- TargetGroupVpcId - String - 是否必填：否 - （过滤条件）按照目标组所属的私有网络过滤，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)获取，如“vpc-bhqk****”。
- TargetGroupName - String - 是否必填：否 - （过滤条件）按照目标组的名称过滤，如“tg_name”
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 目标组ID。 
     * @return TargetGroupIds 目标组ID。
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set 目标组ID。
     * @param TargetGroupIds 目标组ID。
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    /**
     * Get 显示条数限制，默认为20，最大值为1000。 
     * @return Limit 显示条数限制，默认为20，最大值为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 显示条数限制，默认为20，最大值为1000。
     * @param Limit 显示条数限制，默认为20，最大值为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 显示的偏移起始量，默认为0。 
     * @return Offset 显示的偏移起始量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 显示的偏移起始量，默认为0。
     * @param Offset 显示的偏移起始量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件数组。
- TargetGroupVpcId - String - 是否必填：否 - （过滤条件）按照目标组所属的私有网络过滤，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)获取，如“vpc-bhqk****”。
- TargetGroupName - String - 是否必填：否 - （过滤条件）按照目标组的名称过滤，如“tg_name” 
     * @return Filters 过滤条件数组。
- TargetGroupVpcId - String - 是否必填：否 - （过滤条件）按照目标组所属的私有网络过滤，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)获取，如“vpc-bhqk****”。
- TargetGroupName - String - 是否必填：否 - （过滤条件）按照目标组的名称过滤，如“tg_name”
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件数组。
- TargetGroupVpcId - String - 是否必填：否 - （过滤条件）按照目标组所属的私有网络过滤，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)获取，如“vpc-bhqk****”。
- TargetGroupName - String - 是否必填：否 - （过滤条件）按照目标组的名称过滤，如“tg_name”
     * @param Filters 过滤条件数组。
- TargetGroupVpcId - String - 是否必填：否 - （过滤条件）按照目标组所属的私有网络过滤，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)获取，如“vpc-bhqk****”。
- TargetGroupName - String - 是否必填：否 - （过滤条件）按照目标组的名称过滤，如“tg_name”
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTargetGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupsRequest(DescribeTargetGroupsRequest source) {
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

