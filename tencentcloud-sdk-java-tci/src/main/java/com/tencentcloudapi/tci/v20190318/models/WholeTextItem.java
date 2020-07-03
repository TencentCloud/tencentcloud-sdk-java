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

public class WholeTextItem extends AbstractModel{

    /**
    * 当前句子的信息
    */
    @SerializedName("TextItem")
    @Expose
    private TextItem TextItem;

    /**
    * Vad的平均音量
    */
    @SerializedName("AvgVolume")
    @Expose
    private Float AvgVolume;

    /**
    * Vad的最大音量
    */
    @SerializedName("MaxVolume")
    @Expose
    private Float MaxVolume;

    /**
    * Vad的最小音量
    */
    @SerializedName("MinVolume")
    @Expose
    private Float MinVolume;

    /**
    * 当前句子的语速
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
     * Get 当前句子的信息 
     * @return TextItem 当前句子的信息
     */
    public TextItem getTextItem() {
        return this.TextItem;
    }

    /**
     * Set 当前句子的信息
     * @param TextItem 当前句子的信息
     */
    public void setTextItem(TextItem TextItem) {
        this.TextItem = TextItem;
    }

    /**
     * Get Vad的平均音量 
     * @return AvgVolume Vad的平均音量
     */
    public Float getAvgVolume() {
        return this.AvgVolume;
    }

    /**
     * Set Vad的平均音量
     * @param AvgVolume Vad的平均音量
     */
    public void setAvgVolume(Float AvgVolume) {
        this.AvgVolume = AvgVolume;
    }

    /**
     * Get Vad的最大音量 
     * @return MaxVolume Vad的最大音量
     */
    public Float getMaxVolume() {
        return this.MaxVolume;
    }

    /**
     * Set Vad的最大音量
     * @param MaxVolume Vad的最大音量
     */
    public void setMaxVolume(Float MaxVolume) {
        this.MaxVolume = MaxVolume;
    }

    /**
     * Get Vad的最小音量 
     * @return MinVolume Vad的最小音量
     */
    public Float getMinVolume() {
        return this.MinVolume;
    }

    /**
     * Set Vad的最小音量
     * @param MinVolume Vad的最小音量
     */
    public void setMinVolume(Float MinVolume) {
        this.MinVolume = MinVolume;
    }

    /**
     * Get 当前句子的语速 
     * @return Speed 当前句子的语速
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 当前句子的语速
     * @param Speed 当前句子的语速
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TextItem.", this.TextItem);
        this.setParamSimple(map, prefix + "AvgVolume", this.AvgVolume);
        this.setParamSimple(map, prefix + "MaxVolume", this.MaxVolume);
        this.setParamSimple(map, prefix + "MinVolume", this.MinVolume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);

    }
}

