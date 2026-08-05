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

public class ListModelVersionsRequest extends AbstractModel {

    /**
    * <p>模型UID</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>创建时间起始过滤-毫秒时间戳</p><p>单位：ms</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>创建时间截止过滤-毫秒时间戳</p><p>单位：ms</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>额外过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序字段列表</p>
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
    * <p>页码（默认1）</p><p>取值范围：[1, 2147483647]</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页数量（默认200）</p><p>取值范围：[1, 2147483647]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>模型UID</p> 
     * @return ModelUid <p>模型UID</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型UID</p>
     * @param ModelUid <p>模型UID</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>创建时间起始过滤-毫秒时间戳</p><p>单位：ms</p> 
     * @return StartTime <p>创建时间起始过滤-毫秒时间戳</p><p>单位：ms</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>创建时间起始过滤-毫秒时间戳</p><p>单位：ms</p>
     * @param StartTime <p>创建时间起始过滤-毫秒时间戳</p><p>单位：ms</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>创建时间截止过滤-毫秒时间戳</p><p>单位：ms</p> 
     * @return EndTime <p>创建时间截止过滤-毫秒时间戳</p><p>单位：ms</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>创建时间截止过滤-毫秒时间戳</p><p>单位：ms</p>
     * @param EndTime <p>创建时间截止过滤-毫秒时间戳</p><p>单位：ms</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>额外过滤条件</p> 
     * @return Filters <p>额外过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>额外过滤条件</p>
     * @param Filters <p>额外过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段列表</p> 
     * @return SortFields <p>排序字段列表</p>
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set <p>排序字段列表</p>
     * @param SortFields <p>排序字段列表</p>
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    /**
     * Get <p>页码（默认1）</p><p>取值范围：[1, 2147483647]</p> 
     * @return Page <p>页码（默认1）</p><p>取值范围：[1, 2147483647]</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码（默认1）</p><p>取值范围：[1, 2147483647]</p>
     * @param Page <p>页码（默认1）</p><p>取值范围：[1, 2147483647]</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页数量（默认200）</p><p>取值范围：[1, 2147483647]</p> 
     * @return PageSize <p>每页数量（默认200）</p><p>取值范围：[1, 2147483647]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量（默认200）</p><p>取值范围：[1, 2147483647]</p>
     * @param PageSize <p>每页数量（默认200）</p><p>取值范围：[1, 2147483647]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListModelVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListModelVersionsRequest(ListModelVersionsRequest source) {
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
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
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

