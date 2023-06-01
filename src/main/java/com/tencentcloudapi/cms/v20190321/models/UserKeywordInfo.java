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

public class UserKeywordInfo extends AbstractModel{

    /**
    * 关键词条ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 关键词内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 关键词标签；取值范围为："Normal","Polity","Porn","Sexy","Ad","Illegal","Abuse","Terror","Spam","Moan"
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordType")
    @Expose
    private String WordType;

    /**
     * Get 关键词条ID 
     * @return ID 关键词条ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 关键词条ID
     * @param ID 关键词条ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 关键词内容 
     * @return Content 关键词内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词内容
     * @param Content 关键词内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 关键词标签；取值范围为："Normal","Polity","Porn","Sexy","Ad","Illegal","Abuse","Terror","Spam","Moan" 
     * @return Label 关键词标签；取值范围为："Normal","Polity","Porn","Sexy","Ad","Illegal","Abuse","Terror","Spam","Moan"
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 关键词标签；取值范围为："Normal","Polity","Porn","Sexy","Ad","Illegal","Abuse","Terror","Spam","Moan"
     * @param Label 关键词标签；取值范围为："Normal","Polity","Porn","Sexy","Ad","Illegal","Abuse","Terror","Spam","Moan"
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordType 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWordType() {
        return this.WordType;
    }

    /**
     * Set 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordType 词类型：Default,Pinyin,English,CompoundWord,ExclusionWord,AffixWord
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordType(String WordType) {
        this.WordType = WordType;
    }

    public UserKeywordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserKeywordInfo(UserKeywordInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "WordType", this.WordType);

    }
}

