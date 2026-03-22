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
    * <p>特效模板名称。请在 <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板列表</a>  中选择想要生成的特效对应的 template 名称。</p>
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * <p>参考图像，不同特效输入图片的数量详见： <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-图片要求说明</a></p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片格式：支持png、jpg、jpeg、webp、bmp、tiff</li><li>图片文件：大小不能超过10MB（base64后），图片分辨率不小于300×300px，不大于4096×4096，图片宽高比应在1:4 ~ 4:1之间</li></ul>
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * <p>为生成视频添加标识的开关，默认为1。传0 需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成后方可生效。<br>1：添加标识；<br>0：不添加标识；<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>标识内容设置。<br>默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成。</p>
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * <p>视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：<a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-单次调用消耗积分数列</a></p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p>
    */
    @SerializedName("BGM")
    @Expose
    private Boolean BGM;

    /**
    * <p>扩展字段。</p>
    */
    @SerializedName("ExtraParam")
    @Expose
    private ExtraParam ExtraParam;

    /**
     * Get <p>特效模板名称。请在 <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板列表</a>  中选择想要生成的特效对应的 template 名称。</p> 
     * @return Template <p>特效模板名称。请在 <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板列表</a>  中选择想要生成的特效对应的 template 名称。</p>
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>特效模板名称。请在 <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板列表</a>  中选择想要生成的特效对应的 template 名称。</p>
     * @param Template <p>特效模板名称。请在 <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板列表</a>  中选择想要生成的特效对应的 template 名称。</p>
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get <p>参考图像，不同特效输入图片的数量详见： <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-图片要求说明</a></p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片格式：支持png、jpg、jpeg、webp、bmp、tiff</li><li>图片文件：大小不能超过10MB（base64后），图片分辨率不小于300×300px，不大于4096×4096，图片宽高比应在1:4 ~ 4:1之间</li></ul> 
     * @return Images <p>参考图像，不同特效输入图片的数量详见： <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-图片要求说明</a></p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片格式：支持png、jpg、jpeg、webp、bmp、tiff</li><li>图片文件：大小不能超过10MB（base64后），图片分辨率不小于300×300px，不大于4096×4096，图片宽高比应在1:4 ~ 4:1之间</li></ul>
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>参考图像，不同特效输入图片的数量详见： <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-图片要求说明</a></p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片格式：支持png、jpg、jpeg、webp、bmp、tiff</li><li>图片文件：大小不能超过10MB（base64后），图片分辨率不小于300×300px，不大于4096×4096，图片宽高比应在1:4 ~ 4:1之间</li></ul>
     * @param Images <p>参考图像，不同特效输入图片的数量详见： <a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-图片要求说明</a></p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片格式：支持png、jpg、jpeg、webp、bmp、tiff</li><li>图片文件：大小不能超过10MB（base64后），图片分辨率不小于300×300px，不大于4096×4096，图片宽高比应在1:4 ~ 4:1之间</li></ul>
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>为生成视频添加标识的开关，默认为1。传0 需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成后方可生效。<br>1：添加标识；<br>0：不添加标识；<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p> 
     * @return LogoAdd <p>为生成视频添加标识的开关，默认为1。传0 需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成后方可生效。<br>1：添加标识；<br>0：不添加标识；<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>为生成视频添加标识的开关，默认为1。传0 需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成后方可生效。<br>1：添加标识；<br>0：不添加标识；<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
     * @param LogoAdd <p>为生成视频添加标识的开关，默认为1。传0 需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成后方可生效。<br>1：添加标识；<br>0：不添加标识；<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>标识内容设置。<br>默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成。</p> 
     * @return LogoParam <p>标识内容设置。<br>默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成。</p>
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set <p>标识内容设置。<br>默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成。</p>
     * @param LogoParam <p>标识内容设置。<br>默认在生成视频的右下角添加“ AI 生成”或“视频由 AI 生成”字样，如需替换为其他的标识图片，需前往  <a href="https://console.cloud.tencent.com/vtc/setting">控制台</a> 申请开启显式标识自主完成。</p>
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get <p>视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：<a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-单次调用消耗积分数列</a></p> 
     * @return Resolution <p>视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：<a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-单次调用消耗积分数列</a></p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：<a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-单次调用消耗积分数列</a></p>
     * @param Resolution <p>视频输出分辨率，默认值：360p 。不同特效支持的清晰度及消耗积分数详见：<a href="https://cloud.tencent.com/document/product/1616/119194">视频特效模板-单次调用消耗积分数列</a></p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p> 
     * @return BGM <p>是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p>
     */
    public Boolean getBGM() {
        return this.BGM;
    }

    /**
     * Set <p>是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p>
     * @param BGM <p>是否为生成的视频添加背景音乐。默认：false，  传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p>
     */
    public void setBGM(Boolean BGM) {
        this.BGM = BGM;
    }

    /**
     * Get <p>扩展字段。</p> 
     * @return ExtraParam <p>扩展字段。</p>
     */
    public ExtraParam getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set <p>扩展字段。</p>
     * @param ExtraParam <p>扩展字段。</p>
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

