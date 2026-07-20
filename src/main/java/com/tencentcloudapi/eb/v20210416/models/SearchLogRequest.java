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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel {

    /**
    * <p>起始时间unix 毫秒时间戳</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间unix 毫秒时间戳</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>页码</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页数据大小</p><p>取值范围：[1, 1000]</p><p>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>事件查询筛选条件；示例如下：[{&quot;key&quot;:&quot;host&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;106.53.106.243&quot;},{&quot;type&quot;:&quot;AND&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;region&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>guangzhou</em>&quot;},{&quot;key&quot;:&quot;type&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;cvm:ErrorEvent:GuestReboot&quot;}]},{&quot;type&quot;:&quot;OR&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;field1&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>access</em>&quot;},{&quot;key&quot;:&quot;field2&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;custom&quot;}]}]</p>
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter [] Filter;

    /**
    * <p>事件查询结果排序</p><p>枚举值：</p><ul><li>Timestamp： 事件触发时间</li><li>Source： 事件源</li><li>Type： 事件类型</li><li>RuleIds： 事件规则</li><li>Subject： 事件对象</li><li>Region： 事件地域</li><li>Status： 事件状态</li></ul>
    */
    @SerializedName("OrderFields")
    @Expose
    private String [] OrderFields;

    /**
    * <p>排序方式，asc 从旧到新，desc 从新到旧</p><p>枚举值：</p><ul><li>asc： 从旧到新</li><li>desc： 从新到旧</li></ul><p>默认值：desc</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get <p>起始时间unix 毫秒时间戳</p> 
     * @return StartTime <p>起始时间unix 毫秒时间戳</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间unix 毫秒时间戳</p>
     * @param StartTime <p>起始时间unix 毫秒时间戳</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间unix 毫秒时间戳</p> 
     * @return EndTime <p>结束时间unix 毫秒时间戳</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间unix 毫秒时间戳</p>
     * @param EndTime <p>结束时间unix 毫秒时间戳</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>页码</p> 
     * @return Page <p>页码</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码</p>
     * @param Page <p>页码</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页数据大小</p><p>取值范围：[1, 1000]</p><p>默认值：10</p> 
     * @return Limit <p>每页数据大小</p><p>取值范围：[1, 1000]</p><p>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数据大小</p><p>取值范围：[1, 1000]</p><p>默认值：10</p>
     * @param Limit <p>每页数据大小</p><p>取值范围：[1, 1000]</p><p>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>事件查询筛选条件；示例如下：[{&quot;key&quot;:&quot;host&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;106.53.106.243&quot;},{&quot;type&quot;:&quot;AND&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;region&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>guangzhou</em>&quot;},{&quot;key&quot;:&quot;type&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;cvm:ErrorEvent:GuestReboot&quot;}]},{&quot;type&quot;:&quot;OR&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;field1&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>access</em>&quot;},{&quot;key&quot;:&quot;field2&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;custom&quot;}]}]</p> 
     * @return Filter <p>事件查询筛选条件；示例如下：[{&quot;key&quot;:&quot;host&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;106.53.106.243&quot;},{&quot;type&quot;:&quot;AND&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;region&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>guangzhou</em>&quot;},{&quot;key&quot;:&quot;type&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;cvm:ErrorEvent:GuestReboot&quot;}]},{&quot;type&quot;:&quot;OR&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;field1&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>access</em>&quot;},{&quot;key&quot;:&quot;field2&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;custom&quot;}]}]</p>
     */
    public LogFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>事件查询筛选条件；示例如下：[{&quot;key&quot;:&quot;host&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;106.53.106.243&quot;},{&quot;type&quot;:&quot;AND&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;region&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>guangzhou</em>&quot;},{&quot;key&quot;:&quot;type&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;cvm:ErrorEvent:GuestReboot&quot;}]},{&quot;type&quot;:&quot;OR&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;field1&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>access</em>&quot;},{&quot;key&quot;:&quot;field2&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;custom&quot;}]}]</p>
     * @param Filter <p>事件查询筛选条件；示例如下：[{&quot;key&quot;:&quot;host&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;106.53.106.243&quot;},{&quot;type&quot;:&quot;AND&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;region&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>guangzhou</em>&quot;},{&quot;key&quot;:&quot;type&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;cvm:ErrorEvent:GuestReboot&quot;}]},{&quot;type&quot;:&quot;OR&quot;,&quot;filters&quot;:[{&quot;key&quot;:&quot;field1&quot;,&quot;operator&quot;:&quot;like&quot;,&quot;value&quot;:&quot;<em>access</em>&quot;},{&quot;key&quot;:&quot;field2&quot;,&quot;operator&quot;:&quot;eq&quot;,&quot;value&quot;:&quot;custom&quot;}]}]</p>
     */
    public void setFilter(LogFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>事件查询结果排序</p><p>枚举值：</p><ul><li>Timestamp： 事件触发时间</li><li>Source： 事件源</li><li>Type： 事件类型</li><li>RuleIds： 事件规则</li><li>Subject： 事件对象</li><li>Region： 事件地域</li><li>Status： 事件状态</li></ul> 
     * @return OrderFields <p>事件查询结果排序</p><p>枚举值：</p><ul><li>Timestamp： 事件触发时间</li><li>Source： 事件源</li><li>Type： 事件类型</li><li>RuleIds： 事件规则</li><li>Subject： 事件对象</li><li>Region： 事件地域</li><li>Status： 事件状态</li></ul>
     */
    public String [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set <p>事件查询结果排序</p><p>枚举值：</p><ul><li>Timestamp： 事件触发时间</li><li>Source： 事件源</li><li>Type： 事件类型</li><li>RuleIds： 事件规则</li><li>Subject： 事件对象</li><li>Region： 事件地域</li><li>Status： 事件状态</li></ul>
     * @param OrderFields <p>事件查询结果排序</p><p>枚举值：</p><ul><li>Timestamp： 事件触发时间</li><li>Source： 事件源</li><li>Type： 事件类型</li><li>RuleIds： 事件规则</li><li>Subject： 事件对象</li><li>Region： 事件地域</li><li>Status： 事件状态</li></ul>
     */
    public void setOrderFields(String [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get <p>排序方式，asc 从旧到新，desc 从新到旧</p><p>枚举值：</p><ul><li>asc： 从旧到新</li><li>desc： 从新到旧</li></ul><p>默认值：desc</p> 
     * @return OrderBy <p>排序方式，asc 从旧到新，desc 从新到旧</p><p>枚举值：</p><ul><li>asc： 从旧到新</li><li>desc： 从新到旧</li></ul><p>默认值：desc</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方式，asc 从旧到新，desc 从新到旧</p><p>枚举值：</p><ul><li>asc： 从旧到新</li><li>desc： 从新到旧</li></ul><p>默认值：desc</p>
     * @param OrderBy <p>排序方式，asc 从旧到新，desc 从新到旧</p><p>枚举值：</p><ul><li>asc： 从旧到新</li><li>desc： 从新到旧</li></ul><p>默认值：desc</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new LogFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new LogFilter(source.Filter[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new String[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new String(source.OrderFields[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

