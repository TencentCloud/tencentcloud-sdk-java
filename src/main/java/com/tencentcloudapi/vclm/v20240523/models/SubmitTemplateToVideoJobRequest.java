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

public class SubmitTemplateToVideoJobRequest extends AbstractModel {

    /**
    * 特效模板名称。请在 [视频特效模板列表](https://cloud.tencent.com/document/product/1616/119194)  中选择想要生成的特效对应的 template 名称。
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * 参考图像，不同特效输入图片的数量详见： [视频特效模板-图片要求说明](https://cloud.tencent.com/document/product/1616/119194)
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300*300px，不大于4096*4096，图片宽高比应在1:4 ~ 4:1之间
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * 为生成视频添加标识的开关，默认为1。传0 需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成后方可生效。
1：添加标识；
0：不添加标识；
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 标识内容设置。
默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成。

    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * 视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：[视频特效模板-单次调用消耗积分数列](https://cloud.tencent.com/document/product/1616/119194 )
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。
    */
    @SerializedName("BGM")
    @Expose
    private Boolean BGM;

    /**
    * 扩展字段。
    */
    @SerializedName("ExtraParam")
    @Expose
    private ExtraParam ExtraParam;

    /**
     * Get 特效模板名称。请在 [视频特效模板列表](https://cloud.tencent.com/document/product/1616/119194)  中选择想要生成的特效对应的 template 名称。 
     * @return Template 特效模板名称。请在 [视频特效模板列表](https://cloud.tencent.com/document/product/1616/119194)  中选择想要生成的特效对应的 template 名称。
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 特效模板名称。请在 [视频特效模板列表](https://cloud.tencent.com/document/product/1616/119194)  中选择想要生成的特效对应的 template 名称。
     * @param Template 特效模板名称。请在 [视频特效模板列表](https://cloud.tencent.com/document/product/1616/119194)  中选择想要生成的特效对应的 template 名称。
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get 参考图像，不同特效输入图片的数量详见： [视频特效模板-图片要求说明](https://cloud.tencent.com/document/product/1616/119194)
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300*300px，不大于4096*4096，图片宽高比应在1:4 ~ 4:1之间 
     * @return Images 参考图像，不同特效输入图片的数量详见： [视频特效模板-图片要求说明](https://cloud.tencent.com/document/product/1616/119194)
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300*300px，不大于4096*4096，图片宽高比应在1:4 ~ 4:1之间
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set 参考图像，不同特效输入图片的数量详见： [视频特效模板-图片要求说明](https://cloud.tencent.com/document/product/1616/119194)
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300*300px，不大于4096*4096，图片宽高比应在1:4 ~ 4:1之间
     * @param Images 参考图像，不同特效输入图片的数量详见： [视频特效模板-图片要求说明](https://cloud.tencent.com/document/product/1616/119194)
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300*300px，不大于4096*4096，图片宽高比应在1:4 ~ 4:1之间
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get 为生成视频添加标识的开关，默认为1。传0 需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成后方可生效。
1：添加标识；
0：不添加标识；
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。 
     * @return LogoAdd 为生成视频添加标识的开关，默认为1。传0 需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成后方可生效。
1：添加标识；
0：不添加标识；
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成视频添加标识的开关，默认为1。传0 需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成后方可生效。
1：添加标识；
0：不添加标识；
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
     * @param LogoAdd 为生成视频添加标识的开关，默认为1。传0 需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成后方可生效。
1：添加标识；
0：不添加标识；
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 标识内容设置。
默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成。
 
     * @return LogoParam 标识内容设置。
默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成。

     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 标识内容设置。
默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成。

     * @param LogoParam 标识内容设置。
默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  [控制台](https://console.cloud.tencent.com/vtc/setting) 申请开启显式标识自主完成。

     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get 视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：[视频特效模板-单次调用消耗积分数列](https://cloud.tencent.com/document/product/1616/119194 ) 
     * @return Resolution 视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：[视频特效模板-单次调用消耗积分数列](https://cloud.tencent.com/document/product/1616/119194 )
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：[视频特效模板-单次调用消耗积分数列](https://cloud.tencent.com/document/product/1616/119194 )
     * @param Resolution 视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：[视频特效模板-单次调用消耗积分数列](https://cloud.tencent.com/document/product/1616/119194 )
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。 
     * @return BGM 是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。
     */
    public Boolean getBGM() {
        return this.BGM;
    }

    /**
     * Set 是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。
     * @param BGM 是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。
     */
    public void setBGM(Boolean BGM) {
        this.BGM = BGM;
    }

    /**
     * Get 扩展字段。 
     * @return ExtraParam 扩展字段。
     */
    public ExtraParam getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 扩展字段。
     * @param ExtraParam 扩展字段。
     */
    public void setExtraParam(ExtraParam ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    public SubmitTemplateToVideoJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTemplateToVideoJobRequest(SubmitTemplateToVideoJobRequest source) {
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.Images != null) {
            this.Images = new Image[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new Image(source.Images[i]);
            }
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.BGM != null) {
            this.BGM = new Boolean(source.BGM);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new ExtraParam(source.ExtraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "BGM", this.BGM);
        this.setParamObj(map, prefix + "ExtraParam.", this.ExtraParam);

    }
}

