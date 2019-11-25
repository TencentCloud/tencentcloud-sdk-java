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

public class CreateL7CCRuleRequest  extends AbstractModel{

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
    * 操作码，取值[query(表示查询)，add(表示添加)，del(表示删除)]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 7层转发规则ID，例如：rule-0000001
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 7层CC自定义规则参数，当操作码为query时，可以不用填写；当操作码为add或del时，必须填写；
    */
    @SerializedName("RuleConfig")
    @Expose
    private CCRuleConfig [] RuleConfig;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     * @return Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取操作码，取值[query(表示查询)，add(表示添加)，del(表示删除)]
     * @return Method 操作码，取值[query(表示查询)，add(表示添加)，del(表示删除)]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * 设置操作码，取值[query(表示查询)，add(表示添加)，del(表示删除)]
     * @param Method 操作码，取值[query(表示查询)，add(表示添加)，del(表示删除)]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * 获取7层转发规则ID，例如：rule-0000001
     * @return RuleId 7层转发规则ID，例如：rule-0000001
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置7层转发规则ID，例如：rule-0000001
     * @param RuleId 7层转发规则ID，例如：rule-0000001
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取7层CC自定义规则参数，当操作码为query时，可以不用填写；当操作码为add或del时，必须填写；
     * @return RuleConfig 7层CC自定义规则参数，当操作码为query时，可以不用填写；当操作码为add或del时，必须填写；
     */
    public CCRuleConfig [] getRuleConfig() {
        return this.RuleConfig;
    }

    /**
     * 设置7层CC自定义规则参数，当操作码为query时，可以不用填写；当操作码为add或del时，必须填写；
     * @param RuleConfig 7层CC自定义规则参数，当操作码为query时，可以不用填写；当操作码为add或del时，必须填写；
     */
    public void setRuleConfig(CCRuleConfig [] RuleConfig) {
        this.RuleConfig = RuleConfig;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "RuleConfig.", this.RuleConfig);

    }
}

