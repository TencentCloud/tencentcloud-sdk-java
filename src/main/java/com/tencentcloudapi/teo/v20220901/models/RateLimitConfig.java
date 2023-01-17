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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitConfig extends AbstractModel{

    /**
    * 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 速率限制-用户规则列表。如果为null，默认使用历史配置。
    */
    @SerializedName("RateLimitUserRules")
    @Expose
    private RateLimitUserRule [] RateLimitUserRules;

    /**
    * 速率限制模板功能。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitTemplate")
    @Expose
    private RateLimitTemplate RateLimitTemplate;

    /**
    * 智能客户端过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitIntelligence")
    @Expose
    private RateLimitIntelligence RateLimitIntelligence;

    /**
    * 速率限制-托管定制规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitCustomizes")
    @Expose
    private RateLimitUserRule [] RateLimitCustomizes;

    /**
     * Get 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 速率限制-用户规则列表。如果为null，默认使用历史配置。 
     * @return RateLimitUserRules 速率限制-用户规则列表。如果为null，默认使用历史配置。
     */
    public RateLimitUserRule [] getRateLimitUserRules() {
        return this.RateLimitUserRules;
    }

    /**
     * Set 速率限制-用户规则列表。如果为null，默认使用历史配置。
     * @param RateLimitUserRules 速率限制-用户规则列表。如果为null，默认使用历史配置。
     */
    public void setRateLimitUserRules(RateLimitUserRule [] RateLimitUserRules) {
        this.RateLimitUserRules = RateLimitUserRules;
    }

    /**
     * Get 速率限制模板功能。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitTemplate 速率限制模板功能。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitTemplate getRateLimitTemplate() {
        return this.RateLimitTemplate;
    }

    /**
     * Set 速率限制模板功能。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitTemplate 速率限制模板功能。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitTemplate(RateLimitTemplate RateLimitTemplate) {
        this.RateLimitTemplate = RateLimitTemplate;
    }

    /**
     * Get 智能客户端过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitIntelligence 智能客户端过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitIntelligence getRateLimitIntelligence() {
        return this.RateLimitIntelligence;
    }

    /**
     * Set 智能客户端过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitIntelligence 智能客户端过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitIntelligence(RateLimitIntelligence RateLimitIntelligence) {
        this.RateLimitIntelligence = RateLimitIntelligence;
    }

    /**
     * Get 速率限制-托管定制规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitCustomizes 速率限制-托管定制规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitUserRule [] getRateLimitCustomizes() {
        return this.RateLimitCustomizes;
    }

    /**
     * Set 速率限制-托管定制规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitCustomizes 速率限制-托管定制规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitCustomizes(RateLimitUserRule [] RateLimitCustomizes) {
        this.RateLimitCustomizes = RateLimitCustomizes;
    }

    public RateLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitConfig(RateLimitConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RateLimitUserRules != null) {
            this.RateLimitUserRules = new RateLimitUserRule[source.RateLimitUserRules.length];
            for (int i = 0; i < source.RateLimitUserRules.length; i++) {
                this.RateLimitUserRules[i] = new RateLimitUserRule(source.RateLimitUserRules[i]);
            }
        }
        if (source.RateLimitTemplate != null) {
            this.RateLimitTemplate = new RateLimitTemplate(source.RateLimitTemplate);
        }
        if (source.RateLimitIntelligence != null) {
            this.RateLimitIntelligence = new RateLimitIntelligence(source.RateLimitIntelligence);
        }
        if (source.RateLimitCustomizes != null) {
            this.RateLimitCustomizes = new RateLimitUserRule[source.RateLimitCustomizes.length];
            for (int i = 0; i < source.RateLimitCustomizes.length; i++) {
                this.RateLimitCustomizes[i] = new RateLimitUserRule(source.RateLimitCustomizes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RateLimitUserRules.", this.RateLimitUserRules);
        this.setParamObj(map, prefix + "RateLimitTemplate.", this.RateLimitTemplate);
        this.setParamObj(map, prefix + "RateLimitIntelligence.", this.RateLimitIntelligence);
        this.setParamArrayObj(map, prefix + "RateLimitCustomizes.", this.RateLimitCustomizes);

    }
}

