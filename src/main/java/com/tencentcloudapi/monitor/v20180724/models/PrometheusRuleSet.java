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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusRuleSet extends AbstractModel{

    /**
    * 规则 ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则状态码
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * 规则类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * 规则注释列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private PrometheusRuleKV [] Annotations;

    /**
    * 规则表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * 规则报警持续时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 报警接收组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 规则运行健康状态，取值如下：
<li>unknown 未知状态</li>
<li>pending 加载中</li>
<li>ok 运行正常</li>
<li>err 运行错误</li>
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * 规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 规则 ID 
     * @return RuleId 规则 ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID
     * @param RuleId 规则 ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则状态码 
     * @return RuleState 规则状态码
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 规则状态码
     * @param RuleState 规则状态码
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get 规则类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 规则类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 规则类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 规则类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 规则标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 规则注释列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations 规则注释列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 规则注释列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations 规则注释列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(PrometheusRuleKV [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 规则表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expr 规则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set 规则表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expr 规则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get 规则报警持续时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 规则报警持续时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 规则报警持续时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 规则报警持续时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 报警接收组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Receivers 报警接收组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 报警接收组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Receivers 报警接收组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 规则运行健康状态，取值如下：
<li>unknown 未知状态</li>
<li>pending 加载中</li>
<li>ok 运行正常</li>
<li>err 运行错误</li> 
     * @return Health 规则运行健康状态，取值如下：
<li>unknown 未知状态</li>
<li>pending 加载中</li>
<li>ok 运行正常</li>
<li>err 运行错误</li>
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set 规则运行健康状态，取值如下：
<li>unknown 未知状态</li>
<li>pending 加载中</li>
<li>ok 运行正常</li>
<li>err 运行错误</li>
     * @param Health 规则运行健康状态，取值如下：
<li>unknown 未知状态</li>
<li>pending 加载中</li>
<li>ok 运行正常</li>
<li>err 运行错误</li>
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get 规则创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PrometheusRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusRuleSet(PrometheusRuleSet source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Labels != null) {
            this.Labels = new PrometheusRuleKV[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new PrometheusRuleKV(source.Labels[i]);
            }
        }
        if (source.Annotations != null) {
            this.Annotations = new PrometheusRuleKV[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new PrometheusRuleKV(source.Annotations[i]);
            }
        }
        if (source.Expr != null) {
            this.Expr = new String(source.Expr);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "Expr", this.Expr);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

