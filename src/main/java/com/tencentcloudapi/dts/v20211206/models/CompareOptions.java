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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ThreadCount", this.ThreadCount);

    }
}

