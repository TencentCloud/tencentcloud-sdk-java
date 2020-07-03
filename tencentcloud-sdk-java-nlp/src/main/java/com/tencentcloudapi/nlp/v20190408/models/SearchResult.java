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

public class SearchResult extends AbstractModel{

    /**
    * 0表示词条不存在，1表示存在。
    */
    @SerializedName("IsExist")
    @Expose
    private Long IsExist;

    /**
    * 匹配到的词条文本。
    */
    @SerializedName("MatchText")
    @Expose
    private String MatchText;

    /**
    * 被搜索的词条文本。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 词条的词性。
    */
    @SerializedName("Pos")
    @Expose
    private String Pos;

    /**
     * Get 0表示词条不存在，1表示存在。 
     * @return IsExist 0表示词条不存在，1表示存在。
     */
    public Long getIsExist() {
        return this.IsExist;
    }

    /**
     * Set 0表示词条不存在，1表示存在。
     * @param IsExist 0表示词条不存在，1表示存在。
     */
    public void setIsExist(Long IsExist) {
        this.IsExist = IsExist;
    }

    /**
     * Get 匹配到的词条文本。 
     * @return MatchText 匹配到的词条文本。
     */
    public String getMatchText() {
        return this.MatchText;
    }

    /**
     * Set 匹配到的词条文本。
     * @param MatchText 匹配到的词条文本。
     */
    public void setMatchText(String MatchText) {
        this.MatchText = MatchText;
    }

    /**
     * Get 被搜索的词条文本。 
     * @return Text 被搜索的词条文本。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 被搜索的词条文本。
     * @param Text 被搜索的词条文本。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 词条的词性。 
     * @return Pos 词条的词性。
     */
    public String getPos() {
        return this.Pos;
    }

    /**
     * Set 词条的词性。
     * @param Pos 词条的词性。
     */
    public void setPos(String Pos) {
        this.Pos = Pos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsExist", this.IsExist);
        this.setParamSimple(map, prefix + "MatchText", this.MatchText);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Pos", this.Pos);

    }
}

