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

public class VpcAclRuleResp extends AbstractModel {

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
    * IP版本：ipv4或ipv6
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

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
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 目的类型
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestName")
    @Expose
    private String DestName;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

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
    * 边界防火墙ID
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 防火墙实例ID
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 规则是否失效：0-有效，1-失效
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
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则修改时间
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
    * 防火墙组名称
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

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
     * Get IP版本：ipv4或ipv6 
     * @return IpVersion IP版本：ipv4或ipv6
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本：ipv4或ipv6
     * @param IpVersion IP版本：ipv4或ipv6
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
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
     * @return DestContent 目的地址内容
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 目的地址内容
     * @param DestContent 目的地址内容
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 目的类型 
     * @return DestType 目的类型
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 目的类型
     * @param DestType 目的类型
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestName 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestName() {
        return this.DestName;
    }

    /**
     * Set 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestName 目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestName(String DestName) {
        this.DestName = DestName;
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
     * Get 边界防火墙ID 
     * @return EdgeId 边界防火墙ID
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 边界防火墙ID
     * @param EdgeId 边界防火墙ID
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 防火墙实例ID 
     * @return FwGroupId 防火墙实例ID
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙实例ID
     * @param FwGroupId 防火墙实例ID
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 规则是否失效：0-有效，1-失效 
     * @return Invalid 规则是否失效：0-有效，1-失效
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 规则是否失效：0-有效，1-失效
     * @param Invalid 规则是否失效：0-有效，1-失效
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
     * Get 规则修改时间 
     * @return UpdateTime 规则修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则修改时间
     * @param UpdateTime 规则修改时间
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

    /**
     * Get 防火墙组名称 
     * @return FwGroupName 防火墙组名称
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 防火墙组名称
     * @param FwGroupName 防火墙组名称
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    public VpcAclRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcAclRuleResp(VpcAclRuleResp source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
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
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.DestName != null) {
            this.DestName = new String(source.DestName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
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
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "DestName", this.DestName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamObj(map, prefix + "BelongMember.", this.BelongMember);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DnsParseCnt", this.DnsParseCnt);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);

    }
}

