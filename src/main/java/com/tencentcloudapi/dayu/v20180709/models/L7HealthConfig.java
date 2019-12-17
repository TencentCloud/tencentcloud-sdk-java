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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7HealthConfig extends AbstractModel{

    /**
    * 转发协议，取值[http, https, http/https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转发域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * =1表示开启；=0表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 检测间隔时间，单位秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 异常判定次数，单位次
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * 健康判定次数，单位次
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * 健康检查探测方法，可选HEAD或GET，默认为HEAD
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 检查目录的URL，默认为/
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 转发协议，取值[http, https, http/https] 
     * @return Protocol 转发协议，取值[http, https, http/https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议，取值[http, https, http/https]
     * @param Protocol 转发协议，取值[http, https, http/https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 转发域名 
     * @return Domain 转发域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发域名
     * @param Domain 转发域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get =1表示开启；=0表示关闭 
     * @return Enable =1表示开启；=0表示关闭
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set =1表示开启；=0表示关闭
     * @param Enable =1表示开启；=0表示关闭
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 检测间隔时间，单位秒 
     * @return Interval 检测间隔时间，单位秒
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 检测间隔时间，单位秒
     * @param Interval 检测间隔时间，单位秒
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 异常判定次数，单位次 
     * @return KickNum 异常判定次数，单位次
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set 异常判定次数，单位次
     * @param KickNum 异常判定次数，单位次
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get 健康判定次数，单位次 
     * @return AliveNum 健康判定次数，单位次
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set 健康判定次数，单位次
     * @param AliveNum 健康判定次数，单位次
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get 健康检查探测方法，可选HEAD或GET，默认为HEAD 
     * @return Method 健康检查探测方法，可选HEAD或GET，默认为HEAD
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 健康检查探测方法，可选HEAD或GET，默认为HEAD
     * @param Method 健康检查探测方法，可选HEAD或GET，默认为HEAD
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和 
     * @return StatusCode 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     * @param StatusCode 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 检查目录的URL，默认为/ 
     * @return Url 检查目录的URL，默认为/
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 检查目录的URL，默认为/
     * @param Url 检查目录的URL，默认为/
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

