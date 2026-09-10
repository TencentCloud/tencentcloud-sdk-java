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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DubbingOutputConfig extends AbstractModel {

    /**
    * <p>输出方式</p><p>枚举值：</p><ul><li>FinalVideoOnly： 默认，仅成片视频</li><li>AudioAndSubtitle： 译文音频+译文字幕</li><li>Custom： 自定义</li></ul><p>默认值：FinalVideoOnly</p><p>使用外部字幕时无译文音频+字幕返回</p>
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * <p>输出成片视频开关</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：ON</p><p>仅 Custom 模式生效</p>
    */
    @SerializedName("OutputFinalVideo")
    @Expose
    private String OutputFinalVideo;

    /**
    * <p>输出字幕文件（同时包含原语音字幕、目标语言字幕）开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("OutputSubtitle")
    @Expose
    private String OutputSubtitle;

    /**
    * <p>输出译文配音音频开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p><p>仅 Custom 模式生效</p>
    */
    @SerializedName("OutputDstAudio")
    @Expose
    private String OutputDstAudio;

    /**
    * <p>压制字幕配置信息。</p>
    */
    @SerializedName("EmbedSubtitleConfig")
    @Expose
    private DubbingEmbedSubtitleConfig EmbedSubtitleConfig;

    /**
     * Get <p>输出方式</p><p>枚举值：</p><ul><li>FinalVideoOnly： 默认，仅成片视频</li><li>AudioAndSubtitle： 译文音频+译文字幕</li><li>Custom： 自定义</li></ul><p>默认值：FinalVideoOnly</p><p>使用外部字幕时无译文音频+字幕返回</p> 
     * @return OutputMode <p>输出方式</p><p>枚举值：</p><ul><li>FinalVideoOnly： 默认，仅成片视频</li><li>AudioAndSubtitle： 译文音频+译文字幕</li><li>Custom： 自定义</li></ul><p>默认值：FinalVideoOnly</p><p>使用外部字幕时无译文音频+字幕返回</p>
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set <p>输出方式</p><p>枚举值：</p><ul><li>FinalVideoOnly： 默认，仅成片视频</li><li>AudioAndSubtitle： 译文音频+译文字幕</li><li>Custom： 自定义</li></ul><p>默认值：FinalVideoOnly</p><p>使用外部字幕时无译文音频+字幕返回</p>
     * @param OutputMode <p>输出方式</p><p>枚举值：</p><ul><li>FinalVideoOnly： 默认，仅成片视频</li><li>AudioAndSubtitle： 译文音频+译文字幕</li><li>Custom： 自定义</li></ul><p>默认值：FinalVideoOnly</p><p>使用外部字幕时无译文音频+字幕返回</p>
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get <p>输出成片视频开关</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：ON</p><p>仅 Custom 模式生效</p> 
     * @return OutputFinalVideo <p>输出成片视频开关</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：ON</p><p>仅 Custom 模式生效</p>
     */
    public String getOutputFinalVideo() {
        return this.OutputFinalVideo;
    }

    /**
     * Set <p>输出成片视频开关</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：ON</p><p>仅 Custom 模式生效</p>
     * @param OutputFinalVideo <p>输出成片视频开关</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：ON</p><p>仅 Custom 模式生效</p>
     */
    public void setOutputFinalVideo(String OutputFinalVideo) {
        this.OutputFinalVideo = OutputFinalVideo;
    }

    /**
     * Get <p>输出字幕文件（同时包含原语音字幕、目标语言字幕）开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p> 
     * @return OutputSubtitle <p>输出字幕文件（同时包含原语音字幕、目标语言字幕）开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public String getOutputSubtitle() {
        return this.OutputSubtitle;
    }

    /**
     * Set <p>输出字幕文件（同时包含原语音字幕、目标语言字幕）开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     * @param OutputSubtitle <p>输出字幕文件（同时包含原语音字幕、目标语言字幕）开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public void setOutputSubtitle(String OutputSubtitle) {
        this.OutputSubtitle = OutputSubtitle;
    }

    /**
     * Get <p>输出译文配音音频开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p><p>仅 Custom 模式生效</p> 
     * @return OutputDstAudio <p>输出译文配音音频开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p><p>仅 Custom 模式生效</p>
     */
    public String getOutputDstAudio() {
        return this.OutputDstAudio;
    }

    /**
     * Set <p>输出译文配音音频开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p><p>仅 Custom 模式生效</p>
     * @param OutputDstAudio <p>输出译文配音音频开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p><p>仅 Custom 模式生效</p>
     */
    public void setOutputDstAudio(String OutputDstAudio) {
        this.OutputDstAudio = OutputDstAudio;
    }

    /**
     * Get <p>压制字幕配置信息。</p> 
     * @return EmbedSubtitleConfig <p>压制字幕配置信息。</p>
     */
    public DubbingEmbedSubtitleConfig getEmbedSubtitleConfig() {
        return this.EmbedSubtitleConfig;
    }

    /**
     * Set <p>压制字幕配置信息。</p>
     * @param EmbedSubtitleConfig <p>压制字幕配置信息。</p>
     */
    public void setEmbedSubtitleConfig(DubbingEmbedSubtitleConfig EmbedSubtitleConfig) {
        this.EmbedSubtitleConfig = EmbedSubtitleConfig;
    }

    public DubbingOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingOutputConfig(DubbingOutputConfig source) {
        if (source.OutputMode != null) {
            this.OutputMode = new String(source.OutputMode);
        }
        if (source.OutputFinalVideo != null) {
            this.OutputFinalVideo = new String(source.OutputFinalVideo);
        }
        if (source.OutputSubtitle != null) {
            this.OutputSubtitle = new String(source.OutputSubtitle);
        }
        if (source.OutputDstAudio != null) {
            this.OutputDstAudio = new String(source.OutputDstAudio);
        }
        if (source.EmbedSubtitleConfig != null) {
            this.EmbedSubtitleConfig = new DubbingEmbedSubtitleConfig(source.EmbedSubtitleConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputMode", this.OutputMode);
        this.setParamSimple(map, prefix + "OutputFinalVideo", this.OutputFinalVideo);
        this.setParamSimple(map, prefix + "OutputSubtitle", this.OutputSubtitle);
        this.setParamSimple(map, prefix + "OutputDstAudio", this.OutputDstAudio);
        this.setParamObj(map, prefix + "EmbedSubtitleConfig.", this.EmbedSubtitleConfig);

    }
}

