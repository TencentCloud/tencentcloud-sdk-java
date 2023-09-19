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

public class ComposeImageOperation extends AbstractModel{

    /**
    * 类型，取值有：
<li>Rotate：图像旋转。</li>
<li>Flip：图像翻转。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type = Rotate 时有效。图像以中心点为原点进行旋转的角度，取值范围0~360。
    */
    @SerializedName("RotateAngle")
    @Expose
    private Float RotateAngle;

    /**
    * 当 Type = Flip 时有效。图像翻转动作，取值有： 
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
    */
    @SerializedName("FlipType")
    @Expose
    private String FlipType;

    /**
     * Get 类型，取值有：
<li>Rotate：图像旋转。</li>
<li>Flip：图像翻转。</li> 
     * @return Type 类型，取值有：
<li>Rotate：图像旋转。</li>
<li>Flip：图像翻转。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值有：
<li>Rotate：图像旋转。</li>
<li>Flip：图像翻转。</li>
     * @param Type 类型，取值有：
<li>Rotate：图像旋转。</li>
<li>Flip：图像翻转。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type = Rotate 时有效。图像以中心点为原点进行旋转的角度，取值范围0~360。 
     * @return RotateAngle 当 Type = Rotate 时有效。图像以中心点为原点进行旋转的角度，取值范围0~360。
     */
    public Float getRotateAngle() {
        return this.RotateAngle;
    }

    /**
     * Set 当 Type = Rotate 时有效。图像以中心点为原点进行旋转的角度，取值范围0~360。
     * @param RotateAngle 当 Type = Rotate 时有效。图像以中心点为原点进行旋转的角度，取值范围0~360。
     */
    public void setRotateAngle(Float RotateAngle) {
        this.RotateAngle = RotateAngle;
    }

    /**
     * Get 当 Type = Flip 时有效。图像翻转动作，取值有： 
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li> 
     * @return FlipType 当 Type = Flip 时有效。图像翻转动作，取值有： 
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
     */
    public String getFlipType() {
        return this.FlipType;
    }

    /**
     * Set 当 Type = Flip 时有效。图像翻转动作，取值有： 
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
     * @param FlipType 当 Type = Flip 时有效。图像翻转动作，取值有： 
<li>Horizental：水平翻转，即左右镜像。</li>
<li>Vertical：垂直翻转，即上下镜像。</li>
     */
    public void setFlipType(String FlipType) {
        this.FlipType = FlipType;
    }

    public ComposeImageOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeImageOperation(ComposeImageOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RotateAngle != null) {
            this.RotateAngle = new Float(source.RotateAngle);
        }
        if (source.FlipType != null) {
            this.FlipType = new String(source.FlipType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RotateAngle", this.RotateAngle);
        this.setParamSimple(map, prefix + "FlipType", this.FlipType);

    }
}

