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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWafThreatenIntelligenceRequest extends AbstractModel{

    /**
    * 配置WAF威胁情报封禁模块详情
    */
    @SerializedName("WafThreatenIntelligenceDetails")
    @Expose
    private WafThreatenIntelligenceDetails WafThreatenIntelligenceDetails;

    /**
     * Get 配置WAF威胁情报封禁模块详情 
     * @return WafThreatenIntelligenceDetails 配置WAF威胁情报封禁模块详情
     */
    public WafThreatenIntelligenceDetails getWafThreatenIntelligenceDetails() {
        return this.WafThreatenIntelligenceDetails;
    }

    /**
     * Set 配置WAF威胁情报封禁模块详情
     * @param WafThreatenIntelligenceDetails 配置WAF威胁情报封禁模块详情
     */
    public void setWafThreatenIntelligenceDetails(WafThreatenIntelligenceDetails WafThreatenIntelligenceDetails) {
        this.WafThreatenIntelligenceDetails = WafThreatenIntelligenceDetails;
    }

    public ModifyWafThreatenIntelligenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWafThreatenIntelligenceRequest(ModifyWafThreatenIntelligenceRequest source) {
        if (source.WafThreatenIntelligenceDetails != null) {
            this.WafThreatenIntelligenceDetails = new WafThreatenIntelligenceDetails(source.WafThreatenIntelligenceDetails);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WafThreatenIntelligenceDetails.", this.WafThreatenIntelligenceDetails);

    }
}

