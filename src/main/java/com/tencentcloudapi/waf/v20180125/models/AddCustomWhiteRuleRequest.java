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

public class AddCustomWhiteRuleRequest extends AbstractModel{

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

    public AddCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomWhiteRuleRequest(AddCustomWhiteRuleRequest source) {
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
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);

    }
}

