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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOwaspRuleTypeActionRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则类型ID列表
    */
    @SerializedName("TypeIDs")
    @Expose
    private String [] TypeIDs;

    /**
    * 规则类型的防护模式，0：观察、1：拦截
    */
    @SerializedName("RuleTypeAction")
    @Expose
    private Long RuleTypeAction;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则类型ID列表 
     * @return TypeIDs 规则类型ID列表
     */
    public String [] getTypeIDs() {
        return this.TypeIDs;
    }

    /**
     * Set 规则类型ID列表
     * @param TypeIDs 规则类型ID列表
     */
    public void setTypeIDs(String [] TypeIDs) {
        this.TypeIDs = TypeIDs;
    }

    /**
     * Get 规则类型的防护模式，0：观察、1：拦截 
     * @return RuleTypeAction 规则类型的防护模式，0：观察、1：拦截
     */
    public Long getRuleTypeAction() {
        return this.RuleTypeAction;
    }

    /**
     * Set 规则类型的防护模式，0：观察、1：拦截
     * @param RuleTypeAction 规则类型的防护模式，0：观察、1：拦截
     */
    public void setRuleTypeAction(Long RuleTypeAction) {
        this.RuleTypeAction = RuleTypeAction;
    }

    public ModifyOwaspRuleTypeActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwaspRuleTypeActionRequest(ModifyOwaspRuleTypeActionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TypeIDs != null) {
            this.TypeIDs = new String[source.TypeIDs.length];
            for (int i = 0; i < source.TypeIDs.length; i++) {
                this.TypeIDs[i] = new String(source.TypeIDs[i]);
            }
        }
        if (source.RuleTypeAction != null) {
            this.RuleTypeAction = new Long(source.RuleTypeAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "TypeIDs.", this.TypeIDs);
        this.setParamSimple(map, prefix + "RuleTypeAction", this.RuleTypeAction);

    }
}

