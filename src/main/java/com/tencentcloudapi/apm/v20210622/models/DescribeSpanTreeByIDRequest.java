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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpanTreeByIDRequest extends AbstractModel {

    /**
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>TraceID</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Span查询开始时间戳（单位:秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Span查询结束时间戳（单位:秒）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>代表请求的是否为完整瀑布图</p>
    */
    @SerializedName("IsFold")
    @Expose
    private Boolean IsFold;

    /**
    * <p>开启关键调用视图</p>
    */
    @SerializedName("EntrySpanSelected")
    @Expose
    private Boolean EntrySpanSelected;

    /**
    * <p>关注的SpanId</p>
    */
    @SerializedName("FocusSpanId")
    @Expose
    private String FocusSpanId;

    /**
    * <p>过滤视图的Tag列表</p>
    */
    @SerializedName("FilterViewTagKeyList")
    @Expose
    private String [] FilterViewTagKeyList;

    /**
    * <p>是否开启云资源关联</p>
    */
    @SerializedName("EnableResourceLink")
    @Expose
    private Boolean EnableResourceLink;

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceId <p>业务系统 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceId <p>业务系统 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>TraceID</p> 
     * @return Filters <p>TraceID</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>TraceID</p>
     * @param Filters <p>TraceID</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Span查询开始时间戳（单位:秒）</p> 
     * @return StartTime <p>Span查询开始时间戳（单位:秒）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Span查询开始时间戳（单位:秒）</p>
     * @param StartTime <p>Span查询开始时间戳（单位:秒）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Span查询结束时间戳（单位:秒）</p> 
     * @return EndTime <p>Span查询结束时间戳（单位:秒）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Span查询结束时间戳（单位:秒）</p>
     * @param EndTime <p>Span查询结束时间戳（单位:秒）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>代表请求的是否为完整瀑布图</p> 
     * @return IsFold <p>代表请求的是否为完整瀑布图</p>
     */
    public Boolean getIsFold() {
        return this.IsFold;
    }

    /**
     * Set <p>代表请求的是否为完整瀑布图</p>
     * @param IsFold <p>代表请求的是否为完整瀑布图</p>
     */
    public void setIsFold(Boolean IsFold) {
        this.IsFold = IsFold;
    }

    /**
     * Get <p>开启关键调用视图</p> 
     * @return EntrySpanSelected <p>开启关键调用视图</p>
     */
    public Boolean getEntrySpanSelected() {
        return this.EntrySpanSelected;
    }

    /**
     * Set <p>开启关键调用视图</p>
     * @param EntrySpanSelected <p>开启关键调用视图</p>
     */
    public void setEntrySpanSelected(Boolean EntrySpanSelected) {
        this.EntrySpanSelected = EntrySpanSelected;
    }

    /**
     * Get <p>关注的SpanId</p> 
     * @return FocusSpanId <p>关注的SpanId</p>
     */
    public String getFocusSpanId() {
        return this.FocusSpanId;
    }

    /**
     * Set <p>关注的SpanId</p>
     * @param FocusSpanId <p>关注的SpanId</p>
     */
    public void setFocusSpanId(String FocusSpanId) {
        this.FocusSpanId = FocusSpanId;
    }

    /**
     * Get <p>过滤视图的Tag列表</p> 
     * @return FilterViewTagKeyList <p>过滤视图的Tag列表</p>
     */
    public String [] getFilterViewTagKeyList() {
        return this.FilterViewTagKeyList;
    }

    /**
     * Set <p>过滤视图的Tag列表</p>
     * @param FilterViewTagKeyList <p>过滤视图的Tag列表</p>
     */
    public void setFilterViewTagKeyList(String [] FilterViewTagKeyList) {
        this.FilterViewTagKeyList = FilterViewTagKeyList;
    }

    /**
     * Get <p>是否开启云资源关联</p> 
     * @return EnableResourceLink <p>是否开启云资源关联</p>
     */
    public Boolean getEnableResourceLink() {
        return this.EnableResourceLink;
    }

    /**
     * Set <p>是否开启云资源关联</p>
     * @param EnableResourceLink <p>是否开启云资源关联</p>
     */
    public void setEnableResourceLink(Boolean EnableResourceLink) {
        this.EnableResourceLink = EnableResourceLink;
    }

    public DescribeSpanTreeByIDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpanTreeByIDRequest(DescribeSpanTreeByIDRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IsFold != null) {
            this.IsFold = new Boolean(source.IsFold);
        }
        if (source.EntrySpanSelected != null) {
            this.EntrySpanSelected = new Boolean(source.EntrySpanSelected);
        }
        if (source.FocusSpanId != null) {
            this.FocusSpanId = new String(source.FocusSpanId);
        }
        if (source.FilterViewTagKeyList != null) {
            this.FilterViewTagKeyList = new String[source.FilterViewTagKeyList.length];
            for (int i = 0; i < source.FilterViewTagKeyList.length; i++) {
                this.FilterViewTagKeyList[i] = new String(source.FilterViewTagKeyList[i]);
            }
        }
        if (source.EnableResourceLink != null) {
            this.EnableResourceLink = new Boolean(source.EnableResourceLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsFold", this.IsFold);
        this.setParamSimple(map, prefix + "EntrySpanSelected", this.EntrySpanSelected);
        this.setParamSimple(map, prefix + "FocusSpanId", this.FocusSpanId);
        this.setParamArraySimple(map, prefix + "FilterViewTagKeyList.", this.FilterViewTagKeyList);
        this.setParamSimple(map, prefix + "EnableResourceLink", this.EnableResourceLink);

    }
}

