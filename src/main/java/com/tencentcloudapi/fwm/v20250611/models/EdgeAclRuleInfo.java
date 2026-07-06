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

public class EdgeAclRuleInfo extends AbstractModel {

    /**
    * 规则ID，修改规则时必填
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则执行顺序，数字越小优先级越高，创建规则组时必须从1开始严格递增
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 规则方向：0-出站，1-入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 源地址内容，根据 SourceType 不同有不同的格式：ip 时为 IP/CIDR，domain 时为域名，template 时为模板ID，instance 时为实例ID列表（逗号分隔），tag 时为标签键值对（格式：key:value）
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 源地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 目标地址内容，格式同 SourceContent
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 目标地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 端口，支持单端口、端口范围和逗号分隔的多端口，如：80、1-65535、80,443,8080
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议类型：TCP、UDP、ICMP、ANY
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
    * 规则描述，长度0-256字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 生效范围：serial，串行；side，旁路；all，全局	
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 规则归属的成员账号ID（多账号场景下使用）。当 SourceType 或 TargetType 为 instance 或 tag 时，此参数必填，用于指定实例/标签所属的成员账号
    */
    @SerializedName("BelongMemberId")
    @Expose
    private String BelongMemberId;

    /**
    * 参数模板
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
     * Get 规则ID，修改规则时必填 
     * @return RuleId 规则ID，修改规则时必填
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID，修改规则时必填
     * @param RuleId 规则ID，修改规则时必填
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则执行顺序，数字越小优先级越高，创建规则组时必须从1开始严格递增 
     * @return OrderIndex 规则执行顺序，数字越小优先级越高，创建规则组时必须从1开始严格递增
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则执行顺序，数字越小优先级越高，创建规则组时必须从1开始严格递增
     * @param OrderIndex 规则执行顺序，数字越小优先级越高，创建规则组时必须从1开始严格递增
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
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
     * Get 源地址内容，根据 SourceType 不同有不同的格式：ip 时为 IP/CIDR，domain 时为域名，template 时为模板ID，instance 时为实例ID列表（逗号分隔），tag 时为标签键值对（格式：key:value） 
     * @return SourceContent 源地址内容，根据 SourceType 不同有不同的格式：ip 时为 IP/CIDR，domain 时为域名，template 时为模板ID，instance 时为实例ID列表（逗号分隔），tag 时为标签键值对（格式：key:value）
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 源地址内容，根据 SourceType 不同有不同的格式：ip 时为 IP/CIDR，domain 时为域名，template 时为模板ID，instance 时为实例ID列表（逗号分隔），tag 时为标签键值对（格式：key:value）
     * @param SourceContent 源地址内容，根据 SourceType 不同有不同的格式：ip 时为 IP/CIDR，domain 时为域名，template 时为模板ID，instance 时为实例ID列表（逗号分隔），tag 时为标签键值对（格式：key:value）
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 源地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签 
     * @return SourceType 源地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 源地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
     * @param SourceType 源地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 目标地址内容，格式同 SourceContent 
     * @return TargetContent 目标地址内容，格式同 SourceContent
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 目标地址内容，格式同 SourceContent
     * @param TargetContent 目标地址内容，格式同 SourceContent
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get 目标地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签 
     * @return TargetType 目标地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目标地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
     * @param TargetType 目标地址类型：ip-IP地址，domain-域名，template-参数模板，instance-实例，tag-标签
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 端口，支持单端口、端口范围和逗号分隔的多端口，如：80、1-65535、80,443,8080 
     * @return Port 端口，支持单端口、端口范围和逗号分隔的多端口，如：80、1-65535、80,443,8080
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口，支持单端口、端口范围和逗号分隔的多端口，如：80、1-65535、80,443,8080
     * @param Port 端口，支持单端口、端口范围和逗号分隔的多端口，如：80、1-65535、80,443,8080
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议类型：TCP、UDP、ICMP、ANY 
     * @return Protocol 协议类型：TCP、UDP、ICMP、ANY
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型：TCP、UDP、ICMP、ANY
     * @param Protocol 协议类型：TCP、UDP、ICMP、ANY
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
     * Get 规则描述，长度0-256字符 
     * @return Description 规则描述，长度0-256字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述，长度0-256字符
     * @param Description 规则描述，长度0-256字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 生效范围：serial，串行；side，旁路；all，全局	 
     * @return Scope 生效范围：serial，串行；side，旁路；all，全局	
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围：serial，串行；side，旁路；all，全局	
     * @param Scope 生效范围：serial，串行；side，旁路；all，全局	
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 规则归属的成员账号ID（多账号场景下使用）。当 SourceType 或 TargetType 为 instance 或 tag 时，此参数必填，用于指定实例/标签所属的成员账号 
     * @return BelongMemberId 规则归属的成员账号ID（多账号场景下使用）。当 SourceType 或 TargetType 为 instance 或 tag 时，此参数必填，用于指定实例/标签所属的成员账号
     */
    public String getBelongMemberId() {
        return this.BelongMemberId;
    }

    /**
     * Set 规则归属的成员账号ID（多账号场景下使用）。当 SourceType 或 TargetType 为 instance 或 tag 时，此参数必填，用于指定实例/标签所属的成员账号
     * @param BelongMemberId 规则归属的成员账号ID（多账号场景下使用）。当 SourceType 或 TargetType 为 instance 或 tag 时，此参数必填，用于指定实例/标签所属的成员账号
     */
    public void setBelongMemberId(String BelongMemberId) {
        this.BelongMemberId = BelongMemberId;
    }

    /**
     * Get 参数模板 
     * @return ParamTemplateId 参数模板
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 参数模板
     * @param ParamTemplateId 参数模板
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    public EdgeAclRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeAclRuleInfo(EdgeAclRuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
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
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
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
        if (source.BelongMemberId != null) {
            this.BelongMemberId = new String(source.BelongMemberId);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "BelongMemberId", this.BelongMemberId);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);

    }
}

