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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UebaEventContent extends AbstractModel {

    /**
    * 发生事件类型
1:语句检索
2:过滤检索
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 语句检索内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 检索条件

    */
    @SerializedName("Filters")
    @Expose
    private WhereFilter [] Filters;

    /**
    * 统计条件
    */
    @SerializedName("StatisticalFilter")
    @Expose
    private StatisticalFilter StatisticalFilter;

    /**
     * Get 发生事件类型
1:语句检索
2:过滤检索 
     * @return EventType 发生事件类型
1:语句检索
2:过滤检索
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 发生事件类型
1:语句检索
2:过滤检索
     * @param EventType 发生事件类型
1:语句检索
2:过滤检索
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 语句检索内容 
     * @return Content 语句检索内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 语句检索内容
     * @param Content 语句检索内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 检索条件
 
     * @return Filters 检索条件

     */
    public WhereFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 检索条件

     * @param Filters 检索条件

     */
    public void setFilters(WhereFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 统计条件 
     * @return StatisticalFilter 统计条件
     */
    public StatisticalFilter getStatisticalFilter() {
        return this.StatisticalFilter;
    }

    /**
     * Set 统计条件
     * @param StatisticalFilter 统计条件
     */
    public void setStatisticalFilter(StatisticalFilter StatisticalFilter) {
        this.StatisticalFilter = StatisticalFilter;
    }

    public UebaEventContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaEventContent(UebaEventContent source) {
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Filters != null) {
            this.Filters = new WhereFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new WhereFilter(source.Filters[i]);
            }
        }
        if (source.StatisticalFilter != null) {
            this.StatisticalFilter = new StatisticalFilter(source.StatisticalFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "StatisticalFilter.", this.StatisticalFilter);

    }
}

