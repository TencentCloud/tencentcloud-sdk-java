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

public class DescribeMlflowServerEventsRequest extends AbstractModel {

    /**
    * <p>MlFlowServer的ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>查询起始时间，单位ms</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>查询结束时间，单位ms</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>翻页上下文，首次查询不传，后续翻页传入上一次返回的 Context 值</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>事件类型过滤，仅允许 ASCII 字母（如 Normal、Warning）</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>每次查询数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>排序字段，目前只支持EventTime</p>
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

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
     * Get <p>查询起始时间，单位ms</p> 
     * @return StartTime <p>查询起始时间，单位ms</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间，单位ms</p>
     * @param StartTime <p>查询起始时间，单位ms</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，单位ms</p> 
     * @return EndTime <p>查询结束时间，单位ms</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，单位ms</p>
     * @param EndTime <p>查询结束时间，单位ms</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>翻页上下文，首次查询不传，后续翻页传入上一次返回的 Context 值</p> 
     * @return Context <p>翻页上下文，首次查询不传，后续翻页传入上一次返回的 Context 值</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>翻页上下文，首次查询不传，后续翻页传入上一次返回的 Context 值</p>
     * @param Context <p>翻页上下文，首次查询不传，后续翻页传入上一次返回的 Context 值</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>事件类型过滤，仅允许 ASCII 字母（如 Normal、Warning）</p> 
     * @return EventType <p>事件类型过滤，仅允许 ASCII 字母（如 Normal、Warning）</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型过滤，仅允许 ASCII 字母（如 Normal、Warning）</p>
     * @param EventType <p>事件类型过滤，仅允许 ASCII 字母（如 Normal、Warning）</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>每次查询数量</p> 
     * @return PageSize <p>每次查询数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每次查询数量</p>
     * @param PageSize <p>每次查询数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>排序字段，目前只支持EventTime</p> 
     * @return SortFields <p>排序字段，目前只支持EventTime</p>
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set <p>排序字段，目前只支持EventTime</p>
     * @param SortFields <p>排序字段，目前只支持EventTime</p>
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    public DescribeMlflowServerEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMlflowServerEventsRequest(DescribeMlflowServerEventsRequest source) {
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
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
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);

    }
}

