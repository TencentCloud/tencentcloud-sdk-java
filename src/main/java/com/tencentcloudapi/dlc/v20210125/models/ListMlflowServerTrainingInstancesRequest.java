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

public class ListMlflowServerTrainingInstancesRequest extends AbstractModel {

    /**
    * <p>MlFlowServer的ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>分页过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分页筛选条件</p>
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
    * <p>分页开始时间范围</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>分页结束时间范围</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>分页当前页号</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>分页每页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>MlFlowServer的ID</p> 
     * @return ServerId <p>MlFlowServer的ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MlFlowServer的ID</p>
     * @param ServerId <p>MlFlowServer的ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>分页过滤条件</p> 
     * @return Filters <p>分页过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>分页过滤条件</p>
     * @param Filters <p>分页过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页筛选条件</p> 
     * @return SortFields <p>分页筛选条件</p>
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set <p>分页筛选条件</p>
     * @param SortFields <p>分页筛选条件</p>
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    /**
     * Get <p>分页开始时间范围</p> 
     * @return StartTime <p>分页开始时间范围</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>分页开始时间范围</p>
     * @param StartTime <p>分页开始时间范围</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>分页结束时间范围</p> 
     * @return EndTime <p>分页结束时间范围</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>分页结束时间范围</p>
     * @param EndTime <p>分页结束时间范围</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页当前页号</p> 
     * @return Page <p>分页当前页号</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>分页当前页号</p>
     * @param Page <p>分页当前页号</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>分页每页大小</p> 
     * @return PageSize <p>分页每页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页每页大小</p>
     * @param PageSize <p>分页每页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListMlflowServerTrainingInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListMlflowServerTrainingInstancesRequest(ListMlflowServerTrainingInstancesRequest source) {
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
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
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

