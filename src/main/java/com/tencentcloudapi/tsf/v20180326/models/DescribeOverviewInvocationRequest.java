/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewInvocationRequest extends AbstractModel{

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 监控统计类型，可选值：SumReqAmount、AvgFailureRate、AvgTimeCost，分别对应请求量、请求错误率、平均响应耗时
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 监控统计数据粒度，可选值：60、3600、86400，分别对应1分钟、1小时、1天
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 查询开始时间，默认为当天的 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，默认为当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 监控统计类型，可选值：SumReqAmount、AvgFailureRate、AvgTimeCost，分别对应请求量、请求错误率、平均响应耗时 
     * @return Type 监控统计类型，可选值：SumReqAmount、AvgFailureRate、AvgTimeCost，分别对应请求量、请求错误率、平均响应耗时
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 监控统计类型，可选值：SumReqAmount、AvgFailureRate、AvgTimeCost，分别对应请求量、请求错误率、平均响应耗时
     * @param Type 监控统计类型，可选值：SumReqAmount、AvgFailureRate、AvgTimeCost，分别对应请求量、请求错误率、平均响应耗时
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 监控统计数据粒度，可选值：60、3600、86400，分别对应1分钟、1小时、1天 
     * @return Period 监控统计数据粒度，可选值：60、3600、86400，分别对应1分钟、1小时、1天
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控统计数据粒度，可选值：60、3600、86400，分别对应1分钟、1小时、1天
     * @param Period 监控统计数据粒度，可选值：60、3600、86400，分别对应1分钟、1小时、1天
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 查询开始时间，默认为当天的 00:00:00 
     * @return StartTime 查询开始时间，默认为当天的 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，默认为当天的 00:00:00
     * @param StartTime 查询开始时间，默认为当天的 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，默认为当前时间 
     * @return EndTime 查询结束时间，默认为当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，默认为当前时间
     * @param EndTime 查询结束时间，默认为当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeOverviewInvocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewInvocationRequest(DescribeOverviewInvocationRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

