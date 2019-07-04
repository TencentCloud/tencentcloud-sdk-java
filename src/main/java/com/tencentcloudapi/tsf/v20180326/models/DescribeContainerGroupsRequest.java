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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContainerGroupsRequest  extends AbstractModel{

    /**
    * 搜索字段，模糊搜索groupName字段
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 分组所属应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 排序字段，默认为 createTime字段，支持id， name， createTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，默认为1：倒序排序，0：正序，1：倒序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量，取值从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数，默认为20， 取值应为1~50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间 ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
     * 获取搜索字段，模糊搜索groupName字段
     * @return SearchWord 搜索字段，模糊搜索groupName字段
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * 设置搜索字段，模糊搜索groupName字段
     * @param SearchWord 搜索字段，模糊搜索groupName字段
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * 获取分组所属应用ID
     * @return ApplicationId 分组所属应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置分组所属应用ID
     * @param ApplicationId 分组所属应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取排序字段，默认为 createTime字段，支持id， name， createTime
     * @return OrderBy 排序字段，默认为 createTime字段，支持id， name， createTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置排序字段，默认为 createTime字段，支持id， name， createTime
     * @param OrderBy 排序字段，默认为 createTime字段，支持id， name， createTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取排序方式，默认为1：倒序排序，0：正序，1：倒序
     * @return OrderType 排序方式，默认为1：倒序排序，0：正序，1：倒序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * 设置排序方式，默认为1：倒序排序，0：正序，1：倒序
     * @param OrderType 排序方式，默认为1：倒序排序，0：正序，1：倒序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * 获取偏移量，取值从0开始
     * @return Offset 偏移量，取值从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，取值从0开始
     * @param Offset 偏移量，取值从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页个数，默认为20， 取值应为1~50
     * @return Limit 分页个数，默认为20， 取值应为1~50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页个数，默认为20， 取值应为1~50
     * @param Limit 分页个数，默认为20， 取值应为1~50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取集群ID
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取命名空间 ID
     * @return NamespaceId 命名空间 ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * 设置命名空间 ID
     * @param NamespaceId 命名空间 ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);

    }
}

