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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImmutableTagRule extends AbstractModel{

    /**
    * 仓库匹配规则
    */
    @SerializedName("RepositoryPattern")
    @Expose
    private String RepositoryPattern;

    /**
    * Tag 匹配规则
    */
    @SerializedName("TagPattern")
    @Expose
    private String TagPattern;

    /**
    * repoMatches或repoExcludes
    */
    @SerializedName("RepositoryDecoration")
    @Expose
    private String RepositoryDecoration;

    /**
    * matches或excludes
    */
    @SerializedName("TagDecoration")
    @Expose
    private String TagDecoration;

    /**
    * 禁用规则
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 规则 Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 命名空间
    */
    @SerializedName("NsName")
    @Expose
    private String NsName;

    /**
     * Get 仓库匹配规则 
     * @return RepositoryPattern 仓库匹配规则
     */
    public String getRepositoryPattern() {
        return this.RepositoryPattern;
    }

    /**
     * Set 仓库匹配规则
     * @param RepositoryPattern 仓库匹配规则
     */
    public void setRepositoryPattern(String RepositoryPattern) {
        this.RepositoryPattern = RepositoryPattern;
    }

    /**
     * Get Tag 匹配规则 
     * @return TagPattern Tag 匹配规则
     */
    public String getTagPattern() {
        return this.TagPattern;
    }

    /**
     * Set Tag 匹配规则
     * @param TagPattern Tag 匹配规则
     */
    public void setTagPattern(String TagPattern) {
        this.TagPattern = TagPattern;
    }

    /**
     * Get repoMatches或repoExcludes 
     * @return RepositoryDecoration repoMatches或repoExcludes
     */
    public String getRepositoryDecoration() {
        return this.RepositoryDecoration;
    }

    /**
     * Set repoMatches或repoExcludes
     * @param RepositoryDecoration repoMatches或repoExcludes
     */
    public void setRepositoryDecoration(String RepositoryDecoration) {
        this.RepositoryDecoration = RepositoryDecoration;
    }

    /**
     * Get matches或excludes 
     * @return TagDecoration matches或excludes
     */
    public String getTagDecoration() {
        return this.TagDecoration;
    }

    /**
     * Set matches或excludes
     * @param TagDecoration matches或excludes
     */
    public void setTagDecoration(String TagDecoration) {
        this.TagDecoration = TagDecoration;
    }

    /**
     * Get 禁用规则 
     * @return Disabled 禁用规则
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 禁用规则
     * @param Disabled 禁用规则
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 规则 Id 
     * @return RuleId 规则 Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 Id
     * @param RuleId 规则 Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 命名空间 
     * @return NsName 命名空间
     */
    public String getNsName() {
        return this.NsName;
    }

    /**
     * Set 命名空间
     * @param NsName 命名空间
     */
    public void setNsName(String NsName) {
        this.NsName = NsName;
    }

    public ImmutableTagRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImmutableTagRule(ImmutableTagRule source) {
        if (source.RepositoryPattern != null) {
            this.RepositoryPattern = new String(source.RepositoryPattern);
        }
        if (source.TagPattern != null) {
            this.TagPattern = new String(source.TagPattern);
        }
        if (source.RepositoryDecoration != null) {
            this.RepositoryDecoration = new String(source.RepositoryDecoration);
        }
        if (source.TagDecoration != null) {
            this.TagDecoration = new String(source.TagDecoration);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.NsName != null) {
            this.NsName = new String(source.NsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryPattern", this.RepositoryPattern);
        this.setParamSimple(map, prefix + "TagPattern", this.TagPattern);
        this.setParamSimple(map, prefix + "RepositoryDecoration", this.RepositoryDecoration);
        this.setParamSimple(map, prefix + "TagDecoration", this.TagDecoration);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "NsName", this.NsName);

    }
}

