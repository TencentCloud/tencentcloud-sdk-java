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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvailableCvmInstanceTypesRequest extends AbstractModel {

    /**
    * 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](https://cloud.tencent.com/document/product/213/15707)过滤。</li>
<li> instance-family String - 是否必填：否 -（过滤条件）按照[机型系列](https://cloud.tencent.com/document/product/213/15748)过滤。实例机型系列形如：S1、I1、M1等。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](https://cloud.tencent.com/document/product/213/15707)过滤。</li>
<li> instance-family String - 是否必填：否 -（过滤条件）按照[机型系列](https://cloud.tencent.com/document/product/213/15748)过滤。实例机型系列形如：S1、I1、M1等。</li> 
     * @return Filters 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](https://cloud.tencent.com/document/product/213/15707)过滤。</li>
<li> instance-family String - 是否必填：否 -（过滤条件）按照[机型系列](https://cloud.tencent.com/document/product/213/15748)过滤。实例机型系列形如：S1、I1、M1等。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](https://cloud.tencent.com/document/product/213/15707)过滤。</li>
<li> instance-family String - 是否必填：否 -（过滤条件）按照[机型系列](https://cloud.tencent.com/document/product/213/15748)过滤。实例机型系列形如：S1、I1、M1等。</li>
     * @param Filters 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](https://cloud.tencent.com/document/product/213/15707)过滤。</li>
<li> instance-family String - 是否必填：否 -（过滤条件）按照[机型系列](https://cloud.tencent.com/document/product/213/15748)过滤。实例机型系列形如：S1、I1、M1等。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAvailableCvmInstanceTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableCvmInstanceTypesRequest(DescribeAvailableCvmInstanceTypesRequest source) {
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

