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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanDetail extends AbstractModel{

    /**
    * 违规场景，参照<a href="https://cloud.tencent.com/document/product/607/37622#Label_Value">Label</a>定义
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该场景下概率[0.00,100.00],分值越大违规概率越高
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 违规关键字
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 关键字在音频的开始时间，从0开始的偏移量，单位为毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 关键字在音频的结束时间，从0开始的偏移量,，单位为毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 违规场景，参照<a href="https://cloud.tencent.com/document/product/607/37622#Label_Value">Label</a>定义 
     * @return Label 违规场景，参照<a href="https://cloud.tencent.com/document/product/607/37622#Label_Value">Label</a>定义
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 违规场景，参照<a href="https://cloud.tencent.com/document/product/607/37622#Label_Value">Label</a>定义
     * @param Label 违规场景，参照<a href="https://cloud.tencent.com/document/product/607/37622#Label_Value">Label</a>定义
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该场景下概率[0.00,100.00],分值越大违规概率越高 
     * @return Rate 该场景下概率[0.00,100.00],分值越大违规概率越高
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 该场景下概率[0.00,100.00],分值越大违规概率越高
     * @param Rate 该场景下概率[0.00,100.00],分值越大违规概率越高
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 违规关键字 
     * @return KeyWord 违规关键字
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 违规关键字
     * @param KeyWord 违规关键字
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 关键字在音频的开始时间，从0开始的偏移量，单位为毫秒 
     * @return StartTime 关键字在音频的开始时间，从0开始的偏移量，单位为毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 关键字在音频的开始时间，从0开始的偏移量，单位为毫秒
     * @param StartTime 关键字在音频的开始时间，从0开始的偏移量，单位为毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 关键字在音频的结束时间，从0开始的偏移量,，单位为毫秒 
     * @return EndTime 关键字在音频的结束时间，从0开始的偏移量,，单位为毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 关键字在音频的结束时间，从0开始的偏移量,，单位为毫秒
     * @param EndTime 关键字在音频的结束时间，从0开始的偏移量,，单位为毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

