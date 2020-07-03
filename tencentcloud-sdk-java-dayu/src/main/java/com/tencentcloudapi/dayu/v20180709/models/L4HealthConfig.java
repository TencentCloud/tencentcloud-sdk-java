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

public class L4HealthConfig extends AbstractModel{

    /**
    * 转发协议，取值[TCP, UDP]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转发端口
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
    * =1表示开启；=0表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 响应超时时间，单位秒
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 检测间隔时间，单位秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 不健康阈值，单位次
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * 健康阈值，单位次
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * 会话保持时间，单位秒
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
     * Get 转发协议，取值[TCP, UDP] 
     * @return Protocol 转发协议，取值[TCP, UDP]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议，取值[TCP, UDP]
     * @param Protocol 转发协议，取值[TCP, UDP]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 转发端口 
     * @return VirtualPort 转发端口
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set 转发端口
     * @param VirtualPort 转发端口
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
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
     * Get 响应超时时间，单位秒 
     * @return TimeOut 响应超时时间，单位秒
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 响应超时时间，单位秒
     * @param TimeOut 响应超时时间，单位秒
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
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
     * Get 不健康阈值，单位次 
     * @return KickNum 不健康阈值，单位次
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set 不健康阈值，单位次
     * @param KickNum 不健康阈值，单位次
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get 健康阈值，单位次 
     * @return AliveNum 健康阈值，单位次
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set 健康阈值，单位次
     * @param AliveNum 健康阈值，单位次
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get 会话保持时间，单位秒 
     * @return KeepTime 会话保持时间，单位秒
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set 会话保持时间，单位秒
     * @param KeepTime 会话保持时间，单位秒
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);

    }
}

