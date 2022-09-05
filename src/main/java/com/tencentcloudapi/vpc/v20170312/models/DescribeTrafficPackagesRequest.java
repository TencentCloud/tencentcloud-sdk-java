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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficPackagesRequest extends AbstractModel{

    /**
    * 共享流量包ID，支持批量
    */
    @SerializedName("TrafficPackageIds")
    @Expose
    private String [] TrafficPackageIds;

    /**
    * 每次请求的`Filters`的上限为10。参数不支持同时指定`TrafficPackageIds`和`Filters`。详细的过滤条件如下：
<li> traffic-package_id - String - 是否必填：否 - （过滤条件）按照共享流量包的唯一标识ID过滤。</li>
<li> traffic-package-name - String - 是否必填：否 - （过滤条件）按照共享流量包名称过滤。不支持模糊过滤。</li>
<li> status - String - 是否必填：否 - （过滤条件）按照共享流量包状态过滤。可选状态：[AVAILABLE|EXPIRED|EXHAUSTED]</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 共享流量包ID，支持批量 
     * @return TrafficPackageIds 共享流量包ID，支持批量
     */
    public String [] getTrafficPackageIds() {
        return this.TrafficPackageIds;
    }

    /**
     * Set 共享流量包ID，支持批量
     * @param TrafficPackageIds 共享流量包ID，支持批量
     */
    public void setTrafficPackageIds(String [] TrafficPackageIds) {
        this.TrafficPackageIds = TrafficPackageIds;
    }

    /**
     * Get 每次请求的`Filters`的上限为10。参数不支持同时指定`TrafficPackageIds`和`Filters`。详细的过滤条件如下：
<li> traffic-package_id - String - 是否必填：否 - （过滤条件）按照共享流量包的唯一标识ID过滤。</li>
<li> traffic-package-name - String - 是否必填：否 - （过滤条件）按照共享流量包名称过滤。不支持模糊过滤。</li>
<li> status - String - 是否必填：否 - （过滤条件）按照共享流量包状态过滤。可选状态：[AVAILABLE|EXPIRED|EXHAUSTED]</li> 
     * @return Filters 每次请求的`Filters`的上限为10。参数不支持同时指定`TrafficPackageIds`和`Filters`。详细的过滤条件如下：
<li> traffic-package_id - String - 是否必填：否 - （过滤条件）按照共享流量包的唯一标识ID过滤。</li>
<li> traffic-package-name - String - 是否必填：否 - （过滤条件）按照共享流量包名称过滤。不支持模糊过滤。</li>
<li> status - String - 是否必填：否 - （过滤条件）按照共享流量包状态过滤。可选状态：[AVAILABLE|EXPIRED|EXHAUSTED]</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10。参数不支持同时指定`TrafficPackageIds`和`Filters`。详细的过滤条件如下：
<li> traffic-package_id - String - 是否必填：否 - （过滤条件）按照共享流量包的唯一标识ID过滤。</li>
<li> traffic-package-name - String - 是否必填：否 - （过滤条件）按照共享流量包名称过滤。不支持模糊过滤。</li>
<li> status - String - 是否必填：否 - （过滤条件）按照共享流量包状态过滤。可选状态：[AVAILABLE|EXPIRED|EXHAUSTED]</li>
     * @param Filters 每次请求的`Filters`的上限为10。参数不支持同时指定`TrafficPackageIds`和`Filters`。详细的过滤条件如下：
<li> traffic-package_id - String - 是否必填：否 - （过滤条件）按照共享流量包的唯一标识ID过滤。</li>
<li> traffic-package-name - String - 是否必填：否 - （过滤条件）按照共享流量包名称过滤。不支持模糊过滤。</li>
<li> status - String - 是否必填：否 - （过滤条件）按照共享流量包状态过滤。可选状态：[AVAILABLE|EXPIRED|EXHAUSTED]</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数 
     * @return Limit 分页参数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数
     * @param Limit 分页参数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficPackagesRequest(DescribeTrafficPackagesRequest source) {
        if (source.TrafficPackageIds != null) {
            this.TrafficPackageIds = new String[source.TrafficPackageIds.length];
            for (int i = 0; i < source.TrafficPackageIds.length; i++) {
                this.TrafficPackageIds[i] = new String(source.TrafficPackageIds[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "TrafficPackageIds.", this.TrafficPackageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

