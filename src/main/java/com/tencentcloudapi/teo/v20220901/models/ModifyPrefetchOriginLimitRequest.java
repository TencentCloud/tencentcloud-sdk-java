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

public class ModifyPrefetchOriginLimitRequest extends AbstractModel {

    /**
    * 站点 ID。
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
    * 回源限速限制的加速区域。
预热时，该加速区域将会受到配置的Bandwidth值限制。取值有：
<li>Overseas：全球可用区（不含中国大陆）；</li>
<li>MainlandChina：中国大陆可用区。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 回源限速带宽。
预热时回到源站的带宽上限值，取值范围 100 - 100,000，单位 Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 回源限速限制控制开关。
用于启用/删除本条回源限速限制，取值有：
<li>on：启用限制；</li>
<li>off：删除限制。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

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
     * Get 回源限速限制的加速区域。
预热时，该加速区域将会受到配置的Bandwidth值限制。取值有：
<li>Overseas：全球可用区（不含中国大陆）；</li>
<li>MainlandChina：中国大陆可用区。</li> 
     * @return Area 回源限速限制的加速区域。
预热时，该加速区域将会受到配置的Bandwidth值限制。取值有：
<li>Overseas：全球可用区（不含中国大陆）；</li>
<li>MainlandChina：中国大陆可用区。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 回源限速限制的加速区域。
预热时，该加速区域将会受到配置的Bandwidth值限制。取值有：
<li>Overseas：全球可用区（不含中国大陆）；</li>
<li>MainlandChina：中国大陆可用区。</li>
     * @param Area 回源限速限制的加速区域。
预热时，该加速区域将会受到配置的Bandwidth值限制。取值有：
<li>Overseas：全球可用区（不含中国大陆）；</li>
<li>MainlandChina：中国大陆可用区。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 回源限速带宽。
预热时回到源站的带宽上限值，取值范围 100 - 100,000，单位 Mbps。 
     * @return Bandwidth 回源限速带宽。
预热时回到源站的带宽上限值，取值范围 100 - 100,000，单位 Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 回源限速带宽。
预热时回到源站的带宽上限值，取值范围 100 - 100,000，单位 Mbps。
     * @param Bandwidth 回源限速带宽。
预热时回到源站的带宽上限值，取值范围 100 - 100,000，单位 Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 回源限速限制控制开关。
用于启用/删除本条回源限速限制，取值有：
<li>on：启用限制；</li>
<li>off：删除限制。</li> 
     * @return Enabled 回源限速限制控制开关。
用于启用/删除本条回源限速限制，取值有：
<li>on：启用限制；</li>
<li>off：删除限制。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 回源限速限制控制开关。
用于启用/删除本条回源限速限制，取值有：
<li>on：启用限制；</li>
<li>off：删除限制。</li>
     * @param Enabled 回源限速限制控制开关。
用于启用/删除本条回源限速限制，取值有：
<li>on：启用限制；</li>
<li>off：删除限制。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public ModifyPrefetchOriginLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrefetchOriginLimitRequest(ModifyPrefetchOriginLimitRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

