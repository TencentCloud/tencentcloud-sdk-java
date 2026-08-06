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

public class CreateRuleItem extends AbstractModel {

    /**
    * <p>规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则顺序。不传默认为-1，传 -1 时追加到当前方向末尾；正序号表示在对应位置插入并顺延后续规则；0 按 1 处理，其他负数及超范围值不应使用。新增请求包含多条规则时，Direction 必须相同；追加时全部传 -1，插入时按请求顺序传连续递增的正序号。修改请求只接受一条规则。</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>目的端口。Protocol 为 ICMP 时忽略本字段并置为空字符串；其它协议必须提供可解析字符串，可按逗号分隔填写正整数单端口或“起始/结束”范围，起始值不得大于结束值，-1/-1 表示全部端口。FTP 只接受单个正整数。domain 或域名模板目的在 side 或 all 范围下仅接受 -1/-1 或 0/65535。</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 表示不限定协议，不表示省略 Protocol；它同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。</p>
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * <p>访问源类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 按同一类型处理。</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用合法的 IP、普通域名或通配域名列表，也接受单独的 *；普通列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含通配符的合法域名或此类模板；两者均不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和 domainiptwoverify 模板要求当前环境支持对应能力。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=0 时，location 使用地域 code CSV，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。规范化后的内容最长 1023。</p>
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * <p>访问目的类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商，domain 表示 FQDN 匹配（内容也可传 IP 或 *），dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。</p>
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * <p>关联告警或来源事件 ID。新增时省略或传空字符串表示不关联；修改时应将 DescribeCfwRules 返回的 rules[].log_id 原样传入，未返回时省略或传空字符串。替换时不会自动继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的字符串标识复用。</p>
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * <p>协议端口模板 ID。省略或传空字符串表示不使用模板；非空时必须指向当前账号已有且内容格式为“协议:端口”的模板，否则请求失败。模板中的协议和端口须满足 Direction、TargetType 与 Scope 的联动限制。Protocol 和 Port 仍须符合各自字段规则，但不要求固定填写 ANY、-1/-1 或 serial。</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>规则来源：0 表示普通规则，2 表示隔离资产出向访问规则。新增时可以省略，省略按 0 处理；显式传值及修改时仅接受 0 或 2，修改时应传入原规则值。</p>
    */
    @SerializedName("RuleSource")
    @Expose
    private Long RuleSource;

    /**
    * <p>生效范围，必填，解析不区分大小写：serial 表示仅互联网边界串行防火墙，side 表示仅互联网边界旁路防火墙，all 表示同时作用于串行和旁路防火墙；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时可使用正整数 ID；修改时必须提供当前账号已有且可修改的正整数 ID，用于定位并完整替换原规则，省略、非正整数或不存在的 ID 会导致请求失败。</p>
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
     * Get <p>规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。</p> 
     * @return Direction <p>规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。</p>
     * @param Direction <p>规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则顺序。不传默认为-1，传 -1 时追加到当前方向末尾；正序号表示在对应位置插入并顺延后续规则；0 按 1 处理，其他负数及超范围值不应使用。新增请求包含多条规则时，Direction 必须相同；追加时全部传 -1，插入时按请求顺序传连续递增的正序号。修改请求只接受一条规则。</p> 
     * @return OrderIndex <p>规则顺序。不传默认为-1，传 -1 时追加到当前方向末尾；正序号表示在对应位置插入并顺延后续规则；0 按 1 处理，其他负数及超范围值不应使用。新增请求包含多条规则时，Direction 必须相同；追加时全部传 -1，插入时按请求顺序传连续递增的正序号。修改请求只接受一条规则。</p>
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set <p>规则顺序。不传默认为-1，传 -1 时追加到当前方向末尾；正序号表示在对应位置插入并顺延后续规则；0 按 1 处理，其他负数及超范围值不应使用。新增请求包含多条规则时，Direction 必须相同；追加时全部传 -1，插入时按请求顺序传连续递增的正序号。修改请求只接受一条规则。</p>
     * @param OrderIndex <p>规则顺序。不传默认为-1，传 -1 时追加到当前方向末尾；正序号表示在对应位置插入并顺延后续规则；0 按 1 处理，其他负数及超范围值不应使用。新增请求包含多条规则时，Direction 必须相同；追加时全部传 -1，插入时按请求顺序传连续递增的正序号。修改请求只接受一条规则。</p>
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get <p>目的端口。Protocol 为 ICMP 时忽略本字段并置为空字符串；其它协议必须提供可解析字符串，可按逗号分隔填写正整数单端口或“起始/结束”范围，起始值不得大于结束值，-1/-1 表示全部端口。FTP 只接受单个正整数。domain 或域名模板目的在 side 或 all 范围下仅接受 -1/-1 或 0/65535。</p> 
     * @return Port <p>目的端口。Protocol 为 ICMP 时忽略本字段并置为空字符串；其它协议必须提供可解析字符串，可按逗号分隔填写正整数单端口或“起始/结束”范围，起始值不得大于结束值，-1/-1 表示全部端口。FTP 只接受单个正整数。domain 或域名模板目的在 side 或 all 范围下仅接受 -1/-1 或 0/65535。</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>目的端口。Protocol 为 ICMP 时忽略本字段并置为空字符串；其它协议必须提供可解析字符串，可按逗号分隔填写正整数单端口或“起始/结束”范围，起始值不得大于结束值，-1/-1 表示全部端口。FTP 只接受单个正整数。domain 或域名模板目的在 side 或 all 范围下仅接受 -1/-1 或 0/65535。</p>
     * @param Port <p>目的端口。Protocol 为 ICMP 时忽略本字段并置为空字符串；其它协议必须提供可解析字符串，可按逗号分隔填写正整数单端口或“起始/结束”范围，起始值不得大于结束值，-1/-1 表示全部端口。FTP 只接受单个正整数。domain 或域名模板目的在 side 或 all 范围下仅接受 -1/-1 或 0/65535。</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 表示不限定协议，不表示省略 Protocol；它同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。</p> 
     * @return Protocol <p>协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 表示不限定协议，不表示省略 Protocol；它同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 表示不限定协议，不表示省略 Protocol；它同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。</p>
     * @param Protocol <p>协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 表示不限定协议，不表示省略 Protocol；它同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。</p> 
     * @return RuleAction <p>流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。</p>
     * @param RuleAction <p>流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。</p> 
     * @return SourceContent <p>访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。</p>
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set <p>访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。</p>
     * @param SourceContent <p>访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。</p>
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get <p>访问源类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 按同一类型处理。</p> 
     * @return SourceType <p>访问源类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 按同一类型处理。</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>访问源类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 按同一类型处理。</p>
     * @param SourceType <p>访问源类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 按同一类型处理。</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用合法的 IP、普通域名或通配域名列表，也接受单独的 *；普通列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含通配符的合法域名或此类模板；两者均不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和 domainiptwoverify 模板要求当前环境支持对应能力。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=0 时，location 使用地域 code CSV，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。规范化后的内容最长 1023。</p> 
     * @return TargetContent <p>访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用合法的 IP、普通域名或通配域名列表，也接受单独的 *；普通列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含通配符的合法域名或此类模板；两者均不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和 domainiptwoverify 模板要求当前环境支持对应能力。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=0 时，location 使用地域 code CSV，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。规范化后的内容最长 1023。</p>
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set <p>访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用合法的 IP、普通域名或通配域名列表，也接受单独的 *；普通列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含通配符的合法域名或此类模板；两者均不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和 domainiptwoverify 模板要求当前环境支持对应能力。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=0 时，location 使用地域 code CSV，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。规范化后的内容最长 1023。</p>
     * @param TargetContent <p>访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用合法的 IP、普通域名或通配域名列表，也接受单独的 *；普通列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含通配符的合法域名或此类模板；两者均不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和 domainiptwoverify 模板要求当前环境支持对应能力。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在且格式为 {&quot;Key&quot;:&quot;标签键&quot;,&quot;Value&quot;:&quot;标签值&quot;}；Direction=0 时，location 使用地域 code CSV，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。规范化后的内容最长 1023。</p>
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get <p>访问目的类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商，domain 表示 FQDN 匹配（内容也可传 IP 或 *），dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。</p> 
     * @return TargetType <p>访问目的类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商，domain 表示 FQDN 匹配（内容也可传 IP 或 *），dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>访问目的类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商，domain 表示 FQDN 匹配（内容也可传 IP 或 *），dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。</p>
     * @param TargetType <p>访问目的类型，解析不区分大小写。net、ip 均表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，group 表示资产分组，tag 表示资源标签，location 表示地域，vendor 表示云厂商，domain 表示 FQDN 匹配（内容也可传 IP 或 *），dnsparse 表示宽松匹配：Host/SNI 与域名匹配，或目的 IP 属于该域名当前 DNS 解析结果，满足任一条件即命中；domainiptwoverify 表示严格匹配：上述两个条件必须同时满足。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。</p> 
     * @return Description <p>规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。</p>
     * @param Description <p>规则描述，不超过 100 个字符。新增时按请求值保存；修改时完整替换，不继承旧值。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。</p> 
     * @return Enable <p>启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。</p>
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。</p>
     * @param Enable <p>启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。</p>
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>关联告警或来源事件 ID。新增时省略或传空字符串表示不关联；修改时应将 DescribeCfwRules 返回的 rules[].log_id 原样传入，未返回时省略或传空字符串。替换时不会自动继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的字符串标识复用。</p> 
     * @return LogId <p>关联告警或来源事件 ID。新增时省略或传空字符串表示不关联；修改时应将 DescribeCfwRules 返回的 rules[].log_id 原样传入，未返回时省略或传空字符串。替换时不会自动继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的字符串标识复用。</p>
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set <p>关联告警或来源事件 ID。新增时省略或传空字符串表示不关联；修改时应将 DescribeCfwRules 返回的 rules[].log_id 原样传入，未返回时省略或传空字符串。替换时不会自动继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的字符串标识复用。</p>
     * @param LogId <p>关联告警或来源事件 ID。新增时省略或传空字符串表示不关联；修改时应将 DescribeCfwRules 返回的 rules[].log_id 原样传入，未返回时省略或传空字符串。替换时不会自动继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的字符串标识复用。</p>
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get <p>协议端口模板 ID。省略或传空字符串表示不使用模板；非空时必须指向当前账号已有且内容格式为“协议:端口”的模板，否则请求失败。模板中的协议和端口须满足 Direction、TargetType 与 Scope 的联动限制。Protocol 和 Port 仍须符合各自字段规则，但不要求固定填写 ANY、-1/-1 或 serial。</p> 
     * @return ParamTemplateId <p>协议端口模板 ID。省略或传空字符串表示不使用模板；非空时必须指向当前账号已有且内容格式为“协议:端口”的模板，否则请求失败。模板中的协议和端口须满足 Direction、TargetType 与 Scope 的联动限制。Protocol 和 Port 仍须符合各自字段规则，但不要求固定填写 ANY、-1/-1 或 serial。</p>
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>协议端口模板 ID。省略或传空字符串表示不使用模板；非空时必须指向当前账号已有且内容格式为“协议:端口”的模板，否则请求失败。模板中的协议和端口须满足 Direction、TargetType 与 Scope 的联动限制。Protocol 和 Port 仍须符合各自字段规则，但不要求固定填写 ANY、-1/-1 或 serial。</p>
     * @param ParamTemplateId <p>协议端口模板 ID。省略或传空字符串表示不使用模板；非空时必须指向当前账号已有且内容格式为“协议:端口”的模板，否则请求失败。模板中的协议和端口须满足 Direction、TargetType 与 Scope 的联动限制。Protocol 和 Port 仍须符合各自字段规则，但不要求固定填写 ANY、-1/-1 或 serial。</p>
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>规则来源：0 表示普通规则，2 表示隔离资产出向访问规则。新增时可以省略，省略按 0 处理；显式传值及修改时仅接受 0 或 2，修改时应传入原规则值。</p> 
     * @return RuleSource <p>规则来源：0 表示普通规则，2 表示隔离资产出向访问规则。新增时可以省略，省略按 0 处理；显式传值及修改时仅接受 0 或 2，修改时应传入原规则值。</p>
     */
    public Long getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set <p>规则来源：0 表示普通规则，2 表示隔离资产出向访问规则。新增时可以省略，省略按 0 处理；显式传值及修改时仅接受 0 或 2，修改时应传入原规则值。</p>
     * @param RuleSource <p>规则来源：0 表示普通规则，2 表示隔离资产出向访问规则。新增时可以省略，省略按 0 处理；显式传值及修改时仅接受 0 或 2，修改时应传入原规则值。</p>
     */
    public void setRuleSource(Long RuleSource) {
        this.RuleSource = RuleSource;
    }

    /**
     * Get <p>生效范围，必填，解析不区分大小写：serial 表示仅互联网边界串行防火墙，side 表示仅互联网边界旁路防火墙，all 表示同时作用于串行和旁路防火墙；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。</p> 
     * @return Scope <p>生效范围，必填，解析不区分大小写：serial 表示仅互联网边界串行防火墙，side 表示仅互联网边界旁路防火墙，all 表示同时作用于串行和旁路防火墙；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>生效范围，必填，解析不区分大小写：serial 表示仅互联网边界串行防火墙，side 表示仅互联网边界旁路防火墙，all 表示同时作用于串行和旁路防火墙；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。</p>
     * @param Scope <p>生效范围，必填，解析不区分大小写：serial 表示仅互联网边界串行防火墙，side 表示仅互联网边界旁路防火墙，all 表示同时作用于串行和旁路防火墙；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时可使用正整数 ID；修改时必须提供当前账号已有且可修改的正整数 ID，用于定位并完整替换原规则，省略、非正整数或不存在的 ID 会导致请求失败。</p> 
     * @return Uuid <p>规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时可使用正整数 ID；修改时必须提供当前账号已有且可修改的正整数 ID，用于定位并完整替换原规则，省略、非正整数或不存在的 ID 会导致请求失败。</p>
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时可使用正整数 ID；修改时必须提供当前账号已有且可修改的正整数 ID，用于定位并完整替换原规则，省略、非正整数或不存在的 ID 会导致请求失败。</p>
     * @param Uuid <p>规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时可使用正整数 ID；修改时必须提供当前账号已有且可修改的正整数 ID，用于定位并完整替换原规则，省略、非正整数或不存在的 ID 会导致请求失败。</p>
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    public CreateRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleItem(CreateRuleItem source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
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
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.RuleSource != null) {
            this.RuleSource = new Long(source.RuleSource);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "RuleSource", this.RuleSource);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

