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

public class DetectedWordCoordPoint extends AbstractModel{

    /**
    * 单字在原图中的坐标，以四个顶点坐标表示，以左上角为起点，顺时针返回。
    */
    @SerializedName("WordCoordinate")
    @Expose
    private Coord [] WordCoordinate;

    /**
     * Get 单字在原图中的坐标，以四个顶点坐标表示，以左上角为起点，顺时针返回。 
     * @return WordCoordinate 单字在原图中的坐标，以四个顶点坐标表示，以左上角为起点，顺时针返回。
     */
    public Coord [] getWordCoordinate() {
        return this.WordCoordinate;
    }

    /**
     * Set 单字在原图中的坐标，以四个顶点坐标表示，以左上角为起点，顺时针返回。
     * @param WordCoordinate 单字在原图中的坐标，以四个顶点坐标表示，以左上角为起点，顺时针返回。
     */
    public void setWordCoordinate(Coord [] WordCoordinate) {
        this.WordCoordinate = WordCoordinate;
    }

    public DetectedWordCoordPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectedWordCoordPoint(DetectedWordCoordPoint source) {
        if (source.WordCoordinate != null) {
            this.WordCoordinate = new Coord[source.WordCoordinate.length];
            for (int i = 0; i < source.WordCoordinate.length; i++) {
                this.WordCoordinate[i] = new Coord(source.WordCoordinate[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WordCoordinate.", this.WordCoordinate);

    }
}

