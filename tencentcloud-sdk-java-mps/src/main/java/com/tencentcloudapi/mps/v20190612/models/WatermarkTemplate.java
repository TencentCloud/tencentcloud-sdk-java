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

public class WatermarkTemplate extends AbstractModel{

    /**
    * 水印模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 水印类型，取值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 水印模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 水印图片原点距离视频图像原点的水平位置。
<li>当字符串以 % 结尾，表示水印 Left 为视频宽度指定百分比的位置，如 10% 表示 Left 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Left 为视频宽度指定像素的位置，如 100px 表示 Left 为 100 像素。</li>
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 水印图片原点距离视频图像原点的垂直位置。
<li>当字符串以 % 结尾，表示水印 Top 为视频高度指定百分比的位置，如 10% 表示 Top 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Top 为视频高度指定像素的位置，如 100px 表示 Top 为 100 像素。</li>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 图片水印模板，仅当 Type 为 image，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTemplate")
    @Expose
    private ImageWatermarkTemplate ImageTemplate;

    /**
    * 文字水印模板，仅当 Type 为 text，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextTemplate")
    @Expose
    private TextWatermarkTemplateInput TextTemplate;

    /**
    * SVG 水印模板，当 Type 为 svg，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SvgTemplate")
    @Expose
    private SvgWatermarkInput SvgTemplate;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 原点位置，可选值：
<li>topLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>topRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>bottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>bottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下。；</li>
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

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
     * Get 水印类型，取值：
<li>image：图片水印；</li>
<li>text：文字水印。</li> 
     * @return Type 水印类型，取值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 水印类型，取值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     * @param Type 水印类型，取值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 水印模板名称。 
     * @return Name 水印模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 水印模板名称。
     * @param Name 水印模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息。 
     * @return Comment 模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息。
     * @param Comment 模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 水印图片原点距离视频图像原点的水平位置。
<li>当字符串以 % 结尾，表示水印 Left 为视频宽度指定百分比的位置，如 10% 表示 Left 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Left 为视频宽度指定像素的位置，如 100px 表示 Left 为 100 像素。</li> 
     * @return XPos 水印图片原点距离视频图像原点的水平位置。
<li>当字符串以 % 结尾，表示水印 Left 为视频宽度指定百分比的位置，如 10% 表示 Left 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Left 为视频宽度指定像素的位置，如 100px 表示 Left 为 100 像素。</li>
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 水印图片原点距离视频图像原点的水平位置。
<li>当字符串以 % 结尾，表示水印 Left 为视频宽度指定百分比的位置，如 10% 表示 Left 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Left 为视频宽度指定像素的位置，如 100px 表示 Left 为 100 像素。</li>
     * @param XPos 水印图片原点距离视频图像原点的水平位置。
<li>当字符串以 % 结尾，表示水印 Left 为视频宽度指定百分比的位置，如 10% 表示 Left 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Left 为视频宽度指定像素的位置，如 100px 表示 Left 为 100 像素。</li>
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get 水印图片原点距离视频图像原点的垂直位置。
<li>当字符串以 % 结尾，表示水印 Top 为视频高度指定百分比的位置，如 10% 表示 Top 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Top 为视频高度指定像素的位置，如 100px 表示 Top 为 100 像素。</li> 
     * @return YPos 水印图片原点距离视频图像原点的垂直位置。
<li>当字符串以 % 结尾，表示水印 Top 为视频高度指定百分比的位置，如 10% 表示 Top 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Top 为视频高度指定像素的位置，如 100px 表示 Top 为 100 像素。</li>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 水印图片原点距离视频图像原点的垂直位置。
<li>当字符串以 % 结尾，表示水印 Top 为视频高度指定百分比的位置，如 10% 表示 Top 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Top 为视频高度指定像素的位置，如 100px 表示 Top 为 100 像素。</li>
     * @param YPos 水印图片原点距离视频图像原点的垂直位置。
<li>当字符串以 % 结尾，表示水印 Top 为视频高度指定百分比的位置，如 10% 表示 Top 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Top 为视频高度指定像素的位置，如 100px 表示 Top 为 100 像素。</li>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get 图片水印模板，仅当 Type 为 image，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTemplate 图片水印模板，仅当 Type 为 image，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageWatermarkTemplate getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set 图片水印模板，仅当 Type 为 image，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTemplate 图片水印模板，仅当 Type 为 image，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTemplate(ImageWatermarkTemplate ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    /**
     * Get 文字水印模板，仅当 Type 为 text，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextTemplate 文字水印模板，仅当 Type 为 text，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextWatermarkTemplateInput getTextTemplate() {
        return this.TextTemplate;
    }

    /**
     * Set 文字水印模板，仅当 Type 为 text，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextTemplate 文字水印模板，仅当 Type 为 text，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextTemplate(TextWatermarkTemplateInput TextTemplate) {
        this.TextTemplate = TextTemplate;
    }

    /**
     * Get SVG 水印模板，当 Type 为 svg，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SvgTemplate SVG 水印模板，当 Type 为 svg，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SvgWatermarkInput getSvgTemplate() {
        return this.SvgTemplate;
    }

    /**
     * Set SVG 水印模板，当 Type 为 svg，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SvgTemplate SVG 水印模板，当 Type 为 svg，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSvgTemplate(SvgWatermarkInput SvgTemplate) {
        this.SvgTemplate = SvgTemplate;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 原点位置，可选值：
<li>topLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>topRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>bottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>bottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下。；</li> 
     * @return CoordinateOrigin 原点位置，可选值：
<li>topLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>topRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>bottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>bottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下。；</li>
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set 原点位置，可选值：
<li>topLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>topRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>bottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>bottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下。；</li>
     * @param CoordinateOrigin 原点位置，可选值：
<li>topLeft：表示坐标原点位于视频图像左上角，水印原点为图片或文字的左上角；</li>
<li>topRight：表示坐标原点位于视频图像的右上角，水印原点为图片或文字的右上角；</li>
<li>bottomLeft：表示坐标原点位于视频图像的左下角，水印原点为图片或文字的左下角；</li>
<li>bottomRight：表示坐标原点位于视频图像的右下角，水印原点为图片或文字的右下。；</li>
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamObj(map, prefix + "ImageTemplate.", this.ImageTemplate);
        this.setParamObj(map, prefix + "TextTemplate.", this.TextTemplate);
        this.setParamObj(map, prefix + "SvgTemplate.", this.SvgTemplate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);

    }
}

