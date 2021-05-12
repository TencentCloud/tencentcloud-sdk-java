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

public class Hat extends AbstractModel{

    /**
    * 帽子佩戴状态信息。
AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
    */
    @SerializedName("Style")
    @Expose
    private AttributeItem Style;

    /**
    * 帽子颜色。
AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
    */
    @SerializedName("Color")
    @Expose
    private AttributeItem Color;

    /**
     * Get 帽子佩戴状态信息。
AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。 
     * @return Style 帽子佩戴状态信息。
AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     */
    public AttributeItem getStyle() {
        return this.Style;
    }

    /**
     * Set 帽子佩戴状态信息。
AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     * @param Style 帽子佩戴状态信息。
AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     */
    public void setStyle(AttributeItem Style) {
        this.Style = Style;
    }

    /**
     * Get 帽子颜色。
AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。 
     * @return Color 帽子颜色。
AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     */
    public AttributeItem getColor() {
        return this.Color;
    }

    /**
     * Set 帽子颜色。
AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     * @param Color 帽子颜色。
AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     */
    public void setColor(AttributeItem Color) {
        this.Color = Color;
    }

    public Hat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hat(Hat source) {
        if (source.Style != null) {
            this.Style = new AttributeItem(source.Style);
        }
        if (source.Color != null) {
            this.Color = new AttributeItem(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Style.", this.Style);
        this.setParamObj(map, prefix + "Color.", this.Color);

    }
}

