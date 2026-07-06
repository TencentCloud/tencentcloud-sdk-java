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

public class SecurityGroupRule extends AbstractModel {

    /**
    * ip类型
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 源地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 目的地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 目的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
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
    * 模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * rule id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 生效范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 端口类型
    */
    @SerializedName("ProtocolPortType")
    @Expose
    private Long ProtocolPortType;

    /**
    * 规则归属的成员账号ID（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填）
    */
    @SerializedName("BelongMemberId")
    @Expose
    private String BelongMemberId;

    /**
     * Get ip类型 
     * @return IpVersion ip类型
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set ip类型
     * @param IpVersion ip类型
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 源地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceContent 源地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 源地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceContent 源地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 目的地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestContent 目的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 目的地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestContent 目的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 目的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestType 目的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 目的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestType 目的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTemplateId 模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTemplateId 模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleAction 动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleAction 动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderIndex 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderIndex 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get rule id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId rule id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set rule id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId rule id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 生效范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 生效范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 生效范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 端口类型 
     * @return ProtocolPortType 端口类型
     */
    public Long getProtocolPortType() {
        return this.ProtocolPortType;
    }

    /**
     * Set 端口类型
     * @param ProtocolPortType 端口类型
     */
    public void setProtocolPortType(Long ProtocolPortType) {
        this.ProtocolPortType = ProtocolPortType;
    }

    /**
     * Get 规则归属的成员账号ID（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填） 
     * @return BelongMemberId 规则归属的成员账号ID（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填）
     */
    public String getBelongMemberId() {
        return this.BelongMemberId;
    }

    /**
     * Set 规则归属的成员账号ID（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填）
     * @param BelongMemberId 规则归属的成员账号ID（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填）
     */
    public void setBelongMemberId(String BelongMemberId) {
        this.BelongMemberId = BelongMemberId;
    }

    public SecurityGroupRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRule(SecurityGroupRule source) {
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ProtocolPortType != null) {
            this.ProtocolPortType = new Long(source.ProtocolPortType);
        }
        if (source.BelongMemberId != null) {
            this.BelongMemberId = new String(source.BelongMemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ProtocolPortType", this.ProtocolPortType);
        this.setParamSimple(map, prefix + "BelongMemberId", this.BelongMemberId);

    }
}

