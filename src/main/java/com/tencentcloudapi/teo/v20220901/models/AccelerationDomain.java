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

public class AccelerationDomain extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 加速域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String DomainStatus;

    /**
    * 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginDetail")
    @Expose
    private OriginDetail OriginDetail;

    /**
    * 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * 域名证书信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private AccelerationDomainCertificate Certificate;

    /**
    * HTTP回源端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * HTTPS回源端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * CNAME 地址。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentificationStatus")
    @Expose
    private String IdentificationStatus;

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
    * 当域名需要进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

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
     * Get 加速域名名称。 
     * @return DomainName 加速域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 加速域名名称。
     * @param DomainName 加速域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li> 
     * @return DomainStatus 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
     */
    public String getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
     * @param DomainStatus 加速域名状态，取值有：
<li>online：已生效；</li>
<li>process：部署中；</li>
<li>offline：已停用；</li>
<li>forbidden：已封禁；</li>
<li>init：未生效，待激活站点；</li>
     */
    public void setDomainStatus(String DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get 源站信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginDetail 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginDetail getOriginDetail() {
        return this.OriginDetail;
    }

    /**
     * Set 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginDetail 源站信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginDetail(OriginDetail OriginDetail) {
        this.OriginDetail = OriginDetail;
    }

    /**
     * Get 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginProtocol 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginProtocol 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get 域名证书信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 域名证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccelerationDomainCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 域名证书信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 域名证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(AccelerationDomainCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get HTTP回源端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpOriginPort HTTP回源端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set HTTP回源端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpOriginPort HTTP回源端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get HTTPS回源端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpsOriginPort HTTPS回源端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set HTTPS回源端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpsOriginPort HTTPS回源端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Status IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Status IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    /**
     * Get CNAME 地址。 
     * @return Cname CNAME 地址。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME 地址。
     * @param Cname CNAME 地址。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentificationStatus 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentificationStatus() {
        return this.IdentificationStatus;
    }

    /**
     * Set 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentificationStatus 加速域名归属权验证状态，取值有： <li>pending：待验证；</li> <li>finished：已完成验证。</li>	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentificationStatus(String IdentificationStatus) {
        this.IdentificationStatus = IdentificationStatus;
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
     * Get 当域名需要进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnershipVerification 当域名需要进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set 当域名需要进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnershipVerification 当域名需要进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    public AccelerationDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomain(AccelerationDomain source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String(source.DomainStatus);
        }
        if (source.OriginDetail != null) {
            this.OriginDetail = new OriginDetail(source.OriginDetail);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.Certificate != null) {
            this.Certificate = new AccelerationDomainCertificate(source.Certificate);
        }
        if (source.HttpOriginPort != null) {
            this.HttpOriginPort = new Long(source.HttpOriginPort);
        }
        if (source.HttpsOriginPort != null) {
            this.HttpsOriginPort = new Long(source.HttpsOriginPort);
        }
        if (source.IPv6Status != null) {
            this.IPv6Status = new String(source.IPv6Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IdentificationStatus != null) {
            this.IdentificationStatus = new String(source.IdentificationStatus);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamObj(map, prefix + "OriginDetail.", this.OriginDetail);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "HttpOriginPort", this.HttpOriginPort);
        this.setParamSimple(map, prefix + "HttpsOriginPort", this.HttpsOriginPort);
        this.setParamSimple(map, prefix + "IPv6Status", this.IPv6Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IdentificationStatus", this.IdentificationStatus);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);

    }
}

