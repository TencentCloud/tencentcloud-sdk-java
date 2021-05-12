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

public class AccelerateAreaInfo extends AbstractModel{

    /**
    * 加速地区，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 腾讯禁用原因，可选值：
<li>ForLegalReasons：因法律原因导致关闭加速；</li>
<li>ForOverdueBills：因欠费停服导致关闭加速。</li>
    */
    @SerializedName("TencentDisableReason")
    @Expose
    private String TencentDisableReason;

    /**
    * 加速域名对应的 CNAME 域名。
    */
    @SerializedName("TencentEdgeDomain")
    @Expose
    private String TencentEdgeDomain;

    /**
     * Get 加速地区，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li> 
     * @return Area 加速地区，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速地区，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     * @param Area 加速地区，可选值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 腾讯禁用原因，可选值：
<li>ForLegalReasons：因法律原因导致关闭加速；</li>
<li>ForOverdueBills：因欠费停服导致关闭加速。</li> 
     * @return TencentDisableReason 腾讯禁用原因，可选值：
<li>ForLegalReasons：因法律原因导致关闭加速；</li>
<li>ForOverdueBills：因欠费停服导致关闭加速。</li>
     */
    public String getTencentDisableReason() {
        return this.TencentDisableReason;
    }

    /**
     * Set 腾讯禁用原因，可选值：
<li>ForLegalReasons：因法律原因导致关闭加速；</li>
<li>ForOverdueBills：因欠费停服导致关闭加速。</li>
     * @param TencentDisableReason 腾讯禁用原因，可选值：
<li>ForLegalReasons：因法律原因导致关闭加速；</li>
<li>ForOverdueBills：因欠费停服导致关闭加速。</li>
     */
    public void setTencentDisableReason(String TencentDisableReason) {
        this.TencentDisableReason = TencentDisableReason;
    }

    /**
     * Get 加速域名对应的 CNAME 域名。 
     * @return TencentEdgeDomain 加速域名对应的 CNAME 域名。
     */
    public String getTencentEdgeDomain() {
        return this.TencentEdgeDomain;
    }

    /**
     * Set 加速域名对应的 CNAME 域名。
     * @param TencentEdgeDomain 加速域名对应的 CNAME 域名。
     */
    public void setTencentEdgeDomain(String TencentEdgeDomain) {
        this.TencentEdgeDomain = TencentEdgeDomain;
    }

    public AccelerateAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerateAreaInfo(AccelerateAreaInfo source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.TencentDisableReason != null) {
            this.TencentDisableReason = new String(source.TencentDisableReason);
        }
        if (source.TencentEdgeDomain != null) {
            this.TencentEdgeDomain = new String(source.TencentEdgeDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "TencentDisableReason", this.TencentDisableReason);
        this.setParamSimple(map, prefix + "TencentEdgeDomain", this.TencentEdgeDomain);

    }
}

