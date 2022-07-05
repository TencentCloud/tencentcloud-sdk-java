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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCuttingWatermark extends AbstractModel{

    /**
    * 水印类型，可选值：
<li>Image：图像水印；</li>
<li>Text：文字水印。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图像水印信息，当 Type=Image 时必选。
    */
    @SerializedName("Image")
    @Expose
    private MediaCuttingWatermarkImage Image;

    /**
    * 文字水印信息，当 Type=Text 时必选。
    */
    @SerializedName("Text")
    @Expose
    private MediaCuttingWatermarkText Text;

    /**
     * Get 水印类型，可选值：
<li>Image：图像水印；</li>
<li>Text：文字水印。</li> 
     * @return Type 水印类型，可选值：
<li>Image：图像水印；</li>
<li>Text：文字水印。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 水印类型，可选值：
<li>Image：图像水印；</li>
<li>Text：文字水印。</li>
     * @param Type 水印类型，可选值：
<li>Image：图像水印；</li>
<li>Text：文字水印。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图像水印信息，当 Type=Image 时必选。 
     * @return Image 图像水印信息，当 Type=Image 时必选。
     */
    public MediaCuttingWatermarkImage getImage() {
        return this.Image;
    }

    /**
     * Set 图像水印信息，当 Type=Image 时必选。
     * @param Image 图像水印信息，当 Type=Image 时必选。
     */
    public void setImage(MediaCuttingWatermarkImage Image) {
        this.Image = Image;
    }

    /**
     * Get 文字水印信息，当 Type=Text 时必选。 
     * @return Text 文字水印信息，当 Type=Text 时必选。
     */
    public MediaCuttingWatermarkText getText() {
        return this.Text;
    }

    /**
     * Set 文字水印信息，当 Type=Text 时必选。
     * @param Text 文字水印信息，当 Type=Text 时必选。
     */
    public void setText(MediaCuttingWatermarkText Text) {
        this.Text = Text;
    }

    public MediaCuttingWatermark() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingWatermark(MediaCuttingWatermark source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Image != null) {
            this.Image = new MediaCuttingWatermarkImage(source.Image);
        }
        if (source.Text != null) {
            this.Text = new MediaCuttingWatermarkText(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "Text.", this.Text);

    }
}

