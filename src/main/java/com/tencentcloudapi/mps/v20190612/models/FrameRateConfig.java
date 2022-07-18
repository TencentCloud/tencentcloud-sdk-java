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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameRateConfig extends AbstractModel{

    /**
    * 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 帧率，取值范围：[0, 100]，单位：Hz。
默认值 0。
注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。 
     * @return Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
     * @param Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 帧率，取值范围：[0, 100]，单位：Hz。
默认值 0。
注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 帧率，取值范围：[0, 100]，单位：Hz。
默认值 0。
注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，取值范围：[0, 100]，单位：Hz。
默认值 0。
注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 帧率，取值范围：[0, 100]，单位：Hz。
默认值 0。
注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public FrameRateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameRateConfig(FrameRateConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

