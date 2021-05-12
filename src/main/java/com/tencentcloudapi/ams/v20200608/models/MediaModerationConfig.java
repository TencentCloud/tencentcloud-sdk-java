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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaModerationConfig extends AbstractModel{

    /**
    * 音频截帧频率。默认一分钟
    */
    @SerializedName("AudioFrequency")
    @Expose
    private Long AudioFrequency;

    /**
    * 图片取帧频率, 单位（秒/帧），默认 5， 可选 1 ～ 300
    */
    @SerializedName("ImageFrequency")
    @Expose
    private Long ImageFrequency;

    /**
    * 异步回调地址。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 临时文件存储位置
    */
    @SerializedName("SegmentOutput")
    @Expose
    private FileOutput SegmentOutput;

    /**
    * 是否使用OCR，默认为true
    */
    @SerializedName("UseOCR")
    @Expose
    private Boolean UseOCR;

    /**
    * 是否使用音频。（音频场景下，该值永远为true）
    */
    @SerializedName("UseAudio")
    @Expose
    private Boolean UseAudio;

    /**
     * Get 音频截帧频率。默认一分钟 
     * @return AudioFrequency 音频截帧频率。默认一分钟
     */
    public Long getAudioFrequency() {
        return this.AudioFrequency;
    }

    /**
     * Set 音频截帧频率。默认一分钟
     * @param AudioFrequency 音频截帧频率。默认一分钟
     */
    public void setAudioFrequency(Long AudioFrequency) {
        this.AudioFrequency = AudioFrequency;
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
     * Get 异步回调地址。 
     * @return CallbackUrl 异步回调地址。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 异步回调地址。
     * @param CallbackUrl 异步回调地址。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
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
     * Get 是否使用音频。（音频场景下，该值永远为true） 
     * @return UseAudio 是否使用音频。（音频场景下，该值永远为true）
     */
    public Boolean getUseAudio() {
        return this.UseAudio;
    }

    /**
     * Set 是否使用音频。（音频场景下，该值永远为true）
     * @param UseAudio 是否使用音频。（音频场景下，该值永远为true）
     */
    public void setUseAudio(Boolean UseAudio) {
        this.UseAudio = UseAudio;
    }

    public MediaModerationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaModerationConfig(MediaModerationConfig source) {
        if (source.AudioFrequency != null) {
            this.AudioFrequency = new Long(source.AudioFrequency);
        }
        if (source.ImageFrequency != null) {
            this.ImageFrequency = new Long(source.ImageFrequency);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SegmentOutput != null) {
            this.SegmentOutput = new FileOutput(source.SegmentOutput);
        }
        if (source.UseOCR != null) {
            this.UseOCR = new Boolean(source.UseOCR);
        }
        if (source.UseAudio != null) {
            this.UseAudio = new Boolean(source.UseAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioFrequency", this.AudioFrequency);
        this.setParamSimple(map, prefix + "ImageFrequency", this.ImageFrequency);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamObj(map, prefix + "SegmentOutput.", this.SegmentOutput);
        this.setParamSimple(map, prefix + "UseOCR", this.UseOCR);
        this.setParamSimple(map, prefix + "UseAudio", this.UseAudio);

    }
}

