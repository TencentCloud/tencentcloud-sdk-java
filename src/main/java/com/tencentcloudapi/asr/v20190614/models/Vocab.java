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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vocab extends AbstractModel {

    /**
    * 热词表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 热词表描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 热词表ID
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * 词权重列表
    */
    @SerializedName("WordWeights")
    @Expose
    private HotWord [] WordWeights;

    /**
    * 词表创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 词表更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInfos")
    @Expose
    private String [] TagInfos;

    /**
     * Get 热词表名称 
     * @return Name 热词表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词表名称
     * @param Name 热词表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 热词表描述 
     * @return Description 热词表描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 热词表描述
     * @param Description 热词表描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 热词表ID 
     * @return VocabId 热词表ID
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set 热词表ID
     * @param VocabId 热词表ID
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get 词权重列表 
     * @return WordWeights 词权重列表
     */
    public HotWord [] getWordWeights() {
        return this.WordWeights;
    }

    /**
     * Set 词权重列表
     * @param WordWeights 词权重列表
     */
    public void setWordWeights(HotWord [] WordWeights) {
        this.WordWeights = WordWeights;
    }

    /**
     * Get 词表创建时间 
     * @return CreateTime 词表创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 词表创建时间
     * @param CreateTime 词表创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 词表更新时间 
     * @return UpdateTime 词表更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 词表更新时间
     * @param UpdateTime 词表更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态 
     * @return State 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
     * @param State 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInfos 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInfos 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInfos(String [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    public Vocab() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vocab(Vocab source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VocabId != null) {
            this.VocabId = new String(source.VocabId);
        }
        if (source.WordWeights != null) {
            this.WordWeights = new HotWord[source.WordWeights.length];
            for (int i = 0; i < source.WordWeights.length; i++) {
                this.WordWeights[i] = new HotWord(source.WordWeights[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new String[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new String(source.TagInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VocabId", this.VocabId);
        this.setParamArrayObj(map, prefix + "WordWeights.", this.WordWeights);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "TagInfos.", this.TagInfos);

    }
}

