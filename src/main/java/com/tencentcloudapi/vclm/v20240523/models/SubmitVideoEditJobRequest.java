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

public class SubmitVideoEditJobRequest extends AbstractModel {

    /**
    * 输入视频

- 视频格式：MP4
- 视频时长：5s以内
- 视频分辨率：无限制（待验证是否可以无损输出）
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
支持风格迁移、替换、元素增加、删除控制
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 图片base64或者图片url

- Base64 和 Url 必须提供一个，如果都提供以Url为准。
- 上传图url大小不超过 8M
- 支持jpg，png，jpeg，webp，bmp，tiff 格式
- 单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

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
     * Get 输入视频

- 视频格式：MP4
- 视频时长：5s以内
- 视频分辨率：无限制（待验证是否可以无损输出） 
     * @return VideoUrl 输入视频

- 视频格式：MP4
- 视频时长：5s以内
- 视频分辨率：无限制（待验证是否可以无损输出）
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 输入视频

- 视频格式：MP4
- 视频时长：5s以内
- 视频分辨率：无限制（待验证是否可以无损输出）
     * @param VideoUrl 输入视频

- 视频格式：MP4
- 视频时长：5s以内
- 视频分辨率：无限制（待验证是否可以无损输出）
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
支持风格迁移、替换、元素增加、删除控制 
     * @return Prompt 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
支持风格迁移、替换、元素增加、删除控制
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
支持风格迁移、替换、元素增加、删除控制
     * @param Prompt 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
支持风格迁移、替换、元素增加、删除控制
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 图片base64或者图片url

- Base64 和 Url 必须提供一个，如果都提供以Url为准。
- 上传图url大小不超过 8M
- 支持jpg，png，jpeg，webp，bmp，tiff 格式
- 单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1 
     * @return Image 图片base64或者图片url

- Base64 和 Url 必须提供一个，如果都提供以Url为准。
- 上传图url大小不超过 8M
- 支持jpg，png，jpeg，webp，bmp，tiff 格式
- 单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set 图片base64或者图片url

- Base64 和 Url 必须提供一个，如果都提供以Url为准。
- 上传图url大小不超过 8M
- 支持jpg，png，jpeg，webp，bmp，tiff 格式
- 单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
     * @param Image 图片base64或者图片url

- Base64 和 Url 必须提供一个，如果都提供以Url为准。
- 上传图url大小不超过 8M
- 支持jpg，png，jpeg，webp，bmp，tiff 格式
- 单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
     */
    public void setImage(Image Image) {
        this.Image = Image;
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

    public SubmitVideoEditJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitVideoEditJobRequest(SubmitVideoEditJobRequest source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Image != null) {
            this.Image = new Image(source.Image);
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
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

