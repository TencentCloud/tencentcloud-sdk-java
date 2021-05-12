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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpperBodyCloth extends AbstractModel{

    /**
    * 上衣纹理信息。
    */
    @SerializedName("Texture")
    @Expose
    private UpperBodyClothTexture Texture;

    /**
    * 上衣颜色信息。
    */
    @SerializedName("Color")
    @Expose
    private UpperBodyClothColor Color;

    /**
    * 上衣衣袖信息。
    */
    @SerializedName("Sleeve")
    @Expose
    private UpperBodyClothSleeve Sleeve;

    /**
     * Get 上衣纹理信息。 
     * @return Texture 上衣纹理信息。
     */
    public UpperBodyClothTexture getTexture() {
        return this.Texture;
    }

    /**
     * Set 上衣纹理信息。
     * @param Texture 上衣纹理信息。
     */
    public void setTexture(UpperBodyClothTexture Texture) {
        this.Texture = Texture;
    }

    /**
     * Get 上衣颜色信息。 
     * @return Color 上衣颜色信息。
     */
    public UpperBodyClothColor getColor() {
        return this.Color;
    }

    /**
     * Set 上衣颜色信息。
     * @param Color 上衣颜色信息。
     */
    public void setColor(UpperBodyClothColor Color) {
        this.Color = Color;
    }

    /**
     * Get 上衣衣袖信息。 
     * @return Sleeve 上衣衣袖信息。
     */
    public UpperBodyClothSleeve getSleeve() {
        return this.Sleeve;
    }

    /**
     * Set 上衣衣袖信息。
     * @param Sleeve 上衣衣袖信息。
     */
    public void setSleeve(UpperBodyClothSleeve Sleeve) {
        this.Sleeve = Sleeve;
    }

    public UpperBodyCloth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpperBodyCloth(UpperBodyCloth source) {
        if (source.Texture != null) {
            this.Texture = new UpperBodyClothTexture(source.Texture);
        }
        if (source.Color != null) {
            this.Color = new UpperBodyClothColor(source.Color);
        }
        if (source.Sleeve != null) {
            this.Sleeve = new UpperBodyClothSleeve(source.Sleeve);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Texture.", this.Texture);
        this.setParamObj(map, prefix + "Color.", this.Color);
        this.setParamObj(map, prefix + "Sleeve.", this.Sleeve);

    }
}

