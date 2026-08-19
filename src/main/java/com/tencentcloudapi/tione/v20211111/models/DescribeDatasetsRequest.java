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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatasetsRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>数据集id列表</p>
    */
    @SerializedName("DatasetIds")
    @Expose
    private String [] DatasetIds;

    /**
    * <p>数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String<br>DatasetName，数据集名称<br>DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>标签过滤条件</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>排序值，支持Asc或Desc，默认Desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段，支持CreateTime或UpdateTime，默认CreateTime</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>偏移值</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数据个数，默认20，最大支持200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否检查CFS。若开启，则在CFS挂载好之前，不会返回数据集列表。</p>
    */
    @SerializedName("CFSChecking")
    @Expose
    private Boolean CFSChecking;

    /**
    * <p>是否返回CFS详情。</p>
    */
    @SerializedName("CFSDetail")
    @Expose
    private Boolean CFSDetail;

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>数据集id列表</p> 
     * @return DatasetIds <p>数据集id列表</p>
     */
    public String [] getDatasetIds() {
        return this.DatasetIds;
    }

    /**
     * Set <p>数据集id列表</p>
     * @param DatasetIds <p>数据集id列表</p>
     */
    public void setDatasetIds(String [] DatasetIds) {
        this.DatasetIds = DatasetIds;
    }

    /**
     * Get <p>数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String<br>DatasetName，数据集名称<br>DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC</p> 
     * @return Filters <p>数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String<br>DatasetName，数据集名称<br>DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String<br>DatasetName，数据集名称<br>DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC</p>
     * @param Filters <p>数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String<br>DatasetName，数据集名称<br>DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>标签过滤条件</p> 
     * @return TagFilters <p>标签过滤条件</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤条件</p>
     * @param TagFilters <p>标签过滤条件</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>排序值，支持Asc或Desc，默认Desc</p> 
     * @return Order <p>排序值，支持Asc或Desc，默认Desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序值，支持Asc或Desc，默认Desc</p>
     * @param Order <p>排序值，支持Asc或Desc，默认Desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段，支持CreateTime或UpdateTime，默认CreateTime</p> 
     * @return OrderField <p>排序字段，支持CreateTime或UpdateTime，默认CreateTime</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段，支持CreateTime或UpdateTime，默认CreateTime</p>
     * @param OrderField <p>排序字段，支持CreateTime或UpdateTime，默认CreateTime</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>偏移值</p> 
     * @return Offset <p>偏移值</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移值</p>
     * @param Offset <p>偏移值</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数据个数，默认20，最大支持200</p> 
     * @return Limit <p>返回数据个数，默认20，最大支持200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数据个数，默认20，最大支持200</p>
     * @param Limit <p>返回数据个数，默认20，最大支持200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否检查CFS。若开启，则在CFS挂载好之前，不会返回数据集列表。</p> 
     * @return CFSChecking <p>是否检查CFS。若开启，则在CFS挂载好之前，不会返回数据集列表。</p>
     */
    public Boolean getCFSChecking() {
        return this.CFSChecking;
    }

    /**
     * Set <p>是否检查CFS。若开启，则在CFS挂载好之前，不会返回数据集列表。</p>
     * @param CFSChecking <p>是否检查CFS。若开启，则在CFS挂载好之前，不会返回数据集列表。</p>
     */
    public void setCFSChecking(Boolean CFSChecking) {
        this.CFSChecking = CFSChecking;
    }

    /**
     * Get <p>是否返回CFS详情。</p> 
     * @return CFSDetail <p>是否返回CFS详情。</p>
     */
    public Boolean getCFSDetail() {
        return this.CFSDetail;
    }

    /**
     * Set <p>是否返回CFS详情。</p>
     * @param CFSDetail <p>是否返回CFS详情。</p>
     */
    public void setCFSDetail(Boolean CFSDetail) {
        this.CFSDetail = CFSDetail;
    }

    public DescribeDatasetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetsRequest(DescribeDatasetsRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.DatasetIds != null) {
            this.DatasetIds = new String[source.DatasetIds.length];
            for (int i = 0; i < source.DatasetIds.length; i++) {
                this.DatasetIds[i] = new String(source.DatasetIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CFSChecking != null) {
            this.CFSChecking = new Boolean(source.CFSChecking);
        }
        if (source.CFSDetail != null) {
            this.CFSDetail = new Boolean(source.CFSDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamArraySimple(map, prefix + "DatasetIds.", this.DatasetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CFSChecking", this.CFSChecking);
        this.setParamSimple(map, prefix + "CFSDetail", this.CFSDetail);

    }
}

