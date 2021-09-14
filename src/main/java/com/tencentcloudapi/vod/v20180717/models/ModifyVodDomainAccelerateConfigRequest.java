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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVodDomainAccelerateConfigRequest extends AbstractModel{

    /**
    * 需要设置加速配置的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 区域，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland: 中国境外。</li>
<li>Global: 全球范围。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 开启或者关闭所选区域的域名加速，可选值：
<li>Enabled: 开启。</li>
<li>Disabled：关闭。</li>
开启中国境内加速的域名，需要先[备案域名](/document/product/243/18905)。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 需要设置加速配置的域名。 
     * @return Domain 需要设置加速配置的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要设置加速配置的域名。
     * @param Domain 需要设置加速配置的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 区域，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland: 中国境外。</li>
<li>Global: 全球范围。</li> 
     * @return Area 区域，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland: 中国境外。</li>
<li>Global: 全球范围。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 区域，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland: 中国境外。</li>
<li>Global: 全球范围。</li>
     * @param Area 区域，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland: 中国境外。</li>
<li>Global: 全球范围。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 开启或者关闭所选区域的域名加速，可选值：
<li>Enabled: 开启。</li>
<li>Disabled：关闭。</li>
开启中国境内加速的域名，需要先[备案域名](/document/product/243/18905)。 
     * @return Status 开启或者关闭所选区域的域名加速，可选值：
<li>Enabled: 开启。</li>
<li>Disabled：关闭。</li>
开启中国境内加速的域名，需要先[备案域名](/document/product/243/18905)。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 开启或者关闭所选区域的域名加速，可选值：
<li>Enabled: 开启。</li>
<li>Disabled：关闭。</li>
开启中国境内加速的域名，需要先[备案域名](/document/product/243/18905)。
     * @param Status 开启或者关闭所选区域的域名加速，可选值：
<li>Enabled: 开启。</li>
<li>Disabled：关闭。</li>
开启中国境内加速的域名，需要先[备案域名](/document/product/243/18905)。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public ModifyVodDomainAccelerateConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVodDomainAccelerateConfigRequest(ModifyVodDomainAccelerateConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

