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

public class DnsRecord extends AbstractModel{

    /**
    * 记录 ID。
    */
    @SerializedName("DnsRecordId")
    @Expose
    private String DnsRecordId;

    /**
    * DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
    */
    @SerializedName("DnsRecordType")
    @Expose
    private String DnsRecordType;

    /**
    * 记录名称。
    */
    @SerializedName("DnsRecordName")
    @Expose
    private String DnsRecordName;

    /**
    * 记录值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 缓存时间，数值越小，修改记录各地生效时间越快，单位：秒。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * MX记录优先级，数值越小越优先。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 修改时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 域名锁定状态。
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 记录解析状态，取值有：
<li>active：生效；</li>
<li>pending：不生效。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 域名服务类型，取值有：
<li>lb：负载均衡；</li>
<li>security：安全；</li>
<li>l4：四层代理。</li>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String [] DomainStatus;

    /**
     * Get 记录 ID。 
     * @return DnsRecordId 记录 ID。
     */
    public String getDnsRecordId() {
        return this.DnsRecordId;
    }

    /**
     * Set 记录 ID。
     * @param DnsRecordId 记录 ID。
     */
    public void setDnsRecordId(String DnsRecordId) {
        this.DnsRecordId = DnsRecordId;
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
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li> 
     * @return DnsRecordType DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
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
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
     * @param DnsRecordType DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
     */
    public void setDnsRecordType(String DnsRecordType) {
        this.DnsRecordType = DnsRecordType;
    }

    /**
     * Get 记录名称。 
     * @return DnsRecordName 记录名称。
     */
    public String getDnsRecordName() {
        return this.DnsRecordName;
    }

    /**
     * Set 记录名称。
     * @param DnsRecordName 记录名称。
     */
    public void setDnsRecordName(String DnsRecordName) {
        this.DnsRecordName = DnsRecordName;
    }

    /**
     * Get 记录值。 
     * @return Content 记录值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 记录值。
     * @param Content 记录值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li> 
     * @return Mode 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>
     * @param Mode 代理模式，取值有：
<li>dns_only：仅DNS解析；</li>
<li>proxied：代理加速。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 缓存时间，数值越小，修改记录各地生效时间越快，单位：秒。 
     * @return TTL 缓存时间，数值越小，修改记录各地生效时间越快，单位：秒。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 缓存时间，数值越小，修改记录各地生效时间越快，单位：秒。
     * @param TTL 缓存时间，数值越小，修改记录各地生效时间越快，单位：秒。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get MX记录优先级，数值越小越优先。 
     * @return Priority MX记录优先级，数值越小越优先。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX记录优先级，数值越小越优先。
     * @param Priority MX记录优先级，数值越小越优先。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 创建时间。 
     * @return CreatedOn 创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间。
     * @param CreatedOn 创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 修改时间。 
     * @return ModifiedOn 修改时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 修改时间。
     * @param ModifiedOn 修改时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 域名锁定状态。 
     * @return Locked 域名锁定状态。
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set 域名锁定状态。
     * @param Locked 域名锁定状态。
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 记录解析状态，取值有：
<li>active：生效；</li>
<li>pending：不生效。</li> 
     * @return Status 记录解析状态，取值有：
<li>active：生效；</li>
<li>pending：不生效。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 记录解析状态，取值有：
<li>active：生效；</li>
<li>pending：不生效。</li>
     * @param Status 记录解析状态，取值有：
<li>active：生效；</li>
<li>pending：不生效。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 域名服务类型，取值有：
<li>lb：负载均衡；</li>
<li>security：安全；</li>
<li>l4：四层代理。</li> 
     * @return DomainStatus 域名服务类型，取值有：
<li>lb：负载均衡；</li>
<li>security：安全；</li>
<li>l4：四层代理。</li>
     */
    public String [] getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 域名服务类型，取值有：
<li>lb：负载均衡；</li>
<li>security：安全；</li>
<li>l4：四层代理。</li>
     * @param DomainStatus 域名服务类型，取值有：
<li>lb：负载均衡；</li>
<li>security：安全；</li>
<li>l4：四层代理。</li>
     */
    public void setDomainStatus(String [] DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    public DnsRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsRecord(DnsRecord source) {
        if (source.DnsRecordId != null) {
            this.DnsRecordId = new String(source.DnsRecordId);
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String[source.DomainStatus.length];
            for (int i = 0; i < source.DomainStatus.length; i++) {
                this.DomainStatus[i] = new String(source.DomainStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsRecordId", this.DnsRecordId);
        this.setParamSimple(map, prefix + "DnsRecordType", this.DnsRecordType);
        this.setParamSimple(map, prefix + "DnsRecordName", this.DnsRecordName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamArraySimple(map, prefix + "DomainStatus.", this.DomainStatus);

    }
}

