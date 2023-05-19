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

public class TextEmbellishRequest extends AbstractModel{

    /**
    * 待润色的文本。中文文本长度需<=50字符；英文文本长度需<=30个单词。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 待润色文本的语言类型，支持语言如下：
zh：中文
en：英文
    */
    @SerializedName("SourceLang")
    @Expose
    private String SourceLang;

    /**
    * 返回润色结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 控制润色类型，类型如下：
both：同时返回改写和扩写
expansion：扩写
rewriting：改写
m2a：从现代文改写为古文
a2m：从古文改写为现代文
默认为both。
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
     * Get 待润色的文本。中文文本长度需<=50字符；英文文本长度需<=30个单词。 
     * @return Text 待润色的文本。中文文本长度需<=50字符；英文文本长度需<=30个单词。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待润色的文本。中文文本长度需<=50字符；英文文本长度需<=30个单词。
     * @param Text 待润色的文本。中文文本长度需<=50字符；英文文本长度需<=30个单词。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 待润色文本的语言类型，支持语言如下：
zh：中文
en：英文 
     * @return SourceLang 待润色文本的语言类型，支持语言如下：
zh：中文
en：英文
     */
    public String getSourceLang() {
        return this.SourceLang;
    }

    /**
     * Set 待润色文本的语言类型，支持语言如下：
zh：中文
en：英文
     * @param SourceLang 待润色文本的语言类型，支持语言如下：
zh：中文
en：英文
     */
    public void setSourceLang(String SourceLang) {
        this.SourceLang = SourceLang;
    }

    /**
     * Get 返回润色结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数） 
     * @return Number 返回润色结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 返回润色结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     * @param Number 返回润色结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 控制润色类型，类型如下：
both：同时返回改写和扩写
expansion：扩写
rewriting：改写
m2a：从现代文改写为古文
a2m：从古文改写为现代文
默认为both。 
     * @return Style 控制润色类型，类型如下：
both：同时返回改写和扩写
expansion：扩写
rewriting：改写
m2a：从现代文改写为古文
a2m：从古文改写为现代文
默认为both。
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 控制润色类型，类型如下：
both：同时返回改写和扩写
expansion：扩写
rewriting：改写
m2a：从现代文改写为古文
a2m：从古文改写为现代文
默认为both。
     * @param Style 控制润色类型，类型如下：
both：同时返回改写和扩写
expansion：扩写
rewriting：改写
m2a：从现代文改写为古文
a2m：从古文改写为现代文
默认为both。
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public TextEmbellishRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextEmbellishRequest(TextEmbellishRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SourceLang != null) {
            this.SourceLang = new String(source.SourceLang);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SourceLang", this.SourceLang);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

