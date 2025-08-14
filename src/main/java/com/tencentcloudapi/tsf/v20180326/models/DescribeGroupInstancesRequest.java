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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupInstancesRequest extends AbstractModel {

    /**
    * 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 搜索字段
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型；0：升序，1：降序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量，默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数；默认值：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。 
     * @return GroupId 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
     * @param GroupId 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 搜索字段 
     * @return SearchWord 搜索字段
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索字段
     * @param SearchWord 搜索字段
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 排序字段 
     * @return OrderBy 排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段
     * @param OrderBy 排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型；0：升序，1：降序 
     * @return OrderType 排序类型；0：升序，1：降序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型；0：升序，1：降序
     * @param OrderType 排序类型；0：升序，1：降序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 偏移量，默认值：0 
     * @return Offset 偏移量，默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值：0
     * @param Offset 偏移量，默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数；默认值：20 
     * @return Limit 分页个数；默认值：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数；默认值：20
     * @param Limit 分页个数；默认值：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGroupInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupInstancesRequest(DescribeGroupInstancesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
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
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

