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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesListRequest extends AbstractModel {

    /**
    * <p>集群筛选策略。取值范围：<li>clusterList：表示查询除了已销毁集群之外的集群列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的集群之外的集群列表。</li><li>cloudHardwareManage/componentManage：目前这两个取值为预留取值，暂时和monitorManage表示同样的含义。</li></p>
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * <p>页编号，默认值为0，表示第一页。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回数量，默认值为100，最大值为100。<br>如果limit和offset都为0，则查询全部记录；</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li></p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。</p>
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
    * <p>自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{&quot;Name&quot;:&quot;ClusterId&quot;,&quot;Values&quot;:[&quot;emr-xxxxxxxx&quot;]}]</li><li>根据clusterName过滤实例：[{&quot;Name&quot;: &quot;ClusterName&quot;,&quot;Values&quot;: [&quot;cluster_name&quot;]}]</li><li>根据ClusterStatus过滤实例：[{&quot;Name&quot;: &quot;ClusterStatus&quot;,&quot;Values&quot;: [&quot;2&quot;]}]</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>默认0为普通集群，2为tke集群</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>是否返回需要密码信息</p>
    */
    @SerializedName("NeedMcpPasswordInfo")
    @Expose
    private Boolean NeedMcpPasswordInfo;

    /**
     * Get <p>集群筛选策略。取值范围：<li>clusterList：表示查询除了已销毁集群之外的集群列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的集群之外的集群列表。</li><li>cloudHardwareManage/componentManage：目前这两个取值为预留取值，暂时和monitorManage表示同样的含义。</li></p> 
     * @return DisplayStrategy <p>集群筛选策略。取值范围：<li>clusterList：表示查询除了已销毁集群之外的集群列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的集群之外的集群列表。</li><li>cloudHardwareManage/componentManage：目前这两个取值为预留取值，暂时和monitorManage表示同样的含义。</li></p>
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set <p>集群筛选策略。取值范围：<li>clusterList：表示查询除了已销毁集群之外的集群列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的集群之外的集群列表。</li><li>cloudHardwareManage/componentManage：目前这两个取值为预留取值，暂时和monitorManage表示同样的含义。</li></p>
     * @param DisplayStrategy <p>集群筛选策略。取值范围：<li>clusterList：表示查询除了已销毁集群之外的集群列表。</li><li>monitorManage：表示查询除了已销毁、创建中以及创建失败的集群之外的集群列表。</li><li>cloudHardwareManage/componentManage：目前这两个取值为预留取值，暂时和monitorManage表示同样的含义。</li></p>
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get <p>页编号，默认值为0，表示第一页。</p> 
     * @return Offset <p>页编号，默认值为0，表示第一页。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>页编号，默认值为0，表示第一页。</p>
     * @param Offset <p>页编号，默认值为0，表示第一页。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回数量，默认值为100，最大值为100。<br>如果limit和offset都为0，则查询全部记录；</p> 
     * @return Limit <p>每页返回数量，默认值为100，最大值为100。<br>如果limit和offset都为0，则查询全部记录；</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量，默认值为100，最大值为100。<br>如果limit和offset都为0，则查询全部记录；</p>
     * @param Limit <p>每页返回数量，默认值为100，最大值为100。<br>如果limit和offset都为0，则查询全部记录；</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li></p> 
     * @return OrderField <p>排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li></p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li></p>
     * @param OrderField <p>排序字段。取值范围：<li>clusterId：表示按照实例ID排序。</li><li>addTime：表示按照实例创建时间排序。</li><li>status：表示按照实例的状态码排序。</li></p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。</p> 
     * @return Asc <p>按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。</p>
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set <p>按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。</p>
     * @param Asc <p>按照OrderField升序或者降序进行排序。取值范围：<li>0：表示升序。</li><li>1：表示降序。</li>默认值为0。</p>
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    /**
     * Get <p>自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{&quot;Name&quot;:&quot;ClusterId&quot;,&quot;Values&quot;:[&quot;emr-xxxxxxxx&quot;]}]</li><li>根据clusterName过滤实例：[{&quot;Name&quot;: &quot;ClusterName&quot;,&quot;Values&quot;: [&quot;cluster_name&quot;]}]</li><li>根据ClusterStatus过滤实例：[{&quot;Name&quot;: &quot;ClusterStatus&quot;,&quot;Values&quot;: [&quot;2&quot;]}]</li></p> 
     * @return Filters <p>自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{&quot;Name&quot;:&quot;ClusterId&quot;,&quot;Values&quot;:[&quot;emr-xxxxxxxx&quot;]}]</li><li>根据clusterName过滤实例：[{&quot;Name&quot;: &quot;ClusterName&quot;,&quot;Values&quot;: [&quot;cluster_name&quot;]}]</li><li>根据ClusterStatus过滤实例：[{&quot;Name&quot;: &quot;ClusterStatus&quot;,&quot;Values&quot;: [&quot;2&quot;]}]</li></p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{&quot;Name&quot;:&quot;ClusterId&quot;,&quot;Values&quot;:[&quot;emr-xxxxxxxx&quot;]}]</li><li>根据clusterName过滤实例：[{&quot;Name&quot;: &quot;ClusterName&quot;,&quot;Values&quot;: [&quot;cluster_name&quot;]}]</li><li>根据ClusterStatus过滤实例：[{&quot;Name&quot;: &quot;ClusterStatus&quot;,&quot;Values&quot;: [&quot;2&quot;]}]</li></p>
     * @param Filters <p>自定义查询过滤器。示例：<li>根据ClusterId过滤实例：[{&quot;Name&quot;:&quot;ClusterId&quot;,&quot;Values&quot;:[&quot;emr-xxxxxxxx&quot;]}]</li><li>根据clusterName过滤实例：[{&quot;Name&quot;: &quot;ClusterName&quot;,&quot;Values&quot;: [&quot;cluster_name&quot;]}]</li><li>根据ClusterStatus过滤实例：[{&quot;Name&quot;: &quot;ClusterStatus&quot;,&quot;Values&quot;: [&quot;2&quot;]}]</li></p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>默认0为普通集群，2为tke集群</p> 
     * @return ClusterType <p>默认0为普通集群，2为tke集群</p>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>默认0为普通集群，2为tke集群</p>
     * @param ClusterType <p>默认0为普通集群，2为tke集群</p>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>是否返回需要密码信息</p> 
     * @return NeedMcpPasswordInfo <p>是否返回需要密码信息</p>
     */
    public Boolean getNeedMcpPasswordInfo() {
        return this.NeedMcpPasswordInfo;
    }

    /**
     * Set <p>是否返回需要密码信息</p>
     * @param NeedMcpPasswordInfo <p>是否返回需要密码信息</p>
     */
    public void setNeedMcpPasswordInfo(Boolean NeedMcpPasswordInfo) {
        this.NeedMcpPasswordInfo = NeedMcpPasswordInfo;
    }

    public DescribeInstancesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesListRequest(DescribeInstancesListRequest source) {
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
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.NeedMcpPasswordInfo != null) {
            this.NeedMcpPasswordInfo = new Boolean(source.NeedMcpPasswordInfo);
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
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NeedMcpPasswordInfo", this.NeedMcpPasswordInfo);

    }
}

