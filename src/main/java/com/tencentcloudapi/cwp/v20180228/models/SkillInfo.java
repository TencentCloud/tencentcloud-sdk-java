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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillInfo extends AbstractModel {

    /**
    * Skill名称
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * Skill 描述
    */
    @SerializedName("SkillDesc")
    @Expose
    private String SkillDesc;

    /**
    * Skill来源
    */
    @SerializedName("SkillSource")
    @Expose
    private String SkillSource;

    /**
    * Skill风险标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * skill风险描述
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * 证据链
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * 事件ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Skill名称 
     * @return SkillName Skill名称
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set Skill名称
     * @param SkillName Skill名称
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get Skill 描述 
     * @return SkillDesc Skill 描述
     */
    public String getSkillDesc() {
        return this.SkillDesc;
    }

    /**
     * Set Skill 描述
     * @param SkillDesc Skill 描述
     */
    public void setSkillDesc(String SkillDesc) {
        this.SkillDesc = SkillDesc;
    }

    /**
     * Get Skill来源 
     * @return SkillSource Skill来源
     */
    public String getSkillSource() {
        return this.SkillSource;
    }

    /**
     * Set Skill来源
     * @param SkillSource Skill来源
     */
    public void setSkillSource(String SkillSource) {
        this.SkillSource = SkillSource;
    }

    /**
     * Get Skill风险标签 
     * @return Tags Skill风险标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Skill风险标签
     * @param Tags Skill风险标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get skill风险描述 
     * @return RiskDesc skill风险描述
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set skill风险描述
     * @param RiskDesc skill风险描述
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get 证据链 
     * @return Evidence 证据链
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set 证据链
     * @param Evidence 证据链
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get 事件ID 
     * @return Id 事件ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件ID
     * @param Id 事件ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public SkillInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillInfo(SkillInfo source) {
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillDesc != null) {
            this.SkillDesc = new String(source.SkillDesc);
        }
        if (source.SkillSource != null) {
            this.SkillSource = new String(source.SkillSource);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.Evidence != null) {
            this.Evidence = new String(source.Evidence);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillDesc", this.SkillDesc);
        this.setParamSimple(map, prefix + "SkillSource", this.SkillSource);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "Evidence", this.Evidence);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

