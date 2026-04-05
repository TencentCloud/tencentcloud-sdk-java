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
    * 加速地域。
    */
    @SerializedName("AccelerateRegion")
    @Expose
    private String AccelerateRegion;

    /**
    * 带宽。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 支持'BGP', '三网', '精品'，默认BGP。
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * 仅支持IPv4，默认是IPv4。
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 加速地域ID。
    */
    @SerializedName("AcceleratorAreaId")
    @Expose
    private String AcceleratorAreaId;

    /**
    * IP。
    */
    @SerializedName("IpAddress")
    @Expose
    private String [] IpAddress;

    /**
    * IP信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddressInfoSet")
    @Expose
    private IpAddressInfoSet [] IpAddressInfoSet;

    /**
     * Get 加速地域。 
     * @return AccelerateRegion 加速地域。
     */
    public String getAccelerateRegion() {
        return this.AccelerateRegion;
    }

    /**
     * Set 加速地域。
     * @param AccelerateRegion 加速地域。
     */
    public void setAccelerateRegion(String AccelerateRegion) {
        this.AccelerateRegion = AccelerateRegion;
    }

    /**
     * Get 带宽。 
     * @return Bandwidth 带宽。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽。
     * @param Bandwidth 带宽。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 支持'BGP', '三网', '精品'，默认BGP。 
     * @return IspType 支持'BGP', '三网', '精品'，默认BGP。
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set 支持'BGP', '三网', '精品'，默认BGP。
     * @param IspType 支持'BGP', '三网', '精品'，默认BGP。
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get 仅支持IPv4，默认是IPv4。 
     * @return IpVersion 仅支持IPv4，默认是IPv4。
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set 仅支持IPv4，默认是IPv4。
     * @param IpVersion 仅支持IPv4，默认是IPv4。
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 加速地域ID。 
     * @return AcceleratorAreaId 加速地域ID。
     */
    public String getAcceleratorAreaId() {
        return this.AcceleratorAreaId;
    }

    /**
     * Set 加速地域ID。
     * @param AcceleratorAreaId 加速地域ID。
     */
    public void setAcceleratorAreaId(String AcceleratorAreaId) {
        this.AcceleratorAreaId = AcceleratorAreaId;
    }

    /**
     * Get IP。 
     * @return IpAddress IP。
     */
    public String [] getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set IP。
     * @param IpAddress IP。
     */
    public void setIpAddress(String [] IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get IP信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddressInfoSet IP信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpAddressInfoSet [] getIpAddressInfoSet() {
        return this.IpAddressInfoSet;
    }

    /**
     * Set IP信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddressInfoSet IP信息。
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

