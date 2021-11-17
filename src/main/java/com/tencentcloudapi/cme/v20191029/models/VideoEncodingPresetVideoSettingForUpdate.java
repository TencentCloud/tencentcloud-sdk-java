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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEncodingPresetVideoSettingForUpdate extends AbstractModel{

    /**
    * 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例：如果项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720。</li>
如果项目的宽高比是 9：16 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1080 * 1920。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 720 * 1280。</li>
不填则不修改。
    */
    @SerializedName("ShortEdge")
    @Expose
    private Long ShortEdge;

    /**
    * 指定码率，单位 bps。当该参数为'0' 时则不强制限定码率。
不填则不修改。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 指定帧率。单位 Hz。
不填则不修改。
    */
    @SerializedName("FrameRate")
    @Expose
    private Float FrameRate;

    /**
     * Get 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例：如果项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720。</li>
如果项目的宽高比是 9：16 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1080 * 1920。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 720 * 1280。</li>
不填则不修改。 
     * @return ShortEdge 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例：如果项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720。</li>
如果项目的宽高比是 9：16 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1080 * 1920。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 720 * 1280。</li>
不填则不修改。
     */
    public Long getShortEdge() {
        return this.ShortEdge;
    }

    /**
     * Set 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例：如果项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720。</li>
如果项目的宽高比是 9：16 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1080 * 1920。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 720 * 1280。</li>
不填则不修改。
     * @param ShortEdge 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例：如果项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720。</li>
如果项目的宽高比是 9：16 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1080 * 1920。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 720 * 1280。</li>
不填则不修改。
     */
    public void setShortEdge(Long ShortEdge) {
        this.ShortEdge = ShortEdge;
    }

    /**
     * Get 指定码率，单位 bps。当该参数为'0' 时则不强制限定码率。
不填则不修改。 
     * @return Bitrate 指定码率，单位 bps。当该参数为'0' 时则不强制限定码率。
不填则不修改。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 指定码率，单位 bps。当该参数为'0' 时则不强制限定码率。
不填则不修改。
     * @param Bitrate 指定码率，单位 bps。当该参数为'0' 时则不强制限定码率。
不填则不修改。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 指定帧率。单位 Hz。
不填则不修改。 
     * @return FrameRate 指定帧率。单位 Hz。
不填则不修改。
     */
    public Float getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 指定帧率。单位 Hz。
不填则不修改。
     * @param FrameRate 指定帧率。单位 Hz。
不填则不修改。
     */
    public void setFrameRate(Float FrameRate) {
        this.FrameRate = FrameRate;
    }

    public VideoEncodingPresetVideoSettingForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncodingPresetVideoSettingForUpdate(VideoEncodingPresetVideoSettingForUpdate source) {
        if (source.ShortEdge != null) {
            this.ShortEdge = new Long(source.ShortEdge);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.FrameRate != null) {
            this.FrameRate = new Float(source.FrameRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShortEdge", this.ShortEdge);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "FrameRate", this.FrameRate);

    }
}

