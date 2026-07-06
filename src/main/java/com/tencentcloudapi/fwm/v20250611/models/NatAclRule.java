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

public class NatAclRule extends AbstractModel {

    /**
    * 源地址内容
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 源类型：ip/url/template/instance/tag
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 目的地址内容
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 目的类型：ip/url/template/instance/tag
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等
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
    * 优先级（从1开始）
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 规则方向：1-入站规则，0-出站规则
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 规则ID（修改时必填）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 端口（ICMP协议时为空）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 端口模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 规则归属的成员账号ID（当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongMemberId")
    @Expose
    private String BelongMemberId;

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
     * Get 源类型：ip/url/template/instance/tag 
     * @return SourceType 源类型：ip/url/template/instance/tag
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 源类型：ip/url/template/instance/tag
     * @param SourceType 源类型：ip/url/template/instance/tag
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
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
     * Get 目的类型：ip/url/template/instance/tag 
     * @return TargetType 目的类型：ip/url/template/instance/tag
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目的类型：ip/url/template/instance/tag
     * @param TargetType 目的类型：ip/url/template/instance/tag
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等 
     * @return Protocol 协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等
     * @param Protocol 协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等
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
     * Get 优先级（从1开始） 
     * @return OrderIndex 优先级（从1开始）
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 优先级（从1开始）
     * @param OrderIndex 优先级（从1开始）
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效 
     * @return Scope 规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效
     * @param Scope 规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 规则方向：1-入站规则，0-出站规则 
     * @return Direction 规则方向：1-入站规则，0-出站规则
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1-入站规则，0-出站规则
     * @param Direction 规则方向：1-入站规则，0-出站规则
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 规则ID（修改时必填）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID（修改时必填）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID（修改时必填）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID（修改时必填）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 端口（ICMP协议时为空）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口（ICMP协议时为空）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口（ICMP协议时为空）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口（ICMP协议时为空）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
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
     * Get 规则归属的成员账号ID（当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongMemberId 规则归属的成员账号ID（当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBelongMemberId() {
        return this.BelongMemberId;
    }

    /**
     * Set 规则归属的成员账号ID（当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongMemberId 规则归属的成员账号ID（当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongMemberId(String BelongMemberId) {
        this.BelongMemberId = BelongMemberId;
    }

    public NatAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatAclRule(NatAclRule source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.BelongMemberId != null) {
            this.BelongMemberId = new String(source.BelongMemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "BelongMemberId", this.BelongMemberId);

    }
}

