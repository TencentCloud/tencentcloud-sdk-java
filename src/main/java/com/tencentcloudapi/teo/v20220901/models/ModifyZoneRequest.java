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

public class ModifyZoneRequest extends AbstractModel{

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点接入方式，取值有：
<li> full：NS 接入；</li>
<li> partial：CNAME 接入，如果站点当前是无域名接入，仅支持切换到CNAME接入。</li>不填写保持原有配置。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自定义站点信息，以替代系统默认分配的名称服务器。不填写保持原有配置。当站点是无域名接入方式时不允许传此参数。
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * 站点别名。数字、英文、-和_组合，限制20个字符。
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * 站点接入地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>当站点是无域名接入方式时，不允许传此参数。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 站点名称。仅当站点由无域名接入方式切换到CNAME接入方式的场景下有效。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

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
     * Get 站点接入方式，取值有：
<li> full：NS 接入；</li>
<li> partial：CNAME 接入，如果站点当前是无域名接入，仅支持切换到CNAME接入。</li>不填写保持原有配置。 
     * @return Type 站点接入方式，取值有：
<li> full：NS 接入；</li>
<li> partial：CNAME 接入，如果站点当前是无域名接入，仅支持切换到CNAME接入。</li>不填写保持原有配置。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入方式，取值有：
<li> full：NS 接入；</li>
<li> partial：CNAME 接入，如果站点当前是无域名接入，仅支持切换到CNAME接入。</li>不填写保持原有配置。
     * @param Type 站点接入方式，取值有：
<li> full：NS 接入；</li>
<li> partial：CNAME 接入，如果站点当前是无域名接入，仅支持切换到CNAME接入。</li>不填写保持原有配置。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自定义站点信息，以替代系统默认分配的名称服务器。不填写保持原有配置。当站点是无域名接入方式时不允许传此参数。 
     * @return VanityNameServers 自定义站点信息，以替代系统默认分配的名称服务器。不填写保持原有配置。当站点是无域名接入方式时不允许传此参数。
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set 自定义站点信息，以替代系统默认分配的名称服务器。不填写保持原有配置。当站点是无域名接入方式时不允许传此参数。
     * @param VanityNameServers 自定义站点信息，以替代系统默认分配的名称服务器。不填写保持原有配置。当站点是无域名接入方式时不允许传此参数。
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get 站点别名。数字、英文、-和_组合，限制20个字符。 
     * @return AliasZoneName 站点别名。数字、英文、-和_组合，限制20个字符。
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set 站点别名。数字、英文、-和_组合，限制20个字符。
     * @param AliasZoneName 站点别名。数字、英文、-和_组合，限制20个字符。
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get 站点接入地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>当站点是无域名接入方式时，不允许传此参数。 
     * @return Area 站点接入地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>当站点是无域名接入方式时，不允许传此参数。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 站点接入地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>当站点是无域名接入方式时，不允许传此参数。
     * @param Area 站点接入地域，取值有：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>当站点是无域名接入方式时，不允许传此参数。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 站点名称。仅当站点由无域名接入方式切换到CNAME接入方式的场景下有效。 
     * @return ZoneName 站点名称。仅当站点由无域名接入方式切换到CNAME接入方式的场景下有效。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。仅当站点由无域名接入方式切换到CNAME接入方式的场景下有效。
     * @param ZoneName 站点名称。仅当站点由无域名接入方式切换到CNAME接入方式的场景下有效。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public ModifyZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneRequest(ModifyZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

