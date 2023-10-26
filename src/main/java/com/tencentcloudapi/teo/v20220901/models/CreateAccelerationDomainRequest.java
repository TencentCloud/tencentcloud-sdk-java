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

public class CreateAccelerationDomainRequest extends AbstractModel {

    /**
    * 加速域名所属站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 加速域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 源站信息。
    */
    @SerializedName("OriginInfo")
    @Expose
    private OriginInfo OriginInfo;

    /**
    * 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
<li>不填默认为： FOLLOW。</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTP时生效, 不填默认为80。
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * HTTPS回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTPS时生效，不填默认为443。
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
<li>不填默认为：follow。</li>
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
     * Get 加速域名所属站点 ID。 
     * @return ZoneId 加速域名所属站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 加速域名所属站点 ID。
     * @param ZoneId 加速域名所属站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 加速域名。 
     * @return DomainName 加速域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 加速域名。
     * @param DomainName 加速域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 源站信息。 
     * @return OriginInfo 源站信息。
     */
    public OriginInfo getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set 源站信息。
     * @param OriginInfo 源站信息。
     */
    public void setOriginInfo(OriginInfo OriginInfo) {
        this.OriginInfo = OriginInfo;
    }

    /**
     * Get 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
<li>不填默认为： FOLLOW。</li> 
     * @return OriginProtocol 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
<li>不填默认为： FOLLOW。</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
<li>不填默认为： FOLLOW。</li>
     * @param OriginProtocol 回源协议，取值有：
<li>FOLLOW: 协议跟随；</li>
<li>HTTP: HTTP协议回源；</li>
<li>HTTPS: HTTPS协议回源。</li>
<li>不填默认为： FOLLOW。</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTP时生效, 不填默认为80。 
     * @return HttpOriginPort HTTP回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTP时生效, 不填默认为80。
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set HTTP回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTP时生效, 不填默认为80。
     * @param HttpOriginPort HTTP回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTP时生效, 不填默认为80。
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get HTTPS回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTPS时生效，不填默认为443。 
     * @return HttpsOriginPort HTTPS回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTPS时生效，不填默认为443。
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set HTTPS回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTPS时生效，不填默认为443。
     * @param HttpsOriginPort HTTPS回源端口，取值为1-65535，当OriginProtocol=FOLLOW/HTTPS时生效，不填默认为443。
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
<li>不填默认为：follow。</li> 
     * @return IPv6Status IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
<li>不填默认为：follow。</li>
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
<li>不填默认为：follow。</li>
     * @param IPv6Status IPv6状态，取值有：
<li>follow：遵循站点IPv6配置；</li>
<li>on：开启状态；</li>
<li>off：关闭状态。</li>
<li>不填默认为：follow。</li>
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    public CreateAccelerationDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccelerationDomainRequest(CreateAccelerationDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.OriginInfo != null) {
            this.OriginInfo = new OriginInfo(source.OriginInfo);
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
        if (source.IPv6Status != null) {
            this.IPv6Status = new String(source.IPv6Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamObj(map, prefix + "OriginInfo.", this.OriginInfo);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HttpOriginPort", this.HttpOriginPort);
        this.setParamSimple(map, prefix + "HttpsOriginPort", this.HttpsOriginPort);
        this.setParamSimple(map, prefix + "IPv6Status", this.IPv6Status);

    }
}

