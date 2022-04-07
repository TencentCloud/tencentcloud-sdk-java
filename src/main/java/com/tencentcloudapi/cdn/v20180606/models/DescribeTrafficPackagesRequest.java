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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficPackagesRequest extends AbstractModel{

    /**
    * 分页查询起始地址，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询记录个数，默认100，最大1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 流量包排序方式，支持以下值：
expireTimeDesc：默认值，按过期时间倒序
expireTimeAsc：按过期时间正序
createTimeDesc：按创建时间倒序
createTimeAsc：按创建时间正序
status：按状态排序，正常抵扣>未生效>已用尽>已过期
channel：按来源排序，主动购买>自动续订>CDN赠送
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
     * Get 分页查询起始地址，默认 0 
     * @return Offset 分页查询起始地址，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询起始地址，默认 0
     * @param Offset 分页查询起始地址，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询记录个数，默认100，最大1000 
     * @return Limit 分页查询记录个数，默认100，最大1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询记录个数，默认100，最大1000
     * @param Limit 分页查询记录个数，默认100，最大1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 流量包排序方式，支持以下值：
expireTimeDesc：默认值，按过期时间倒序
expireTimeAsc：按过期时间正序
createTimeDesc：按创建时间倒序
createTimeAsc：按创建时间正序
status：按状态排序，正常抵扣>未生效>已用尽>已过期
channel：按来源排序，主动购买>自动续订>CDN赠送 
     * @return SortBy 流量包排序方式，支持以下值：
expireTimeDesc：默认值，按过期时间倒序
expireTimeAsc：按过期时间正序
createTimeDesc：按创建时间倒序
createTimeAsc：按创建时间正序
status：按状态排序，正常抵扣>未生效>已用尽>已过期
channel：按来源排序，主动购买>自动续订>CDN赠送
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 流量包排序方式，支持以下值：
expireTimeDesc：默认值，按过期时间倒序
expireTimeAsc：按过期时间正序
createTimeDesc：按创建时间倒序
createTimeAsc：按创建时间正序
status：按状态排序，正常抵扣>未生效>已用尽>已过期
channel：按来源排序，主动购买>自动续订>CDN赠送
     * @param SortBy 流量包排序方式，支持以下值：
expireTimeDesc：默认值，按过期时间倒序
expireTimeAsc：按过期时间正序
createTimeDesc：按创建时间倒序
createTimeAsc：按创建时间正序
status：按状态排序，正常抵扣>未生效>已用尽>已过期
channel：按来源排序，主动购买>自动续订>CDN赠送
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficPackagesRequest(DescribeTrafficPackagesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);

    }
}

