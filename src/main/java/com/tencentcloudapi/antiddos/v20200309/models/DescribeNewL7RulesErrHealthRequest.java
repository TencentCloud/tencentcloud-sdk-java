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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNewL7RulesErrHealthRequest extends AbstractModel {

    /**
    * DDoS防护子产品代号(bgpip表示高防IP)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 规则Id列表
    */
    @SerializedName("RuleIdList")
    @Expose
    private String [] RuleIdList;

    /**
     * Get DDoS防护子产品代号(bgpip表示高防IP) 
     * @return Business DDoS防护子产品代号(bgpip表示高防IP)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set DDoS防护子产品代号(bgpip表示高防IP)
     * @param Business DDoS防护子产品代号(bgpip表示高防IP)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 规则Id列表 
     * @return RuleIdList 规则Id列表
     */
    public String [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 规则Id列表
     * @param RuleIdList 规则Id列表
     */
    public void setRuleIdList(String [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    public DescribeNewL7RulesErrHealthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewL7RulesErrHealthRequest(DescribeNewL7RulesErrHealthRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new String[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new String(source.RuleIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);

    }
}

