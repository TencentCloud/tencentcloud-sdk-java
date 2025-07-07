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

public class ModifyApplicationProxyRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 代理 ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 当 ProxyType=hostname 时，表示域名或子域名；
当 ProxyType=instance 时，表示代理名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 会话保持时间，取值范围：30-3600，单位：秒。
不填写保持原有配置。
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * 四层代理模式，取值有：
<li>instance：表示实例模式。</li>不填写使用默认值instance。
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * Ipv6 访问配置，不填写保持原有配置。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * 中国大陆加速优化配置。 不填写表示保持原有配置。
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

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
     * Get 代理 ID。 
     * @return ProxyId 代理 ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 代理 ID。
     * @param ProxyId 代理 ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 当 ProxyType=hostname 时，表示域名或子域名；
当 ProxyType=instance 时，表示代理名称。 
     * @return ProxyName 当 ProxyType=hostname 时，表示域名或子域名；
当 ProxyType=instance 时，表示代理名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 当 ProxyType=hostname 时，表示域名或子域名；
当 ProxyType=instance 时，表示代理名称。
     * @param ProxyName 当 ProxyType=hostname 时，表示域名或子域名；
当 ProxyType=instance 时，表示代理名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 会话保持时间，取值范围：30-3600，单位：秒。
不填写保持原有配置。 
     * @return SessionPersistTime 会话保持时间，取值范围：30-3600，单位：秒。
不填写保持原有配置。
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持时间，取值范围：30-3600，单位：秒。
不填写保持原有配置。
     * @param SessionPersistTime 会话保持时间，取值范围：30-3600，单位：秒。
不填写保持原有配置。
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get 四层代理模式，取值有：
<li>instance：表示实例模式。</li>不填写使用默认值instance。 
     * @return ProxyType 四层代理模式，取值有：
<li>instance：表示实例模式。</li>不填写使用默认值instance。
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 四层代理模式，取值有：
<li>instance：表示实例模式。</li>不填写使用默认值instance。
     * @param ProxyType 四层代理模式，取值有：
<li>instance：表示实例模式。</li>不填写使用默认值instance。
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get Ipv6 访问配置，不填写保持原有配置。 
     * @return Ipv6 Ipv6 访问配置，不填写保持原有配置。
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 访问配置，不填写保持原有配置。
     * @param Ipv6 Ipv6 访问配置，不填写保持原有配置。
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get 中国大陆加速优化配置。 不填写表示保持原有配置。 
     * @return AccelerateMainland 中国大陆加速优化配置。 不填写表示保持原有配置。
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set 中国大陆加速优化配置。 不填写表示保持原有配置。
     * @param AccelerateMainland 中国大陆加速优化配置。 不填写表示保持原有配置。
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    public ModifyApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationProxyRequest(ModifyApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainland(source.AccelerateMainland);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);

    }
}

