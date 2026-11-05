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

public class WhiteRuleInfo extends AbstractModel {

    /**
    * <p>访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。</p>
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * <p>文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。</p>
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * <p>文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>服务端内部字段。</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。</p>
    */
    @SerializedName("IdsRuleId")
    @Expose
    private String IdsRuleId;

    /**
    * <p>服务端保留字段。</p>
    */
    @SerializedName("IdsRuleName")
    @Expose
    private String IdsRuleName;

    /**
    * <p>RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。</p>
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * <p>访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。</p>
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * <p>HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 &lt;#cfw-splite#&gt; 分隔。</p>
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * <p>白名单策略唯一 ID。</p>
    */
    @SerializedName("WhiteId")
    @Expose
    private String WhiteId;

    /**
    * <p>HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。</p>
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
    * <p>风险事件类型</p>
    */
    @SerializedName("RiskEventType")
    @Expose
    private String RiskEventType;

    /**
     * Get <p>访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。</p> 
     * @return DstIP <p>访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。</p>
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set <p>访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。</p>
     * @param DstIP <p>访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。</p>
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get <p>文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。</p> 
     * @return FileMd5 <p>文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。</p>
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set <p>文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。</p>
     * @param FileMd5 <p>文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。</p>
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get <p>文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p> 
     * @return FileName <p>文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
     * @param FileName <p>文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。</p> 
     * @return HostName <p>HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。</p>
     * @param HostName <p>HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>服务端内部字段。</p> 
     * @return Id <p>服务端内部字段。</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>服务端内部字段。</p>
     * @param Id <p>服务端内部字段。</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。</p> 
     * @return IdsRuleId <p>IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。</p>
     */
    public String getIdsRuleId() {
        return this.IdsRuleId;
    }

    /**
     * Set <p>IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。</p>
     * @param IdsRuleId <p>IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。</p>
     */
    public void setIdsRuleId(String IdsRuleId) {
        this.IdsRuleId = IdsRuleId;
    }

    /**
     * Get <p>服务端保留字段。</p> 
     * @return IdsRuleName <p>服务端保留字段。</p>
     */
    public String getIdsRuleName() {
        return this.IdsRuleName;
    }

    /**
     * Set <p>服务端保留字段。</p>
     * @param IdsRuleName <p>服务端保留字段。</p>
     */
    public void setIdsRuleName(String IdsRuleName) {
        this.IdsRuleName = IdsRuleName;
    }

    /**
     * Get <p>RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。</p> 
     * @return Ioc <p>RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。</p>
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set <p>RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。</p>
     * @param Ioc <p>RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。</p>
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get <p>访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。</p> 
     * @return SrcIP <p>访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。</p>
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set <p>访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。</p>
     * @param SrcIP <p>访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。</p>
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get <p>HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p> 
     * @return Url <p>HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
     * @param Url <p>HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 &lt;#cfw-splite#&gt; 分隔。</p> 
     * @return UserAgent <p>HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 &lt;#cfw-splite#&gt; 分隔。</p>
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set <p>HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 &lt;#cfw-splite#&gt; 分隔。</p>
     * @param UserAgent <p>HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 &lt;#cfw-splite#&gt; 分隔。</p>
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get <p>白名单策略唯一 ID。</p> 
     * @return WhiteId <p>白名单策略唯一 ID。</p>
     */
    public String getWhiteId() {
        return this.WhiteId;
    }

    /**
     * Set <p>白名单策略唯一 ID。</p>
     * @param WhiteId <p>白名单策略唯一 ID。</p>
     */
    public void setWhiteId(String WhiteId) {
        this.WhiteId = WhiteId;
    }

    /**
     * Get <p>HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。</p> 
     * @return XForwardedFor <p>HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。</p>
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set <p>HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。</p>
     * @param XForwardedFor <p>HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。</p>
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
    }

    /**
     * Get <p>风险事件类型</p> 
     * @return RiskEventType <p>风险事件类型</p>
     */
    public String getRiskEventType() {
        return this.RiskEventType;
    }

    /**
     * Set <p>风险事件类型</p>
     * @param RiskEventType <p>风险事件类型</p>
     */
    public void setRiskEventType(String RiskEventType) {
        this.RiskEventType = RiskEventType;
    }

    public WhiteRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteRuleInfo(WhiteRuleInfo source) {
        if (source.DstIP != null) {
            this.DstIP = new String(source.DstIP);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IdsRuleId != null) {
            this.IdsRuleId = new String(source.IdsRuleId);
        }
        if (source.IdsRuleName != null) {
            this.IdsRuleName = new String(source.IdsRuleName);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.WhiteId != null) {
            this.WhiteId = new String(source.WhiteId);
        }
        if (source.XForwardedFor != null) {
            this.XForwardedFor = new String(source.XForwardedFor);
        }
        if (source.RiskEventType != null) {
            this.RiskEventType = new String(source.RiskEventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DstIP", this.DstIP);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IdsRuleId", this.IdsRuleId);
        this.setParamSimple(map, prefix + "IdsRuleName", this.IdsRuleName);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "WhiteId", this.WhiteId);
        this.setParamSimple(map, prefix + "XForwardedFor", this.XForwardedFor);
        this.setParamSimple(map, prefix + "RiskEventType", this.RiskEventType);

    }
}

