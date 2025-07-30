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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesRequest extends AbstractModel {

    /**
    * 查询的机器组ID。

- 通过[获取机器组列表](https://cloud.tencent.com/document/api/614/56438)获取机器组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * ip
- 按照ip进行过滤。
- 类型：String
- 必选：否

instance
- 按照实例id进行过滤。
- 类型：String
- 必选：否

version
- 按照LogListener版本进行过滤。
- 类型：String
- 必选：否

status
- 按照机器状态进行过滤。
- 类型：String
- 必选：否
- 可选值：0：离线，1：正常

offlineTime
- 按照机器离线时间进行过滤。
- 类型：String
- 必选：否
- -可选值：0：无离线时间，12：12小时内，24：一天内，48：两天内，99：两天前

每次请求的Filters的上限为10，Filter.Values的上限为100。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页的偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页限制数目。最大支持100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 查询的机器组ID。

- 通过[获取机器组列表](https://cloud.tencent.com/document/api/614/56438)获取机器组ID。 
     * @return GroupId 查询的机器组ID。

- 通过[获取机器组列表](https://cloud.tencent.com/document/api/614/56438)获取机器组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 查询的机器组ID。

- 通过[获取机器组列表](https://cloud.tencent.com/document/api/614/56438)获取机器组ID。
     * @param GroupId 查询的机器组ID。

- 通过[获取机器组列表](https://cloud.tencent.com/document/api/614/56438)获取机器组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get ip
- 按照ip进行过滤。
- 类型：String
- 必选：否

instance
- 按照实例id进行过滤。
- 类型：String
- 必选：否

version
- 按照LogListener版本进行过滤。
- 类型：String
- 必选：否

status
- 按照机器状态进行过滤。
- 类型：String
- 必选：否
- 可选值：0：离线，1：正常

offlineTime
- 按照机器离线时间进行过滤。
- 类型：String
- 必选：否
- -可选值：0：无离线时间，12：12小时内，24：一天内，48：两天内，99：两天前

每次请求的Filters的上限为10，Filter.Values的上限为100。 
     * @return Filters ip
- 按照ip进行过滤。
- 类型：String
- 必选：否

instance
- 按照实例id进行过滤。
- 类型：String
- 必选：否

version
- 按照LogListener版本进行过滤。
- 类型：String
- 必选：否

status
- 按照机器状态进行过滤。
- 类型：String
- 必选：否
- 可选值：0：离线，1：正常

offlineTime
- 按照机器离线时间进行过滤。
- 类型：String
- 必选：否
- -可选值：0：无离线时间，12：12小时内，24：一天内，48：两天内，99：两天前

每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set ip
- 按照ip进行过滤。
- 类型：String
- 必选：否

instance
- 按照实例id进行过滤。
- 类型：String
- 必选：否

version
- 按照LogListener版本进行过滤。
- 类型：String
- 必选：否

status
- 按照机器状态进行过滤。
- 类型：String
- 必选：否
- 可选值：0：离线，1：正常

offlineTime
- 按照机器离线时间进行过滤。
- 类型：String
- 必选：否
- -可选值：0：无离线时间，12：12小时内，24：一天内，48：两天内，99：两天前

每次请求的Filters的上限为10，Filter.Values的上限为100。
     * @param Filters ip
- 按照ip进行过滤。
- 类型：String
- 必选：否

instance
- 按照实例id进行过滤。
- 类型：String
- 必选：否

version
- 按照LogListener版本进行过滤。
- 类型：String
- 必选：否

status
- 按照机器状态进行过滤。
- 类型：String
- 必选：否
- 可选值：0：离线，1：正常

offlineTime
- 按照机器离线时间进行过滤。
- 类型：String
- 必选：否
- -可选值：0：无离线时间，12：12小时内，24：一天内，48：两天内，99：两天前

每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页的偏移量。 
     * @return Offset 分页的偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量。
     * @param Offset 分页的偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页限制数目。最大支持100 
     * @return Limit 分页单页限制数目。最大支持100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页限制数目。最大支持100
     * @param Limit 分页单页限制数目。最大支持100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesRequest(DescribeMachinesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

