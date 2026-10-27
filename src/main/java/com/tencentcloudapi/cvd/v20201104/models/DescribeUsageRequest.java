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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageRequest extends AbstractModel {

    /**
    * 查询起始时间，最小不能超过当前时间 90 天前，取 unix 时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询截止时间，取 unix 时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 每页查询信息条数，默认 20，最大 100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页号，起始页为 1，不填默认为 1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 查询key，每次查询会返回
    */
    @SerializedName("QueryKey")
    @Expose
    private String QueryKey;

    /**
    * 查询条件，Name可选为：
InstanceId按照实例ID搜索
UserName按照绑定的用户搜索，只取Values的第一个值
ChareType按照计费类型搜索
InstanceType按照实例类型搜索
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 指定的排序方式，默认不排序
1:使用时间，升序
2:使用时间，降序
3:空闲时间，升序
4:空闲时间，降序
    */
    @SerializedName("SortType")
    @Expose
    private Long SortType;

    /**
     * Get 查询起始时间，最小不能超过当前时间 90 天前，取 unix 时间戳 
     * @return StartTime 查询起始时间，最小不能超过当前时间 90 天前，取 unix 时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间，最小不能超过当前时间 90 天前，取 unix 时间戳
     * @param StartTime 查询起始时间，最小不能超过当前时间 90 天前，取 unix 时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询截止时间，取 unix 时间戳 
     * @return EndTime 查询截止时间，取 unix 时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询截止时间，取 unix 时间戳
     * @param EndTime 查询截止时间，取 unix 时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 每页查询信息条数，默认 20，最大 100 
     * @return PageSize 每页查询信息条数，默认 20，最大 100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页查询信息条数，默认 20，最大 100
     * @param PageSize 每页查询信息条数，默认 20，最大 100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页号，起始页为 1，不填默认为 1 
     * @return PageNumber 页号，起始页为 1，不填默认为 1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号，起始页为 1，不填默认为 1
     * @param PageNumber 页号，起始页为 1，不填默认为 1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 查询key，每次查询会返回 
     * @return QueryKey 查询key，每次查询会返回
     */
    public String getQueryKey() {
        return this.QueryKey;
    }

    /**
     * Set 查询key，每次查询会返回
     * @param QueryKey 查询key，每次查询会返回
     */
    public void setQueryKey(String QueryKey) {
        this.QueryKey = QueryKey;
    }

    /**
     * Get 查询条件，Name可选为：
InstanceId按照实例ID搜索
UserName按照绑定的用户搜索，只取Values的第一个值
ChareType按照计费类型搜索
InstanceType按照实例类型搜索 
     * @return Filters 查询条件，Name可选为：
InstanceId按照实例ID搜索
UserName按照绑定的用户搜索，只取Values的第一个值
ChareType按照计费类型搜索
InstanceType按照实例类型搜索
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件，Name可选为：
InstanceId按照实例ID搜索
UserName按照绑定的用户搜索，只取Values的第一个值
ChareType按照计费类型搜索
InstanceType按照实例类型搜索
     * @param Filters 查询条件，Name可选为：
InstanceId按照实例ID搜索
UserName按照绑定的用户搜索，只取Values的第一个值
ChareType按照计费类型搜索
InstanceType按照实例类型搜索
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 指定的排序方式，默认不排序
1:使用时间，升序
2:使用时间，降序
3:空闲时间，升序
4:空闲时间，降序 
     * @return SortType 指定的排序方式，默认不排序
1:使用时间，升序
2:使用时间，降序
3:空闲时间，升序
4:空闲时间，降序
     */
    public Long getSortType() {
        return this.SortType;
    }

    /**
     * Set 指定的排序方式，默认不排序
1:使用时间，升序
2:使用时间，降序
3:空闲时间，升序
4:空闲时间，降序
     * @param SortType 指定的排序方式，默认不排序
1:使用时间，升序
2:使用时间，降序
3:空闲时间，升序
4:空闲时间，降序
     */
    public void setSortType(Long SortType) {
        this.SortType = SortType;
    }

    public DescribeUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageRequest(DescribeUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.QueryKey != null) {
            this.QueryKey = new String(source.QueryKey);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortType != null) {
            this.SortType = new Long(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "QueryKey", this.QueryKey);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

