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

public class NSDetail extends AbstractModel {

    /**
    * 是否开启 CNAME 加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * 是否存在同名站点，取值有：
<li> 0：不存在同名站点；</li>
<li> 1：已存在同名站点。</li>
    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * 归属权验证信息。针对 NS 接入类型的站点，将当前的 NS 服务器切换至腾讯云 EdgeOne 指定的 NS 服务器，即视为通过归属权验证。详情请参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789) 。
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * 由 EdgeOne 检测到的站点当前正在使用的 NS 服务器列表。
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * 腾讯云 EdgeOne 分配的 NS 服务器列表。需要将当前站点 NS 服务器指向该地址，站点才能生效。
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * 用户自定义 NS 服务器域名信息。如果启用了自定义 NS 服务，需要在域名注册厂商内将 NS 指向该地址。
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * 用户自定义 NS 服务器对应的 IP 地址信息。
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
     * Get 是否开启 CNAME 加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li> 
     * @return CnameSpeedUp 是否开启 CNAME 加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set 是否开启 CNAME 加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     * @param CnameSpeedUp 是否开启 CNAME 加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get 是否存在同名站点，取值有：
<li> 0：不存在同名站点；</li>
<li> 1：已存在同名站点。</li> 
     * @return IsFake 是否存在同名站点，取值有：
<li> 0：不存在同名站点；</li>
<li> 1：已存在同名站点。</li>
     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set 是否存在同名站点，取值有：
<li> 0：不存在同名站点；</li>
<li> 1：已存在同名站点。</li>
     * @param IsFake 是否存在同名站点，取值有：
<li> 0：不存在同名站点；</li>
<li> 1：已存在同名站点。</li>
     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get 归属权验证信息。针对 NS 接入类型的站点，将当前的 NS 服务器切换至腾讯云 EdgeOne 指定的 NS 服务器，即视为通过归属权验证。详情请参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789) 。 
     * @return OwnershipVerification 归属权验证信息。针对 NS 接入类型的站点，将当前的 NS 服务器切换至腾讯云 EdgeOne 指定的 NS 服务器，即视为通过归属权验证。详情请参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789) 。
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set 归属权验证信息。针对 NS 接入类型的站点，将当前的 NS 服务器切换至腾讯云 EdgeOne 指定的 NS 服务器，即视为通过归属权验证。详情请参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789) 。
     * @param OwnershipVerification 归属权验证信息。针对 NS 接入类型的站点，将当前的 NS 服务器切换至腾讯云 EdgeOne 指定的 NS 服务器，即视为通过归属权验证。详情请参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789) 。
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get 由 EdgeOne 检测到的站点当前正在使用的 NS 服务器列表。 
     * @return OriginalNameServers 由 EdgeOne 检测到的站点当前正在使用的 NS 服务器列表。
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set 由 EdgeOne 检测到的站点当前正在使用的 NS 服务器列表。
     * @param OriginalNameServers 由 EdgeOne 检测到的站点当前正在使用的 NS 服务器列表。
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get 腾讯云 EdgeOne 分配的 NS 服务器列表。需要将当前站点 NS 服务器指向该地址，站点才能生效。 
     * @return NameServers 腾讯云 EdgeOne 分配的 NS 服务器列表。需要将当前站点 NS 服务器指向该地址，站点才能生效。
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 腾讯云 EdgeOne 分配的 NS 服务器列表。需要将当前站点 NS 服务器指向该地址，站点才能生效。
     * @param NameServers 腾讯云 EdgeOne 分配的 NS 服务器列表。需要将当前站点 NS 服务器指向该地址，站点才能生效。
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get 用户自定义 NS 服务器域名信息。如果启用了自定义 NS 服务，需要在域名注册厂商内将 NS 指向该地址。 
     * @return VanityNameServers 用户自定义 NS 服务器域名信息。如果启用了自定义 NS 服务，需要在域名注册厂商内将 NS 指向该地址。
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set 用户自定义 NS 服务器域名信息。如果启用了自定义 NS 服务，需要在域名注册厂商内将 NS 指向该地址。
     * @param VanityNameServers 用户自定义 NS 服务器域名信息。如果启用了自定义 NS 服务，需要在域名注册厂商内将 NS 指向该地址。
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get 用户自定义 NS 服务器对应的 IP 地址信息。 
     * @return VanityNameServersIps 用户自定义 NS 服务器对应的 IP 地址信息。
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set 用户自定义 NS 服务器对应的 IP 地址信息。
     * @param VanityNameServersIps 用户自定义 NS 服务器对应的 IP 地址信息。
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    public NSDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NSDetail(NSDetail source) {
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.IsFake != null) {
            this.IsFake = new Long(source.IsFake);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.VanityNameServersIps != null) {
            this.VanityNameServersIps = new VanityNameServersIps[source.VanityNameServersIps.length];
            for (int i = 0; i < source.VanityNameServersIps.length; i++) {
                this.VanityNameServersIps[i] = new VanityNameServersIps(source.VanityNameServersIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamSimple(map, prefix + "IsFake", this.IsFake);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);

    }
}

