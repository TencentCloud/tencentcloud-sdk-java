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
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>七层加速域名源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有七层加速域名将自动加入到源站防护列表中，包含后续新增的七层加速域名；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的七层加速域名（通过 L7Hosts 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L7Hosts 请保留为空；当站点下七层加速域名数量超过 200 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * <p>需要开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。本字段最多支持一次开启 200 个七层加速域名；当期望开启的域名个数超过 200 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * <p>四层代理实例源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有四层代理实例将自动加入到源站防护列表中，包含后续新增的四层代理实例资源；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的四层代理实例（通过 L4ProxyIds 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L4ProxyIds 请保留为空；当站点下四层代理实例数量超过 100 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * <p>需要开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。本字段最多支持一次开启 100 个四层代理实例；当期望开启的四层代理实例个数超过 100 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * <p>源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。<br>具体取值说明如下：</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

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
     * Get <p>七层加速域名源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有七层加速域名将自动加入到源站防护列表中，包含后续新增的七层加速域名；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的七层加速域名（通过 L7Hosts 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L7Hosts 请保留为空；当站点下七层加速域名数量超过 200 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p> 
     * @return L7EnableMode <p>七层加速域名源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有七层加速域名将自动加入到源站防护列表中，包含后续新增的七层加速域名；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的七层加速域名（通过 L7Hosts 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L7Hosts 请保留为空；当站点下七层加速域名数量超过 200 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set <p>七层加速域名源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有七层加速域名将自动加入到源站防护列表中，包含后续新增的七层加速域名；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的七层加速域名（通过 L7Hosts 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L7Hosts 请保留为空；当站点下七层加速域名数量超过 200 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
     * @param L7EnableMode <p>七层加速域名源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有七层加速域名将自动加入到源站防护列表中，包含后续新增的七层加速域名；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的七层加速域名（通过 L7Hosts 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L7Hosts 请保留为空；当站点下七层加速域名数量超过 200 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get <p>需要开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。本字段最多支持一次开启 200 个七层加速域名；当期望开启的域名个数超过 200 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p> 
     * @return L7Hosts <p>需要开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。本字段最多支持一次开启 200 个七层加速域名；当期望开启的域名个数超过 200 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set <p>需要开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。本字段最多支持一次开启 200 个七层加速域名；当期望开启的域名个数超过 200 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
     * @param L7Hosts <p>需要开启源站防护的七层加速域名列表，仅当参数 L7EnableMode 为 specific 时生效。本字段最多支持一次开启 200 个七层加速域名；当期望开启的域名个数超过 200 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get <p>四层代理实例源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有四层代理实例将自动加入到源站防护列表中，包含后续新增的四层代理实例资源；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的四层代理实例（通过 L4ProxyIds 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L4ProxyIds 请保留为空；当站点下四层代理实例数量超过 100 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p> 
     * @return L4EnableMode <p>四层代理实例源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有四层代理实例将自动加入到源站防护列表中，包含后续新增的四层代理实例资源；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的四层代理实例（通过 L4ProxyIds 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L4ProxyIds 请保留为空；当站点下四层代理实例数量超过 100 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set <p>四层代理实例源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有四层代理实例将自动加入到源站防护列表中，包含后续新增的四层代理实例资源；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的四层代理实例（通过 L4ProxyIds 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L4ProxyIds 请保留为空；当站点下四层代理实例数量超过 100 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
     * @param L4EnableMode <p>四层代理实例源站防护模式，默认值: specific。<li>all：<strong>自动纳入防护模式</strong>，站点内所有四层代理实例将自动加入到源站防护列表中，包含后续新增的四层代理实例资源；</li><li>specific：<strong>指定加入防护模式</strong>，需要人工指定期望加入到源站防护的四层代理实例（通过 L4ProxyIds 参数指定），未指定的资源不会加入到源站防护列表中，后续的防护资源调整可通过 ModifyOriginACL 接口进行。</li>注意：取值为 all 时，L4ProxyIds 请保留为空；当站点下四层代理实例数量超过 100 时，请先通过 specific 模式启用，剩余资源通过 ModifyOriginACL 接口启用后，再通过 ModifyOriginACL 接口切换为 all。</p>
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get <p>需要开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。本字段最多支持一次开启 100 个四层代理实例；当期望开启的四层代理实例个数超过 100 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p> 
     * @return L4ProxyIds <p>需要开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。本字段最多支持一次开启 100 个四层代理实例；当期望开启的四层代理实例个数超过 100 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set <p>需要开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。本字段最多支持一次开启 100 个四层代理实例；当期望开启的四层代理实例个数超过 100 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
     * @param L4ProxyIds <p>需要开启源站防护的四层代理实例列表，仅当参数 L4EnableMode 为 specific 时生效。本字段最多支持一次开启 100 个四层代理实例；当期望开启的四层代理实例个数超过 100 时，请联合使用 ModifyOriginACL 接口进行分片配置。</p>
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get <p>源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。<br>具体取值说明如下：</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li> 
     * @return OriginACLFamily <p>源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。<br>具体取值说明如下：</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set <p>源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。<br>具体取值说明如下：</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     * @param OriginACLFamily <p>源站防护回源ACL控制域，不填则默认用标准全球控制域；可用控制域信息可以通过DescribeAvailableOriginACLFamily接口查询获得。<br>具体取值说明如下：</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
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

