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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwRulesRequest extends AbstractModel {

    /**
    * <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
    */
    @SerializedName("ListType")
    @Expose
    private String ListType;

    /**
    * <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private Long RuleAction;

    /**
    * <p>启用状态过滤。可选。默认只返回启用规则；传 false 只查询禁用规则。</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>是否同时包含启用和禁用规则。可选。true 表示包含两类；不能和 Enabled 同时使用。</p>
    */
    @SerializedName("IncludeDisabled")
    @Expose
    private Boolean IncludeDisabled;

    /**
    * <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>精确公开规则标识过滤。可选。推荐在用户提供规则标识时使用。</p>
    */
    @SerializedName("RuleUuid")
    @Expose
    private String RuleUuid;

    /**
    * <p>协议过滤。可选。例如 TCP、UDP、ICMP、HTTP、HTTPS、ANY；不传则不过滤。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>源地址或源内容关键字过滤。可选，支持模糊匹配。</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>目的地址、目的域名或目的内容关键字过滤。可选，支持模糊匹配。</p>
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * <p>规则描述关键字过滤。可选。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>入侵防御列表关键字搜索。可选，最大 100 字符。blocklist 搜索 ioc/address/comment/rule_source；whitelist 搜索 rule_name/ioc/comment/src_ip/dst_ip；isolate 搜索实例、公网 IP、内网 IP、VPC、地域。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>精确实例 ID 过滤。仅 RuleType=intrusion_prevention 且 ListType=isolate 时使用；写操作前后核验应使用该参数而不是 Keyword。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否展开模板、资产组、实例等名称。可选，默认 true；传 false 返回原始标识。</p>
    */
    @SerializedName("ExpandNames")
    @Expose
    private Boolean ExpandNames;

    /**
    * <p>单页返回规则数。可选，默认 100，最大 1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移。可选，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p> 
     * @return RuleType <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
     * @param RuleType <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p> 
     * @return ListType <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
     */
    public String getListType() {
        return this.ListType;
    }

    /**
     * Set <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
     * @param ListType <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
     */
    public void setListType(String ListType) {
        this.ListType = ListType;
    }

    /**
     * Get <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p> 
     * @return Direction <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
     * @param Direction <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p> 
     * @return RuleAction <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
     */
    public Long getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
     * @param RuleAction <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
     */
    public void setRuleAction(Long RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>启用状态过滤。可选。默认只返回启用规则；传 false 只查询禁用规则。</p> 
     * @return Enabled <p>启用状态过滤。可选。默认只返回启用规则；传 false 只查询禁用规则。</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>启用状态过滤。可选。默认只返回启用规则；传 false 只查询禁用规则。</p>
     * @param Enabled <p>启用状态过滤。可选。默认只返回启用规则；传 false 只查询禁用规则。</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>是否同时包含启用和禁用规则。可选。true 表示包含两类；不能和 Enabled 同时使用。</p> 
     * @return IncludeDisabled <p>是否同时包含启用和禁用规则。可选。true 表示包含两类；不能和 Enabled 同时使用。</p>
     */
    public Boolean getIncludeDisabled() {
        return this.IncludeDisabled;
    }

    /**
     * Set <p>是否同时包含启用和禁用规则。可选。true 表示包含两类；不能和 Enabled 同时使用。</p>
     * @param IncludeDisabled <p>是否同时包含启用和禁用规则。可选。true 表示包含两类；不能和 Enabled 同时使用。</p>
     */
    public void setIncludeDisabled(Boolean IncludeDisabled) {
        this.IncludeDisabled = IncludeDisabled;
    }

    /**
     * Get <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p> 
     * @return RuleId <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
     * @param RuleId <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>精确公开规则标识过滤。可选。推荐在用户提供规则标识时使用。</p> 
     * @return RuleUuid <p>精确公开规则标识过滤。可选。推荐在用户提供规则标识时使用。</p>
     */
    public String getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set <p>精确公开规则标识过滤。可选。推荐在用户提供规则标识时使用。</p>
     * @param RuleUuid <p>精确公开规则标识过滤。可选。推荐在用户提供规则标识时使用。</p>
     */
    public void setRuleUuid(String RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get <p>协议过滤。可选。例如 TCP、UDP、ICMP、HTTP、HTTPS、ANY；不传则不过滤。</p> 
     * @return Protocol <p>协议过滤。可选。例如 TCP、UDP、ICMP、HTTP、HTTPS、ANY；不传则不过滤。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议过滤。可选。例如 TCP、UDP、ICMP、HTTP、HTTPS、ANY；不传则不过滤。</p>
     * @param Protocol <p>协议过滤。可选。例如 TCP、UDP、ICMP、HTTP、HTTPS、ANY；不传则不过滤。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>源地址或源内容关键字过滤。可选，支持模糊匹配。</p> 
     * @return SrcIp <p>源地址或源内容关键字过滤。可选，支持模糊匹配。</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>源地址或源内容关键字过滤。可选，支持模糊匹配。</p>
     * @param SrcIp <p>源地址或源内容关键字过滤。可选，支持模糊匹配。</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>目的地址、目的域名或目的内容关键字过滤。可选，支持模糊匹配。</p> 
     * @return DstIp <p>目的地址、目的域名或目的内容关键字过滤。可选，支持模糊匹配。</p>
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set <p>目的地址、目的域名或目的内容关键字过滤。可选，支持模糊匹配。</p>
     * @param DstIp <p>目的地址、目的域名或目的内容关键字过滤。可选，支持模糊匹配。</p>
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get <p>规则描述关键字过滤。可选。</p> 
     * @return Description <p>规则描述关键字过滤。可选。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述关键字过滤。可选。</p>
     * @param Description <p>规则描述关键字过滤。可选。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>入侵防御列表关键字搜索。可选，最大 100 字符。blocklist 搜索 ioc/address/comment/rule_source；whitelist 搜索 rule_name/ioc/comment/src_ip/dst_ip；isolate 搜索实例、公网 IP、内网 IP、VPC、地域。</p> 
     * @return Keyword <p>入侵防御列表关键字搜索。可选，最大 100 字符。blocklist 搜索 ioc/address/comment/rule_source；whitelist 搜索 rule_name/ioc/comment/src_ip/dst_ip；isolate 搜索实例、公网 IP、内网 IP、VPC、地域。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>入侵防御列表关键字搜索。可选，最大 100 字符。blocklist 搜索 ioc/address/comment/rule_source；whitelist 搜索 rule_name/ioc/comment/src_ip/dst_ip；isolate 搜索实例、公网 IP、内网 IP、VPC、地域。</p>
     * @param Keyword <p>入侵防御列表关键字搜索。可选，最大 100 字符。blocklist 搜索 ioc/address/comment/rule_source；whitelist 搜索 rule_name/ioc/comment/src_ip/dst_ip；isolate 搜索实例、公网 IP、内网 IP、VPC、地域。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>精确实例 ID 过滤。仅 RuleType=intrusion_prevention 且 ListType=isolate 时使用；写操作前后核验应使用该参数而不是 Keyword。</p> 
     * @return InstanceId <p>精确实例 ID 过滤。仅 RuleType=intrusion_prevention 且 ListType=isolate 时使用；写操作前后核验应使用该参数而不是 Keyword。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>精确实例 ID 过滤。仅 RuleType=intrusion_prevention 且 ListType=isolate 时使用；写操作前后核验应使用该参数而不是 Keyword。</p>
     * @param InstanceId <p>精确实例 ID 过滤。仅 RuleType=intrusion_prevention 且 ListType=isolate 时使用；写操作前后核验应使用该参数而不是 Keyword。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否展开模板、资产组、实例等名称。可选，默认 true；传 false 返回原始标识。</p> 
     * @return ExpandNames <p>是否展开模板、资产组、实例等名称。可选，默认 true；传 false 返回原始标识。</p>
     */
    public Boolean getExpandNames() {
        return this.ExpandNames;
    }

    /**
     * Set <p>是否展开模板、资产组、实例等名称。可选，默认 true；传 false 返回原始标识。</p>
     * @param ExpandNames <p>是否展开模板、资产组、实例等名称。可选，默认 true；传 false 返回原始标识。</p>
     */
    public void setExpandNames(Boolean ExpandNames) {
        this.ExpandNames = ExpandNames;
    }

    /**
     * Get <p>单页返回规则数。可选，默认 100，最大 1000。</p> 
     * @return Limit <p>单页返回规则数。可选，默认 100，最大 1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页返回规则数。可选，默认 100，最大 1000。</p>
     * @param Limit <p>单页返回规则数。可选，默认 100，最大 1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移。可选，默认 0。</p> 
     * @return Offset <p>分页偏移。可选，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移。可选，默认 0。</p>
     * @param Offset <p>分页偏移。可选，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCfwRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwRulesRequest(DescribeCfwRulesRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.ListType != null) {
            this.ListType = new String(source.ListType);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new Long(source.RuleAction);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.IncludeDisabled != null) {
            this.IncludeDisabled = new Boolean(source.IncludeDisabled);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleUuid != null) {
            this.RuleUuid = new String(source.RuleUuid);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExpandNames != null) {
            this.ExpandNames = new Boolean(source.ExpandNames);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "ListType", this.ListType);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "IncludeDisabled", this.IncludeDisabled);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExpandNames", this.ExpandNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

