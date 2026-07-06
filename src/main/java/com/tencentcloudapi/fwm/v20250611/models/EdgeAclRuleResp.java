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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeAclRuleResp extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则执行顺序
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * 规则方向：0-出站，1-入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 源地址内容
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 源地址类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 源地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 目标地址内容
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 目标地址类型
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 目标地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 目标端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 规则动作：accept-放行，drop-阻断，log-观察
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则生效范围
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 地域名称1（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
    * 地域名称2（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 参数模板ID（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 参数模板名称（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * 规则是否失效：0-有效，1-失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * 规则归属的成员账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongMember")
    @Expose
    private MemberInfo BelongMember;

    /**
    * 国家Id
    */
    @SerializedName("CountryCode")
    @Expose
    private Long CountryCode;

    /**
    * 城市Id
    */
    @SerializedName("CityCode")
    @Expose
    private Long CityCode;

    /**
    * 0为正常规则,1为地域规则
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * 云厂商code
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * 0为正常规则,1为云厂商规则
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地区简称
    */
    @SerializedName("CountryKey")
    @Expose
    private String CountryKey;

    /**
    * 省份、城市简称
    */
    @SerializedName("CityKey")
    @Expose
    private String CityKey;

    /**
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则最近更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 域名数
    */
    @SerializedName("DnsParseCnt")
    @Expose
    private Long DnsParseCnt;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则执行顺序 
     * @return Sequence 规则执行顺序
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 规则执行顺序
     * @param Sequence 规则执行顺序
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 规则方向：0-出站，1-入站 
     * @return Direction 规则方向：0-出站，1-入站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：0-出站，1-入站
     * @param Direction 规则方向：0-出站，1-入站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 源地址内容 
     * @return SourceContent 源地址内容
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 源地址内容
     * @param SourceContent 源地址内容
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 源地址类型 
     * @return SourceType 源地址类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 源地址类型
     * @param SourceType 源地址类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 源地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceName 源地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 源地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceName 源地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 目标地址内容 
     * @return TargetContent 目标地址内容
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 目标地址内容
     * @param TargetContent 目标地址内容
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get 目标地址类型 
     * @return TargetType 目标地址类型
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目标地址类型
     * @param TargetType 目标地址类型
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 目标地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetName 目标地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 目标地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetName 目标地址名称（当类型为模板/实例/标签时返回对应名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 目标端口 
     * @return Port 目标端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 目标端口
     * @param Port 目标端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议类型 
     * @return Protocol 协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型
     * @param Protocol 协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 规则动作：accept-放行，drop-阻断，log-观察 
     * @return RuleAction 规则动作：accept-放行，drop-阻断，log-观察
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 规则动作：accept-放行，drop-阻断，log-观察
     * @param RuleAction 规则动作：accept-放行，drop-阻断，log-观察
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则生效范围 
     * @return Scope 规则生效范围
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 规则生效范围
     * @param Scope 规则生效范围
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 地域名称1（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryName 地域名称1（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set 地域名称1（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryName 地域名称1（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * Get 地域名称2（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityName 地域名称2（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 地域名称2（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityName 地域名称2（正则匹配时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 参数模板ID（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateId 参数模板ID（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 参数模板ID（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateId 参数模板ID（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 参数模板名称（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateName 参数模板名称（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set 参数模板名称（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateName 参数模板名称（当类型为模板时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get 规则是否失效：0-有效，1-失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Invalid 规则是否失效：0-有效，1-失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 规则是否失效：0-有效，1-失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Invalid 规则是否失效：0-有效，1-失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get 规则归属的成员账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongMember 规则归属的成员账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberInfo getBelongMember() {
        return this.BelongMember;
    }

    /**
     * Set 规则归属的成员账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongMember 规则归属的成员账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongMember(MemberInfo BelongMember) {
        this.BelongMember = BelongMember;
    }

    /**
     * Get 国家Id 
     * @return CountryCode 国家Id
     */
    public Long getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 国家Id
     * @param CountryCode 国家Id
     */
    public void setCountryCode(Long CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 城市Id 
     * @return CityCode 城市Id
     */
    public Long getCityCode() {
        return this.CityCode;
    }

    /**
     * Set 城市Id
     * @param CityCode 城市Id
     */
    public void setCityCode(Long CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get 0为正常规则,1为地域规则 
     * @return IsRegion 0为正常规则,1为地域规则
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set 0为正常规则,1为地域规则
     * @param IsRegion 0为正常规则,1为地域规则
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get 云厂商code 
     * @return CloudCode 云厂商code
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商code
     * @param CloudCode 云厂商code
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get 0为正常规则,1为云厂商规则 
     * @return IsCloud 0为正常规则,1为云厂商规则
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 0为正常规则,1为云厂商规则
     * @param IsCloud 0为正常规则,1为云厂商规则
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 地区简称 
     * @return CountryKey 地区简称
     */
    public String getCountryKey() {
        return this.CountryKey;
    }

    /**
     * Set 地区简称
     * @param CountryKey 地区简称
     */
    public void setCountryKey(String CountryKey) {
        this.CountryKey = CountryKey;
    }

    /**
     * Get 省份、城市简称 
     * @return CityKey 省份、城市简称
     */
    public String getCityKey() {
        return this.CityKey;
    }

    /**
     * Set 省份、城市简称
     * @param CityKey 省份、城市简称
     */
    public void setCityKey(String CityKey) {
        this.CityKey = CityKey;
    }

    /**
     * Get 规则创建时间 
     * @return CreateTime 规则创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间
     * @param CreateTime 规则创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则最近更新时间 
     * @return UpdateTime 规则最近更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则最近更新时间
     * @param UpdateTime 规则最近更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 域名数 
     * @return DnsParseCnt 域名数
     */
    public Long getDnsParseCnt() {
        return this.DnsParseCnt;
    }

    /**
     * Set 域名数
     * @param DnsParseCnt 域名数
     */
    public void setDnsParseCnt(Long DnsParseCnt) {
        this.DnsParseCnt = DnsParseCnt;
    }

    public EdgeAclRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeAclRuleResp(EdgeAclRuleResp source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
        }
        if (source.BelongMember != null) {
            this.BelongMember = new MemberInfo(source.BelongMember);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new Long(source.CountryCode);
        }
        if (source.CityCode != null) {
            this.CityCode = new Long(source.CityCode);
        }
        if (source.IsRegion != null) {
            this.IsRegion = new Long(source.IsRegion);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
        if (source.IsCloud != null) {
            this.IsCloud = new Long(source.IsCloud);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.CountryKey != null) {
            this.CountryKey = new String(source.CountryKey);
        }
        if (source.CityKey != null) {
            this.CityKey = new String(source.CityKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DnsParseCnt != null) {
            this.DnsParseCnt = new Long(source.DnsParseCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamObj(map, prefix + "BelongMember.", this.BelongMember);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "CountryKey", this.CountryKey);
        this.setParamSimple(map, prefix + "CityKey", this.CityKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DnsParseCnt", this.DnsParseCnt);

    }
}

