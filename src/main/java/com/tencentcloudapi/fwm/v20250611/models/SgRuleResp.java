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

public class SgRuleResp extends AbstractModel {

    /**
    * 规则Id
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
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * ip类型
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 源内容
    */
    @SerializedName("SrcContent")
    @Expose
    private String SrcContent;

    /**
    * 源类型
    */
    @SerializedName("SrcType")
    @Expose
    private String SrcType;

    /**
    * 目的内容
    */
    @SerializedName("DstContent")
    @Expose
    private String DstContent;

    /**
    * 目的类型
    */
    @SerializedName("DstType")
    @Expose
    private String DstType;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 协议端口参数模板
    */
    @SerializedName("ProtocolPortType")
    @Expose
    private Long ProtocolPortType;

    /**
    * 协议端口参数模板id
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 端口段,支持单端口,多端口和端口段
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * 策略，1阻断，2放行
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 规则来源，0为用户控制台添加
    */
    @SerializedName("RuleSource")
    @Expose
    private String RuleSource;

    /**
    * 生效范围,字节位,1:SG 企业安全组,2:LH 轻量服务器
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
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
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

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
     * Get 源内容 
     * @return SrcContent 源内容
     */
    public String getSrcContent() {
        return this.SrcContent;
    }

    /**
     * Set 源内容
     * @param SrcContent 源内容
     */
    public void setSrcContent(String SrcContent) {
        this.SrcContent = SrcContent;
    }

    /**
     * Get 源类型 
     * @return SrcType 源类型
     */
    public String getSrcType() {
        return this.SrcType;
    }

    /**
     * Set 源类型
     * @param SrcType 源类型
     */
    public void setSrcType(String SrcType) {
        this.SrcType = SrcType;
    }

    /**
     * Get 目的内容 
     * @return DstContent 目的内容
     */
    public String getDstContent() {
        return this.DstContent;
    }

    /**
     * Set 目的内容
     * @param DstContent 目的内容
     */
    public void setDstContent(String DstContent) {
        this.DstContent = DstContent;
    }

    /**
     * Get 目的类型 
     * @return DstType 目的类型
     */
    public String getDstType() {
        return this.DstType;
    }

    /**
     * Set 目的类型
     * @param DstType 目的类型
     */
    public void setDstType(String DstType) {
        this.DstType = DstType;
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
     * Get 协议端口参数模板 
     * @return ProtocolPortType 协议端口参数模板
     */
    public Long getProtocolPortType() {
        return this.ProtocolPortType;
    }

    /**
     * Set 协议端口参数模板
     * @param ProtocolPortType 协议端口参数模板
     */
    public void setProtocolPortType(Long ProtocolPortType) {
        this.ProtocolPortType = ProtocolPortType;
    }

    /**
     * Get 协议端口参数模板id 
     * @return ServiceTemplateId 协议端口参数模板id
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 协议端口参数模板id
     * @param ServiceTemplateId 协议端口参数模板id
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 端口段,支持单端口,多端口和端口段 
     * @return DstPort 端口段,支持单端口,多端口和端口段
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 端口段,支持单端口,多端口和端口段
     * @param DstPort 端口段,支持单端口,多端口和端口段
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 策略，1阻断，2放行 
     * @return RuleAction 策略，1阻断，2放行
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 策略，1阻断，2放行
     * @param RuleAction 策略，1阻断，2放行
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 规则来源，0为用户控制台添加 
     * @return RuleSource 规则来源，0为用户控制台添加
     */
    public String getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set 规则来源，0为用户控制台添加
     * @param RuleSource 规则来源，0为用户控制台添加
     */
    public void setRuleSource(String RuleSource) {
        this.RuleSource = RuleSource;
    }

    /**
     * Get 生效范围,字节位,1:SG 企业安全组,2:LH 轻量服务器 
     * @return Scope 生效范围,字节位,1:SG 企业安全组,2:LH 轻量服务器
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围,字节位,1:SG 企业安全组,2:LH 轻量服务器
     * @param Scope 生效范围,字节位,1:SG 企业安全组,2:LH 轻量服务器
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public SgRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SgRuleResp(SgRuleResp source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.SrcContent != null) {
            this.SrcContent = new String(source.SrcContent);
        }
        if (source.SrcType != null) {
            this.SrcType = new String(source.SrcType);
        }
        if (source.DstContent != null) {
            this.DstContent = new String(source.DstContent);
        }
        if (source.DstType != null) {
            this.DstType = new String(source.DstType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ProtocolPortType != null) {
            this.ProtocolPortType = new Long(source.ProtocolPortType);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.RuleSource != null) {
            this.RuleSource = new String(source.RuleSource);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SrcContent", this.SrcContent);
        this.setParamSimple(map, prefix + "SrcType", this.SrcType);
        this.setParamSimple(map, prefix + "DstContent", this.DstContent);
        this.setParamSimple(map, prefix + "DstType", this.DstType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ProtocolPortType", this.ProtocolPortType);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "RuleSource", this.RuleSource);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

