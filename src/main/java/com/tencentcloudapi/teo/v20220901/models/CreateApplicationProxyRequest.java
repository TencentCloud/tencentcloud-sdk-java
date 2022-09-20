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

public class CreateApplicationProxyRequest extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

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
    private Ipv6 Ipv6;

    /**
    * 规则详细信息。
不填写则不创建规则。
    */
    @SerializedName("ApplicationProxyRules")
    @Expose
    private ApplicationProxyRule [] ApplicationProxyRules;

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
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6访问配置。
不填写表示关闭Ipv6访问。
     * @param Ipv6 Ipv6访问配置。
不填写表示关闭Ipv6访问。
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get 规则详细信息。
不填写则不创建规则。 
     * @return ApplicationProxyRules 规则详细信息。
不填写则不创建规则。
     */
    public ApplicationProxyRule [] getApplicationProxyRules() {
        return this.ApplicationProxyRules;
    }

    /**
     * Set 规则详细信息。
不填写则不创建规则。
     * @param ApplicationProxyRules 规则详细信息。
不填写则不创建规则。
     */
    public void setApplicationProxyRules(ApplicationProxyRule [] ApplicationProxyRules) {
        this.ApplicationProxyRules = ApplicationProxyRules;
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
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.ApplicationProxyRules != null) {
            this.ApplicationProxyRules = new ApplicationProxyRule[source.ApplicationProxyRules.length];
            for (int i = 0; i < source.ApplicationProxyRules.length; i++) {
                this.ApplicationProxyRules[i] = new ApplicationProxyRule(source.ApplicationProxyRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamArrayObj(map, prefix + "ApplicationProxyRules.", this.ApplicationProxyRules);

    }
}

