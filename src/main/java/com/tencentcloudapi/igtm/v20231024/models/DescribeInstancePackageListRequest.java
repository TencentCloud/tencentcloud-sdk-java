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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancePackageListRequest extends AbstractModel {

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * InstanceId实例Id，InstanceName实例名称，ResourceId套餐Id，PackageType套餐类型 
    */
    @SerializedName("Filters")
    @Expose
    private ResourceFilter [] Filters;

    /**
    * 是否使用：0未使用1已使用
    */
    @SerializedName("IsUsed")
    @Expose
    private Long IsUsed;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get InstanceId实例Id，InstanceName实例名称，ResourceId套餐Id，PackageType套餐类型  
     * @return Filters InstanceId实例Id，InstanceName实例名称，ResourceId套餐Id，PackageType套餐类型 
     */
    public ResourceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set InstanceId实例Id，InstanceName实例名称，ResourceId套餐Id，PackageType套餐类型 
     * @param Filters InstanceId实例Id，InstanceName实例名称，ResourceId套餐Id，PackageType套餐类型 
     */
    public void setFilters(ResourceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否使用：0未使用1已使用 
     * @return IsUsed 是否使用：0未使用1已使用
     */
    public Long getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set 是否使用：0未使用1已使用
     * @param IsUsed 是否使用：0未使用1已使用
     */
    public void setIsUsed(Long IsUsed) {
        this.IsUsed = IsUsed;
    }

    public DescribeInstancePackageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancePackageListRequest(DescribeInstancePackageListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ResourceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ResourceFilter(source.Filters[i]);
            }
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Long(source.IsUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);

    }
}

