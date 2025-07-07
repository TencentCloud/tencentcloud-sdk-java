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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Reference extends AbstractModel {

    /**
    * 翻译文本类型，枚举"sentence"表示句子, "term"表示术语
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 原文
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 译文
    */
    @SerializedName("Translation")
    @Expose
    private String Translation;

    /**
     * Get 翻译文本类型，枚举"sentence"表示句子, "term"表示术语 
     * @return Type 翻译文本类型，枚举"sentence"表示句子, "term"表示术语
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 翻译文本类型，枚举"sentence"表示句子, "term"表示术语
     * @param Type 翻译文本类型，枚举"sentence"表示句子, "term"表示术语
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 原文 
     * @return Text 原文
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 原文
     * @param Text 原文
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 译文 
     * @return Translation 译文
     */
    public String getTranslation() {
        return this.Translation;
    }

    /**
     * Set 译文
     * @param Translation 译文
     */
    public void setTranslation(String Translation) {
        this.Translation = Translation;
    }

    public Reference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Reference(Reference source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Translation != null) {
            this.Translation = new String(source.Translation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Translation", this.Translation);

    }
}

