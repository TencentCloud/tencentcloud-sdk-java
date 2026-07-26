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
    * 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region；dnsparse 使用合法域名并按小写处理，同时受域名解析配额限制。
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 访问目的类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域，dnsparse 表示 DNS 解析匹配。内容必须与类型匹配，并且对当前账号有效。
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
    * 访问控制动作，不区分大小写：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问源类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域。内容必须与类型匹配，并且对当前账号有效；dnsparse 作为 SourceType 时仅按普通字符串保存，不提供 DNS 解析匹配，请勿使用；DNS 解析匹配仅用于 DestType。
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
    * 规则 ID，使用十进制数字字符串。普通新增由系统分配；仅 IsUseId=1 的新增请求采用 Data.Id。修改规则内容时忽略 Data.Id，并保留 RuleUuid 指定的规则 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 访问控制端口字符串，最多 200 字节。未使用服务模板时必填，可传 1..65535 的单端口、斜杠连接的端口范围、最多 15 个逗号分隔项，或 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * IPv4 企业安全组协议，使用区分大小写的大写值 ANY、TCP、UDP 或 ICMP；ANY 表示所有 IPv4 协议。未使用服务模板时必填，ANY 和 ICMP 必须搭配 Port=-1/-1；使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。ICMPv6 使用独立的 IPv6 企业安全组接口。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 规则生效范围，使用大写 SG、LH、NONE 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器，NONE 表示未设置范围。新增时省略默认为 SG；修改规则内容时省略或使用 NONE 均保留原范围。组合项会去重。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 协议端口模板 ID，最多 50 字节。仅支持通过 VPC DescribeServiceTemplates 或 DescribeServiceTemplateGroups 查询的广州地域（ap-guangzhou）服务模板，即 ServiceTemplateId（ppm-）或 ServiceTemplateGroupId（ppmg-）。非空时 Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 保留字段。新增和修改请求均忽略 Uid，无法通过该字段指定或保留规则标识，建议省略。
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
     * Get 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region；dnsparse 使用合法域名并按小写处理，同时受域名解析配额限制。 
     * @return DestContent 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region；dnsparse 使用合法域名并按小写处理，同时受域名解析配额限制。
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region；dnsparse 使用合法域名并按小写处理，同时受域名解析配额限制。
     * @param DestContent 访问目的内容，非空且最多 512 字节，格式由 DestType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region；dnsparse 使用合法域名并按小写处理，同时受域名解析配额限制。
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 访问目的类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域，dnsparse 表示 DNS 解析匹配。内容必须与类型匹配，并且对当前账号有效。 
     * @return DestType 访问目的类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域，dnsparse 表示 DNS 解析匹配。内容必须与类型匹配，并且对当前账号有效。
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 访问目的类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域，dnsparse 表示 DNS 解析匹配。内容必须与类型匹配，并且对当前账号有效。
     * @param DestType 访问目的类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域，dnsparse 表示 DNS 解析匹配。内容必须与类型匹配，并且对当前账号有效。
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
     * Get 访问控制动作，不区分大小写：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。 
     * @return RuleAction 访问控制动作，不区分大小写：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制动作，不区分大小写：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。
     * @param RuleAction 访问控制动作，不区分大小写：accept 表示放行，drop 表示拒绝，log 表示观察；isolateinaccept 表示放行访问隔离资产的白名单流量，isolateindrop 表示阻断访问隔离资产的其它流量，isolateoutaccept 表示放行隔离资产访问白名单目标，isolateoutdrop 表示阻断隔离资产访问其它目标。
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region。 
     * @return SourceContent 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region。
     * @param SourceContent 访问源内容，非空且最多 512 字节，格式由 SourceType 决定：net 使用 IPv4 IP/CIDR，且不接受裸地址 0.0.0.0，表示全部 IPv4 地址时使用 0.0.0.0/0；template 使用通过 VPC DescribeAddressTemplates 或 DescribeAddressTemplateGroups 查询的广州地域（ap-guangzhou）地址模板 ID，即 AddressTemplateId（ipm-）或 AddressTemplateGroupId（ipmg-）；instance 使用 DescribeCfwAssets 返回的 assets[].instance_id；resourcegroup 使用 DescribeResourceGroupNew（QueryType=resource）返回的 GroupId；tag 根据 DescribeResourceGroupNew（QueryType=tag）返回的 GroupName 构造 {\"Key\":\"标签键\",\"Value\":\"标签值\"}；region 使用 DescribeSecurityGroupRegionList 返回的 Data[].Region。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问源类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域。内容必须与类型匹配，并且对当前账号有效；dnsparse 作为 SourceType 时仅按普通字符串保存，不提供 DNS 解析匹配，请勿使用；DNS 解析匹配仅用于 DestType。 
     * @return SourceType 访问源类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域。内容必须与类型匹配，并且对当前账号有效；dnsparse 作为 SourceType 时仅按普通字符串保存，不提供 DNS 解析匹配，请勿使用；DNS 解析匹配仅用于 DestType。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域。内容必须与类型匹配，并且对当前账号有效；dnsparse 作为 SourceType 时仅按普通字符串保存，不提供 DNS 解析匹配，请勿使用；DNS 解析匹配仅用于 DestType。
     * @param SourceType 访问源类型，不区分大小写：net 表示 IP/CIDR，template 表示地址模板，instance 表示资产实例，resourcegroup 表示资产分组，tag 表示资源标签，region 表示资产地域。内容必须与类型匹配，并且对当前账号有效；dnsparse 作为 SourceType 时仅按普通字符串保存，不提供 DNS 解析匹配，请勿使用；DNS 解析匹配仅用于 DestType。
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
     * Get 规则 ID，使用十进制数字字符串。普通新增由系统分配；仅 IsUseId=1 的新增请求采用 Data.Id。修改规则内容时忽略 Data.Id，并保留 RuleUuid 指定的规则 ID。 
     * @return Id 规则 ID，使用十进制数字字符串。普通新增由系统分配；仅 IsUseId=1 的新增请求采用 Data.Id。修改规则内容时忽略 Data.Id，并保留 RuleUuid 指定的规则 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则 ID，使用十进制数字字符串。普通新增由系统分配；仅 IsUseId=1 的新增请求采用 Data.Id。修改规则内容时忽略 Data.Id，并保留 RuleUuid 指定的规则 ID。
     * @param Id 规则 ID，使用十进制数字字符串。普通新增由系统分配；仅 IsUseId=1 的新增请求采用 Data.Id。修改规则内容时忽略 Data.Id，并保留 RuleUuid 指定的规则 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 访问控制端口字符串，最多 200 字节。未使用服务模板时必填，可传 1..65535 的单端口、斜杠连接的端口范围、最多 15 个逗号分隔项，或 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。 
     * @return Port 访问控制端口字符串，最多 200 字节。未使用服务模板时必填，可传 1..65535 的单端口、斜杠连接的端口范围、最多 15 个逗号分隔项，或 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问控制端口字符串，最多 200 字节。未使用服务模板时必填，可传 1..65535 的单端口、斜杠连接的端口范围、最多 15 个逗号分隔项，或 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。
     * @param Port 访问控制端口字符串，最多 200 字节。未使用服务模板时必填，可传 1..65535 的单端口、斜杠连接的端口范围、最多 15 个逗号分隔项，或 -1/-1 表示全部端口；Protocol 为 ANY 或 ICMP 时必须为 -1/-1。使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get IPv4 企业安全组协议，使用区分大小写的大写值 ANY、TCP、UDP 或 ICMP；ANY 表示所有 IPv4 协议。未使用服务模板时必填，ANY 和 ICMP 必须搭配 Port=-1/-1；使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。ICMPv6 使用独立的 IPv6 企业安全组接口。 
     * @return Protocol IPv4 企业安全组协议，使用区分大小写的大写值 ANY、TCP、UDP 或 ICMP；ANY 表示所有 IPv4 协议。未使用服务模板时必填，ANY 和 ICMP 必须搭配 Port=-1/-1；使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。ICMPv6 使用独立的 IPv6 企业安全组接口。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set IPv4 企业安全组协议，使用区分大小写的大写值 ANY、TCP、UDP 或 ICMP；ANY 表示所有 IPv4 协议。未使用服务模板时必填，ANY 和 ICMP 必须搭配 Port=-1/-1；使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。ICMPv6 使用独立的 IPv6 企业安全组接口。
     * @param Protocol IPv4 企业安全组协议，使用区分大小写的大写值 ANY、TCP、UDP 或 ICMP；ANY 表示所有 IPv4 协议。未使用服务模板时必填，ANY 和 ICMP 必须搭配 Port=-1/-1；使用 ServiceTemplateId 时，Protocol 和 Port 可同时省略或留空，如填写非空值则必须为 Protocol=ANY、Port=-1/-1。ICMPv6 使用独立的 IPv6 企业安全组接口。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 规则生效范围，使用大写 SG、LH、NONE 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器，NONE 表示未设置范围。新增时省略默认为 SG；修改规则内容时省略或使用 NONE 均保留原范围。组合项会去重。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。 
     * @return Scope 规则生效范围，使用大写 SG、LH、NONE 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器，NONE 表示未设置范围。新增时省略默认为 SG；修改规则内容时省略或使用 NONE 均保留原范围。组合项会去重。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 规则生效范围，使用大写 SG、LH、NONE 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器，NONE 表示未设置范围。新增时省略默认为 SG；修改规则内容时省略或使用 NONE 均保留原范围。组合项会去重。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
     * @param Scope 规则生效范围，使用大写 SG、LH、NONE 或无空格的逗号分隔组合；SG 表示安全组，LH 表示轻量应用服务器，NONE 表示未设置范围。新增时省略默认为 SG；修改规则内容时省略或使用 NONE 均保留原范围。组合项会去重。范围包含 LH 时，SourceType、DestType 均不能为 template，且不能使用 ServiceTemplateId。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 协议端口模板 ID，最多 50 字节。仅支持通过 VPC DescribeServiceTemplates 或 DescribeServiceTemplateGroups 查询的广州地域（ap-guangzhou）服务模板，即 ServiceTemplateId（ppm-）或 ServiceTemplateGroupId（ppmg-）。非空时 Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 包含 LH 时不能使用服务模板。 
     * @return ServiceTemplateId 协议端口模板 ID，最多 50 字节。仅支持通过 VPC DescribeServiceTemplates 或 DescribeServiceTemplateGroups 查询的广州地域（ap-guangzhou）服务模板，即 ServiceTemplateId（ppm-）或 ServiceTemplateGroupId（ppmg-）。非空时 Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 协议端口模板 ID，最多 50 字节。仅支持通过 VPC DescribeServiceTemplates 或 DescribeServiceTemplateGroups 查询的广州地域（ap-guangzhou）服务模板，即 ServiceTemplateId（ppm-）或 ServiceTemplateGroupId（ppmg-）。非空时 Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
     * @param ServiceTemplateId 协议端口模板 ID，最多 50 字节。仅支持通过 VPC DescribeServiceTemplates 或 DescribeServiceTemplateGroups 查询的广州地域（ap-guangzhou）服务模板，即 ServiceTemplateId（ppm-）或 ServiceTemplateGroupId（ppmg-）。非空时 Protocol 和 Port 可同时省略或留空；如填写非空值则必须为 Protocol=ANY、Port=-1/-1。Scope 包含 LH 时不能使用服务模板。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 保留字段。新增和修改请求均忽略 Uid，无法通过该字段指定或保留规则标识，建议省略。 
     * @return Uid 保留字段。新增和修改请求均忽略 Uid，无法通过该字段指定或保留规则标识，建议省略。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 保留字段。新增和修改请求均忽略 Uid，无法通过该字段指定或保留规则标识，建议省略。
     * @param Uid 保留字段。新增和修改请求均忽略 Uid，无法通过该字段指定或保留规则标识，建议省略。
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

