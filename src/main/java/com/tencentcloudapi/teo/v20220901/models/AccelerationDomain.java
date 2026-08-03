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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccelerationDomain extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>加速域名名称。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>加速域名状态</p><p>枚举值：</p><ul><li>online： 已生效</li><li>process： 部署中</li><li>offline： 已停用</li><li>init： 未生效，待激活站点</li></ul>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String DomainStatus;

    /**
    * <p>CNAME 地址。</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>IPv6 状态，取值有：</p><li>follow：遵循站点IPv6配置；</li><li>on：开启状态；</li><li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * <p>加速域名归属权验证状态，取值有： </p><li>pending：待验证；</li><li>finished：已完成验证。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentificationStatus")
    @Expose
    private String IdentificationStatus;

    /**
    * <p>加速域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * <p>源站信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginDetail")
    @Expose
    private OriginDetail OriginDetail;

    /**
    * <p>回源协议，取值有：</p><li>FOLLOW：协议跟随；</li><li>HTTP：HTTP协议回源；</li><li>HTTPS：HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * <p>HTTP 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * <p>HTTPS 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * <p>加速域名证书信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private AccelerationDomainCertificate Certificate;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>修改时间。</p>
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>加速域名名称。</p> 
     * @return DomainName <p>加速域名名称。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>加速域名名称。</p>
     * @param DomainName <p>加速域名名称。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>加速域名状态</p><p>枚举值：</p><ul><li>online： 已生效</li><li>process： 部署中</li><li>offline： 已停用</li><li>init： 未生效，待激活站点</li></ul> 
     * @return DomainStatus <p>加速域名状态</p><p>枚举值：</p><ul><li>online： 已生效</li><li>process： 部署中</li><li>offline： 已停用</li><li>init： 未生效，待激活站点</li></ul>
     */
    public String getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set <p>加速域名状态</p><p>枚举值：</p><ul><li>online： 已生效</li><li>process： 部署中</li><li>offline： 已停用</li><li>init： 未生效，待激活站点</li></ul>
     * @param DomainStatus <p>加速域名状态</p><p>枚举值：</p><ul><li>online： 已生效</li><li>process： 部署中</li><li>offline： 已停用</li><li>init： 未生效，待激活站点</li></ul>
     */
    public void setDomainStatus(String DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get <p>CNAME 地址。</p> 
     * @return Cname <p>CNAME 地址。</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>CNAME 地址。</p>
     * @param Cname <p>CNAME 地址。</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>IPv6 状态，取值有：</p><li>follow：遵循站点IPv6配置；</li><li>on：开启状态；</li><li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Status <p>IPv6 状态，取值有：</p><li>follow：遵循站点IPv6配置；</li><li>on：开启状态；</li><li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set <p>IPv6 状态，取值有：</p><li>follow：遵循站点IPv6配置；</li><li>on：开启状态；</li><li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Status <p>IPv6 状态，取值有：</p><li>follow：遵循站点IPv6配置；</li><li>on：开启状态；</li><li>off：关闭状态。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    /**
     * Get <p>加速域名归属权验证状态，取值有： </p><li>pending：待验证；</li><li>finished：已完成验证。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentificationStatus <p>加速域名归属权验证状态，取值有： </p><li>pending：待验证；</li><li>finished：已完成验证。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentificationStatus() {
        return this.IdentificationStatus;
    }

    /**
     * Set <p>加速域名归属权验证状态，取值有： </p><li>pending：待验证；</li><li>finished：已完成验证。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentificationStatus <p>加速域名归属权验证状态，取值有： </p><li>pending：待验证；</li><li>finished：已完成验证。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentificationStatus(String IdentificationStatus) {
        this.IdentificationStatus = IdentificationStatus;
    }

    /**
     * Get <p>加速域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnershipVerification <p>加速域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set <p>加速域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnershipVerification <p>加速域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get <p>源站信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginDetail <p>源站信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginDetail getOriginDetail() {
        return this.OriginDetail;
    }

    /**
     * Set <p>源站信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginDetail <p>源站信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginDetail(OriginDetail OriginDetail) {
        this.OriginDetail = OriginDetail;
    }

    /**
     * Get <p>回源协议，取值有：</p><li>FOLLOW：协议跟随；</li><li>HTTP：HTTP协议回源；</li><li>HTTPS：HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginProtocol <p>回源协议，取值有：</p><li>FOLLOW：协议跟随；</li><li>HTTP：HTTP协议回源；</li><li>HTTPS：HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set <p>回源协议，取值有：</p><li>FOLLOW：协议跟随；</li><li>HTTP：HTTP协议回源；</li><li>HTTPS：HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginProtocol <p>回源协议，取值有：</p><li>FOLLOW：协议跟随；</li><li>HTTP：HTTP协议回源；</li><li>HTTPS：HTTPS协议回源。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get <p>HTTP 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpOriginPort <p>HTTP 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set <p>HTTP 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpOriginPort <p>HTTP 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get <p>HTTPS 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpsOriginPort <p>HTTPS 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set <p>HTTPS 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpsOriginPort <p>HTTPS 回源端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get <p>加速域名证书信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate <p>加速域名证书信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccelerationDomainCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>加速域名证书信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate <p>加速域名证书信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(AccelerationDomainCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedOn <p>创建时间。</p>
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedOn <p>创建时间。</p>
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>修改时间。</p> 
     * @return ModifiedOn <p>修改时间。</p>
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>修改时间。</p>
     * @param ModifiedOn <p>修改时间。</p>
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
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
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IPv6Status != null) {
            this.IPv6Status = new String(source.IPv6Status);
        }
        if (source.IdentificationStatus != null) {
            this.IdentificationStatus = new String(source.IdentificationStatus);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.OriginDetail != null) {
            this.OriginDetail = new OriginDetail(source.OriginDetail);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.HttpOriginPort != null) {
            this.HttpOriginPort = new Long(source.HttpOriginPort);
        }
        if (source.HttpsOriginPort != null) {
            this.HttpsOriginPort = new Long(source.HttpsOriginPort);
        }
        if (source.Certificate != null) {
            this.Certificate = new AccelerationDomainCertificate(source.Certificate);
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
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IPv6Status", this.IPv6Status);
        this.setParamSimple(map, prefix + "IdentificationStatus", this.IdentificationStatus);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamObj(map, prefix + "OriginDetail.", this.OriginDetail);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HttpOriginPort", this.HttpOriginPort);
        this.setParamSimple(map, prefix + "HttpsOriginPort", this.HttpsOriginPort);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

