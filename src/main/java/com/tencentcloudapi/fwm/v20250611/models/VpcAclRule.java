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

public class VpcAclRule extends AbstractModel {

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
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 目的类型：ip/url/template/instance/tag
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

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
    * 边界防火墙ID：ALL表示全局，CFWS-xxx表示指定边界
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 防火墙实例ID（规则生效范围）：ALL-全局生效，ccn-xxx-云联网实例，cfwg-xxx-防火墙组实例
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 规则ID（修改时必填）
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 端口（ICMP协议时为空）
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 端口模板ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 规则归属的成员账号ID（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填）
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
     * Get 目的类型：ip/url/template/instance/tag 
     * @return DestType 目的类型：ip/url/template/instance/tag
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 目的类型：ip/url/template/instance/tag
     * @param DestType 目的类型：ip/url/template/instance/tag
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
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
     * Get 边界防火墙ID：ALL表示全局，CFWS-xxx表示指定边界 
     * @return EdgeId 边界防火墙ID：ALL表示全局，CFWS-xxx表示指定边界
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 边界防火墙ID：ALL表示全局，CFWS-xxx表示指定边界
     * @param EdgeId 边界防火墙ID：ALL表示全局，CFWS-xxx表示指定边界
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 防火墙实例ID（规则生效范围）：ALL-全局生效，ccn-xxx-云联网实例，cfwg-xxx-防火墙组实例 
     * @return FwGroupId 防火墙实例ID（规则生效范围）：ALL-全局生效，ccn-xxx-云联网实例，cfwg-xxx-防火墙组实例
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙实例ID（规则生效范围）：ALL-全局生效，ccn-xxx-云联网实例，cfwg-xxx-防火墙组实例
     * @param FwGroupId 防火墙实例ID（规则生效范围）：ALL-全局生效，ccn-xxx-云联网实例，cfwg-xxx-防火墙组实例
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 规则ID（修改时必填） 
     * @return RuleId 规则ID（修改时必填）
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID（修改时必填）
     * @param RuleId 规则ID（修改时必填）
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 端口（ICMP协议时为空） 
     * @return Port 端口（ICMP协议时为空）
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口（ICMP协议时为空）
     * @param Port 端口（ICMP协议时为空）
     */
    public void setPort(String Port) {
        this.Port = Port;
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
     * Get 端口模板ID 
     * @return ParamTemplateId 端口模板ID
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 端口模板ID
     * @param ParamTemplateId 端口模板ID
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
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

    public VpcAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcAclRule(VpcAclRule source) {
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
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
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
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "BelongMemberId", this.BelongMemberId);

    }
}

