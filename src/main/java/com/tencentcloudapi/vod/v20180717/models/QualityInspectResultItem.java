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

public class QualityInspectResultItem extends AbstractModel {

    /**
    * <p>异常类型，取值范围：</p><li>Jitter：抖动；</li><li>Blur：模糊；</li><li>LowLighting：低光照；</li><li>HighLighting：过曝；</li><li>CrashScreen：花屏；</li><li>BlackWhiteEdge：黑白边；</li><li>SolidColorScreen：纯色屏；</li><li>Noise：噪点；</li><li>Mosaic：马赛克；</li><li>QRCode：二维码；</li><li>AppletCode：小程序码；</li><li>BarCode：条形码；</li><li>LowVoice：低音；</li><li>HighVoice：爆音；</li><li>NoVoice：静音；</li><li>LowEvaluation：无参考打分低于阈值。</li><li> LowColorfulness：色彩丰富度信息。</li><li> AudioVideoAsync：音画不同步。</li><li> AudioSubtitleAsync：音频与字幕不同步。</li><li> VideoAesthetic：视频美学评分低。</li><li> AudioDiscontinuity：音频不连续。</li><li> AudioVolume：音量信息。</li><li> AudioLoudnessJitter：音量变化剧烈。</li><li> BackgroundMusic：存在背景音乐。</li><li> AudioEvaluation：低音质。</li><li> AudioNoise：噪声。</li><li> AudioSpeechQuality：语音清晰度低。</li><li> AudioReverb：混响程度高。</li><li> AudioHighLoudness：响度失真。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>异常片段列表。<br><font color="red">注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。</p>
    */
    @SerializedName("SegmentSet")
    @Expose
    private QualityInspectItem [] SegmentSet;

    /**
    * <p>异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。</p>
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * <p>异常片段列表文件 URL 失效时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get <p>异常类型，取值范围：</p><li>Jitter：抖动；</li><li>Blur：模糊；</li><li>LowLighting：低光照；</li><li>HighLighting：过曝；</li><li>CrashScreen：花屏；</li><li>BlackWhiteEdge：黑白边；</li><li>SolidColorScreen：纯色屏；</li><li>Noise：噪点；</li><li>Mosaic：马赛克；</li><li>QRCode：二维码；</li><li>AppletCode：小程序码；</li><li>BarCode：条形码；</li><li>LowVoice：低音；</li><li>HighVoice：爆音；</li><li>NoVoice：静音；</li><li>LowEvaluation：无参考打分低于阈值。</li><li> LowColorfulness：色彩丰富度信息。</li><li> AudioVideoAsync：音画不同步。</li><li> AudioSubtitleAsync：音频与字幕不同步。</li><li> VideoAesthetic：视频美学评分低。</li><li> AudioDiscontinuity：音频不连续。</li><li> AudioVolume：音量信息。</li><li> AudioLoudnessJitter：音量变化剧烈。</li><li> BackgroundMusic：存在背景音乐。</li><li> AudioEvaluation：低音质。</li><li> AudioNoise：噪声。</li><li> AudioSpeechQuality：语音清晰度低。</li><li> AudioReverb：混响程度高。</li><li> AudioHighLoudness：响度失真。</li> 
     * @return Type <p>异常类型，取值范围：</p><li>Jitter：抖动；</li><li>Blur：模糊；</li><li>LowLighting：低光照；</li><li>HighLighting：过曝；</li><li>CrashScreen：花屏；</li><li>BlackWhiteEdge：黑白边；</li><li>SolidColorScreen：纯色屏；</li><li>Noise：噪点；</li><li>Mosaic：马赛克；</li><li>QRCode：二维码；</li><li>AppletCode：小程序码；</li><li>BarCode：条形码；</li><li>LowVoice：低音；</li><li>HighVoice：爆音；</li><li>NoVoice：静音；</li><li>LowEvaluation：无参考打分低于阈值。</li><li> LowColorfulness：色彩丰富度信息。</li><li> AudioVideoAsync：音画不同步。</li><li> AudioSubtitleAsync：音频与字幕不同步。</li><li> VideoAesthetic：视频美学评分低。</li><li> AudioDiscontinuity：音频不连续。</li><li> AudioVolume：音量信息。</li><li> AudioLoudnessJitter：音量变化剧烈。</li><li> BackgroundMusic：存在背景音乐。</li><li> AudioEvaluation：低音质。</li><li> AudioNoise：噪声。</li><li> AudioSpeechQuality：语音清晰度低。</li><li> AudioReverb：混响程度高。</li><li> AudioHighLoudness：响度失真。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>异常类型，取值范围：</p><li>Jitter：抖动；</li><li>Blur：模糊；</li><li>LowLighting：低光照；</li><li>HighLighting：过曝；</li><li>CrashScreen：花屏；</li><li>BlackWhiteEdge：黑白边；</li><li>SolidColorScreen：纯色屏；</li><li>Noise：噪点；</li><li>Mosaic：马赛克；</li><li>QRCode：二维码；</li><li>AppletCode：小程序码；</li><li>BarCode：条形码；</li><li>LowVoice：低音；</li><li>HighVoice：爆音；</li><li>NoVoice：静音；</li><li>LowEvaluation：无参考打分低于阈值。</li><li> LowColorfulness：色彩丰富度信息。</li><li> AudioVideoAsync：音画不同步。</li><li> AudioSubtitleAsync：音频与字幕不同步。</li><li> VideoAesthetic：视频美学评分低。</li><li> AudioDiscontinuity：音频不连续。</li><li> AudioVolume：音量信息。</li><li> AudioLoudnessJitter：音量变化剧烈。</li><li> BackgroundMusic：存在背景音乐。</li><li> AudioEvaluation：低音质。</li><li> AudioNoise：噪声。</li><li> AudioSpeechQuality：语音清晰度低。</li><li> AudioReverb：混响程度高。</li><li> AudioHighLoudness：响度失真。</li>
     * @param Type <p>异常类型，取值范围：</p><li>Jitter：抖动；</li><li>Blur：模糊；</li><li>LowLighting：低光照；</li><li>HighLighting：过曝；</li><li>CrashScreen：花屏；</li><li>BlackWhiteEdge：黑白边；</li><li>SolidColorScreen：纯色屏；</li><li>Noise：噪点；</li><li>Mosaic：马赛克；</li><li>QRCode：二维码；</li><li>AppletCode：小程序码；</li><li>BarCode：条形码；</li><li>LowVoice：低音；</li><li>HighVoice：爆音；</li><li>NoVoice：静音；</li><li>LowEvaluation：无参考打分低于阈值。</li><li> LowColorfulness：色彩丰富度信息。</li><li> AudioVideoAsync：音画不同步。</li><li> AudioSubtitleAsync：音频与字幕不同步。</li><li> VideoAesthetic：视频美学评分低。</li><li> AudioDiscontinuity：音频不连续。</li><li> AudioVolume：音量信息。</li><li> AudioLoudnessJitter：音量变化剧烈。</li><li> BackgroundMusic：存在背景音乐。</li><li> AudioEvaluation：低音质。</li><li> AudioNoise：噪声。</li><li> AudioSpeechQuality：语音清晰度低。</li><li> AudioReverb：混响程度高。</li><li> AudioHighLoudness：响度失真。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>异常片段列表。<br><font color="red">注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。</p> 
     * @return SegmentSet <p>异常片段列表。<br><font color="red">注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。</p>
     */
    public QualityInspectItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set <p>异常片段列表。<br><font color="red">注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。</p>
     * @param SegmentSet <p>异常片段列表。<br><font color="red">注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。</p>
     */
    public void setSegmentSet(QualityInspectItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get <p>异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。</p> 
     * @return SegmentSetFileUrl <p>异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。</p>
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set <p>异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。</p>
     * @param SegmentSetFileUrl <p>异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。</p>
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get <p>异常片段列表文件 URL 失效时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return SegmentSetFileUrlExpireTime <p>异常片段列表文件 URL 失效时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set <p>异常片段列表文件 URL 失效时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param SegmentSetFileUrlExpireTime <p>异常片段列表文件 URL 失效时间，使用  <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public QualityInspectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectResultItem(QualityInspectResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new QualityInspectItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new QualityInspectItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

