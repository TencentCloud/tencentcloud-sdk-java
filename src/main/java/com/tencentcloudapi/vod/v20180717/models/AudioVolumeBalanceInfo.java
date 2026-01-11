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

public class AudioVolumeBalanceInfo extends AbstractModel {

    /**
    * 音量均衡控制开关，可选值：
<li>ON：开启音量均衡；</li>
<li>OFF：关闭音量均衡。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 类型，可选值：
<li>loudNorm：响度标准化</li>
<li>gainControl：减小突变</li>
默认值：loudNorm。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 音量均衡控制开关，可选值：
<li>ON：开启音量均衡；</li>
<li>OFF：关闭音量均衡。</li> 
     * @return Switch 音量均衡控制开关，可选值：
<li>ON：开启音量均衡；</li>
<li>OFF：关闭音量均衡。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 音量均衡控制开关，可选值：
<li>ON：开启音量均衡；</li>
<li>OFF：关闭音量均衡。</li>
     * @param Switch 音量均衡控制开关，可选值：
<li>ON：开启音量均衡；</li>
<li>OFF：关闭音量均衡。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 类型，可选值：
<li>loudNorm：响度标准化</li>
<li>gainControl：减小突变</li>
默认值：loudNorm。 
     * @return Type 类型，可选值：
<li>loudNorm：响度标准化</li>
<li>gainControl：减小突变</li>
默认值：loudNorm。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，可选值：
<li>loudNorm：响度标准化</li>
<li>gainControl：减小突变</li>
默认值：loudNorm。
     * @param Type 类型，可选值：
<li>loudNorm：响度标准化</li>
<li>gainControl：减小突变</li>
默认值：loudNorm。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AudioVolumeBalanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioVolumeBalanceInfo(AudioVolumeBalanceInfo source) {
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

