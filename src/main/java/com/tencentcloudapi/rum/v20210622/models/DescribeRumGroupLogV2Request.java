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

public class DescribeRumGroupLogV2Request extends AbstractModel {

    /**
    * <p>排序方式 desc asc（必填）</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>开始时间（必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>结束时间（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>项目ID（必填）</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>聚合字段</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>页数，第几页（注意：该字段已废弃！）</p>
    */
    @SerializedName("Last")
    @Expose
    private Long Last;

    /**
     * Get <p>排序方式 desc asc（必填）</p> 
     * @return OrderBy <p>排序方式 desc asc（必填）</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方式 desc asc（必填）</p>
     * @param OrderBy <p>排序方式 desc asc（必填）</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>开始时间（必填）</p> 
     * @return StartTime <p>开始时间（必填）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（必填）</p>
     * @param StartTime <p>开始时间（必填）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>单次查询返回的原始日志条数，最大值为100（必填）</p> 
     * @return Limit <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
     * @param Limit <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filter <p>过滤条件</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filter <p>过滤条件</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>结束时间（必填）</p> 
     * @return EndTime <p>结束时间（必填）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（必填）</p>
     * @param EndTime <p>结束时间（必填）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>项目ID（必填）</p> 
     * @return ID <p>项目ID（必填）</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>项目ID（必填）</p>
     * @param ID <p>项目ID（必填）</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>聚合字段</p> 
     * @return Label <p>聚合字段</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>聚合字段</p>
     * @param Label <p>聚合字段</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>页数，第几页（注意：该字段已废弃！）</p> 
     * @return Last <p>页数，第几页（注意：该字段已废弃！）</p>
     */
    public Long getLast() {
        return this.Last;
    }

    /**
     * Set <p>页数，第几页（注意：该字段已废弃！）</p>
     * @param Last <p>页数，第几页（注意：该字段已废弃！）</p>
     */
    public void setLast(Long Last) {
        this.Last = Last;
    }

    public DescribeRumGroupLogV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumGroupLogV2Request(DescribeRumGroupLogV2Request source) {
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Last != null) {
            this.Last = new Long(source.Last);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Last", this.Last);

    }
}

