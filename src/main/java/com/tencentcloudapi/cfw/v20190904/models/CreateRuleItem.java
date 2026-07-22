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
    * 规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 规则在当前方向可操作分区内的序号。Handler 先把 int64 转为 uint32：转换结果 0 归一化为 1；结果不超过当前最大序号时在该位置插入并顺延后续规则，否则追加到末尾。省略或传 -1 会追加；超出 uint32 范围的整数会绕回，调用方不应依赖该转换。当 Rules 含多条规则时，只用首条规则的序号和方向决定整批进入插入或追加分支：追加时整批改写为该方向末尾的连续序号，插入时其余规则保留各自解析后的序号。
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 目的端口。Protocol 归一化为 ICMP 时本字段被忽略并保存为空字符串；其它协议必须提供可解析字符串，按逗号分隔为单个正整数或“起始/结束”整数范围，范围起始值不得大于结束值，Handler 未对范围端点设置显式上下界，-1/-1 表示全部端口。FTP 只接受不含逗号和斜杠的单个正整数。domain 或域名模板目的在 side 或 all 范围下不接受除 -1/-1、0/65535 之外的端口范围。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为放行，isolateindrop、isolateoutdrop 归一化为拒绝。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问源类型，解析不区分大小写。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用后端域名规则校验接受的列表（包括 IP、普通域名和通配域名）或 *；普通 IP/CIDR/domain 列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时例外地不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含任何通配符的合法域名或此类 mb_ 域名模板；两者都不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和串行 domainiptwoverify 的 mb_ 域名模板分别要求对应集群引擎版本支持。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=0 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。解析并归一化后的目的内容长度不得超过 1023。
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 访问目的类型，解析不区分大小写。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 规则描述。省略或传空字符串时保存为空；替换现有规则时不继承旧值。Handler 未对字符数设置显式限制。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 关联告警或来源事件 ID。省略或传空字符串时保存为空，替换现有规则时不继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的内部字符串 UUID 复用。
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 协议端口模板 ID。省略或传空字符串表示不使用模板；非空时按当前账号和 ID 加载模板，找不到会失败。受支持输入应指向内容格式为“协议:端口”的协议端口模板；其中格式有效的每组协议和端口都会执行 Direction、TargetType 与 Scope 联动校验，异常模板内容不属于受支持输入。Protocol 和 Port 仍会在加载模板前按各自字段规则解析，原生 Handler 不要求固定填写 ANY、-1/-1 或 serial。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 规则来源。整数 2 原样保存；省略或传入其它整数均归一化为 0。
    */
    @SerializedName("RuleSource")
    @Expose
    private Long RuleSource;

    /**
    * 生效范围，解析不区分大小写：serial 表示串行，side 表示旁路，all 表示全局；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时正整数 ID 会作为覆盖导入后的规则 ID 复用；修改时必须提供当前账号可操作分区内已存在的正整数 ID，用于定位并替换原规则，省略、非正整数或不存在的 ID 会导致规则查询失败。
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
     * Get 规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。 
     * @return Direction 规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。
     * @param Direction 规则方向：1 表示入站，0 表示出站；其它整数或省略会校验失败。方向还决定 SourceType、TargetType、Scope 与 Protocol 的可用组合。
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 规则在当前方向可操作分区内的序号。Handler 先把 int64 转为 uint32：转换结果 0 归一化为 1；结果不超过当前最大序号时在该位置插入并顺延后续规则，否则追加到末尾。省略或传 -1 会追加；超出 uint32 范围的整数会绕回，调用方不应依赖该转换。当 Rules 含多条规则时，只用首条规则的序号和方向决定整批进入插入或追加分支：追加时整批改写为该方向末尾的连续序号，插入时其余规则保留各自解析后的序号。 
     * @return OrderIndex 规则在当前方向可操作分区内的序号。Handler 先把 int64 转为 uint32：转换结果 0 归一化为 1；结果不超过当前最大序号时在该位置插入并顺延后续规则，否则追加到末尾。省略或传 -1 会追加；超出 uint32 范围的整数会绕回，调用方不应依赖该转换。当 Rules 含多条规则时，只用首条规则的序号和方向决定整批进入插入或追加分支：追加时整批改写为该方向末尾的连续序号，插入时其余规则保留各自解析后的序号。
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则在当前方向可操作分区内的序号。Handler 先把 int64 转为 uint32：转换结果 0 归一化为 1；结果不超过当前最大序号时在该位置插入并顺延后续规则，否则追加到末尾。省略或传 -1 会追加；超出 uint32 范围的整数会绕回，调用方不应依赖该转换。当 Rules 含多条规则时，只用首条规则的序号和方向决定整批进入插入或追加分支：追加时整批改写为该方向末尾的连续序号，插入时其余规则保留各自解析后的序号。
     * @param OrderIndex 规则在当前方向可操作分区内的序号。Handler 先把 int64 转为 uint32：转换结果 0 归一化为 1；结果不超过当前最大序号时在该位置插入并顺延后续规则，否则追加到末尾。省略或传 -1 会追加；超出 uint32 范围的整数会绕回，调用方不应依赖该转换。当 Rules 含多条规则时，只用首条规则的序号和方向决定整批进入插入或追加分支：追加时整批改写为该方向末尾的连续序号，插入时其余规则保留各自解析后的序号。
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 目的端口。Protocol 归一化为 ICMP 时本字段被忽略并保存为空字符串；其它协议必须提供可解析字符串，按逗号分隔为单个正整数或“起始/结束”整数范围，范围起始值不得大于结束值，Handler 未对范围端点设置显式上下界，-1/-1 表示全部端口。FTP 只接受不含逗号和斜杠的单个正整数。domain 或域名模板目的在 side 或 all 范围下不接受除 -1/-1、0/65535 之外的端口范围。 
     * @return Port 目的端口。Protocol 归一化为 ICMP 时本字段被忽略并保存为空字符串；其它协议必须提供可解析字符串，按逗号分隔为单个正整数或“起始/结束”整数范围，范围起始值不得大于结束值，Handler 未对范围端点设置显式上下界，-1/-1 表示全部端口。FTP 只接受不含逗号和斜杠的单个正整数。domain 或域名模板目的在 side 或 all 范围下不接受除 -1/-1、0/65535 之外的端口范围。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 目的端口。Protocol 归一化为 ICMP 时本字段被忽略并保存为空字符串；其它协议必须提供可解析字符串，按逗号分隔为单个正整数或“起始/结束”整数范围，范围起始值不得大于结束值，Handler 未对范围端点设置显式上下界，-1/-1 表示全部端口。FTP 只接受不含逗号和斜杠的单个正整数。domain 或域名模板目的在 side 或 all 范围下不接受除 -1/-1、0/65535 之外的端口范围。
     * @param Port 目的端口。Protocol 归一化为 ICMP 时本字段被忽略并保存为空字符串；其它协议必须提供可解析字符串，按逗号分隔为单个正整数或“起始/结束”整数范围，范围起始值不得大于结束值，Handler 未对范围端点设置显式上下界，-1/-1 表示全部端口。FTP 只接受不含逗号和斜杠的单个正整数。domain 或域名模板目的在 side 或 all 范围下不接受除 -1/-1、0/65535 之外的端口范围。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。 
     * @return Protocol 协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。
     * @param Protocol 协议，解析不区分大小写。四层值 TCP、UDP、ICMP、ICMPV6、ANY 归一化为大写；应用层值 HTTP、HTTPS、HTTP/HTTPS、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS、TLS/SSL 及别名 domain、TLS、SSL 归一化为对应标准值。ANY 同时属于可解析的四层协议和应用协议，domain、TLS、SSL 均归一化为 TLS/SSL。domain 或域名模板目的接受上述应用层协议及 ANY，但不接受 FTP 和其它四层协议；dnsparse、domainiptwoverify 仅接受 TCP 或 UDP 且仅支持 serial；其它目的在公有云环境不接受 FTP、ANY 之外的应用层协议。side 或 all 范围下，入站仅接受 TCP，出站仅接受 TCP、HTTP/HTTPS 或 TLS/SSL。DNS 用于非 domain 目的且目的不是 * 时，目的内容还必须是非 IP 的合法域名规则列表。使用协议端口模板时，模板中的每组协议和端口也执行这些联动校验。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为放行，isolateindrop、isolateoutdrop 归一化为拒绝。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。 
     * @return RuleAction 流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为放行，isolateindrop、isolateoutdrop 归一化为拒绝。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为放行，isolateindrop、isolateoutdrop 归一化为拒绝。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。
     * @param RuleAction 流量处理动作，解析不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为放行，isolateindrop、isolateoutdrop 归一化为拒绝。drop 及其拒绝别名还会校验当前账号是否具备互联网边界阻断能力。
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。 
     * @return SourceContent 访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。
     * @param SourceContent 访问源内容。ip 或 net 使用合法 IP/CIDR 列表，普通列表最多 10 项；template 使用当前账号可解析的地址模板标识；Direction=0 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=1 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。location、vendor 保存时会转换为地域或厂商匹配信息。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问源类型，解析不区分大小写。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。 
     * @return SourceType 访问源类型，解析不区分大小写。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，解析不区分大小写。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
     * @param SourceType 访问源类型，解析不区分大小写。Direction=1 接受 ip、net、template、location、vendor；Direction=0 接受 ip、net、template、instance、group、tag。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用后端域名规则校验接受的列表（包括 IP、普通域名和通配域名）或 *；普通 IP/CIDR/domain 列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时例外地不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含任何通配符的合法域名或此类 mb_ 域名模板；两者都不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和串行 domainiptwoverify 的 mb_ 域名模板分别要求对应集群引擎版本支持。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=0 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。解析并归一化后的目的内容长度不得超过 1023。 
     * @return TargetContent 访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用后端域名规则校验接受的列表（包括 IP、普通域名和通配域名）或 *；普通 IP/CIDR/domain 列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时例外地不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含任何通配符的合法域名或此类 mb_ 域名模板；两者都不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和串行 domainiptwoverify 的 mb_ 域名模板分别要求对应集群引擎版本支持。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=0 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。解析并归一化后的目的内容长度不得超过 1023。
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用后端域名规则校验接受的列表（包括 IP、普通域名和通配域名）或 *；普通 IP/CIDR/domain 列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时例外地不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含任何通配符的合法域名或此类 mb_ 域名模板；两者都不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和串行 domainiptwoverify 的 mb_ 域名模板分别要求对应集群引擎版本支持。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=0 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。解析并归一化后的目的内容长度不得超过 1023。
     * @param TargetContent 访问目的内容。ip 或 net 使用合法 IP/CIDR 列表；domain 使用后端域名规则校验接受的列表（包括 IP、普通域名和通配域名）或 *；普通 IP/CIDR/domain 列表最多 10 项，通配域名最多 5 级。domain 配合 DNS 协议时例外地不接受 IP。dnsparse 使用单个合法域名、泛域名或当前账号可解析的 mb_ 域名模板，domainiptwoverify 使用单个不含任何通配符的合法域名或此类 mb_ 域名模板；两者都不接受单独的 *、IP、逗号列表或段内通配域名。串行 domain 段内通配和串行 domainiptwoverify 的 mb_ 域名模板分别要求对应集群引擎版本支持。template 使用当前账号可解析的地址模板标识；Direction=1 时，instance、group、tag 使用相应资源标识，其中 instance 必须能解析到公网 IP，tag 必须存在；Direction=0 时，location 使用地域 code CSV 并须通过当前账号的新地域规则能力校验，vendor 使用 tencent、aliyun、aws、huawei、azure 或 all 的 CSV。解析并归一化后的目的内容长度不得超过 1023。
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get 访问目的类型，解析不区分大小写。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。 
     * @return TargetType 访问目的类型，解析不区分大小写。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型，解析不区分大小写。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
     * @param TargetType 访问目的类型，解析不区分大小写。Direction=1 接受 ip、net、template、domain、instance、group、tag；Direction=0 接受 ip、net、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 与 net 归一化为同一 IP/CIDR 类型；其它已解析但不在对应方向处理分支中的类型会校验失败。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 规则描述。省略或传空字符串时保存为空；替换现有规则时不继承旧值。Handler 未对字符数设置显式限制。 
     * @return Description 规则描述。省略或传空字符串时保存为空；替换现有规则时不继承旧值。Handler 未对字符数设置显式限制。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。省略或传空字符串时保存为空；替换现有规则时不继承旧值。Handler 未对字符数设置显式限制。
     * @param Description 规则描述。省略或传空字符串时保存为空；替换现有规则时不继承旧值。Handler 未对字符数设置显式限制。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。 
     * @return Enable 启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。
     * @param Enable 启用状态。非空值不区分大小写接受字符串 true 或 false，并归一化为启用或停用；省略或传空字符串时读取当前账号的访问控制默认启用配置，该配置不可用时默认启用。替换现有规则时不继承旧值。
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 关联告警或来源事件 ID。省略或传空字符串时保存为空，替换现有规则时不继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的内部字符串 UUID 复用。 
     * @return LogId 关联告警或来源事件 ID。省略或传空字符串时保存为空，替换现有规则时不继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的内部字符串 UUID 复用。
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 关联告警或来源事件 ID。省略或传空字符串时保存为空，替换现有规则时不继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的内部字符串 UUID 复用。
     * @param LogId 关联告警或来源事件 ID。省略或传空字符串时保存为空，替换现有规则时不继承旧值；From=batch_import_cover 时，非空值还会作为覆盖导入后规则的内部字符串 UUID 复用。
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 协议端口模板 ID。省略或传空字符串表示不使用模板；非空时按当前账号和 ID 加载模板，找不到会失败。受支持输入应指向内容格式为“协议:端口”的协议端口模板；其中格式有效的每组协议和端口都会执行 Direction、TargetType 与 Scope 联动校验，异常模板内容不属于受支持输入。Protocol 和 Port 仍会在加载模板前按各自字段规则解析，原生 Handler 不要求固定填写 ANY、-1/-1 或 serial。 
     * @return ParamTemplateId 协议端口模板 ID。省略或传空字符串表示不使用模板；非空时按当前账号和 ID 加载模板，找不到会失败。受支持输入应指向内容格式为“协议:端口”的协议端口模板；其中格式有效的每组协议和端口都会执行 Direction、TargetType 与 Scope 联动校验，异常模板内容不属于受支持输入。Protocol 和 Port 仍会在加载模板前按各自字段规则解析，原生 Handler 不要求固定填写 ANY、-1/-1 或 serial。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 协议端口模板 ID。省略或传空字符串表示不使用模板；非空时按当前账号和 ID 加载模板，找不到会失败。受支持输入应指向内容格式为“协议:端口”的协议端口模板；其中格式有效的每组协议和端口都会执行 Direction、TargetType 与 Scope 联动校验，异常模板内容不属于受支持输入。Protocol 和 Port 仍会在加载模板前按各自字段规则解析，原生 Handler 不要求固定填写 ANY、-1/-1 或 serial。
     * @param ParamTemplateId 协议端口模板 ID。省略或传空字符串表示不使用模板；非空时按当前账号和 ID 加载模板，找不到会失败。受支持输入应指向内容格式为“协议:端口”的协议端口模板；其中格式有效的每组协议和端口都会执行 Direction、TargetType 与 Scope 联动校验，异常模板内容不属于受支持输入。Protocol 和 Port 仍会在加载模板前按各自字段规则解析，原生 Handler 不要求固定填写 ANY、-1/-1 或 serial。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 规则来源。整数 2 原样保存；省略或传入其它整数均归一化为 0。 
     * @return RuleSource 规则来源。整数 2 原样保存；省略或传入其它整数均归一化为 0。
     */
    public Long getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set 规则来源。整数 2 原样保存；省略或传入其它整数均归一化为 0。
     * @param RuleSource 规则来源。整数 2 原样保存；省略或传入其它整数均归一化为 0。
     */
    public void setRuleSource(Long RuleSource) {
        this.RuleSource = RuleSource;
    }

    /**
     * Get 生效范围，解析不区分大小写：serial 表示串行，side 表示旁路，all 表示全局；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。 
     * @return Scope 生效范围，解析不区分大小写：serial 表示串行，side 表示旁路，all 表示全局；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围，解析不区分大小写：serial 表示串行，side 表示旁路，all 表示全局；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。
     * @param Scope 生效范围，解析不区分大小写：serial 表示串行，side 表示旁路，all 表示全局；省略、空字符串或其它值会校验失败。国际站环境会将有效输入统一归一化为 serial。协议、端口、目的类型及协议端口模板的联动限制见 Protocol、Port 和 ParamTemplateId。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时正整数 ID 会作为覆盖导入后的规则 ID 复用；修改时必须提供当前账号可操作分区内已存在的正整数 ID，用于定位并替换原规则，省略、非正整数或不存在的 ID 会导致规则查询失败。 
     * @return Uuid 规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时正整数 ID 会作为覆盖导入后的规则 ID 复用；修改时必须提供当前账号可操作分区内已存在的正整数 ID，用于定位并替换原规则，省略、非正整数或不存在的 ID 会导致规则查询失败。
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时正整数 ID 会作为覆盖导入后的规则 ID 复用；修改时必须提供当前账号可操作分区内已存在的正整数 ID，用于定位并替换原规则，省略、非正整数或不存在的 ID 会导致规则查询失败。
     * @param Uuid 规则数值 ID。普通新增、指定位置新增和批量导入会忽略该字段；From=batch_import_cover 时正整数 ID 会作为覆盖导入后的规则 ID 复用；修改时必须提供当前账号可操作分区内已存在的正整数 ID，用于定位并替换原规则，省略、非正整数或不存在的 ID 会导致规则查询失败。
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

