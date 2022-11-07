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

public class FlowVideo extends AbstractModel{

    /**
    * 帧率。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 码率，单位是bps。
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * 音频Pid。
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
     * Get 帧率。 
     * @return Fps 帧率。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率。
     * @param Fps 帧率。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 码率，单位是bps。 
     * @return Rate 码率，单位是bps。
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set 码率，单位是bps。
     * @param Rate 码率，单位是bps。
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 音频Pid。 
     * @return Pid 音频Pid。
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 音频Pid。
     * @param Pid 音频Pid。
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    public FlowVideo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowVideo(FlowVideo source) {
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

