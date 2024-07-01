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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDutyScheduleDetailsRequest extends AbstractModel {

    /**
    * 值班表id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 查询时间
    */
    @SerializedName("QueryDate")
    @Expose
    private String QueryDate;

    /**
    * 扩展字段
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 值班表id 
     * @return Id 值班表id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 值班表id
     * @param Id 值班表id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 查询时间 
     * @return QueryDate 查询时间
     */
    public String getQueryDate() {
        return this.QueryDate;
    }

    /**
     * Set 查询时间
     * @param QueryDate 查询时间
     */
    public void setQueryDate(String QueryDate) {
        this.QueryDate = QueryDate;
    }

    /**
     * Get 扩展字段 
     * @return Filters 扩展字段
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 扩展字段
     * @param Filters 扩展字段
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDutyScheduleDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDutyScheduleDetailsRequest(DescribeDutyScheduleDetailsRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.QueryDate != null) {
            this.QueryDate = new String(source.QueryDate);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "QueryDate", this.QueryDate);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

