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

public class CreateDnsRecordRequest extends AbstractModel{

    /**
    * DNS记录所属站点ID。
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
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS记录名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNS记录内容。
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
    * 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 该参数在创建MX记录时生效，值越小优先级越高，用户可指定值范围1~50，不指定默认为0。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get DNS记录所属站点ID。 
     * @return ZoneId DNS记录所属站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set DNS记录所属站点ID。
     * @param ZoneId DNS记录所属站点ID。
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
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li> 
     * @return Type DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
     */
    public String getType() {
        return this.Type;
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
     * @param Type DNS记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器，相关记录值/优先级参数由邮件注册商提供。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS记录名。 
     * @return Name DNS记录名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set DNS记录名。
     * @param Name DNS记录名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNS记录内容。 
     * @return Content DNS记录内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS记录内容。
     * @param Content DNS记录内容。
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
     * Get 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒。 
     * @return TTL 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒。
     * @param TTL 缓存时间，数值越小，修改记录各地生效时间越快，默认为300，单位：秒。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 该参数在创建MX记录时生效，值越小优先级越高，用户可指定值范围1~50，不指定默认为0。 
     * @return Priority 该参数在创建MX记录时生效，值越小优先级越高，用户可指定值范围1~50，不指定默认为0。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 该参数在创建MX记录时生效，值越小优先级越高，用户可指定值范围1~50，不指定默认为0。
     * @param Priority 该参数在创建MX记录时生效，值越小优先级越高，用户可指定值范围1~50，不指定默认为0。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CreateDnsRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDnsRecordRequest(CreateDnsRecordRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

