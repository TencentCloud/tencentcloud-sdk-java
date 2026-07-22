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

public class CreateNatRuleItem extends AbstractModel {

    /**
    * <p>规则方向，JSON 整数：0 表示出站，1 表示入站；其他值被拒绝。方向决定可用的源和目的类型及协议组合。</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则序号。入口按 int64 读取后转换为 uint32，转换结果为 0 时归一化为 1；负值不会被单独拒绝，而会按 uint32 转换。写入中间分区时，序号为 1 或不大于当前同方向最大序号会按该位置插入并后移原规则，超过最大序号时通常归一化为末尾序号。新增且 From 不等于 insert_rule 时，如果本批首条规则转换后的序号为 1，则批内后续规则即使超过最大序号也按各自转换后的序号直接插入。</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>目的端口字符串。支持逗号分隔的单端口或以斜杠分隔的起止范围，例如 80、80,443、80/443；-1/-1 表示全部端口。单端口必须是大于 0 的整数；范围只要求两个端点均为整数且起点不大于终点。Protocol 归一化为 ICMP 时忽略该字段并保存为空字符串；FTP 只接受单端口，不接受逗号列表或斜杠范围。</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>协议，大小写不敏感并归一化为大写。四层值为 TCP、UDP、ICMP、ICMPV6、ANY；应用层值为 HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS，其中 domain、tls、ssl 也归一化为 TLS/SSL；ANY 同时可按四层协议和应用协议解析。入站仅允许 ANY、TCP、UDP；domain 目的及解析为域名模板的 template 目的接受上述应用层协议及 ANY，但不接受 FTP；dnsparse 和 domainiptwoverify 目的仅允许 TCP 或 UDP；其他目的不接受 FTP 和 ANY 之外的应用层协议。Protocol=DNS 且目的不是域名模板或单独的 * 时，目的列表只能包含域名，不能包含 IP。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>流量处理方式，大小写不敏感：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为 accept，isolateindrop、isolateoutdrop 归一化为 drop。</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>访问源内容，格式由 SourceType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表，最多 10 项；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。</p>
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * <p>访问源类型，大小写不敏感。入站支持 net、ip、template、location、vendor；出站支持 net、ip、template、instance、group、tag。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型。</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>访问目的内容，格式由 TargetType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表；domain 使用合法域名或 IP 的逗号列表，也接受单独的 *，标准泛域名和段内通配域名最多 5 级，段内通配域名还要求对应引擎版本支持；dnsparse 使用单个精确域名、最多 5 级的标准泛域名或相应域名模板，不接受单独的 *、段内通配域名、IP 或逗号列表；domainiptwoverify 使用单个精确域名或不含通配符的相应域名模板，不接受单独的 *、任何通配域名、IP 或逗号列表；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。解析后的目的内容最长 1023 字节；IP 或 domain 目的最多包含 10 个逗号分隔项。</p>
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * <p>访问目的类型，大小写不敏感。入站支持 net、ip、template、instance、group、tag；出站支持 net、ip、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型，入站解析为域名模板时被拒绝。dnsparse 和 domainiptwoverify 分别要求对应引擎版本支持；domainiptwoverify 使用域名模板时还要求严格模式域名模板版本支持；domain 目的使用段内通配域名时要求段内通配域名版本支持。</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>规则描述。省略或传空字符串时保存为空；入口不裁剪内容，也不执行长度归一化或字符数校验。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感。省略或传空字符串时读取当前账号的访问控制规则默认状态；配置不存在或无法解析时默认为启用。</p>
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * <p>规则内部 UUID。新增请求仅在 From=batch_import_cover 时采用正整数值替换自动生成的内部 UUID；其他新增路径和修改请求忽略该字段。</p>
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * <p>端口协议模板 ID。省略或传空字符串时直接使用请求中的 Protocol 和 Port；非空时必须指向当前账号已有的端口协议模板，模板条目会逐项参与协议与目的类型联动校验。使用模板时，入口仍先校验请求中的 Protocol，并在该协议不是 ICMP 时校验请求中的 Port；请求值不要求固定为 ANY 和 -1/-1。</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>规则生效范围，值中不能含空白字符。ALL 表示全部 NAT 实例；地域 ID（如 ap-guangzhou）表示地域范围；cfwnat- 或 nat- 开头的实例 ID 表示实例范围。非空值必须是已知地域或当前账号已有的 NAT 实例。省略或传空字符串时，有请求 Region 则使用 Region，否则归一化为 ALL。</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>规则数据库 ID。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 新增会采用正整数值作为待写入记录 ID。修改请求使用正整数定位中间分区中的现有规则，先删除该记录再以同一 Uuid 重建并返回该 ID；省略、0 或负值无法定位修改目标。</p>
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
     * Get <p>规则方向，JSON 整数：0 表示出站，1 表示入站；其他值被拒绝。方向决定可用的源和目的类型及协议组合。</p> 
     * @return Direction <p>规则方向，JSON 整数：0 表示出站，1 表示入站；其他值被拒绝。方向决定可用的源和目的类型及协议组合。</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>规则方向，JSON 整数：0 表示出站，1 表示入站；其他值被拒绝。方向决定可用的源和目的类型及协议组合。</p>
     * @param Direction <p>规则方向，JSON 整数：0 表示出站，1 表示入站；其他值被拒绝。方向决定可用的源和目的类型及协议组合。</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则序号。入口按 int64 读取后转换为 uint32，转换结果为 0 时归一化为 1；负值不会被单独拒绝，而会按 uint32 转换。写入中间分区时，序号为 1 或不大于当前同方向最大序号会按该位置插入并后移原规则，超过最大序号时通常归一化为末尾序号。新增且 From 不等于 insert_rule 时，如果本批首条规则转换后的序号为 1，则批内后续规则即使超过最大序号也按各自转换后的序号直接插入。</p> 
     * @return OrderIndex <p>规则序号。入口按 int64 读取后转换为 uint32，转换结果为 0 时归一化为 1；负值不会被单独拒绝，而会按 uint32 转换。写入中间分区时，序号为 1 或不大于当前同方向最大序号会按该位置插入并后移原规则，超过最大序号时通常归一化为末尾序号。新增且 From 不等于 insert_rule 时，如果本批首条规则转换后的序号为 1，则批内后续规则即使超过最大序号也按各自转换后的序号直接插入。</p>
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set <p>规则序号。入口按 int64 读取后转换为 uint32，转换结果为 0 时归一化为 1；负值不会被单独拒绝，而会按 uint32 转换。写入中间分区时，序号为 1 或不大于当前同方向最大序号会按该位置插入并后移原规则，超过最大序号时通常归一化为末尾序号。新增且 From 不等于 insert_rule 时，如果本批首条规则转换后的序号为 1，则批内后续规则即使超过最大序号也按各自转换后的序号直接插入。</p>
     * @param OrderIndex <p>规则序号。入口按 int64 读取后转换为 uint32，转换结果为 0 时归一化为 1；负值不会被单独拒绝，而会按 uint32 转换。写入中间分区时，序号为 1 或不大于当前同方向最大序号会按该位置插入并后移原规则，超过最大序号时通常归一化为末尾序号。新增且 From 不等于 insert_rule 时，如果本批首条规则转换后的序号为 1，则批内后续规则即使超过最大序号也按各自转换后的序号直接插入。</p>
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get <p>目的端口字符串。支持逗号分隔的单端口或以斜杠分隔的起止范围，例如 80、80,443、80/443；-1/-1 表示全部端口。单端口必须是大于 0 的整数；范围只要求两个端点均为整数且起点不大于终点。Protocol 归一化为 ICMP 时忽略该字段并保存为空字符串；FTP 只接受单端口，不接受逗号列表或斜杠范围。</p> 
     * @return Port <p>目的端口字符串。支持逗号分隔的单端口或以斜杠分隔的起止范围，例如 80、80,443、80/443；-1/-1 表示全部端口。单端口必须是大于 0 的整数；范围只要求两个端点均为整数且起点不大于终点。Protocol 归一化为 ICMP 时忽略该字段并保存为空字符串；FTP 只接受单端口，不接受逗号列表或斜杠范围。</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>目的端口字符串。支持逗号分隔的单端口或以斜杠分隔的起止范围，例如 80、80,443、80/443；-1/-1 表示全部端口。单端口必须是大于 0 的整数；范围只要求两个端点均为整数且起点不大于终点。Protocol 归一化为 ICMP 时忽略该字段并保存为空字符串；FTP 只接受单端口，不接受逗号列表或斜杠范围。</p>
     * @param Port <p>目的端口字符串。支持逗号分隔的单端口或以斜杠分隔的起止范围，例如 80、80,443、80/443；-1/-1 表示全部端口。单端口必须是大于 0 的整数；范围只要求两个端点均为整数且起点不大于终点。Protocol 归一化为 ICMP 时忽略该字段并保存为空字符串；FTP 只接受单端口，不接受逗号列表或斜杠范围。</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>协议，大小写不敏感并归一化为大写。四层值为 TCP、UDP、ICMP、ICMPV6、ANY；应用层值为 HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS，其中 domain、tls、ssl 也归一化为 TLS/SSL；ANY 同时可按四层协议和应用协议解析。入站仅允许 ANY、TCP、UDP；domain 目的及解析为域名模板的 template 目的接受上述应用层协议及 ANY，但不接受 FTP；dnsparse 和 domainiptwoverify 目的仅允许 TCP 或 UDP；其他目的不接受 FTP 和 ANY 之外的应用层协议。Protocol=DNS 且目的不是域名模板或单独的 * 时，目的列表只能包含域名，不能包含 IP。</p> 
     * @return Protocol <p>协议，大小写不敏感并归一化为大写。四层值为 TCP、UDP、ICMP、ICMPV6、ANY；应用层值为 HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS，其中 domain、tls、ssl 也归一化为 TLS/SSL；ANY 同时可按四层协议和应用协议解析。入站仅允许 ANY、TCP、UDP；domain 目的及解析为域名模板的 template 目的接受上述应用层协议及 ANY，但不接受 FTP；dnsparse 和 domainiptwoverify 目的仅允许 TCP 或 UDP；其他目的不接受 FTP 和 ANY 之外的应用层协议。Protocol=DNS 且目的不是域名模板或单独的 * 时，目的列表只能包含域名，不能包含 IP。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议，大小写不敏感并归一化为大写。四层值为 TCP、UDP、ICMP、ICMPV6、ANY；应用层值为 HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS，其中 domain、tls、ssl 也归一化为 TLS/SSL；ANY 同时可按四层协议和应用协议解析。入站仅允许 ANY、TCP、UDP；domain 目的及解析为域名模板的 template 目的接受上述应用层协议及 ANY，但不接受 FTP；dnsparse 和 domainiptwoverify 目的仅允许 TCP 或 UDP；其他目的不接受 FTP 和 ANY 之外的应用层协议。Protocol=DNS 且目的不是域名模板或单独的 * 时，目的列表只能包含域名，不能包含 IP。</p>
     * @param Protocol <p>协议，大小写不敏感并归一化为大写。四层值为 TCP、UDP、ICMP、ICMPV6、ANY；应用层值为 HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS、FTP、DNS，其中 domain、tls、ssl 也归一化为 TLS/SSL；ANY 同时可按四层协议和应用协议解析。入站仅允许 ANY、TCP、UDP；domain 目的及解析为域名模板的 template 目的接受上述应用层协议及 ANY，但不接受 FTP；dnsparse 和 domainiptwoverify 目的仅允许 TCP 或 UDP；其他目的不接受 FTP 和 ANY 之外的应用层协议。Protocol=DNS 且目的不是域名模板或单独的 * 时，目的列表只能包含域名，不能包含 IP。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>流量处理方式，大小写不敏感：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为 accept，isolateindrop、isolateoutdrop 归一化为 drop。</p> 
     * @return RuleAction <p>流量处理方式，大小写不敏感：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为 accept，isolateindrop、isolateoutdrop 归一化为 drop。</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>流量处理方式，大小写不敏感：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为 accept，isolateindrop、isolateoutdrop 归一化为 drop。</p>
     * @param RuleAction <p>流量处理方式，大小写不敏感：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept、isolateoutaccept 归一化为 accept，isolateindrop、isolateoutdrop 归一化为 drop。</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>访问源内容，格式由 SourceType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表，最多 10 项；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。</p> 
     * @return SourceContent <p>访问源内容，格式由 SourceType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表，最多 10 项；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。</p>
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set <p>访问源内容，格式由 SourceType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表，最多 10 项；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。</p>
     * @param SourceContent <p>访问源内容，格式由 SourceType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表，最多 10 项；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。</p>
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get <p>访问源类型，大小写不敏感。入站支持 net、ip、template、location、vendor；出站支持 net、ip、template、instance、group、tag。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型。</p> 
     * @return SourceType <p>访问源类型，大小写不敏感。入站支持 net、ip、template、location、vendor；出站支持 net、ip、template、instance、group、tag。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型。</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>访问源类型，大小写不敏感。入站支持 net、ip、template、location、vendor；出站支持 net、ip、template、instance、group、tag。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型。</p>
     * @param SourceType <p>访问源类型，大小写不敏感。入站支持 net、ip、template、location、vendor；出站支持 net、ip、template、instance、group、tag。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型。</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>访问目的内容，格式由 TargetType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表；domain 使用合法域名或 IP 的逗号列表，也接受单独的 *，标准泛域名和段内通配域名最多 5 级，段内通配域名还要求对应引擎版本支持；dnsparse 使用单个精确域名、最多 5 级的标准泛域名或相应域名模板，不接受单独的 *、段内通配域名、IP 或逗号列表；domainiptwoverify 使用单个精确域名或不含通配符的相应域名模板，不接受单独的 *、任何通配域名、IP 或逗号列表；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。解析后的目的内容最长 1023 字节；IP 或 domain 目的最多包含 10 个逗号分隔项。</p> 
     * @return TargetContent <p>访问目的内容，格式由 TargetType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表；domain 使用合法域名或 IP 的逗号列表，也接受单独的 *，标准泛域名和段内通配域名最多 5 级，段内通配域名还要求对应引擎版本支持；dnsparse 使用单个精确域名、最多 5 级的标准泛域名或相应域名模板，不接受单独的 *、段内通配域名、IP 或逗号列表；domainiptwoverify 使用单个精确域名或不含通配符的相应域名模板，不接受单独的 *、任何通配域名、IP 或逗号列表；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。解析后的目的内容最长 1023 字节；IP 或 domain 目的最多包含 10 个逗号分隔项。</p>
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set <p>访问目的内容，格式由 TargetType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表；domain 使用合法域名或 IP 的逗号列表，也接受单独的 *，标准泛域名和段内通配域名最多 5 级，段内通配域名还要求对应引擎版本支持；dnsparse 使用单个精确域名、最多 5 级的标准泛域名或相应域名模板，不接受单独的 *、段内通配域名、IP 或逗号列表；domainiptwoverify 使用单个精确域名或不含通配符的相应域名模板，不接受单独的 *、任何通配域名、IP 或逗号列表；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。解析后的目的内容最长 1023 字节；IP 或 domain 目的最多包含 10 个逗号分隔项。</p>
     * @param TargetContent <p>访问目的内容，格式由 TargetType 和 Direction 决定。net/ip 使用合法 IP 或 CIDR 的逗号列表；domain 使用合法域名或 IP 的逗号列表，也接受单独的 *，标准泛域名和段内通配域名最多 5 级，段内通配域名还要求对应引擎版本支持；dnsparse 使用单个精确域名、最多 5 级的标准泛域名或相应域名模板，不接受单独的 *、段内通配域名、IP 或逗号列表；domainiptwoverify 使用单个精确域名或不含通配符的相应域名模板，不接受单独的 *、任何通配域名、IP 或逗号列表；location 使用地域 code，空字符串归一化为默认全地域掩码；vendor 使用 tencent、aliyun、aws、huawei、azure 或 all，可用逗号分隔；template 使用当前账号可解析的地址模板标识；instance 和 tag 必须引用当前账号已有对象；group 使用资源组标识，入口不校验其是否存在。解析后的目的内容最长 1023 字节；IP 或 domain 目的最多包含 10 个逗号分隔项。</p>
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get <p>访问目的类型，大小写不敏感。入站支持 net、ip、template、instance、group、tag；出站支持 net、ip、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型，入站解析为域名模板时被拒绝。dnsparse 和 domainiptwoverify 分别要求对应引擎版本支持；domainiptwoverify 使用域名模板时还要求严格模式域名模板版本支持；domain 目的使用段内通配域名时要求段内通配域名版本支持。</p> 
     * @return TargetType <p>访问目的类型，大小写不敏感。入站支持 net、ip、template、instance、group、tag；出站支持 net、ip、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型，入站解析为域名模板时被拒绝。dnsparse 和 domainiptwoverify 分别要求对应引擎版本支持；domainiptwoverify 使用域名模板时还要求严格模式域名模板版本支持；domain 目的使用段内通配域名时要求段内通配域名版本支持。</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>访问目的类型，大小写不敏感。入站支持 net、ip、template、instance、group、tag；出站支持 net、ip、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型，入站解析为域名模板时被拒绝。dnsparse 和 domainiptwoverify 分别要求对应引擎版本支持；domainiptwoverify 使用域名模板时还要求严格模式域名模板版本支持；domain 目的使用段内通配域名时要求段内通配域名版本支持。</p>
     * @param TargetType <p>访问目的类型，大小写不敏感。入站支持 net、ip、template、instance、group、tag；出站支持 net、ip、template、domain、dnsparse、domainiptwoverify、location、vendor。ip 和 net 均归一化为 IP 类型；template 会解析为模板的实际类型，入站解析为域名模板时被拒绝。dnsparse 和 domainiptwoverify 分别要求对应引擎版本支持；domainiptwoverify 使用域名模板时还要求严格模式域名模板版本支持；domain 目的使用段内通配域名时要求段内通配域名版本支持。</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>规则描述。省略或传空字符串时保存为空；入口不裁剪内容，也不执行长度归一化或字符数校验。</p> 
     * @return Description <p>规则描述。省略或传空字符串时保存为空；入口不裁剪内容，也不执行长度归一化或字符数校验。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述。省略或传空字符串时保存为空；入口不裁剪内容，也不执行长度归一化或字符数校验。</p>
     * @param Description <p>规则描述。省略或传空字符串时保存为空；入口不裁剪内容，也不执行长度归一化或字符数校验。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感。省略或传空字符串时读取当前账号的访问控制规则默认状态；配置不存在或无法解析时默认为启用。</p> 
     * @return Enable <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感。省略或传空字符串时读取当前账号的访问控制规则默认状态；配置不存在或无法解析时默认为启用。</p>
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感。省略或传空字符串时读取当前账号的访问控制规则默认状态；配置不存在或无法解析时默认为启用。</p>
     * @param Enable <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感。省略或传空字符串时读取当前账号的访问控制规则默认状态；配置不存在或无法解析时默认为启用。</p>
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>规则内部 UUID。新增请求仅在 From=batch_import_cover 时采用正整数值替换自动生成的内部 UUID；其他新增路径和修改请求忽略该字段。</p> 
     * @return InternalUuid <p>规则内部 UUID。新增请求仅在 From=batch_import_cover 时采用正整数值替换自动生成的内部 UUID；其他新增路径和修改请求忽略该字段。</p>
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set <p>规则内部 UUID。新增请求仅在 From=batch_import_cover 时采用正整数值替换自动生成的内部 UUID；其他新增路径和修改请求忽略该字段。</p>
     * @param InternalUuid <p>规则内部 UUID。新增请求仅在 From=batch_import_cover 时采用正整数值替换自动生成的内部 UUID；其他新增路径和修改请求忽略该字段。</p>
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get <p>端口协议模板 ID。省略或传空字符串时直接使用请求中的 Protocol 和 Port；非空时必须指向当前账号已有的端口协议模板，模板条目会逐项参与协议与目的类型联动校验。使用模板时，入口仍先校验请求中的 Protocol，并在该协议不是 ICMP 时校验请求中的 Port；请求值不要求固定为 ANY 和 -1/-1。</p> 
     * @return ParamTemplateId <p>端口协议模板 ID。省略或传空字符串时直接使用请求中的 Protocol 和 Port；非空时必须指向当前账号已有的端口协议模板，模板条目会逐项参与协议与目的类型联动校验。使用模板时，入口仍先校验请求中的 Protocol，并在该协议不是 ICMP 时校验请求中的 Port；请求值不要求固定为 ANY 和 -1/-1。</p>
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>端口协议模板 ID。省略或传空字符串时直接使用请求中的 Protocol 和 Port；非空时必须指向当前账号已有的端口协议模板，模板条目会逐项参与协议与目的类型联动校验。使用模板时，入口仍先校验请求中的 Protocol，并在该协议不是 ICMP 时校验请求中的 Port；请求值不要求固定为 ANY 和 -1/-1。</p>
     * @param ParamTemplateId <p>端口协议模板 ID。省略或传空字符串时直接使用请求中的 Protocol 和 Port；非空时必须指向当前账号已有的端口协议模板，模板条目会逐项参与协议与目的类型联动校验。使用模板时，入口仍先校验请求中的 Protocol，并在该协议不是 ICMP 时校验请求中的 Port；请求值不要求固定为 ANY 和 -1/-1。</p>
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>规则生效范围，值中不能含空白字符。ALL 表示全部 NAT 实例；地域 ID（如 ap-guangzhou）表示地域范围；cfwnat- 或 nat- 开头的实例 ID 表示实例范围。非空值必须是已知地域或当前账号已有的 NAT 实例。省略或传空字符串时，有请求 Region 则使用 Region，否则归一化为 ALL。</p> 
     * @return Scope <p>规则生效范围，值中不能含空白字符。ALL 表示全部 NAT 实例；地域 ID（如 ap-guangzhou）表示地域范围；cfwnat- 或 nat- 开头的实例 ID 表示实例范围。非空值必须是已知地域或当前账号已有的 NAT 实例。省略或传空字符串时，有请求 Region 则使用 Region，否则归一化为 ALL。</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>规则生效范围，值中不能含空白字符。ALL 表示全部 NAT 实例；地域 ID（如 ap-guangzhou）表示地域范围；cfwnat- 或 nat- 开头的实例 ID 表示实例范围。非空值必须是已知地域或当前账号已有的 NAT 实例。省略或传空字符串时，有请求 Region 则使用 Region，否则归一化为 ALL。</p>
     * @param Scope <p>规则生效范围，值中不能含空白字符。ALL 表示全部 NAT 实例；地域 ID（如 ap-guangzhou）表示地域范围；cfwnat- 或 nat- 开头的实例 ID 表示实例范围。非空值必须是已知地域或当前账号已有的 NAT 实例。省略或传空字符串时，有请求 Region 则使用 Region，否则归一化为 ALL。</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>规则数据库 ID。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 新增会采用正整数值作为待写入记录 ID。修改请求使用正整数定位中间分区中的现有规则，先删除该记录再以同一 Uuid 重建并返回该 ID；省略、0 或负值无法定位修改目标。</p> 
     * @return Uuid <p>规则数据库 ID。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 新增会采用正整数值作为待写入记录 ID。修改请求使用正整数定位中间分区中的现有规则，先删除该记录再以同一 Uuid 重建并返回该 ID；省略、0 或负值无法定位修改目标。</p>
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>规则数据库 ID。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 新增会采用正整数值作为待写入记录 ID。修改请求使用正整数定位中间分区中的现有规则，先删除该记录再以同一 Uuid 重建并返回该 ID；省略、0 或负值无法定位修改目标。</p>
     * @param Uuid <p>规则数据库 ID。普通新增、insert_rule 和 batch_import 忽略该字段；batch_import_cover 新增会采用正整数值作为待写入记录 ID。修改请求使用正整数定位中间分区中的现有规则，先删除该记录再以同一 Uuid 重建并返回该 ID；省略、0 或负值无法定位修改目标。</p>
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    public CreateNatRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatRuleItem(CreateNatRuleItem source) {
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
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
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
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

