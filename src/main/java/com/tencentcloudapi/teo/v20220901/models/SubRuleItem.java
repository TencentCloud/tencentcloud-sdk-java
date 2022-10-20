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

public class SubRuleItem extends AbstractModel{

    /**
    * 嵌套规则信息。
    */
    @SerializedName("Rules")
    @Expose
    private SubRule [] Rules;

    /**
    * 规则标签。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 嵌套规则信息。 
     * @return Rules 嵌套规则信息。
     */
    public SubRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 嵌套规则信息。
     * @param Rules 嵌套规则信息。
     */
    public void setRules(SubRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 规则标签。 
     * @return Tags 规则标签。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 规则标签。
     * @param Tags 规则标签。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public SubRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubRuleItem(SubRuleItem source) {
        if (source.Rules != null) {
            this.Rules = new SubRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new SubRule(source.Rules[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

