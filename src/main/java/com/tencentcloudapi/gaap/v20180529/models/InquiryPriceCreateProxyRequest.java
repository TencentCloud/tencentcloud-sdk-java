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

public class InquiryPriceCreateProxyRequest  extends AbstractModel{

    /**
    * 加速区域名称。
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
    * （旧参数，请切换到RealServerRegion）源站区域名称。
    */
    @SerializedName("DestRegion")
    @Expose
    private String DestRegion;

    /**
    * （旧参数，请切换到Concurrent）通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * （新参数）源站区域名称。
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
     * 获取加速区域名称。
     * @return AccessRegion 加速区域名称。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * 设置加速区域名称。
     * @param AccessRegion 加速区域名称。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * 获取通道带宽上限，单位：Mbps。
     * @return Bandwidth 通道带宽上限，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置通道带宽上限，单位：Mbps。
     * @param Bandwidth 通道带宽上限，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取（旧参数，请切换到RealServerRegion）源站区域名称。
     * @return DestRegion （旧参数，请切换到RealServerRegion）源站区域名称。
     */
    public String getDestRegion() {
        return this.DestRegion;
    }

    /**
     * 设置（旧参数，请切换到RealServerRegion）源站区域名称。
     * @param DestRegion （旧参数，请切换到RealServerRegion）源站区域名称。
     */
    public void setDestRegion(String DestRegion) {
        this.DestRegion = DestRegion;
    }

    /**
     * 获取（旧参数，请切换到Concurrent）通道并发量上限，表示同时在线的连接数，单位：万。
     * @return Concurrency （旧参数，请切换到Concurrent）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * 设置（旧参数，请切换到Concurrent）通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrency （旧参数，请切换到Concurrent）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * 获取（新参数）源站区域名称。
     * @return RealServerRegion （新参数）源站区域名称。
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * 设置（新参数）源站区域名称。
     * @param RealServerRegion （新参数）源站区域名称。
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * 获取（新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     * @return Concurrent （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * 设置（新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrent （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DestRegion", this.DestRegion);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);

    }
}

