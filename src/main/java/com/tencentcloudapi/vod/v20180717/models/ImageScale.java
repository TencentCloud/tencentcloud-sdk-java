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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScale extends AbstractModel{

    /**
    * 图片缩放的操作类型。可选模式有：
<li>WidthFirst : 指定图片的宽为 Width ，高度等比缩放。</li>
<li>HeightFirst : 指定图片的高为 Height ，宽度等比缩放。</li>
<li>LongEdgeFirst : 指定图片的长边为 LongEdge ，短边等比缩放。</li>
<li>ShortEdgeFirst : 指定图片的短边为 ShortEdge ，长边等比缩放。</li>
<li>Force : 忽略原图宽高比例，指定图片宽度为 Width，高度为 Height ，强行缩放图片，可能导致目标图片变形。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输出图片的高度，单位为像素。当 Type 取值为 HeightFirst 或 Force 时此字段有效。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 输出图片的宽度，单位为像素。当 Type 取值为 WidthFirst 或 Force 时此字段有效。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 输出图片的长边长度，单位为像素。当 Type 取值为 LongEdgeFirst 时此字段有效。
    */
    @SerializedName("LongEdge")
    @Expose
    private Long LongEdge;

    /**
    * 输出图片的短边长度，单位为像素。当 Type 取值为 ShortEdgeFirst 时此字段有效。
    */
    @SerializedName("ShortEdge")
    @Expose
    private Long ShortEdge;

    /**
     * Get 图片缩放的操作类型。可选模式有：
<li>WidthFirst : 指定图片的宽为 Width ，高度等比缩放。</li>
<li>HeightFirst : 指定图片的高为 Height ，宽度等比缩放。</li>
<li>LongEdgeFirst : 指定图片的长边为 LongEdge ，短边等比缩放。</li>
<li>ShortEdgeFirst : 指定图片的短边为 ShortEdge ，长边等比缩放。</li>
<li>Force : 忽略原图宽高比例，指定图片宽度为 Width，高度为 Height ，强行缩放图片，可能导致目标图片变形。</li> 
     * @return Type 图片缩放的操作类型。可选模式有：
<li>WidthFirst : 指定图片的宽为 Width ，高度等比缩放。</li>
<li>HeightFirst : 指定图片的高为 Height ，宽度等比缩放。</li>
<li>LongEdgeFirst : 指定图片的长边为 LongEdge ，短边等比缩放。</li>
<li>ShortEdgeFirst : 指定图片的短边为 ShortEdge ，长边等比缩放。</li>
<li>Force : 忽略原图宽高比例，指定图片宽度为 Width，高度为 Height ，强行缩放图片，可能导致目标图片变形。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图片缩放的操作类型。可选模式有：
<li>WidthFirst : 指定图片的宽为 Width ，高度等比缩放。</li>
<li>HeightFirst : 指定图片的高为 Height ，宽度等比缩放。</li>
<li>LongEdgeFirst : 指定图片的长边为 LongEdge ，短边等比缩放。</li>
<li>ShortEdgeFirst : 指定图片的短边为 ShortEdge ，长边等比缩放。</li>
<li>Force : 忽略原图宽高比例，指定图片宽度为 Width，高度为 Height ，强行缩放图片，可能导致目标图片变形。</li>
     * @param Type 图片缩放的操作类型。可选模式有：
<li>WidthFirst : 指定图片的宽为 Width ，高度等比缩放。</li>
<li>HeightFirst : 指定图片的高为 Height ，宽度等比缩放。</li>
<li>LongEdgeFirst : 指定图片的长边为 LongEdge ，短边等比缩放。</li>
<li>ShortEdgeFirst : 指定图片的短边为 ShortEdge ，长边等比缩放。</li>
<li>Force : 忽略原图宽高比例，指定图片宽度为 Width，高度为 Height ，强行缩放图片，可能导致目标图片变形。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输出图片的高度，单位为像素。当 Type 取值为 HeightFirst 或 Force 时此字段有效。 
     * @return Height 输出图片的高度，单位为像素。当 Type 取值为 HeightFirst 或 Force 时此字段有效。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 输出图片的高度，单位为像素。当 Type 取值为 HeightFirst 或 Force 时此字段有效。
     * @param Height 输出图片的高度，单位为像素。当 Type 取值为 HeightFirst 或 Force 时此字段有效。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 输出图片的宽度，单位为像素。当 Type 取值为 WidthFirst 或 Force 时此字段有效。 
     * @return Width 输出图片的宽度，单位为像素。当 Type 取值为 WidthFirst 或 Force 时此字段有效。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 输出图片的宽度，单位为像素。当 Type 取值为 WidthFirst 或 Force 时此字段有效。
     * @param Width 输出图片的宽度，单位为像素。当 Type 取值为 WidthFirst 或 Force 时此字段有效。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 输出图片的长边长度，单位为像素。当 Type 取值为 LongEdgeFirst 时此字段有效。 
     * @return LongEdge 输出图片的长边长度，单位为像素。当 Type 取值为 LongEdgeFirst 时此字段有效。
     */
    public Long getLongEdge() {
        return this.LongEdge;
    }

    /**
     * Set 输出图片的长边长度，单位为像素。当 Type 取值为 LongEdgeFirst 时此字段有效。
     * @param LongEdge 输出图片的长边长度，单位为像素。当 Type 取值为 LongEdgeFirst 时此字段有效。
     */
    public void setLongEdge(Long LongEdge) {
        this.LongEdge = LongEdge;
    }

    /**
     * Get 输出图片的短边长度，单位为像素。当 Type 取值为 ShortEdgeFirst 时此字段有效。 
     * @return ShortEdge 输出图片的短边长度，单位为像素。当 Type 取值为 ShortEdgeFirst 时此字段有效。
     */
    public Long getShortEdge() {
        return this.ShortEdge;
    }

    /**
     * Set 输出图片的短边长度，单位为像素。当 Type 取值为 ShortEdgeFirst 时此字段有效。
     * @param ShortEdge 输出图片的短边长度，单位为像素。当 Type 取值为 ShortEdgeFirst 时此字段有效。
     */
    public void setShortEdge(Long ShortEdge) {
        this.ShortEdge = ShortEdge;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "LongEdge", this.LongEdge);
        this.setParamSimple(map, prefix + "ShortEdge", this.ShortEdge);

    }
}

