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

public class RemoveIp6RulesRequest extends AbstractModel {

    /**
    * IPV6转换规则所属的转换实例唯一ID，形如ip6-xxxxxxxx
    */
    @SerializedName("Ip6TranslatorId")
    @Expose
    private String Ip6TranslatorId;

    /**
    * 待删除IPV6转换规则，形如rule6-xxxxxxxx
    */
    @SerializedName("Ip6RuleIds")
    @Expose
    private String [] Ip6RuleIds;

    /**
     * Get IPV6转换规则所属的转换实例唯一ID，形如ip6-xxxxxxxx 
     * @return Ip6TranslatorId IPV6转换规则所属的转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public String getIp6TranslatorId() {
        return this.Ip6TranslatorId;
    }

    /**
     * Set IPV6转换规则所属的转换实例唯一ID，形如ip6-xxxxxxxx
     * @param Ip6TranslatorId IPV6转换规则所属的转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public void setIp6TranslatorId(String Ip6TranslatorId) {
        this.Ip6TranslatorId = Ip6TranslatorId;
    }

    /**
     * Get 待删除IPV6转换规则，形如rule6-xxxxxxxx 
     * @return Ip6RuleIds 待删除IPV6转换规则，形如rule6-xxxxxxxx
     */
    public String [] getIp6RuleIds() {
        return this.Ip6RuleIds;
    }

    /**
     * Set 待删除IPV6转换规则，形如rule6-xxxxxxxx
     * @param Ip6RuleIds 待删除IPV6转换规则，形如rule6-xxxxxxxx
     */
    public void setIp6RuleIds(String [] Ip6RuleIds) {
        this.Ip6RuleIds = Ip6RuleIds;
    }

    public RemoveIp6RulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveIp6RulesRequest(RemoveIp6RulesRequest source) {
        if (source.Ip6TranslatorId != null) {
            this.Ip6TranslatorId = new String(source.Ip6TranslatorId);
        }
        if (source.Ip6RuleIds != null) {
            this.Ip6RuleIds = new String[source.Ip6RuleIds.length];
            for (int i = 0; i < source.Ip6RuleIds.length; i++) {
                this.Ip6RuleIds[i] = new String(source.Ip6RuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorId", this.Ip6TranslatorId);
        this.setParamArraySimple(map, prefix + "Ip6RuleIds.", this.Ip6RuleIds);

    }
}

