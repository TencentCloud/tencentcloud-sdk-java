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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicRule extends AbstractModel{

    /**
    * 规则名称。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则的SQL语句，如： SELECT * FROM 'pid/dname/event'，然后对其进行base64编码，得：U0VMRUNUICogRlJPTSAncGlkL2RuYW1lL2V2ZW50Jw==
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 行为的JSON字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * 是否禁用规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleDisabled")
    @Expose
    private Boolean RuleDisabled;

    /**
     * Get 规则名称。 
     * @return RuleName 规则名称。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称。
     * @param RuleName 规则名称。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则的SQL语句，如： SELECT * FROM 'pid/dname/event'，然后对其进行base64编码，得：U0VMRUNUICogRlJPTSAncGlkL2RuYW1lL2V2ZW50Jw== 
     * @return Sql 规则的SQL语句，如： SELECT * FROM 'pid/dname/event'，然后对其进行base64编码，得：U0VMRUNUICogRlJPTSAncGlkL2RuYW1lL2V2ZW50Jw==
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set 规则的SQL语句，如： SELECT * FROM 'pid/dname/event'，然后对其进行base64编码，得：U0VMRUNUICogRlJPTSAncGlkL2RuYW1lL2V2ZW50Jw==
     * @param Sql 规则的SQL语句，如： SELECT * FROM 'pid/dname/event'，然后对其进行base64编码，得：U0VMRUNUICogRlJPTSAncGlkL2RuYW1lL2V2ZW50Jw==
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 规则描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 行为的JSON字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions 行为的JSON字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set 行为的JSON字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions 行为的JSON字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 是否禁用规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleDisabled 是否禁用规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRuleDisabled() {
        return this.RuleDisabled;
    }

    /**
     * Set 是否禁用规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleDisabled 是否禁用规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleDisabled(Boolean RuleDisabled) {
        this.RuleDisabled = RuleDisabled;
    }

    public TopicRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicRule(TopicRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Actions != null) {
            this.Actions = new String(source.Actions);
        }
        if (source.RuleDisabled != null) {
            this.RuleDisabled = new Boolean(source.RuleDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "RuleDisabled", this.RuleDisabled);

    }
}

