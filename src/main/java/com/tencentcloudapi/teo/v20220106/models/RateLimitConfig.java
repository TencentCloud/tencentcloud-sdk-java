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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitConfig extends AbstractModel{

    /**
    * 开关。
1. on 开启RateLimit；
2. off 关闭RateLimit
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 速率限制-用户规则列表。
    */
    @SerializedName("UserRules")
    @Expose
    private RateLimitUserRule [] UserRules;

    /**
    * 速率限制模板功能。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Template")
    @Expose
    private RateLimitTemplate Template;

    /**
    * 智能客户端过滤。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Intelligence")
    @Expose
    private RateLimitIntelligence Intelligence;

    /**
     * Get 开关。
1. on 开启RateLimit；
2. off 关闭RateLimit 
     * @return Switch 开关。
1. on 开启RateLimit；
2. off 关闭RateLimit
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关。
1. on 开启RateLimit；
2. off 关闭RateLimit
     * @param Switch 开关。
1. on 开启RateLimit；
2. off 关闭RateLimit
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 速率限制-用户规则列表。 
     * @return UserRules 速率限制-用户规则列表。
     */
    public RateLimitUserRule [] getUserRules() {
        return this.UserRules;
    }

    /**
     * Set 速率限制-用户规则列表。
     * @param UserRules 速率限制-用户规则列表。
     */
    public void setUserRules(RateLimitUserRule [] UserRules) {
        this.UserRules = UserRules;
    }

    /**
     * Get 速率限制模板功能。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Template 速率限制模板功能。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitTemplate getTemplate() {
        return this.Template;
    }

    /**
     * Set 速率限制模板功能。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Template 速率限制模板功能。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplate(RateLimitTemplate Template) {
        this.Template = Template;
    }

    /**
     * Get 智能客户端过滤。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Intelligence 智能客户端过滤。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitIntelligence getIntelligence() {
        return this.Intelligence;
    }

    /**
     * Set 智能客户端过滤。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Intelligence 智能客户端过滤。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntelligence(RateLimitIntelligence Intelligence) {
        this.Intelligence = Intelligence;
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
        if (source.UserRules != null) {
            this.UserRules = new RateLimitUserRule[source.UserRules.length];
            for (int i = 0; i < source.UserRules.length; i++) {
                this.UserRules[i] = new RateLimitUserRule(source.UserRules[i]);
            }
        }
        if (source.Template != null) {
            this.Template = new RateLimitTemplate(source.Template);
        }
        if (source.Intelligence != null) {
            this.Intelligence = new RateLimitIntelligence(source.Intelligence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "UserRules.", this.UserRules);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Intelligence.", this.Intelligence);

    }
}

