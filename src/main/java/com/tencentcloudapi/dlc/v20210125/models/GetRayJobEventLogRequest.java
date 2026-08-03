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

public class GetRayJobEventLogRequest extends AbstractModel {

    /**
    * ray-jobID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 当前页码（从1开始）
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序字段列表（列表字段）
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
     * Get ray-jobID 
     * @return Id ray-jobID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ray-jobID
     * @param Id ray-jobID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 当前页码（从1开始） 
     * @return Page 当前页码（从1开始）
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 当前页码（从1开始）
     * @param Page 当前页码（从1开始）
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页数 
     * @return PageSize 页数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页数
     * @param PageSize 页数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序字段列表（列表字段） 
     * @return SortFields 排序字段列表（列表字段）
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set 排序字段列表（列表字段）
     * @param SortFields 排序字段列表（列表字段）
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    public GetRayJobEventLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRayJobEventLogRequest(GetRayJobEventLogRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        if (source.SortFields != null) {
            this.SortFields = new SortField[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new SortField(source.SortFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);

    }
}

