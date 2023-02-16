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

public class ScratchRepairInfo extends AbstractModel{

    /**
    * 去划痕控制开关，可选值：
<li>ON：开启去划痕；</li>
<li>OFF：关闭去划痕。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 去划痕强度，仅当去划痕控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
    */
    @SerializedName("Intensity")
    @Expose
    private Float Intensity;

    /**
    * 去划痕类型，仅当去划痕控制开关为 ON 时有效，可选值：
<li>normal：正常去划痕；</li>
默认值：normal。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 去划痕控制开关，可选值：
<li>ON：开启去划痕；</li>
<li>OFF：关闭去划痕。</li> 
     * @return Switch 去划痕控制开关，可选值：
<li>ON：开启去划痕；</li>
<li>OFF：关闭去划痕。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 去划痕控制开关，可选值：
<li>ON：开启去划痕；</li>
<li>OFF：关闭去划痕。</li>
     * @param Switch 去划痕控制开关，可选值：
<li>ON：开启去划痕；</li>
<li>OFF：关闭去划痕。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 去划痕强度，仅当去划痕控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。 
     * @return Intensity 去划痕强度，仅当去划痕控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
     */
    public Float getIntensity() {
        return this.Intensity;
    }

    /**
     * Set 去划痕强度，仅当去划痕控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
     * @param Intensity 去划痕强度，仅当去划痕控制开关为 ON 时有效，取值范围：0.0~1.0。
默认：0.0。
     */
    public void setIntensity(Float Intensity) {
        this.Intensity = Intensity;
    }

    /**
     * Get 去划痕类型，仅当去划痕控制开关为 ON 时有效，可选值：
<li>normal：正常去划痕；</li>
默认值：normal。 
     * @return Type 去划痕类型，仅当去划痕控制开关为 ON 时有效，可选值：
<li>normal：正常去划痕；</li>
默认值：normal。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 去划痕类型，仅当去划痕控制开关为 ON 时有效，可选值：
<li>normal：正常去划痕；</li>
默认值：normal。
     * @param Type 去划痕类型，仅当去划痕控制开关为 ON 时有效，可选值：
<li>normal：正常去划痕；</li>
默认值：normal。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ScratchRepairInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScratchRepairInfo(ScratchRepairInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Intensity != null) {
            this.Intensity = new Float(source.Intensity);
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
        this.setParamSimple(map, prefix + "Intensity", this.Intensity);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

