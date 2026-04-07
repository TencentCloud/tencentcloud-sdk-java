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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8SAPIRuleTypeZhItem extends AbstractModel {

    /**
    * <p>规则类型</p><p>枚举值：</p><ul><li>&quot;rule_type&quot;: &quot;ABNORMAL_CREATE_POD&quot;,： 可疑容器创建</li></ul>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>规则类型对应中文</p>
    */
    @SerializedName("RuleTypeZh")
    @Expose
    private String RuleTypeZh;

    /**
     * Get <p>规则类型</p><p>枚举值：</p><ul><li>&quot;rule_type&quot;: &quot;ABNORMAL_CREATE_POD&quot;,： 可疑容器创建</li></ul> 
     * @return RuleType <p>规则类型</p><p>枚举值：</p><ul><li>&quot;rule_type&quot;: &quot;ABNORMAL_CREATE_POD&quot;,： 可疑容器创建</li></ul>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型</p><p>枚举值：</p><ul><li>&quot;rule_type&quot;: &quot;ABNORMAL_CREATE_POD&quot;,： 可疑容器创建</li></ul>
     * @param RuleType <p>规则类型</p><p>枚举值：</p><ul><li>&quot;rule_type&quot;: &quot;ABNORMAL_CREATE_POD&quot;,： 可疑容器创建</li></ul>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>规则类型对应中文</p> 
     * @return RuleTypeZh <p>规则类型对应中文</p>
     */
    public String getRuleTypeZh() {
        return this.RuleTypeZh;
    }

    /**
     * Set <p>规则类型对应中文</p>
     * @param RuleTypeZh <p>规则类型对应中文</p>
     */
    public void setRuleTypeZh(String RuleTypeZh) {
        this.RuleTypeZh = RuleTypeZh;
    }

    public K8SAPIRuleTypeZhItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8SAPIRuleTypeZhItem(K8SAPIRuleTypeZhItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleTypeZh != null) {
            this.RuleTypeZh = new String(source.RuleTypeZh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleTypeZh", this.RuleTypeZh);

    }
}

