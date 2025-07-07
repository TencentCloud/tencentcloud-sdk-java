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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddIp6RulesRequest extends AbstractModel {

    /**
    * IPV6转换实例唯一ID，形如ip6-xxxxxxxx
    */
    @SerializedName("Ip6TranslatorId")
    @Expose
    private String Ip6TranslatorId;

    /**
    * IPV6转换规则信息
    */
    @SerializedName("Ip6RuleInfos")
    @Expose
    private Ip6RuleInfo [] Ip6RuleInfos;

    /**
    * IPV6转换规则名称
    */
    @SerializedName("Ip6RuleName")
    @Expose
    private String Ip6RuleName;

    /**
     * Get IPV6转换实例唯一ID，形如ip6-xxxxxxxx 
     * @return Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public String getIp6TranslatorId() {
        return this.Ip6TranslatorId;
    }

    /**
     * Set IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     * @param Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public void setIp6TranslatorId(String Ip6TranslatorId) {
        this.Ip6TranslatorId = Ip6TranslatorId;
    }

    /**
     * Get IPV6转换规则信息 
     * @return Ip6RuleInfos IPV6转换规则信息
     */
    public Ip6RuleInfo [] getIp6RuleInfos() {
        return this.Ip6RuleInfos;
    }

    /**
     * Set IPV6转换规则信息
     * @param Ip6RuleInfos IPV6转换规则信息
     */
    public void setIp6RuleInfos(Ip6RuleInfo [] Ip6RuleInfos) {
        this.Ip6RuleInfos = Ip6RuleInfos;
    }

    /**
     * Get IPV6转换规则名称 
     * @return Ip6RuleName IPV6转换规则名称
     */
    public String getIp6RuleName() {
        return this.Ip6RuleName;
    }

    /**
     * Set IPV6转换规则名称
     * @param Ip6RuleName IPV6转换规则名称
     */
    public void setIp6RuleName(String Ip6RuleName) {
        this.Ip6RuleName = Ip6RuleName;
    }

    public AddIp6RulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddIp6RulesRequest(AddIp6RulesRequest source) {
        if (source.Ip6TranslatorId != null) {
            this.Ip6TranslatorId = new String(source.Ip6TranslatorId);
        }
        if (source.Ip6RuleInfos != null) {
            this.Ip6RuleInfos = new Ip6RuleInfo[source.Ip6RuleInfos.length];
            for (int i = 0; i < source.Ip6RuleInfos.length; i++) {
                this.Ip6RuleInfos[i] = new Ip6RuleInfo(source.Ip6RuleInfos[i]);
            }
        }
        if (source.Ip6RuleName != null) {
            this.Ip6RuleName = new String(source.Ip6RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorId", this.Ip6TranslatorId);
        this.setParamArrayObj(map, prefix + "Ip6RuleInfos.", this.Ip6RuleInfos);
        this.setParamSimple(map, prefix + "Ip6RuleName", this.Ip6RuleName);

    }
}

