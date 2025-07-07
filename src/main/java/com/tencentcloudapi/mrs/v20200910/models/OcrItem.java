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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrItem extends AbstractModel {

    /**
    * 图片中文字的字符串
    */
    @SerializedName("Words")
    @Expose
    private String Words;

    /**
    * Words 中每个文字的坐标数组，顺序与Words中的字符顺序一致
    */
    @SerializedName("Coords")
    @Expose
    private Coordinate [] Coords;

    /**
    * 整个字符块的坐标信息
    */
    @SerializedName("WordCoords")
    @Expose
    private Coordinate WordCoords;

    /**
     * Get 图片中文字的字符串 
     * @return Words 图片中文字的字符串
     */
    public String getWords() {
        return this.Words;
    }

    /**
     * Set 图片中文字的字符串
     * @param Words 图片中文字的字符串
     */
    public void setWords(String Words) {
        this.Words = Words;
    }

    /**
     * Get Words 中每个文字的坐标数组，顺序与Words中的字符顺序一致 
     * @return Coords Words 中每个文字的坐标数组，顺序与Words中的字符顺序一致
     */
    public Coordinate [] getCoords() {
        return this.Coords;
    }

    /**
     * Set Words 中每个文字的坐标数组，顺序与Words中的字符顺序一致
     * @param Coords Words 中每个文字的坐标数组，顺序与Words中的字符顺序一致
     */
    public void setCoords(Coordinate [] Coords) {
        this.Coords = Coords;
    }

    /**
     * Get 整个字符块的坐标信息 
     * @return WordCoords 整个字符块的坐标信息
     */
    public Coordinate getWordCoords() {
        return this.WordCoords;
    }

    /**
     * Set 整个字符块的坐标信息
     * @param WordCoords 整个字符块的坐标信息
     */
    public void setWordCoords(Coordinate WordCoords) {
        this.WordCoords = WordCoords;
    }

    public OcrItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrItem(OcrItem source) {
        if (source.Words != null) {
            this.Words = new String(source.Words);
        }
        if (source.Coords != null) {
            this.Coords = new Coordinate[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coordinate(source.Coords[i]);
            }
        }
        if (source.WordCoords != null) {
            this.WordCoords = new Coordinate(source.WordCoords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Words", this.Words);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);
        this.setParamObj(map, prefix + "WordCoords.", this.WordCoords);

    }
}

