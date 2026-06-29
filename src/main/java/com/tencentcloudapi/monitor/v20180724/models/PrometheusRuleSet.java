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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusRuleSet extends AbstractModel {

    /**
    * <p>规则 ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则状态码</p>
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * <p>规则类别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>规则标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * <p>规则注释列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private PrometheusRuleKV [] Annotations;

    /**
    * <p>规则表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * <p>规则报警持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>报警接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * <p>规则运行健康状态，取值如下：</p><li>unknown 未知状态</li><li>pending 加载中</li><li>ok 运行正常</li><li>err 运行错误</li>
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * <p>规则创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>规则更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>规则 ID</p> 
     * @return RuleId <p>规则 ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则 ID</p>
     * @param RuleId <p>规则 ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则状态码</p> 
     * @return RuleState <p>规则状态码</p>
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set <p>规则状态码</p>
     * @param RuleState <p>规则状态码</p>
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get <p>规则类别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>规则类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>规则类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>规则类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>规则标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>规则标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>规则标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>规则标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>规则注释列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations <p>规则注释列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set <p>规则注释列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations <p>规则注释列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(PrometheusRuleKV [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get <p>规则表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expr <p>规则表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set <p>规则表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expr <p>规则表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get <p>规则报警持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration <p>规则报警持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>规则报警持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration <p>规则报警持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>报警接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Receivers <p>报警接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set <p>报警接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Receivers <p>报警接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get <p>规则运行健康状态，取值如下：</p><li>unknown 未知状态</li><li>pending 加载中</li><li>ok 运行正常</li><li>err 运行错误</li> 
     * @return Health <p>规则运行健康状态，取值如下：</p><li>unknown 未知状态</li><li>pending 加载中</li><li>ok 运行正常</li><li>err 运行错误</li>
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set <p>规则运行健康状态，取值如下：</p><li>unknown 未知状态</li><li>pending 加载中</li><li>ok 运行正常</li><li>err 运行错误</li>
     * @param Health <p>规则运行健康状态，取值如下：</p><li>unknown 未知状态</li><li>pending 加载中</li><li>ok 运行正常</li><li>err 运行错误</li>
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get <p>规则创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>规则创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>规则创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>规则创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>规则更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>规则更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>规则更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>规则更新时间</p>
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

