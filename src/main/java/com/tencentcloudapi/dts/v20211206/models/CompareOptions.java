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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareOptions extends AbstractModel {

    /**
    * 对比方式：dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比), 默认为dataCheck
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 抽样比例;范围0,100。默认为100
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 线程数，取值1-8，默认为1
    */
    @SerializedName("ThreadCount")
    @Expose
    private Long ThreadCount;

    /**
    * 对比类型：builtin（内置校验）、independent（独立校验）。默认为builtin，mongodb及redis链路不支持独立校验。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 校验类型，枚举值：structureCheck-结构校验(目前仅postgresql支持)、full-全量校验、increment-增量校验(如果勾选了增量校验，Method只能选dataCheck)、advanceObject-数据库信息校验(目前仅mongodb支持) 
    */
    @SerializedName("CompareMode")
    @Expose
    private String [] CompareMode;

    /**
    * 复检次数
    */
    @SerializedName("ReCheckTime")
    @Expose
    private Long ReCheckTime;

    /**
    * 复检时间间隔，单位为分钟，取值 1-60
    */
    @SerializedName("ReCheckInterval")
    @Expose
    private Long ReCheckInterval;

    /**
     * Get 对比方式：dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比), 默认为dataCheck 
     * @return Method 对比方式：dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比), 默认为dataCheck
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 对比方式：dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比), 默认为dataCheck
     * @param Method 对比方式：dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比), 默认为dataCheck
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 抽样比例;范围0,100。默认为100 
     * @return SampleRate 抽样比例;范围0,100。默认为100
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 抽样比例;范围0,100。默认为100
     * @param SampleRate 抽样比例;范围0,100。默认为100
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 线程数，取值1-8，默认为1 
     * @return ThreadCount 线程数，取值1-8，默认为1
     */
    public Long getThreadCount() {
        return this.ThreadCount;
    }

    /**
     * Set 线程数，取值1-8，默认为1
     * @param ThreadCount 线程数，取值1-8，默认为1
     */
    public void setThreadCount(Long ThreadCount) {
        this.ThreadCount = ThreadCount;
    }

    /**
     * Get 对比类型：builtin（内置校验）、independent（独立校验）。默认为builtin，mongodb及redis链路不支持独立校验。 
     * @return Type 对比类型：builtin（内置校验）、independent（独立校验）。默认为builtin，mongodb及redis链路不支持独立校验。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 对比类型：builtin（内置校验）、independent（独立校验）。默认为builtin，mongodb及redis链路不支持独立校验。
     * @param Type 对比类型：builtin（内置校验）、independent（独立校验）。默认为builtin，mongodb及redis链路不支持独立校验。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 校验类型，枚举值：structureCheck-结构校验(目前仅postgresql支持)、full-全量校验、increment-增量校验(如果勾选了增量校验，Method只能选dataCheck)、advanceObject-数据库信息校验(目前仅mongodb支持)  
     * @return CompareMode 校验类型，枚举值：structureCheck-结构校验(目前仅postgresql支持)、full-全量校验、increment-增量校验(如果勾选了增量校验，Method只能选dataCheck)、advanceObject-数据库信息校验(目前仅mongodb支持) 
     */
    public String [] getCompareMode() {
        return this.CompareMode;
    }

    /**
     * Set 校验类型，枚举值：structureCheck-结构校验(目前仅postgresql支持)、full-全量校验、increment-增量校验(如果勾选了增量校验，Method只能选dataCheck)、advanceObject-数据库信息校验(目前仅mongodb支持) 
     * @param CompareMode 校验类型，枚举值：structureCheck-结构校验(目前仅postgresql支持)、full-全量校验、increment-增量校验(如果勾选了增量校验，Method只能选dataCheck)、advanceObject-数据库信息校验(目前仅mongodb支持) 
     */
    public void setCompareMode(String [] CompareMode) {
        this.CompareMode = CompareMode;
    }

    /**
     * Get 复检次数 
     * @return ReCheckTime 复检次数
     */
    public Long getReCheckTime() {
        return this.ReCheckTime;
    }

    /**
     * Set 复检次数
     * @param ReCheckTime 复检次数
     */
    public void setReCheckTime(Long ReCheckTime) {
        this.ReCheckTime = ReCheckTime;
    }

    /**
     * Get 复检时间间隔，单位为分钟，取值 1-60 
     * @return ReCheckInterval 复检时间间隔，单位为分钟，取值 1-60
     */
    public Long getReCheckInterval() {
        return this.ReCheckInterval;
    }

    /**
     * Set 复检时间间隔，单位为分钟，取值 1-60
     * @param ReCheckInterval 复检时间间隔，单位为分钟，取值 1-60
     */
    public void setReCheckInterval(Long ReCheckInterval) {
        this.ReCheckInterval = ReCheckInterval;
    }

    public CompareOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareOptions(CompareOptions source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ThreadCount != null) {
            this.ThreadCount = new Long(source.ThreadCount);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CompareMode != null) {
            this.CompareMode = new String[source.CompareMode.length];
            for (int i = 0; i < source.CompareMode.length; i++) {
                this.CompareMode[i] = new String(source.CompareMode[i]);
            }
        }
        if (source.ReCheckTime != null) {
            this.ReCheckTime = new Long(source.ReCheckTime);
        }
        if (source.ReCheckInterval != null) {
            this.ReCheckInterval = new Long(source.ReCheckInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ThreadCount", this.ThreadCount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "CompareMode.", this.CompareMode);
        this.setParamSimple(map, prefix + "ReCheckTime", this.ReCheckTime);
        this.setParamSimple(map, prefix + "ReCheckInterval", this.ReCheckInterval);

    }
}

