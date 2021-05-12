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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaModerationConfig extends AbstractModel{

    /**
    * 是否使用OCR，默认为true
    */
    @SerializedName("UseOCR")
    @Expose
    private Boolean UseOCR;

    /**
    * 是否使用音频，默认为true。视频场景下，默认为 false
    */
    @SerializedName("UseAudio")
    @Expose
    private Boolean UseAudio;

    /**
    * 图片取帧频率, 单位（秒/帧），默认 5， 可选 1 ～ 300
    */
    @SerializedName("ImageFrequency")
    @Expose
    private Long ImageFrequency;

    /**
    * 音频片段长度。单位为：秒
    */
    @SerializedName("AudioFrequency")
    @Expose
    private Long AudioFrequency;

    /**
    * 临时文件存储位置
    */
    @SerializedName("SegmentOutput")
    @Expose
    private FileOutput SegmentOutput;

    /**
    * 回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 是否使用OCR，默认为true 
     * @return UseOCR 是否使用OCR，默认为true
     */
    public Boolean getUseOCR() {
        return this.UseOCR;
    }

    /**
     * Set 是否使用OCR，默认为true
     * @param UseOCR 是否使用OCR，默认为true
     */
    public void setUseOCR(Boolean UseOCR) {
        this.UseOCR = UseOCR;
    }

    /**
     * Get 是否使用音频，默认为true。视频场景下，默认为 false 
     * @return UseAudio 是否使用音频，默认为true。视频场景下，默认为 false
     */
    public Boolean getUseAudio() {
        return this.UseAudio;
    }

    /**
     * Set 是否使用音频，默认为true。视频场景下，默认为 false
     * @param UseAudio 是否使用音频，默认为true。视频场景下，默认为 false
     */
    public void setUseAudio(Boolean UseAudio) {
        this.UseAudio = UseAudio;
    }

    /**
     * Get 图片取帧频率, 单位（秒/帧），默认 5， 可选 1 ～ 300 
     * @return ImageFrequency 图片取帧频率, 单位（秒/帧），默认 5， 可选 1 ～ 300
     */
    public Long getImageFrequency() {
        return this.ImageFrequency;
    }

    /**
     * Set 图片取帧频率, 单位（秒/帧），默认 5， 可选 1 ～ 300
     * @param ImageFrequency 图片取帧频率, 单位（秒/帧），默认 5， 可选 1 ～ 300
     */
    public void setImageFrequency(Long ImageFrequency) {
        this.ImageFrequency = ImageFrequency;
    }

    /**
     * Get 音频片段长度。单位为：秒 
     * @return AudioFrequency 音频片段长度。单位为：秒
     */
    public Long getAudioFrequency() {
        return this.AudioFrequency;
    }

    /**
     * Set 音频片段长度。单位为：秒
     * @param AudioFrequency 音频片段长度。单位为：秒
     */
    public void setAudioFrequency(Long AudioFrequency) {
        this.AudioFrequency = AudioFrequency;
    }

    /**
     * Get 临时文件存储位置 
     * @return SegmentOutput 临时文件存储位置
     */
    public FileOutput getSegmentOutput() {
        return this.SegmentOutput;
    }

    /**
     * Set 临时文件存储位置
     * @param SegmentOutput 临时文件存储位置
     */
    public void setSegmentOutput(FileOutput SegmentOutput) {
        this.SegmentOutput = SegmentOutput;
    }

    /**
     * Get 回调地址 
     * @return CallbackUrl 回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址
     * @param CallbackUrl 回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public MediaModerationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaModerationConfig(MediaModerationConfig source) {
        if (source.UseOCR != null) {
            this.UseOCR = new Boolean(source.UseOCR);
        }
        if (source.UseAudio != null) {
            this.UseAudio = new Boolean(source.UseAudio);
        }
        if (source.ImageFrequency != null) {
            this.ImageFrequency = new Long(source.ImageFrequency);
        }
        if (source.AudioFrequency != null) {
            this.AudioFrequency = new Long(source.AudioFrequency);
        }
        if (source.SegmentOutput != null) {
            this.SegmentOutput = new FileOutput(source.SegmentOutput);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseOCR", this.UseOCR);
        this.setParamSimple(map, prefix + "UseAudio", this.UseAudio);
        this.setParamSimple(map, prefix + "ImageFrequency", this.ImageFrequency);
        this.setParamSimple(map, prefix + "AudioFrequency", this.AudioFrequency);
        this.setParamObj(map, prefix + "SegmentOutput.", this.SegmentOutput);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

