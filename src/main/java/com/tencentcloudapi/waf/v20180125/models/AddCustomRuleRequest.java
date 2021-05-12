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

public class AddCustomRuleRequest extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 优先级
    */
    @SerializedName("SortId")
    @Expose
    private String SortId;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 策略详情
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * 需要添加策略的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 动作类型
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 如果动作是重定向，则表示重定向的地址；其他情况可以为空
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * "clb-waf"或者"sparta-waf"
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 放行的详情
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 优先级 
     * @return SortId 优先级
     */
    public String getSortId() {
        return this.SortId;
    }

    /**
     * Set 优先级
     * @param SortId 优先级
     */
    public void setSortId(String SortId) {
        this.SortId = SortId;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 策略详情 
     * @return Strategies 策略详情
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 策略详情
     * @param Strategies 策略详情
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get 需要添加策略的域名 
     * @return Domain 需要添加策略的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要添加策略的域名
     * @param Domain 需要添加策略的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 动作类型 
     * @return ActionType 动作类型
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型
     * @param ActionType 动作类型
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 如果动作是重定向，则表示重定向的地址；其他情况可以为空 
     * @return Redirect 如果动作是重定向，则表示重定向的地址；其他情况可以为空
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 如果动作是重定向，则表示重定向的地址；其他情况可以为空
     * @param Redirect 如果动作是重定向，则表示重定向的地址；其他情况可以为空
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get "clb-waf"或者"sparta-waf" 
     * @return Edition "clb-waf"或者"sparta-waf"
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set "clb-waf"或者"sparta-waf"
     * @param Edition "clb-waf"或者"sparta-waf"
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 放行的详情 
     * @return Bypass 放行的详情
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set 放行的详情
     * @param Bypass 放行的详情
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    public AddCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomRuleRequest(AddCustomRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);

    }
}

