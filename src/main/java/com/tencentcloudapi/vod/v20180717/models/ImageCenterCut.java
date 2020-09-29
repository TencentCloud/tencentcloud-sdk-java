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

public class ImageCenterCut extends AbstractModel{

    /**
    * 图片的裁剪模式，可选 Circle 和 Rectangle。
<li>Circle ： 内切圆裁剪，输出图片半径为 Radius。</li>
<li>Rectangle ： 矩形裁剪，输出图片宽为 Width ， 高为 Height。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输出图片的宽度，单位为像素，当 Type 取值为 Rectangle 时有效。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 输出图片的高度，单位为像素，当 Type 取值为 Rectangle 时有效。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 输出图片的半径，单位为像素，当 Type 取值为 Circle 时有效。
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
     * Get 图片的裁剪模式，可选 Circle 和 Rectangle。
<li>Circle ： 内切圆裁剪，输出图片半径为 Radius。</li>
<li>Rectangle ： 矩形裁剪，输出图片宽为 Width ， 高为 Height。</li> 
     * @return Type 图片的裁剪模式，可选 Circle 和 Rectangle。
<li>Circle ： 内切圆裁剪，输出图片半径为 Radius。</li>
<li>Rectangle ： 矩形裁剪，输出图片宽为 Width ， 高为 Height。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图片的裁剪模式，可选 Circle 和 Rectangle。
<li>Circle ： 内切圆裁剪，输出图片半径为 Radius。</li>
<li>Rectangle ： 矩形裁剪，输出图片宽为 Width ， 高为 Height。</li>
     * @param Type 图片的裁剪模式，可选 Circle 和 Rectangle。
<li>Circle ： 内切圆裁剪，输出图片半径为 Radius。</li>
<li>Rectangle ： 矩形裁剪，输出图片宽为 Width ， 高为 Height。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输出图片的宽度，单位为像素，当 Type 取值为 Rectangle 时有效。 
     * @return Width 输出图片的宽度，单位为像素，当 Type 取值为 Rectangle 时有效。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 输出图片的宽度，单位为像素，当 Type 取值为 Rectangle 时有效。
     * @param Width 输出图片的宽度，单位为像素，当 Type 取值为 Rectangle 时有效。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 输出图片的高度，单位为像素，当 Type 取值为 Rectangle 时有效。 
     * @return Height 输出图片的高度，单位为像素，当 Type 取值为 Rectangle 时有效。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 输出图片的高度，单位为像素，当 Type 取值为 Rectangle 时有效。
     * @param Height 输出图片的高度，单位为像素，当 Type 取值为 Rectangle 时有效。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 输出图片的半径，单位为像素，当 Type 取值为 Circle 时有效。 
     * @return Radius 输出图片的半径，单位为像素，当 Type 取值为 Circle 时有效。
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set 输出图片的半径，单位为像素，当 Type 取值为 Circle 时有效。
     * @param Radius 输出图片的半径，单位为像素，当 Type 取值为 Circle 时有效。
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Radius", this.Radius);

    }
}

