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

public class ImageTransform extends AbstractModel{

    /**
    * 类型，取值有：
<li> Rotate：图像旋转。</li>
<li> Flip：图像翻转。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图像以中心点为原点进行旋转的角度，取值范围0~360。当 Type = Rotate 时有效。
    */
    @SerializedName("RotateAngle")
    @Expose
    private Float RotateAngle;

    /**
    * 图像翻转动作，取值有：
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
当 Type = Flip 时有效。
    */
    @SerializedName("Flip")
    @Expose
    private String Flip;

    /**
     * Get 类型，取值有：
<li> Rotate：图像旋转。</li>
<li> Flip：图像翻转。</li> 
     * @return Type 类型，取值有：
<li> Rotate：图像旋转。</li>
<li> Flip：图像翻转。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值有：
<li> Rotate：图像旋转。</li>
<li> Flip：图像翻转。</li>
     * @param Type 类型，取值有：
<li> Rotate：图像旋转。</li>
<li> Flip：图像翻转。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图像以中心点为原点进行旋转的角度，取值范围0~360。当 Type = Rotate 时有效。 
     * @return RotateAngle 图像以中心点为原点进行旋转的角度，取值范围0~360。当 Type = Rotate 时有效。
     */
    public Float getRotateAngle() {
        return this.RotateAngle;
    }

    /**
     * Set 图像以中心点为原点进行旋转的角度，取值范围0~360。当 Type = Rotate 时有效。
     * @param RotateAngle 图像以中心点为原点进行旋转的角度，取值范围0~360。当 Type = Rotate 时有效。
     */
    public void setRotateAngle(Float RotateAngle) {
        this.RotateAngle = RotateAngle;
    }

    /**
     * Get 图像翻转动作，取值有：
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
当 Type = Flip 时有效。 
     * @return Flip 图像翻转动作，取值有：
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
当 Type = Flip 时有效。
     */
    public String getFlip() {
        return this.Flip;
    }

    /**
     * Set 图像翻转动作，取值有：
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
当 Type = Flip 时有效。
     * @param Flip 图像翻转动作，取值有：
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
当 Type = Flip 时有效。
     */
    public void setFlip(String Flip) {
        this.Flip = Flip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RotateAngle", this.RotateAngle);
        this.setParamSimple(map, prefix + "Flip", this.Flip);

    }
}

