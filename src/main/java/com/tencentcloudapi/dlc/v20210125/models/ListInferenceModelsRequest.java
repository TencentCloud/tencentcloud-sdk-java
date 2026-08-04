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

public class ListInferenceModelsRequest extends AbstractModel {

    /**
    * <p>页码（从1开始）</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页数量（最大 200）</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>过滤器</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
    * <p>模型参数最小值</p>
    */
    @SerializedName("ParameterSizeMin")
    @Expose
    private Float ParameterSizeMin;

    /**
    * <p>模型参数最大值</p>
    */
    @SerializedName("ParameterSizeMax")
    @Expose
    private Float ParameterSizeMax;

    /**
     * Get <p>页码（从1开始）</p> 
     * @return Page <p>页码（从1开始）</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码（从1开始）</p>
     * @param Page <p>页码（从1开始）</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页数量（最大 200）</p> 
     * @return PageSize <p>每页数量（最大 200）</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量（最大 200）</p>
     * @param PageSize <p>每页数量（最大 200）</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>过滤器</p> 
     * @return Filters <p>过滤器</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器</p>
     * @param Filters <p>过滤器</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段</p> 
     * @return SortFields <p>排序字段</p>
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set <p>排序字段</p>
     * @param SortFields <p>排序字段</p>
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    /**
     * Get <p>模型参数最小值</p> 
     * @return ParameterSizeMin <p>模型参数最小值</p>
     */
    public Float getParameterSizeMin() {
        return this.ParameterSizeMin;
    }

    /**
     * Set <p>模型参数最小值</p>
     * @param ParameterSizeMin <p>模型参数最小值</p>
     */
    public void setParameterSizeMin(Float ParameterSizeMin) {
        this.ParameterSizeMin = ParameterSizeMin;
    }

    /**
     * Get <p>模型参数最大值</p> 
     * @return ParameterSizeMax <p>模型参数最大值</p>
     */
    public Float getParameterSizeMax() {
        return this.ParameterSizeMax;
    }

    /**
     * Set <p>模型参数最大值</p>
     * @param ParameterSizeMax <p>模型参数最大值</p>
     */
    public void setParameterSizeMax(Float ParameterSizeMax) {
        this.ParameterSizeMax = ParameterSizeMax;
    }

    public ListInferenceModelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListInferenceModelsRequest(ListInferenceModelsRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortFields != null) {
            this.SortFields = new SortField[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new SortField(source.SortFields[i]);
            }
        }
        if (source.ParameterSizeMin != null) {
            this.ParameterSizeMin = new Float(source.ParameterSizeMin);
        }
        if (source.ParameterSizeMax != null) {
            this.ParameterSizeMax = new Float(source.ParameterSizeMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);
        this.setParamSimple(map, prefix + "ParameterSizeMin", this.ParameterSizeMin);
        this.setParamSimple(map, prefix + "ParameterSizeMax", this.ParameterSizeMax);

    }
}

