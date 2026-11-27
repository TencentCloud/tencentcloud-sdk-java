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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultProtectionConfig extends AbstractModel {

    /**
    * <p>DDoS 防护等级配置，决定清洗策略的灵敏度。</p><p>枚举值：</p><ul><li>high： 高灵敏度。清洗策略相对严格，建议在正常模式出现攻击透传时使用。</li><li>medium： 适中灵敏度（默认）。清洗策略适配绝大多数业务，可有效防护常见攻击。</li><li>low： 宽松灵敏度。清洗策略相对宽松，仅对具有明确攻击特征的攻击包进行防护。</li></ul><p>详见 <a href="https://cloud.tencent.com/document/product/297/139103">各个防护等级防护策略</a> 说明。</p>
    */
    @SerializedName("SensitivityLevel")
    @Expose
    private String SensitivityLevel;

    /**
     * Get <p>DDoS 防护等级配置，决定清洗策略的灵敏度。</p><p>枚举值：</p><ul><li>high： 高灵敏度。清洗策略相对严格，建议在正常模式出现攻击透传时使用。</li><li>medium： 适中灵敏度（默认）。清洗策略适配绝大多数业务，可有效防护常见攻击。</li><li>low： 宽松灵敏度。清洗策略相对宽松，仅对具有明确攻击特征的攻击包进行防护。</li></ul><p>详见 <a href="https://cloud.tencent.com/document/product/297/139103">各个防护等级防护策略</a> 说明。</p> 
     * @return SensitivityLevel <p>DDoS 防护等级配置，决定清洗策略的灵敏度。</p><p>枚举值：</p><ul><li>high： 高灵敏度。清洗策略相对严格，建议在正常模式出现攻击透传时使用。</li><li>medium： 适中灵敏度（默认）。清洗策略适配绝大多数业务，可有效防护常见攻击。</li><li>low： 宽松灵敏度。清洗策略相对宽松，仅对具有明确攻击特征的攻击包进行防护。</li></ul><p>详见 <a href="https://cloud.tencent.com/document/product/297/139103">各个防护等级防护策略</a> 说明。</p>
     */
    public String getSensitivityLevel() {
        return this.SensitivityLevel;
    }

    /**
     * Set <p>DDoS 防护等级配置，决定清洗策略的灵敏度。</p><p>枚举值：</p><ul><li>high： 高灵敏度。清洗策略相对严格，建议在正常模式出现攻击透传时使用。</li><li>medium： 适中灵敏度（默认）。清洗策略适配绝大多数业务，可有效防护常见攻击。</li><li>low： 宽松灵敏度。清洗策略相对宽松，仅对具有明确攻击特征的攻击包进行防护。</li></ul><p>详见 <a href="https://cloud.tencent.com/document/product/297/139103">各个防护等级防护策略</a> 说明。</p>
     * @param SensitivityLevel <p>DDoS 防护等级配置，决定清洗策略的灵敏度。</p><p>枚举值：</p><ul><li>high： 高灵敏度。清洗策略相对严格，建议在正常模式出现攻击透传时使用。</li><li>medium： 适中灵敏度（默认）。清洗策略适配绝大多数业务，可有效防护常见攻击。</li><li>low： 宽松灵敏度。清洗策略相对宽松，仅对具有明确攻击特征的攻击包进行防护。</li></ul><p>详见 <a href="https://cloud.tencent.com/document/product/297/139103">各个防护等级防护策略</a> 说明。</p>
     */
    public void setSensitivityLevel(String SensitivityLevel) {
        this.SensitivityLevel = SensitivityLevel;
    }

    public DefaultProtectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultProtectionConfig(DefaultProtectionConfig source) {
        if (source.SensitivityLevel != null) {
            this.SensitivityLevel = new String(source.SensitivityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SensitivityLevel", this.SensitivityLevel);

    }
}

