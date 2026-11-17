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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGPUResourceGroupsRequest extends AbstractModel {

    /**
    * 过滤条件，最多 10 项，Name 不可重复，每项 Values 为 1–10 个值。不同 Name 为 AND、同一 Values 为 OR。支持 resource-group-id（精确 ID）、resource-group-name（精确名称）、resource-group-name-like（普通文本子串，% 和 _ 不作为通配符）、gpu-type、gpu-num、cpu、memory。ID/GPUType 最多 64 字节，名称最多 128 字节；gpu-num 为正整数字符串，cpu/memory 为正数字符串，单位核/GiB。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页偏移量，默认为 0，必须大于等于 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数，省略或传 0 时取 100；非零取值范围 1–500。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 过滤条件，最多 10 项，Name 不可重复，每项 Values 为 1–10 个值。不同 Name 为 AND、同一 Values 为 OR。支持 resource-group-id（精确 ID）、resource-group-name（精确名称）、resource-group-name-like（普通文本子串，% 和 _ 不作为通配符）、gpu-type、gpu-num、cpu、memory。ID/GPUType 最多 64 字节，名称最多 128 字节；gpu-num 为正整数字符串，cpu/memory 为正数字符串，单位核/GiB。 
     * @return Filters 过滤条件，最多 10 项，Name 不可重复，每项 Values 为 1–10 个值。不同 Name 为 AND、同一 Values 为 OR。支持 resource-group-id（精确 ID）、resource-group-name（精确名称）、resource-group-name-like（普通文本子串，% 和 _ 不作为通配符）、gpu-type、gpu-num、cpu、memory。ID/GPUType 最多 64 字节，名称最多 128 字节；gpu-num 为正整数字符串，cpu/memory 为正数字符串，单位核/GiB。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，最多 10 项，Name 不可重复，每项 Values 为 1–10 个值。不同 Name 为 AND、同一 Values 为 OR。支持 resource-group-id（精确 ID）、resource-group-name（精确名称）、resource-group-name-like（普通文本子串，% 和 _ 不作为通配符）、gpu-type、gpu-num、cpu、memory。ID/GPUType 最多 64 字节，名称最多 128 字节；gpu-num 为正整数字符串，cpu/memory 为正数字符串，单位核/GiB。
     * @param Filters 过滤条件，最多 10 项，Name 不可重复，每项 Values 为 1–10 个值。不同 Name 为 AND、同一 Values 为 OR。支持 resource-group-id（精确 ID）、resource-group-name（精确名称）、resource-group-name-like（普通文本子串，% 和 _ 不作为通配符）、gpu-type、gpu-num、cpu、memory。ID/GPUType 最多 64 字节，名称最多 128 字节；gpu-num 为正整数字符串，cpu/memory 为正数字符串，单位核/GiB。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页偏移量，默认为 0，必须大于等于 0。 
     * @return Offset 分页偏移量，默认为 0，必须大于等于 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认为 0，必须大于等于 0。
     * @param Offset 分页偏移量，默认为 0，必须大于等于 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数，省略或传 0 时取 100；非零取值范围 1–500。 
     * @return Limit 每页条数，省略或传 0 时取 100；非零取值范围 1–500。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数，省略或传 0 时取 100；非零取值范围 1–500。
     * @param Limit 每页条数，省略或传 0 时取 100；非零取值范围 1–500。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGPUResourceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGPUResourceGroupsRequest(DescribeGPUResourceGroupsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

