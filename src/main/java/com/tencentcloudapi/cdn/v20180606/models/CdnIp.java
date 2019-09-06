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

public class CdnIp  extends AbstractModel{

    /**
    * 节点 ip。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 是否为腾讯云 CDN 加速节点。yes 表示该节点为腾讯云 CDN 节点，no 表示该节点不是腾讯云 CDN 节点。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 表示该节点所处的省份/国家。unknown 表示节点位置未知。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 节点上下线历史记录。
    */
    @SerializedName("History")
    @Expose
    private CdnIpHistory [] History;

    /**
    * 节点的服务地域。mainland 表示服务地域为中国境内，overseas 表示服务地域为中国境外， unknown 表示服务地域未知。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * 获取节点 ip。
     * @return Ip 节点 ip。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置节点 ip。
     * @param Ip 节点 ip。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取是否为腾讯云 CDN 加速节点。yes 表示该节点为腾讯云 CDN 节点，no 表示该节点不是腾讯云 CDN 节点。
     * @return Platform 是否为腾讯云 CDN 加速节点。yes 表示该节点为腾讯云 CDN 节点，no 表示该节点不是腾讯云 CDN 节点。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * 设置是否为腾讯云 CDN 加速节点。yes 表示该节点为腾讯云 CDN 节点，no 表示该节点不是腾讯云 CDN 节点。
     * @param Platform 是否为腾讯云 CDN 加速节点。yes 表示该节点为腾讯云 CDN 节点，no 表示该节点不是腾讯云 CDN 节点。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * 获取表示该节点所处的省份/国家。unknown 表示节点位置未知。
     * @return Location 表示该节点所处的省份/国家。unknown 表示节点位置未知。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * 设置表示该节点所处的省份/国家。unknown 表示节点位置未知。
     * @param Location 表示该节点所处的省份/国家。unknown 表示节点位置未知。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * 获取节点上下线历史记录。
     * @return History 节点上下线历史记录。
     */
    public CdnIpHistory [] getHistory() {
        return this.History;
    }

    /**
     * 设置节点上下线历史记录。
     * @param History 节点上下线历史记录。
     */
    public void setHistory(CdnIpHistory [] History) {
        this.History = History;
    }

    /**
     * 获取节点的服务地域。mainland 表示服务地域为中国境内，overseas 表示服务地域为中国境外， unknown 表示服务地域未知。
     * @return Area 节点的服务地域。mainland 表示服务地域为中国境内，overseas 表示服务地域为中国境外， unknown 表示服务地域未知。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * 设置节点的服务地域。mainland 表示服务地域为中国境内，overseas 表示服务地域为中国境外， unknown 表示服务地域未知。
     * @param Area 节点的服务地域。mainland 表示服务地域为中国境内，overseas 表示服务地域为中国境外， unknown 表示服务地域未知。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "History.", this.History);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

