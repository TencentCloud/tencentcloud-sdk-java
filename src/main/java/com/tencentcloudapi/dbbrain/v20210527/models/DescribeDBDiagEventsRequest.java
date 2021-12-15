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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagEventsRequest extends AbstractModel{

    /**
    * 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如“2021-05-27 01:00:00”，结束时间与开始时间的间隔最大可为7天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。
    */
    @SerializedName("Severities")
    @Expose
    private Long [] Severities;

    /**
    * 实例ID列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认20，最大值为50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。 
     * @return StartTime 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
     * @param StartTime 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如“2021-05-27 01:00:00”，结束时间与开始时间的间隔最大可为7天。 
     * @return EndTime 结束时间，如“2021-05-27 01:00:00”，结束时间与开始时间的间隔最大可为7天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如“2021-05-27 01:00:00”，结束时间与开始时间的间隔最大可为7天。
     * @param EndTime 结束时间，如“2021-05-27 01:00:00”，结束时间与开始时间的间隔最大可为7天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。 
     * @return Severities 风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。
     */
    public Long [] getSeverities() {
        return this.Severities;
    }

    /**
     * Set 风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。
     * @param Severities 风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。
     */
    public void setSeverities(Long [] Severities) {
        this.Severities = Severities;
    }

    /**
     * Get 实例ID列表。 
     * @return InstanceIds 实例ID列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表。
     * @param InstanceIds 实例ID列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认20，最大值为50。 
     * @return Limit 返回数量，默认20，最大值为50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20，最大值为50。
     * @param Limit 返回数量，默认20，最大值为50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBDiagEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagEventsRequest(DescribeDBDiagEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Severities != null) {
            this.Severities = new Long[source.Severities.length];
            for (int i = 0; i < source.Severities.length; i++) {
                this.Severities[i] = new Long(source.Severities[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Severities.", this.Severities);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

