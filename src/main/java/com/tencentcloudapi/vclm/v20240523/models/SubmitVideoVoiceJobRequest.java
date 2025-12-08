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

public class SubmitVideoVoiceJobRequest extends AbstractModel {

    /**
    * 输入视频的Url  上传视频时长限制：1-15s 视频格式：MP4，MOV 视频大小：不超过1 GB URL地址中不能包含中文字符。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 描述音效内容的正向提示词。输入上限50个字符。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 音效内容的原始负向提示词。输入上限50个字符。
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

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
     * Get 输入视频的Url  上传视频时长限制：1-15s 视频格式：MP4，MOV 视频大小：不超过1 GB URL地址中不能包含中文字符。 
     * @return VideoUrl 输入视频的Url  上传视频时长限制：1-15s 视频格式：MP4，MOV 视频大小：不超过1 GB URL地址中不能包含中文字符。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 输入视频的Url  上传视频时长限制：1-15s 视频格式：MP4，MOV 视频大小：不超过1 GB URL地址中不能包含中文字符。
     * @param VideoUrl 输入视频的Url  上传视频时长限制：1-15s 视频格式：MP4，MOV 视频大小：不超过1 GB URL地址中不能包含中文字符。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 描述音效内容的正向提示词。输入上限50个字符。 
     * @return Prompt 描述音效内容的正向提示词。输入上限50个字符。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 描述音效内容的正向提示词。输入上限50个字符。
     * @param Prompt 描述音效内容的正向提示词。输入上限50个字符。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 音效内容的原始负向提示词。输入上限50个字符。 
     * @return NegativePrompt 音效内容的原始负向提示词。输入上限50个字符。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 音效内容的原始负向提示词。输入上限50个字符。
     * @param NegativePrompt 音效内容的原始负向提示词。输入上限50个字符。
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
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

    public SubmitVideoVoiceJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitVideoVoiceJobRequest(SubmitVideoVoiceJobRequest source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
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
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

