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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TravelResult extends AbstractModel {

    /**
    * 一级标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 二级标签
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 出行音频角色
    */
    @SerializedName("AudioRole")
    @Expose
    private String AudioRole;

    /**
    * 出行语音文本
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
     * Get 一级标签 
     * @return Label 一级标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 一级标签
     * @param Label 一级标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 二级标签 
     * @return SubLabel 二级标签
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 二级标签
     * @param SubLabel 二级标签
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 出行音频角色 
     * @return AudioRole 出行音频角色
     */
    public String getAudioRole() {
        return this.AudioRole;
    }

    /**
     * Set 出行音频角色
     * @param AudioRole 出行音频角色
     */
    public void setAudioRole(String AudioRole) {
        this.AudioRole = AudioRole;
    }

    /**
     * Get 出行语音文本 
     * @return AudioText 出行语音文本
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set 出行语音文本
     * @param AudioText 出行语音文本
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    public TravelResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TravelResult(TravelResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.AudioRole != null) {
            this.AudioRole = new String(source.AudioRole);
        }
        if (source.AudioText != null) {
            this.AudioText = new String(source.AudioText);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "AudioRole", this.AudioRole);
        this.setParamSimple(map, prefix + "AudioText", this.AudioText);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

