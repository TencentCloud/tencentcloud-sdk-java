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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * <p>过滤参数</p>
    */
    @SerializedName("Filters")
    @Expose
    private InstanceFilter [] Filters;

    /**
    * <p>最大返回个数，默认为20，上限为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，取Limit整数倍</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定查询引擎类型</p><p>枚举值：</p><ul><li>libra： 列存引擎</li></ul>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get <p>过滤参数</p> 
     * @return Filters <p>过滤参数</p>
     */
    public InstanceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤参数</p>
     * @param Filters <p>过滤参数</p>
     */
    public void setFilters(InstanceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>最大返回个数，默认为20，上限为100</p> 
     * @return Limit <p>最大返回个数，默认为20，上限为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大返回个数，默认为20，上限为100</p>
     * @param Limit <p>最大返回个数，默认为20，上限为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，取Limit整数倍</p> 
     * @return Offset <p>偏移量，取Limit整数倍</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，取Limit整数倍</p>
     * @param Offset <p>偏移量，取Limit整数倍</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定查询引擎类型</p><p>枚举值：</p><ul><li>libra： 列存引擎</li></ul> 
     * @return EngineType <p>指定查询引擎类型</p><p>枚举值：</p><ul><li>libra： 列存引擎</li></ul>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>指定查询引擎类型</p><p>枚举值：</p><ul><li>libra： 列存引擎</li></ul>
     * @param EngineType <p>指定查询引擎类型</p><p>枚举值：</p><ul><li>libra： 列存引擎</li></ul>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new InstanceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new InstanceFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

