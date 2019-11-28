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

public class CCPolicy  extends AbstractModel{

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 匹配模式
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
    * 执行策略模式，拦截或者验证码
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
    * IP列表
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
    * 可选字段，表示https的CC防护域名对应的转发规则ID;
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * https的CC防护域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * 获取策略名称
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取匹配模式
     * @return Smode 匹配模式
     */
    public String getSmode() {
        return this.Smode;
    }

    /**
     * 设置匹配模式
     * @param Smode 匹配模式
     */
    public void setSmode(String Smode) {
        this.Smode = Smode;
    }

    /**
     * 获取策略id
     * @return SetId 策略id
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * 设置策略id
     * @param SetId 策略id
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    /**
     * 获取每分钟限制的次数
     * @return Frequency 每分钟限制的次数
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * 设置每分钟限制的次数
     * @param Frequency 每分钟限制的次数
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * 获取执行策略模式，拦截或者验证码
     * @return ExeMode 执行策略模式，拦截或者验证码
     */
    public String getExeMode() {
        return this.ExeMode;
    }

    /**
     * 设置执行策略模式，拦截或者验证码
     * @param ExeMode 执行策略模式，拦截或者验证码
     */
    public void setExeMode(String ExeMode) {
        this.ExeMode = ExeMode;
    }

    /**
     * 获取生效开关
     * @return Switch 生效开关
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * 设置生效开关
     * @param Switch 生效开关
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取规则列表
     * @return RuleList 规则列表
     */
    public CCRule [] getRuleList() {
        return this.RuleList;
    }

    /**
     * 设置规则列表
     * @param RuleList 规则列表
     */
    public void setRuleList(CCRule [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * 获取IP列表
     * @return IpList IP列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * 设置IP列表
     * @param IpList IP列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * 获取cc防护类型，取值[http，https]
     * @return Protocol cc防护类型，取值[http，https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置cc防护类型，取值[http，https]
     * @param Protocol cc防护类型，取值[http，https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取可选字段，表示https的CC防护域名对应的转发规则ID;
     * @return RuleId 可选字段，表示https的CC防护域名对应的转发规则ID;
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置可选字段，表示https的CC防护域名对应的转发规则ID;
     * @param RuleId 可选字段，表示https的CC防护域名对应的转发规则ID;
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取https的CC防护域名
     * @return Domain https的CC防护域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置https的CC防护域名
     * @param Domain https的CC防护域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 内部实现，用户禁止调用
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

