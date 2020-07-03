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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWatermarkTemplateRequest extends AbstractModel{

    /**
    * 水印模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 水印模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 原点位置，可选值：
<li>TopLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>TopRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>BottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>BottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下角。</li>
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * 水印原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 水印原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 图片水印模板，该字段仅对图片水印模板有效。
    */
    @SerializedName("ImageTemplate")
    @Expose
    private ImageWatermarkInputForUpdate ImageTemplate;

    /**
    * 文字水印模板，该字段仅对文字水印模板有效。
    */
    @SerializedName("TextTemplate")
    @Expose
    private TextWatermarkTemplateInputForUpdate TextTemplate;

    /**
    * SVG水印模板，当 Type 为 svg，该字段必填。当 Type 为 image 或 text，该字段无效。
    */
    @SerializedName("SvgTemplate")
    @Expose
    private SvgWatermarkInputForUpdate SvgTemplate;

    /**
     * Get 水印模板唯一标识。 
     * @return Definition 水印模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 水印模板唯一标识。
     * @param Definition 水印模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 水印模板名称，长度限制：64 个字符。 
     * @return Name 水印模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 水印模板名称，长度限制：64 个字符。
     * @param Name 水印模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 原点位置，可选值：
<li>TopLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>TopRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>BottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>BottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下角。</li> 
     * @return CoordinateOrigin 原点位置，可选值：
<li>TopLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>TopRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>BottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>BottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下角。</li>
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set 原点位置，可选值：
<li>TopLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>TopRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>BottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>BottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下角。</li>
     * @param CoordinateOrigin 原点位置，可选值：
<li>TopLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>TopRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>BottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>BottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下角。</li>
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get 水印原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li> 
     * @return XPos 水印原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 水印原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
     * @param XPos 水印原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get 水印原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li> 
     * @return YPos 水印原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 水印原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
     * @param YPos 水印原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get 图片水印模板，该字段仅对图片水印模板有效。 
     * @return ImageTemplate 图片水印模板，该字段仅对图片水印模板有效。
     */
    public ImageWatermarkInputForUpdate getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set 图片水印模板，该字段仅对图片水印模板有效。
     * @param ImageTemplate 图片水印模板，该字段仅对图片水印模板有效。
     */
    public void setImageTemplate(ImageWatermarkInputForUpdate ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    /**
     * Get 文字水印模板，该字段仅对文字水印模板有效。 
     * @return TextTemplate 文字水印模板，该字段仅对文字水印模板有效。
     */
    public TextWatermarkTemplateInputForUpdate getTextTemplate() {
        return this.TextTemplate;
    }

    /**
     * Set 文字水印模板，该字段仅对文字水印模板有效。
     * @param TextTemplate 文字水印模板，该字段仅对文字水印模板有效。
     */
    public void setTextTemplate(TextWatermarkTemplateInputForUpdate TextTemplate) {
        this.TextTemplate = TextTemplate;
    }

    /**
     * Get SVG水印模板，当 Type 为 svg，该字段必填。当 Type 为 image 或 text，该字段无效。 
     * @return SvgTemplate SVG水印模板，当 Type 为 svg，该字段必填。当 Type 为 image 或 text，该字段无效。
     */
    public SvgWatermarkInputForUpdate getSvgTemplate() {
        return this.SvgTemplate;
    }

    /**
     * Set SVG水印模板，当 Type 为 svg，该字段必填。当 Type 为 image 或 text，该字段无效。
     * @param SvgTemplate SVG水印模板，当 Type 为 svg，该字段必填。当 Type 为 image 或 text，该字段无效。
     */
    public void setSvgTemplate(SvgWatermarkInputForUpdate SvgTemplate) {
        this.SvgTemplate = SvgTemplate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamObj(map, prefix + "ImageTemplate.", this.ImageTemplate);
        this.setParamObj(map, prefix + "TextTemplate.", this.TextTemplate);
        this.setParamObj(map, prefix + "SvgTemplate.", this.SvgTemplate);

    }
}

