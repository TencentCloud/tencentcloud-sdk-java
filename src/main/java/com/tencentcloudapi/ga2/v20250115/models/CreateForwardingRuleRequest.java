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

public class CreateForwardingRuleRequest extends AbstractModel {

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
    * <p>策略ID。</p>
    */
    @SerializedName("ForwardingPolicyId")
    @Expose
    private String ForwardingPolicyId;

    /**
    * <p>七层转发规则条件信息。</p>
    */
    @SerializedName("RuleConditions")
    @Expose
    private RuleCondition [] RuleConditions;

    /**
    * <p>七层转发规则行为信息。</p>
    */
    @SerializedName("RuleActions")
    @Expose
    private RuleAction [] RuleActions;

    /**
    * <p>回源Header信息。</p>
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * <p>是否开启回源sni。</p>
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * <p>回源sni。</p>
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * <p>回源host。</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>源站响应头</p>
    */
    @SerializedName("ResponseHeaders")
    @Expose
    private ResponseHeaders [] ResponseHeaders;

    /**
    * <p>删除源站响应头</p>
    */
    @SerializedName("HideResponseHeaders")
    @Expose
    private HideResponseHeaders [] HideResponseHeaders;

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
     * Get <p>策略ID。</p> 
     * @return ForwardingPolicyId <p>策略ID。</p>
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set <p>策略ID。</p>
     * @param ForwardingPolicyId <p>策略ID。</p>
     */
    public void setForwardingPolicyId(String ForwardingPolicyId) {
        this.ForwardingPolicyId = ForwardingPolicyId;
    }

    /**
     * Get <p>七层转发规则条件信息。</p> 
     * @return RuleConditions <p>七层转发规则条件信息。</p>
     */
    public RuleCondition [] getRuleConditions() {
        return this.RuleConditions;
    }

    /**
     * Set <p>七层转发规则条件信息。</p>
     * @param RuleConditions <p>七层转发规则条件信息。</p>
     */
    public void setRuleConditions(RuleCondition [] RuleConditions) {
        this.RuleConditions = RuleConditions;
    }

    /**
     * Get <p>七层转发规则行为信息。</p> 
     * @return RuleActions <p>七层转发规则行为信息。</p>
     */
    public RuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set <p>七层转发规则行为信息。</p>
     * @param RuleActions <p>七层转发规则行为信息。</p>
     */
    public void setRuleActions(RuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get <p>回源Header信息。</p> 
     * @return OriginHeaders <p>回源Header信息。</p>
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set <p>回源Header信息。</p>
     * @param OriginHeaders <p>回源Header信息。</p>
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get <p>是否开启回源sni。</p> 
     * @return EnableOriginSni <p>是否开启回源sni。</p>
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set <p>是否开启回源sni。</p>
     * @param EnableOriginSni <p>是否开启回源sni。</p>
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get <p>回源sni。</p> 
     * @return OriginSni <p>回源sni。</p>
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set <p>回源sni。</p>
     * @param OriginSni <p>回源sni。</p>
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get <p>回源host。</p> 
     * @return OriginHost <p>回源host。</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>回源host。</p>
     * @param OriginHost <p>回源host。</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>源站响应头</p> 
     * @return ResponseHeaders <p>源站响应头</p>
     */
    public ResponseHeaders [] getResponseHeaders() {
        return this.ResponseHeaders;
    }

    /**
     * Set <p>源站响应头</p>
     * @param ResponseHeaders <p>源站响应头</p>
     */
    public void setResponseHeaders(ResponseHeaders [] ResponseHeaders) {
        this.ResponseHeaders = ResponseHeaders;
    }

    /**
     * Get <p>删除源站响应头</p> 
     * @return HideResponseHeaders <p>删除源站响应头</p>
     */
    public HideResponseHeaders [] getHideResponseHeaders() {
        return this.HideResponseHeaders;
    }

    /**
     * Set <p>删除源站响应头</p>
     * @param HideResponseHeaders <p>删除源站响应头</p>
     */
    public void setHideResponseHeaders(HideResponseHeaders [] HideResponseHeaders) {
        this.HideResponseHeaders = HideResponseHeaders;
    }

    public CreateForwardingRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateForwardingRuleRequest(CreateForwardingRuleRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ForwardingPolicyId != null) {
            this.ForwardingPolicyId = new String(source.ForwardingPolicyId);
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
        if (source.ResponseHeaders != null) {
            this.ResponseHeaders = new ResponseHeaders[source.ResponseHeaders.length];
            for (int i = 0; i < source.ResponseHeaders.length; i++) {
                this.ResponseHeaders[i] = new ResponseHeaders(source.ResponseHeaders[i]);
            }
        }
        if (source.HideResponseHeaders != null) {
            this.HideResponseHeaders = new HideResponseHeaders[source.HideResponseHeaders.length];
            for (int i = 0; i < source.HideResponseHeaders.length; i++) {
                this.HideResponseHeaders[i] = new HideResponseHeaders(source.HideResponseHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ForwardingPolicyId", this.ForwardingPolicyId);
        this.setParamArrayObj(map, prefix + "RuleConditions.", this.RuleConditions);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamArrayObj(map, prefix + "OriginHeaders.", this.OriginHeaders);
        this.setParamSimple(map, prefix + "EnableOriginSni", this.EnableOriginSni);
        this.setParamSimple(map, prefix + "OriginSni", this.OriginSni);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamArrayObj(map, prefix + "ResponseHeaders.", this.ResponseHeaders);
        this.setParamArrayObj(map, prefix + "HideResponseHeaders.", this.HideResponseHeaders);

    }
}

