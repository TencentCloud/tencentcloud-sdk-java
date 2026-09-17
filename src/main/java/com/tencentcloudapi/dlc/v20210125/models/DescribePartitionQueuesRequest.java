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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePartitionQueuesRequest extends AbstractModel {

    /**
    * 分区编码
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * 排序字段列表
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
    * 筛选条件列表
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页返回数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 是否返回队列实时余量（ResourceQuotas），默认 false 不返回。余量需实时查询 Prometheus，仅在需要时透传 true。Used 为计费 spec 口径（队列内业务容器 Pod limits，经 kube_pod_labels 队列过滤），依赖 kube_pod_labels 指标采集
    */
    @SerializedName("ShowResourceQuotas")
    @Expose
    private Boolean ShowResourceQuotas;

    /**
     * Get 分区编码 
     * @return PartitionCode 分区编码
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set 分区编码
     * @param PartitionCode 分区编码
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get 排序字段列表 
     * @return SortFields 排序字段列表
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set 排序字段列表
     * @param SortFields 排序字段列表
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    /**
     * Get 筛选条件列表 
     * @return Filters 筛选条件列表
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件列表
     * @param Filters 筛选条件列表
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页返回数量 
     * @return PageSize 每页返回数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页返回数量
     * @param PageSize 每页返回数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 是否返回队列实时余量（ResourceQuotas），默认 false 不返回。余量需实时查询 Prometheus，仅在需要时透传 true。Used 为计费 spec 口径（队列内业务容器 Pod limits，经 kube_pod_labels 队列过滤），依赖 kube_pod_labels 指标采集 
     * @return ShowResourceQuotas 是否返回队列实时余量（ResourceQuotas），默认 false 不返回。余量需实时查询 Prometheus，仅在需要时透传 true。Used 为计费 spec 口径（队列内业务容器 Pod limits，经 kube_pod_labels 队列过滤），依赖 kube_pod_labels 指标采集
     */
    public Boolean getShowResourceQuotas() {
        return this.ShowResourceQuotas;
    }

    /**
     * Set 是否返回队列实时余量（ResourceQuotas），默认 false 不返回。余量需实时查询 Prometheus，仅在需要时透传 true。Used 为计费 spec 口径（队列内业务容器 Pod limits，经 kube_pod_labels 队列过滤），依赖 kube_pod_labels 指标采集
     * @param ShowResourceQuotas 是否返回队列实时余量（ResourceQuotas），默认 false 不返回。余量需实时查询 Prometheus，仅在需要时透传 true。Used 为计费 spec 口径（队列内业务容器 Pod limits，经 kube_pod_labels 队列过滤），依赖 kube_pod_labels 指标采集
     */
    public void setShowResourceQuotas(Boolean ShowResourceQuotas) {
        this.ShowResourceQuotas = ShowResourceQuotas;
    }

    public DescribePartitionQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePartitionQueuesRequest(DescribePartitionQueuesRequest source) {
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.SortFields != null) {
            this.SortFields = new SortField[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new SortField(source.SortFields[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ShowResourceQuotas != null) {
            this.ShowResourceQuotas = new Boolean(source.ShowResourceQuotas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ShowResourceQuotas", this.ShowResourceQuotas);

    }
}

