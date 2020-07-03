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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioVolumeParam extends AbstractModel{

    /**
    * 是否静音，取值范围0或1。
<li>0表示不静音。</li>
<li>1表示静音。</li>
默认是0。
    */
    @SerializedName("Mute")
    @Expose
    private Long Mute;

    /**
    * 音频增益，取值范围0~10。
<li>大于1表示增加音量。</li>
<li>小于1表示降低音量。</li>
<li>0和1：表示不改变。</li>
默认是0。
    */
    @SerializedName("Gain")
    @Expose
    private Float Gain;

    /**
     * Get 是否静音，取值范围0或1。
<li>0表示不静音。</li>
<li>1表示静音。</li>
默认是0。 
     * @return Mute 是否静音，取值范围0或1。
<li>0表示不静音。</li>
<li>1表示静音。</li>
默认是0。
     */
    public Long getMute() {
        return this.Mute;
    }

    /**
     * Set 是否静音，取值范围0或1。
<li>0表示不静音。</li>
<li>1表示静音。</li>
默认是0。
     * @param Mute 是否静音，取值范围0或1。
<li>0表示不静音。</li>
<li>1表示静音。</li>
默认是0。
     */
    public void setMute(Long Mute) {
        this.Mute = Mute;
    }

    /**
     * Get 音频增益，取值范围0~10。
<li>大于1表示增加音量。</li>
<li>小于1表示降低音量。</li>
<li>0和1：表示不改变。</li>
默认是0。 
     * @return Gain 音频增益，取值范围0~10。
<li>大于1表示增加音量。</li>
<li>小于1表示降低音量。</li>
<li>0和1：表示不改变。</li>
默认是0。
     */
    public Float getGain() {
        return this.Gain;
    }

    /**
     * Set 音频增益，取值范围0~10。
<li>大于1表示增加音量。</li>
<li>小于1表示降低音量。</li>
<li>0和1：表示不改变。</li>
默认是0。
     * @param Gain 音频增益，取值范围0~10。
<li>大于1表示增加音量。</li>
<li>小于1表示降低音量。</li>
<li>0和1：表示不改变。</li>
默认是0。
     */
    public void setGain(Float Gain) {
        this.Gain = Gain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mute", this.Mute);
        this.setParamSimple(map, prefix + "Gain", this.Gain);

    }
}

