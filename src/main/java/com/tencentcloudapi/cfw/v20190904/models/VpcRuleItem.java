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

public class VpcRuleItem extends AbstractModel {

    /**
    * 规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。归一化后的目的内容超过 1023 字节时请求失败。
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 访问目的类型，不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，domain 表示 FQDN 匹配，dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。url 虽可被通用类型映射识别，但 VPC 目的内容不支持。地址模板和部分域名模式要求当前 VPC 防火墙引擎支持对应能力；类型及模板实际类型共同决定 DestContent 和 Protocol 的校验。
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 边，cfws- 前缀表示指定 VPC 边；其它格式无效。ALL 要求当前环境支持 VPC 全局规则。
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 规则状态，不区分大小写：true 表示启用，false 表示禁用。省略或为空时使用账号默认状态；没有可用默认值时启用。
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则在相同 IpVersion 下的顺序。-1 表示追加到末尾；正序号表示在对应位置插入并顺延后续规则。0、其它负数及超范围值不应使用。批量新增按 Rules 顺序依次处理。
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 访问端口。除 ICMP 和 ICMPV6 外，支持逗号分隔的正整数单端口或“起始/结束”范围，且起始值不大于结束值；-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略该字段；FTP 仅支持单个正整数端口。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议名称，不区分大小写并归一化。ANY 表示不限定协议，不表示省略 Protocol。IP、instance、tag、group 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标；其它值返回参数错误。
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 访问源内容，格式由 SourceType 决定：net/ip 使用最多 10 个逗号分隔的 IP 或 CIDR；template 使用当前账号且匹配 IpVersion 的 IP 地址模板 ID，不支持域名模板；instance、tag 必须属于当前账号，instance 须有对应 IpVersion 的私网地址；group 使用资源组 ID。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问源类型，不区分大小写：net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，tag 表示资源标签，group 表示资产分组。类型及模板实际类型决定 SourceContent 的格式；template 要求当前环境支持地址模板。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * 规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * 目的实际类型提示，例如区分 IP 地址模板和域名地址模板；新增和修改请求中忽略。
    */
    @SerializedName("DestValueType")
    @Expose
    private String DestValueType;

    /**
    * 规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
    */
    @SerializedName("DetectedTimes")
    @Expose
    private Long DetectedTimes;

    /**
    * EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * 规则生效的防火墙组或 CCN 范围，不区分大小写。支持 ALL、cfwg- 前缀和 ccn- 前缀；省略、为空或格式无效时按 ALL 处理。
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * 覆盖导入规则标识。仅 batch_import_cover 接受正整数值；其它新增方式和修改请求中忽略。
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * 查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * IP 版本：0 表示 IPv4，1 表示 IPv6；省略或传入其它整数时按 IPv4 处理。instance 和 IP 地址模板须匹配该版本；直接填写的 net IP/CIDR 也应使用相同版本。
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * 端口协议组 ID。省略或为空时使用 Protocol 和 Port；非空时必须是当前账号可用的端口协议组，组内协议端口须满足目的类型限制。Protocol 和非 ICMP/ICMPV6 的 Port 仍须使用有效格式。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * 规则位置展示值：1 表示最前，2 表示中间，3 表示最后。新增和修改请求中忽略；仅位置为 2 的规则可修改。
    */
    @SerializedName("RulePartition")
    @Expose
    private Long RulePartition;

    /**
    * 访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 规则 ID。修改时必须提供当前账号已有且可修改的正整数 Uuid，并完整替换该规则。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 可使用正整数 ID，非正数值由系统分配。
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
     * Get 规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。 
     * @return Description 规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。
     * @param Description 规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。归一化后的目的内容超过 1023 字节时请求失败。 
     * @return DestContent 访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。归一化后的目的内容超过 1023 字节时请求失败。
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。归一化后的目的内容超过 1023 字节时请求失败。
     * @param DestContent 访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。归一化后的目的内容超过 1023 字节时请求失败。
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 访问目的类型，不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，domain 表示 FQDN 匹配，dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。url 虽可被通用类型映射识别，但 VPC 目的内容不支持。地址模板和部分域名模式要求当前 VPC 防火墙引擎支持对应能力；类型及模板实际类型共同决定 DestContent 和 Protocol 的校验。 
     * @return DestType 访问目的类型，不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，domain 表示 FQDN 匹配，dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。url 虽可被通用类型映射识别，但 VPC 目的内容不支持。地址模板和部分域名模式要求当前 VPC 防火墙引擎支持对应能力；类型及模板实际类型共同决定 DestContent 和 Protocol 的校验。
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 访问目的类型，不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，domain 表示 FQDN 匹配，dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。url 虽可被通用类型映射识别，但 VPC 目的内容不支持。地址模板和部分域名模式要求当前 VPC 防火墙引擎支持对应能力；类型及模板实际类型共同决定 DestContent 和 Protocol 的校验。
     * @param DestType 访问目的类型，不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，domain 表示 FQDN 匹配，dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。url 虽可被通用类型映射识别，但 VPC 目的内容不支持。地址模板和部分域名模式要求当前 VPC 防火墙引擎支持对应能力；类型及模板实际类型共同决定 DestContent 和 Protocol 的校验。
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 边，cfws- 前缀表示指定 VPC 边；其它格式无效。ALL 要求当前环境支持 VPC 全局规则。 
     * @return EdgeId 规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 边，cfws- 前缀表示指定 VPC 边；其它格式无效。ALL 要求当前环境支持 VPC 全局规则。
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 边，cfws- 前缀表示指定 VPC 边；其它格式无效。ALL 要求当前环境支持 VPC 全局规则。
     * @param EdgeId 规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 边，cfws- 前缀表示指定 VPC 边；其它格式无效。ALL 要求当前环境支持 VPC 全局规则。
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 规则状态，不区分大小写：true 表示启用，false 表示禁用。省略或为空时使用账号默认状态；没有可用默认值时启用。 
     * @return Enable 规则状态，不区分大小写：true 表示启用，false 表示禁用。省略或为空时使用账号默认状态；没有可用默认值时启用。
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则状态，不区分大小写：true 表示启用，false 表示禁用。省略或为空时使用账号默认状态；没有可用默认值时启用。
     * @param Enable 规则状态，不区分大小写：true 表示启用，false 表示禁用。省略或为空时使用账号默认状态；没有可用默认值时启用。
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 规则在相同 IpVersion 下的顺序。-1 表示追加到末尾；正序号表示在对应位置插入并顺延后续规则。0、其它负数及超范围值不应使用。批量新增按 Rules 顺序依次处理。 
     * @return OrderIndex 规则在相同 IpVersion 下的顺序。-1 表示追加到末尾；正序号表示在对应位置插入并顺延后续规则。0、其它负数及超范围值不应使用。批量新增按 Rules 顺序依次处理。
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则在相同 IpVersion 下的顺序。-1 表示追加到末尾；正序号表示在对应位置插入并顺延后续规则。0、其它负数及超范围值不应使用。批量新增按 Rules 顺序依次处理。
     * @param OrderIndex 规则在相同 IpVersion 下的顺序。-1 表示追加到末尾；正序号表示在对应位置插入并顺延后续规则。0、其它负数及超范围值不应使用。批量新增按 Rules 顺序依次处理。
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 访问端口。除 ICMP 和 ICMPV6 外，支持逗号分隔的正整数单端口或“起始/结束”范围，且起始值不大于结束值；-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略该字段；FTP 仅支持单个正整数端口。 
     * @return Port 访问端口。除 ICMP 和 ICMPV6 外，支持逗号分隔的正整数单端口或“起始/结束”范围，且起始值不大于结束值；-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略该字段；FTP 仅支持单个正整数端口。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问端口。除 ICMP 和 ICMPV6 外，支持逗号分隔的正整数单端口或“起始/结束”范围，且起始值不大于结束值；-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略该字段；FTP 仅支持单个正整数端口。
     * @param Port 访问端口。除 ICMP 和 ICMPV6 外，支持逗号分隔的正整数单端口或“起始/结束”范围，且起始值不大于结束值；-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略该字段；FTP 仅支持单个正整数端口。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议名称，不区分大小写并归一化。ANY 表示不限定协议，不表示省略 Protocol。IP、instance、tag、group 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。 
     * @return Protocol 协议名称，不区分大小写并归一化。ANY 表示不限定协议，不表示省略 Protocol。IP、instance、tag、group 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议名称，不区分大小写并归一化。ANY 表示不限定协议，不表示省略 Protocol。IP、instance、tag、group 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。
     * @param Protocol 协议名称，不区分大小写并归一化。ANY 表示不限定协议，不表示省略 Protocol。IP、instance、tag、group 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标；其它值返回参数错误。 
     * @return RuleAction 流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标；其它值返回参数错误。
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标；其它值返回参数错误。
     * @param RuleAction 流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标；其它值返回参数错误。
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 访问源内容，格式由 SourceType 决定：net/ip 使用最多 10 个逗号分隔的 IP 或 CIDR；template 使用当前账号且匹配 IpVersion 的 IP 地址模板 ID，不支持域名模板；instance、tag 必须属于当前账号，instance 须有对应 IpVersion 的私网地址；group 使用资源组 ID。 
     * @return SourceContent 访问源内容，格式由 SourceType 决定：net/ip 使用最多 10 个逗号分隔的 IP 或 CIDR；template 使用当前账号且匹配 IpVersion 的 IP 地址模板 ID，不支持域名模板；instance、tag 必须属于当前账号，instance 须有对应 IpVersion 的私网地址；group 使用资源组 ID。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源内容，格式由 SourceType 决定：net/ip 使用最多 10 个逗号分隔的 IP 或 CIDR；template 使用当前账号且匹配 IpVersion 的 IP 地址模板 ID，不支持域名模板；instance、tag 必须属于当前账号，instance 须有对应 IpVersion 的私网地址；group 使用资源组 ID。
     * @param SourceContent 访问源内容，格式由 SourceType 决定：net/ip 使用最多 10 个逗号分隔的 IP 或 CIDR；template 使用当前账号且匹配 IpVersion 的 IP 地址模板 ID，不支持域名模板；instance、tag 必须属于当前账号，instance 须有对应 IpVersion 的私网地址；group 使用资源组 ID。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问源类型，不区分大小写：net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，tag 表示资源标签，group 表示资产分组。类型及模板实际类型决定 SourceContent 的格式；template 要求当前环境支持地址模板。 
     * @return SourceType 访问源类型，不区分大小写：net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，tag 表示资源标签，group 表示资产分组。类型及模板实际类型决定 SourceContent 的格式；template 要求当前环境支持地址模板。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，不区分大小写：net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，tag 表示资源标签，group 表示资产分组。类型及模板实际类型决定 SourceContent 的格式；template 要求当前环境支持地址模板。
     * @param SourceType 访问源类型，不区分大小写：net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，tag 表示资源标签，group 表示资产分组。类型及模板实际类型决定 SourceContent 的格式；template 要求当前环境支持地址模板。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。 
     * @return BetaList 规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set 规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     * @param BetaList 规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get 规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。 
     * @return CreateTime 规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     * @param CreateTime 规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。 
     * @return Deleted 规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     * @param Deleted 规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 目的实际类型提示，例如区分 IP 地址模板和域名地址模板；新增和修改请求中忽略。 
     * @return DestValueType 目的实际类型提示，例如区分 IP 地址模板和域名地址模板；新增和修改请求中忽略。
     */
    public String getDestValueType() {
        return this.DestValueType;
    }

    /**
     * Set 目的实际类型提示，例如区分 IP 地址模板和域名地址模板；新增和修改请求中忽略。
     * @param DestValueType 目的实际类型提示，例如区分 IP 地址模板和域名地址模板；新增和修改请求中忽略。
     */
    public void setDestValueType(String DestValueType) {
        this.DestValueType = DestValueType;
    }

    /**
     * Get 规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。 
     * @return DetectedTimes 规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public Long getDetectedTimes() {
        return this.DetectedTimes;
    }

    /**
     * Set 规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     * @param DetectedTimes 规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public void setDetectedTimes(Long DetectedTimes) {
        this.DetectedTimes = DetectedTimes;
    }

    /**
     * Get EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。 
     * @return EdgeName EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     * @param EdgeName EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get 规则生效的防火墙组或 CCN 范围，不区分大小写。支持 ALL、cfwg- 前缀和 ccn- 前缀；省略、为空或格式无效时按 ALL 处理。 
     * @return FwGroupId 规则生效的防火墙组或 CCN 范围，不区分大小写。支持 ALL、cfwg- 前缀和 ccn- 前缀；省略、为空或格式无效时按 ALL 处理。
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 规则生效的防火墙组或 CCN 范围，不区分大小写。支持 ALL、cfwg- 前缀和 ccn- 前缀；省略、为空或格式无效时按 ALL 处理。
     * @param FwGroupId 规则生效的防火墙组或 CCN 范围，不区分大小写。支持 ALL、cfwg- 前缀和 ccn- 前缀；省略、为空或格式无效时按 ALL 处理。
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。 
     * @return FwGroupName 防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     * @param FwGroupName 防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get 覆盖导入规则标识。仅 batch_import_cover 接受正整数值；其它新增方式和修改请求中忽略。 
     * @return InternalUuid 覆盖导入规则标识。仅 batch_import_cover 接受正整数值；其它新增方式和修改请求中忽略。
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set 覆盖导入规则标识。仅 batch_import_cover 接受正整数值；其它新增方式和修改请求中忽略。
     * @param InternalUuid 覆盖导入规则标识。仅 batch_import_cover 接受正整数值；其它新增方式和修改请求中忽略。
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get 查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。 
     * @return Invalid 查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。
     * @param Invalid 查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get IP 版本：0 表示 IPv4，1 表示 IPv6；省略或传入其它整数时按 IPv4 处理。instance 和 IP 地址模板须匹配该版本；直接填写的 net IP/CIDR 也应使用相同版本。 
     * @return IpVersion IP 版本：0 表示 IPv4，1 表示 IPv6；省略或传入其它整数时按 IPv4 处理。instance 和 IP 地址模板须匹配该版本；直接填写的 net IP/CIDR 也应使用相同版本。
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP 版本：0 表示 IPv4，1 表示 IPv6；省略或传入其它整数时按 IPv4 处理。instance 和 IP 地址模板须匹配该版本；直接填写的 net IP/CIDR 也应使用相同版本。
     * @param IpVersion IP 版本：0 表示 IPv4，1 表示 IPv6；省略或传入其它整数时按 IPv4 处理。instance 和 IP 地址模板须匹配该版本；直接填写的 net IP/CIDR 也应使用相同版本。
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 端口协议组 ID。省略或为空时使用 Protocol 和 Port；非空时必须是当前账号可用的端口协议组，组内协议端口须满足目的类型限制。Protocol 和非 ICMP/ICMPV6 的 Port 仍须使用有效格式。 
     * @return ParamTemplateId 端口协议组 ID。省略或为空时使用 Protocol 和 Port；非空时必须是当前账号可用的端口协议组，组内协议端口须满足目的类型限制。Protocol 和非 ICMP/ICMPV6 的 Port 仍须使用有效格式。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 端口协议组 ID。省略或为空时使用 Protocol 和 Port；非空时必须是当前账号可用的端口协议组，组内协议端口须满足目的类型限制。Protocol 和非 ICMP/ICMPV6 的 Port 仍须使用有效格式。
     * @param ParamTemplateId 端口协议组 ID。省略或为空时使用 Protocol 和 Port；非空时必须是当前账号可用的端口协议组，组内协议端口须满足目的类型限制。Protocol 和非 ICMP/ICMPV6 的 Port 仍须使用有效格式。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。 
     * @return ParamTemplateName 端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set 端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     * @param ParamTemplateName 端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get 规则位置展示值：1 表示最前，2 表示中间，3 表示最后。新增和修改请求中忽略；仅位置为 2 的规则可修改。 
     * @return RulePartition 规则位置展示值：1 表示最前，2 表示中间，3 表示最后。新增和修改请求中忽略；仅位置为 2 的规则可修改。
     */
    public Long getRulePartition() {
        return this.RulePartition;
    }

    /**
     * Set 规则位置展示值：1 表示最前，2 表示中间，3 表示最后。新增和修改请求中忽略；仅位置为 2 的规则可修改。
     * @param RulePartition 规则位置展示值：1 表示最前，2 表示中间，3 表示最后。新增和修改请求中忽略；仅位置为 2 的规则可修改。
     */
    public void setRulePartition(Long RulePartition) {
        this.RulePartition = RulePartition;
    }

    /**
     * Get 访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。 
     * @return SourceName 访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     * @param SourceName 访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。 
     * @return TargetName 访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     * @param TargetName 访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。 
     * @return UpdateTime 规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     * @param UpdateTime 规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则 ID。修改时必须提供当前账号已有且可修改的正整数 Uuid，并完整替换该规则。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 可使用正整数 ID，非正数值由系统分配。 
     * @return Uuid 规则 ID。修改时必须提供当前账号已有且可修改的正整数 Uuid，并完整替换该规则。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 可使用正整数 ID，非正数值由系统分配。
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则 ID。修改时必须提供当前账号已有且可修改的正整数 Uuid，并完整替换该规则。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 可使用正整数 ID，非正数值由系统分配。
     * @param Uuid 规则 ID。修改时必须提供当前账号已有且可修改的正整数 Uuid，并完整替换该规则。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 可使用正整数 ID，非正数值由系统分配。
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    public VpcRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcRuleItem(VpcRuleItem source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
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
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.BetaList != null) {
            this.BetaList = new BetaInfoByACL[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new BetaInfoByACL(source.BetaList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Deleted != null) {
            this.Deleted = new Long(source.Deleted);
        }
        if (source.DestValueType != null) {
            this.DestValueType = new String(source.DestValueType);
        }
        if (source.DetectedTimes != null) {
            this.DetectedTimes = new Long(source.DetectedTimes);
        }
        if (source.EdgeName != null) {
            this.EdgeName = new String(source.EdgeName);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.RulePartition != null) {
            this.RulePartition = new Long(source.RulePartition);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "DestValueType", this.DestValueType);
        this.setParamSimple(map, prefix + "DetectedTimes", this.DetectedTimes);
        this.setParamSimple(map, prefix + "EdgeName", this.EdgeName);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "RulePartition", this.RulePartition);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

