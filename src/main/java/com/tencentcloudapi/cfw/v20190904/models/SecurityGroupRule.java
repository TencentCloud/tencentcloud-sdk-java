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

public class SecurityGroupRule extends AbstractModel {

    /**
    * 规则用途或使用场景的描述，不能为空，最多 100 个 Unicode 字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用合法域名。DestType=dnsparse 时服务端将内容转换为小写，并检查域名格式和域名解析配额。
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 访问目的类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 DestContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 规则顺序的十进制整数字符串；-1 转换为 uint32 最大值。新增时 Type=0 或 1 会按 Data 数组顺序重新计算最终 Sequence；Type=2 使用首条规则的 OrderIndex 作为插入位置，超过当前最大 Sequence 时按末尾新增处理。修改规则内容时 -1 会被拒绝，超过当前最大 Sequence 的值归一化为当前最大 Sequence。
    */
    @SerializedName("OrderIndex")
    @Expose
    private String OrderIndex;

    /**
    * 访问控制动作，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示仅记录；isolateinaccept、isolateoutaccept 分别按放行动作写入并标记入向或出向隔离来源，isolateindrop、isolateoutdrop 分别按拒绝动作写入并标记入向或出向隔离来源。
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用字符串内容。SourceType=dnsparse 时，服务端接受该类型，但不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问源类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 SourceContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。dnsparse 作为访问源时不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 规则状态字符串，不区分大小写；true 表示启用，false 表示禁用，省略或空字符串在结构转换时按 true 解析。普通新增最终使用账号的新增规则默认状态；batch_import 和 batch_import_cover 新增保留 Data.Enable 的解析结果；修改规则内容时保留原规则状态，因此 Data.Enable 不改变该修改的启停结果。
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则数据库数值 ID。普通新增由服务端生成；新增请求仅在 IsUseId=1 时采用 Data.Id。修改规则内容时 Data.Id 不改变目标规则 ID，服务端保留由外层 RuleUuid 定位的原 ID。当前 Schema 将本字段声明为字符串，而后端请求结构按 JSON 整数解析；传入字符串会导致请求解析失败。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 访问控制端口字符串，最多 200 字节。未使用服务模板时不能为空，可传 1..65535 的单端口、以斜杠连接且两端分别位于 1..65535 的范围、最多 15 个逗号分隔项，或以 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * IPv4 企业安全组协议，区分大小写。未使用服务模板时必须填写 ANY、TCP、UDP 或 ICMP；ANY 和 ICMP 仅支持 Port=-1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若填写则只接受 Protocol=ANY 且 Port=-1/-1。ICMPv6 由独立的 IPv6 企业安全组接口处理。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 规则生效范围，使用大写 SG、LH 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器。新增时省略默认补为 SG；修改规则内容时省略表示保留原范围。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 协议端口模板 ID，最多 50 字节，必须属于当前账号或为当前账号可用的公共模板。非空时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * Schema 中声明的规则内部 UUID 字段。当前新增和修改请求结构绑定的 JSON 键名为 UuId 而不是 Uid，因此传入本字段不会参与这两个接口的内部 UUID 生成或复用。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
     * Get 规则用途或使用场景的描述，不能为空，最多 100 个 Unicode 字符。 
     * @return Description 规则用途或使用场景的描述，不能为空，最多 100 个 Unicode 字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则用途或使用场景的描述，不能为空，最多 100 个 Unicode 字符。
     * @param Description 规则用途或使用场景的描述，不能为空，最多 100 个 Unicode 字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用合法域名。DestType=dnsparse 时服务端将内容转换为小写，并检查域名格式和域名解析配额。 
     * @return DestContent 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用合法域名。DestType=dnsparse 时服务端将内容转换为小写，并检查域名格式和域名解析配额。
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用合法域名。DestType=dnsparse 时服务端将内容转换为小写，并检查域名格式和域名解析配额。
     * @param DestContent 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用合法域名。DestType=dnsparse 时服务端将内容转换为小写，并检查域名格式和域名解析配额。
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 访问目的类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 DestContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。 
     * @return DestType 访问目的类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 DestContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 访问目的类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 DestContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。
     * @param DestType 访问目的类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 DestContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 规则顺序的十进制整数字符串；-1 转换为 uint32 最大值。新增时 Type=0 或 1 会按 Data 数组顺序重新计算最终 Sequence；Type=2 使用首条规则的 OrderIndex 作为插入位置，超过当前最大 Sequence 时按末尾新增处理。修改规则内容时 -1 会被拒绝，超过当前最大 Sequence 的值归一化为当前最大 Sequence。 
     * @return OrderIndex 规则顺序的十进制整数字符串；-1 转换为 uint32 最大值。新增时 Type=0 或 1 会按 Data 数组顺序重新计算最终 Sequence；Type=2 使用首条规则的 OrderIndex 作为插入位置，超过当前最大 Sequence 时按末尾新增处理。修改规则内容时 -1 会被拒绝，超过当前最大 Sequence 的值归一化为当前最大 Sequence。
     */
    public String getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则顺序的十进制整数字符串；-1 转换为 uint32 最大值。新增时 Type=0 或 1 会按 Data 数组顺序重新计算最终 Sequence；Type=2 使用首条规则的 OrderIndex 作为插入位置，超过当前最大 Sequence 时按末尾新增处理。修改规则内容时 -1 会被拒绝，超过当前最大 Sequence 的值归一化为当前最大 Sequence。
     * @param OrderIndex 规则顺序的十进制整数字符串；-1 转换为 uint32 最大值。新增时 Type=0 或 1 会按 Data 数组顺序重新计算最终 Sequence；Type=2 使用首条规则的 OrderIndex 作为插入位置，超过当前最大 Sequence 时按末尾新增处理。修改规则内容时 -1 会被拒绝，超过当前最大 Sequence 的值归一化为当前最大 Sequence。
     */
    public void setOrderIndex(String OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 访问控制动作，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示仅记录；isolateinaccept、isolateoutaccept 分别按放行动作写入并标记入向或出向隔离来源，isolateindrop、isolateoutdrop 分别按拒绝动作写入并标记入向或出向隔离来源。 
     * @return RuleAction 访问控制动作，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示仅记录；isolateinaccept、isolateoutaccept 分别按放行动作写入并标记入向或出向隔离来源，isolateindrop、isolateoutdrop 分别按拒绝动作写入并标记入向或出向隔离来源。
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制动作，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示仅记录；isolateinaccept、isolateoutaccept 分别按放行动作写入并标记入向或出向隔离来源，isolateindrop、isolateoutdrop 分别按拒绝动作写入并标记入向或出向隔离来源。
     * @param RuleAction 访问控制动作，不区分大小写。accept 表示放行，drop 表示拒绝，log 表示仅记录；isolateinaccept、isolateoutaccept 分别按放行动作写入并标记入向或出向隔离来源，isolateindrop、isolateoutdrop 分别按拒绝动作写入并标记入向或出向隔离来源。
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用字符串内容。SourceType=dnsparse 时，服务端接受该类型，但不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。 
     * @return SourceContent 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用字符串内容。SourceType=dnsparse 时，服务端接受该类型，但不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用字符串内容。SourceType=dnsparse 时，服务端接受该类型，但不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
     * @param SourceContent 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用可用的地址模板 ID；instance 使用属于当前账号的资产实例 ID；resourcegroup 使用当前账号的资产分组 ID；tag 使用当前账号已存在的资源标签 JSON 字符串，例如 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用支持的地域标识；dnsparse 使用字符串内容。SourceType=dnsparse 时，服务端接受该类型，但不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问源类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 SourceContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。dnsparse 作为访问源时不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。 
     * @return SourceType 访问源类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 SourceContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。dnsparse 作为访问源时不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 SourceContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。dnsparse 作为访问源时不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
     * @param SourceType 访问源类型，不区分大小写，可传 net、template、instance、resourcegroup、tag、region 或 dnsparse。instance 的具体资产类型由 SourceContent 的实例 ID 前缀识别；template、instance、resourcegroup、tag、region 对应的内容必须对当前账号有效。dnsparse 作为访问源时不执行目的域名的小写归一化、域名格式校验或域名解析配额检查。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 规则状态字符串，不区分大小写；true 表示启用，false 表示禁用，省略或空字符串在结构转换时按 true 解析。普通新增最终使用账号的新增规则默认状态；batch_import 和 batch_import_cover 新增保留 Data.Enable 的解析结果；修改规则内容时保留原规则状态，因此 Data.Enable 不改变该修改的启停结果。 
     * @return Enable 规则状态字符串，不区分大小写；true 表示启用，false 表示禁用，省略或空字符串在结构转换时按 true 解析。普通新增最终使用账号的新增规则默认状态；batch_import 和 batch_import_cover 新增保留 Data.Enable 的解析结果；修改规则内容时保留原规则状态，因此 Data.Enable 不改变该修改的启停结果。
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则状态字符串，不区分大小写；true 表示启用，false 表示禁用，省略或空字符串在结构转换时按 true 解析。普通新增最终使用账号的新增规则默认状态；batch_import 和 batch_import_cover 新增保留 Data.Enable 的解析结果；修改规则内容时保留原规则状态，因此 Data.Enable 不改变该修改的启停结果。
     * @param Enable 规则状态字符串，不区分大小写；true 表示启用，false 表示禁用，省略或空字符串在结构转换时按 true 解析。普通新增最终使用账号的新增规则默认状态；batch_import 和 batch_import_cover 新增保留 Data.Enable 的解析结果；修改规则内容时保留原规则状态，因此 Data.Enable 不改变该修改的启停结果。
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 规则数据库数值 ID。普通新增由服务端生成；新增请求仅在 IsUseId=1 时采用 Data.Id。修改规则内容时 Data.Id 不改变目标规则 ID，服务端保留由外层 RuleUuid 定位的原 ID。当前 Schema 将本字段声明为字符串，而后端请求结构按 JSON 整数解析；传入字符串会导致请求解析失败。 
     * @return Id 规则数据库数值 ID。普通新增由服务端生成；新增请求仅在 IsUseId=1 时采用 Data.Id。修改规则内容时 Data.Id 不改变目标规则 ID，服务端保留由外层 RuleUuid 定位的原 ID。当前 Schema 将本字段声明为字符串，而后端请求结构按 JSON 整数解析；传入字符串会导致请求解析失败。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则数据库数值 ID。普通新增由服务端生成；新增请求仅在 IsUseId=1 时采用 Data.Id。修改规则内容时 Data.Id 不改变目标规则 ID，服务端保留由外层 RuleUuid 定位的原 ID。当前 Schema 将本字段声明为字符串，而后端请求结构按 JSON 整数解析；传入字符串会导致请求解析失败。
     * @param Id 规则数据库数值 ID。普通新增由服务端生成；新增请求仅在 IsUseId=1 时采用 Data.Id。修改规则内容时 Data.Id 不改变目标规则 ID，服务端保留由外层 RuleUuid 定位的原 ID。当前 Schema 将本字段声明为字符串，而后端请求结构按 JSON 整数解析；传入字符串会导致请求解析失败。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 访问控制端口字符串，最多 200 字节。未使用服务模板时不能为空，可传 1..65535 的单端口、以斜杠连接且两端分别位于 1..65535 的范围、最多 15 个逗号分隔项，或以 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。 
     * @return Port 访问控制端口字符串，最多 200 字节。未使用服务模板时不能为空，可传 1..65535 的单端口、以斜杠连接且两端分别位于 1..65535 的范围、最多 15 个逗号分隔项，或以 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问控制端口字符串，最多 200 字节。未使用服务模板时不能为空，可传 1..65535 的单端口、以斜杠连接且两端分别位于 1..65535 的范围、最多 15 个逗号分隔项，或以 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。
     * @param Port 访问控制端口字符串，最多 200 字节。未使用服务模板时不能为空，可传 1..65535 的单端口、以斜杠连接且两端分别位于 1..65535 的范围、最多 15 个逗号分隔项，或以 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get IPv4 企业安全组协议，区分大小写。未使用服务模板时必须填写 ANY、TCP、UDP 或 ICMP；ANY 和 ICMP 仅支持 Port=-1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若填写则只接受 Protocol=ANY 且 Port=-1/-1。ICMPv6 由独立的 IPv6 企业安全组接口处理。 
     * @return Protocol IPv4 企业安全组协议，区分大小写。未使用服务模板时必须填写 ANY、TCP、UDP 或 ICMP；ANY 和 ICMP 仅支持 Port=-1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若填写则只接受 Protocol=ANY 且 Port=-1/-1。ICMPv6 由独立的 IPv6 企业安全组接口处理。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set IPv4 企业安全组协议，区分大小写。未使用服务模板时必须填写 ANY、TCP、UDP 或 ICMP；ANY 和 ICMP 仅支持 Port=-1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若填写则只接受 Protocol=ANY 且 Port=-1/-1。ICMPv6 由独立的 IPv6 企业安全组接口处理。
     * @param Protocol IPv4 企业安全组协议，区分大小写。未使用服务模板时必须填写 ANY、TCP、UDP 或 ICMP；ANY 和 ICMP 仅支持 Port=-1/-1。使用服务模板时 Protocol、Port 可同时省略或留空；若填写则只接受 Protocol=ANY 且 Port=-1/-1。ICMPv6 由独立的 IPv6 企业安全组接口处理。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 规则生效范围，使用大写 SG、LH 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器。新增时省略默认补为 SG；修改规则内容时省略表示保留原范围。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。 
     * @return Scope 规则生效范围，使用大写 SG、LH 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器。新增时省略默认补为 SG；修改规则内容时省略表示保留原范围。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 规则生效范围，使用大写 SG、LH 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器。新增时省略默认补为 SG；修改规则内容时省略表示保留原范围。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
     * @param Scope 规则生效范围，使用大写 SG、LH 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器。新增时省略默认补为 SG；修改规则内容时省略表示保留原范围。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 协议端口模板 ID，最多 50 字节，必须属于当前账号或为当前账号可用的公共模板。非空时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。Scope 包含 LH 时不能使用服务模板。 
     * @return ServiceTemplateId 协议端口模板 ID，最多 50 字节，必须属于当前账号或为当前账号可用的公共模板。非空时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 协议端口模板 ID，最多 50 字节，必须属于当前账号或为当前账号可用的公共模板。非空时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
     * @param ServiceTemplateId 协议端口模板 ID，最多 50 字节，必须属于当前账号或为当前账号可用的公共模板。非空时 Protocol、Port 可同时省略或留空；若任一字段非空，则只接受 Protocol=ANY 且 Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get Schema 中声明的规则内部 UUID 字段。当前新增和修改请求结构绑定的 JSON 键名为 UuId 而不是 Uid，因此传入本字段不会参与这两个接口的内部 UUID 生成或复用。 
     * @return Uid Schema 中声明的规则内部 UUID 字段。当前新增和修改请求结构绑定的 JSON 键名为 UuId 而不是 Uid，因此传入本字段不会参与这两个接口的内部 UUID 生成或复用。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Schema 中声明的规则内部 UUID 字段。当前新增和修改请求结构绑定的 JSON 键名为 UuId 而不是 Uid，因此传入本字段不会参与这两个接口的内部 UUID 生成或复用。
     * @param Uid Schema 中声明的规则内部 UUID 字段。当前新增和修改请求结构绑定的 JSON 键名为 UuId 而不是 Uid，因此传入本字段不会参与这两个接口的内部 UUID 生成或复用。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public SecurityGroupRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRule(SecurityGroupRule source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new String(source.OrderIndex);
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
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);

    }
}

