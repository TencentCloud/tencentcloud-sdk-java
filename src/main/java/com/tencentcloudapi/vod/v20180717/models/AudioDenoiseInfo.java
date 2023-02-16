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

public class AudioDenoiseInfo extends AbstractModel{

    /**
    * 音频降噪控制开关，可选值：
<li>ON：开启音频降噪；</li>
<li>OFF：关闭音频降噪。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 音频降噪类型，仅当音频降噪控制开关为 ON 时有效，可选值：
<li>weak：轻音频降噪；</li>
<li>normal：正常音频降噪；</li>
<li>strong：强音频降噪。</li>
默认值：weak。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 音频降噪控制开关，可选值：
<li>ON：开启音频降噪；</li>
<li>OFF：关闭音频降噪。</li> 
     * @return Switch 音频降噪控制开关，可选值：
<li>ON：开启音频降噪；</li>
<li>OFF：关闭音频降噪。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 音频降噪控制开关，可选值：
<li>ON：开启音频降噪；</li>
<li>OFF：关闭音频降噪。</li>
     * @param Switch 音频降噪控制开关，可选值：
<li>ON：开启音频降噪；</li>
<li>OFF：关闭音频降噪。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 音频降噪类型，仅当音频降噪控制开关为 ON 时有效，可选值：
<li>weak：轻音频降噪；</li>
<li>normal：正常音频降噪；</li>
<li>strong：强音频降噪。</li>
默认值：weak。 
     * @return Type 音频降噪类型，仅当音频降噪控制开关为 ON 时有效，可选值：
<li>weak：轻音频降噪；</li>
<li>normal：正常音频降噪；</li>
<li>strong：强音频降噪。</li>
默认值：weak。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 音频降噪类型，仅当音频降噪控制开关为 ON 时有效，可选值：
<li>weak：轻音频降噪；</li>
<li>normal：正常音频降噪；</li>
<li>strong：强音频降噪。</li>
默认值：weak。
     * @param Type 音频降噪类型，仅当音频降噪控制开关为 ON 时有效，可选值：
<li>weak：轻音频降噪；</li>
<li>normal：正常音频降噪；</li>
<li>strong：强音频降噪。</li>
默认值：weak。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AudioDenoiseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioDenoiseInfo(AudioDenoiseInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

