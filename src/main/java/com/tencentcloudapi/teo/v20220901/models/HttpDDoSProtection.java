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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpDDoSProtection extends AbstractModel {

    /**
    * 自适应频控的具体配置。
    */
    @SerializedName("AdaptiveFrequencyControl")
    @Expose
    private AdaptiveFrequencyControl AdaptiveFrequencyControl;

    /**
    * 智能客户端过滤的具体配置。
    */
    @SerializedName("ClientFiltering")
    @Expose
    private ClientFiltering ClientFiltering;

    /**
    * 流量防盗刷的具体配置。
    */
    @SerializedName("BandwidthAbuseDefense")
    @Expose
    private BandwidthAbuseDefense BandwidthAbuseDefense;

    /**
    * 慢速攻击防护的具体配置。
    */
    @SerializedName("SlowAttackDefense")
    @Expose
    private SlowAttackDefense SlowAttackDefense;

    /**
     * Get 自适应频控的具体配置。 
     * @return AdaptiveFrequencyControl 自适应频控的具体配置。
     */
    public AdaptiveFrequencyControl getAdaptiveFrequencyControl() {
        return this.AdaptiveFrequencyControl;
    }

    /**
     * Set 自适应频控的具体配置。
     * @param AdaptiveFrequencyControl 自适应频控的具体配置。
     */
    public void setAdaptiveFrequencyControl(AdaptiveFrequencyControl AdaptiveFrequencyControl) {
        this.AdaptiveFrequencyControl = AdaptiveFrequencyControl;
    }

    /**
     * Get 智能客户端过滤的具体配置。 
     * @return ClientFiltering 智能客户端过滤的具体配置。
     */
    public ClientFiltering getClientFiltering() {
        return this.ClientFiltering;
    }

    /**
     * Set 智能客户端过滤的具体配置。
     * @param ClientFiltering 智能客户端过滤的具体配置。
     */
    public void setClientFiltering(ClientFiltering ClientFiltering) {
        this.ClientFiltering = ClientFiltering;
    }

    /**
     * Get 流量防盗刷的具体配置。 
     * @return BandwidthAbuseDefense 流量防盗刷的具体配置。
     */
    public BandwidthAbuseDefense getBandwidthAbuseDefense() {
        return this.BandwidthAbuseDefense;
    }

    /**
     * Set 流量防盗刷的具体配置。
     * @param BandwidthAbuseDefense 流量防盗刷的具体配置。
     */
    public void setBandwidthAbuseDefense(BandwidthAbuseDefense BandwidthAbuseDefense) {
        this.BandwidthAbuseDefense = BandwidthAbuseDefense;
    }

    /**
     * Get 慢速攻击防护的具体配置。 
     * @return SlowAttackDefense 慢速攻击防护的具体配置。
     */
    public SlowAttackDefense getSlowAttackDefense() {
        return this.SlowAttackDefense;
    }

    /**
     * Set 慢速攻击防护的具体配置。
     * @param SlowAttackDefense 慢速攻击防护的具体配置。
     */
    public void setSlowAttackDefense(SlowAttackDefense SlowAttackDefense) {
        this.SlowAttackDefense = SlowAttackDefense;
    }

    public HttpDDoSProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpDDoSProtection(HttpDDoSProtection source) {
        if (source.AdaptiveFrequencyControl != null) {
            this.AdaptiveFrequencyControl = new AdaptiveFrequencyControl(source.AdaptiveFrequencyControl);
        }
        if (source.ClientFiltering != null) {
            this.ClientFiltering = new ClientFiltering(source.ClientFiltering);
        }
        if (source.BandwidthAbuseDefense != null) {
            this.BandwidthAbuseDefense = new BandwidthAbuseDefense(source.BandwidthAbuseDefense);
        }
        if (source.SlowAttackDefense != null) {
            this.SlowAttackDefense = new SlowAttackDefense(source.SlowAttackDefense);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AdaptiveFrequencyControl.", this.AdaptiveFrequencyControl);
        this.setParamObj(map, prefix + "ClientFiltering.", this.ClientFiltering);
        this.setParamObj(map, prefix + "BandwidthAbuseDefense.", this.BandwidthAbuseDefense);
        this.setParamObj(map, prefix + "SlowAttackDefense.", this.SlowAttackDefense);

    }
}

