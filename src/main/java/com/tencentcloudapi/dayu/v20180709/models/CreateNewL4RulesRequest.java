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

public class CreateNewL4RulesRequest extends AbstractModel{

    /**
    * 高防产品代号：bgpip
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 添加规则资源列表
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * 添加规则IP列表
    */
    @SerializedName("VipList")
    @Expose
    private String [] VipList;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private L4RuleEntry [] Rules;

    /**
     * Get 高防产品代号：bgpip 
     * @return Business 高防产品代号：bgpip
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 高防产品代号：bgpip
     * @param Business 高防产品代号：bgpip
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 添加规则资源列表 
     * @return IdList 添加规则资源列表
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set 添加规则资源列表
     * @param IdList 添加规则资源列表
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get 添加规则IP列表 
     * @return VipList 添加规则IP列表
     */
    public String [] getVipList() {
        return this.VipList;
    }

    /**
     * Set 添加规则IP列表
     * @param VipList 添加规则IP列表
     */
    public void setVipList(String [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public L4RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(L4RuleEntry [] Rules) {
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

