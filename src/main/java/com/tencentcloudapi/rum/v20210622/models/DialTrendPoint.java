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

public class DialTrendPoint extends AbstractModel {

    /**
    * <p>时间桶，格式 yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>执行批次数</p>
    */
    @SerializedName("ExecutionCount")
    @Expose
    private Long ExecutionCount;

    /**
    * <p>成功批次数</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>失败批次数</p>
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * <p>平均时延，单位毫秒</p>
    */
    @SerializedName("AvgDuration")
    @Expose
    private Float AvgDuration;

    /**
    * <p>聚合桶时间。与旧字段 Time 同源，保留 Time 及其格式；按查询服务运行时区输出。</p><p>参数格式：RFC3339，带数值时区偏移，例如 2026-10-01T00:00:00+08:00。</p>
    */
    @SerializedName("Datetime")
    @Expose
    private String Datetime;

    /**
     * Get <p>时间桶，格式 yyyy-MM-dd HH:mm:ss</p> 
     * @return Time <p>时间桶，格式 yyyy-MM-dd HH:mm:ss</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间桶，格式 yyyy-MM-dd HH:mm:ss</p>
     * @param Time <p>时间桶，格式 yyyy-MM-dd HH:mm:ss</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>执行批次数</p> 
     * @return ExecutionCount <p>执行批次数</p>
     */
    public Long getExecutionCount() {
        return this.ExecutionCount;
    }

    /**
     * Set <p>执行批次数</p>
     * @param ExecutionCount <p>执行批次数</p>
     */
    public void setExecutionCount(Long ExecutionCount) {
        this.ExecutionCount = ExecutionCount;
    }

    /**
     * Get <p>成功批次数</p> 
     * @return SuccessCount <p>成功批次数</p>
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>成功批次数</p>
     * @param SuccessCount <p>成功批次数</p>
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>失败批次数</p> 
     * @return FailCount <p>失败批次数</p>
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set <p>失败批次数</p>
     * @param FailCount <p>失败批次数</p>
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get <p>平均时延，单位毫秒</p> 
     * @return AvgDuration <p>平均时延，单位毫秒</p>
     */
    public Float getAvgDuration() {
        return this.AvgDuration;
    }

    /**
     * Set <p>平均时延，单位毫秒</p>
     * @param AvgDuration <p>平均时延，单位毫秒</p>
     */
    public void setAvgDuration(Float AvgDuration) {
        this.AvgDuration = AvgDuration;
    }

    /**
     * Get <p>聚合桶时间。与旧字段 Time 同源，保留 Time 及其格式；按查询服务运行时区输出。</p><p>参数格式：RFC3339，带数值时区偏移，例如 2026-10-01T00:00:00+08:00。</p> 
     * @return Datetime <p>聚合桶时间。与旧字段 Time 同源，保留 Time 及其格式；按查询服务运行时区输出。</p><p>参数格式：RFC3339，带数值时区偏移，例如 2026-10-01T00:00:00+08:00。</p>
     */
    public String getDatetime() {
        return this.Datetime;
    }

    /**
     * Set <p>聚合桶时间。与旧字段 Time 同源，保留 Time 及其格式；按查询服务运行时区输出。</p><p>参数格式：RFC3339，带数值时区偏移，例如 2026-10-01T00:00:00+08:00。</p>
     * @param Datetime <p>聚合桶时间。与旧字段 Time 同源，保留 Time 及其格式；按查询服务运行时区输出。</p><p>参数格式：RFC3339，带数值时区偏移，例如 2026-10-01T00:00:00+08:00。</p>
     */
    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    public DialTrendPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DialTrendPoint(DialTrendPoint source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ExecutionCount != null) {
            this.ExecutionCount = new Long(source.ExecutionCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.AvgDuration != null) {
            this.AvgDuration = new Float(source.AvgDuration);
        }
        if (source.Datetime != null) {
            this.Datetime = new String(source.Datetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ExecutionCount", this.ExecutionCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "AvgDuration", this.AvgDuration);
        this.setParamSimple(map, prefix + "Datetime", this.Datetime);

    }
}

