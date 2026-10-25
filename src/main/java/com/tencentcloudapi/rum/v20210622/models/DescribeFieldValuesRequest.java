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

public class DescribeFieldValuesRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间</p><p>单位：毫秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p><p>单位：毫秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>字段名</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>数量限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>事件分类</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>可选。按前缀过滤字段去重结果。查询 user_id 或 device_id 且开启 StrictPiiPrefix 时必填，去除首尾空格后长度须不少于 2。</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>用于采样配置，是否对 user_id、device_id 强制前缀匹配。为 true 时必须同时传入合法 Prefix，否则返回 InvalidParameter，且不会返回无前缀的全量去重列表。为 false 或不传时，按字段返回热门去重值，行为与历史接口一致。</p><p>默认值：false</p>
    */
    @SerializedName("StrictPiiPrefix")
    @Expose
    private Boolean StrictPiiPrefix;

    /**
    * <p>查询口径。可选。只允许空或 event。Issue 标签分布传 event。为 event 时不能同时传 HasError、MinDuration、MaxDuration，也不能把 Category 设为 session。</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>是否只看有错误的会话。可选。不传表示不过滤。Scope 为 event 时不能传。</p>
    */
    @SerializedName("HasError")
    @Expose
    private Boolean HasError;

    /**
    * <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
    */
    @SerializedName("MinDuration")
    @Expose
    private Long MinDuration;

    /**
    * <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间</p><p>单位：毫秒</p> 
     * @return StartTime <p>开始时间</p><p>单位：毫秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p><p>单位：毫秒</p>
     * @param StartTime <p>开始时间</p><p>单位：毫秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p><p>单位：毫秒</p> 
     * @return EndTime <p>结束时间</p><p>单位：毫秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p><p>单位：毫秒</p>
     * @param EndTime <p>结束时间</p><p>单位：毫秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>字段名</p> 
     * @return FieldName <p>字段名</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名</p>
     * @param FieldName <p>字段名</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>数量限制</p> 
     * @return Limit <p>数量限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>数量限制</p>
     * @param Limit <p>数量限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>事件分类</p> 
     * @return Category <p>事件分类</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>事件分类</p>
     * @param Category <p>事件分类</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>可选。按前缀过滤字段去重结果。查询 user_id 或 device_id 且开启 StrictPiiPrefix 时必填，去除首尾空格后长度须不少于 2。</p> 
     * @return Prefix <p>可选。按前缀过滤字段去重结果。查询 user_id 或 device_id 且开启 StrictPiiPrefix 时必填，去除首尾空格后长度须不少于 2。</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>可选。按前缀过滤字段去重结果。查询 user_id 或 device_id 且开启 StrictPiiPrefix 时必填，去除首尾空格后长度须不少于 2。</p>
     * @param Prefix <p>可选。按前缀过滤字段去重结果。查询 user_id 或 device_id 且开启 StrictPiiPrefix 时必填，去除首尾空格后长度须不少于 2。</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>用于采样配置，是否对 user_id、device_id 强制前缀匹配。为 true 时必须同时传入合法 Prefix，否则返回 InvalidParameter，且不会返回无前缀的全量去重列表。为 false 或不传时，按字段返回热门去重值，行为与历史接口一致。</p><p>默认值：false</p> 
     * @return StrictPiiPrefix <p>用于采样配置，是否对 user_id、device_id 强制前缀匹配。为 true 时必须同时传入合法 Prefix，否则返回 InvalidParameter，且不会返回无前缀的全量去重列表。为 false 或不传时，按字段返回热门去重值，行为与历史接口一致。</p><p>默认值：false</p>
     */
    public Boolean getStrictPiiPrefix() {
        return this.StrictPiiPrefix;
    }

    /**
     * Set <p>用于采样配置，是否对 user_id、device_id 强制前缀匹配。为 true 时必须同时传入合法 Prefix，否则返回 InvalidParameter，且不会返回无前缀的全量去重列表。为 false 或不传时，按字段返回热门去重值，行为与历史接口一致。</p><p>默认值：false</p>
     * @param StrictPiiPrefix <p>用于采样配置，是否对 user_id、device_id 强制前缀匹配。为 true 时必须同时传入合法 Prefix，否则返回 InvalidParameter，且不会返回无前缀的全量去重列表。为 false 或不传时，按字段返回热门去重值，行为与历史接口一致。</p><p>默认值：false</p>
     */
    public void setStrictPiiPrefix(Boolean StrictPiiPrefix) {
        this.StrictPiiPrefix = StrictPiiPrefix;
    }

    /**
     * Get <p>查询口径。可选。只允许空或 event。Issue 标签分布传 event。为 event 时不能同时传 HasError、MinDuration、MaxDuration，也不能把 Category 设为 session。</p> 
     * @return Scope <p>查询口径。可选。只允许空或 event。Issue 标签分布传 event。为 event 时不能同时传 HasError、MinDuration、MaxDuration，也不能把 Category 设为 session。</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>查询口径。可选。只允许空或 event。Issue 标签分布传 event。为 event 时不能同时传 HasError、MinDuration、MaxDuration，也不能把 Category 设为 session。</p>
     * @param Scope <p>查询口径。可选。只允许空或 event。Issue 标签分布传 event。为 event 时不能同时传 HasError、MinDuration、MaxDuration，也不能把 Category 设为 session。</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>是否只看有错误的会话。可选。不传表示不过滤。Scope 为 event 时不能传。</p> 
     * @return HasError <p>是否只看有错误的会话。可选。不传表示不过滤。Scope 为 event 时不能传。</p>
     */
    public Boolean getHasError() {
        return this.HasError;
    }

    /**
     * Set <p>是否只看有错误的会话。可选。不传表示不过滤。Scope 为 event 时不能传。</p>
     * @param HasError <p>是否只看有错误的会话。可选。不传表示不过滤。Scope 为 event 时不能传。</p>
     */
    public void setHasError(Boolean HasError) {
        this.HasError = HasError;
    }

    /**
     * Get <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p> 
     * @return MinDuration <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
     */
    public Long getMinDuration() {
        return this.MinDuration;
    }

    /**
     * Set <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
     * @param MinDuration <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
     */
    public void setMinDuration(Long MinDuration) {
        this.MinDuration = MinDuration;
    }

    /**
     * Get <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p> 
     * @return MaxDuration <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
     * @param MaxDuration <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Scope 为 event 时不能传。</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    public DescribeFieldValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFieldValuesRequest(DescribeFieldValuesRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.StrictPiiPrefix != null) {
            this.StrictPiiPrefix = new Boolean(source.StrictPiiPrefix);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
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
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "StrictPiiPrefix", this.StrictPiiPrefix);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "HasError", this.HasError);
        this.setParamSimple(map, prefix + "MinDuration", this.MinDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);

    }
}

