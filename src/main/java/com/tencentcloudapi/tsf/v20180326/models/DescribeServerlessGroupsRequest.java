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

public class DescribeServerlessGroupsRequest extends AbstractModel{

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
    private String OrderType;

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
    * 分组所属名字空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 分组所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 无
    */
    @SerializedName("GroupIdList")
    @Expose
    private String [] GroupIdList;

    /**
     * Get 搜索字段，模糊搜索groupName字段 
     * @return SearchWord 搜索字段，模糊搜索groupName字段
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索字段，模糊搜索groupName字段
     * @param SearchWord 搜索字段，模糊搜索groupName字段
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 分组所属应用ID 
     * @return ApplicationId 分组所属应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 分组所属应用ID
     * @param ApplicationId 分组所属应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 排序字段，默认为 createTime字段，支持id， name， createTime 
     * @return OrderBy 排序字段，默认为 createTime字段，支持id， name， createTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，默认为 createTime字段，支持id， name， createTime
     * @param OrderBy 排序字段，默认为 createTime字段，支持id， name， createTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，默认为1：倒序排序，0：正序，1：倒序 
     * @return OrderType 排序方式，默认为1：倒序排序，0：正序，1：倒序
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式，默认为1：倒序排序，0：正序，1：倒序
     * @param OrderType 排序方式，默认为1：倒序排序，0：正序，1：倒序
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 偏移量，取值从0开始 
     * @return Offset 偏移量，取值从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值从0开始
     * @param Offset 偏移量，取值从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数，默认为20， 取值应为1~50 
     * @return Limit 分页个数，默认为20， 取值应为1~50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数，默认为20， 取值应为1~50
     * @param Limit 分页个数，默认为20， 取值应为1~50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分组所属名字空间ID 
     * @return NamespaceId 分组所属名字空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 分组所属名字空间ID
     * @param NamespaceId 分组所属名字空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 分组所属集群ID 
     * @return ClusterId 分组所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分组所属集群ID
     * @param ClusterId 分组所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 无 
     * @return GroupIdList 无
     */
    public String [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * Set 无
     * @param GroupIdList 无
     */
    public void setGroupIdList(String [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    public DescribeServerlessGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessGroupsRequest(DescribeServerlessGroupsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupIdList != null) {
            this.GroupIdList = new String[source.GroupIdList.length];
            for (int i = 0; i < source.GroupIdList.length; i++) {
                this.GroupIdList[i] = new String(source.GroupIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);

    }
}

