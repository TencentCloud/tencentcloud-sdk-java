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

public class KeywordsLibInfo extends AbstractModel{

    /**
    * 关键词库ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 关键词库描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 关键词库创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审核建议(Review/Block)
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 匹配模式(ExactMatch/FuzzyMatch)
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 关联策略BizType列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizTypes")
    @Expose
    private String [] BizTypes;

    /**
     * Get 关键词库ID 
     * @return ID 关键词库ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 关键词库ID
     * @param ID 关键词库ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibName 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibName 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 关键词库描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe 关键词库描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 关键词库描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe 关键词库描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 关键词库创建时间 
     * @return CreateTime 关键词库创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 关键词库创建时间
     * @param CreateTime 关键词库创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审核建议(Review/Block) 
     * @return Suggestion 审核建议(Review/Block)
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 审核建议(Review/Block)
     * @param Suggestion 审核建议(Review/Block)
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 匹配模式(ExactMatch/FuzzyMatch) 
     * @return MatchType 匹配模式(ExactMatch/FuzzyMatch)
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 匹配模式(ExactMatch/FuzzyMatch)
     * @param MatchType 匹配模式(ExactMatch/FuzzyMatch)
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 关联策略BizType列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizTypes 关联策略BizType列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBizTypes() {
        return this.BizTypes;
    }

    /**
     * Set 关联策略BizType列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizTypes 关联策略BizType列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizTypes(String [] BizTypes) {
        this.BizTypes = BizTypes;
    }

    public KeywordsLibInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeywordsLibInfo(KeywordsLibInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.BizTypes != null) {
            this.BizTypes = new String[source.BizTypes.length];
            for (int i = 0; i < source.BizTypes.length; i++) {
                this.BizTypes[i] = new String(source.BizTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamArraySimple(map, prefix + "BizTypes.", this.BizTypes);

    }
}

