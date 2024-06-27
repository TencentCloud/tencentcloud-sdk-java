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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitVideoTranslateJobRequest extends AbstractModel {

    /**
    * 视频地址URL。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 源语言：zh, en
    */
    @SerializedName("SrcLang")
    @Expose
    private String SrcLang;

    /**
    * 目标语言：zh, en	
    */
    @SerializedName("DstLang")
    @Expose
    private String DstLang;

    /**
    * 当音频 URL 不为空时，默认以音频驱动视频任务口型
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 是否需要确认翻译结果0：不需要，1：需要
    */
    @SerializedName("Confirm")
    @Expose
    private Long Confirm;

    /**
    * 是否开启口型驱动，0：不开启，1：开启。默认开启。
    */
    @SerializedName("LipSync")
    @Expose
    private Long LipSync;

    /**
     * Get 视频地址URL。 
     * @return VideoUrl 视频地址URL。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 视频地址URL。
     * @param VideoUrl 视频地址URL。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 源语言：zh, en 
     * @return SrcLang 源语言：zh, en
     */
    public String getSrcLang() {
        return this.SrcLang;
    }

    /**
     * Set 源语言：zh, en
     * @param SrcLang 源语言：zh, en
     */
    public void setSrcLang(String SrcLang) {
        this.SrcLang = SrcLang;
    }

    /**
     * Get 目标语言：zh, en	 
     * @return DstLang 目标语言：zh, en	
     */
    public String getDstLang() {
        return this.DstLang;
    }

    /**
     * Set 目标语言：zh, en	
     * @param DstLang 目标语言：zh, en	
     */
    public void setDstLang(String DstLang) {
        this.DstLang = DstLang;
    }

    /**
     * Get 当音频 URL 不为空时，默认以音频驱动视频任务口型 
     * @return AudioUrl 当音频 URL 不为空时，默认以音频驱动视频任务口型
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 当音频 URL 不为空时，默认以音频驱动视频任务口型
     * @param AudioUrl 当音频 URL 不为空时，默认以音频驱动视频任务口型
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 是否需要确认翻译结果0：不需要，1：需要 
     * @return Confirm 是否需要确认翻译结果0：不需要，1：需要
     */
    public Long getConfirm() {
        return this.Confirm;
    }

    /**
     * Set 是否需要确认翻译结果0：不需要，1：需要
     * @param Confirm 是否需要确认翻译结果0：不需要，1：需要
     */
    public void setConfirm(Long Confirm) {
        this.Confirm = Confirm;
    }

    /**
     * Get 是否开启口型驱动，0：不开启，1：开启。默认开启。 
     * @return LipSync 是否开启口型驱动，0：不开启，1：开启。默认开启。
     */
    public Long getLipSync() {
        return this.LipSync;
    }

    /**
     * Set 是否开启口型驱动，0：不开启，1：开启。默认开启。
     * @param LipSync 是否开启口型驱动，0：不开启，1：开启。默认开启。
     */
    public void setLipSync(Long LipSync) {
        this.LipSync = LipSync;
    }

    public SubmitVideoTranslateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitVideoTranslateJobRequest(SubmitVideoTranslateJobRequest source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.SrcLang != null) {
            this.SrcLang = new String(source.SrcLang);
        }
        if (source.DstLang != null) {
            this.DstLang = new String(source.DstLang);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.Confirm != null) {
            this.Confirm = new Long(source.Confirm);
        }
        if (source.LipSync != null) {
            this.LipSync = new Long(source.LipSync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "SrcLang", this.SrcLang);
        this.setParamSimple(map, prefix + "DstLang", this.DstLang);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "Confirm", this.Confirm);
        this.setParamSimple(map, prefix + "LipSync", this.LipSync);

    }
}

