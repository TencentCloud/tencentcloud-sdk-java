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
时长要求：【5-600】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【360~4096】 之间。
大小要求：不超过500Mb

    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 输入视频中音频语种
目前支持语种范围：zh(中文), en(英文)
    */
    @SerializedName("SrcLang")
    @Expose
    private String SrcLang;

    /**
    * 当音频 URL 不为空时，不经过语音AI处理，直接以视频为素材用音频内容做视频口型驱动。
格式要求：支持 mp3、m4a、aac、wav 格式。
时长要求：【5~600】秒，音频时长要匹配视频时长。
大小要求：不超过 100Mb。
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 输出视频中翻译语种
目前支持语种范围：zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
    */
    @SerializedName("DstLang")
    @Expose
    private String DstLang;

    /**
    * 翻译语种匹配音色种别，其他说明如下：
1）默认不填代表克隆输入视频中音频音色；
2）翻译语种非中英（即zh、en），该项必填；

具体音色种别详见说明“支持音色种别列表”，每个音色都支持 15 个目标语种。

    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * 是否需要纠正视频中音频识别与翻译内容，取值范围：0-不需要，1-需要，默认0。

    */
    @SerializedName("Confirm")
    @Expose
    private Long Confirm;

    /**
    * 是否需要去除VideoUrl或AudioUrl中背景音，取值范围：0-不需要，1-需要，默认0 。
    */
    @SerializedName("RemoveVocal")
    @Expose
    private Long RemoveVocal;

    /**
    * 是否开启口型驱动，0-不开启，1-开启。默认0。
    */
    @SerializedName("LipSync")
    @Expose
    private Long LipSync;

    /**
    * 当 AudioUrl 字段有输入音频时，如果输入音频时长大于输入视频时长，会拼接视频（ 0-正向拼接、1-反向拼接 ）对齐音频时长。默认 0。
    */
    @SerializedName("VideoLoop")
    @Expose
    private Long VideoLoop;

    /**
     * Get 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【5-600】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【360~4096】 之间。
大小要求：不超过500Mb
 
     * @return VideoUrl 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【5-600】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【360~4096】 之间。
大小要求：不超过500Mb

     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【5-600】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【360~4096】 之间。
大小要求：不超过500Mb

     * @param VideoUrl 视频地址URL。
格式要求：支持 mp4、mov 。
时长要求：【5-600】秒。
fps 要求：【15-60】fps
分辨率要求：单边像素要求在 【360~4096】 之间。
大小要求：不超过500Mb

     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 输入视频中音频语种
目前支持语种范围：zh(中文), en(英文) 
     * @return SrcLang 输入视频中音频语种
目前支持语种范围：zh(中文), en(英文)
     */
    public String getSrcLang() {
        return this.SrcLang;
    }

    /**
     * Set 输入视频中音频语种
目前支持语种范围：zh(中文), en(英文)
     * @param SrcLang 输入视频中音频语种
目前支持语种范围：zh(中文), en(英文)
     */
    public void setSrcLang(String SrcLang) {
        this.SrcLang = SrcLang;
    }

    /**
     * Get 当音频 URL 不为空时，不经过语音AI处理，直接以视频为素材用音频内容做视频口型驱动。
格式要求：支持 mp3、m4a、aac、wav 格式。
时长要求：【5~600】秒，音频时长要匹配视频时长。
大小要求：不超过 100Mb。 
     * @return AudioUrl 当音频 URL 不为空时，不经过语音AI处理，直接以视频为素材用音频内容做视频口型驱动。
格式要求：支持 mp3、m4a、aac、wav 格式。
时长要求：【5~600】秒，音频时长要匹配视频时长。
大小要求：不超过 100Mb。
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 当音频 URL 不为空时，不经过语音AI处理，直接以视频为素材用音频内容做视频口型驱动。
格式要求：支持 mp3、m4a、aac、wav 格式。
时长要求：【5~600】秒，音频时长要匹配视频时长。
大小要求：不超过 100Mb。
     * @param AudioUrl 当音频 URL 不为空时，不经过语音AI处理，直接以视频为素材用音频内容做视频口型驱动。
格式要求：支持 mp3、m4a、aac、wav 格式。
时长要求：【5~600】秒，音频时长要匹配视频时长。
大小要求：不超过 100Mb。
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 输出视频中翻译语种
目前支持语种范围：zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语) 
     * @return DstLang 输出视频中翻译语种
目前支持语种范围：zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
     */
    public String getDstLang() {
        return this.DstLang;
    }

    /**
     * Set 输出视频中翻译语种
目前支持语种范围：zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
     * @param DstLang 输出视频中翻译语种
目前支持语种范围：zh(简体中文)、en(英语)、ar(阿拉伯语)、de(德语)、es(西班牙语)、fr(法语)、id(印尼语)、it(意大利语)、ja(日语)、ko(韩语)、ms(马来语)、pt(葡萄牙语)、ru(俄语)、th(泰语)、tr(土耳其语)、vi(越南语)
     */
    public void setDstLang(String DstLang) {
        this.DstLang = DstLang;
    }

    /**
     * Get 翻译语种匹配音色种别，其他说明如下：
1）默认不填代表克隆输入视频中音频音色；
2）翻译语种非中英（即zh、en），该项必填；

具体音色种别详见说明“支持音色种别列表”，每个音色都支持 15 个目标语种。
 
     * @return VoiceType 翻译语种匹配音色种别，其他说明如下：
1）默认不填代表克隆输入视频中音频音色；
2）翻译语种非中英（即zh、en），该项必填；

具体音色种别详见说明“支持音色种别列表”，每个音色都支持 15 个目标语种。

     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 翻译语种匹配音色种别，其他说明如下：
1）默认不填代表克隆输入视频中音频音色；
2）翻译语种非中英（即zh、en），该项必填；

具体音色种别详见说明“支持音色种别列表”，每个音色都支持 15 个目标语种。

     * @param VoiceType 翻译语种匹配音色种别，其他说明如下：
1）默认不填代表克隆输入视频中音频音色；
2）翻译语种非中英（即zh、en），该项必填；

具体音色种别详见说明“支持音色种别列表”，每个音色都支持 15 个目标语种。

     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 是否需要纠正视频中音频识别与翻译内容，取值范围：0-不需要，1-需要，默认0。
 
     * @return Confirm 是否需要纠正视频中音频识别与翻译内容，取值范围：0-不需要，1-需要，默认0。

     */
    public Long getConfirm() {
        return this.Confirm;
    }

    /**
     * Set 是否需要纠正视频中音频识别与翻译内容，取值范围：0-不需要，1-需要，默认0。

     * @param Confirm 是否需要纠正视频中音频识别与翻译内容，取值范围：0-不需要，1-需要，默认0。

     */
    public void setConfirm(Long Confirm) {
        this.Confirm = Confirm;
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
     * Get 是否开启口型驱动，0-不开启，1-开启。默认0。 
     * @return LipSync 是否开启口型驱动，0-不开启，1-开启。默认0。
     */
    public Long getLipSync() {
        return this.LipSync;
    }

    /**
     * Set 是否开启口型驱动，0-不开启，1-开启。默认0。
     * @param LipSync 是否开启口型驱动，0-不开启，1-开启。默认0。
     */
    public void setLipSync(Long LipSync) {
        this.LipSync = LipSync;
    }

    /**
     * Get 当 AudioUrl 字段有输入音频时，如果输入音频时长大于输入视频时长，会拼接视频（ 0-正向拼接、1-反向拼接 ）对齐音频时长。默认 0。 
     * @return VideoLoop 当 AudioUrl 字段有输入音频时，如果输入音频时长大于输入视频时长，会拼接视频（ 0-正向拼接、1-反向拼接 ）对齐音频时长。默认 0。
     */
    public Long getVideoLoop() {
        return this.VideoLoop;
    }

    /**
     * Set 当 AudioUrl 字段有输入音频时，如果输入音频时长大于输入视频时长，会拼接视频（ 0-正向拼接、1-反向拼接 ）对齐音频时长。默认 0。
     * @param VideoLoop 当 AudioUrl 字段有输入音频时，如果输入音频时长大于输入视频时长，会拼接视频（ 0-正向拼接、1-反向拼接 ）对齐音频时长。默认 0。
     */
    public void setVideoLoop(Long VideoLoop) {
        this.VideoLoop = VideoLoop;
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
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.DstLang != null) {
            this.DstLang = new String(source.DstLang);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.Confirm != null) {
            this.Confirm = new Long(source.Confirm);
        }
        if (source.RemoveVocal != null) {
            this.RemoveVocal = new Long(source.RemoveVocal);
        }
        if (source.LipSync != null) {
            this.LipSync = new Long(source.LipSync);
        }
        if (source.VideoLoop != null) {
            this.VideoLoop = new Long(source.VideoLoop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "SrcLang", this.SrcLang);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "DstLang", this.DstLang);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "Confirm", this.Confirm);
        this.setParamSimple(map, prefix + "RemoveVocal", this.RemoveVocal);
        this.setParamSimple(map, prefix + "LipSync", this.LipSync);
        this.setParamSimple(map, prefix + "VideoLoop", this.VideoLoop);

    }
}

