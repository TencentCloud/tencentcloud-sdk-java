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

public class SecHitRuleInfo extends AbstractModel{

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则类型名称。
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 命中时间，采用unix秒级时间戳。
    */
    @SerializedName("HitTime")
    @Expose
    private Long HitTime;

    /**
    * 请求数。
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
    * 规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 子域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则类型名称。 
     * @return RuleTypeName 规则类型名称。
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则类型名称。
     * @param RuleTypeName 规则类型名称。
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li> 
     * @return Action 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     * @param Action 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 命中时间，采用unix秒级时间戳。 
     * @return HitTime 命中时间，采用unix秒级时间戳。
     */
    public Long getHitTime() {
        return this.HitTime;
    }

    /**
     * Set 命中时间，采用unix秒级时间戳。
     * @param HitTime 命中时间，采用unix秒级时间戳。
     */
    public void setHitTime(Long HitTime) {
        this.HitTime = HitTime;
    }

    /**
     * Get 请求数。 
     * @return RequestNum 请求数。
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set 请求数。
     * @param RequestNum 请求数。
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    /**
     * Get 规则描述。 
     * @return Description 规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
     * @param Description 规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 子域名。 
     * @return Domain 子域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 子域名。
     * @param Domain 子域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public SecHitRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecHitRuleInfo(SecHitRuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.HitTime != null) {
            this.HitTime = new Long(source.HitTime);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "HitTime", this.HitTime);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

