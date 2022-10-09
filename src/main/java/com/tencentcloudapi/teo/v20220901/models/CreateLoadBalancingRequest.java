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

public class CreateLoadBalancingRequest extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 负载均衡域名。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 主源站源站组ID。
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * 备用源站源站组ID，当Type=proxied时可以填写，为空表示不使用备用源站。
    */
    @SerializedName("BackupOriginGroupId")
    @Expose
    private String BackupOriginGroupId;

    /**
    * 当Type=dns_only时，指解析记录在DNS服务器缓存的生存时间。
取值范围60-86400，单位：秒，不填写使用默认值：600。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置（仅当Type=proxied时可以使用）。</li>为空表示使用主备回源。
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 高级回源配置，当OriginType=advanced时有效。
    */
    @SerializedName("AdvancedOriginGroups")
    @Expose
    private AdvancedOriginGroup [] AdvancedOriginGroups;

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
     * Get 负载均衡域名。 
     * @return Host 负载均衡域名。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 负载均衡域名。
     * @param Host 负载均衡域名。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li> 
     * @return Type 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
     * @param Type 代理模式，取值有：
<li>dns_only：仅DNS；</li>
<li>proxied：开启代理。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 主源站源站组ID。 
     * @return OriginGroupId 主源站源站组ID。
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set 主源站源站组ID。
     * @param OriginGroupId 主源站源站组ID。
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get 备用源站源站组ID，当Type=proxied时可以填写，为空表示不使用备用源站。 
     * @return BackupOriginGroupId 备用源站源站组ID，当Type=proxied时可以填写，为空表示不使用备用源站。
     */
    public String getBackupOriginGroupId() {
        return this.BackupOriginGroupId;
    }

    /**
     * Set 备用源站源站组ID，当Type=proxied时可以填写，为空表示不使用备用源站。
     * @param BackupOriginGroupId 备用源站源站组ID，当Type=proxied时可以填写，为空表示不使用备用源站。
     */
    public void setBackupOriginGroupId(String BackupOriginGroupId) {
        this.BackupOriginGroupId = BackupOriginGroupId;
    }

    /**
     * Get 当Type=dns_only时，指解析记录在DNS服务器缓存的生存时间。
取值范围60-86400，单位：秒，不填写使用默认值：600。 
     * @return TTL 当Type=dns_only时，指解析记录在DNS服务器缓存的生存时间。
取值范围60-86400，单位：秒，不填写使用默认值：600。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 当Type=dns_only时，指解析记录在DNS服务器缓存的生存时间。
取值范围60-86400，单位：秒，不填写使用默认值：600。
     * @param TTL 当Type=dns_only时，指解析记录在DNS服务器缓存的生存时间。
取值范围60-86400，单位：秒，不填写使用默认值：600。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置（仅当Type=proxied时可以使用）。</li>为空表示使用主备回源。 
     * @return OriginType 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置（仅当Type=proxied时可以使用）。</li>为空表示使用主备回源。
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置（仅当Type=proxied时可以使用）。</li>为空表示使用主备回源。
     * @param OriginType 回源类型，取值有：
<li>normal：主备回源；</li>
<li>advanced：高级回源配置（仅当Type=proxied时可以使用）。</li>为空表示使用主备回源。
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 高级回源配置，当OriginType=advanced时有效。 
     * @return AdvancedOriginGroups 高级回源配置，当OriginType=advanced时有效。
     */
    public AdvancedOriginGroup [] getAdvancedOriginGroups() {
        return this.AdvancedOriginGroups;
    }

    /**
     * Set 高级回源配置，当OriginType=advanced时有效。
     * @param AdvancedOriginGroups 高级回源配置，当OriginType=advanced时有效。
     */
    public void setAdvancedOriginGroups(AdvancedOriginGroup [] AdvancedOriginGroups) {
        this.AdvancedOriginGroups = AdvancedOriginGroups;
    }

    public CreateLoadBalancingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancingRequest(CreateLoadBalancingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.BackupOriginGroupId != null) {
            this.BackupOriginGroupId = new String(source.BackupOriginGroupId);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.AdvancedOriginGroups != null) {
            this.AdvancedOriginGroups = new AdvancedOriginGroup[source.AdvancedOriginGroups.length];
            for (int i = 0; i < source.AdvancedOriginGroups.length; i++) {
                this.AdvancedOriginGroups[i] = new AdvancedOriginGroup(source.AdvancedOriginGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "BackupOriginGroupId", this.BackupOriginGroupId);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArrayObj(map, prefix + "AdvancedOriginGroups.", this.AdvancedOriginGroups);

    }
}

