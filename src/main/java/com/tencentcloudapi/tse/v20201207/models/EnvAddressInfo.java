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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvAddressInfo extends AbstractModel {

    /**
    * 环境名
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * 是否开启config公网
    */
    @SerializedName("EnableConfigInternet")
    @Expose
    private Boolean EnableConfigInternet;

    /**
    * config公网ip
    */
    @SerializedName("ConfigInternetServiceIp")
    @Expose
    private String ConfigInternetServiceIp;

    /**
    * config内网访问地址
    */
    @SerializedName("ConfigIntranetAddress")
    @Expose
    private String ConfigIntranetAddress;

    /**
    * 是否开启config内网clb
    */
    @SerializedName("EnableConfigIntranet")
    @Expose
    private Boolean EnableConfigIntranet;

    /**
    * 客户端公网带宽
    */
    @SerializedName("InternetBandWidth")
    @Expose
    private Long InternetBandWidth;

    /**
    * 客户端公网CLB多可用区信息
    */
    @SerializedName("CLBMultiRegion")
    @Expose
    private CLBMultiRegion CLBMultiRegion;

    /**
     * Get 环境名 
     * @return EnvName 环境名
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set 环境名
     * @param EnvName 环境名
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get 是否开启config公网 
     * @return EnableConfigInternet 是否开启config公网
     */
    public Boolean getEnableConfigInternet() {
        return this.EnableConfigInternet;
    }

    /**
     * Set 是否开启config公网
     * @param EnableConfigInternet 是否开启config公网
     */
    public void setEnableConfigInternet(Boolean EnableConfigInternet) {
        this.EnableConfigInternet = EnableConfigInternet;
    }

    /**
     * Get config公网ip 
     * @return ConfigInternetServiceIp config公网ip
     */
    public String getConfigInternetServiceIp() {
        return this.ConfigInternetServiceIp;
    }

    /**
     * Set config公网ip
     * @param ConfigInternetServiceIp config公网ip
     */
    public void setConfigInternetServiceIp(String ConfigInternetServiceIp) {
        this.ConfigInternetServiceIp = ConfigInternetServiceIp;
    }

    /**
     * Get config内网访问地址 
     * @return ConfigIntranetAddress config内网访问地址
     */
    public String getConfigIntranetAddress() {
        return this.ConfigIntranetAddress;
    }

    /**
     * Set config内网访问地址
     * @param ConfigIntranetAddress config内网访问地址
     */
    public void setConfigIntranetAddress(String ConfigIntranetAddress) {
        this.ConfigIntranetAddress = ConfigIntranetAddress;
    }

    /**
     * Get 是否开启config内网clb 
     * @return EnableConfigIntranet 是否开启config内网clb
     */
    public Boolean getEnableConfigIntranet() {
        return this.EnableConfigIntranet;
    }

    /**
     * Set 是否开启config内网clb
     * @param EnableConfigIntranet 是否开启config内网clb
     */
    public void setEnableConfigIntranet(Boolean EnableConfigIntranet) {
        this.EnableConfigIntranet = EnableConfigIntranet;
    }

    /**
     * Get 客户端公网带宽 
     * @return InternetBandWidth 客户端公网带宽
     */
    public Long getInternetBandWidth() {
        return this.InternetBandWidth;
    }

    /**
     * Set 客户端公网带宽
     * @param InternetBandWidth 客户端公网带宽
     */
    public void setInternetBandWidth(Long InternetBandWidth) {
        this.InternetBandWidth = InternetBandWidth;
    }

    /**
     * Get 客户端公网CLB多可用区信息 
     * @return CLBMultiRegion 客户端公网CLB多可用区信息
     */
    public CLBMultiRegion getCLBMultiRegion() {
        return this.CLBMultiRegion;
    }

    /**
     * Set 客户端公网CLB多可用区信息
     * @param CLBMultiRegion 客户端公网CLB多可用区信息
     */
    public void setCLBMultiRegion(CLBMultiRegion CLBMultiRegion) {
        this.CLBMultiRegion = CLBMultiRegion;
    }

    public EnvAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvAddressInfo(EnvAddressInfo source) {
        if (source.EnvName != null) {
            this.EnvName = new String(source.EnvName);
        }
        if (source.EnableConfigInternet != null) {
            this.EnableConfigInternet = new Boolean(source.EnableConfigInternet);
        }
        if (source.ConfigInternetServiceIp != null) {
            this.ConfigInternetServiceIp = new String(source.ConfigInternetServiceIp);
        }
        if (source.ConfigIntranetAddress != null) {
            this.ConfigIntranetAddress = new String(source.ConfigIntranetAddress);
        }
        if (source.EnableConfigIntranet != null) {
            this.EnableConfigIntranet = new Boolean(source.EnableConfigIntranet);
        }
        if (source.InternetBandWidth != null) {
            this.InternetBandWidth = new Long(source.InternetBandWidth);
        }
        if (source.CLBMultiRegion != null) {
            this.CLBMultiRegion = new CLBMultiRegion(source.CLBMultiRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "EnableConfigInternet", this.EnableConfigInternet);
        this.setParamSimple(map, prefix + "ConfigInternetServiceIp", this.ConfigInternetServiceIp);
        this.setParamSimple(map, prefix + "ConfigIntranetAddress", this.ConfigIntranetAddress);
        this.setParamSimple(map, prefix + "EnableConfigIntranet", this.EnableConfigIntranet);
        this.setParamSimple(map, prefix + "InternetBandWidth", this.InternetBandWidth);
        this.setParamObj(map, prefix + "CLBMultiRegion.", this.CLBMultiRegion);

    }
}

