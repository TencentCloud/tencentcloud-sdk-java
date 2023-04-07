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

public class ImageBlur extends AbstractModel{

    /**
    * 图片模糊的操作类型。可选模式有：
<li>Gaussian : 高斯模糊。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 模糊半径，取值范围为1 - 50。当 Type 取值为 Gaussian 时此字段有效。
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
    * 正态分布的标准差，必须大于0。当 Type 取值为 Gaussian 时此字段有效。
    */
    @SerializedName("Sigma")
    @Expose
    private Long Sigma;

    /**
     * Get 图片模糊的操作类型。可选模式有：
<li>Gaussian : 高斯模糊。</li> 
     * @return Type 图片模糊的操作类型。可选模式有：
<li>Gaussian : 高斯模糊。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图片模糊的操作类型。可选模式有：
<li>Gaussian : 高斯模糊。</li>
     * @param Type 图片模糊的操作类型。可选模式有：
<li>Gaussian : 高斯模糊。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 模糊半径，取值范围为1 - 50。当 Type 取值为 Gaussian 时此字段有效。 
     * @return Radius 模糊半径，取值范围为1 - 50。当 Type 取值为 Gaussian 时此字段有效。
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set 模糊半径，取值范围为1 - 50。当 Type 取值为 Gaussian 时此字段有效。
     * @param Radius 模糊半径，取值范围为1 - 50。当 Type 取值为 Gaussian 时此字段有效。
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    /**
     * Get 正态分布的标准差，必须大于0。当 Type 取值为 Gaussian 时此字段有效。 
     * @return Sigma 正态分布的标准差，必须大于0。当 Type 取值为 Gaussian 时此字段有效。
     */
    public Long getSigma() {
        return this.Sigma;
    }

    /**
     * Set 正态分布的标准差，必须大于0。当 Type 取值为 Gaussian 时此字段有效。
     * @param Sigma 正态分布的标准差，必须大于0。当 Type 取值为 Gaussian 时此字段有效。
     */
    public void setSigma(Long Sigma) {
        this.Sigma = Sigma;
    }

    public ImageBlur() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageBlur(ImageBlur source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Radius != null) {
            this.Radius = new Long(source.Radius);
        }
        if (source.Sigma != null) {
            this.Sigma = new Long(source.Sigma);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Radius", this.Radius);
        this.setParamSimple(map, prefix + "Sigma", this.Sigma);

    }
}

