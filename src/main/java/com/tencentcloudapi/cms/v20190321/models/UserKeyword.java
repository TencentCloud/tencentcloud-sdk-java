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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserKeyword extends AbstractModel{

    /**
    * 关键词内容：最多40个字符，并且符合词类型的规则
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 关键词类型，取值范围为："Normal","Polity","Porn","Ad","Illegal","Abuse","Terror","Spam"
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 关键词备注：最多100个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
    */
    @SerializedName("WordType")
    @Expose
    private String WordType;

    /**
     * Get 关键词内容：最多40个字符，并且符合词类型的规则 
     * @return Content 关键词内容：最多40个字符，并且符合词类型的规则
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词内容：最多40个字符，并且符合词类型的规则
     * @param Content 关键词内容：最多40个字符，并且符合词类型的规则
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 关键词类型，取值范围为："Normal","Polity","Porn","Ad","Illegal","Abuse","Terror","Spam" 
     * @return Label 关键词类型，取值范围为："Normal","Polity","Porn","Ad","Illegal","Abuse","Terror","Spam"
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 关键词类型，取值范围为："Normal","Polity","Porn","Ad","Illegal","Abuse","Terror","Spam"
     * @param Label 关键词类型，取值范围为："Normal","Polity","Porn","Ad","Illegal","Abuse","Terror","Spam"
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 关键词备注：最多100个字符。 
     * @return Remark 关键词备注：最多100个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 关键词备注：最多100个字符。
     * @param Remark 关键词备注：最多100个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord 
     * @return WordType 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
     */
    public String getWordType() {
        return this.WordType;
    }

    /**
     * Set 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
     * @param WordType 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
     */
    public void setWordType(String WordType) {
        this.WordType = WordType;
    }

    public UserKeyword() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserKeyword(UserKeyword source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.WordType != null) {
            this.WordType = new String(source.WordType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "WordType", this.WordType);

    }
}

