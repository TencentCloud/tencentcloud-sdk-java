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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplatePolicy extends AbstractModel{

    /**
    * 保护策略ID列表
    */
    @SerializedName("TemplatePolicyIdList")
    @Expose
    private String [] TemplatePolicyIdList;

    /**
    * 策略规则
    */
    @SerializedName("TemplatePolicyRule")
    @Expose
    private String TemplatePolicyRule;

    /**
    * 护栏策略生效处理策略 1:顺序执行，2:暂停
    */
    @SerializedName("TemplatePolicyDealType")
    @Expose
    private Long TemplatePolicyDealType;

    /**
     * Get 保护策略ID列表 
     * @return TemplatePolicyIdList 保护策略ID列表
     */
    public String [] getTemplatePolicyIdList() {
        return this.TemplatePolicyIdList;
    }

    /**
     * Set 保护策略ID列表
     * @param TemplatePolicyIdList 保护策略ID列表
     */
    public void setTemplatePolicyIdList(String [] TemplatePolicyIdList) {
        this.TemplatePolicyIdList = TemplatePolicyIdList;
    }

    /**
     * Get 策略规则 
     * @return TemplatePolicyRule 策略规则
     */
    public String getTemplatePolicyRule() {
        return this.TemplatePolicyRule;
    }

    /**
     * Set 策略规则
     * @param TemplatePolicyRule 策略规则
     */
    public void setTemplatePolicyRule(String TemplatePolicyRule) {
        this.TemplatePolicyRule = TemplatePolicyRule;
    }

    /**
     * Get 护栏策略生效处理策略 1:顺序执行，2:暂停 
     * @return TemplatePolicyDealType 护栏策略生效处理策略 1:顺序执行，2:暂停
     */
    public Long getTemplatePolicyDealType() {
        return this.TemplatePolicyDealType;
    }

    /**
     * Set 护栏策略生效处理策略 1:顺序执行，2:暂停
     * @param TemplatePolicyDealType 护栏策略生效处理策略 1:顺序执行，2:暂停
     */
    public void setTemplatePolicyDealType(Long TemplatePolicyDealType) {
        this.TemplatePolicyDealType = TemplatePolicyDealType;
    }

    public TemplatePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplatePolicy(TemplatePolicy source) {
        if (source.TemplatePolicyIdList != null) {
            this.TemplatePolicyIdList = new String[source.TemplatePolicyIdList.length];
            for (int i = 0; i < source.TemplatePolicyIdList.length; i++) {
                this.TemplatePolicyIdList[i] = new String(source.TemplatePolicyIdList[i]);
            }
        }
        if (source.TemplatePolicyRule != null) {
            this.TemplatePolicyRule = new String(source.TemplatePolicyRule);
        }
        if (source.TemplatePolicyDealType != null) {
            this.TemplatePolicyDealType = new Long(source.TemplatePolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TemplatePolicyIdList.", this.TemplatePolicyIdList);
        this.setParamSimple(map, prefix + "TemplatePolicyRule", this.TemplatePolicyRule);
        this.setParamSimple(map, prefix + "TemplatePolicyDealType", this.TemplatePolicyDealType);

    }
}

