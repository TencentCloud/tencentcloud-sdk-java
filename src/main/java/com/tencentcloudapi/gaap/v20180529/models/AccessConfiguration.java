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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessConfiguration extends AbstractModel{

    /**
    * 加速地域。
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 通道带宽上限，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 网络类型，可取值：normal、cn2，默认值为normal
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
     * Get 加速地域。 
     * @return AccessRegion 加速地域。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 加速地域。
     * @param AccessRegion 加速地域。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get 通道带宽上限，单位：Mbps。 
     * @return Bandwidth 通道带宽上限，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 通道带宽上限，单位：Mbps。
     * @param Bandwidth 通道带宽上限，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 通道并发量上限，表示同时在线的连接数，单位：万。 
     * @return Concurrent 通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set 通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrent 通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get 网络类型，可取值：normal、cn2，默认值为normal 
     * @return NetworkType 网络类型，可取值：normal、cn2，默认值为normal
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型，可取值：normal、cn2，默认值为normal
     * @param NetworkType 网络类型，可取值：normal、cn2，默认值为normal
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    public AccessConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessConfiguration(AccessConfiguration source) {
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);

    }
}

