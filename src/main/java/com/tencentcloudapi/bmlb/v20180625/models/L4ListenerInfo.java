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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4ListenerInfo  extends AbstractModel{

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 用户自定义的监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 负载均衡实例监听器协议类型，可选值tcp，udp。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 负载均衡监听器的监听接口，可选值1~65535。
    */
    @SerializedName("LoadBalancerPort")
    @Expose
    private Integer LoadBalancerPort;

    /**
    * 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
    * 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * 会话保持时间。单位：秒
    */
    @SerializedName("SessionExpire")
    @Expose
    private Integer SessionExpire;

    /**
    * 是否开启了检查：1（开启）、0（关闭）。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Integer HealthSwitch;

    /**
    * 响应超时时间，单位：秒。
    */
    @SerializedName("TimeOut")
    @Expose
    private Integer TimeOut;

    /**
    * 检查间隔，单位：秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Integer IntervalTime;

    /**
    * 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Integer HealthNum;

    /**
    * 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Integer UnhealthNum;

    /**
    * 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 创建时间戳。
    */
    @SerializedName("AddTimestamp")
    @Expose
    private String AddTimestamp;

    /**
     * 获取监听器ID。
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取用户自定义的监听器名称。
     * @return ListenerName 用户自定义的监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置用户自定义的监听器名称。
     * @param ListenerName 用户自定义的监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取负载均衡实例监听器协议类型，可选值tcp，udp。
     * @return Protocol 负载均衡实例监听器协议类型，可选值tcp，udp。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置负载均衡实例监听器协议类型，可选值tcp，udp。
     * @param Protocol 负载均衡实例监听器协议类型，可选值tcp，udp。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取负载均衡监听器的监听接口，可选值1~65535。
     * @return LoadBalancerPort 负载均衡监听器的监听接口，可选值1~65535。
     */
    public Integer getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * 设置负载均衡监听器的监听接口，可选值1~65535。
     * @param LoadBalancerPort 负载均衡监听器的监听接口，可选值1~65535。
     */
    public void setLoadBalancerPort(Integer LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * 获取用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     * @return Bandwidth 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     * @param Bandwidth 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     * @return ListenerType 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * 设置监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     * @param ListenerType 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * 获取会话保持时间。单位：秒
     * @return SessionExpire 会话保持时间。单位：秒
     */
    public Integer getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * 设置会话保持时间。单位：秒
     * @param SessionExpire 会话保持时间。单位：秒
     */
    public void setSessionExpire(Integer SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * 获取是否开启了检查：1（开启）、0（关闭）。
     * @return HealthSwitch 是否开启了检查：1（开启）、0（关闭）。
     */
    public Integer getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * 设置是否开启了检查：1（开启）、0（关闭）。
     * @param HealthSwitch 是否开启了检查：1（开启）、0（关闭）。
     */
    public void setHealthSwitch(Integer HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * 获取响应超时时间，单位：秒。
     * @return TimeOut 响应超时时间，单位：秒。
     */
    public Integer getTimeOut() {
        return this.TimeOut;
    }

    /**
     * 设置响应超时时间，单位：秒。
     * @param TimeOut 响应超时时间，单位：秒。
     */
    public void setTimeOut(Integer TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * 获取检查间隔，单位：秒。
     * @return IntervalTime 检查间隔，单位：秒。
     */
    public Integer getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * 设置检查间隔，单位：秒。
     * @param IntervalTime 检查间隔，单位：秒。
     */
    public void setIntervalTime(Integer IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * 获取负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @return HealthNum 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public Integer getHealthNum() {
        return this.HealthNum;
    }

    /**
     * 设置负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @param HealthNum 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public void setHealthNum(Integer HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * 获取负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @return UnhealthNum 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public Integer getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * 设置负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @param UnhealthNum 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public void setUnhealthNum(Integer UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * 获取监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     * @return Status 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     * @param Status 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取创建时间戳。
     * @return AddTimestamp 创建时间戳。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * 设置创建时间戳。
     * @param AddTimestamp 创建时间戳。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "LoadBalancerPort", this.LoadBalancerPort);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "SessionExpire", this.SessionExpire);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTimestamp", this.AddTimestamp);

    }
}

