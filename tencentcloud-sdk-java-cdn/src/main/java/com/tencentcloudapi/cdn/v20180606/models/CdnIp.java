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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnIp extends AbstractModel{

    /**
    * 指定查询的 IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * IP 归属：
yes：节点归属于腾讯云 CDN
no：节点不属于腾讯云 CDN
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 节点所处的省份/国家
unknown 表示节点位置未知
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 节点上下线历史记录
    */
    @SerializedName("History")
    @Expose
    private CdnIpHistory [] History;

    /**
    * 节点的所在区域
mainland：中国境内加速节点
overseas：中国境外加速节点
unknown：服务地域无法获取
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 指定查询的 IP 
     * @return Ip 指定查询的 IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 指定查询的 IP
     * @param Ip 指定查询的 IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get IP 归属：
yes：节点归属于腾讯云 CDN
no：节点不属于腾讯云 CDN 
     * @return Platform IP 归属：
yes：节点归属于腾讯云 CDN
no：节点不属于腾讯云 CDN
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set IP 归属：
yes：节点归属于腾讯云 CDN
no：节点不属于腾讯云 CDN
     * @param Platform IP 归属：
yes：节点归属于腾讯云 CDN
no：节点不属于腾讯云 CDN
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 节点所处的省份/国家
unknown 表示节点位置未知 
     * @return Location 节点所处的省份/国家
unknown 表示节点位置未知
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 节点所处的省份/国家
unknown 表示节点位置未知
     * @param Location 节点所处的省份/国家
unknown 表示节点位置未知
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 节点上下线历史记录 
     * @return History 节点上下线历史记录
     */
    public CdnIpHistory [] getHistory() {
        return this.History;
    }

    /**
     * Set 节点上下线历史记录
     * @param History 节点上下线历史记录
     */
    public void setHistory(CdnIpHistory [] History) {
        this.History = History;
    }

    /**
     * Get 节点的所在区域
mainland：中国境内加速节点
overseas：中国境外加速节点
unknown：服务地域无法获取 
     * @return Area 节点的所在区域
mainland：中国境内加速节点
overseas：中国境外加速节点
unknown：服务地域无法获取
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 节点的所在区域
mainland：中国境内加速节点
overseas：中国境外加速节点
unknown：服务地域无法获取
     * @param Area 节点的所在区域
mainland：中国境内加速节点
overseas：中国境外加速节点
unknown：服务地域无法获取
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "History.", this.History);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

