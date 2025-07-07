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

public class L4Proxy extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 四层代理实例 ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 四层代理实例名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 四层代理实例的加速区域。 
<li>mainland：中国大陆可用区；</li>
<li>overseas： 全球可用区（不含中国大陆）；</li>
 <li>global：全球可用区。</li>	
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 接入 CNAME。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 开启固定 IP 后，该值会返回对应的接入 IP；未开启时，该值为空。
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * 四层代理实例状态。
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>	
<li>stopping：停用中；</li>
<li>banned：已封禁；</li>
<li>fail：部署失败/停用失败。</li>	
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否开启 IPv6 访问。 
<li>on：开启；</li> 
<li>off：关闭。</li>
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * 是否开启固定 IP。
 <li>on：开启；</li> <li>off：关闭。</li>
    */
    @SerializedName("StaticIp")
    @Expose
    private String StaticIp;

    /**
    * 是否开启中国大陆网络优化。
 <li>on：开启</li> <li>off：关闭</li>
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private String AccelerateMainland;

    /**
    * 安全防护配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDosProtectionConfig")
    @Expose
    private DDosProtectionConfig DDosProtectionConfig;

    /**
    * 四层代理实例下的转发规则数量。
    */
    @SerializedName("L4ProxyRuleCount")
    @Expose
    private Long L4ProxyRuleCount;

    /**
    * 最新变更时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get 四层代理实例 ID。 
     * @return ProxyId 四层代理实例 ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层代理实例 ID。
     * @param ProxyId 四层代理实例 ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 四层代理实例名称。 
     * @return ProxyName 四层代理实例名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 四层代理实例名称。
     * @param ProxyName 四层代理实例名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 四层代理实例的加速区域。 
<li>mainland：中国大陆可用区；</li>
<li>overseas： 全球可用区（不含中国大陆）；</li>
 <li>global：全球可用区。</li>	 
     * @return Area 四层代理实例的加速区域。 
<li>mainland：中国大陆可用区；</li>
<li>overseas： 全球可用区（不含中国大陆）；</li>
 <li>global：全球可用区。</li>	
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 四层代理实例的加速区域。 
<li>mainland：中国大陆可用区；</li>
<li>overseas： 全球可用区（不含中国大陆）；</li>
 <li>global：全球可用区。</li>	
     * @param Area 四层代理实例的加速区域。 
<li>mainland：中国大陆可用区；</li>
<li>overseas： 全球可用区（不含中国大陆）；</li>
 <li>global：全球可用区。</li>	
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 接入 CNAME。 
     * @return Cname 接入 CNAME。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 接入 CNAME。
     * @param Cname 接入 CNAME。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 开启固定 IP 后，该值会返回对应的接入 IP；未开启时，该值为空。 
     * @return Ips 开启固定 IP 后，该值会返回对应的接入 IP；未开启时，该值为空。
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set 开启固定 IP 后，该值会返回对应的接入 IP；未开启时，该值为空。
     * @param Ips 开启固定 IP 后，该值会返回对应的接入 IP；未开启时，该值为空。
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get 四层代理实例状态。
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>	
<li>stopping：停用中；</li>
<li>banned：已封禁；</li>
<li>fail：部署失败/停用失败。</li>	 
     * @return Status 四层代理实例状态。
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>	
<li>stopping：停用中；</li>
<li>banned：已封禁；</li>
<li>fail：部署失败/停用失败。</li>	
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 四层代理实例状态。
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>	
<li>stopping：停用中；</li>
<li>banned：已封禁；</li>
<li>fail：部署失败/停用失败。</li>	
     * @param Status 四层代理实例状态。
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>	
<li>stopping：停用中；</li>
<li>banned：已封禁；</li>
<li>fail：部署失败/停用失败。</li>	
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否开启 IPv6 访问。 
<li>on：开启；</li> 
<li>off：关闭。</li> 
     * @return Ipv6 是否开启 IPv6 访问。 
<li>on：开启；</li> 
<li>off：关闭。</li>
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set 是否开启 IPv6 访问。 
<li>on：开启；</li> 
<li>off：关闭。</li>
     * @param Ipv6 是否开启 IPv6 访问。 
<li>on：开启；</li> 
<li>off：关闭。</li>
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get 是否开启固定 IP。
 <li>on：开启；</li> <li>off：关闭。</li> 
     * @return StaticIp 是否开启固定 IP。
 <li>on：开启；</li> <li>off：关闭。</li>
     */
    public String getStaticIp() {
        return this.StaticIp;
    }

    /**
     * Set 是否开启固定 IP。
 <li>on：开启；</li> <li>off：关闭。</li>
     * @param StaticIp 是否开启固定 IP。
 <li>on：开启；</li> <li>off：关闭。</li>
     */
    public void setStaticIp(String StaticIp) {
        this.StaticIp = StaticIp;
    }

    /**
     * Get 是否开启中国大陆网络优化。
 <li>on：开启</li> <li>off：关闭</li> 
     * @return AccelerateMainland 是否开启中国大陆网络优化。
 <li>on：开启</li> <li>off：关闭</li>
     */
    public String getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set 是否开启中国大陆网络优化。
 <li>on：开启</li> <li>off：关闭</li>
     * @param AccelerateMainland 是否开启中国大陆网络优化。
 <li>on：开启</li> <li>off：关闭</li>
     */
    public void setAccelerateMainland(String AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get 安全防护配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDosProtectionConfig 安全防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDosProtectionConfig getDDosProtectionConfig() {
        return this.DDosProtectionConfig;
    }

    /**
     * Set 安全防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDosProtectionConfig 安全防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDosProtectionConfig(DDosProtectionConfig DDosProtectionConfig) {
        this.DDosProtectionConfig = DDosProtectionConfig;
    }

    /**
     * Get 四层代理实例下的转发规则数量。 
     * @return L4ProxyRuleCount 四层代理实例下的转发规则数量。
     */
    public Long getL4ProxyRuleCount() {
        return this.L4ProxyRuleCount;
    }

    /**
     * Set 四层代理实例下的转发规则数量。
     * @param L4ProxyRuleCount 四层代理实例下的转发规则数量。
     */
    public void setL4ProxyRuleCount(Long L4ProxyRuleCount) {
        this.L4ProxyRuleCount = L4ProxyRuleCount;
    }

    /**
     * Get 最新变更时间。 
     * @return UpdateTime 最新变更时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最新变更时间。
     * @param UpdateTime 最新变更时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public L4Proxy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4Proxy(L4Proxy source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.StaticIp != null) {
            this.StaticIp = new String(source.StaticIp);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new String(source.AccelerateMainland);
        }
        if (source.DDosProtectionConfig != null) {
            this.DDosProtectionConfig = new DDosProtectionConfig(source.DDosProtectionConfig);
        }
        if (source.L4ProxyRuleCount != null) {
            this.L4ProxyRuleCount = new Long(source.L4ProxyRuleCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "StaticIp", this.StaticIp);
        this.setParamSimple(map, prefix + "AccelerateMainland", this.AccelerateMainland);
        this.setParamObj(map, prefix + "DDosProtectionConfig.", this.DDosProtectionConfig);
        this.setParamSimple(map, prefix + "L4ProxyRuleCount", this.L4ProxyRuleCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

