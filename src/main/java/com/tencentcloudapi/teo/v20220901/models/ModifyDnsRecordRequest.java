/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDnsRecordRequest extends AbstractModel{

    /**
    * 记录ID。
    */
    @SerializedName("DnsRecordId")
    @Expose
    private String DnsRecordId;

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>不填写保持原有配置。
    */
    @SerializedName("DnsRecordType")
    @Expose
    private String DnsRecordType;

    /**
    * 记录名称，由主机记录+站点名称组成，不填写保持原有配置。
    */
    @SerializedName("DnsRecordName")
    @Expose
    private String DnsRecordName;

    /**
    * 记录内容，不填写保持原有配置。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒，不填写保持原有配置。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 该参数在修改MX记录时生效，值越小优先级越高，用户可指定值范围为1~50，不指定默认为0，不填写保持原有配置。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>不填写保持原有配置。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 记录ID。 
     * @return DnsRecordId 记录ID。
     */
    public String getDnsRecordId() {
        return this.DnsRecordId;
    }

    /**
     * Set 记录ID。
     * @param DnsRecordId 记录ID。
     */
    public void setDnsRecordId(String DnsRecordId) {
        this.DnsRecordId = DnsRecordId;
    }

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>不填写保持原有配置。 
     * @return DnsRecordType DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>不填写保持原有配置。
     */
    public String getDnsRecordType() {
        return this.DnsRecordType;
    }

    /**
     * Set DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>不填写保持原有配置。
     * @param DnsRecordType DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>不填写保持原有配置。
     */
    public void setDnsRecordType(String DnsRecordType) {
        this.DnsRecordType = DnsRecordType;
    }

    /**
     * Get 记录名称，由主机记录+站点名称组成，不填写保持原有配置。 
     * @return DnsRecordName 记录名称，由主机记录+站点名称组成，不填写保持原有配置。
     */
    public String getDnsRecordName() {
        return this.DnsRecordName;
    }

    /**
     * Set 记录名称，由主机记录+站点名称组成，不填写保持原有配置。
     * @param DnsRecordName 记录名称，由主机记录+站点名称组成，不填写保持原有配置。
     */
    public void setDnsRecordName(String DnsRecordName) {
        this.DnsRecordName = DnsRecordName;
    }

    /**
     * Get 记录内容，不填写保持原有配置。 
     * @return Content 记录内容，不填写保持原有配置。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 记录内容，不填写保持原有配置。
     * @param Content 记录内容，不填写保持原有配置。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒，不填写保持原有配置。 
     * @return TTL 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒，不填写保持原有配置。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒，不填写保持原有配置。
     * @param TTL 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒，不填写保持原有配置。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 该参数在修改MX记录时生效，值越小优先级越高，用户可指定值范围为1~50，不指定默认为0，不填写保持原有配置。 
     * @return Priority 该参数在修改MX记录时生效，值越小优先级越高，用户可指定值范围为1~50，不指定默认为0，不填写保持原有配置。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 该参数在修改MX记录时生效，值越小优先级越高，用户可指定值范围为1~50，不指定默认为0，不填写保持原有配置。
     * @param Priority 该参数在修改MX记录时生效，值越小优先级越高，用户可指定值范围为1~50，不指定默认为0，不填写保持原有配置。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>不填写保持原有配置。 
     * @return Mode 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>不填写保持原有配置。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>不填写保持原有配置。
     * @param Mode 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>不填写保持原有配置。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ModifyDnsRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDnsRecordRequest(ModifyDnsRecordRequest source) {
        if (source.DnsRecordId != null) {
            this.DnsRecordId = new String(source.DnsRecordId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DnsRecordType != null) {
            this.DnsRecordType = new String(source.DnsRecordType);
        }
        if (source.DnsRecordName != null) {
            this.DnsRecordName = new String(source.DnsRecordName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsRecordId", this.DnsRecordId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DnsRecordType", this.DnsRecordType);
        this.setParamSimple(map, prefix + "DnsRecordName", this.DnsRecordName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

