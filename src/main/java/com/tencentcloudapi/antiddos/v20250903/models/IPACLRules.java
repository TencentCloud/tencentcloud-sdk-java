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

public class IPACLRules extends AbstractModel {

    /**
    * <p>IP 黑白名单规则列表。</p>
    */
    @SerializedName("Rules")
    @Expose
    private IPACLRule [] Rules;

    /**
     * Get <p>IP 黑白名单规则列表。</p> 
     * @return Rules <p>IP 黑白名单规则列表。</p>
     */
    public IPACLRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>IP 黑白名单规则列表。</p>
     * @param Rules <p>IP 黑白名单规则列表。</p>
     */
    public void setRules(IPACLRule [] Rules) {
        this.Rules = Rules;
    }

    public IPACLRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPACLRules(IPACLRules source) {
        if (source.Rules != null) {
            this.Rules = new IPACLRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new IPACLRule(source.Rules[i]);
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

