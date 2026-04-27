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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * <p>产品名称：postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>是否开通</p><p>枚举值：</p><ul><li>0： 未开通</li><li>1： 已开通</li></ul>
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * <p>分页限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>页偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>实例过滤参数</p><p>入参限制：支持过滤条件：InstanceId-实例ID,InstanceName-实例名称</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>产品名称：postgres</p> 
     * @return Product <p>产品名称：postgres</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品名称：postgres</p>
     * @param Product <p>产品名称：postgres</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>是否开通</p><p>枚举值：</p><ul><li>0： 未开通</li><li>1： 已开通</li></ul> 
     * @return AuditSwitch <p>是否开通</p><p>枚举值：</p><ul><li>0： 未开通</li><li>1： 已开通</li></ul>
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set <p>是否开通</p><p>枚举值：</p><ul><li>0： 未开通</li><li>1： 已开通</li></ul>
     * @param AuditSwitch <p>是否开通</p><p>枚举值：</p><ul><li>0： 未开通</li><li>1： 已开通</li></ul>
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get <p>分页限制</p> 
     * @return Limit <p>分页限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页限制</p>
     * @param Limit <p>分页限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>页偏移量</p> 
     * @return Offset <p>页偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>页偏移量</p>
     * @param Offset <p>页偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>实例过滤参数</p><p>入参限制：支持过滤条件：InstanceId-实例ID,InstanceName-实例名称</p> 
     * @return Filters <p>实例过滤参数</p><p>入参限制：支持过滤条件：InstanceId-实例ID,InstanceName-实例名称</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>实例过滤参数</p><p>入参限制：支持过滤条件：InstanceId-实例ID,InstanceName-实例名称</p>
     * @param Filters <p>实例过滤参数</p><p>入参限制：支持过滤条件：InstanceId-实例ID,InstanceName-实例名称</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAuditInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditInstanceListRequest(DescribeAuditInstanceListRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.AuditSwitch != null) {
            this.AuditSwitch = new Long(source.AuditSwitch);
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
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "AuditSwitch", this.AuditSwitch);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

