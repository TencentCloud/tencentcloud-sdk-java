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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRespTimeTrendExRequest extends AbstractModel{

    /**
    * 验证成功的拨测任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 统计数据的发生日期。格式如：2017-05-09
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 数据的采集周期，单位分钟。取值可为 1, 5, 15, 30
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 可为 Isp, Province
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionsDetail Dimensions;

    /**
    * 可为  totalTime, parseTime, connectTime, sendTime, waitTime, receiveTime, availRatio。缺省值为 totalTime
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get 验证成功的拨测任务id 
     * @return TaskId 验证成功的拨测任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 验证成功的拨测任务id
     * @param TaskId 验证成功的拨测任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 统计数据的发生日期。格式如：2017-05-09 
     * @return Date 统计数据的发生日期。格式如：2017-05-09
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 统计数据的发生日期。格式如：2017-05-09
     * @param Date 统计数据的发生日期。格式如：2017-05-09
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 数据的采集周期，单位分钟。取值可为 1, 5, 15, 30 
     * @return Period 数据的采集周期，单位分钟。取值可为 1, 5, 15, 30
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 数据的采集周期，单位分钟。取值可为 1, 5, 15, 30
     * @param Period 数据的采集周期，单位分钟。取值可为 1, 5, 15, 30
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 可为 Isp, Province 
     * @return Dimensions 可为 Isp, Province
     */
    public DimensionsDetail getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 可为 Isp, Province
     * @param Dimensions 可为 Isp, Province
     */
    public void setDimensions(DimensionsDetail Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 可为  totalTime, parseTime, connectTime, sendTime, waitTime, receiveTime, availRatio。缺省值为 totalTime 
     * @return MetricName 可为  totalTime, parseTime, connectTime, sendTime, waitTime, receiveTime, availRatio。缺省值为 totalTime
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 可为  totalTime, parseTime, connectTime, sendTime, waitTime, receiveTime, availRatio。缺省值为 totalTime
     * @param MetricName 可为  totalTime, parseTime, connectTime, sendTime, waitTime, receiveTime, availRatio。缺省值为 totalTime
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

