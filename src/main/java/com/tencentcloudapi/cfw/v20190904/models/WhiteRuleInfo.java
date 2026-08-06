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
    * 访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * 文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 服务端内部字段。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。
    */
    @SerializedName("IdsRuleId")
    @Expose
    private String IdsRuleId;

    /**
    * 服务端保留字段。
    */
    @SerializedName("IdsRuleName")
    @Expose
    private String IdsRuleName;

    /**
    * RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * 访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 <#cfw-splite#> 分隔。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 白名单策略唯一 ID。
    */
    @SerializedName("WhiteId")
    @Expose
    private String WhiteId;

    /**
    * HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
     * Get 访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。 
     * @return DstIP 访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set 访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。
     * @param DstIP 访问目的。RuleType=2：本字段与 SrcIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 SrcIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 SrcIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；FwType=16 时具体目的 IPv4 可带端口。RuleType=8：IP、CIDR、IP:端口或 CIDR:端口，可与 SrcIP 组合；RuleType=9：IP、CIDR 或带端口地址，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4 或 IPv4:端口。IPv6 带端口时使用 [IPv6]:端口；已选字段的多值用逗号分隔。
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get 文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。 
     * @return FileMd5 文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。
     * @param FileMd5 文件 MD5，仅 RuleType=9。32 位十六进制；多值逗号分隔，最多 10 个。
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。 
     * @return FileName 文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
     * @param FileName 文件名，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。 
     * @return HostName HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。
     * @param HostName HTTP Host，仅 RuleType=9；填写主机名或 IP，支持 ?、* 通配符并区分大小写；多值用逗号分隔。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 服务端内部字段。 
     * @return Id 服务端内部字段。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 服务端内部字段。
     * @param Id 服务端内部字段。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。 
     * @return IdsRuleId IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。
     */
    public String getIdsRuleId() {
        return this.IdsRuleId;
    }

    /**
     * Set IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。
     * @param IdsRuleId IPS 规则 ID，取自 DescribeIpsRuleListNew.Data[].RuleID。RuleType=6 必填；RuleType=9 可选，填写时同时填写 SrcIP 或 DstIP。
     */
    public void setIdsRuleId(String IdsRuleId) {
        this.IdsRuleId = IdsRuleId;
    }

    /**
     * Get 服务端保留字段。 
     * @return IdsRuleName 服务端保留字段。
     */
    public String getIdsRuleName() {
        return this.IdsRuleName;
    }

    /**
     * Set 服务端保留字段。
     * @param IdsRuleName 服务端保留字段。
     */
    public void setIdsRuleName(String IdsRuleName) {
        this.IdsRuleName = IdsRuleName;
    }

    /**
     * Get RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。 
     * @return Ioc RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。
     * @param Ioc RuleType=3 填一个合法域名；RuleType=4 填情报 IP、CIDR 或域名。
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get 访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。 
     * @return SrcIP 访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。
     * @param SrcIP 访问源。RuleType=2：本字段与 DstIP 两个字段中恰好填写一个，值为精确 IP；RuleType=5：本字段与 DstIP 两个字段中恰好填写一个，值为资产 instance_id；RuleType=6：与 DstIP 至少一项为具体 IP，另一项可省略或使用同 IP 版本的 0.0.0.0/0、::/0，两项均为具体 IP 时使用相同 IP 版本；RuleType=8：IP 或 CIDR；RuleType=9：IP 或 CIDR，可与 NDR 专属条件组合；搭配 IdsRuleId 时使用 IPv4。源地址使用无端口格式；已选字段的多值用逗号分隔。
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。 
     * @return Url HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
     * @param Url HTTP URL，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；多值用逗号分隔，最多 10 个。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 <#cfw-splite#> 分隔。 
     * @return UserAgent HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 <#cfw-splite#> 分隔。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 <#cfw-splite#> 分隔。
     * @param UserAgent HTTP User-Agent，仅 RuleType=9；支持精确匹配及 ?、* 通配符，区分大小写；单值少于 255 个字符，最多 2 个，多值用 <#cfw-splite#> 分隔。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 白名单策略唯一 ID。 
     * @return WhiteId 白名单策略唯一 ID。
     */
    public String getWhiteId() {
        return this.WhiteId;
    }

    /**
     * Set 白名单策略唯一 ID。
     * @param WhiteId 白名单策略唯一 ID。
     */
    public void setWhiteId(String WhiteId) {
        this.WhiteId = WhiteId;
    }

    /**
     * Get HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。 
     * @return XForwardedFor HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。
     * @param XForwardedFor HTTP X-Forwarded-For，仅 RuleType=9；精确 IP，多值逗号分隔，最多 50 个。
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
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

    }
}

