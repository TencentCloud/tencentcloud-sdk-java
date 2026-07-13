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
    * <p>源地址内容</p>
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * <p>源类型：ip/url/template/instance/tag</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>目的地址内容</p>
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * <p>目的类型：ip/url/template/instance/tag</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>动作：accept/drop/log</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>优先级（从1开始）</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>规则方向：1-入站规则，0-出站规则</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则ID（修改时必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>端口（ICMP协议时为空）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>规则描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>端口模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>规则归属的成员账号ID(当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongMemberId")
    @Expose
    private String BelongMemberId;

    /**
     * Get <p>源地址内容</p> 
     * @return SourceContent <p>源地址内容</p>
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set <p>源地址内容</p>
     * @param SourceContent <p>源地址内容</p>
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get <p>源类型：ip/url/template/instance/tag</p> 
     * @return SourceType <p>源类型：ip/url/template/instance/tag</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>源类型：ip/url/template/instance/tag</p>
     * @param SourceType <p>源类型：ip/url/template/instance/tag</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>目的地址内容</p> 
     * @return TargetContent <p>目的地址内容</p>
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set <p>目的地址内容</p>
     * @param TargetContent <p>目的地址内容</p>
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get <p>目的类型：ip/url/template/instance/tag</p> 
     * @return TargetType <p>目的类型：ip/url/template/instance/tag</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>目的类型：ip/url/template/instance/tag</p>
     * @param TargetType <p>目的类型：ip/url/template/instance/tag</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等</p> 
     * @return Protocol <p>协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等</p>
     * @param Protocol <p>协议：TCP/UDP/ICMP/ANY/HTTP/HTTPS/DNS/FTP等</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>动作：accept/drop/log</p> 
     * @return RuleAction <p>动作：accept/drop/log</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>动作：accept/drop/log</p>
     * @param RuleAction <p>动作：accept/drop/log</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>优先级（从1开始）</p> 
     * @return OrderIndex <p>优先级（从1开始）</p>
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set <p>优先级（从1开始）</p>
     * @param OrderIndex <p>优先级（从1开始）</p>
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get <p>规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效</p> 
     * @return Scope <p>规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效</p>
     * @param Scope <p>规则生效范围：ALL-全局生效，ap-xxx-地域生效，cfwnat-xxx-NAT防火墙实例生效</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>规则方向：1-入站规则，0-出站规则</p> 
     * @return Direction <p>规则方向：1-入站规则，0-出站规则</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>规则方向：1-入站规则，0-出站规则</p>
     * @param Direction <p>规则方向：1-入站规则，0-出站规则</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则ID（修改时必填）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId <p>规则ID（修改时必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID（修改时必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId <p>规则ID（修改时必填）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>端口（ICMP协议时为空）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>端口（ICMP协议时为空）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口（ICMP协议时为空）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>端口（ICMP协议时为空）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>规则描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>规则描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>规则描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>端口模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateId <p>端口模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>端口模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateId <p>端口模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>规则归属的成员账号ID(当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongMemberId <p>规则归属的成员账号ID(当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBelongMemberId() {
        return this.BelongMemberId;
    }

    /**
     * Set <p>规则归属的成员账号ID(当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongMemberId <p>规则归属的成员账号ID(当Scope为cfwnat-xxx或SourceType/DestType为instance/tag时必填)</p>
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

