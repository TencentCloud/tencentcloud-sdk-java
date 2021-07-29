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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvAddressInfo extends AbstractModel{

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "EnableConfigInternet", this.EnableConfigInternet);
        this.setParamSimple(map, prefix + "ConfigInternetServiceIp", this.ConfigInternetServiceIp);

    }
}

