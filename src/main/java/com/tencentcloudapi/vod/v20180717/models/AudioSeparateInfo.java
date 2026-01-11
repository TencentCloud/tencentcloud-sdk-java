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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioSeparateInfo extends AbstractModel {

    /**
    * 音频分离控制开关，可选值：
<li>ON：开启音频分离；</li>
<li>OFF：关闭音频分离。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 场景类型，可选值：
<li>normal：人声背景声场景</li>
<li>music：演唱伴奏场景</li>
默认值：normal。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输出音轨，可选值：
<li>vocal：输出人声</li>
<li>background：应用场景为normal时输出背景声，应用场景为music时输出伴奏</li>
默认值：vocal。
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
     * Get 音频分离控制开关，可选值：
<li>ON：开启音频分离；</li>
<li>OFF：关闭音频分离。</li> 
     * @return Switch 音频分离控制开关，可选值：
<li>ON：开启音频分离；</li>
<li>OFF：关闭音频分离。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 音频分离控制开关，可选值：
<li>ON：开启音频分离；</li>
<li>OFF：关闭音频分离。</li>
     * @param Switch 音频分离控制开关，可选值：
<li>ON：开启音频分离；</li>
<li>OFF：关闭音频分离。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 场景类型，可选值：
<li>normal：人声背景声场景</li>
<li>music：演唱伴奏场景</li>
默认值：normal。 
     * @return Type 场景类型，可选值：
<li>normal：人声背景声场景</li>
<li>music：演唱伴奏场景</li>
默认值：normal。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 场景类型，可选值：
<li>normal：人声背景声场景</li>
<li>music：演唱伴奏场景</li>
默认值：normal。
     * @param Type 场景类型，可选值：
<li>normal：人声背景声场景</li>
<li>music：演唱伴奏场景</li>
默认值：normal。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输出音轨，可选值：
<li>vocal：输出人声</li>
<li>background：应用场景为normal时输出背景声，应用场景为music时输出伴奏</li>
默认值：vocal。 
     * @return Track 输出音轨，可选值：
<li>vocal：输出人声</li>
<li>background：应用场景为normal时输出背景声，应用场景为music时输出伴奏</li>
默认值：vocal。
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * Set 输出音轨，可选值：
<li>vocal：输出人声</li>
<li>background：应用场景为normal时输出背景声，应用场景为music时输出伴奏</li>
默认值：vocal。
     * @param Track 输出音轨，可选值：
<li>vocal：输出人声</li>
<li>background：应用场景为normal时输出背景声，应用场景为music时输出伴奏</li>
默认值：vocal。
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    public AudioSeparateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSeparateInfo(AudioSeparateInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Track != null) {
            this.Track = new String(source.Track);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Track", this.Track);

    }
}

