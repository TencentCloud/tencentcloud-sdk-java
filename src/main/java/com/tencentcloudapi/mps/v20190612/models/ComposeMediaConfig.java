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

public class ComposeMediaConfig extends AbstractModel{

    /**
    * 合成目标视频信息。
    */
    @SerializedName("TargetInfo")
    @Expose
    private ComposeTargetInfo TargetInfo;

    /**
    * 合成目标视频的画布信息。
    */
    @SerializedName("Canvas")
    @Expose
    private ComposeCanvas Canvas;

    /**
    * 全局样式，和轨道 Tracks 配合使用，用于定于样式，如字幕样式。
    */
    @SerializedName("Styles")
    @Expose
    private ComposeStyles [] Styles;

    /**
    * 用于描述合成视频的轨道列表，包括：视频、音频、图片、文字等元素组成的多个轨道信息。关于轨道和时间：
<ul><li>轨道时间轴即为目标视频时间轴。</li><li>时间轴上相同时间点的不同轨道上的元素会重叠：</li><ul><li>视频、图片、文字：按轨道顺序进行图像的叠加，轨道顺序靠前的在上面。</li><li>音频 ：进行混音。</li></ul></ul>注意：同一轨道中各个元素（除字幕元素外）的轨道时间不能重叠。
    */
    @SerializedName("Tracks")
    @Expose
    private ComposeMediaTrack [] Tracks;

    /**
     * Get 合成目标视频信息。 
     * @return TargetInfo 合成目标视频信息。
     */
    public ComposeTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 合成目标视频信息。
     * @param TargetInfo 合成目标视频信息。
     */
    public void setTargetInfo(ComposeTargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    /**
     * Get 合成目标视频的画布信息。 
     * @return Canvas 合成目标视频的画布信息。
     */
    public ComposeCanvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set 合成目标视频的画布信息。
     * @param Canvas 合成目标视频的画布信息。
     */
    public void setCanvas(ComposeCanvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get 全局样式，和轨道 Tracks 配合使用，用于定于样式，如字幕样式。 
     * @return Styles 全局样式，和轨道 Tracks 配合使用，用于定于样式，如字幕样式。
     */
    public ComposeStyles [] getStyles() {
        return this.Styles;
    }

    /**
     * Set 全局样式，和轨道 Tracks 配合使用，用于定于样式，如字幕样式。
     * @param Styles 全局样式，和轨道 Tracks 配合使用，用于定于样式，如字幕样式。
     */
    public void setStyles(ComposeStyles [] Styles) {
        this.Styles = Styles;
    }

    /**
     * Get 用于描述合成视频的轨道列表，包括：视频、音频、图片、文字等元素组成的多个轨道信息。关于轨道和时间：
<ul><li>轨道时间轴即为目标视频时间轴。</li><li>时间轴上相同时间点的不同轨道上的元素会重叠：</li><ul><li>视频、图片、文字：按轨道顺序进行图像的叠加，轨道顺序靠前的在上面。</li><li>音频 ：进行混音。</li></ul></ul>注意：同一轨道中各个元素（除字幕元素外）的轨道时间不能重叠。 
     * @return Tracks 用于描述合成视频的轨道列表，包括：视频、音频、图片、文字等元素组成的多个轨道信息。关于轨道和时间：
<ul><li>轨道时间轴即为目标视频时间轴。</li><li>时间轴上相同时间点的不同轨道上的元素会重叠：</li><ul><li>视频、图片、文字：按轨道顺序进行图像的叠加，轨道顺序靠前的在上面。</li><li>音频 ：进行混音。</li></ul></ul>注意：同一轨道中各个元素（除字幕元素外）的轨道时间不能重叠。
     */
    public ComposeMediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set 用于描述合成视频的轨道列表，包括：视频、音频、图片、文字等元素组成的多个轨道信息。关于轨道和时间：
<ul><li>轨道时间轴即为目标视频时间轴。</li><li>时间轴上相同时间点的不同轨道上的元素会重叠：</li><ul><li>视频、图片、文字：按轨道顺序进行图像的叠加，轨道顺序靠前的在上面。</li><li>音频 ：进行混音。</li></ul></ul>注意：同一轨道中各个元素（除字幕元素外）的轨道时间不能重叠。
     * @param Tracks 用于描述合成视频的轨道列表，包括：视频、音频、图片、文字等元素组成的多个轨道信息。关于轨道和时间：
<ul><li>轨道时间轴即为目标视频时间轴。</li><li>时间轴上相同时间点的不同轨道上的元素会重叠：</li><ul><li>视频、图片、文字：按轨道顺序进行图像的叠加，轨道顺序靠前的在上面。</li><li>音频 ：进行混音。</li></ul></ul>注意：同一轨道中各个元素（除字幕元素外）的轨道时间不能重叠。
     */
    public void setTracks(ComposeMediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    public ComposeMediaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaConfig(ComposeMediaConfig source) {
        if (source.TargetInfo != null) {
            this.TargetInfo = new ComposeTargetInfo(source.TargetInfo);
        }
        if (source.Canvas != null) {
            this.Canvas = new ComposeCanvas(source.Canvas);
        }
        if (source.Styles != null) {
            this.Styles = new ComposeStyles[source.Styles.length];
            for (int i = 0; i < source.Styles.length; i++) {
                this.Styles[i] = new ComposeStyles(source.Styles[i]);
            }
        }
        if (source.Tracks != null) {
            this.Tracks = new ComposeMediaTrack[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new ComposeMediaTrack(source.Tracks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamArrayObj(map, prefix + "Styles.", this.Styles);
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);

    }
}

