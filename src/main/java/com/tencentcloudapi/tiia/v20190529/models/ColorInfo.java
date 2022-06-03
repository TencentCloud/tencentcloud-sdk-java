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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColorInfo extends AbstractModel{

    /**
    * RGB颜色值（16进制），例如：291A18。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 当前颜色标签所占比例。
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
    * 颜色标签。蜜柚色，米驼色等。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get RGB颜色值（16进制），例如：291A18。 
     * @return Color RGB颜色值（16进制），例如：291A18。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set RGB颜色值（16进制），例如：291A18。
     * @param Color RGB颜色值（16进制），例如：291A18。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 当前颜色标签所占比例。 
     * @return Percentage 当前颜色标签所占比例。
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 当前颜色标签所占比例。
     * @param Percentage 当前颜色标签所占比例。
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get 颜色标签。蜜柚色，米驼色等。 
     * @return Label 颜色标签。蜜柚色，米驼色等。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 颜色标签。蜜柚色，米驼色等。
     * @param Label 颜色标签。蜜柚色，米驼色等。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public ColorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColorInfo(ColorInfo source) {
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Percentage != null) {
            this.Percentage = new Float(source.Percentage);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

