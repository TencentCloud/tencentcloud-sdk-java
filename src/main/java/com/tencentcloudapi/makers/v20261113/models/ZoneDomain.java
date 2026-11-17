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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneDomain extends AbstractModel {

    /**
    * <p>Custom 或 Preset</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>绑定的环境 slug，默认 Production</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>加速区域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>CNAME</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * <p>IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6")
    @Expose
    private SwitchConfig Ipv6;

    /**
    * <p>HTTP/2</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Http2")
    @Expose
    private SwitchConfig Http2;

    /**
    * <p>OCSP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcspStapling")
    @Expose
    private SwitchConfig OcspStapling;

    /**
    * <p>强制 HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirectConfig ForceRedirect;

    /**
    * <p>HSTS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hsts")
    @Expose
    private HstsConfig Hsts;

    /**
    * <p>归属校验</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
     * Get <p>Custom 或 Preset</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>Custom 或 Preset</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Custom 或 Preset</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>Custom 或 Preset</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>绑定的环境 slug，默认 Production</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env <p>绑定的环境 slug，默认 Production</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>绑定的环境 slug，默认 Production</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env <p>绑定的环境 slug，默认 Production</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>加速区域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area <p>加速区域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>加速区域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area <p>加速区域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>CNAME</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname <p>CNAME</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>CNAME</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname <p>CNAME</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDomain <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDomain <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
    }

    /**
     * Get <p>IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 <p>IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchConfig getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set <p>IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 <p>IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6(SwitchConfig Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get <p>HTTP/2</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Http2 <p>HTTP/2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchConfig getHttp2() {
        return this.Http2;
    }

    /**
     * Set <p>HTTP/2</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Http2 <p>HTTP/2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttp2(SwitchConfig Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get <p>OCSP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcspStapling <p>OCSP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchConfig getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set <p>OCSP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcspStapling <p>OCSP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcspStapling(SwitchConfig OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get <p>强制 HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect <p>强制 HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirectConfig getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set <p>强制 HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect <p>强制 HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirectConfig ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get <p>HSTS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hsts <p>HSTS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HstsConfig getHsts() {
        return this.Hsts;
    }

    /**
     * Set <p>HSTS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hsts <p>HSTS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHsts(HstsConfig Hsts) {
        this.Hsts = Hsts;
    }

    /**
     * Get <p>归属校验</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnershipVerification <p>归属校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set <p>归属校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnershipVerification <p>归属校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    public ZoneDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneDomain(ZoneDomain source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new SwitchConfig(source.Ipv6);
        }
        if (source.Http2 != null) {
            this.Http2 = new SwitchConfig(source.Http2);
        }
        if (source.OcspStapling != null) {
            this.OcspStapling = new SwitchConfig(source.OcspStapling);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirectConfig(source.ForceRedirect);
        }
        if (source.Hsts != null) {
            this.Hsts = new HstsConfig(source.Hsts);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "Http2.", this.Http2);
        this.setParamObj(map, prefix + "OcspStapling.", this.OcspStapling);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);

    }
}

