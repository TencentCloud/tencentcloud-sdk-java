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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Function extends AbstractModel{

    /**
    * 输出全部文本标识，当该值设置为true时，会输出当前音频的全部文本
    */
    @SerializedName("EnableAllText")
    @Expose
    private Boolean EnableAllText;

    /**
    * 输出关键词信息标识，当该值设置为true时，会输出当前音频的关键词信息。
    */
    @SerializedName("EnableKeyword")
    @Expose
    private Boolean EnableKeyword;

    /**
    * 静音检测标识，当设置为 true 时，需要设置静音时间阈值字段mute_threshold，统计结果中会返回静音片段。
    */
    @SerializedName("EnableMuteDetect")
    @Expose
    private Boolean EnableMuteDetect;

    /**
    * 输出音频统计信息标识，当设置为 true 时，任务查询结果会输出音频的统计信息（AsrStat）
    */
    @SerializedName("EnableVadInfo")
    @Expose
    private Boolean EnableVadInfo;

    /**
    * 输出音频音量信息标识，当设置为 true 时，会输出当前音频音量信息。
    */
    @SerializedName("EnableVolume")
    @Expose
    private Boolean EnableVolume;

    /**
     * Get 输出全部文本标识，当该值设置为true时，会输出当前音频的全部文本 
     * @return EnableAllText 输出全部文本标识，当该值设置为true时，会输出当前音频的全部文本
     */
    public Boolean getEnableAllText() {
        return this.EnableAllText;
    }

    /**
     * Set 输出全部文本标识，当该值设置为true时，会输出当前音频的全部文本
     * @param EnableAllText 输出全部文本标识，当该值设置为true时，会输出当前音频的全部文本
     */
    public void setEnableAllText(Boolean EnableAllText) {
        this.EnableAllText = EnableAllText;
    }

    /**
     * Get 输出关键词信息标识，当该值设置为true时，会输出当前音频的关键词信息。 
     * @return EnableKeyword 输出关键词信息标识，当该值设置为true时，会输出当前音频的关键词信息。
     */
    public Boolean getEnableKeyword() {
        return this.EnableKeyword;
    }

    /**
     * Set 输出关键词信息标识，当该值设置为true时，会输出当前音频的关键词信息。
     * @param EnableKeyword 输出关键词信息标识，当该值设置为true时，会输出当前音频的关键词信息。
     */
    public void setEnableKeyword(Boolean EnableKeyword) {
        this.EnableKeyword = EnableKeyword;
    }

    /**
     * Get 静音检测标识，当设置为 true 时，需要设置静音时间阈值字段mute_threshold，统计结果中会返回静音片段。 
     * @return EnableMuteDetect 静音检测标识，当设置为 true 时，需要设置静音时间阈值字段mute_threshold，统计结果中会返回静音片段。
     */
    public Boolean getEnableMuteDetect() {
        return this.EnableMuteDetect;
    }

    /**
     * Set 静音检测标识，当设置为 true 时，需要设置静音时间阈值字段mute_threshold，统计结果中会返回静音片段。
     * @param EnableMuteDetect 静音检测标识，当设置为 true 时，需要设置静音时间阈值字段mute_threshold，统计结果中会返回静音片段。
     */
    public void setEnableMuteDetect(Boolean EnableMuteDetect) {
        this.EnableMuteDetect = EnableMuteDetect;
    }

    /**
     * Get 输出音频统计信息标识，当设置为 true 时，任务查询结果会输出音频的统计信息（AsrStat） 
     * @return EnableVadInfo 输出音频统计信息标识，当设置为 true 时，任务查询结果会输出音频的统计信息（AsrStat）
     */
    public Boolean getEnableVadInfo() {
        return this.EnableVadInfo;
    }

    /**
     * Set 输出音频统计信息标识，当设置为 true 时，任务查询结果会输出音频的统计信息（AsrStat）
     * @param EnableVadInfo 输出音频统计信息标识，当设置为 true 时，任务查询结果会输出音频的统计信息（AsrStat）
     */
    public void setEnableVadInfo(Boolean EnableVadInfo) {
        this.EnableVadInfo = EnableVadInfo;
    }

    /**
     * Get 输出音频音量信息标识，当设置为 true 时，会输出当前音频音量信息。 
     * @return EnableVolume 输出音频音量信息标识，当设置为 true 时，会输出当前音频音量信息。
     */
    public Boolean getEnableVolume() {
        return this.EnableVolume;
    }

    /**
     * Set 输出音频音量信息标识，当设置为 true 时，会输出当前音频音量信息。
     * @param EnableVolume 输出音频音量信息标识，当设置为 true 时，会输出当前音频音量信息。
     */
    public void setEnableVolume(Boolean EnableVolume) {
        this.EnableVolume = EnableVolume;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableAllText", this.EnableAllText);
        this.setParamSimple(map, prefix + "EnableKeyword", this.EnableKeyword);
        this.setParamSimple(map, prefix + "EnableMuteDetect", this.EnableMuteDetect);
        this.setParamSimple(map, prefix + "EnableVadInfo", this.EnableVadInfo);
        this.setParamSimple(map, prefix + "EnableVolume", this.EnableVolume);

    }
}

