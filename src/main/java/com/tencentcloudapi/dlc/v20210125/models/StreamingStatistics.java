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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamingStatistics extends AbstractModel{

    /**
    * 任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 数据接收器数
    */
    @SerializedName("Receivers")
    @Expose
    private Long Receivers;

    /**
    * 运行中的接收器数
    */
    @SerializedName("NumActiveReceivers")
    @Expose
    private Long NumActiveReceivers;

    /**
    * 不活跃的接收器数
    */
    @SerializedName("NumInactiveReceivers")
    @Expose
    private Long NumInactiveReceivers;

    /**
    * 运行中的批数
    */
    @SerializedName("NumActiveBatches")
    @Expose
    private Long NumActiveBatches;

    /**
    * 待处理的批数
    */
    @SerializedName("NumRetainedCompletedBatches")
    @Expose
    private Long NumRetainedCompletedBatches;

    /**
    * 已完成的批数
    */
    @SerializedName("NumTotalCompletedBatches")
    @Expose
    private Long NumTotalCompletedBatches;

    /**
    * 平均输入速率
    */
    @SerializedName("AverageInputRate")
    @Expose
    private Float AverageInputRate;

    /**
    * 平均等待时长
    */
    @SerializedName("AverageSchedulingDelay")
    @Expose
    private Float AverageSchedulingDelay;

    /**
    * 平均处理时长
    */
    @SerializedName("AverageProcessingTime")
    @Expose
    private Float AverageProcessingTime;

    /**
    * 平均延时
    */
    @SerializedName("AverageTotalDelay")
    @Expose
    private Float AverageTotalDelay;

    /**
     * Get 任务开始时间 
     * @return StartTime 任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
     * @param StartTime 任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 数据接收器数 
     * @return Receivers 数据接收器数
     */
    public Long getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 数据接收器数
     * @param Receivers 数据接收器数
     */
    public void setReceivers(Long Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 运行中的接收器数 
     * @return NumActiveReceivers 运行中的接收器数
     */
    public Long getNumActiveReceivers() {
        return this.NumActiveReceivers;
    }

    /**
     * Set 运行中的接收器数
     * @param NumActiveReceivers 运行中的接收器数
     */
    public void setNumActiveReceivers(Long NumActiveReceivers) {
        this.NumActiveReceivers = NumActiveReceivers;
    }

    /**
     * Get 不活跃的接收器数 
     * @return NumInactiveReceivers 不活跃的接收器数
     */
    public Long getNumInactiveReceivers() {
        return this.NumInactiveReceivers;
    }

    /**
     * Set 不活跃的接收器数
     * @param NumInactiveReceivers 不活跃的接收器数
     */
    public void setNumInactiveReceivers(Long NumInactiveReceivers) {
        this.NumInactiveReceivers = NumInactiveReceivers;
    }

    /**
     * Get 运行中的批数 
     * @return NumActiveBatches 运行中的批数
     */
    public Long getNumActiveBatches() {
        return this.NumActiveBatches;
    }

    /**
     * Set 运行中的批数
     * @param NumActiveBatches 运行中的批数
     */
    public void setNumActiveBatches(Long NumActiveBatches) {
        this.NumActiveBatches = NumActiveBatches;
    }

    /**
     * Get 待处理的批数 
     * @return NumRetainedCompletedBatches 待处理的批数
     */
    public Long getNumRetainedCompletedBatches() {
        return this.NumRetainedCompletedBatches;
    }

    /**
     * Set 待处理的批数
     * @param NumRetainedCompletedBatches 待处理的批数
     */
    public void setNumRetainedCompletedBatches(Long NumRetainedCompletedBatches) {
        this.NumRetainedCompletedBatches = NumRetainedCompletedBatches;
    }

    /**
     * Get 已完成的批数 
     * @return NumTotalCompletedBatches 已完成的批数
     */
    public Long getNumTotalCompletedBatches() {
        return this.NumTotalCompletedBatches;
    }

    /**
     * Set 已完成的批数
     * @param NumTotalCompletedBatches 已完成的批数
     */
    public void setNumTotalCompletedBatches(Long NumTotalCompletedBatches) {
        this.NumTotalCompletedBatches = NumTotalCompletedBatches;
    }

    /**
     * Get 平均输入速率 
     * @return AverageInputRate 平均输入速率
     */
    public Float getAverageInputRate() {
        return this.AverageInputRate;
    }

    /**
     * Set 平均输入速率
     * @param AverageInputRate 平均输入速率
     */
    public void setAverageInputRate(Float AverageInputRate) {
        this.AverageInputRate = AverageInputRate;
    }

    /**
     * Get 平均等待时长 
     * @return AverageSchedulingDelay 平均等待时长
     */
    public Float getAverageSchedulingDelay() {
        return this.AverageSchedulingDelay;
    }

    /**
     * Set 平均等待时长
     * @param AverageSchedulingDelay 平均等待时长
     */
    public void setAverageSchedulingDelay(Float AverageSchedulingDelay) {
        this.AverageSchedulingDelay = AverageSchedulingDelay;
    }

    /**
     * Get 平均处理时长 
     * @return AverageProcessingTime 平均处理时长
     */
    public Float getAverageProcessingTime() {
        return this.AverageProcessingTime;
    }

    /**
     * Set 平均处理时长
     * @param AverageProcessingTime 平均处理时长
     */
    public void setAverageProcessingTime(Float AverageProcessingTime) {
        this.AverageProcessingTime = AverageProcessingTime;
    }

    /**
     * Get 平均延时 
     * @return AverageTotalDelay 平均延时
     */
    public Float getAverageTotalDelay() {
        return this.AverageTotalDelay;
    }

    /**
     * Set 平均延时
     * @param AverageTotalDelay 平均延时
     */
    public void setAverageTotalDelay(Float AverageTotalDelay) {
        this.AverageTotalDelay = AverageTotalDelay;
    }

    public StreamingStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamingStatistics(StreamingStatistics source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Receivers != null) {
            this.Receivers = new Long(source.Receivers);
        }
        if (source.NumActiveReceivers != null) {
            this.NumActiveReceivers = new Long(source.NumActiveReceivers);
        }
        if (source.NumInactiveReceivers != null) {
            this.NumInactiveReceivers = new Long(source.NumInactiveReceivers);
        }
        if (source.NumActiveBatches != null) {
            this.NumActiveBatches = new Long(source.NumActiveBatches);
        }
        if (source.NumRetainedCompletedBatches != null) {
            this.NumRetainedCompletedBatches = new Long(source.NumRetainedCompletedBatches);
        }
        if (source.NumTotalCompletedBatches != null) {
            this.NumTotalCompletedBatches = new Long(source.NumTotalCompletedBatches);
        }
        if (source.AverageInputRate != null) {
            this.AverageInputRate = new Float(source.AverageInputRate);
        }
        if (source.AverageSchedulingDelay != null) {
            this.AverageSchedulingDelay = new Float(source.AverageSchedulingDelay);
        }
        if (source.AverageProcessingTime != null) {
            this.AverageProcessingTime = new Float(source.AverageProcessingTime);
        }
        if (source.AverageTotalDelay != null) {
            this.AverageTotalDelay = new Float(source.AverageTotalDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Receivers", this.Receivers);
        this.setParamSimple(map, prefix + "NumActiveReceivers", this.NumActiveReceivers);
        this.setParamSimple(map, prefix + "NumInactiveReceivers", this.NumInactiveReceivers);
        this.setParamSimple(map, prefix + "NumActiveBatches", this.NumActiveBatches);
        this.setParamSimple(map, prefix + "NumRetainedCompletedBatches", this.NumRetainedCompletedBatches);
        this.setParamSimple(map, prefix + "NumTotalCompletedBatches", this.NumTotalCompletedBatches);
        this.setParamSimple(map, prefix + "AverageInputRate", this.AverageInputRate);
        this.setParamSimple(map, prefix + "AverageSchedulingDelay", this.AverageSchedulingDelay);
        this.setParamSimple(map, prefix + "AverageProcessingTime", this.AverageProcessingTime);
        this.setParamSimple(map, prefix + "AverageTotalDelay", this.AverageTotalDelay);

    }
}

