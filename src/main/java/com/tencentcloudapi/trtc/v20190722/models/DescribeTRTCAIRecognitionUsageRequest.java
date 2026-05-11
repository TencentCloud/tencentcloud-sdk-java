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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCAIRecognitionUsageRequest extends AbstractModel {

    /**
    * 查询开始时间，格式为YYYY-MM-DD HH:mm:ss。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，格式为YYYY-MM-DD HH:mm:ss。单次查询统计区间最多不能超过31天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 用量类型列表。
- conversation AI 实时对话
- asr 语音转文本
- translation 实时翻译
- tts 实时语音合成
    */
    @SerializedName("AuType")
    @Expose
    private String [] AuType;

    /**
    * 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
     * Get 查询开始时间，格式为YYYY-MM-DD HH:mm:ss。 
     * @return StartTime 查询开始时间，格式为YYYY-MM-DD HH:mm:ss。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，格式为YYYY-MM-DD HH:mm:ss。
     * @param StartTime 查询开始时间，格式为YYYY-MM-DD HH:mm:ss。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，格式为YYYY-MM-DD HH:mm:ss。单次查询统计区间最多不能超过31天。 
     * @return EndTime 查询结束时间，格式为YYYY-MM-DD HH:mm:ss。单次查询统计区间最多不能超过31天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，格式为YYYY-MM-DD HH:mm:ss。单次查询统计区间最多不能超过31天。
     * @param EndTime 查询结束时间，格式为YYYY-MM-DD HH:mm:ss。单次查询统计区间最多不能超过31天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用量类型列表。
- conversation AI 实时对话
- asr 语音转文本
- translation 实时翻译
- tts 实时语音合成 
     * @return AuType 用量类型列表。
- conversation AI 实时对话
- asr 语音转文本
- translation 实时翻译
- tts 实时语音合成
     */
    public String [] getAuType() {
        return this.AuType;
    }

    /**
     * Set 用量类型列表。
- conversation AI 实时对话
- asr 语音转文本
- translation 实时翻译
- tts 实时语音合成
     * @param AuType 用量类型列表。
- conversation AI 实时对话
- asr 语音转文本
- translation 实时翻译
- tts 实时语音合成
     */
    public void setAuType(String [] AuType) {
        this.AuType = AuType;
    }

    /**
     * Get 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。 
     * @return SdkAppId 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
     * @param SdkAppId 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public DescribeTRTCAIRecognitionUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCAIRecognitionUsageRequest(DescribeTRTCAIRecognitionUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AuType != null) {
            this.AuType = new String[source.AuType.length];
            for (int i = 0; i < source.AuType.length; i++) {
                this.AuType[i] = new String(source.AuType[i]);
            }
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "AuType.", this.AuType);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

