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

public class ModifyForwardingRuleRequest extends AbstractModel {

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
    * 策略ID。
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
    * 七层转发规则条件信息。
    */
    @SerializedName("RuleConditions")
    @Expose
    private RuleCondition [] RuleConditions;

    /**
    * 七层转发规则行为信息。
    */
    @SerializedName("RuleActions")
    @Expose
    private RuleAction [] RuleActions;

    /**
    * 回源Header信息。
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * 是否开启回源sni。
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * 回源sni。
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * 回源host。
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

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
     * Get 策略ID。 
     * @return ForwardingPolicyId 策略ID。
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set 策略ID。
     * @param ForwardingPolicyId 策略ID。
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

    /**
     * Get 七层转发规则条件信息。 
     * @return RuleConditions 七层转发规则条件信息。
     */
    public RuleCondition [] getRuleConditions() {
        return this.RuleConditions;
    }

    /**
     * Set 七层转发规则条件信息。
     * @param RuleConditions 七层转发规则条件信息。
     */
    public void setRuleConditions(RuleCondition [] RuleConditions) {
        this.RuleConditions = RuleConditions;
    }

    /**
     * Get 七层转发规则行为信息。 
     * @return RuleActions 七层转发规则行为信息。
     */
    public RuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set 七层转发规则行为信息。
     * @param RuleActions 七层转发规则行为信息。
     */
    public void setRuleActions(RuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get 回源Header信息。 
     * @return OriginHeaders 回源Header信息。
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set 回源Header信息。
     * @param OriginHeaders 回源Header信息。
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get 是否开启回源sni。 
     * @return EnableOriginSni 是否开启回源sni。
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set 是否开启回源sni。
     * @param EnableOriginSni 是否开启回源sni。
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get 回源sni。 
     * @return OriginSni 回源sni。
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set 回源sni。
     * @param OriginSni 回源sni。
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get 回源host。 
     * @return OriginHost 回源host。
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set 回源host。
     * @param OriginHost 回源host。
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    public ModifyForwardingRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyForwardingRuleRequest(ModifyForwardingRuleRequest source) {
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
        if (source.RuleConditions != null) {
            this.RuleConditions = new RuleCondition[source.RuleConditions.length];
            for (int i = 0; i < source.RuleConditions.length; i++) {
                this.RuleConditions[i] = new RuleCondition(source.RuleConditions[i]);
            }
        }
        if (source.RuleActions != null) {
            this.RuleActions = new RuleAction[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new RuleAction(source.RuleActions[i]);
            }
        }
        if (source.OriginHeaders != null) {
            this.OriginHeaders = new OriginHeader[source.OriginHeaders.length];
            for (int i = 0; i < source.OriginHeaders.length; i++) {
                this.OriginHeaders[i] = new OriginHeader(source.OriginHeaders[i]);
            }
        }
        if (source.EnableOriginSni != null) {
            this.EnableOriginSni = new Boolean(source.EnableOriginSni);
        }
        if (source.OriginSni != null) {
            this.OriginSni = new String(source.OriginSni);
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ForwardingPolicyId", this.ForwardingPolicyId);
        this.setParamSimple(map, prefix + "ForwardingRuleId", this.ForwardingRuleId);
        this.setParamArrayObj(map, prefix + "RuleConditions.", this.RuleConditions);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamArrayObj(map, prefix + "OriginHeaders.", this.OriginHeaders);
        this.setParamSimple(map, prefix + "EnableOriginSni", this.EnableOriginSni);
        this.setParamSimple(map, prefix + "OriginSni", this.OriginSni);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);

    }
}

