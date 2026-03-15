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

public class EnableOriginACLRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点首次开启源站防护时，为七层加速域名配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有七层加速域名开启，当域名数量超过 200 时，请先通过 specific 模式启用 200 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的七层加速域名开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * 开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。L7EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 200 个七层加速域名。
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * 站点首次开启源站防护时，为四层代理实例配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有四层代理实例开启，当实例数量超过 100 时，请先通过 specific 模式启用 100 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的四层代理实例开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * 开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。L4EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 100 个四层代理实例。
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * 源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。
具体取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

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
     * Get 站点首次开启源站防护时，为七层加速域名配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有七层加速域名开启，当域名数量超过 200 时，请先通过 specific 模式启用 200 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的七层加速域名开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。 
     * @return L7EnableMode 站点首次开启源站防护时，为七层加速域名配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有七层加速域名开启，当域名数量超过 200 时，请先通过 specific 模式启用 200 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的七层加速域名开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set 站点首次开启源站防护时，为七层加速域名配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有七层加速域名开启，当域名数量超过 200 时，请先通过 specific 模式启用 200 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的七层加速域名开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
     * @param L7EnableMode 站点首次开启源站防护时，为七层加速域名配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有七层加速域名开启，当域名数量超过 200 时，请先通过 specific 模式启用 200 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的七层加速域名开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get 开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。L7EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 200 个七层加速域名。 
     * @return L7Hosts 开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。L7EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 200 个七层加速域名。
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set 开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。L7EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 200 个七层加速域名。
     * @param L7Hosts 开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。L7EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 200 个七层加速域名。
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get 站点首次开启源站防护时，为四层代理实例配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有四层代理实例开启，当实例数量超过 100 时，请先通过 specific 模式启用 100 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的四层代理实例开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。 
     * @return L4EnableMode 站点首次开启源站防护时，为四层代理实例配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有四层代理实例开启，当实例数量超过 100 时，请先通过 specific 模式启用 100 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的四层代理实例开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set 站点首次开启源站防护时，为四层代理实例配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有四层代理实例开启，当实例数量超过 100 时，请先通过 specific 模式启用 100 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的四层代理实例开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
     * @param L4EnableMode 站点首次开启源站防护时，为四层代理实例配置特定回源 IP 网段的模式。
<li>all：针对当前站点下的所有四层代理实例开启，当实例数量超过 100 时，请先通过 specific 模式启用 100 个域名，剩余资源通过 ModifyOriginACL 接口启用。</li>
<li>specific：针对站点下指定的四层代理实例开启。</li>注意：当参数为空时，默认为 specific。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get 开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。L4EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 100 个四层代理实例。 
     * @return L4ProxyIds 开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。L4EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 100 个四层代理实例。
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set 开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。L4EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 100 个四层代理实例。
     * @param L4ProxyIds 开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。L4EnableMode 为 all 时，请保留此参数为空。单次最大仅支持填写 100 个四层代理实例。
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get 源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。
具体取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li> 
     * @return OriginACLFamily 源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。
具体取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set 源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。
具体取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     * @param OriginACLFamily 源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。
具体取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public EnableOriginACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableOriginACLRequest(EnableOriginACLRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.L7EnableMode != null) {
            this.L7EnableMode = new String(source.L7EnableMode);
        }
        if (source.L7Hosts != null) {
            this.L7Hosts = new String[source.L7Hosts.length];
            for (int i = 0; i < source.L7Hosts.length; i++) {
                this.L7Hosts[i] = new String(source.L7Hosts[i]);
            }
        }
        if (source.L4EnableMode != null) {
            this.L4EnableMode = new String(source.L4EnableMode);
        }
        if (source.L4ProxyIds != null) {
            this.L4ProxyIds = new String[source.L4ProxyIds.length];
            for (int i = 0; i < source.L4ProxyIds.length; i++) {
                this.L4ProxyIds[i] = new String(source.L4ProxyIds[i]);
            }
        }
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "L7EnableMode", this.L7EnableMode);
        this.setParamArraySimple(map, prefix + "L7Hosts.", this.L7Hosts);
        this.setParamSimple(map, prefix + "L4EnableMode", this.L4EnableMode);
        this.setParamArraySimple(map, prefix + "L4ProxyIds.", this.L4ProxyIds);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

