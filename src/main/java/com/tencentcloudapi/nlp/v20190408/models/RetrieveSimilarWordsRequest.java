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

public class RetrieveSimilarWordsRequest extends AbstractModel{

    /**
    * 输入的词语。（仅支持UTF-8格式，不超过10字符）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 召回的相似词个数，取值范围为1-20。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get 输入的词语。（仅支持UTF-8格式，不超过10字符） 
     * @return Text 输入的词语。（仅支持UTF-8格式，不超过10字符）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 输入的词语。（仅支持UTF-8格式，不超过10字符）
     * @param Text 输入的词语。（仅支持UTF-8格式，不超过10字符）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 召回的相似词个数，取值范围为1-20。 
     * @return Number 召回的相似词个数，取值范围为1-20。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 召回的相似词个数，取值范围为1-20。
     * @param Number 召回的相似词个数，取值范围为1-20。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public RetrieveSimilarWordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrieveSimilarWordsRequest(RetrieveSimilarWordsRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

