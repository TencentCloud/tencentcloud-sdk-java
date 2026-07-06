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

public class NatAclRuleResp extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 优先级
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * 规则方向：0-出向，1-入向
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
    * 源类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 源资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 目的地址内容
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 目的类型
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 动作：accept/drop/log
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
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
    * 规则生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScopeDesc")
    @Expose
    private String ScopeDesc;

    /**
    * 防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * 国家名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
    * 城市名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 国家代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryCode")
    @Expose
    private Long CountryCode;

    /**
    * 城市代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityCode")
    @Expose
    private Long CityCode;

    /**
    * 国家键值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryKey")
    @Expose
    private String CountryKey;

    /**
    * 城市键值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityKey")
    @Expose
    private String CityKey;

    /**
    * 是否地域规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * 云厂商代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * 是否云厂商规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
    * 端口模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 端口模板名称
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
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 优先级 
     * @return Sequence 优先级
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 优先级
     * @param Sequence 优先级
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 规则方向：0-出向，1-入向 
     * @return Direction 规则方向：0-出向，1-入向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：0-出向，1-入向
     * @param Direction 规则方向：0-出向，1-入向
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
     * Get 源类型 
     * @return SourceType 源类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 源类型
     * @param SourceType 源类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 源资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceName 源资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 源资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceName 源资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 目的地址内容 
     * @return TargetContent 目的地址内容
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 目的地址内容
     * @param TargetContent 目的地址内容
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get 目的类型 
     * @return TargetType 目的类型
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目的类型
     * @param TargetType 目的类型
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetName 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetName 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 动作：accept/drop/log 
     * @return RuleAction 动作：accept/drop/log
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 动作：accept/drop/log
     * @param RuleAction 动作：accept/drop/log
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 规则生效范围描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScopeDesc 规则生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScopeDesc() {
        return this.ScopeDesc;
    }

    /**
     * Set 规则生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScopeDesc 规则生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScopeDesc(String ScopeDesc) {
        this.ScopeDesc = ScopeDesc;
    }

    /**
     * Get 防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsId 防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set 防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsId 防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get 国家名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryName 国家名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set 国家名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryName 国家名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * Get 城市名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityName 城市名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 城市名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityName 城市名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 国家代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryCode 国家代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 国家代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryCode 国家代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryCode(Long CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 城市代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityCode 城市代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCityCode() {
        return this.CityCode;
    }

    /**
     * Set 城市代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityCode 城市代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityCode(Long CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get 国家键值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryKey 国家键值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountryKey() {
        return this.CountryKey;
    }

    /**
     * Set 国家键值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryKey 国家键值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryKey(String CountryKey) {
        this.CountryKey = CountryKey;
    }

    /**
     * Get 城市键值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityKey 城市键值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityKey() {
        return this.CityKey;
    }

    /**
     * Set 城市键值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityKey 城市键值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityKey(String CityKey) {
        this.CityKey = CityKey;
    }

    /**
     * Get 是否地域规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRegion 是否地域规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set 是否地域规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRegion 是否地域规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get 云厂商代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudCode 云厂商代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudCode 云厂商代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get 是否云厂商规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCloud 是否云厂商规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 是否云厂商规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCloud 是否云厂商规则：0-否，1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get 端口模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateId 端口模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 端口模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateId 端口模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 端口模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateName 端口模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set 端口模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateName 端口模板名称
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
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
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

    public NatAclRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatAclRuleResp(NatAclRuleResp source) {
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
        if (source.ScopeDesc != null) {
            this.ScopeDesc = new String(source.ScopeDesc);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new Long(source.CountryCode);
        }
        if (source.CityCode != null) {
            this.CityCode = new Long(source.CityCode);
        }
        if (source.CountryKey != null) {
            this.CountryKey = new String(source.CountryKey);
        }
        if (source.CityKey != null) {
            this.CityKey = new String(source.CityKey);
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
        this.setParamSimple(map, prefix + "ScopeDesc", this.ScopeDesc);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "CountryKey", this.CountryKey);
        this.setParamSimple(map, prefix + "CityKey", this.CityKey);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamObj(map, prefix + "BelongMember.", this.BelongMember);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DnsParseCnt", this.DnsParseCnt);

    }
}

