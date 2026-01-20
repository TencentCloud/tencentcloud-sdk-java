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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTemplateToImageJobRequest extends AbstractModel {

    /**
    * <p>算法将根据输入的图片，结合文本描述智能生成与之相关的图像。Base64 和 Url 必须提供一个，如果都提供以 Url 为准。图片限制：单边分辨率小于5000且大于50，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。</p>
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * <p>绘画风格当前仅支持美术馆风格（gallerying）。</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>特效模式，默认使用人像模式。</p>枚举值：<ul><li> Person： 人像模式，仅支持上传人像图片。</li><li> Pet： 宠物模式，支持宠物等非人像图片。</li></ul>默认值：Person
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>为生成结果图添加显式水印标识的开关，默认为1。<br />1：添加。<br />0：不添加。<br />其他数值：默认按1处理。<br />建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>标识内容设置。默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get <p>算法将根据输入的图片，结合文本描述智能生成与之相关的图像。Base64 和 Url 必须提供一个，如果都提供以 Url 为准。图片限制：单边分辨率小于5000且大于50，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。</p> 
     * @return Image <p>算法将根据输入的图片，结合文本描述智能生成与之相关的图像。Base64 和 Url 必须提供一个，如果都提供以 Url 为准。图片限制：单边分辨率小于5000且大于50，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。</p>
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set <p>算法将根据输入的图片，结合文本描述智能生成与之相关的图像。Base64 和 Url 必须提供一个，如果都提供以 Url 为准。图片限制：单边分辨率小于5000且大于50，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。</p>
     * @param Image <p>算法将根据输入的图片，结合文本描述智能生成与之相关的图像。Base64 和 Url 必须提供一个，如果都提供以 Url 为准。图片限制：单边分辨率小于5000且大于50，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。</p>
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get <p>绘画风格当前仅支持美术馆风格（gallerying）。</p> 
     * @return Style <p>绘画风格当前仅支持美术馆风格（gallerying）。</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>绘画风格当前仅支持美术馆风格（gallerying）。</p>
     * @param Style <p>绘画风格当前仅支持美术馆风格（gallerying）。</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>特效模式，默认使用人像模式。</p>枚举值：<ul><li> Person： 人像模式，仅支持上传人像图片。</li><li> Pet： 宠物模式，支持宠物等非人像图片。</li></ul>默认值：Person 
     * @return Mode <p>特效模式，默认使用人像模式。</p>枚举值：<ul><li> Person： 人像模式，仅支持上传人像图片。</li><li> Pet： 宠物模式，支持宠物等非人像图片。</li></ul>默认值：Person
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>特效模式，默认使用人像模式。</p>枚举值：<ul><li> Person： 人像模式，仅支持上传人像图片。</li><li> Pet： 宠物模式，支持宠物等非人像图片。</li></ul>默认值：Person
     * @param Mode <p>特效模式，默认使用人像模式。</p>枚举值：<ul><li> Person： 人像模式，仅支持上传人像图片。</li><li> Pet： 宠物模式，支持宠物等非人像图片。</li></ul>默认值：Person
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>为生成结果图添加显式水印标识的开关，默认为1。<br />1：添加。<br />0：不添加。<br />其他数值：默认按1处理。<br />建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。</p> 
     * @return LogoAdd <p>为生成结果图添加显式水印标识的开关，默认为1。<br />1：添加。<br />0：不添加。<br />其他数值：默认按1处理。<br />建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>为生成结果图添加显式水印标识的开关，默认为1。<br />1：添加。<br />0：不添加。<br />其他数值：默认按1处理。<br />建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。</p>
     * @param LogoAdd <p>为生成结果图添加显式水印标识的开关，默认为1。<br />1：添加。<br />0：不添加。<br />其他数值：默认按1处理。<br />建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>标识内容设置。默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p> 
     * @return LogoParam <p>标识内容设置。默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set <p>标识内容设置。默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     * @param LogoParam <p>标识内容设置。默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitTemplateToImageJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTemplateToImageJobRequest(SubmitTemplateToImageJobRequest source) {
        if (source.Image != null) {
            this.Image = new Image(source.Image);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
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
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

