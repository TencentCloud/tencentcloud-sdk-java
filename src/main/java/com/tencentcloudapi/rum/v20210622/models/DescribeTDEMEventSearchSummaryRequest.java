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

public class DescribeTDEMEventSearchSummaryRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

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
    * <p>事件分类（必填，可含 session）</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>筛选条件 JSON 字符串：[{Key,Op,Values}]</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>分桶秒数，正整数；缺省由服务端按窗口选取</p>
    */
    @SerializedName("IntervalSec")
    @Expose
    private Long IntervalSec;

    /**
    * <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
    */
    @SerializedName("HasError")
    @Expose
    private Boolean HasError;

    /**
    * <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
    */
    @SerializedName("MinDuration")
    @Expose
    private Long MinDuration;

    /**
    * <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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
     * Get <p>事件分类（必填，可含 session）</p> 
     * @return Category <p>事件分类（必填，可含 session）</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>事件分类（必填，可含 session）</p>
     * @param Category <p>事件分类（必填，可含 session）</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>筛选条件 JSON 字符串：[{Key,Op,Values}]</p> 
     * @return Filters <p>筛选条件 JSON 字符串：[{Key,Op,Values}]</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串：[{Key,Op,Values}]</p>
     * @param Filters <p>筛选条件 JSON 字符串：[{Key,Op,Values}]</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分桶秒数，正整数；缺省由服务端按窗口选取</p> 
     * @return IntervalSec <p>分桶秒数，正整数；缺省由服务端按窗口选取</p>
     */
    public Long getIntervalSec() {
        return this.IntervalSec;
    }

    /**
     * Set <p>分桶秒数，正整数；缺省由服务端按窗口选取</p>
     * @param IntervalSec <p>分桶秒数，正整数；缺省由服务端按窗口选取</p>
     */
    public void setIntervalSec(Long IntervalSec) {
        this.IntervalSec = IntervalSec;
    }

    /**
     * Get <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p> 
     * @return HasError <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public Boolean getHasError() {
        return this.HasError;
    }

    /**
     * Set <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
     * @param HasError <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public void setHasError(Boolean HasError) {
        this.HasError = HasError;
    }

    /**
     * Get <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p> 
     * @return MinDuration <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public Long getMinDuration() {
        return this.MinDuration;
    }

    /**
     * Set <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     * @param MinDuration <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public void setMinDuration(Long MinDuration) {
        this.MinDuration = MinDuration;
    }

    /**
     * Get <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p> 
     * @return MaxDuration <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     * @param MaxDuration <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    public DescribeTDEMEventSearchSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMEventSearchSummaryRequest(DescribeTDEMEventSearchSummaryRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.IntervalSec != null) {
            this.IntervalSec = new Long(source.IntervalSec);
        }
        if (source.HasError != null) {
            this.HasError = new Boolean(source.HasError);
        }
        if (source.MinDuration != null) {
            this.MinDuration = new Long(source.MinDuration);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "IntervalSec", this.IntervalSec);
        this.setParamSimple(map, prefix + "HasError", this.HasError);
        this.setParamSimple(map, prefix + "MinDuration", this.MinDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);

    }
}

