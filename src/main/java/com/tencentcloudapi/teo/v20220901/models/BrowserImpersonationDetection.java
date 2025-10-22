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

public class BrowserImpersonationDetection extends AbstractModel {

    /**
    * 浏览器伪造识别规则的列表。使用 ModifySecurityPolicy 修改 Web 防护配置时： <br> <li>  若未指定 SecurityPolicy.BotManagement.BrowserImpersonationDetection 中的 Rules 参数，或 Rules 参数长度为零： 清空所有浏览器伪造识别规则配置。</li> <li> 若 SecurityPolicy.BotManagement 参数中，未指定 BrowserImpersonationDetection 参数值： 保持已有浏览器伪造识别规则配置，不做修改。</li>
    */
    @SerializedName("Rules")
    @Expose
    private BrowserImpersonationDetectionRule [] Rules;

    /**
     * Get 浏览器伪造识别规则的列表。使用 ModifySecurityPolicy 修改 Web 防护配置时： <br> <li>  若未指定 SecurityPolicy.BotManagement.BrowserImpersonationDetection 中的 Rules 参数，或 Rules 参数长度为零： 清空所有浏览器伪造识别规则配置。</li> <li> 若 SecurityPolicy.BotManagement 参数中，未指定 BrowserImpersonationDetection 参数值： 保持已有浏览器伪造识别规则配置，不做修改。</li> 
     * @return Rules 浏览器伪造识别规则的列表。使用 ModifySecurityPolicy 修改 Web 防护配置时： <br> <li>  若未指定 SecurityPolicy.BotManagement.BrowserImpersonationDetection 中的 Rules 参数，或 Rules 参数长度为零： 清空所有浏览器伪造识别规则配置。</li> <li> 若 SecurityPolicy.BotManagement 参数中，未指定 BrowserImpersonationDetection 参数值： 保持已有浏览器伪造识别规则配置，不做修改。</li>
     */
    public BrowserImpersonationDetectionRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 浏览器伪造识别规则的列表。使用 ModifySecurityPolicy 修改 Web 防护配置时： <br> <li>  若未指定 SecurityPolicy.BotManagement.BrowserImpersonationDetection 中的 Rules 参数，或 Rules 参数长度为零： 清空所有浏览器伪造识别规则配置。</li> <li> 若 SecurityPolicy.BotManagement 参数中，未指定 BrowserImpersonationDetection 参数值： 保持已有浏览器伪造识别规则配置，不做修改。</li>
     * @param Rules 浏览器伪造识别规则的列表。使用 ModifySecurityPolicy 修改 Web 防护配置时： <br> <li>  若未指定 SecurityPolicy.BotManagement.BrowserImpersonationDetection 中的 Rules 参数，或 Rules 参数长度为零： 清空所有浏览器伪造识别规则配置。</li> <li> 若 SecurityPolicy.BotManagement 参数中，未指定 BrowserImpersonationDetection 参数值： 保持已有浏览器伪造识别规则配置，不做修改。</li>
     */
    public void setRules(BrowserImpersonationDetectionRule [] Rules) {
        this.Rules = Rules;
    }

    public BrowserImpersonationDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowserImpersonationDetection(BrowserImpersonationDetection source) {
        if (source.Rules != null) {
            this.Rules = new BrowserImpersonationDetectionRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BrowserImpersonationDetectionRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

