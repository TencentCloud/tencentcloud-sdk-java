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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hair extends AbstractModel{

    /**
    * 头发长度信息。
AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
    */
    @SerializedName("Length")
    @Expose
    private AttributeItem Length;

    /**
    * 刘海信息。
AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
    */
    @SerializedName("Bang")
    @Expose
    private AttributeItem Bang;

    /**
    * 头发颜色信息。
AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
    */
    @SerializedName("Color")
    @Expose
    private AttributeItem Color;

    /**
     * Get 头发长度信息。
AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。 
     * @return Length 头发长度信息。
AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     */
    public AttributeItem getLength() {
        return this.Length;
    }

    /**
     * Set 头发长度信息。
AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     * @param Length 头发长度信息。
AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     */
    public void setLength(AttributeItem Length) {
        this.Length = Length;
    }

    /**
     * Get 刘海信息。
AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。 
     * @return Bang 刘海信息。
AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     */
    public AttributeItem getBang() {
        return this.Bang;
    }

    /**
     * Set 刘海信息。
AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     * @param Bang 刘海信息。
AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     */
    public void setBang(AttributeItem Bang) {
        this.Bang = Bang;
    }

    /**
     * Get 头发颜色信息。
AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。 
     * @return Color 头发颜色信息。
AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     */
    public AttributeItem getColor() {
        return this.Color;
    }

    /**
     * Set 头发颜色信息。
AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     * @param Color 头发颜色信息。
AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     */
    public void setColor(AttributeItem Color) {
        this.Color = Color;
    }

    public Hair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hair(Hair source) {
        if (source.Length != null) {
            this.Length = new AttributeItem(source.Length);
        }
        if (source.Bang != null) {
            this.Bang = new AttributeItem(source.Bang);
        }
        if (source.Color != null) {
            this.Color = new AttributeItem(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Length.", this.Length);
        this.setParamObj(map, prefix + "Bang.", this.Bang);
        this.setParamObj(map, prefix + "Color.", this.Color);

    }
}

