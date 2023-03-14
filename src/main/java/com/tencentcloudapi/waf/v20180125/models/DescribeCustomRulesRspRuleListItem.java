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

public class DescribeCustomRulesRspRuleListItem extends AbstractModel{

    /**
    * 动作类型
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 跳过的策略
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 重定向地址
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * 策略ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 优先级
    */
    @SerializedName("SortId")
    @Expose
    private String SortId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 策略详情
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

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
     * Get 跳过的策略 
     * @return Bypass 跳过的策略
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set 跳过的策略
     * @param Bypass 跳过的策略
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 重定向地址 
     * @return Redirect 重定向地址
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 重定向地址
     * @param Redirect 重定向地址
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get 策略ID 
     * @return RuleId 策略ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 策略ID
     * @param RuleId 策略ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public DescribeCustomRulesRspRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomRulesRspRuleListItem(DescribeCustomRulesRspRuleListItem source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);

    }
}

