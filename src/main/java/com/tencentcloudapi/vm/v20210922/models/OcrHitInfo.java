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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrHitInfo extends AbstractModel {

    /**
    * 关键词
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 关键词内容
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 自定义库名
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 位置信息
    */
    @SerializedName("Positions")
    @Expose
    private TextPosition [] Positions;

    /**
     * Get 关键词 
     * @return Type 关键词
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 关键词
     * @param Type 关键词
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 关键词内容 
     * @return Keyword 关键词内容
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词内容
     * @param Keyword 关键词内容
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 自定义库名 
     * @return LibName 自定义库名
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 自定义库名
     * @param LibName 自定义库名
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 位置信息 
     * @return Positions 位置信息
     */
    public TextPosition [] getPositions() {
        return this.Positions;
    }

    /**
     * Set 位置信息
     * @param Positions 位置信息
     */
    public void setPositions(TextPosition [] Positions) {
        this.Positions = Positions;
    }

    public OcrHitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrHitInfo(OcrHitInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Positions != null) {
            this.Positions = new TextPosition[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new TextPosition(source.Positions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

