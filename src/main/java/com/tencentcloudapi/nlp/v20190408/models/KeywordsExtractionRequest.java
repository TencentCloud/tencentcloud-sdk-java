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

public class KeywordsExtractionRequest extends AbstractModel{

    /**
    * 待处理的文本（仅支持UTF-8格式，不超过10000字）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 指定关键词个数上限（默认值为5）
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get 待处理的文本（仅支持UTF-8格式，不超过10000字） 
     * @return Text 待处理的文本（仅支持UTF-8格式，不超过10000字）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待处理的文本（仅支持UTF-8格式，不超过10000字）
     * @param Text 待处理的文本（仅支持UTF-8格式，不超过10000字）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 指定关键词个数上限（默认值为5） 
     * @return Num 指定关键词个数上限（默认值为5）
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 指定关键词个数上限（默认值为5）
     * @param Num 指定关键词个数上限（默认值为5）
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

