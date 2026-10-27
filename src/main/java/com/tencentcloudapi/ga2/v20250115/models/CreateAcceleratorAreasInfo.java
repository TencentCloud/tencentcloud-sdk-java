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

public class CreateAcceleratorAreasInfo extends AbstractModel {

    /**
    * <p>加速地域</p>
    */
    @SerializedName("AccelerateRegion")
    @Expose
    private String AccelerateRegion;

    /**
    * <p>带宽</p><p>单位：Mbps</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>公网质量类型</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>QUALITY_BGP： 精品BGP</li><li>STATIC_IP： 三网</li></ul><p>默认值：BGP</p>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>IP 地址协议</p><p>枚举值：</p><ul><li>IPv4： IPv4</li></ul><p>默认值：IPv4</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
     * Get <p>加速地域</p> 
     * @return AccelerateRegion <p>加速地域</p>
     */
    public String getAccelerateRegion() {
        return this.AccelerateRegion;
    }

    /**
     * Set <p>加速地域</p>
     * @param AccelerateRegion <p>加速地域</p>
     */
    public void setAccelerateRegion(String AccelerateRegion) {
        this.AccelerateRegion = AccelerateRegion;
    }

    /**
     * Get <p>带宽</p><p>单位：Mbps</p> 
     * @return Bandwidth <p>带宽</p><p>单位：Mbps</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>带宽</p><p>单位：Mbps</p>
     * @param Bandwidth <p>带宽</p><p>单位：Mbps</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>公网质量类型</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>QUALITY_BGP： 精品BGP</li><li>STATIC_IP： 三网</li></ul><p>默认值：BGP</p> 
     * @return IspType <p>公网质量类型</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>QUALITY_BGP： 精品BGP</li><li>STATIC_IP： 三网</li></ul><p>默认值：BGP</p>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>公网质量类型</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>QUALITY_BGP： 精品BGP</li><li>STATIC_IP： 三网</li></ul><p>默认值：BGP</p>
     * @param IspType <p>公网质量类型</p><p>枚举值：</p><ul><li>BGP： BGP</li><li>QUALITY_BGP： 精品BGP</li><li>STATIC_IP： 三网</li></ul><p>默认值：BGP</p>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>IP 地址协议</p><p>枚举值：</p><ul><li>IPv4： IPv4</li></ul><p>默认值：IPv4</p> 
     * @return IpVersion <p>IP 地址协议</p><p>枚举值：</p><ul><li>IPv4： IPv4</li></ul><p>默认值：IPv4</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP 地址协议</p><p>枚举值：</p><ul><li>IPv4： IPv4</li></ul><p>默认值：IPv4</p>
     * @param IpVersion <p>IP 地址协议</p><p>枚举值：</p><ul><li>IPv4： IPv4</li></ul><p>默认值：IPv4</p>
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    public CreateAcceleratorAreasInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAcceleratorAreasInfo(CreateAcceleratorAreasInfo source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccelerateRegion", this.AccelerateRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

