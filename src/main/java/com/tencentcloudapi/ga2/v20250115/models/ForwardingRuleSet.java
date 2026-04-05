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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardingRuleSet extends AbstractModel {

    /**
    * 七层转发规则条件信息。
    */
    @SerializedName("RuleCondition")
    @Expose
    private RuleCondition [] RuleCondition;

    /**
    * 七层转发规则行为信息。
    */
    @SerializedName("RuleAction")
    @Expose
    private RuleAction [] RuleAction;

    /**
    * 是否开启回源Sni。
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * 回源Sni。
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * 回源Herder信息。
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * 回源Host。
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 七层转发策略ID。
    */
    @SerializedName("ForwardingPolicyId")
    @Expose
    private String ForwardingPolicyId;

    /**
    * 七层转发规则ID。
    */
    @SerializedName("ForwardingRuleId")
    @Expose
    private String ForwardingRuleId;

    /**
     * Get 七层转发规则条件信息。 
     * @return RuleCondition 七层转发规则条件信息。
     */
    public RuleCondition [] getRuleCondition() {
        return this.RuleCondition;
    }

    /**
     * Set 七层转发规则条件信息。
     * @param RuleCondition 七层转发规则条件信息。
     */
    public void setRuleCondition(RuleCondition [] RuleCondition) {
        this.RuleCondition = RuleCondition;
    }

    /**
     * Get 七层转发规则行为信息。 
     * @return RuleAction 七层转发规则行为信息。
     */
    public RuleAction [] getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 七层转发规则行为信息。
     * @param RuleAction 七层转发规则行为信息。
     */
    public void setRuleAction(RuleAction [] RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 是否开启回源Sni。 
     * @return EnableOriginSni 是否开启回源Sni。
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set 是否开启回源Sni。
     * @param EnableOriginSni 是否开启回源Sni。
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get 回源Sni。 
     * @return OriginSni 回源Sni。
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set 回源Sni。
     * @param OriginSni 回源Sni。
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get 回源Herder信息。 
     * @return OriginHeaders 回源Herder信息。
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set 回源Herder信息。
     * @param OriginHeaders 回源Herder信息。
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get 回源Host。 
     * @return OriginHost 回源Host。
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set 回源Host。
     * @param OriginHost 回源Host。
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 七层转发策略ID。 
     * @return ForwardingPolicyId 七层转发策略ID。
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set 七层转发策略ID。
     * @param ForwardingPolicyId 七层转发策略ID。
     */
    public void setForwardingPolicyId(String ForwardingPolicyId) {
        this.ForwardingPolicyId = ForwardingPolicyId;
    }

    /**
     * Get 七层转发规则ID。 
     * @return ForwardingRuleId 七层转发规则ID。
     */
    public String getForwardingRuleId() {
        return this.ForwardingRuleId;
    }

    /**
     * Set 七层转发规则ID。
     * @param ForwardingRuleId 七层转发规则ID。
     */
    public void setForwardingRuleId(String ForwardingRuleId) {
        this.ForwardingRuleId = ForwardingRuleId;
    }

    public ForwardingRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardingRuleSet(ForwardingRuleSet source) {
        if (source.RuleCondition != null) {
            this.RuleCondition = new RuleCondition[source.RuleCondition.length];
            for (int i = 0; i < source.RuleCondition.length; i++) {
                this.RuleCondition[i] = new RuleCondition(source.RuleCondition[i]);
            }
        }
        if (source.RuleAction != null) {
            this.RuleAction = new RuleAction[source.RuleAction.length];
            for (int i = 0; i < source.RuleAction.length; i++) {
                this.RuleAction[i] = new RuleAction(source.RuleAction[i]);
            }
        }
        if (source.EnableOriginSni != null) {
            this.EnableOriginSni = new Boolean(source.EnableOriginSni);
        }
        if (source.OriginSni != null) {
            this.OriginSni = new String(source.OriginSni);
        }
        if (source.OriginHeaders != null) {
            this.OriginHeaders = new OriginHeader[source.OriginHeaders.length];
            for (int i = 0; i < source.OriginHeaders.length; i++) {
                this.OriginHeaders[i] = new OriginHeader(source.OriginHeaders[i]);
            }
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ForwardingPolicyId != null) {
            this.ForwardingPolicyId = new String(source.ForwardingPolicyId);
        }
        if (source.ForwardingRuleId != null) {
            this.ForwardingRuleId = new String(source.ForwardingRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleCondition.", this.RuleCondition);
        this.setParamArrayObj(map, prefix + "RuleAction.", this.RuleAction);
        this.setParamSimple(map, prefix + "EnableOriginSni", this.EnableOriginSni);
        this.setParamSimple(map, prefix + "OriginSni", this.OriginSni);
        this.setParamArrayObj(map, prefix + "OriginHeaders.", this.OriginHeaders);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ForwardingPolicyId", this.ForwardingPolicyId);
        this.setParamSimple(map, prefix + "ForwardingRuleId", this.ForwardingRuleId);

    }
}

