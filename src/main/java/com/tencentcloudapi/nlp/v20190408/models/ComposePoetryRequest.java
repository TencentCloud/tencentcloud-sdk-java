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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposePoetryRequest extends AbstractModel{

    /**
    * 生成诗词的关键词。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 生成诗词的类型。0：藏头或藏身；1：藏头；2：藏身。默认为0。
    */
    @SerializedName("PoetryType")
    @Expose
    private Long PoetryType;

    /**
    * 诗的体裁。0：五言律诗或七言律诗；5：五言律诗；7：七言律诗。默认为0。
    */
    @SerializedName("Genre")
    @Expose
    private Long Genre;

    /**
     * Get 生成诗词的关键词。 
     * @return Text 生成诗词的关键词。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 生成诗词的关键词。
     * @param Text 生成诗词的关键词。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 生成诗词的类型。0：藏头或藏身；1：藏头；2：藏身。默认为0。 
     * @return PoetryType 生成诗词的类型。0：藏头或藏身；1：藏头；2：藏身。默认为0。
     */
    public Long getPoetryType() {
        return this.PoetryType;
    }

    /**
     * Set 生成诗词的类型。0：藏头或藏身；1：藏头；2：藏身。默认为0。
     * @param PoetryType 生成诗词的类型。0：藏头或藏身；1：藏头；2：藏身。默认为0。
     */
    public void setPoetryType(Long PoetryType) {
        this.PoetryType = PoetryType;
    }

    /**
     * Get 诗的体裁。0：五言律诗或七言律诗；5：五言律诗；7：七言律诗。默认为0。 
     * @return Genre 诗的体裁。0：五言律诗或七言律诗；5：五言律诗；7：七言律诗。默认为0。
     */
    public Long getGenre() {
        return this.Genre;
    }

    /**
     * Set 诗的体裁。0：五言律诗或七言律诗；5：五言律诗；7：七言律诗。默认为0。
     * @param Genre 诗的体裁。0：五言律诗或七言律诗；5：五言律诗；7：七言律诗。默认为0。
     */
    public void setGenre(Long Genre) {
        this.Genre = Genre;
    }

    public ComposePoetryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposePoetryRequest(ComposePoetryRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.PoetryType != null) {
            this.PoetryType = new Long(source.PoetryType);
        }
        if (source.Genre != null) {
            this.Genre = new Long(source.Genre);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "PoetryType", this.PoetryType);
        this.setParamSimple(map, prefix + "Genre", this.Genre);

    }
}

