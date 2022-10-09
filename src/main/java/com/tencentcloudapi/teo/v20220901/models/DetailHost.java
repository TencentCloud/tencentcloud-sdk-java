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

public class DetailHost extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 加速服务状态，取值为：
<li> process：部署中；</li>
<li> online：已启动；</li>
<li> offline：已关闭。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 分配的Cname域名
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 资源ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 锁状态。
    */
    @SerializedName("Lock")
    @Expose
    private Long Lock;

    /**
    * 域名状态类型。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 域名加速地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 加速类型配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccelerateType")
    @Expose
    private AccelerateType AccelerateType;

    /**
    * Https配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 缓存配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * 源站配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 安全类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityType")
    @Expose
    private SecurityType SecurityType;

    /**
    * 缓存键配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 智能压缩配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Waf防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Waf")
    @Expose
    private Waf Waf;

    /**
    * CC防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CC")
    @Expose
    private CC CC;

    /**
    * DDoS防护配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoS")
    @Expose
    private DDoS DDoS;

    /**
    * 智能路由配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * Ipv6访问配置项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

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
     * Get 加速服务状态，取值为：
<li> process：部署中；</li>
<li> online：已启动；</li>
<li> offline：已关闭。</li> 
     * @return Status 加速服务状态，取值为：
<li> process：部署中；</li>
<li> online：已启动；</li>
<li> offline：已关闭。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 加速服务状态，取值为：
<li> process：部署中；</li>
<li> online：已启动；</li>
<li> offline：已关闭。</li>
     * @param Status 加速服务状态，取值为：
<li> process：部署中；</li>
<li> online：已启动；</li>
<li> offline：已关闭。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名。 
     * @return Host 域名。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 域名。
     * @param Host 域名。
     */
    public void setHost(String Host) {
        this.Host = Host;
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
     * Get 分配的Cname域名 
     * @return Cname 分配的Cname域名
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 分配的Cname域名
     * @param Cname 分配的Cname域名
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 资源ID。 
     * @return Id 资源ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID。
     * @param Id 资源ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 锁状态。 
     * @return Lock 锁状态。
     */
    public Long getLock() {
        return this.Lock;
    }

    /**
     * Set 锁状态。
     * @param Lock 锁状态。
     */
    public void setLock(Long Lock) {
        this.Lock = Lock;
    }

    /**
     * Get 域名状态类型。 
     * @return Mode 域名状态类型。
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 域名状态类型。
     * @param Mode 域名状态类型。
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 域名加速地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li> 
     * @return Area 域名加速地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 域名加速地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
     * @param Area 域名加速地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 加速类型配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccelerateType 加速类型配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccelerateType getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set 加速类型配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccelerateType 加速类型配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccelerateType(AccelerateType AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get Https配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https Https配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https Https配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 缓存配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheConfig 缓存配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set 缓存配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheConfig 缓存配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get 源站配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Origin 源站配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin 源站配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 安全类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityType 安全类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityType getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 安全类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityType 安全类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityType(SecurityType SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get 缓存键配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 缓存键配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 缓存键配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 缓存键配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 智能压缩配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 智能压缩配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 智能压缩配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Waf防护配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Waf Waf防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Waf getWaf() {
        return this.Waf;
    }

    /**
     * Set Waf防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Waf Waf防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaf(Waf Waf) {
        this.Waf = Waf;
    }

    /**
     * Get CC防护配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CC CC防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CC getCC() {
        return this.CC;
    }

    /**
     * Set CC防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CC CC防护配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCC(CC CC) {
        this.CC = CC;
    }

    /**
     * Get DDoS防护配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoS DDoS防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoS getDDoS() {
        return this.DDoS;
    }

    /**
     * Set DDoS防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoS DDoS防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoS(DDoS DDoS) {
        this.DDoS = DDoS;
    }

    /**
     * Get 智能路由配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartRouting 智能路由配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set 智能路由配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartRouting 智能路由配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Ipv6访问配置项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 Ipv6访问配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6访问配置项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 Ipv6访问配置项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIpCountry 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIpCountry 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    public DetailHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailHost(DetailHost source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Lock != null) {
            this.Lock = new Long(source.Lock);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new AccelerateType(source.AccelerateType);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.CacheConfig != null) {
            this.CacheConfig = new CacheConfig(source.CacheConfig);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new SecurityType(source.SecurityType);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.Waf != null) {
            this.Waf = new Waf(source.Waf);
        }
        if (source.CC != null) {
            this.CC = new CC(source.CC);
        }
        if (source.DDoS != null) {
            this.DDoS = new DDoS(source.DDoS);
        }
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRouting(source.SmartRouting);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.ClientIpCountry != null) {
            this.ClientIpCountry = new ClientIpCountry(source.ClientIpCountry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Lock", this.Lock);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "AccelerateType.", this.AccelerateType);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "SecurityType.", this.SecurityType);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "Waf.", this.Waf);
        this.setParamObj(map, prefix + "CC.", this.CC);
        this.setParamObj(map, prefix + "DDoS.", this.DDoS);
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "ClientIpCountry.", this.ClientIpCountry);

    }
}

