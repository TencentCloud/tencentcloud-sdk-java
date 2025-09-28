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

public class MultiPathGatewayCurrentOriginACL extends AbstractModel {

    /**
    * 回源 IP 网段详情。
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * 版本号。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 本参数用于记录当前版本生效前是否完成「我已更新至最新回源 IP 网段」的确认。取值有：
<li>true：已完成更新至最新回源 IP 的确认；</li>
<li>false：未完成更新至最新回源 IP 的确认；</li>
注意：本参数返回 false 时，请及时确认您的源站防火墙配置是否已更新至最新的回源 IP 网段，以避免出现回源失败。
    */
    @SerializedName("IsPlaned")
    @Expose
    private String IsPlaned;

    /**
     * Get 回源 IP 网段详情。 
     * @return EntireAddresses 回源 IP 网段详情。
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set 回源 IP 网段详情。
     * @param EntireAddresses 回源 IP 网段详情。
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get 版本号。 
     * @return Version 版本号。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号。
     * @param Version 版本号。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 本参数用于记录当前版本生效前是否完成「我已更新至最新回源 IP 网段」的确认。取值有：
<li>true：已完成更新至最新回源 IP 的确认；</li>
<li>false：未完成更新至最新回源 IP 的确认；</li>
注意：本参数返回 false 时，请及时确认您的源站防火墙配置是否已更新至最新的回源 IP 网段，以避免出现回源失败。 
     * @return IsPlaned 本参数用于记录当前版本生效前是否完成「我已更新至最新回源 IP 网段」的确认。取值有：
<li>true：已完成更新至最新回源 IP 的确认；</li>
<li>false：未完成更新至最新回源 IP 的确认；</li>
注意：本参数返回 false 时，请及时确认您的源站防火墙配置是否已更新至最新的回源 IP 网段，以避免出现回源失败。
     */
    public String getIsPlaned() {
        return this.IsPlaned;
    }

    /**
     * Set 本参数用于记录当前版本生效前是否完成「我已更新至最新回源 IP 网段」的确认。取值有：
<li>true：已完成更新至最新回源 IP 的确认；</li>
<li>false：未完成更新至最新回源 IP 的确认；</li>
注意：本参数返回 false 时，请及时确认您的源站防火墙配置是否已更新至最新的回源 IP 网段，以避免出现回源失败。
     * @param IsPlaned 本参数用于记录当前版本生效前是否完成「我已更新至最新回源 IP 网段」的确认。取值有：
<li>true：已完成更新至最新回源 IP 的确认；</li>
<li>false：未完成更新至最新回源 IP 的确认；</li>
注意：本参数返回 false 时，请及时确认您的源站防火墙配置是否已更新至最新的回源 IP 网段，以避免出现回源失败。
     */
    public void setIsPlaned(String IsPlaned) {
        this.IsPlaned = IsPlaned;
    }

    public MultiPathGatewayCurrentOriginACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayCurrentOriginACL(MultiPathGatewayCurrentOriginACL source) {
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.IsPlaned != null) {
            this.IsPlaned = new String(source.IsPlaned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "IsPlaned", this.IsPlaned);

    }
}

