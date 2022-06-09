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

public class TextDetectionResult extends AbstractModel{

    /**
    * 识别出的文本行内容
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 坐标，以四个顶点坐标表示
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
     * Get 识别出的文本行内容 
     * @return Value 识别出的文本行内容
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别出的文本行内容
     * @param Value 识别出的文本行内容
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 坐标，以四个顶点坐标表示 
     * @return Polygon 坐标，以四个顶点坐标表示
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 坐标，以四个顶点坐标表示
     * @param Polygon 坐标，以四个顶点坐标表示
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    public TextDetectionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextDetectionResult(TextDetectionResult source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Polygon != null) {
            this.Polygon = new Coord[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Coord(source.Polygon[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);

    }
}

