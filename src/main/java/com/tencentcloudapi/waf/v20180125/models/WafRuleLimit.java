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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafRuleLimit extends AbstractModel{

    /**
    * 自定义CC的规格
    */
    @SerializedName("CC")
    @Expose
    private Long CC;

    /**
    * 自定义策略的规格
    */
    @SerializedName("CustomRule")
    @Expose
    private Long CustomRule;

    /**
    * 黑白名单的规格
    */
    @SerializedName("IPControl")
    @Expose
    private Long IPControl;

    /**
    * 信息防泄漏的规格
    */
    @SerializedName("AntiLeak")
    @Expose
    private Long AntiLeak;

    /**
    * 防篡改的规格
    */
    @SerializedName("AntiTamper")
    @Expose
    private Long AntiTamper;

    /**
    * 紧急CC的规格
    */
    @SerializedName("AutoCC")
    @Expose
    private Long AutoCC;

    /**
    * 地域封禁的规格
    */
    @SerializedName("AreaBan")
    @Expose
    private Long AreaBan;

    /**
    * 自定义CC中配置session
    */
    @SerializedName("CCSession")
    @Expose
    private Long CCSession;

    /**
    * AI的规格
    */
    @SerializedName("AI")
    @Expose
    private Long AI;

    /**
    * 精准白名单的规格
    */
    @SerializedName("CustomWhite")
    @Expose
    private Long CustomWhite;

    /**
    * api安全的规格
    */
    @SerializedName("ApiSecurity")
    @Expose
    private Long ApiSecurity;

    /**
    * 客户端流量标记的规格
    */
    @SerializedName("ClientMsg")
    @Expose
    private Long ClientMsg;

    /**
    * 流量标记的规格
    */
    @SerializedName("TrafficMarking")
    @Expose
    private Long TrafficMarking;

    /**
     * Get 自定义CC的规格 
     * @return CC 自定义CC的规格
     */
    public Long getCC() {
        return this.CC;
    }

    /**
     * Set 自定义CC的规格
     * @param CC 自定义CC的规格
     */
    public void setCC(Long CC) {
        this.CC = CC;
    }

    /**
     * Get 自定义策略的规格 
     * @return CustomRule 自定义策略的规格
     */
    public Long getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义策略的规格
     * @param CustomRule 自定义策略的规格
     */
    public void setCustomRule(Long CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get 黑白名单的规格 
     * @return IPControl 黑白名单的规格
     */
    public Long getIPControl() {
        return this.IPControl;
    }

    /**
     * Set 黑白名单的规格
     * @param IPControl 黑白名单的规格
     */
    public void setIPControl(Long IPControl) {
        this.IPControl = IPControl;
    }

    /**
     * Get 信息防泄漏的规格 
     * @return AntiLeak 信息防泄漏的规格
     */
    public Long getAntiLeak() {
        return this.AntiLeak;
    }

    /**
     * Set 信息防泄漏的规格
     * @param AntiLeak 信息防泄漏的规格
     */
    public void setAntiLeak(Long AntiLeak) {
        this.AntiLeak = AntiLeak;
    }

    /**
     * Get 防篡改的规格 
     * @return AntiTamper 防篡改的规格
     */
    public Long getAntiTamper() {
        return this.AntiTamper;
    }

    /**
     * Set 防篡改的规格
     * @param AntiTamper 防篡改的规格
     */
    public void setAntiTamper(Long AntiTamper) {
        this.AntiTamper = AntiTamper;
    }

    /**
     * Get 紧急CC的规格 
     * @return AutoCC 紧急CC的规格
     */
    public Long getAutoCC() {
        return this.AutoCC;
    }

    /**
     * Set 紧急CC的规格
     * @param AutoCC 紧急CC的规格
     */
    public void setAutoCC(Long AutoCC) {
        this.AutoCC = AutoCC;
    }

    /**
     * Get 地域封禁的规格 
     * @return AreaBan 地域封禁的规格
     */
    public Long getAreaBan() {
        return this.AreaBan;
    }

    /**
     * Set 地域封禁的规格
     * @param AreaBan 地域封禁的规格
     */
    public void setAreaBan(Long AreaBan) {
        this.AreaBan = AreaBan;
    }

    /**
     * Get 自定义CC中配置session 
     * @return CCSession 自定义CC中配置session
     */
    public Long getCCSession() {
        return this.CCSession;
    }

    /**
     * Set 自定义CC中配置session
     * @param CCSession 自定义CC中配置session
     */
    public void setCCSession(Long CCSession) {
        this.CCSession = CCSession;
    }

    /**
     * Get AI的规格 
     * @return AI AI的规格
     */
    public Long getAI() {
        return this.AI;
    }

    /**
     * Set AI的规格
     * @param AI AI的规格
     */
    public void setAI(Long AI) {
        this.AI = AI;
    }

    /**
     * Get 精准白名单的规格 
     * @return CustomWhite 精准白名单的规格
     */
    public Long getCustomWhite() {
        return this.CustomWhite;
    }

    /**
     * Set 精准白名单的规格
     * @param CustomWhite 精准白名单的规格
     */
    public void setCustomWhite(Long CustomWhite) {
        this.CustomWhite = CustomWhite;
    }

    /**
     * Get api安全的规格 
     * @return ApiSecurity api安全的规格
     */
    public Long getApiSecurity() {
        return this.ApiSecurity;
    }

    /**
     * Set api安全的规格
     * @param ApiSecurity api安全的规格
     */
    public void setApiSecurity(Long ApiSecurity) {
        this.ApiSecurity = ApiSecurity;
    }

    /**
     * Get 客户端流量标记的规格 
     * @return ClientMsg 客户端流量标记的规格
     */
    public Long getClientMsg() {
        return this.ClientMsg;
    }

    /**
     * Set 客户端流量标记的规格
     * @param ClientMsg 客户端流量标记的规格
     */
    public void setClientMsg(Long ClientMsg) {
        this.ClientMsg = ClientMsg;
    }

    /**
     * Get 流量标记的规格 
     * @return TrafficMarking 流量标记的规格
     */
    public Long getTrafficMarking() {
        return this.TrafficMarking;
    }

    /**
     * Set 流量标记的规格
     * @param TrafficMarking 流量标记的规格
     */
    public void setTrafficMarking(Long TrafficMarking) {
        this.TrafficMarking = TrafficMarking;
    }

    public WafRuleLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafRuleLimit(WafRuleLimit source) {
        if (source.CC != null) {
            this.CC = new Long(source.CC);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new Long(source.CustomRule);
        }
        if (source.IPControl != null) {
            this.IPControl = new Long(source.IPControl);
        }
        if (source.AntiLeak != null) {
            this.AntiLeak = new Long(source.AntiLeak);
        }
        if (source.AntiTamper != null) {
            this.AntiTamper = new Long(source.AntiTamper);
        }
        if (source.AutoCC != null) {
            this.AutoCC = new Long(source.AutoCC);
        }
        if (source.AreaBan != null) {
            this.AreaBan = new Long(source.AreaBan);
        }
        if (source.CCSession != null) {
            this.CCSession = new Long(source.CCSession);
        }
        if (source.AI != null) {
            this.AI = new Long(source.AI);
        }
        if (source.CustomWhite != null) {
            this.CustomWhite = new Long(source.CustomWhite);
        }
        if (source.ApiSecurity != null) {
            this.ApiSecurity = new Long(source.ApiSecurity);
        }
        if (source.ClientMsg != null) {
            this.ClientMsg = new Long(source.ClientMsg);
        }
        if (source.TrafficMarking != null) {
            this.TrafficMarking = new Long(source.TrafficMarking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CC", this.CC);
        this.setParamSimple(map, prefix + "CustomRule", this.CustomRule);
        this.setParamSimple(map, prefix + "IPControl", this.IPControl);
        this.setParamSimple(map, prefix + "AntiLeak", this.AntiLeak);
        this.setParamSimple(map, prefix + "AntiTamper", this.AntiTamper);
        this.setParamSimple(map, prefix + "AutoCC", this.AutoCC);
        this.setParamSimple(map, prefix + "AreaBan", this.AreaBan);
        this.setParamSimple(map, prefix + "CCSession", this.CCSession);
        this.setParamSimple(map, prefix + "AI", this.AI);
        this.setParamSimple(map, prefix + "CustomWhite", this.CustomWhite);
        this.setParamSimple(map, prefix + "ApiSecurity", this.ApiSecurity);
        this.setParamSimple(map, prefix + "ClientMsg", this.ClientMsg);
        this.setParamSimple(map, prefix + "TrafficMarking", this.TrafficMarking);

    }
}

