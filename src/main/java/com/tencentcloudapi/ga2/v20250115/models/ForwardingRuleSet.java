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
    * <p>七层转发规则条件信息。</p>
    */
    @SerializedName("RuleCondition")
    @Expose
    private RuleCondition [] RuleCondition;

    /**
    * <p>七层转发规则行为信息。</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private RuleAction [] RuleAction;

    /**
    * <p>是否开启回源Sni。</p>
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * <p>回源Sni。</p>
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * <p>回源Herder信息。</p>
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * <p>回源Host。</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>监听器ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>七层转发策略ID。</p>
    */
    @SerializedName("ForwardingPolicyId")
    @Expose
    private String ForwardingPolicyId;

    /**
    * <p>七层转发规则ID。</p>
    */
    @SerializedName("ForwardingRuleId")
    @Expose
    private String ForwardingRuleId;

    /**
    * <p>源站响应头</p>
    */
    @SerializedName("HideResponseHeaders")
    @Expose
    private HideResponseHeaders [] HideResponseHeaders;

    /**
    * <p>删除源站响应头</p>
    */
    @SerializedName("ResponseHeaders")
    @Expose
    private ResponseHeaders [] ResponseHeaders;

    /**
     * Get <p>七层转发规则条件信息。</p> 
     * @return RuleCondition <p>七层转发规则条件信息。</p>
     */
    public RuleCondition [] getRuleCondition() {
        return this.RuleCondition;
    }

    /**
     * Set <p>七层转发规则条件信息。</p>
     * @param RuleCondition <p>七层转发规则条件信息。</p>
     */
    public void setRuleCondition(RuleCondition [] RuleCondition) {
        this.RuleCondition = RuleCondition;
    }

    /**
     * Get <p>七层转发规则行为信息。</p> 
     * @return RuleAction <p>七层转发规则行为信息。</p>
     */
    public RuleAction [] getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>七层转发规则行为信息。</p>
     * @param RuleAction <p>七层转发规则行为信息。</p>
     */
    public void setRuleAction(RuleAction [] RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>是否开启回源Sni。</p> 
     * @return EnableOriginSni <p>是否开启回源Sni。</p>
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set <p>是否开启回源Sni。</p>
     * @param EnableOriginSni <p>是否开启回源Sni。</p>
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get <p>回源Sni。</p> 
     * @return OriginSni <p>回源Sni。</p>
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set <p>回源Sni。</p>
     * @param OriginSni <p>回源Sni。</p>
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get <p>回源Herder信息。</p> 
     * @return OriginHeaders <p>回源Herder信息。</p>
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set <p>回源Herder信息。</p>
     * @param OriginHeaders <p>回源Herder信息。</p>
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get <p>回源Host。</p> 
     * @return OriginHost <p>回源Host。</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>回源Host。</p>
     * @param OriginHost <p>回源Host。</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>监听器ID。</p> 
     * @return ListenerId <p>监听器ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器ID。</p>
     * @param ListenerId <p>监听器ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>七层转发策略ID。</p> 
     * @return ForwardingPolicyId <p>七层转发策略ID。</p>
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set <p>七层转发策略ID。</p>
     * @param ForwardingPolicyId <p>七层转发策略ID。</p>
     */
    public void setForwardingPolicyId(String ForwardingPolicyId) {
        this.ForwardingPolicyId = ForwardingPolicyId;
    }

    /**
     * Get <p>七层转发规则ID。</p> 
     * @return ForwardingRuleId <p>七层转发规则ID。</p>
     */
    public String getForwardingRuleId() {
        return this.ForwardingRuleId;
    }

    /**
     * Set <p>七层转发规则ID。</p>
     * @param ForwardingRuleId <p>七层转发规则ID。</p>
     */
    public void setForwardingRuleId(String ForwardingRuleId) {
        this.ForwardingRuleId = ForwardingRuleId;
    }

    /**
     * Get <p>源站响应头</p> 
     * @return HideResponseHeaders <p>源站响应头</p>
     */
    public HideResponseHeaders [] getHideResponseHeaders() {
        return this.HideResponseHeaders;
    }

    /**
     * Set <p>源站响应头</p>
     * @param HideResponseHeaders <p>源站响应头</p>
     */
    public void setHideResponseHeaders(HideResponseHeaders [] HideResponseHeaders) {
        this.HideResponseHeaders = HideResponseHeaders;
    }

    /**
     * Get <p>删除源站响应头</p> 
     * @return ResponseHeaders <p>删除源站响应头</p>
     */
    public ResponseHeaders [] getResponseHeaders() {
        return this.ResponseHeaders;
    }

    /**
     * Set <p>删除源站响应头</p>
     * @param ResponseHeaders <p>删除源站响应头</p>
     */
    public void setResponseHeaders(ResponseHeaders [] ResponseHeaders) {
        this.ResponseHeaders = ResponseHeaders;
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
        if (source.HideResponseHeaders != null) {
            this.HideResponseHeaders = new HideResponseHeaders[source.HideResponseHeaders.length];
            for (int i = 0; i < source.HideResponseHeaders.length; i++) {
                this.HideResponseHeaders[i] = new HideResponseHeaders(source.HideResponseHeaders[i]);
            }
        }
        if (source.ResponseHeaders != null) {
            this.ResponseHeaders = new ResponseHeaders[source.ResponseHeaders.length];
            for (int i = 0; i < source.ResponseHeaders.length; i++) {
                this.ResponseHeaders[i] = new ResponseHeaders(source.ResponseHeaders[i]);
            }
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
        this.setParamArrayObj(map, prefix + "HideResponseHeaders.", this.HideResponseHeaders);
        this.setParamArrayObj(map, prefix + "ResponseHeaders.", this.ResponseHeaders);

    }
}

