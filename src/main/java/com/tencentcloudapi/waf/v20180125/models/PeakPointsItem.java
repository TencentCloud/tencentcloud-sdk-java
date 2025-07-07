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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakPointsItem extends AbstractModel {

    /**
    * 秒级别时间戳
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * QPS
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * 上行带宽峰值，单位B
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * 下行带宽峰值，单位B
    */
    @SerializedName("Down")
    @Expose
    private Long Down;

    /**
    * Web攻击次数
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * CC攻击次数
    */
    @SerializedName("Cc")
    @Expose
    private Long Cc;

    /**
    * Bot qps
    */
    @SerializedName("BotAccess")
    @Expose
    private Long BotAccess;

    /**
    * WAF返回给客户端状态码5xx次数
    */
    @SerializedName("StatusServerError")
    @Expose
    private Long StatusServerError;

    /**
    * WAF返回给客户端状态码4xx次数
    */
    @SerializedName("StatusClientError")
    @Expose
    private Long StatusClientError;

    /**
    * WAF返回给客户端状态码302次数
    */
    @SerializedName("StatusRedirect")
    @Expose
    private Long StatusRedirect;

    /**
    * WAF返回给客户端状态码202次数
    */
    @SerializedName("StatusOk")
    @Expose
    private Long StatusOk;

    /**
    * 源站返回给WAF状态码5xx次数
    */
    @SerializedName("UpstreamServerError")
    @Expose
    private Long UpstreamServerError;

    /**
    * 源站返回给WAF状态码4xx次数
    */
    @SerializedName("UpstreamClientError")
    @Expose
    private Long UpstreamClientError;

    /**
    * 源站返回给WAF状态码302次数
    */
    @SerializedName("UpstreamRedirect")
    @Expose
    private Long UpstreamRedirect;

    /**
    * 黑名单次数
    */
    @SerializedName("BlackIP")
    @Expose
    private Long BlackIP;

    /**
    * 防篡改次数
    */
    @SerializedName("Tamper")
    @Expose
    private Long Tamper;

    /**
    * 信息防泄露次数
    */
    @SerializedName("Leak")
    @Expose
    private Long Leak;

    /**
    * 访问控制 
    */
    @SerializedName("ACL")
    @Expose
    private Long ACL;

    /**
    * 小程序 qps
    */
    @SerializedName("WxAccess")
    @Expose
    private Long WxAccess;

    /**
    * 小程序请求数
    */
    @SerializedName("WxCount")
    @Expose
    private Long WxCount;

    /**
    * 小程序上行带宽峰值，单位B
    */
    @SerializedName("WxUp")
    @Expose
    private Long WxUp;

    /**
    * 小程序下行带宽峰值，单位B
    */
    @SerializedName("WxDown")
    @Expose
    private Long WxDown;

    /**
     * Get 秒级别时间戳 
     * @return Time 秒级别时间戳
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 秒级别时间戳
     * @param Time 秒级别时间戳
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get QPS 
     * @return Access QPS
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set QPS
     * @param Access QPS
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get 上行带宽峰值，单位B 
     * @return Up 上行带宽峰值，单位B
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 上行带宽峰值，单位B
     * @param Up 上行带宽峰值，单位B
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get 下行带宽峰值，单位B 
     * @return Down 下行带宽峰值，单位B
     */
    public Long getDown() {
        return this.Down;
    }

    /**
     * Set 下行带宽峰值，单位B
     * @param Down 下行带宽峰值，单位B
     */
    public void setDown(Long Down) {
        this.Down = Down;
    }

    /**
     * Get Web攻击次数 
     * @return Attack Web攻击次数
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Web攻击次数
     * @param Attack Web攻击次数
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get CC攻击次数 
     * @return Cc CC攻击次数
     */
    public Long getCc() {
        return this.Cc;
    }

    /**
     * Set CC攻击次数
     * @param Cc CC攻击次数
     */
    public void setCc(Long Cc) {
        this.Cc = Cc;
    }

    /**
     * Get Bot qps 
     * @return BotAccess Bot qps
     */
    public Long getBotAccess() {
        return this.BotAccess;
    }

    /**
     * Set Bot qps
     * @param BotAccess Bot qps
     */
    public void setBotAccess(Long BotAccess) {
        this.BotAccess = BotAccess;
    }

    /**
     * Get WAF返回给客户端状态码5xx次数 
     * @return StatusServerError WAF返回给客户端状态码5xx次数
     */
    public Long getStatusServerError() {
        return this.StatusServerError;
    }

    /**
     * Set WAF返回给客户端状态码5xx次数
     * @param StatusServerError WAF返回给客户端状态码5xx次数
     */
    public void setStatusServerError(Long StatusServerError) {
        this.StatusServerError = StatusServerError;
    }

    /**
     * Get WAF返回给客户端状态码4xx次数 
     * @return StatusClientError WAF返回给客户端状态码4xx次数
     */
    public Long getStatusClientError() {
        return this.StatusClientError;
    }

    /**
     * Set WAF返回给客户端状态码4xx次数
     * @param StatusClientError WAF返回给客户端状态码4xx次数
     */
    public void setStatusClientError(Long StatusClientError) {
        this.StatusClientError = StatusClientError;
    }

    /**
     * Get WAF返回给客户端状态码302次数 
     * @return StatusRedirect WAF返回给客户端状态码302次数
     */
    public Long getStatusRedirect() {
        return this.StatusRedirect;
    }

    /**
     * Set WAF返回给客户端状态码302次数
     * @param StatusRedirect WAF返回给客户端状态码302次数
     */
    public void setStatusRedirect(Long StatusRedirect) {
        this.StatusRedirect = StatusRedirect;
    }

    /**
     * Get WAF返回给客户端状态码202次数 
     * @return StatusOk WAF返回给客户端状态码202次数
     */
    public Long getStatusOk() {
        return this.StatusOk;
    }

    /**
     * Set WAF返回给客户端状态码202次数
     * @param StatusOk WAF返回给客户端状态码202次数
     */
    public void setStatusOk(Long StatusOk) {
        this.StatusOk = StatusOk;
    }

    /**
     * Get 源站返回给WAF状态码5xx次数 
     * @return UpstreamServerError 源站返回给WAF状态码5xx次数
     */
    public Long getUpstreamServerError() {
        return this.UpstreamServerError;
    }

    /**
     * Set 源站返回给WAF状态码5xx次数
     * @param UpstreamServerError 源站返回给WAF状态码5xx次数
     */
    public void setUpstreamServerError(Long UpstreamServerError) {
        this.UpstreamServerError = UpstreamServerError;
    }

    /**
     * Get 源站返回给WAF状态码4xx次数 
     * @return UpstreamClientError 源站返回给WAF状态码4xx次数
     */
    public Long getUpstreamClientError() {
        return this.UpstreamClientError;
    }

    /**
     * Set 源站返回给WAF状态码4xx次数
     * @param UpstreamClientError 源站返回给WAF状态码4xx次数
     */
    public void setUpstreamClientError(Long UpstreamClientError) {
        this.UpstreamClientError = UpstreamClientError;
    }

    /**
     * Get 源站返回给WAF状态码302次数 
     * @return UpstreamRedirect 源站返回给WAF状态码302次数
     */
    public Long getUpstreamRedirect() {
        return this.UpstreamRedirect;
    }

    /**
     * Set 源站返回给WAF状态码302次数
     * @param UpstreamRedirect 源站返回给WAF状态码302次数
     */
    public void setUpstreamRedirect(Long UpstreamRedirect) {
        this.UpstreamRedirect = UpstreamRedirect;
    }

    /**
     * Get 黑名单次数 
     * @return BlackIP 黑名单次数
     */
    public Long getBlackIP() {
        return this.BlackIP;
    }

    /**
     * Set 黑名单次数
     * @param BlackIP 黑名单次数
     */
    public void setBlackIP(Long BlackIP) {
        this.BlackIP = BlackIP;
    }

    /**
     * Get 防篡改次数 
     * @return Tamper 防篡改次数
     */
    public Long getTamper() {
        return this.Tamper;
    }

    /**
     * Set 防篡改次数
     * @param Tamper 防篡改次数
     */
    public void setTamper(Long Tamper) {
        this.Tamper = Tamper;
    }

    /**
     * Get 信息防泄露次数 
     * @return Leak 信息防泄露次数
     */
    public Long getLeak() {
        return this.Leak;
    }

    /**
     * Set 信息防泄露次数
     * @param Leak 信息防泄露次数
     */
    public void setLeak(Long Leak) {
        this.Leak = Leak;
    }

    /**
     * Get 访问控制  
     * @return ACL 访问控制 
     */
    public Long getACL() {
        return this.ACL;
    }

    /**
     * Set 访问控制 
     * @param ACL 访问控制 
     */
    public void setACL(Long ACL) {
        this.ACL = ACL;
    }

    /**
     * Get 小程序 qps 
     * @return WxAccess 小程序 qps
     */
    public Long getWxAccess() {
        return this.WxAccess;
    }

    /**
     * Set 小程序 qps
     * @param WxAccess 小程序 qps
     */
    public void setWxAccess(Long WxAccess) {
        this.WxAccess = WxAccess;
    }

    /**
     * Get 小程序请求数 
     * @return WxCount 小程序请求数
     */
    public Long getWxCount() {
        return this.WxCount;
    }

    /**
     * Set 小程序请求数
     * @param WxCount 小程序请求数
     */
    public void setWxCount(Long WxCount) {
        this.WxCount = WxCount;
    }

    /**
     * Get 小程序上行带宽峰值，单位B 
     * @return WxUp 小程序上行带宽峰值，单位B
     */
    public Long getWxUp() {
        return this.WxUp;
    }

    /**
     * Set 小程序上行带宽峰值，单位B
     * @param WxUp 小程序上行带宽峰值，单位B
     */
    public void setWxUp(Long WxUp) {
        this.WxUp = WxUp;
    }

    /**
     * Get 小程序下行带宽峰值，单位B 
     * @return WxDown 小程序下行带宽峰值，单位B
     */
    public Long getWxDown() {
        return this.WxDown;
    }

    /**
     * Set 小程序下行带宽峰值，单位B
     * @param WxDown 小程序下行带宽峰值，单位B
     */
    public void setWxDown(Long WxDown) {
        this.WxDown = WxDown;
    }

    public PeakPointsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakPointsItem(PeakPointsItem source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.Down != null) {
            this.Down = new Long(source.Down);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Cc != null) {
            this.Cc = new Long(source.Cc);
        }
        if (source.BotAccess != null) {
            this.BotAccess = new Long(source.BotAccess);
        }
        if (source.StatusServerError != null) {
            this.StatusServerError = new Long(source.StatusServerError);
        }
        if (source.StatusClientError != null) {
            this.StatusClientError = new Long(source.StatusClientError);
        }
        if (source.StatusRedirect != null) {
            this.StatusRedirect = new Long(source.StatusRedirect);
        }
        if (source.StatusOk != null) {
            this.StatusOk = new Long(source.StatusOk);
        }
        if (source.UpstreamServerError != null) {
            this.UpstreamServerError = new Long(source.UpstreamServerError);
        }
        if (source.UpstreamClientError != null) {
            this.UpstreamClientError = new Long(source.UpstreamClientError);
        }
        if (source.UpstreamRedirect != null) {
            this.UpstreamRedirect = new Long(source.UpstreamRedirect);
        }
        if (source.BlackIP != null) {
            this.BlackIP = new Long(source.BlackIP);
        }
        if (source.Tamper != null) {
            this.Tamper = new Long(source.Tamper);
        }
        if (source.Leak != null) {
            this.Leak = new Long(source.Leak);
        }
        if (source.ACL != null) {
            this.ACL = new Long(source.ACL);
        }
        if (source.WxAccess != null) {
            this.WxAccess = new Long(source.WxAccess);
        }
        if (source.WxCount != null) {
            this.WxCount = new Long(source.WxCount);
        }
        if (source.WxUp != null) {
            this.WxUp = new Long(source.WxUp);
        }
        if (source.WxDown != null) {
            this.WxDown = new Long(source.WxDown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "Down", this.Down);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Cc", this.Cc);
        this.setParamSimple(map, prefix + "BotAccess", this.BotAccess);
        this.setParamSimple(map, prefix + "StatusServerError", this.StatusServerError);
        this.setParamSimple(map, prefix + "StatusClientError", this.StatusClientError);
        this.setParamSimple(map, prefix + "StatusRedirect", this.StatusRedirect);
        this.setParamSimple(map, prefix + "StatusOk", this.StatusOk);
        this.setParamSimple(map, prefix + "UpstreamServerError", this.UpstreamServerError);
        this.setParamSimple(map, prefix + "UpstreamClientError", this.UpstreamClientError);
        this.setParamSimple(map, prefix + "UpstreamRedirect", this.UpstreamRedirect);
        this.setParamSimple(map, prefix + "BlackIP", this.BlackIP);
        this.setParamSimple(map, prefix + "Tamper", this.Tamper);
        this.setParamSimple(map, prefix + "Leak", this.Leak);
        this.setParamSimple(map, prefix + "ACL", this.ACL);
        this.setParamSimple(map, prefix + "WxAccess", this.WxAccess);
        this.setParamSimple(map, prefix + "WxCount", this.WxCount);
        this.setParamSimple(map, prefix + "WxUp", this.WxUp);
        this.setParamSimple(map, prefix + "WxDown", this.WxDown);

    }
}

