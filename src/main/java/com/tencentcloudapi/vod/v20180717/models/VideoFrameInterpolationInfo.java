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

public class VideoFrameInterpolationInfo extends AbstractModel{

    /**
    * 智能插帧控制开关，可选值：
<li>ON：开启智能插帧；</li>
<li>OFF：关闭智能插帧。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 智能插帧帧率，帧率范围为 (0, 100]，仅当智能插帧控制开关为 ON 时有效。默认跟源文件帧率一致。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get 智能插帧控制开关，可选值：
<li>ON：开启智能插帧；</li>
<li>OFF：关闭智能插帧。</li> 
     * @return Switch 智能插帧控制开关，可选值：
<li>ON：开启智能插帧；</li>
<li>OFF：关闭智能插帧。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 智能插帧控制开关，可选值：
<li>ON：开启智能插帧；</li>
<li>OFF：关闭智能插帧。</li>
     * @param Switch 智能插帧控制开关，可选值：
<li>ON：开启智能插帧；</li>
<li>OFF：关闭智能插帧。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 智能插帧帧率，帧率范围为 (0, 100]，仅当智能插帧控制开关为 ON 时有效。默认跟源文件帧率一致。 
     * @return Fps 智能插帧帧率，帧率范围为 (0, 100]，仅当智能插帧控制开关为 ON 时有效。默认跟源文件帧率一致。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 智能插帧帧率，帧率范围为 (0, 100]，仅当智能插帧控制开关为 ON 时有效。默认跟源文件帧率一致。
     * @param Fps 智能插帧帧率，帧率范围为 (0, 100]，仅当智能插帧控制开关为 ON 时有效。默认跟源文件帧率一致。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public VideoFrameInterpolationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoFrameInterpolationInfo(VideoFrameInterpolationInfo source) {
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

