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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnsRecord extends AbstractModel {

    /**
    * 站点 ID。<br>注意：ZoneId 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS 记录 ID。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * DNS 记录名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNS 记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器。存在多条 MX 记录时，优先级越低越优先；</li>
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
    * DNS 记录解析线路，不指定默认为 Default，表示默认解析线路，代表全部地域生效。<br>解析线路配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。<br>取值请参考：[解析线路及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * DNS 记录内容。根据 Type 值填入与之相对应的内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 缓存时间，取值范围 60~86400，数值越小，修改记录各地生效时间越快，单位：秒。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS 记录权重，取值范围 -1~100，为 -1 时表示不分配权重，为 0 时表示不解析。权重配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX 记录优先级，取值范围 0~50，数值越小越优先。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * DNS 记录解析状态，取值有：<li>enable：已生效；</li><li>disable：已停用。</li>注意：Status 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间。<br>注意：CreatedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 修改时间。<br>注意：ModifiedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get 站点 ID。<br>注意：ZoneId 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。 
     * @return ZoneId 站点 ID。<br>注意：ZoneId 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。<br>注意：ZoneId 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     * @param ZoneId 站点 ID。<br>注意：ZoneId 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DNS 记录 ID。 
     * @return RecordId DNS 记录 ID。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set DNS 记录 ID。
     * @param RecordId DNS 记录 ID。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get DNS 记录名。 
     * @return Name DNS 记录名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set DNS 记录名。
     * @param Name DNS 记录名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNS 记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li> 
     * @return Type DNS 记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器。存在多条 MX 记录时，优先级越低越优先；</li>
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
     * Set DNS 记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器。存在多条 MX 记录时，优先级越低越优先；</li>
<li>CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址；</li>
<li>TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）；</li>
<li>NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录；</li>
<li>CAA：指定可为本站点颁发证书的 CA；</li>
<li>SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理。</li>
     * @param Type DNS 记录类型，取值有：
<li>A：将域名指向一个外网 IPv4 地址，如 8.8.8.8；</li>
<li>AAAA：将域名指向一个外网 IPv6 地址；</li>
<li>MX：用于邮箱服务器。存在多条 MX 记录时，优先级越低越优先；</li>
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
     * Get DNS 记录解析线路，不指定默认为 Default，表示默认解析线路，代表全部地域生效。<br>解析线路配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。<br>取值请参考：[解析线路及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。 
     * @return Location DNS 记录解析线路，不指定默认为 Default，表示默认解析线路，代表全部地域生效。<br>解析线路配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。<br>取值请参考：[解析线路及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS 记录解析线路，不指定默认为 Default，表示默认解析线路，代表全部地域生效。<br>解析线路配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。<br>取值请参考：[解析线路及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
     * @param Location DNS 记录解析线路，不指定默认为 Default，表示默认解析线路，代表全部地域生效。<br>解析线路配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。<br>取值请参考：[解析线路及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get DNS 记录内容。根据 Type 值填入与之相对应的内容。 
     * @return Content DNS 记录内容。根据 Type 值填入与之相对应的内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS 记录内容。根据 Type 值填入与之相对应的内容。
     * @param Content DNS 记录内容。根据 Type 值填入与之相对应的内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 缓存时间，取值范围 60~86400，数值越小，修改记录各地生效时间越快，单位：秒。 
     * @return TTL 缓存时间，取值范围 60~86400，数值越小，修改记录各地生效时间越快，单位：秒。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 缓存时间，取值范围 60~86400，数值越小，修改记录各地生效时间越快，单位：秒。
     * @param TTL 缓存时间，取值范围 60~86400，数值越小，修改记录各地生效时间越快，单位：秒。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS 记录权重，取值范围 -1~100，为 -1 时表示不分配权重，为 0 时表示不解析。权重配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。 
     * @return Weight DNS 记录权重，取值范围 -1~100，为 -1 时表示不分配权重，为 0 时表示不解析。权重配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS 记录权重，取值范围 -1~100，为 -1 时表示不分配权重，为 0 时表示不解析。权重配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。
     * @param Weight DNS 记录权重，取值范围 -1~100，为 -1 时表示不分配权重，为 0 时表示不解析。权重配置仅适用于当 Type（DNS 记录类型）为 A、AAAA、CNAME 时。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX 记录优先级，取值范围 0~50，数值越小越优先。 
     * @return Priority MX 记录优先级，取值范围 0~50，数值越小越优先。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX 记录优先级，取值范围 0~50，数值越小越优先。
     * @param Priority MX 记录优先级，取值范围 0~50，数值越小越优先。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get DNS 记录解析状态，取值有：<li>enable：已生效；</li><li>disable：已停用。</li>注意：Status 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。 
     * @return Status DNS 记录解析状态，取值有：<li>enable：已生效；</li><li>disable：已停用。</li>注意：Status 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNS 记录解析状态，取值有：<li>enable：已生效；</li><li>disable：已停用。</li>注意：Status 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     * @param Status DNS 记录解析状态，取值有：<li>enable：已生效；</li><li>disable：已停用。</li>注意：Status 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间。<br>注意：CreatedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。 
     * @return CreatedOn 创建时间。<br>注意：CreatedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间。<br>注意：CreatedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     * @param CreatedOn 创建时间。<br>注意：CreatedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 修改时间。<br>注意：ModifiedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。 
     * @return ModifiedOn 修改时间。<br>注意：ModifiedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 修改时间。<br>注意：ModifiedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     * @param ModifiedOn 修改时间。<br>注意：ModifiedOn 仅做出参使用，在 ModifyDnsRecords 不可作为入参使用，如有传此参数，会忽略。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public DnsRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsRecord(DnsRecord source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

