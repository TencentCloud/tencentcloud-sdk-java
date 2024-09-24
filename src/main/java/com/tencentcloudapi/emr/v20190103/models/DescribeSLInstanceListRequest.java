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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSLInstanceListRequest extends AbstractModel {

    /**
    * 实例筛选策略。取值范围：<li>clusterList：表示查询除了已销毁实例之外的实例列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的实例之外的实例列表。</li>
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * 页编号，默认值为0，表示第一页。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回数量，默认值为10，最大值为100。	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
    * 自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li>根据clusterName过滤实例：[{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>根据ClusterStatus过滤实例：[{"Name": "ClusterStatus","Values": ["2"]}]</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 实例筛选策略。取值范围：<li>clusterList：表示查询除了已销毁实例之外的实例列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的实例之外的实例列表。</li> 
     * @return DisplayStrategy 实例筛选策略。取值范围：<li>clusterList：表示查询除了已销毁实例之外的实例列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的实例之外的实例列表。</li>
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set 实例筛选策略。取值范围：<li>clusterList：表示查询除了已销毁实例之外的实例列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的实例之外的实例列表。</li>
     * @param DisplayStrategy 实例筛选策略。取值范围：<li>clusterList：表示查询除了已销毁实例之外的实例列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的实例之外的实例列表。</li>
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get 页编号，默认值为0，表示第一页。 
     * @return Offset 页编号，默认值为0，表示第一页。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页编号，默认值为0，表示第一页。
     * @param Offset 页编号，默认值为0，表示第一页。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回数量，默认值为10，最大值为100。	 
     * @return Limit 每页返回数量，默认值为10，最大值为100。	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量，默认值为10，最大值为100。	
     * @param Limit 每页返回数量，默认值为10，最大值为100。	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li> 
     * @return OrderField 排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li>
     * @param OrderField 排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。 
     * @return Asc 按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set 按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。
     * @param Asc 按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    /**
     * Get 自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li>根据clusterName过滤实例：[{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>根据ClusterStatus过滤实例：[{"Name": "ClusterStatus","Values": ["2"]}]</li> 
     * @return Filters 自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li>根据clusterName过滤实例：[{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>根据ClusterStatus过滤实例：[{"Name": "ClusterStatus","Values": ["2"]}]</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li>根据clusterName过滤实例：[{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>根据ClusterStatus过滤实例：[{"Name": "ClusterStatus","Values": ["2"]}]</li>
     * @param Filters 自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li>根据clusterName过滤实例：[{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>根据ClusterStatus过滤实例：[{"Name": "ClusterStatus","Values": ["2"]}]</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSLInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSLInstanceListRequest(DescribeSLInstanceListRequest source) {
        if (source.DisplayStrategy != null) {
            this.DisplayStrategy = new String(source.DisplayStrategy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Asc != null) {
            this.Asc = new Long(source.Asc);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayStrategy", this.DisplayStrategy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

