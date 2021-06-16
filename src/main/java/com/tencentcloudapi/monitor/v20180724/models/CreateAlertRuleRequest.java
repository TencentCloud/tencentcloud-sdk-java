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

public class CreateAlertRuleRequest extends AbstractModel{

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则表达式
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * 告警通知模板 ID 列表
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * 规则报警持续时间
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 标签列表
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * 注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。
    */
    @SerializedName("Annotations")
    @Expose
    private PrometheusRuleKV [] Annotations;

    /**
    * 报警策略模板分类
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Prometheus 实例 ID 
     * @return InstanceId Prometheus 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID
     * @param InstanceId Prometheus 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 规则表达式 
     * @return Expr 规则表达式
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set 规则表达式
     * @param Expr 规则表达式
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get 告警通知模板 ID 列表 
     * @return Receivers 告警通知模板 ID 列表
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 告警通知模板 ID 列表
     * @param Receivers 告警通知模板 ID 列表
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li> 
     * @return RuleState 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     * @param RuleState 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get 规则报警持续时间 
     * @return Duration 规则报警持续时间
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 规则报警持续时间
     * @param Duration 规则报警持续时间
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 标签列表 
     * @return Labels 标签列表
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签列表
     * @param Labels 标签列表
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。 
     * @return Annotations 注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。
     * @param Annotations 注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。
     */
    public void setAnnotations(PrometheusRuleKV [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 报警策略模板分类 
     * @return Type 报警策略模板分类
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 报警策略模板分类
     * @param Type 报警策略模板分类
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateAlertRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertRuleRequest(CreateAlertRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Expr != null) {
            this.Expr = new String(source.Expr);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Expr", this.Expr);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

