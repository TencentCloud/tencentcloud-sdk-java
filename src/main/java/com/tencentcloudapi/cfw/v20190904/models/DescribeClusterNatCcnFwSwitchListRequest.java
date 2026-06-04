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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNatCcnFwSwitchListRequest extends AbstractModel {

    /**
    * <p>NAT防火墙类型筛选，取值：nat-VPC内防护类型，nat_ccn-CCN集群模式类型，不传则同时查询两种类型</p>
    */
    @SerializedName("NatType")
    @Expose
    private String NatType;

    /**
    * <p>每页条数，默认100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件列表，支持按Common（通用搜索）、InsObj（实例ID）、ObjName（实例名称）等字段过滤</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
     * Get <p>NAT防火墙类型筛选，取值：nat-VPC内防护类型，nat_ccn-CCN集群模式类型，不传则同时查询两种类型</p> 
     * @return NatType <p>NAT防火墙类型筛选，取值：nat-VPC内防护类型，nat_ccn-CCN集群模式类型，不传则同时查询两种类型</p>
     */
    public String getNatType() {
        return this.NatType;
    }

    /**
     * Set <p>NAT防火墙类型筛选，取值：nat-VPC内防护类型，nat_ccn-CCN集群模式类型，不传则同时查询两种类型</p>
     * @param NatType <p>NAT防火墙类型筛选，取值：nat-VPC内防护类型，nat_ccn-CCN集群模式类型，不传则同时查询两种类型</p>
     */
    public void setNatType(String NatType) {
        this.NatType = NatType;
    }

    /**
     * Get <p>每页条数，默认100</p> 
     * @return Limit <p>每页条数，默认100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数，默认100</p>
     * @param Limit <p>每页条数，默认100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认0</p> 
     * @return Offset <p>偏移量，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认0</p>
     * @param Offset <p>偏移量，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件列表，支持按Common（通用搜索）、InsObj（实例ID）、ObjName（实例名称）等字段过滤</p> 
     * @return Filters <p>过滤条件列表，支持按Common（通用搜索）、InsObj（实例ID）、ObjName（实例名称）等字段过滤</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件列表，支持按Common（通用搜索）、InsObj（实例ID）、ObjName（实例名称）等字段过滤</p>
     * @param Filters <p>过滤条件列表，支持按Common（通用搜索）、InsObj（实例ID）、ObjName（实例名称）等字段过滤</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeClusterNatCcnFwSwitchListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNatCcnFwSwitchListRequest(DescribeClusterNatCcnFwSwitchListRequest source) {
        if (source.NatType != null) {
            this.NatType = new String(source.NatType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatType", this.NatType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

