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

public class UpdateAlertRuleRequest extends AbstractModel{

    /**
    * Prometheus 报警规则 ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * 报警规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 报警规则表达式
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * 报警规则持续时间
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 报警规则接收组列表
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 报警规则标签列表
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * 报警规则注释列表。

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
     * Get Prometheus 报警规则 ID 
     * @return RuleId Prometheus 报警规则 ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Prometheus 报警规则 ID
     * @param RuleId Prometheus 报警规则 ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

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
     * Get 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。 
     * @return RuleState 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
     * @param RuleState 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get 报警规则名称 
     * @return RuleName 报警规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 报警规则名称
     * @param RuleName 报警规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 报警规则表达式 
     * @return Expr 报警规则表达式
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set 报警规则表达式
     * @param Expr 报警规则表达式
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get 报警规则持续时间 
     * @return Duration 报警规则持续时间
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 报警规则持续时间
     * @param Duration 报警规则持续时间
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 报警规则接收组列表 
     * @return Receivers 报警规则接收组列表
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 报警规则接收组列表
     * @param Receivers 报警规则接收组列表
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 报警规则标签列表 
     * @return Labels 报警规则标签列表
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 报警规则标签列表
     * @param Labels 报警规则标签列表
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 报警规则注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。 
     * @return Annotations 报警规则注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 报警规则注释列表。

告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description。
     * @param Annotations 报警规则注释列表。

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

    public UpdateAlertRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAlertRuleRequest(UpdateAlertRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Expr", this.Expr);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

