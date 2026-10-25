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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMOverviewScoresRequest extends AbstractModel {

    /**
    * <p>应用 ID 列表，1-200（必填）</p>
    */
    @SerializedName("AppIds")
    @Expose
    private String [] AppIds;

    /**
    * <p>开始时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。总览总分按环境筛选时传入。</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
     * Get <p>应用 ID 列表，1-200（必填）</p> 
     * @return AppIds <p>应用 ID 列表，1-200（必填）</p>
     */
    public String [] getAppIds() {
        return this.AppIds;
    }

    /**
     * Set <p>应用 ID 列表，1-200（必填）</p>
     * @param AppIds <p>应用 ID 列表，1-200（必填）</p>
     */
    public void setAppIds(String [] AppIds) {
        this.AppIds = AppIds;
    }

    /**
     * Get <p>开始时间 Unix 毫秒（必填）</p> 
     * @return StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 Unix 毫秒（必填）</p>
     * @param StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 Unix 毫秒（必填）</p> 
     * @return EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 Unix 毫秒（必填）</p>
     * @param EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。总览总分按环境筛选时传入。</p> 
     * @return Filters <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。总览总分按环境筛选时传入。</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。总览总分按环境筛选时传入。</p>
     * @param Filters <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。总览总分按环境筛选时传入。</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    public DescribeTDEMOverviewScoresRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMOverviewScoresRequest(DescribeTDEMOverviewScoresRequest source) {
        if (source.AppIds != null) {
            this.AppIds = new String[source.AppIds.length];
            for (int i = 0; i < source.AppIds.length; i++) {
                this.AppIds[i] = new String(source.AppIds[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AppIds.", this.AppIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Filters", this.Filters);

    }
}

