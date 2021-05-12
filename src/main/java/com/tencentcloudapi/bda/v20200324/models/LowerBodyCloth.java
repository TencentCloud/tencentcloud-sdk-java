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

public class LowerBodyCloth extends AbstractModel{

    /**
    * 下衣颜色信息。
    */
    @SerializedName("Color")
    @Expose
    private LowerBodyClothColor Color;

    /**
    * 下衣长度信息 。
    */
    @SerializedName("Length")
    @Expose
    private LowerBodyClothLength Length;

    /**
    * 下衣类型信息。
    */
    @SerializedName("Type")
    @Expose
    private LowerBodyClothType Type;

    /**
     * Get 下衣颜色信息。 
     * @return Color 下衣颜色信息。
     */
    public LowerBodyClothColor getColor() {
        return this.Color;
    }

    /**
     * Set 下衣颜色信息。
     * @param Color 下衣颜色信息。
     */
    public void setColor(LowerBodyClothColor Color) {
        this.Color = Color;
    }

    /**
     * Get 下衣长度信息 。 
     * @return Length 下衣长度信息 。
     */
    public LowerBodyClothLength getLength() {
        return this.Length;
    }

    /**
     * Set 下衣长度信息 。
     * @param Length 下衣长度信息 。
     */
    public void setLength(LowerBodyClothLength Length) {
        this.Length = Length;
    }

    /**
     * Get 下衣类型信息。 
     * @return Type 下衣类型信息。
     */
    public LowerBodyClothType getType() {
        return this.Type;
    }

    /**
     * Set 下衣类型信息。
     * @param Type 下衣类型信息。
     */
    public void setType(LowerBodyClothType Type) {
        this.Type = Type;
    }

    public LowerBodyCloth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LowerBodyCloth(LowerBodyCloth source) {
        if (source.Color != null) {
            this.Color = new LowerBodyClothColor(source.Color);
        }
        if (source.Length != null) {
            this.Length = new LowerBodyClothLength(source.Length);
        }
        if (source.Type != null) {
            this.Type = new LowerBodyClothType(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Color.", this.Color);
        this.setParamObj(map, prefix + "Length.", this.Length);
        this.setParamObj(map, prefix + "Type.", this.Type);

    }
}

