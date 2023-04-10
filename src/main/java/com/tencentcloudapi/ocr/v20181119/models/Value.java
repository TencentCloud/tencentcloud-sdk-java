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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Value extends AbstractModel{

    /**
    * 自动识别的字段内容
    */
    @SerializedName("AutoContent")
    @Expose
    private String AutoContent;

    /**
    * 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coord")
    @Expose
    private Polygon Coord;

    /**
     * Get 自动识别的字段内容 
     * @return AutoContent 自动识别的字段内容
     */
    public String getAutoContent() {
        return this.AutoContent;
    }

    /**
     * Set 自动识别的字段内容
     * @param AutoContent 自动识别的字段内容
     */
    public void setAutoContent(String AutoContent) {
        this.AutoContent = AutoContent;
    }

    /**
     * Get 四点坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coord 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Polygon getCoord() {
        return this.Coord;
    }

    /**
     * Set 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coord 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoord(Polygon Coord) {
        this.Coord = Coord;
    }

    public Value() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Value(Value source) {
        if (source.AutoContent != null) {
            this.AutoContent = new String(source.AutoContent);
        }
        if (source.Coord != null) {
            this.Coord = new Polygon(source.Coord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoContent", this.AutoContent);
        this.setParamObj(map, prefix + "Coord.", this.Coord);

    }
}

