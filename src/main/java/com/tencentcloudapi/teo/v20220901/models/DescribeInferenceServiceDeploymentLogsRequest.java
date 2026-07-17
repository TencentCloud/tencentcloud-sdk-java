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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInferenceServiceDeploymentLogsRequest extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 推理服务 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 部署记录 ID。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 需检索日志的开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 需检索日志的结束时间。默认查询时间范围（EndTime - StartTime）为最近 7 天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序字段，取值有：<li>timestamp：日志生成时间。</li>默认值为：timestamp。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式，取值有：<li>asc：升序方式；</li><li>desc：降序方式。</li>默认值为：desc。
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：20，最大值：1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 推理服务 ID。 
     * @return ServiceId 推理服务 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 推理服务 ID。
     * @param ServiceId 推理服务 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 部署记录 ID。 
     * @return RecordId 部署记录 ID。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 部署记录 ID。
     * @param RecordId 部署记录 ID。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 需检索日志的开始时间。 
     * @return StartTime 需检索日志的开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 需检索日志的开始时间。
     * @param StartTime 需检索日志的开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 需检索日志的结束时间。默认查询时间范围（EndTime - StartTime）为最近 7 天。 
     * @return EndTime 需检索日志的结束时间。默认查询时间范围（EndTime - StartTime）为最近 7 天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 需检索日志的结束时间。默认查询时间范围（EndTime - StartTime）为最近 7 天。
     * @param EndTime 需检索日志的结束时间。默认查询时间范围（EndTime - StartTime）为最近 7 天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序字段，取值有：<li>timestamp：日志生成时间。</li>默认值为：timestamp。 
     * @return SortBy 排序字段，取值有：<li>timestamp：日志生成时间。</li>默认值为：timestamp。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，取值有：<li>timestamp：日志生成时间。</li>默认值为：timestamp。
     * @param SortBy 排序字段，取值有：<li>timestamp：日志生成时间。</li>默认值为：timestamp。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式，取值有：<li>asc：升序方式；</li><li>desc：降序方式。</li>默认值为：desc。 
     * @return SortOrder 排序方式，取值有：<li>asc：升序方式；</li><li>desc：降序方式。</li>默认值为：desc。
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序方式，取值有：<li>asc：升序方式；</li><li>desc：降序方式。</li>默认值为：desc。
     * @param SortOrder 排序方式，取值有：<li>asc：升序方式；</li><li>desc：降序方式。</li>默认值为：desc。
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：20，最大值：1000。 
     * @return Limit 返回记录条数，默认值：20，最大值：1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：20，最大值：1000。
     * @param Limit 返回记录条数，默认值：20，最大值：1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInferenceServiceDeploymentLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceServiceDeploymentLogsRequest(DescribeInferenceServiceDeploymentLogsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

