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

public class ModifyCCFrequencyRulesStatusRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 开启或关闭，取值["on"(开启)，"off"(关闭)]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID 
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID） 
     * @return RuleId 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
     * @param RuleId 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 开启或关闭，取值["on"(开启)，"off"(关闭)] 
     * @return Method 开启或关闭，取值["on"(开启)，"off"(关闭)]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 开启或关闭，取值["on"(开启)，"off"(关闭)]
     * @param Method 开启或关闭，取值["on"(开启)，"off"(关闭)]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

