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

public class IPDetail extends AbstractModel{

    /**
    * IP字符串
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 供应商，BGP表示默认，CMCC表示中国移动，CUCC表示中国联通，CTCC表示中国电信
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 带宽
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get IP字符串 
     * @return IP IP字符串
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP字符串
     * @param IP IP字符串
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 供应商，BGP表示默认，CMCC表示中国移动，CUCC表示中国联通，CTCC表示中国电信 
     * @return Provider 供应商，BGP表示默认，CMCC表示中国移动，CUCC表示中国联通，CTCC表示中国电信
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 供应商，BGP表示默认，CMCC表示中国移动，CUCC表示中国联通，CTCC表示中国电信
     * @param Provider 供应商，BGP表示默认，CMCC表示中国移动，CUCC表示中国联通，CTCC表示中国电信
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 带宽 
     * @return Bandwidth 带宽
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽
     * @param Bandwidth 带宽
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public IPDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPDetail(IPDetail source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

