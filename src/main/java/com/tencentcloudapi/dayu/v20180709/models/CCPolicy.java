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

public class CCPolicy extends AbstractModel{

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 匹配模式，取值[matching(匹配模式), speedlimit(限速模式)]
    */
    @SerializedName("Smode")
    @Expose
    private String Smode;

    /**
    * 策略id
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
    * 每分钟限制的次数
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * 执行策略模式，拦截或者验证码，取值[alg（验证码）, drop（拦截）]
    */
    @SerializedName("ExeMode")
    @Expose
    private String ExeMode;

    /**
    * 生效开关
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private CCRule [] RuleList;

    /**
    * IP列表，如果不填时，请传空数组但不能为null；
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * cc防护类型，取值[http，https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 可选字段，表示HTTPS的CC防护域名对应的转发规则ID;
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * HTTPS的CC防护域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
     * Get 匹配模式，取值[matching(匹配模式), speedlimit(限速模式)] 
     * @return Smode 匹配模式，取值[matching(匹配模式), speedlimit(限速模式)]
     */
    public String getSmode() {
        return this.Smode;
    }

    /**
     * Set 匹配模式，取值[matching(匹配模式), speedlimit(限速模式)]
     * @param Smode 匹配模式，取值[matching(匹配模式), speedlimit(限速模式)]
     */
    public void setSmode(String Smode) {
        this.Smode = Smode;
    }

    /**
     * Get 策略id 
     * @return SetId 策略id
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set 策略id
     * @param SetId 策略id
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 每分钟限制的次数 
     * @return Frequency 每分钟限制的次数
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 每分钟限制的次数
     * @param Frequency 每分钟限制的次数
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 执行策略模式，拦截或者验证码，取值[alg（验证码）, drop（拦截）] 
     * @return ExeMode 执行策略模式，拦截或者验证码，取值[alg（验证码）, drop（拦截）]
     */
    public String getExeMode() {
        return this.ExeMode;
    }

    /**
     * Set 执行策略模式，拦截或者验证码，取值[alg（验证码）, drop（拦截）]
     * @param ExeMode 执行策略模式，拦截或者验证码，取值[alg（验证码）, drop（拦截）]
     */
    public void setExeMode(String ExeMode) {
        this.ExeMode = ExeMode;
    }

    /**
     * Get 生效开关 
     * @return Switch 生效开关
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set 生效开关
     * @param Switch 生效开关
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
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
     * Get 规则列表 
     * @return RuleList 规则列表
     */
    public CCRule [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 规则列表
     * @param RuleList 规则列表
     */
    public void setRuleList(CCRule [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get IP列表，如果不填时，请传空数组但不能为null； 
     * @return IpList IP列表，如果不填时，请传空数组但不能为null；
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP列表，如果不填时，请传空数组但不能为null；
     * @param IpList IP列表，如果不填时，请传空数组但不能为null；
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get cc防护类型，取值[http，https] 
     * @return Protocol cc防护类型，取值[http，https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set cc防护类型，取值[http，https]
     * @param Protocol cc防护类型，取值[http，https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 可选字段，表示HTTPS的CC防护域名对应的转发规则ID; 
     * @return RuleId 可选字段，表示HTTPS的CC防护域名对应的转发规则ID;
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 可选字段，表示HTTPS的CC防护域名对应的转发规则ID;
     * @param RuleId 可选字段，表示HTTPS的CC防护域名对应的转发规则ID;
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get HTTPS的CC防护域名 
     * @return Domain HTTPS的CC防护域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set HTTPS的CC防护域名
     * @param Domain HTTPS的CC防护域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Smode", this.Smode);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "ExeMode", this.ExeMode);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

