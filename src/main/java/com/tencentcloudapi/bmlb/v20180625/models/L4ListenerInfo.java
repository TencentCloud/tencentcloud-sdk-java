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

public class L4ListenerInfo extends AbstractModel{

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
    private Long LoadBalancerPort;

    /**
    * 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

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
    private Long SessionExpire;

    /**
    * 是否开启了检查：1（开启）、0（关闭）。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * 响应超时时间，单位：秒。
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 检查间隔，单位：秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间戳。
    */
    @SerializedName("AddTimestamp")
    @Expose
    private String AddTimestamp;

    /**
    * 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
    */
    @SerializedName("CustomHealthSwitch")
    @Expose
    private Long CustomHealthSwitch;

    /**
    * 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
    */
    @SerializedName("LineSeparatorType")
    @Expose
    private Long LineSeparatorType;

    /**
    * 自定义探测请求内容。
    */
    @SerializedName("HealthRequest")
    @Expose
    private String HealthRequest;

    /**
    * 自定义探测返回内容。
    */
    @SerializedName("HealthResponse")
    @Expose
    private String HealthResponse;

    /**
    * 是否开启toa：1（开启）、0（关闭）。
    */
    @SerializedName("ToaFlag")
    @Expose
    private Long ToaFlag;

    /**
    * 转发后端服务器调度类型。
    */
    @SerializedName("BalanceMode")
    @Expose
    private String BalanceMode;

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 用户自定义的监听器名称。 
     * @return ListenerName 用户自定义的监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 用户自定义的监听器名称。
     * @param ListenerName 用户自定义的监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 负载均衡实例监听器协议类型，可选值tcp，udp。 
     * @return Protocol 负载均衡实例监听器协议类型，可选值tcp，udp。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 负载均衡实例监听器协议类型，可选值tcp，udp。
     * @param Protocol 负载均衡实例监听器协议类型，可选值tcp，udp。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 负载均衡监听器的监听接口，可选值1~65535。 
     * @return LoadBalancerPort 负载均衡监听器的监听接口，可选值1~65535。
     */
    public Long getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * Set 负载均衡监听器的监听接口，可选值1~65535。
     * @param LoadBalancerPort 负载均衡监听器的监听接口，可选值1~65535。
     */
    public void setLoadBalancerPort(Long LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * Get 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。 
     * @return Bandwidth 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     * @param Bandwidth 用于计费模式为固定带宽计费，指定监听器最大带宽值，可选值：0-1000，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。 
     * @return ListenerType 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     * @param ListenerType 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get 会话保持时间。单位：秒 
     * @return SessionExpire 会话保持时间。单位：秒
     */
    public Long getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * Set 会话保持时间。单位：秒
     * @param SessionExpire 会话保持时间。单位：秒
     */
    public void setSessionExpire(Long SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * Get 是否开启了检查：1（开启）、0（关闭）。 
     * @return HealthSwitch 是否开启了检查：1（开启）、0（关闭）。
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 是否开启了检查：1（开启）、0（关闭）。
     * @param HealthSwitch 是否开启了检查：1（开启）、0（关闭）。
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 响应超时时间，单位：秒。 
     * @return TimeOut 响应超时时间，单位：秒。
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 响应超时时间，单位：秒。
     * @param TimeOut 响应超时时间，单位：秒。
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 检查间隔，单位：秒。 
     * @return IntervalTime 检查间隔，单位：秒。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 检查间隔，单位：秒。
     * @param IntervalTime 检查间隔，单位：秒。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。 
     * @return HealthNum 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @param HealthNum 负载均衡监听器健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。 
     * @return UnhealthNum 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @param UnhealthNum 负载均衡监听器不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。 
     * @return Status 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     * @param Status 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间戳。 
     * @return AddTimestamp 创建时间戳。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * Set 创建时间戳。
     * @param AddTimestamp 创建时间戳。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * Get 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效） 
     * @return CustomHealthSwitch 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     */
    public Long getCustomHealthSwitch() {
        return this.CustomHealthSwitch;
    }

    /**
     * Set 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     * @param CustomHealthSwitch 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     */
    public void setCustomHealthSwitch(Long CustomHealthSwitch) {
        this.CustomHealthSwitch = CustomHealthSwitch;
    }

    /**
     * Get 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。 
     * @return InputType 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     * @param InputType 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。 
     * @return LineSeparatorType 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     */
    public Long getLineSeparatorType() {
        return this.LineSeparatorType;
    }

    /**
     * Set 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     * @param LineSeparatorType 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     */
    public void setLineSeparatorType(Long LineSeparatorType) {
        this.LineSeparatorType = LineSeparatorType;
    }

    /**
     * Get 自定义探测请求内容。 
     * @return HealthRequest 自定义探测请求内容。
     */
    public String getHealthRequest() {
        return this.HealthRequest;
    }

    /**
     * Set 自定义探测请求内容。
     * @param HealthRequest 自定义探测请求内容。
     */
    public void setHealthRequest(String HealthRequest) {
        this.HealthRequest = HealthRequest;
    }

    /**
     * Get 自定义探测返回内容。 
     * @return HealthResponse 自定义探测返回内容。
     */
    public String getHealthResponse() {
        return this.HealthResponse;
    }

    /**
     * Set 自定义探测返回内容。
     * @param HealthResponse 自定义探测返回内容。
     */
    public void setHealthResponse(String HealthResponse) {
        this.HealthResponse = HealthResponse;
    }

    /**
     * Get 是否开启toa：1（开启）、0（关闭）。 
     * @return ToaFlag 是否开启toa：1（开启）、0（关闭）。
     */
    public Long getToaFlag() {
        return this.ToaFlag;
    }

    /**
     * Set 是否开启toa：1（开启）、0（关闭）。
     * @param ToaFlag 是否开启toa：1（开启）、0（关闭）。
     */
    public void setToaFlag(Long ToaFlag) {
        this.ToaFlag = ToaFlag;
    }

    /**
     * Get 转发后端服务器调度类型。 
     * @return BalanceMode 转发后端服务器调度类型。
     */
    public String getBalanceMode() {
        return this.BalanceMode;
    }

    /**
     * Set 转发后端服务器调度类型。
     * @param BalanceMode 转发后端服务器调度类型。
     */
    public void setBalanceMode(String BalanceMode) {
        this.BalanceMode = BalanceMode;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "CustomHealthSwitch", this.CustomHealthSwitch);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "LineSeparatorType", this.LineSeparatorType);
        this.setParamSimple(map, prefix + "HealthRequest", this.HealthRequest);
        this.setParamSimple(map, prefix + "HealthResponse", this.HealthResponse);
        this.setParamSimple(map, prefix + "ToaFlag", this.ToaFlag);
        this.setParamSimple(map, prefix + "BalanceMode", this.BalanceMode);

    }
}

