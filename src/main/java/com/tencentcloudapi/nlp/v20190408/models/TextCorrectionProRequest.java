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

public class TextCorrectionProRequest extends AbstractModel{

    /**
    * 待纠错的文本（仅支持UTF-8格式，不超过128字符）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 待纠错的文本（仅支持UTF-8格式，不超过128字符） 
     * @return Text 待纠错的文本（仅支持UTF-8格式，不超过128字符）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待纠错的文本（仅支持UTF-8格式，不超过128字符）
     * @param Text 待纠错的文本（仅支持UTF-8格式，不超过128字符）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public TextCorrectionProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextCorrectionProRequest(TextCorrectionProRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

