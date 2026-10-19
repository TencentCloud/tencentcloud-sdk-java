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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMKeywordLibrary extends AbstractModel {

    /**
    * 词库名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 词库描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 词库类型，custom 或 builtin
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 关键词列表
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 词库规则 id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 被引用的规则 id 列表
    */
    @SerializedName("ReferencedRules")
    @Expose
    private String [] ReferencedRules;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 词库类别：black-黑库(默认)，white-白库；空值按黑库处理
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get 词库名 
     * @return Name 词库名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 词库名
     * @param Name 词库名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 词库描述 
     * @return Description 词库描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 词库描述
     * @param Description 词库描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 词库类型，custom 或 builtin 
     * @return Type 词库类型，custom 或 builtin
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 词库类型，custom 或 builtin
     * @param Type 词库类型，custom 或 builtin
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 关键词列表 
     * @return Keywords 关键词列表
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词列表
     * @param Keywords 关键词列表
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 词库规则 id 
     * @return RuleId 词库规则 id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 词库规则 id
     * @param RuleId 词库规则 id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 被引用的规则 id 列表 
     * @return ReferencedRules 被引用的规则 id 列表
     */
    public String [] getReferencedRules() {
        return this.ReferencedRules;
    }

    /**
     * Set 被引用的规则 id 列表
     * @param ReferencedRules 被引用的规则 id 列表
     */
    public void setReferencedRules(String [] ReferencedRules) {
        this.ReferencedRules = ReferencedRules;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 词库类别：black-黑库(默认)，white-白库；空值按黑库处理 
     * @return Category 词库类别：black-黑库(默认)，white-白库；空值按黑库处理
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 词库类别：black-黑库(默认)，white-白库；空值按黑库处理
     * @param Category 词库类别：black-黑库(默认)，white-白库；空值按黑库处理
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public LLMKeywordLibrary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMKeywordLibrary(LLMKeywordLibrary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.ReferencedRules != null) {
            this.ReferencedRules = new String[source.ReferencedRules.length];
            for (int i = 0; i < source.ReferencedRules.length; i++) {
                this.ReferencedRules[i] = new String(source.ReferencedRules[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "ReferencedRules.", this.ReferencedRules);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

