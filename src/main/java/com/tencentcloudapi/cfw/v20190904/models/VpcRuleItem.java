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
    * <p>规则描述。新增和修改按请求中的字符串保存。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。location 会校验地域代码，但解析出的地域代码未写入 VPC 规则且目的内容保存为空；vendor 会校验厂商名称并将其归一化代码写入目的内容。归一化后的目的内容超过 1023 字节时请求失败。</p>
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * <p>访问目的类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、domain、template、dnsparse、domainiptwoverify、instance、tag、group、location 或 vendor；url 虽可被通用类型映射识别，但 VPC 出向内容解析不支持。地址模板、dnsparse、domainiptwoverify、严格模式域名模板和段内通配域名分别要求当前 VPC 防火墙引擎支持对应能力，否则返回 UnsupportedOperation。类型及地址模板查询到的实际类型共同决定 DestContent 和 Protocol 的校验。</p>
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * <p>规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 间，cfws- 前缀表示指定 VPC 边；其它格式返回参数错误。ALL 还要求相关 VPC 防火墙引擎支持全局规则，否则返回 UnsupportedOperation。</p>
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感；省略或传空字符串时使用租户通知配置中的默认规则状态，该配置没有可用值时默认启用；其它字符串返回参数错误。</p>
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * <p>规则在相同 IpVersion 的中间分区内的顺序。请求整数先转换为 uint32，0 归一化为 1，负整数及超出 uint32 范围的整数按该转换结果处理；写入时，顺序为 1 或不大于当前最大顺序的规则在该位置插入并将现有规则后移，通常大于当前最大顺序的值归一化为末尾。例外是 AddVpcAcRule 未使用精确值 insert_rule 且首条规则解析后的顺序为 1 时，本批每条规则都保留其解析后顺序并按该值移动现有规则，因此后续规则即使大于当前最大顺序也不会归一化为末尾。</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>访问控制策略的端口。除 ICMP 和 ICMPV6 外，该字段按逗号拆分；每项可以是正整数单端口，或以斜杠分隔且起点不大于终点的两个整数，-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略请求值并保存为空字符串；其它协议的空值或非法格式返回参数错误。FTP 只接受正整数单端口，不接受逗号组合或斜杠区间。</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>协议名称，不区分大小写并归一化。IP、instance、tag、group、location、vendor 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 和 isolateoutaccept 归一化为放行，isolateindrop 和 isolateoutdrop 归一化为拒绝；其它值返回参数错误。</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>访问源内容，由 SourceType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；template 接受当前租户的地址模板标识并归一化为模板 UUID，只允许与 IpVersion 一致的 IP 地址模板，域名地址模板不能作为访问源；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。</p>
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * <p>访问源类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、template、instance、tag 或 group；url、location 和 vendor 虽可被通用类型映射识别，但 VPC 出向源内容解析不支持。使用 template 要求当前 VPC 防火墙引擎支持地址模板能力。类型及模板查询到的实际类型共同决定 SourceContent 的校验。</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * <p>规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * <p>查询结果中对目的实际类型的补充提示，例如 template 可区分 IP 地址模板和域名地址模板。新增和修改处理程序不读取请求中的该字段；实际目的类型由 DestType、DestContent 和模板查询结果确定。</p>
    */
    @SerializedName("DestValueType")
    @Expose
    private String DestValueType;

    /**
    * <p>规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
    */
    @SerializedName("DetectedTimes")
    @Expose
    private Long DetectedTimes;

    /**
    * <p>EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * <p>规则生效的防火墙组或 CCN 范围，格式比较不区分大小写。ALL 归一化为大写 ALL；cfwg- 前缀和 ccn- 前缀的值保留请求原文；省略、空字符串或其它格式归一化为 ALL，处理程序不因格式无效而返回错误。</p>
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * <p>防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * <p>内部规则标识。AddVpcAcRule 的精确 batch_import_cover 分支会采用正整数 InternalUuid 替换自动生成的内部标识；其它新增分支和 ModifyVpcAcRule 不读取请求中的该字段。</p>
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * <p>查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。</p>
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * <p>IP 版本，0 表示 IPv4，1 表示 IPv6。省略或传入 0、1 以外的整数时按 IPv4 处理；instance 必须具有对应版本的私网地址，IP 地址模板必须与解析后的版本一致。处理程序不使用该字段校验直接填写的 net IP/CIDR 版本。</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * <p>端口协议组 ID。省略或传空字符串时直接使用 Protocol 和 Port；非空时查询当前租户的端口协议组并用组内协议端口项执行目的类型和协议类别校验，模板查询失败时请求失败。无论是否填写该字段，请求中的 Protocol 和非 ICMP/ICMPV6 Port 都会先按普通规则解析，格式无效时请求失败。</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * <p>规则分区展示值，1 表示最前分区，2 表示中间分区，3 表示最后分区。新增和修改处理程序不读取请求中的该字段，写入时固定为中间分区；ModifyVpcAcRule 只能定位并替换中间分区中的现有规则。</p>
    */
    @SerializedName("RulePartition")
    @Expose
    private Long RulePartition;

    /**
    * <p>访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * <p>规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>规则数据库 ID。ModifyVpcAcRule 必须传当前租户中间分区内既有规则的正整数 Uuid；处理程序按该 ID 删除原记录并以同一 ID 插入替换后的规则。AddVpcAcRule 的普通新增、insert_rule 和 batch_import 分支忽略该字段；精确 batch_import_cover 分支会采用正整数 Uuid 作为新记录 ID，非正数值仍由数据库生成 ID。</p>
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
     * Get <p>规则描述。新增和修改按请求中的字符串保存。</p> 
     * @return Description <p>规则描述。新增和修改按请求中的字符串保存。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述。新增和修改按请求中的字符串保存。</p>
     * @param Description <p>规则描述。新增和修改按请求中的字符串保存。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。location 会校验地域代码，但解析出的地域代码未写入 VPC 规则且目的内容保存为空；vendor 会校验厂商名称并将其归一化代码写入目的内容。归一化后的目的内容超过 1023 字节时请求失败。</p> 
     * @return DestContent <p>访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。location 会校验地域代码，但解析出的地域代码未写入 VPC 规则且目的内容保存为空；vendor 会校验厂商名称并将其归一化代码写入目的内容。归一化后的目的内容超过 1023 字节时请求失败。</p>
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set <p>访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。location 会校验地域代码，但解析出的地域代码未写入 VPC 规则且目的内容保存为空；vendor 会校验厂商名称并将其归一化代码写入目的内容。归一化后的目的内容超过 1023 字节时请求失败。</p>
     * @param DestContent <p>访问目的内容，由 DestType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；domain 接受合法域名的逗号分隔列表或单独的 *，最多 10 项，通配域名最多 5 级，段内通配域名还要求引擎支持对应能力；template 接受当前租户的地址模板标识并归一化为模板 UUID，IP 地址模板必须与 IpVersion 一致，域名地址模板按域名目的校验；dnsparse 接受单个非 IP 域名或当前租户的域名模板，可使用符合级数限制的 *. 前缀泛域名，但不接受单独的 * 或段内通配；domainiptwoverify 接受单个非 IP 精确域名或不含任何通配符的当前租户域名模板；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。location 会校验地域代码，但解析出的地域代码未写入 VPC 规则且目的内容保存为空；vendor 会校验厂商名称并将其归一化代码写入目的内容。归一化后的目的内容超过 1023 字节时请求失败。</p>
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get <p>访问目的类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、domain、template、dnsparse、domainiptwoverify、instance、tag、group、location 或 vendor；url 虽可被通用类型映射识别，但 VPC 出向内容解析不支持。地址模板、dnsparse、domainiptwoverify、严格模式域名模板和段内通配域名分别要求当前 VPC 防火墙引擎支持对应能力，否则返回 UnsupportedOperation。类型及地址模板查询到的实际类型共同决定 DestContent 和 Protocol 的校验。</p> 
     * @return DestType <p>访问目的类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、domain、template、dnsparse、domainiptwoverify、instance、tag、group、location 或 vendor；url 虽可被通用类型映射识别，但 VPC 出向内容解析不支持。地址模板、dnsparse、domainiptwoverify、严格模式域名模板和段内通配域名分别要求当前 VPC 防火墙引擎支持对应能力，否则返回 UnsupportedOperation。类型及地址模板查询到的实际类型共同决定 DestContent 和 Protocol 的校验。</p>
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set <p>访问目的类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、domain、template、dnsparse、domainiptwoverify、instance、tag、group、location 或 vendor；url 虽可被通用类型映射识别，但 VPC 出向内容解析不支持。地址模板、dnsparse、domainiptwoverify、严格模式域名模板和段内通配域名分别要求当前 VPC 防火墙引擎支持对应能力，否则返回 UnsupportedOperation。类型及地址模板查询到的实际类型共同决定 DestContent 和 Protocol 的校验。</p>
     * @param DestType <p>访问目的类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、domain、template、dnsparse、domainiptwoverify、instance、tag、group、location 或 vendor；url 虽可被通用类型映射识别，但 VPC 出向内容解析不支持。地址模板、dnsparse、domainiptwoverify、严格模式域名模板和段内通配域名分别要求当前 VPC 防火墙引擎支持对应能力，否则返回 UnsupportedOperation。类型及地址模板查询到的实际类型共同决定 DestContent 和 Protocol 的校验。</p>
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get <p>规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 间，cfws- 前缀表示指定 VPC 边；其它格式返回参数错误。ALL 还要求相关 VPC 防火墙引擎支持全局规则，否则返回 UnsupportedOperation。</p> 
     * @return EdgeId <p>规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 间，cfws- 前缀表示指定 VPC 边；其它格式返回参数错误。ALL 还要求相关 VPC 防火墙引擎支持全局规则，否则返回 UnsupportedOperation。</p>
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set <p>规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 间，cfws- 前缀表示指定 VPC 边；其它格式返回参数错误。ALL 还要求相关 VPC 防火墙引擎支持全局规则，否则返回 UnsupportedOperation。</p>
     * @param EdgeId <p>规则生效的 VPC 边范围，不区分大小写。ALL 表示全部 VPC 间，cfws- 前缀表示指定 VPC 边；其它格式返回参数错误。ALL 还要求相关 VPC 防火墙引擎支持全局规则，否则返回 UnsupportedOperation。</p>
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感；省略或传空字符串时使用租户通知配置中的默认规则状态，该配置没有可用值时默认启用；其它字符串返回参数错误。</p> 
     * @return Enable <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感；省略或传空字符串时使用租户通知配置中的默认规则状态，该配置没有可用值时默认启用；其它字符串返回参数错误。</p>
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感；省略或传空字符串时使用租户通知配置中的默认规则状态，该配置没有可用值时默认启用；其它字符串返回参数错误。</p>
     * @param Enable <p>规则状态。字符串 true 表示启用，false 表示禁用，大小写不敏感；省略或传空字符串时使用租户通知配置中的默认规则状态，该配置没有可用值时默认启用；其它字符串返回参数错误。</p>
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>规则在相同 IpVersion 的中间分区内的顺序。请求整数先转换为 uint32，0 归一化为 1，负整数及超出 uint32 范围的整数按该转换结果处理；写入时，顺序为 1 或不大于当前最大顺序的规则在该位置插入并将现有规则后移，通常大于当前最大顺序的值归一化为末尾。例外是 AddVpcAcRule 未使用精确值 insert_rule 且首条规则解析后的顺序为 1 时，本批每条规则都保留其解析后顺序并按该值移动现有规则，因此后续规则即使大于当前最大顺序也不会归一化为末尾。</p> 
     * @return OrderIndex <p>规则在相同 IpVersion 的中间分区内的顺序。请求整数先转换为 uint32，0 归一化为 1，负整数及超出 uint32 范围的整数按该转换结果处理；写入时，顺序为 1 或不大于当前最大顺序的规则在该位置插入并将现有规则后移，通常大于当前最大顺序的值归一化为末尾。例外是 AddVpcAcRule 未使用精确值 insert_rule 且首条规则解析后的顺序为 1 时，本批每条规则都保留其解析后顺序并按该值移动现有规则，因此后续规则即使大于当前最大顺序也不会归一化为末尾。</p>
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set <p>规则在相同 IpVersion 的中间分区内的顺序。请求整数先转换为 uint32，0 归一化为 1，负整数及超出 uint32 范围的整数按该转换结果处理；写入时，顺序为 1 或不大于当前最大顺序的规则在该位置插入并将现有规则后移，通常大于当前最大顺序的值归一化为末尾。例外是 AddVpcAcRule 未使用精确值 insert_rule 且首条规则解析后的顺序为 1 时，本批每条规则都保留其解析后顺序并按该值移动现有规则，因此后续规则即使大于当前最大顺序也不会归一化为末尾。</p>
     * @param OrderIndex <p>规则在相同 IpVersion 的中间分区内的顺序。请求整数先转换为 uint32，0 归一化为 1，负整数及超出 uint32 范围的整数按该转换结果处理；写入时，顺序为 1 或不大于当前最大顺序的规则在该位置插入并将现有规则后移，通常大于当前最大顺序的值归一化为末尾。例外是 AddVpcAcRule 未使用精确值 insert_rule 且首条规则解析后的顺序为 1 时，本批每条规则都保留其解析后顺序并按该值移动现有规则，因此后续规则即使大于当前最大顺序也不会归一化为末尾。</p>
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get <p>访问控制策略的端口。除 ICMP 和 ICMPV6 外，该字段按逗号拆分；每项可以是正整数单端口，或以斜杠分隔且起点不大于终点的两个整数，-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略请求值并保存为空字符串；其它协议的空值或非法格式返回参数错误。FTP 只接受正整数单端口，不接受逗号组合或斜杠区间。</p> 
     * @return Port <p>访问控制策略的端口。除 ICMP 和 ICMPV6 外，该字段按逗号拆分；每项可以是正整数单端口，或以斜杠分隔且起点不大于终点的两个整数，-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略请求值并保存为空字符串；其它协议的空值或非法格式返回参数错误。FTP 只接受正整数单端口，不接受逗号组合或斜杠区间。</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>访问控制策略的端口。除 ICMP 和 ICMPV6 外，该字段按逗号拆分；每项可以是正整数单端口，或以斜杠分隔且起点不大于终点的两个整数，-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略请求值并保存为空字符串；其它协议的空值或非法格式返回参数错误。FTP 只接受正整数单端口，不接受逗号组合或斜杠区间。</p>
     * @param Port <p>访问控制策略的端口。除 ICMP 和 ICMPV6 外，该字段按逗号拆分；每项可以是正整数单端口，或以斜杠分隔且起点不大于终点的两个整数，-1/-1 表示全部端口。ICMP 和 ICMPV6 忽略请求值并保存为空字符串；其它协议的空值或非法格式返回参数错误。FTP 只接受正整数单端口，不接受逗号组合或斜杠区间。</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>协议名称，不区分大小写并归一化。IP、instance、tag、group、location、vendor 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。</p> 
     * @return Protocol <p>协议名称，不区分大小写并归一化。IP、instance、tag、group、location、vendor 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议名称，不区分大小写并归一化。IP、instance、tag、group、location、vendor 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。</p>
     * @param Protocol <p>协议名称，不区分大小写并归一化。IP、instance、tag、group、location、vendor 及 IP 地址模板目的支持 TCP、UDP、ICMP、ICMPV6、ANY 和 FTP，其中 FTP 只接受单端口；domain 及域名地址模板目的支持 ANY、HTTP、HTTPS、HTTP/HTTPS、TLS/SSL、SMTP、SMTPS、SMTP/SMTPS 和 DNS，不支持 FTP，domain、tls、ssl 归一化为 TLS/SSL；dnsparse 和 domainiptwoverify 仅支持 TCP 或 UDP。template 按查询到的实际模板类型应用上述限制；填写 ParamTemplateId 时，组内每个协议端口项还会应用相同的目的类型限制。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 和 isolateoutaccept 归一化为放行，isolateindrop 和 isolateoutdrop 归一化为拒绝；其它值返回参数错误。</p> 
     * @return RuleAction <p>流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 和 isolateoutaccept 归一化为放行，isolateindrop 和 isolateoutdrop 归一化为拒绝；其它值返回参数错误。</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 和 isolateoutaccept 归一化为放行，isolateindrop 和 isolateoutdrop 归一化为拒绝；其它值返回参数错误。</p>
     * @param RuleAction <p>流量通过云防火墙时的处理方式，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 和 isolateoutaccept 归一化为放行，isolateindrop 和 isolateoutdrop 归一化为拒绝；其它值返回参数错误。</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>访问源内容，由 SourceType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；template 接受当前租户的地址模板标识并归一化为模板 UUID，只允许与 IpVersion 一致的 IP 地址模板，域名地址模板不能作为访问源；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。</p> 
     * @return SourceContent <p>访问源内容，由 SourceType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；template 接受当前租户的地址模板标识并归一化为模板 UUID，只允许与 IpVersion 一致的 IP 地址模板，域名地址模板不能作为访问源；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。</p>
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set <p>访问源内容，由 SourceType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；template 接受当前租户的地址模板标识并归一化为模板 UUID，只允许与 IpVersion 一致的 IP 地址模板，域名地址模板不能作为访问源；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。</p>
     * @param SourceContent <p>访问源内容，由 SourceType 决定格式和校验。net/ip 接受合法 IP 或 CIDR 的逗号分隔列表，最多 10 项；template 接受当前租户的地址模板标识并归一化为模板 UUID，只允许与 IpVersion 一致的 IP 地址模板，域名地址模板不能作为访问源；instance 和 tag 必须在当前租户存在，其中 instance 必须具有 IpVersion 对应的私网地址；group 接受资源组标识。</p>
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get <p>访问源类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、template、instance、tag 或 group；url、location 和 vendor 虽可被通用类型映射识别，但 VPC 出向源内容解析不支持。使用 template 要求当前 VPC 防火墙引擎支持地址模板能力。类型及模板查询到的实际类型共同决定 SourceContent 的校验。</p> 
     * @return SourceType <p>访问源类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、template、instance、tag 或 group；url、location 和 vendor 虽可被通用类型映射识别，但 VPC 出向源内容解析不支持。使用 template 要求当前 VPC 防火墙引擎支持地址模板能力。类型及模板查询到的实际类型共同决定 SourceContent 的校验。</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>访问源类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、template、instance、tag 或 group；url、location 和 vendor 虽可被通用类型映射识别，但 VPC 出向源内容解析不支持。使用 template 要求当前 VPC 防火墙引擎支持地址模板能力。类型及模板查询到的实际类型共同决定 SourceContent 的校验。</p>
     * @param SourceType <p>访问源类型，不区分大小写。VPC 规则可用 net（ip 为同义值）、template、instance、tag 或 group；url、location 和 vendor 虽可被通用类型映射识别，但 VPC 出向源内容解析不支持。使用 template 要求当前 VPC 防火墙引擎支持地址模板能力。类型及模板查询到的实际类型共同决定 SourceContent 的校验。</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p> 
     * @return BetaList <p>规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set <p>规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     * @param BetaList <p>规则关联的 beta 任务详情。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get <p>规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p> 
     * @return CreateTime <p>规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     * @param CreateTime <p>规则创建时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p> 
     * @return Deleted <p>规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set <p>规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     * @param Deleted <p>规则删除标记，1 表示已删除，0 表示未删除。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get <p>查询结果中对目的实际类型的补充提示，例如 template 可区分 IP 地址模板和域名地址模板。新增和修改处理程序不读取请求中的该字段；实际目的类型由 DestType、DestContent 和模板查询结果确定。</p> 
     * @return DestValueType <p>查询结果中对目的实际类型的补充提示，例如 template 可区分 IP 地址模板和域名地址模板。新增和修改处理程序不读取请求中的该字段；实际目的类型由 DestType、DestContent 和模板查询结果确定。</p>
     */
    public String getDestValueType() {
        return this.DestValueType;
    }

    /**
     * Set <p>查询结果中对目的实际类型的补充提示，例如 template 可区分 IP 地址模板和域名地址模板。新增和修改处理程序不读取请求中的该字段；实际目的类型由 DestType、DestContent 和模板查询结果确定。</p>
     * @param DestValueType <p>查询结果中对目的实际类型的补充提示，例如 template 可区分 IP 地址模板和域名地址模板。新增和修改处理程序不读取请求中的该字段；实际目的类型由 DestType、DestContent 和模板查询结果确定。</p>
     */
    public void setDestValueType(String DestValueType) {
        this.DestValueType = DestValueType;
    }

    /**
     * Get <p>规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p> 
     * @return DetectedTimes <p>规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public Long getDetectedTimes() {
        return this.DetectedTimes;
    }

    /**
     * Set <p>规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     * @param DetectedTimes <p>规则命中次数。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public void setDetectedTimes(Long DetectedTimes) {
        this.DetectedTimes = DetectedTimes;
    }

    /**
     * Get <p>EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p> 
     * @return EdgeName <p>EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set <p>EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     * @param EdgeName <p>EdgeId 对应的 VPC 边名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get <p>规则生效的防火墙组或 CCN 范围，格式比较不区分大小写。ALL 归一化为大写 ALL；cfwg- 前缀和 ccn- 前缀的值保留请求原文；省略、空字符串或其它格式归一化为 ALL，处理程序不因格式无效而返回错误。</p> 
     * @return FwGroupId <p>规则生效的防火墙组或 CCN 范围，格式比较不区分大小写。ALL 归一化为大写 ALL；cfwg- 前缀和 ccn- 前缀的值保留请求原文；省略、空字符串或其它格式归一化为 ALL，处理程序不因格式无效而返回错误。</p>
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set <p>规则生效的防火墙组或 CCN 范围，格式比较不区分大小写。ALL 归一化为大写 ALL；cfwg- 前缀和 ccn- 前缀的值保留请求原文；省略、空字符串或其它格式归一化为 ALL，处理程序不因格式无效而返回错误。</p>
     * @param FwGroupId <p>规则生效的防火墙组或 CCN 范围，格式比较不区分大小写。ALL 归一化为大写 ALL；cfwg- 前缀和 ccn- 前缀的值保留请求原文；省略、空字符串或其它格式归一化为 ALL，处理程序不因格式无效而返回错误。</p>
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get <p>防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p> 
     * @return FwGroupName <p>防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set <p>防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     * @param FwGroupName <p>防火墙组或 CCN 名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get <p>内部规则标识。AddVpcAcRule 的精确 batch_import_cover 分支会采用正整数 InternalUuid 替换自动生成的内部标识；其它新增分支和 ModifyVpcAcRule 不读取请求中的该字段。</p> 
     * @return InternalUuid <p>内部规则标识。AddVpcAcRule 的精确 batch_import_cover 分支会采用正整数 InternalUuid 替换自动生成的内部标识；其它新增分支和 ModifyVpcAcRule 不读取请求中的该字段。</p>
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set <p>内部规则标识。AddVpcAcRule 的精确 batch_import_cover 分支会采用正整数 InternalUuid 替换自动生成的内部标识；其它新增分支和 ModifyVpcAcRule 不读取请求中的该字段。</p>
     * @param InternalUuid <p>内部规则标识。AddVpcAcRule 的精确 batch_import_cover 分支会采用正整数 InternalUuid 替换自动生成的内部标识；其它新增分支和 ModifyVpcAcRule 不读取请求中的该字段。</p>
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get <p>查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。</p> 
     * @return Invalid <p>查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。</p>
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set <p>查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。</p>
     * @param Invalid <p>查询结果中的规则有效性标记，0 表示有效，1 表示无效。请求中的该字段不参与新增或修改规则构造。</p>
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get <p>IP 版本，0 表示 IPv4，1 表示 IPv6。省略或传入 0、1 以外的整数时按 IPv4 处理；instance 必须具有对应版本的私网地址，IP 地址模板必须与解析后的版本一致。处理程序不使用该字段校验直接填写的 net IP/CIDR 版本。</p> 
     * @return IpVersion <p>IP 版本，0 表示 IPv4，1 表示 IPv6。省略或传入 0、1 以外的整数时按 IPv4 处理；instance 必须具有对应版本的私网地址，IP 地址模板必须与解析后的版本一致。处理程序不使用该字段校验直接填写的 net IP/CIDR 版本。</p>
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP 版本，0 表示 IPv4，1 表示 IPv6。省略或传入 0、1 以外的整数时按 IPv4 处理；instance 必须具有对应版本的私网地址，IP 地址模板必须与解析后的版本一致。处理程序不使用该字段校验直接填写的 net IP/CIDR 版本。</p>
     * @param IpVersion <p>IP 版本，0 表示 IPv4，1 表示 IPv6。省略或传入 0、1 以外的整数时按 IPv4 处理；instance 必须具有对应版本的私网地址，IP 地址模板必须与解析后的版本一致。处理程序不使用该字段校验直接填写的 net IP/CIDR 版本。</p>
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get <p>端口协议组 ID。省略或传空字符串时直接使用 Protocol 和 Port；非空时查询当前租户的端口协议组并用组内协议端口项执行目的类型和协议类别校验，模板查询失败时请求失败。无论是否填写该字段，请求中的 Protocol 和非 ICMP/ICMPV6 Port 都会先按普通规则解析，格式无效时请求失败。</p> 
     * @return ParamTemplateId <p>端口协议组 ID。省略或传空字符串时直接使用 Protocol 和 Port；非空时查询当前租户的端口协议组并用组内协议端口项执行目的类型和协议类别校验，模板查询失败时请求失败。无论是否填写该字段，请求中的 Protocol 和非 ICMP/ICMPV6 Port 都会先按普通规则解析，格式无效时请求失败。</p>
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>端口协议组 ID。省略或传空字符串时直接使用 Protocol 和 Port；非空时查询当前租户的端口协议组并用组内协议端口项执行目的类型和协议类别校验，模板查询失败时请求失败。无论是否填写该字段，请求中的 Protocol 和非 ICMP/ICMPV6 Port 都会先按普通规则解析，格式无效时请求失败。</p>
     * @param ParamTemplateId <p>端口协议组 ID。省略或传空字符串时直接使用 Protocol 和 Port；非空时查询当前租户的端口协议组并用组内协议端口项执行目的类型和协议类别校验，模板查询失败时请求失败。无论是否填写该字段，请求中的 Protocol 和非 ICMP/ICMPV6 Port 都会先按普通规则解析，格式无效时请求失败。</p>
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p> 
     * @return ParamTemplateName <p>端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set <p>端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     * @param ParamTemplateName <p>端口协议组名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get <p>规则分区展示值，1 表示最前分区，2 表示中间分区，3 表示最后分区。新增和修改处理程序不读取请求中的该字段，写入时固定为中间分区；ModifyVpcAcRule 只能定位并替换中间分区中的现有规则。</p> 
     * @return RulePartition <p>规则分区展示值，1 表示最前分区，2 表示中间分区，3 表示最后分区。新增和修改处理程序不读取请求中的该字段，写入时固定为中间分区；ModifyVpcAcRule 只能定位并替换中间分区中的现有规则。</p>
     */
    public Long getRulePartition() {
        return this.RulePartition;
    }

    /**
     * Set <p>规则分区展示值，1 表示最前分区，2 表示中间分区，3 表示最后分区。新增和修改处理程序不读取请求中的该字段，写入时固定为中间分区；ModifyVpcAcRule 只能定位并替换中间分区中的现有规则。</p>
     * @param RulePartition <p>规则分区展示值，1 表示最前分区，2 表示中间分区，3 表示最后分区。新增和修改处理程序不读取请求中的该字段，写入时固定为中间分区；ModifyVpcAcRule 只能定位并替换中间分区中的现有规则。</p>
     */
    public void setRulePartition(Long RulePartition) {
        this.RulePartition = RulePartition;
    }

    /**
     * Get <p>访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p> 
     * @return SourceName <p>访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     * @param SourceName <p>访问源名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p> 
     * @return TargetName <p>访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set <p>访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     * @param TargetName <p>访问目的名称。请求中的该字段不参与新增或修改规则构造，主要用于查询返回和操作记录展示。</p>
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get <p>规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p> 
     * @return UpdateTime <p>规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     * @param UpdateTime <p>规则最近更新时间。请求中的该字段不参与新增或修改规则构造，主要用于查询返回。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>规则数据库 ID。ModifyVpcAcRule 必须传当前租户中间分区内既有规则的正整数 Uuid；处理程序按该 ID 删除原记录并以同一 ID 插入替换后的规则。AddVpcAcRule 的普通新增、insert_rule 和 batch_import 分支忽略该字段；精确 batch_import_cover 分支会采用正整数 Uuid 作为新记录 ID，非正数值仍由数据库生成 ID。</p> 
     * @return Uuid <p>规则数据库 ID。ModifyVpcAcRule 必须传当前租户中间分区内既有规则的正整数 Uuid；处理程序按该 ID 删除原记录并以同一 ID 插入替换后的规则。AddVpcAcRule 的普通新增、insert_rule 和 batch_import 分支忽略该字段；精确 batch_import_cover 分支会采用正整数 Uuid 作为新记录 ID，非正数值仍由数据库生成 ID。</p>
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>规则数据库 ID。ModifyVpcAcRule 必须传当前租户中间分区内既有规则的正整数 Uuid；处理程序按该 ID 删除原记录并以同一 ID 插入替换后的规则。AddVpcAcRule 的普通新增、insert_rule 和 batch_import 分支忽略该字段；精确 batch_import_cover 分支会采用正整数 Uuid 作为新记录 ID，非正数值仍由数据库生成 ID。</p>
     * @param Uuid <p>规则数据库 ID。ModifyVpcAcRule 必须传当前租户中间分区内既有规则的正整数 Uuid；处理程序按该 ID 删除原记录并以同一 ID 插入替换后的规则。AddVpcAcRule 的普通新增、insert_rule 和 batch_import 分支忽略该字段；精确 batch_import_cover 分支会采用正整数 Uuid 作为新记录 ID，非正数值仍由数据库生成 ID。</p>
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

