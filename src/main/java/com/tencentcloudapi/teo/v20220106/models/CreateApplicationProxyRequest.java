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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationProxyRequest extends AbstractModel{

    /**
    * 站点ID。
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
    * 当ProxyType=hostname时，表示域名或子域名；
当ProxyType=instance时，表示代理名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 调度模式，取值有：
<li>ip：表示Anycast IP调度；</li>
<li>domain：表示CNAME调度。</li>
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * 是否开启安全，取值有：
<li>0：关闭安全；</li>
<li>1：开启安全。</li>
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * 是否开启加速，取值有：
<li>0：关闭加速；</li>
<li>1：开启加速。</li>
    */
    @SerializedName("AccelerateType")
    @Expose
    private Long AccelerateType;

    /**
    * 字段已经废弃。
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * 字段已经废弃。
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * 规则详细信息。
    */
    @SerializedName("Rule")
    @Expose
    private ApplicationProxyRule [] Rule;

    /**
    * 四层代理模式，取值有：
<li>hostname：表示子域名模式；</li>
<li>instance：表示实例模式。</li>不填写使用默认值instance。
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * 会话保持时间，取值范围：30-3600，单位：秒。
不填写使用默认值600。
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Ipv6访问配置。
不填写表示关闭Ipv6访问。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6Access Ipv6;

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
     * Get 当ProxyType=hostname时，表示域名或子域名；
当ProxyType=instance时，表示代理名称。 
     * @return ProxyName 当ProxyType=hostname时，表示域名或子域名；
当ProxyType=instance时，表示代理名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 当ProxyType=hostname时，表示域名或子域名；
当ProxyType=instance时，表示代理名称。
     * @param ProxyName 当ProxyType=hostname时，表示域名或子域名；
当ProxyType=instance时，表示代理名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 调度模式，取值有：
<li>ip：表示Anycast IP调度；</li>
<li>domain：表示CNAME调度。</li> 
     * @return PlatType 调度模式，取值有：
<li>ip：表示Anycast IP调度；</li>
<li>domain：表示CNAME调度。</li>
     */
    public String getPlatType() {
        return this.PlatType;
    }

    /**
     * Set 调度模式，取值有：
<li>ip：表示Anycast IP调度；</li>
<li>domain：表示CNAME调度。</li>
     * @param PlatType 调度模式，取值有：
<li>ip：表示Anycast IP调度；</li>
<li>domain：表示CNAME调度。</li>
     */
    public void setPlatType(String PlatType) {
        this.PlatType = PlatType;
    }

    /**
     * Get 是否开启安全，取值有：
<li>0：关闭安全；</li>
<li>1：开启安全。</li> 
     * @return SecurityType 是否开启安全，取值有：
<li>0：关闭安全；</li>
<li>1：开启安全。</li>
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 是否开启安全，取值有：
<li>0：关闭安全；</li>
<li>1：开启安全。</li>
     * @param SecurityType 是否开启安全，取值有：
<li>0：关闭安全；</li>
<li>1：开启安全。</li>
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get 是否开启加速，取值有：
<li>0：关闭加速；</li>
<li>1：开启加速。</li> 
     * @return AccelerateType 是否开启加速，取值有：
<li>0：关闭加速；</li>
<li>1：开启加速。</li>
     */
    public Long getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set 是否开启加速，取值有：
<li>0：关闭加速；</li>
<li>1：开启加速。</li>
     * @param AccelerateType 是否开启加速，取值有：
<li>0：关闭加速；</li>
<li>1：开启加速。</li>
     */
    public void setAccelerateType(Long AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get 字段已经废弃。 
     * @return SessionPersist 字段已经废弃。
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 字段已经废弃。
     * @param SessionPersist 字段已经废弃。
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get 字段已经废弃。 
     * @return ForwardClientIp 字段已经废弃。
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set 字段已经废弃。
     * @param ForwardClientIp 字段已经废弃。
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get 规则详细信息。 
     * @return Rule 规则详细信息。
     */
    public ApplicationProxyRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 规则详细信息。
     * @param Rule 规则详细信息。
     */
    public void setRule(ApplicationProxyRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 四层代理模式，取值有：
<li>hostname：表示子域名模式；</li>
<li>instance：表示实例模式。</li>不填写使用默认值instance。 
     * @return ProxyType 四层代理模式，取值有：
<li>hostname：表示子域名模式；</li>
<li>instance：表示实例模式。</li>不填写使用默认值instance。
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 四层代理模式，取值有：
<li>hostname：表示子域名模式；</li>
<li>instance：表示实例模式。</li>不填写使用默认值instance。
     * @param ProxyType 四层代理模式，取值有：
<li>hostname：表示子域名模式；</li>
<li>instance：表示实例模式。</li>不填写使用默认值instance。
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get 会话保持时间，取值范围：30-3600，单位：秒。
不填写使用默认值600。 
     * @return SessionPersistTime 会话保持时间，取值范围：30-3600，单位：秒。
不填写使用默认值600。
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持时间，取值范围：30-3600，单位：秒。
不填写使用默认值600。
     * @param SessionPersistTime 会话保持时间，取值范围：30-3600，单位：秒。
不填写使用默认值600。
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Ipv6访问配置。
不填写表示关闭Ipv6访问。 
     * @return Ipv6 Ipv6访问配置。
不填写表示关闭Ipv6访问。
     */
    public Ipv6Access getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6访问配置。
不填写表示关闭Ipv6访问。
     * @param Ipv6 Ipv6访问配置。
不填写表示关闭Ipv6访问。
     */
    public void setIpv6(Ipv6Access Ipv6) {
        this.Ipv6 = Ipv6;
    }

    public CreateApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationProxyRequest(CreateApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.PlatType != null) {
            this.PlatType = new String(source.PlatType);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new Long(source.AccelerateType);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.Rule != null) {
            this.Rule = new ApplicationProxyRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new ApplicationProxyRule(source.Rule[i]);
            }
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6Access(source.Ipv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);

    }
}

