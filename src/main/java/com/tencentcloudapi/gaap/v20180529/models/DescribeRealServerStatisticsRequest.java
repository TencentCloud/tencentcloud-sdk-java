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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServerStatisticsRequest extends AbstractModel{

    /**
    * 源站ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * L7层规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
    */
    @SerializedName("WithinTime")
    @Expose
    private Long WithinTime;

    /**
    * 统计开始时间(2020-08-19 00:00:00)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间(2020-08-19 23:59:59)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计的数据粒度，单位：秒，仅支持1分钟-60和5分钟-300粒度
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get 源站ID 
     * @return RealServerId 源站ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID
     * @param RealServerId 源站ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get L7层规则ID 
     * @return RuleId L7层规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set L7层规则ID
     * @param RuleId L7层规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询 
     * @return WithinTime 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
     */
    public Long getWithinTime() {
        return this.WithinTime;
    }

    /**
     * Set 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
     * @param WithinTime 统计时长，单位：小时。仅支持最近1,3,6,12,24小时的统计查询
     */
    public void setWithinTime(Long WithinTime) {
        this.WithinTime = WithinTime;
    }

    /**
     * Get 统计开始时间(2020-08-19 00:00:00) 
     * @return StartTime 统计开始时间(2020-08-19 00:00:00)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间(2020-08-19 00:00:00)
     * @param StartTime 统计开始时间(2020-08-19 00:00:00)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间(2020-08-19 23:59:59) 
     * @return EndTime 统计结束时间(2020-08-19 23:59:59)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间(2020-08-19 23:59:59)
     * @param EndTime 统计结束时间(2020-08-19 23:59:59)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 统计的数据粒度，单位：秒，仅支持1分钟-60和5分钟-300粒度 
     * @return Granularity 统计的数据粒度，单位：秒，仅支持1分钟-60和5分钟-300粒度
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 统计的数据粒度，单位：秒，仅支持1分钟-60和5分钟-300粒度
     * @param Granularity 统计的数据粒度，单位：秒，仅支持1分钟-60和5分钟-300粒度
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeRealServerStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServerStatisticsRequest(DescribeRealServerStatisticsRequest source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.WithinTime != null) {
            this.WithinTime = new Long(source.WithinTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "WithinTime", this.WithinTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

