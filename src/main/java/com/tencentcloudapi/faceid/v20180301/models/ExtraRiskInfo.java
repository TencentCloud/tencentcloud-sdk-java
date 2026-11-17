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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraRiskInfo extends AbstractModel {

    /**
    * <p>客户业务域内稳定且唯一的人员标识，用于把同一人员的多次位置上报关联起来，判断是否存在异常位移。</p><p>入参限制：长度 ≤ 128 字符；不可含控制字符（ASCII &lt; 0x20 或 0x7F）；建议传脱敏标识，勿传明文身份证号/手机号</p>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>设备采集时的纬度，WGS84 十进制度    </p><p>入参限制：与 Longitude 必须成对出现；取值 [-90, 90]；须为有效数字，不接受 NaN/Inf；JSON 中按字符串传（如 &quot;22.5431&quot;）</p>
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * <p>设备采集时的经度，WGS84 十进制度    </p><p>入参限制：与 Latitude 必须成对出现；取值 [-180, 180]；其余同上</p>
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * <p>设备采集时的公网出口 IP    </p><p>入参限制：长度 ≤ 64；须为可解析的 IPv4/IPv6；私网、回环、链路本地、组播地址视为不可定位</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get <p>客户业务域内稳定且唯一的人员标识，用于把同一人员的多次位置上报关联起来，判断是否存在异常位移。</p><p>入参限制：长度 ≤ 128 字符；不可含控制字符（ASCII &lt; 0x20 或 0x7F）；建议传脱敏标识，勿传明文身份证号/手机号</p> 
     * @return PersonId <p>客户业务域内稳定且唯一的人员标识，用于把同一人员的多次位置上报关联起来，判断是否存在异常位移。</p><p>入参限制：长度 ≤ 128 字符；不可含控制字符（ASCII &lt; 0x20 或 0x7F）；建议传脱敏标识，勿传明文身份证号/手机号</p>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>客户业务域内稳定且唯一的人员标识，用于把同一人员的多次位置上报关联起来，判断是否存在异常位移。</p><p>入参限制：长度 ≤ 128 字符；不可含控制字符（ASCII &lt; 0x20 或 0x7F）；建议传脱敏标识，勿传明文身份证号/手机号</p>
     * @param PersonId <p>客户业务域内稳定且唯一的人员标识，用于把同一人员的多次位置上报关联起来，判断是否存在异常位移。</p><p>入参限制：长度 ≤ 128 字符；不可含控制字符（ASCII &lt; 0x20 或 0x7F）；建议传脱敏标识，勿传明文身份证号/手机号</p>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>设备采集时的纬度，WGS84 十进制度    </p><p>入参限制：与 Longitude 必须成对出现；取值 [-90, 90]；须为有效数字，不接受 NaN/Inf；JSON 中按字符串传（如 &quot;22.5431&quot;）</p> 
     * @return Latitude <p>设备采集时的纬度，WGS84 十进制度    </p><p>入参限制：与 Longitude 必须成对出现；取值 [-90, 90]；须为有效数字，不接受 NaN/Inf；JSON 中按字符串传（如 &quot;22.5431&quot;）</p>
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set <p>设备采集时的纬度，WGS84 十进制度    </p><p>入参限制：与 Longitude 必须成对出现；取值 [-90, 90]；须为有效数字，不接受 NaN/Inf；JSON 中按字符串传（如 &quot;22.5431&quot;）</p>
     * @param Latitude <p>设备采集时的纬度，WGS84 十进制度    </p><p>入参限制：与 Longitude 必须成对出现；取值 [-90, 90]；须为有效数字，不接受 NaN/Inf；JSON 中按字符串传（如 &quot;22.5431&quot;）</p>
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get <p>设备采集时的经度，WGS84 十进制度    </p><p>入参限制：与 Latitude 必须成对出现；取值 [-180, 180]；其余同上</p> 
     * @return Longitude <p>设备采集时的经度，WGS84 十进制度    </p><p>入参限制：与 Latitude 必须成对出现；取值 [-180, 180]；其余同上</p>
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set <p>设备采集时的经度，WGS84 十进制度    </p><p>入参限制：与 Latitude 必须成对出现；取值 [-180, 180]；其余同上</p>
     * @param Longitude <p>设备采集时的经度，WGS84 十进制度    </p><p>入参限制：与 Latitude 必须成对出现；取值 [-180, 180]；其余同上</p>
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get <p>设备采集时的公网出口 IP    </p><p>入参限制：长度 ≤ 64；须为可解析的 IPv4/IPv6；私网、回环、链路本地、组播地址视为不可定位</p> 
     * @return Ip <p>设备采集时的公网出口 IP    </p><p>入参限制：长度 ≤ 64；须为可解析的 IPv4/IPv6；私网、回环、链路本地、组播地址视为不可定位</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>设备采集时的公网出口 IP    </p><p>入参限制：长度 ≤ 64；须为可解析的 IPv4/IPv6；私网、回环、链路本地、组播地址视为不可定位</p>
     * @param Ip <p>设备采集时的公网出口 IP    </p><p>入参限制：长度 ≤ 64；须为可解析的 IPv4/IPv6；私网、回环、链路本地、组播地址视为不可定位</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public ExtraRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraRiskInfo(ExtraRiskInfo source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

