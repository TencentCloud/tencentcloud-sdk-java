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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRule extends AbstractModel {

    /**
    * 触发规则类型，枚举值。一共3个值，Cron：定时触发，Repeat：周期触发，WorkFlow：工作流触发
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Cron类型规则，cron表达式。
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
     * Get 触发规则类型，枚举值。一共3个值，Cron：定时触发，Repeat：周期触发，WorkFlow：工作流触发 
     * @return RuleType 触发规则类型，枚举值。一共3个值，Cron：定时触发，Repeat：周期触发，WorkFlow：工作流触发
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 触发规则类型，枚举值。一共3个值，Cron：定时触发，Repeat：周期触发，WorkFlow：工作流触发
     * @param RuleType 触发规则类型，枚举值。一共3个值，Cron：定时触发，Repeat：周期触发，WorkFlow：工作流触发
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Cron类型规则，cron表达式。 
     * @return Expression Cron类型规则，cron表达式。
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set Cron类型规则，cron表达式。
     * @param Expression Cron类型规则，cron表达式。
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

    public TaskRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskRule(TaskRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
        if (source.RepeatInterval != null) {
            this.RepeatInterval = new Long(source.RepeatInterval);
        }
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

