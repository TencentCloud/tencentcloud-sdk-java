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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogHistogramRequest extends AbstractModel {

    /**
    * 要查询的日志的起始时间，Unix时间戳，单位ms
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 要查询的日志的结束时间，Unix时间戳，单位ms
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 查询语句
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * 时间间隔: 单位ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 要查询的日志的起始时间，Unix时间戳，单位ms 
     * @return StartTime 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 要查询的日志的起始时间，Unix时间戳，单位ms
     * @param StartTime 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 要查询的日志的结束时间，Unix时间戳，单位ms 
     * @return EndTime 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 要查询的日志的结束时间，Unix时间戳，单位ms
     * @param EndTime 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询语句 
     * @return QueryString 查询语句
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 查询语句
     * @param QueryString 查询语句
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 时间间隔: 单位ms 
     * @return Interval 时间间隔: 单位ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间间隔: 单位ms
     * @param Interval 时间间隔: 单位ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public DescribeLogHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogHistogramRequest(DescribeLogHistogramRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

