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

public class EnableOriginACLRequest extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 七层加速域名开启回源白名单的模式。
<li>all：为站点下的所有七层加速域名开启回源白名单。</li>
<li>specific：为站点下指定的七层加速域名开启回源白名单。</li>
当参数为空时，默认为specific。
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * 开启回源白名单的七层加速域名列表，当请求参数 L7EnableMode 为 all 时必须为空。
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * 四层代理 ID 开启回源白名单的模式。
<li>all：为站点下的所有四层代理开启回源白名单。</li>
<li>specific：为站点下指定的四层代理 ID 开启回源白名单。</li>
当参数为空时，默认为specific。
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * 开启回源白名单的四层代理 ID 列表，当请求参数 L4EnableMode 为 all 时必须为空。单次最多支持 200 个实例。
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

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
     * Get 七层加速域名开启回源白名单的模式。
<li>all：为站点下的所有七层加速域名开启回源白名单。</li>
<li>specific：为站点下指定的七层加速域名开启回源白名单。</li>
当参数为空时，默认为specific。 
     * @return L7EnableMode 七层加速域名开启回源白名单的模式。
<li>all：为站点下的所有七层加速域名开启回源白名单。</li>
<li>specific：为站点下指定的七层加速域名开启回源白名单。</li>
当参数为空时，默认为specific。
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set 七层加速域名开启回源白名单的模式。
<li>all：为站点下的所有七层加速域名开启回源白名单。</li>
<li>specific：为站点下指定的七层加速域名开启回源白名单。</li>
当参数为空时，默认为specific。
     * @param L7EnableMode 七层加速域名开启回源白名单的模式。
<li>all：为站点下的所有七层加速域名开启回源白名单。</li>
<li>specific：为站点下指定的七层加速域名开启回源白名单。</li>
当参数为空时，默认为specific。
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get 开启回源白名单的七层加速域名列表，当请求参数 L7EnableMode 为 all 时必须为空。 
     * @return L7Hosts 开启回源白名单的七层加速域名列表，当请求参数 L7EnableMode 为 all 时必须为空。
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set 开启回源白名单的七层加速域名列表，当请求参数 L7EnableMode 为 all 时必须为空。
     * @param L7Hosts 开启回源白名单的七层加速域名列表，当请求参数 L7EnableMode 为 all 时必须为空。
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get 四层代理 ID 开启回源白名单的模式。
<li>all：为站点下的所有四层代理开启回源白名单。</li>
<li>specific：为站点下指定的四层代理 ID 开启回源白名单。</li>
当参数为空时，默认为specific。 
     * @return L4EnableMode 四层代理 ID 开启回源白名单的模式。
<li>all：为站点下的所有四层代理开启回源白名单。</li>
<li>specific：为站点下指定的四层代理 ID 开启回源白名单。</li>
当参数为空时，默认为specific。
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set 四层代理 ID 开启回源白名单的模式。
<li>all：为站点下的所有四层代理开启回源白名单。</li>
<li>specific：为站点下指定的四层代理 ID 开启回源白名单。</li>
当参数为空时，默认为specific。
     * @param L4EnableMode 四层代理 ID 开启回源白名单的模式。
<li>all：为站点下的所有四层代理开启回源白名单。</li>
<li>specific：为站点下指定的四层代理 ID 开启回源白名单。</li>
当参数为空时，默认为specific。
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get 开启回源白名单的四层代理 ID 列表，当请求参数 L4EnableMode 为 all 时必须为空。单次最多支持 200 个实例。 
     * @return L4ProxyIds 开启回源白名单的四层代理 ID 列表，当请求参数 L4EnableMode 为 all 时必须为空。单次最多支持 200 个实例。
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set 开启回源白名单的四层代理 ID 列表，当请求参数 L4EnableMode 为 all 时必须为空。单次最多支持 200 个实例。
     * @param L4ProxyIds 开启回源白名单的四层代理 ID 列表，当请求参数 L4EnableMode 为 all 时必须为空。单次最多支持 200 个实例。
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
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

    }
}

