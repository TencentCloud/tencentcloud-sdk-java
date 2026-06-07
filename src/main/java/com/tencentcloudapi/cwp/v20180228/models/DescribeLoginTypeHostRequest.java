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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginTypeHostRequest extends AbstractModel {

    /**
    * <li>Name - string - 是否必填：否 - 主机名</li> <li>InstanceId - string - 是否必填：否 - 实例ID</li> <li>PublicIp - string - 是否必填：否 - 公网IP</li> <li>PrivateIp - string - 是否必填：否 - 私网IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>限制条数,默认10,最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量,默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方式: [ASC:升序|DESC:降序]</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>可选排序列: [Id]</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <li>Name - string - 是否必填：否 - 主机名</li> <li>InstanceId - string - 是否必填：否 - 实例ID</li> <li>PublicIp - string - 是否必填：否 - 公网IP</li> <li>PrivateIp - string - 是否必填：否 - 私网IP</li> 
     * @return Filters <li>Name - string - 是否必填：否 - 主机名</li> <li>InstanceId - string - 是否必填：否 - 实例ID</li> <li>PublicIp - string - 是否必填：否 - 公网IP</li> <li>PrivateIp - string - 是否必填：否 - 私网IP</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>Name - string - 是否必填：否 - 主机名</li> <li>InstanceId - string - 是否必填：否 - 实例ID</li> <li>PublicIp - string - 是否必填：否 - 公网IP</li> <li>PrivateIp - string - 是否必填：否 - 私网IP</li>
     * @param Filters <li>Name - string - 是否必填：否 - 主机名</li> <li>InstanceId - string - 是否必填：否 - 实例ID</li> <li>PublicIp - string - 是否必填：否 - 公网IP</li> <li>PrivateIp - string - 是否必填：否 - 私网IP</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>限制条数,默认10,最大100</p> 
     * @return Limit <p>限制条数,默认10,最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制条数,默认10,最大100</p>
     * @param Limit <p>限制条数,默认10,最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量,默认0</p> 
     * @return Offset <p>偏移量,默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量,默认0</p>
     * @param Offset <p>偏移量,默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方式: [ASC:升序|DESC:降序]</p> 
     * @return Order <p>排序方式: [ASC:升序|DESC:降序]</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式: [ASC:升序|DESC:降序]</p>
     * @param Order <p>排序方式: [ASC:升序|DESC:降序]</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>可选排序列: [Id]</p> 
     * @return By <p>可选排序列: [Id]</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>可选排序列: [Id]</p>
     * @param By <p>可选排序列: [Id]</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeLoginTypeHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginTypeHostRequest(DescribeLoginTypeHostRequest source) {
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

