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

public class DescribeContainerGroupsRequest extends AbstractModel {

    /**
    * <p>分组所属【应用ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36090">DescribeApplications</a>查询已创建的应用列表或登录<a href="https://console.cloud.tencent.com/tsf/app?rid=1">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36094">CreateApplication</a>创建新的应用。</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>搜索字段，模糊搜索groupName字段</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>排序字段，默认为 createTime字段，支持id， name， createTime</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式，默认为1：倒序排序，0：正序，1：倒序</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>偏移量，取值从0开始</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页个数，默认为20， 取值应为1~50</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分组所属【集群ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/85857">DescribeClusters</a>查询已创建的集群列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=docker">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36049">CreateCluster</a>创建新的集群。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>分组所属【命名空间 ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36096">DescribeSimpleNamespaces</a>查询已创建的命名空间列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=namespace">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * <p>部署组ID列表</p>
    */
    @SerializedName("GroupIdList")
    @Expose
    private String [] GroupIdList;

    /**
     * Get <p>分组所属【应用ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36090">DescribeApplications</a>查询已创建的应用列表或登录<a href="https://console.cloud.tencent.com/tsf/app?rid=1">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36094">CreateApplication</a>创建新的应用。</p> 
     * @return ApplicationId <p>分组所属【应用ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36090">DescribeApplications</a>查询已创建的应用列表或登录<a href="https://console.cloud.tencent.com/tsf/app?rid=1">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36094">CreateApplication</a>创建新的应用。</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>分组所属【应用ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36090">DescribeApplications</a>查询已创建的应用列表或登录<a href="https://console.cloud.tencent.com/tsf/app?rid=1">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36094">CreateApplication</a>创建新的应用。</p>
     * @param ApplicationId <p>分组所属【应用ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36090">DescribeApplications</a>查询已创建的应用列表或登录<a href="https://console.cloud.tencent.com/tsf/app?rid=1">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36094">CreateApplication</a>创建新的应用。</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>搜索字段，模糊搜索groupName字段</p> 
     * @return SearchWord <p>搜索字段，模糊搜索groupName字段</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>搜索字段，模糊搜索groupName字段</p>
     * @param SearchWord <p>搜索字段，模糊搜索groupName字段</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>排序字段，默认为 createTime字段，支持id， name， createTime</p> 
     * @return OrderBy <p>排序字段，默认为 createTime字段，支持id， name， createTime</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，默认为 createTime字段，支持id， name， createTime</p>
     * @param OrderBy <p>排序字段，默认为 createTime字段，支持id， name， createTime</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式，默认为1：倒序排序，0：正序，1：倒序</p> 
     * @return OrderType <p>排序方式，默认为1：倒序排序，0：正序，1：倒序</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式，默认为1：倒序排序，0：正序，1：倒序</p>
     * @param OrderType <p>排序方式，默认为1：倒序排序，0：正序，1：倒序</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>偏移量，取值从0开始</p> 
     * @return Offset <p>偏移量，取值从0开始</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，取值从0开始</p>
     * @param Offset <p>偏移量，取值从0开始</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页个数，默认为20， 取值应为1~50</p> 
     * @return Limit <p>分页个数，默认为20， 取值应为1~50</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页个数，默认为20， 取值应为1~50</p>
     * @param Limit <p>分页个数，默认为20， 取值应为1~50</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分组所属【集群ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/85857">DescribeClusters</a>查询已创建的集群列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=docker">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36049">CreateCluster</a>创建新的集群。</p> 
     * @return ClusterId <p>分组所属【集群ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/85857">DescribeClusters</a>查询已创建的集群列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=docker">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36049">CreateCluster</a>创建新的集群。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>分组所属【集群ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/85857">DescribeClusters</a>查询已创建的集群列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=docker">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36049">CreateCluster</a>创建新的集群。</p>
     * @param ClusterId <p>分组所属【集群ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/85857">DescribeClusters</a>查询已创建的集群列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=docker">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36049">CreateCluster</a>创建新的集群。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>分组所属【命名空间 ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36096">DescribeSimpleNamespaces</a>查询已创建的命名空间列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=namespace">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p> 
     * @return NamespaceId <p>分组所属【命名空间 ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36096">DescribeSimpleNamespaces</a>查询已创建的命名空间列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=namespace">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>分组所属【命名空间 ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36096">DescribeSimpleNamespaces</a>查询已创建的命名空间列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=namespace">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
     * @param NamespaceId <p>分组所属【命名空间 ID】，可通过调用<a href="https://cloud.tencent.com/document/product/649/36096">DescribeSimpleNamespaces</a>查询已创建的命名空间列表或登录<a href="https://console.cloud.tencent.com/tsf/resource?rid=1&amp;tab=namespace">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>部署组ID列表</p> 
     * @return GroupIdList <p>部署组ID列表</p>
     */
    public String [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * Set <p>部署组ID列表</p>
     * @param GroupIdList <p>部署组ID列表</p>
     */
    public void setGroupIdList(String [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    public DescribeContainerGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerGroupsRequest(DescribeContainerGroupsRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
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
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);

    }
}

