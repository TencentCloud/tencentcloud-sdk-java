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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceListRequest extends AbstractModel {

    /**
    * <p>查询条件列表,支持以下字段<br>InstanceName：集群名模糊搜索<br>InstanceId：集群id精确搜索<br>InstanceStatus：集群状态搜索（RUNNING-运行中，CREATING-创建中，MODIFYING-变配中，DELETING-删除中）<br>PayMode：付费模式搜索（PREPAID-包年包月，POSTPAID-按小时计费）<br>ExpiredBefore：按过期时间过滤：仅筛选包年包月（PREPAID）集群<br>注意：配置TagFilters时该查询条件不生效。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>查询起始位置，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询结果限制数量，默认20，最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>标签过滤器</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get <p>查询条件列表,支持以下字段<br>InstanceName：集群名模糊搜索<br>InstanceId：集群id精确搜索<br>InstanceStatus：集群状态搜索（RUNNING-运行中，CREATING-创建中，MODIFYING-变配中，DELETING-删除中）<br>PayMode：付费模式搜索（PREPAID-包年包月，POSTPAID-按小时计费）<br>ExpiredBefore：按过期时间过滤：仅筛选包年包月（PREPAID）集群<br>注意：配置TagFilters时该查询条件不生效。</p> 
     * @return Filters <p>查询条件列表,支持以下字段<br>InstanceName：集群名模糊搜索<br>InstanceId：集群id精确搜索<br>InstanceStatus：集群状态搜索（RUNNING-运行中，CREATING-创建中，MODIFYING-变配中，DELETING-删除中）<br>PayMode：付费模式搜索（PREPAID-包年包月，POSTPAID-按小时计费）<br>ExpiredBefore：按过期时间过滤：仅筛选包年包月（PREPAID）集群<br>注意：配置TagFilters时该查询条件不生效。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询条件列表,支持以下字段<br>InstanceName：集群名模糊搜索<br>InstanceId：集群id精确搜索<br>InstanceStatus：集群状态搜索（RUNNING-运行中，CREATING-创建中，MODIFYING-变配中，DELETING-删除中）<br>PayMode：付费模式搜索（PREPAID-包年包月，POSTPAID-按小时计费）<br>ExpiredBefore：按过期时间过滤：仅筛选包年包月（PREPAID）集群<br>注意：配置TagFilters时该查询条件不生效。</p>
     * @param Filters <p>查询条件列表,支持以下字段<br>InstanceName：集群名模糊搜索<br>InstanceId：集群id精确搜索<br>InstanceStatus：集群状态搜索（RUNNING-运行中，CREATING-创建中，MODIFYING-变配中，DELETING-删除中）<br>PayMode：付费模式搜索（PREPAID-包年包月，POSTPAID-按小时计费）<br>ExpiredBefore：按过期时间过滤：仅筛选包年包月（PREPAID）集群<br>注意：配置TagFilters时该查询条件不生效。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>查询起始位置，默认0</p> 
     * @return Offset <p>查询起始位置，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询起始位置，默认0</p>
     * @param Offset <p>查询起始位置，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询结果限制数量，默认20，最大100</p> 
     * @return Limit <p>查询结果限制数量，默认20，最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询结果限制数量，默认20，最大100</p>
     * @param Limit <p>查询结果限制数量，默认20，最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>标签过滤器</p> 
     * @return TagFilters <p>标签过滤器</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤器</p>
     * @param TagFilters <p>标签过滤器</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceListRequest(DescribeInstanceListRequest source) {
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
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

