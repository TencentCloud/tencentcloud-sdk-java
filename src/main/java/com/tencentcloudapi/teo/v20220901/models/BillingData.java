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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillingData extends AbstractModel {

    /**
    * 数据时间戳。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 数值。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 数据点所属站点 ID。若使用内容标识符功能，则该项值为内容标识符。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 数据点所属域名。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 数据点所属四层代理实例 ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 数据点所属计费大区 ID。计费大区以实际服务用户客户端的 EdgeOne 节点所在区域为准。取值有：<li>CH：中国大陆境内</li><li>AF：非洲</li><li>AS1：亚太一区</li><li>AS2：亚太二区</li><li>AS3：亚太三区</li><li>EU：欧洲</li><li>MidEast：中东</li><li>NA：北美</li><li> SA：南美</li>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get 数据时间戳。 
     * @return Time 数据时间戳。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间戳。
     * @param Time 数据时间戳。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 数值。 
     * @return Value 数值。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 数值。
     * @param Value 数值。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 数据点所属站点 ID。若使用内容标识符功能，则该项值为内容标识符。 
     * @return ZoneId 数据点所属站点 ID。若使用内容标识符功能，则该项值为内容标识符。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 数据点所属站点 ID。若使用内容标识符功能，则该项值为内容标识符。
     * @param ZoneId 数据点所属站点 ID。若使用内容标识符功能，则该项值为内容标识符。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 数据点所属域名。 
     * @return Host 数据点所属域名。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 数据点所属域名。
     * @param Host 数据点所属域名。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 数据点所属四层代理实例 ID。 
     * @return ProxyId 数据点所属四层代理实例 ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 数据点所属四层代理实例 ID。
     * @param ProxyId 数据点所属四层代理实例 ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 数据点所属计费大区 ID。计费大区以实际服务用户客户端的 EdgeOne 节点所在区域为准。取值有：<li>CH：中国大陆境内</li><li>AF：非洲</li><li>AS1：亚太一区</li><li>AS2：亚太二区</li><li>AS3：亚太三区</li><li>EU：欧洲</li><li>MidEast：中东</li><li>NA：北美</li><li> SA：南美</li> 
     * @return RegionId 数据点所属计费大区 ID。计费大区以实际服务用户客户端的 EdgeOne 节点所在区域为准。取值有：<li>CH：中国大陆境内</li><li>AF：非洲</li><li>AS1：亚太一区</li><li>AS2：亚太二区</li><li>AS3：亚太三区</li><li>EU：欧洲</li><li>MidEast：中东</li><li>NA：北美</li><li> SA：南美</li>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 数据点所属计费大区 ID。计费大区以实际服务用户客户端的 EdgeOne 节点所在区域为准。取值有：<li>CH：中国大陆境内</li><li>AF：非洲</li><li>AS1：亚太一区</li><li>AS2：亚太二区</li><li>AS3：亚太三区</li><li>EU：欧洲</li><li>MidEast：中东</li><li>NA：北美</li><li> SA：南美</li>
     * @param RegionId 数据点所属计费大区 ID。计费大区以实际服务用户客户端的 EdgeOne 节点所在区域为准。取值有：<li>CH：中国大陆境内</li><li>AF：非洲</li><li>AS1：亚太一区</li><li>AS2：亚太二区</li><li>AS3：亚太三区</li><li>EU：欧洲</li><li>MidEast：中东</li><li>NA：北美</li><li> SA：南美</li>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public BillingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillingData(BillingData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

