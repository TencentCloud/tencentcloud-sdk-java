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
    * <p>GME应用ID</p>
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * <p>数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText</p>
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
     * Get <p>GME应用ID</p> 
     * @return BizId <p>GME应用ID</p>
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set <p>GME应用ID</p>
     * @param BizId <p>GME应用ID</p>
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get <p>数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p> 
     * @return StartDate <p>数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
     * @param StartDate <p>数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p> 
     * @return EndDate <p>数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
     * @param EndDate <p>数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText</p> 
     * @return Services <p>要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText</p>
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * Set <p>要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText</p>
     * @param Services <p>要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter/SpeechToText</p>
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

