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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedInstancesConfigInfosRequest extends AbstractModel{

    /**
    * zone
按照预留实例计费可购买的可用区进行过滤。形如：ap-guangzhou-1。
类型：String
必选：否
可选项：各地域可用区列表

product-description
按照预留实例计费的平台描述（即操作系统）进行过滤。形如：linux。
类型：String
必选：否
可选项：linux

duration
按照预留实例计费有效期，即预留实例计费购买时长进行过滤。形如：31536000。
类型：Integer
计量单位：秒
必选：否
可选项：31536000 (1年)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get zone
按照预留实例计费可购买的可用区进行过滤。形如：ap-guangzhou-1。
类型：String
必选：否
可选项：各地域可用区列表

product-description
按照预留实例计费的平台描述（即操作系统）进行过滤。形如：linux。
类型：String
必选：否
可选项：linux

duration
按照预留实例计费有效期，即预留实例计费购买时长进行过滤。形如：31536000。
类型：Integer
计量单位：秒
必选：否
可选项：31536000 (1年) 
     * @return Filters zone
按照预留实例计费可购买的可用区进行过滤。形如：ap-guangzhou-1。
类型：String
必选：否
可选项：各地域可用区列表

product-description
按照预留实例计费的平台描述（即操作系统）进行过滤。形如：linux。
类型：String
必选：否
可选项：linux

duration
按照预留实例计费有效期，即预留实例计费购买时长进行过滤。形如：31536000。
类型：Integer
计量单位：秒
必选：否
可选项：31536000 (1年)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set zone
按照预留实例计费可购买的可用区进行过滤。形如：ap-guangzhou-1。
类型：String
必选：否
可选项：各地域可用区列表

product-description
按照预留实例计费的平台描述（即操作系统）进行过滤。形如：linux。
类型：String
必选：否
可选项：linux

duration
按照预留实例计费有效期，即预留实例计费购买时长进行过滤。形如：31536000。
类型：Integer
计量单位：秒
必选：否
可选项：31536000 (1年)
     * @param Filters zone
按照预留实例计费可购买的可用区进行过滤。形如：ap-guangzhou-1。
类型：String
必选：否
可选项：各地域可用区列表

product-description
按照预留实例计费的平台描述（即操作系统）进行过滤。形如：linux。
类型：String
必选：否
可选项：linux

duration
按照预留实例计费有效期，即预留实例计费购买时长进行过滤。形如：31536000。
类型：Integer
计量单位：秒
必选：否
可选项：31536000 (1年)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeReservedInstancesConfigInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReservedInstancesConfigInfosRequest(DescribeReservedInstancesConfigInfosRequest source) {
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

