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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRule extends AbstractModel{

    /**
    * 触发规则类型, Cron/Repeat
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Cron类型规则，cron表达式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
    * 时间间隔， 单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepeatInterval")
    @Expose
    private Long RepeatInterval;

    /**
     * Get 触发规则类型, Cron/Repeat 
     * @return RuleType 触发规则类型, Cron/Repeat
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 触发规则类型, Cron/Repeat
     * @param RuleType 触发规则类型, Cron/Repeat
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Cron类型规则，cron表达式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expression Cron类型规则，cron表达式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set Cron类型规则，cron表达式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expression Cron类型规则，cron表达式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Get 时间间隔， 单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepeatInterval 时间间隔， 单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set 时间间隔， 单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepeatInterval 时间间隔， 单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepeatInterval(Long RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);

    }
}

