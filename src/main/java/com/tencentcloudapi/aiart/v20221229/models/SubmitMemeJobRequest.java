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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitMemeJobRequest extends AbstractModel {

    /**
    * 表情模板。
请在 [表情动图模板列表](https://cloud.tencent.com/document/product/1668/115327)  中选择期望的模板，传入 Pose 名称。
    */
    @SerializedName("Pose")
    @Expose
    private String Pose;

    /**
    * 人像参考图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("InputImage")
    @Expose
    private String InputImage;

    /**
    * 人像参考图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * 生成分辨率。
真人类型支持256、512，默认为256，
卡通类型仅支持512。
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * 自定义文案。
仅对真人类型的 Pose 生效，将在生成的表情动图中显示指定的文字。如果传入的字符串长度大于10，只截取前10个显示。
如果不传，默认使用自带的文案。
如果 text = "" 空字符串，代表不在表情动图中添加文案。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 头发遮罩开关。
true：裁剪过长的头发。
false：不裁剪过长的头发。
仅对卡通类型的 Pose 生效，默认为 false。
    */
    @SerializedName("Haircut")
    @Expose
    private Boolean Haircut;

    /**
    * 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get 表情模板。
请在 [表情动图模板列表](https://cloud.tencent.com/document/product/1668/115327)  中选择期望的模板，传入 Pose 名称。 
     * @return Pose 表情模板。
请在 [表情动图模板列表](https://cloud.tencent.com/document/product/1668/115327)  中选择期望的模板，传入 Pose 名称。
     */
    public String getPose() {
        return this.Pose;
    }

    /**
     * Set 表情模板。
请在 [表情动图模板列表](https://cloud.tencent.com/document/product/1668/115327)  中选择期望的模板，传入 Pose 名称。
     * @param Pose 表情模板。
请在 [表情动图模板列表](https://cloud.tencent.com/document/product/1668/115327)  中选择期望的模板，传入 Pose 名称。
     */
    public void setPose(String Pose) {
        this.Pose = Pose;
    }

    /**
     * Get 人像参考图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return InputImage 人像参考图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public String getInputImage() {
        return this.InputImage;
    }

    /**
     * Set 人像参考图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param InputImage 人像参考图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setInputImage(String InputImage) {
        this.InputImage = InputImage;
    }

    /**
     * Get 人像参考图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return InputUrl 人像参考图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set 人像参考图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param InputUrl 人像参考图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get 生成分辨率。
真人类型支持256、512，默认为256，
卡通类型仅支持512。 
     * @return Resolution 生成分辨率。
真人类型支持256、512，默认为256，
卡通类型仅支持512。
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成分辨率。
真人类型支持256、512，默认为256，
卡通类型仅支持512。
     * @param Resolution 生成分辨率。
真人类型支持256、512，默认为256，
卡通类型仅支持512。
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 自定义文案。
仅对真人类型的 Pose 生效，将在生成的表情动图中显示指定的文字。如果传入的字符串长度大于10，只截取前10个显示。
如果不传，默认使用自带的文案。
如果 text = "" 空字符串，代表不在表情动图中添加文案。 
     * @return Text 自定义文案。
仅对真人类型的 Pose 生效，将在生成的表情动图中显示指定的文字。如果传入的字符串长度大于10，只截取前10个显示。
如果不传，默认使用自带的文案。
如果 text = "" 空字符串，代表不在表情动图中添加文案。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 自定义文案。
仅对真人类型的 Pose 生效，将在生成的表情动图中显示指定的文字。如果传入的字符串长度大于10，只截取前10个显示。
如果不传，默认使用自带的文案。
如果 text = "" 空字符串，代表不在表情动图中添加文案。
     * @param Text 自定义文案。
仅对真人类型的 Pose 生效，将在生成的表情动图中显示指定的文字。如果传入的字符串长度大于10，只截取前10个显示。
如果不传，默认使用自带的文案。
如果 text = "" 空字符串，代表不在表情动图中添加文案。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 头发遮罩开关。
true：裁剪过长的头发。
false：不裁剪过长的头发。
仅对卡通类型的 Pose 生效，默认为 false。 
     * @return Haircut 头发遮罩开关。
true：裁剪过长的头发。
false：不裁剪过长的头发。
仅对卡通类型的 Pose 生效，默认为 false。
     */
    public Boolean getHaircut() {
        return this.Haircut;
    }

    /**
     * Set 头发遮罩开关。
true：裁剪过长的头发。
false：不裁剪过长的头发。
仅对卡通类型的 Pose 生效，默认为 false。
     * @param Haircut 头发遮罩开关。
true：裁剪过长的头发。
false：不裁剪过长的头发。
仅对卡通类型的 Pose 生效，默认为 false。
     */
    public void setHaircut(Boolean Haircut) {
        this.Haircut = Haircut;
    }

    /**
     * Get 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。 
     * @return LogoAdd 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
     * @param LogoAdd 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。 
     * @return LogoParam 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     * @param LogoParam 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitMemeJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitMemeJobRequest(SubmitMemeJobRequest source) {
        if (source.Pose != null) {
            this.Pose = new String(source.Pose);
        }
        if (source.InputImage != null) {
            this.InputImage = new String(source.InputImage);
        }
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Haircut != null) {
            this.Haircut = new Boolean(source.Haircut);
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
        this.setParamSimple(map, prefix + "Pose", this.Pose);
        this.setParamSimple(map, prefix + "InputImage", this.InputImage);
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Haircut", this.Haircut);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

