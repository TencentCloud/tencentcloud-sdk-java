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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHumanActorJobRequest extends AbstractModel {

    /**
    * 文本提示词，不能超过5000字符。
提示词支持全局和局部控制：

- 全局控制：正常输入提示词即可
- 局部控制：可用双井号进行特定时间的提示词约束，例如： "画面中的人物正在对着镜头讲话，偶尔做些手势匹配说话的内容。镜头保持固定。#3#画面中的人物正在对着镜头讲话，同时做出单手做向左方引导的手势。镜头保持固定。"（意思是第三秒的时候让人物做出左方引导手势）
 -- 局部控制时间建议整数，最大可读小数点后两位。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav
- 音频大小：10M以内
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:4到4:1范围内
- 图片内容：避免上传无人脸、无宠物脸或脸部过小、不完整、不清晰、偏转角度过大、嘴部被遮挡的图片。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageUrl为准。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 生成视频分辨率
枚举值：720p，1080p
默认1080p
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 生成视频帧数，单位fps。
枚举值：25，50
默认50帧
    */
    @SerializedName("FrameRate")
    @Expose
    private Long FrameRate;

    /**
    * 为生成视频添加标识的开关，默认为1。 1：添加标识。 0：不添加标识。 其他数值：默认按1处理。 建议您使用显著标识来提示，该视频是 AI 生成的视频。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 标识内容设置。 默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get 文本提示词，不能超过5000字符。
提示词支持全局和局部控制：

- 全局控制：正常输入提示词即可
- 局部控制：可用双井号进行特定时间的提示词约束，例如： "画面中的人物正在对着镜头讲话，偶尔做些手势匹配说话的内容。镜头保持固定。#3#画面中的人物正在对着镜头讲话，同时做出单手做向左方引导的手势。镜头保持固定。"（意思是第三秒的时候让人物做出左方引导手势）
 -- 局部控制时间建议整数，最大可读小数点后两位。 
     * @return Prompt 文本提示词，不能超过5000字符。
提示词支持全局和局部控制：

- 全局控制：正常输入提示词即可
- 局部控制：可用双井号进行特定时间的提示词约束，例如： "画面中的人物正在对着镜头讲话，偶尔做些手势匹配说话的内容。镜头保持固定。#3#画面中的人物正在对着镜头讲话，同时做出单手做向左方引导的手势。镜头保持固定。"（意思是第三秒的时候让人物做出左方引导手势）
 -- 局部控制时间建议整数，最大可读小数点后两位。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 文本提示词，不能超过5000字符。
提示词支持全局和局部控制：

- 全局控制：正常输入提示词即可
- 局部控制：可用双井号进行特定时间的提示词约束，例如： "画面中的人物正在对着镜头讲话，偶尔做些手势匹配说话的内容。镜头保持固定。#3#画面中的人物正在对着镜头讲话，同时做出单手做向左方引导的手势。镜头保持固定。"（意思是第三秒的时候让人物做出左方引导手势）
 -- 局部控制时间建议整数，最大可读小数点后两位。
     * @param Prompt 文本提示词，不能超过5000字符。
提示词支持全局和局部控制：

- 全局控制：正常输入提示词即可
- 局部控制：可用双井号进行特定时间的提示词约束，例如： "画面中的人物正在对着镜头讲话，偶尔做些手势匹配说话的内容。镜头保持固定。#3#画面中的人物正在对着镜头讲话，同时做出单手做向左方引导的手势。镜头保持固定。"（意思是第三秒的时候让人物做出左方引导手势）
 -- 局部控制时间建议整数，最大可读小数点后两位。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav
- 音频大小：10M以内 
     * @return AudioUrl 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav
- 音频大小：10M以内
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav
- 音频大小：10M以内
     * @param AudioUrl 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav
- 音频大小：10M以内
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:4到4:1范围内
- 图片内容：避免上传无人脸、无宠物脸或脸部过小、不完整、不清晰、偏转角度过大、嘴部被遮挡的图片。 
     * @return ImageUrl 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:4到4:1范围内
- 图片内容：避免上传无人脸、无宠物脸或脸部过小、不完整、不清晰、偏转角度过大、嘴部被遮挡的图片。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:4到4:1范围内
- 图片内容：避免上传无人脸、无宠物脸或脸部过小、不完整、不清晰、偏转角度过大、嘴部被遮挡的图片。
     * @param ImageUrl 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:4到4:1范围内
- 图片内容：避免上传无人脸、无宠物脸或脸部过小、不完整、不清晰、偏转角度过大、嘴部被遮挡的图片。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageUrl为准。 
     * @return ImageBase64 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageUrl为准。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageUrl为准。
     * @param ImageBase64 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageUrl为准。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 生成视频分辨率
枚举值：720p，1080p
默认1080p 
     * @return Resolution 生成视频分辨率
枚举值：720p，1080p
默认1080p
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成视频分辨率
枚举值：720p，1080p
默认1080p
     * @param Resolution 生成视频分辨率
枚举值：720p，1080p
默认1080p
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 生成视频帧数，单位fps。
枚举值：25，50
默认50帧 
     * @return FrameRate 生成视频帧数，单位fps。
枚举值：25，50
默认50帧
     */
    public Long getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 生成视频帧数，单位fps。
枚举值：25，50
默认50帧
     * @param FrameRate 生成视频帧数，单位fps。
枚举值：25，50
默认50帧
     */
    public void setFrameRate(Long FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get 为生成视频添加标识的开关，默认为1。 1：添加标识。 0：不添加标识。 其他数值：默认按1处理。 建议您使用显著标识来提示，该视频是 AI 生成的视频。 
     * @return LogoAdd 为生成视频添加标识的开关，默认为1。 1：添加标识。 0：不添加标识。 其他数值：默认按1处理。 建议您使用显著标识来提示，该视频是 AI 生成的视频。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成视频添加标识的开关，默认为1。 1：添加标识。 0：不添加标识。 其他数值：默认按1处理。 建议您使用显著标识来提示，该视频是 AI 生成的视频。
     * @param LogoAdd 为生成视频添加标识的开关，默认为1。 1：添加标识。 0：不添加标识。 其他数值：默认按1处理。 建议您使用显著标识来提示，该视频是 AI 生成的视频。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 标识内容设置。 默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。 
     * @return LogoParam 标识内容设置。 默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 标识内容设置。 默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     * @param LogoParam 标识内容设置。 默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitHumanActorJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHumanActorJobRequest(SubmitHumanActorJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.FrameRate != null) {
            this.FrameRate = new Long(source.FrameRate);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "FrameRate", this.FrameRate);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

