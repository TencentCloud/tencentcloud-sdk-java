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

public class CreateAttackDownloadTaskRequest extends AbstractModel{

    /**
    * 域名，所有域名填写all
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 查询起始时间
    */
    @SerializedName("FromTime")
    @Expose
    private String FromTime;

    /**
    * 查询结束时间
    */
    @SerializedName("ToTime")
    @Expose
    private String ToTime;

    /**
    * 下载任务名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 拦截状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 自定义策略ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 攻击者IP
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * 攻击类型
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
     * Get 域名，所有域名填写all 
     * @return Domain 域名，所有域名填写all
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，所有域名填写all
     * @param Domain 域名，所有域名填写all
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 查询起始时间 
     * @return FromTime 查询起始时间
     */
    public String getFromTime() {
        return this.FromTime;
    }

    /**
     * Set 查询起始时间
     * @param FromTime 查询起始时间
     */
    public void setFromTime(String FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get 查询结束时间 
     * @return ToTime 查询结束时间
     */
    public String getToTime() {
        return this.ToTime;
    }

    /**
     * Set 查询结束时间
     * @param ToTime 查询结束时间
     */
    public void setToTime(String ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get 下载任务名字 
     * @return Name 下载任务名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 下载任务名字
     * @param Name 下载任务名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 拦截状态 
     * @return Status 拦截状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 拦截状态
     * @param Status 拦截状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 自定义策略ID 
     * @return RuleId 自定义策略ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 自定义策略ID
     * @param RuleId 自定义策略ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 攻击者IP 
     * @return AttackIp 攻击者IP
     */
    public String getAttackIp() {
        return this.AttackIp;
    }

    /**
     * Set 攻击者IP
     * @param AttackIp 攻击者IP
     */
    public void setAttackIp(String AttackIp) {
        this.AttackIp = AttackIp;
    }

    /**
     * Get 攻击类型 
     * @return AttackType 攻击类型
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型
     * @param AttackType 攻击类型
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    public CreateAttackDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAttackDownloadTaskRequest(CreateAttackDownloadTaskRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.FromTime != null) {
            this.FromTime = new String(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new String(source.ToTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.AttackIp != null) {
            this.AttackIp = new String(source.AttackIp);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AttackIp", this.AttackIp);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);

    }
}

