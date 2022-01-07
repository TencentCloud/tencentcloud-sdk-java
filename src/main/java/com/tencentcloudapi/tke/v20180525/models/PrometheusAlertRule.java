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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertRule extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * prometheus语句
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 额外标签
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 告警发送模板
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * 持续时间
    */
    @SerializedName("For")
    @Expose
    private String For;

    /**
    * 该条规则的描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 参考prometheus rule中的annotations
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private Label [] Annotations;

    /**
    * 告警规则状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get prometheus语句 
     * @return Rule prometheus语句
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set prometheus语句
     * @param Rule prometheus语句
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 额外标签 
     * @return Labels 额外标签
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 额外标签
     * @param Labels 额外标签
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 告警发送模板 
     * @return Template 告警发送模板
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 告警发送模板
     * @param Template 告警发送模板
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get 持续时间 
     * @return For 持续时间
     */
    public String getFor() {
        return this.For;
    }

    /**
     * Set 持续时间
     * @param For 持续时间
     */
    public void setFor(String For) {
        this.For = For;
    }

    /**
     * Get 该条规则的描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe 该条规则的描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 该条规则的描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe 该条规则的描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 参考prometheus rule中的annotations
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations 参考prometheus rule中的annotations
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 参考prometheus rule中的annotations
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations 参考prometheus rule中的annotations
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(Label [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 告警规则状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleState 告警规则状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 告警规则状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleState 告警规则状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    public PrometheusAlertRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertRule(PrometheusAlertRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.For != null) {
            this.For = new String(source.For);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Annotations != null) {
            this.Annotations = new Label[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new Label(source.Annotations[i]);
            }
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "For", this.For);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);

    }
}

