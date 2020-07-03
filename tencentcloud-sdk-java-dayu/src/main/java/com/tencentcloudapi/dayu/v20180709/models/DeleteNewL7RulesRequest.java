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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNewL7RulesRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 删除规则列表
    */
    @SerializedName("Rule")
    @Expose
    private L4DelRule [] Rule;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP) 
     * @return Business 大禹子产品代号（bgpip表示高防IP)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP)
     * @param Business 大禹子产品代号（bgpip表示高防IP)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 删除规则列表 
     * @return Rule 删除规则列表
     */
    public L4DelRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 删除规则列表
     * @param Rule 删除规则列表
     */
    public void setRule(L4DelRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);

    }
}

