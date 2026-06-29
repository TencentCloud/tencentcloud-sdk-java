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

public class PrometheusAlertRule extends AbstractModel {

    /**
    * <p>规则名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>prometheus语句</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>额外标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>告警发送模板</p>
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * <p>持续时间</p>
    */
    @SerializedName("For")
    @Expose
    private String For;

    /**
    * <p>该条规则的描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>参考prometheus rule中的annotations</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private Label [] Annotations;

    /**
    * <p>告警规则状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
     * Get <p>规则名称</p> 
     * @return Name <p>规则名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规则名称</p>
     * @param Name <p>规则名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>prometheus语句</p> 
     * @return Rule <p>prometheus语句</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>prometheus语句</p>
     * @param Rule <p>prometheus语句</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>额外标签</p> 
     * @return Labels <p>额外标签</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>额外标签</p>
     * @param Labels <p>额外标签</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>告警发送模板</p> 
     * @return Template <p>告警发送模板</p>
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>告警发送模板</p>
     * @param Template <p>告警发送模板</p>
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get <p>持续时间</p> 
     * @return For <p>持续时间</p>
     */
    public String getFor() {
        return this.For;
    }

    /**
     * Set <p>持续时间</p>
     * @param For <p>持续时间</p>
     */
    public void setFor(String For) {
        this.For = For;
    }

    /**
     * Get <p>该条规则的描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe <p>该条规则的描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>该条规则的描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe <p>该条规则的描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>参考prometheus rule中的annotations</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations <p>参考prometheus rule中的annotations</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set <p>参考prometheus rule中的annotations</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations <p>参考prometheus rule中的annotations</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(Label [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get <p>告警规则状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleState <p>告警规则状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set <p>告警规则状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleState <p>告警规则状态</p>
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

