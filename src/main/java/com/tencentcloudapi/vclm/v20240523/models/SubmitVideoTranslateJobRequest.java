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
格式要求：支持 mp4、mov 。
时长要求：【10-300】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【540~1920】 之间。

    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 源语言：zh(中文), en(英文)
    */
    @SerializedName("SrcLang")
    @Expose
    private String SrcLang;

    /**
    * 目标语种：
zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
    */
    @SerializedName("DstLang")
    @Expose
    private String DstLang;

    /**
    * 当音频 URL 不为空时，默认以音频驱动视频任务口型。
格式要求：支持 mp3、m4a、acc、wav 格式。
时长要求：【10~300】秒
大小要求：不超过 100M。
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 是否需要去除VideoUrl或AudioUrl中背景音，取值范围：0-不需要，1-需要，默认0 。
    */
    @SerializedName("RemoveVocal")
    @Expose
    private Long RemoveVocal;

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
    * 音色种别：一种音色种别对应一种不同区域的音色
1）目标语种为小语种(非zh,en)时，该项为必填
2）目标语种为zh,en时，该项为非必填，若填入，则对应填入的音色

具体音色包含请见“支持音色种别列表”
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
     * Get 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【10-300】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【540~1920】 之间。
 
     * @return VideoUrl 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【10-300】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【540~1920】 之间。

     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【10-300】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【540~1920】 之间。

     * @param VideoUrl 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【10-300】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【540~1920】 之间。

     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 源语言：zh(中文), en(英文) 
     * @return SrcLang 源语言：zh(中文), en(英文)
     */
    public String getSrcLang() {
        return this.SrcLang;
    }

    /**
     * Set 源语言：zh(中文), en(英文)
     * @param SrcLang 源语言：zh(中文), en(英文)
     */
    public void setSrcLang(String SrcLang) {
        this.SrcLang = SrcLang;
    }

    /**
     * Get 目标语种：
zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语) 
     * @return DstLang 目标语种：
zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
     */
    public String getDstLang() {
        return this.DstLang;
    }

    /**
     * Set 目标语种：
zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
     * @param DstLang 目标语种：
zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
     */
    public void setDstLang(String DstLang) {
        this.DstLang = DstLang;
    }

    /**
     * Get 当音频 URL 不为空时，默认以音频驱动视频任务口型。
格式要求：支持 mp3、m4a、acc、wav 格式。
时长要求：【10~300】秒
大小要求：不超过 100M。 
     * @return AudioUrl 当音频 URL 不为空时，默认以音频驱动视频任务口型。
格式要求：支持 mp3、m4a、acc、wav 格式。
时长要求：【10~300】秒
大小要求：不超过 100M。
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 当音频 URL 不为空时，默认以音频驱动视频任务口型。
格式要求：支持 mp3、m4a、acc、wav 格式。
时长要求：【10~300】秒
大小要求：不超过 100M。
     * @param AudioUrl 当音频 URL 不为空时，默认以音频驱动视频任务口型。
格式要求：支持 mp3、m4a、acc、wav 格式。
时长要求：【10~300】秒
大小要求：不超过 100M。
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 是否需要去除VideoUrl或AudioUrl中背景音，取值范围：0-不需要，1-需要，默认0 。 
     * @return RemoveVocal 是否需要去除VideoUrl或AudioUrl中背景音，取值范围：0-不需要，1-需要，默认0 。
     */
    public Long getRemoveVocal() {
        return this.RemoveVocal;
    }

    /**
     * Set 是否需要去除VideoUrl或AudioUrl中背景音，取值范围：0-不需要，1-需要，默认0 。
     * @param RemoveVocal 是否需要去除VideoUrl或AudioUrl中背景音，取值范围：0-不需要，1-需要，默认0 。
     */
    public void setRemoveVocal(Long RemoveVocal) {
        this.RemoveVocal = RemoveVocal;
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

    /**
     * Get 音色种别：一种音色种别对应一种不同区域的音色
1）目标语种为小语种(非zh,en)时，该项为必填
2）目标语种为zh,en时，该项为非必填，若填入，则对应填入的音色

具体音色包含请见“支持音色种别列表” 
     * @return VoiceType 音色种别：一种音色种别对应一种不同区域的音色
1）目标语种为小语种(非zh,en)时，该项为必填
2）目标语种为zh,en时，该项为非必填，若填入，则对应填入的音色

具体音色包含请见“支持音色种别列表”
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色种别：一种音色种别对应一种不同区域的音色
1）目标语种为小语种(非zh,en)时，该项为必填
2）目标语种为zh,en时，该项为非必填，若填入，则对应填入的音色

具体音色包含请见“支持音色种别列表”
     * @param VoiceType 音色种别：一种音色种别对应一种不同区域的音色
1）目标语种为小语种(非zh,en)时，该项为必填
2）目标语种为zh,en时，该项为非必填，若填入，则对应填入的音色

具体音色包含请见“支持音色种别列表”
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
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
        if (source.RemoveVocal != null) {
            this.RemoveVocal = new Long(source.RemoveVocal);
        }
        if (source.Confirm != null) {
            this.Confirm = new Long(source.Confirm);
        }
        if (source.LipSync != null) {
            this.LipSync = new Long(source.LipSync);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
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
        this.setParamSimple(map, prefix + "RemoveVocal", this.RemoveVocal);
        this.setParamSimple(map, prefix + "Confirm", this.Confirm);
        this.setParamSimple(map, prefix + "LipSync", this.LipSync);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);

    }
}

