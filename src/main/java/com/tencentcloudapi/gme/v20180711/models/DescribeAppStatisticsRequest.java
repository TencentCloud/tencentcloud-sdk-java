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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppStatisticsRequest extends AbstractModel {

    /**
    * GME应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
     * Get GME应用ID 
     * @return BizId GME应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set GME应用ID
     * @param BizId GME应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13 
     * @return StartDate 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     * @param StartDate 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13 
     * @return EndDate 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     * @param EndDate 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText 
     * @return Services 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * Set 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText
     * @param Services 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    public DescribeAppStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppStatisticsRequest(DescribeAppStatisticsRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Services != null) {
            this.Services = new String[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new String(source.Services[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);

    }
}

