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

public class CreateNewL7RulesRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID列表
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * 资源IP列表
    */
    @SerializedName("VipList")
    @Expose
    private String [] VipList;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private L7RuleEntry [] Rules;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP） 
     * @return Business 大禹子产品代号（bgpip表示高防IP）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP）
     * @param Business 大禹子产品代号（bgpip表示高防IP）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID列表 
     * @return IdList 资源ID列表
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set 资源ID列表
     * @param IdList 资源ID列表
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get 资源IP列表 
     * @return VipList 资源IP列表
     */
    public String [] getVipList() {
        return this.VipList;
    }

    /**
     * Set 资源IP列表
     * @param VipList 资源IP列表
     */
    public void setVipList(String [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public L7RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(L7RuleEntry [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamArraySimple(map, prefix + "VipList.", this.VipList);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

