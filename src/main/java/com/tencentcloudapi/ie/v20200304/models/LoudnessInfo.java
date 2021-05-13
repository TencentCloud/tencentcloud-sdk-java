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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoudnessInfo extends AbstractModel{

    /**
    * 音频整体响度
    */
    @SerializedName("Loudness")
    @Expose
    private Float Loudness;

    /**
    * 音频响度范围
    */
    @SerializedName("LoudnessRange")
    @Expose
    private Float LoudnessRange;

    /**
     * Get 音频整体响度 
     * @return Loudness 音频整体响度
     */
    public Float getLoudness() {
        return this.Loudness;
    }

    /**
     * Set 音频整体响度
     * @param Loudness 音频整体响度
     */
    public void setLoudness(Float Loudness) {
        this.Loudness = Loudness;
    }

    /**
     * Get 音频响度范围 
     * @return LoudnessRange 音频响度范围
     */
    public Float getLoudnessRange() {
        return this.LoudnessRange;
    }

    /**
     * Set 音频响度范围
     * @param LoudnessRange 音频响度范围
     */
    public void setLoudnessRange(Float LoudnessRange) {
        this.LoudnessRange = LoudnessRange;
    }

    public LoudnessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoudnessInfo(LoudnessInfo source) {
        if (source.Loudness != null) {
            this.Loudness = new Float(source.Loudness);
        }
        if (source.LoudnessRange != null) {
            this.LoudnessRange = new Float(source.LoudnessRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Loudness", this.Loudness);
        this.setParamSimple(map, prefix + "LoudnessRange", this.LoudnessRange);

    }
}

