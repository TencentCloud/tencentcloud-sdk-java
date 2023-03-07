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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQVipInstancesRequest extends AbstractModel{

    /**
    * 查询条件过滤器，支持的查询条件如下：
instanceIds - 实例ID
instanceName - 实例名称
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询数目上限，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 查询条件过滤器，支持的查询条件如下：
instanceIds - 实例ID
instanceName - 实例名称 
     * @return Filters 查询条件过滤器，支持的查询条件如下：
instanceIds - 实例ID
instanceName - 实例名称
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件过滤器，支持的查询条件如下：
instanceIds - 实例ID
instanceName - 实例名称
     * @param Filters 查询条件过滤器，支持的查询条件如下：
instanceIds - 实例ID
instanceName - 实例名称
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询数目上限，默认20 
     * @return Limit 查询数目上限，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数目上限，默认20
     * @param Limit 查询数目上限，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询起始位置 
     * @return Offset 查询起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置
     * @param Offset 查询起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeRocketMQVipInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQVipInstancesRequest(DescribeRocketMQVipInstancesRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

