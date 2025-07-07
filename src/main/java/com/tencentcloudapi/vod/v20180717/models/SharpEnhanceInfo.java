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

public class SharpEnhanceInfo extends AbstractModel {

    /**
    * 细节增强控制开关，可选值：
<li>ON：开启细节增强；</li>
<li>OFF：关闭细节增强。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 细节增强强度，仅当细节增强控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
    */
    @SerializedName("Intensity")
    @Expose
    private Float Intensity;

    /**
     * Get 细节增强控制开关，可选值：
<li>ON：开启细节增强；</li>
<li>OFF：关闭细节增强。</li> 
     * @return Switch 细节增强控制开关，可选值：
<li>ON：开启细节增强；</li>
<li>OFF：关闭细节增强。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 细节增强控制开关，可选值：
<li>ON：开启细节增强；</li>
<li>OFF：关闭细节增强。</li>
     * @param Switch 细节增强控制开关，可选值：
<li>ON：开启细节增强；</li>
<li>OFF：关闭细节增强。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 细节增强强度，仅当细节增强控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。 
     * @return Intensity 细节增强强度，仅当细节增强控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
     */
    public Float getIntensity() {
        return this.Intensity;
    }

    /**
     * Set 细节增强强度，仅当细节增强控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
     * @param Intensity 细节增强强度，仅当细节增强控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
     */
    public void setIntensity(Float Intensity) {
        this.Intensity = Intensity;
    }

    public SharpEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharpEnhanceInfo(SharpEnhanceInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Intensity != null) {
            this.Intensity = new Float(source.Intensity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Intensity", this.Intensity);

    }
}

