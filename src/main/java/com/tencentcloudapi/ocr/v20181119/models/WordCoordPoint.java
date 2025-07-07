/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WordCoordPoint extends AbstractModel {

    /**
    * 英文OCR识别出的每个单词在原图中的四点坐标。
    */
    @SerializedName("WordCoordinate")
    @Expose
    private Coord [] WordCoordinate;

    /**
     * Get 英文OCR识别出的每个单词在原图中的四点坐标。 
     * @return WordCoordinate 英文OCR识别出的每个单词在原图中的四点坐标。
     */
    public Coord [] getWordCoordinate() {
        return this.WordCoordinate;
    }

    /**
     * Set 英文OCR识别出的每个单词在原图中的四点坐标。
     * @param WordCoordinate 英文OCR识别出的每个单词在原图中的四点坐标。
     */
    public void setWordCoordinate(Coord [] WordCoordinate) {
        this.WordCoordinate = WordCoordinate;
    }

    public WordCoordPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordCoordPoint(WordCoordPoint source) {
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

