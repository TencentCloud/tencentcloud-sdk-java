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

public class ModifyDomainWhiteRuleRequest extends AbstractModel{

    /**
    * 需要更改的规则的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 白名单id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则的id列表
    */
    @SerializedName("Rules")
    @Expose
    private Long [] Rules;

    /**
    * 规则匹配路径
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 规则匹配方法
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * 规则的开关状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 需要更改的规则的域名 
     * @return Domain 需要更改的规则的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要更改的规则的域名
     * @param Domain 需要更改的规则的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 白名单id 
     * @return Id 白名单id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 白名单id
     * @param Id 白名单id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则的id列表 
     * @return Rules 规则的id列表
     */
    public Long [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则的id列表
     * @param Rules 规则的id列表
     */
    public void setRules(Long [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 规则匹配路径 
     * @return Url 规则匹配路径
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 规则匹配路径
     * @param Url 规则匹配路径
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 规则匹配方法 
     * @return Function 规则匹配方法
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set 规则匹配方法
     * @param Function 规则匹配方法
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get 规则的开关状态 
     * @return Status 规则的开关状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则的开关状态
     * @param Status 规则的开关状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDomainWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainWhiteRuleRequest(ModifyDomainWhiteRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Rules != null) {
            this.Rules = new Long[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new Long(source.Rules[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

