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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditRuleTemplateInfo extends AbstractModel{

    /**
    * 规则模版ID。
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private String RuleTemplateId;

    /**
    * 规则模版名称。
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * 规则模版的过滤条件
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * 规则模版描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则模版创建时间。
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
     * Get 规则模版ID。 
     * @return RuleTemplateId 规则模版ID。
     */
    public String getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 规则模版ID。
     * @param RuleTemplateId 规则模版ID。
     */
    public void setRuleTemplateId(String RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则模版名称。 
     * @return RuleTemplateName 规则模版名称。
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set 规则模版名称。
     * @param RuleTemplateName 规则模版名称。
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get 规则模版的过滤条件 
     * @return RuleFilters 规则模版的过滤条件
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 规则模版的过滤条件
     * @param RuleFilters 规则模版的过滤条件
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get 规则模版描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则模版描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则模版描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则模版描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则模版创建时间。 
     * @return CreateAt 规则模版创建时间。
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 规则模版创建时间。
     * @param CreateAt 规则模版创建时间。
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    public AuditRuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditRuleTemplateInfo(AuditRuleTemplateInfo source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new String(source.RuleTemplateId);
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.RuleFilters != null) {
            this.RuleFilters = new RuleFilters[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new RuleFilters(source.RuleFilters[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);

    }
}

