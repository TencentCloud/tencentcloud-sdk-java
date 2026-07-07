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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcceleratorAreas extends AbstractModel {

    /**
    * <p>加速地域。</p>
    */
    @SerializedName("AccelerateRegion")
    @Expose
    private String AccelerateRegion;

    /**
    * <p>带宽。</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>支持&#39;BGP&#39;, &#39;QUALITY_BGP&#39;, &#39;STATIC_IP&#39;，默认BGP。</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>STATIC_IP： 三网</li><li>QUALITY_BGP： 精品BGP</li></ul>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>仅支持IPv4，默认是IPv4。</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * <p>加速地域ID。</p>
    */
    @SerializedName("AcceleratorAreaId")
    @Expose
    private String AcceleratorAreaId;

    /**
    * <p>IP。</p>
    */
    @SerializedName("IpAddress")
    @Expose
    private String [] IpAddress;

    /**
    * <p>IP信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddressInfoSet")
    @Expose
    private IpAddressInfoSet [] IpAddressInfoSet;

    /**
     * Get <p>加速地域。</p> 
     * @return AccelerateRegion <p>加速地域。</p>
     */
    public String getAccelerateRegion() {
        return this.AccelerateRegion;
    }

    /**
     * Set <p>加速地域。</p>
     * @param AccelerateRegion <p>加速地域。</p>
     */
    public void setAccelerateRegion(String AccelerateRegion) {
        this.AccelerateRegion = AccelerateRegion;
    }

    /**
     * Get <p>带宽。</p> 
     * @return Bandwidth <p>带宽。</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>带宽。</p>
     * @param Bandwidth <p>带宽。</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>支持&#39;BGP&#39;, &#39;QUALITY_BGP&#39;, &#39;STATIC_IP&#39;，默认BGP。</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>STATIC_IP： 三网</li><li>QUALITY_BGP： 精品BGP</li></ul> 
     * @return IspType <p>支持&#39;BGP&#39;, &#39;QUALITY_BGP&#39;, &#39;STATIC_IP&#39;，默认BGP。</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>STATIC_IP： 三网</li><li>QUALITY_BGP： 精品BGP</li></ul>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>支持&#39;BGP&#39;, &#39;QUALITY_BGP&#39;, &#39;STATIC_IP&#39;，默认BGP。</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>STATIC_IP： 三网</li><li>QUALITY_BGP： 精品BGP</li></ul>
     * @param IspType <p>支持&#39;BGP&#39;, &#39;QUALITY_BGP&#39;, &#39;STATIC_IP&#39;，默认BGP。</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>STATIC_IP： 三网</li><li>QUALITY_BGP： 精品BGP</li></ul>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>仅支持IPv4，默认是IPv4。</p> 
     * @return IpVersion <p>仅支持IPv4，默认是IPv4。</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>仅支持IPv4，默认是IPv4。</p>
     * @param IpVersion <p>仅支持IPv4，默认是IPv4。</p>
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get <p>加速地域ID。</p> 
     * @return AcceleratorAreaId <p>加速地域ID。</p>
     */
    public String getAcceleratorAreaId() {
        return this.AcceleratorAreaId;
    }

    /**
     * Set <p>加速地域ID。</p>
     * @param AcceleratorAreaId <p>加速地域ID。</p>
     */
    public void setAcceleratorAreaId(String AcceleratorAreaId) {
        this.AcceleratorAreaId = AcceleratorAreaId;
    }

    /**
     * Get <p>IP。</p> 
     * @return IpAddress <p>IP。</p>
     */
    public String [] getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set <p>IP。</p>
     * @param IpAddress <p>IP。</p>
     */
    public void setIpAddress(String [] IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get <p>IP信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddressInfoSet <p>IP信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpAddressInfoSet [] getIpAddressInfoSet() {
        return this.IpAddressInfoSet;
    }

    /**
     * Set <p>IP信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddressInfoSet <p>IP信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpAddressInfoSet(IpAddressInfoSet [] IpAddressInfoSet) {
        this.IpAddressInfoSet = IpAddressInfoSet;
    }

    public AcceleratorAreas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcceleratorAreas(AcceleratorAreas source) {
        if (source.AccelerateRegion != null) {
            this.AccelerateRegion = new String(source.AccelerateRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IspType != null) {
            this.IspType = new String(source.IspType);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.AcceleratorAreaId != null) {
            this.AcceleratorAreaId = new String(source.AcceleratorAreaId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String[source.IpAddress.length];
            for (int i = 0; i < source.IpAddress.length; i++) {
                this.IpAddress[i] = new String(source.IpAddress[i]);
            }
        }
        if (source.IpAddressInfoSet != null) {
            this.IpAddressInfoSet = new IpAddressInfoSet[source.IpAddressInfoSet.length];
            for (int i = 0; i < source.IpAddressInfoSet.length; i++) {
                this.IpAddressInfoSet[i] = new IpAddressInfoSet(source.IpAddressInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccelerateRegion", this.AccelerateRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "AcceleratorAreaId", this.AcceleratorAreaId);
        this.setParamArraySimple(map, prefix + "IpAddress.", this.IpAddress);
        this.setParamArrayObj(map, prefix + "IpAddressInfoSet.", this.IpAddressInfoSet);

    }
}

