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

public class AudioBeautifyInfo extends AbstractModel {

    /**
    * 音频美化控制开关，可选值：
<li>ON：开启音频美化；</li>
<li>OFF：关闭音频美化。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
     * Get 音频美化控制开关，可选值：
<li>ON：开启音频美化；</li>
<li>OFF：关闭音频美化。</li> 
     * @return Switch 音频美化控制开关，可选值：
<li>ON：开启音频美化；</li>
<li>OFF：关闭音频美化。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 音频美化控制开关，可选值：
<li>ON：开启音频美化；</li>
<li>OFF：关闭音频美化。</li>
     * @param Switch 音频美化控制开关，可选值：
<li>ON：开启音频美化；</li>
<li>OFF：关闭音频美化。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。 
     * @return Types 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
     * @param Types 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    public AudioBeautifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioBeautifyInfo(AudioBeautifyInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

