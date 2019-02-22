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

public class ModifyL4ListenerRequest  extends AbstractModel{

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 四层监听器ID。可通过接口DescribeL4Listeners查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 四层监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 会话保持时间，单位：秒。可选值：900~3600。
    */
    @SerializedName("SessionExpire")
    @Expose
    private Integer SessionExpire;

    /**
    * 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Integer HealthSwitch;

    /**
    * 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
    */
    @SerializedName("TimeOut")
    @Expose
    private Integer TimeOut;

    /**
    * 健康检查间隔，默认值：5，可选值：5-300，单位：秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Integer IntervalTime;

    /**
    * 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Integer HealthNum;

    /**
    * 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Integer UnhealthNum;

    /**
    * 监听器最大带宽值，用于计费模式为固定带宽计费。可选值：0-1000，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
    * 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
    */
    @SerializedName("CustomHealthSwitch")
    @Expose
    private Integer CustomHealthSwitch;

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
    private Integer LineSeparatorType;

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
    * 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
    */
    @SerializedName("ToaFlag")
    @Expose
    private Integer ToaFlag;

    /**
    * 四层调度方式。wrr，wlc。
    */
    @SerializedName("BalanceMode")
    @Expose
    private String BalanceMode;

    /**
     * 获取负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取四层监听器ID。可通过接口DescribeL4Listeners查询。
     * @return ListenerId 四层监听器ID。可通过接口DescribeL4Listeners查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置四层监听器ID。可通过接口DescribeL4Listeners查询。
     * @param ListenerId 四层监听器ID。可通过接口DescribeL4Listeners查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取四层监听器名称。
     * @return ListenerName 四层监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置四层监听器名称。
     * @param ListenerName 四层监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取会话保持时间，单位：秒。可选值：900~3600。
     * @return SessionExpire 会话保持时间，单位：秒。可选值：900~3600。
     */
    public Integer getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * 设置会话保持时间，单位：秒。可选值：900~3600。
     * @param SessionExpire 会话保持时间，单位：秒。可选值：900~3600。
     */
    public void setSessionExpire(Integer SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * 获取是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     * @return HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     */
    public Integer getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * 设置是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     * @param HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     */
    public void setHealthSwitch(Integer HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * 获取健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     * @return TimeOut 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     */
    public Integer getTimeOut() {
        return this.TimeOut;
    }

    /**
     * 设置健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     * @param TimeOut 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     */
    public void setTimeOut(Integer TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * 获取健康检查间隔，默认值：5，可选值：5-300，单位：秒。
     * @return IntervalTime 健康检查间隔，默认值：5，可选值：5-300，单位：秒。
     */
    public Integer getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * 设置健康检查间隔，默认值：5，可选值：5-300，单位：秒。
     * @param IntervalTime 健康检查间隔，默认值：5，可选值：5-300，单位：秒。
     */
    public void setIntervalTime(Integer IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * 获取健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @return HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public Integer getHealthNum() {
        return this.HealthNum;
    }

    /**
     * 设置健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @param HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public void setHealthNum(Integer HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * 获取不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @return UnhealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public Integer getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * 设置不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @param UnhealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public void setUnhealthNum(Integer UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * 获取监听器最大带宽值，用于计费模式为固定带宽计费。可选值：0-1000，单位：Mbps。
     * @return Bandwidth 监听器最大带宽值，用于计费模式为固定带宽计费。可选值：0-1000，单位：Mbps。
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置监听器最大带宽值，用于计费模式为固定带宽计费。可选值：0-1000，单位：Mbps。
     * @param Bandwidth 监听器最大带宽值，用于计费模式为固定带宽计费。可选值：0-1000，单位：Mbps。
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     * @return CustomHealthSwitch 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     */
    public Integer getCustomHealthSwitch() {
        return this.CustomHealthSwitch;
    }

    /**
     * 设置是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     * @param CustomHealthSwitch 是否开启自定义健康检查：1（开启）、0（关闭）。默认值0，表示关闭。（该字段在健康检查开启的情况下才生效）
     */
    public void setCustomHealthSwitch(Integer CustomHealthSwitch) {
        this.CustomHealthSwitch = CustomHealthSwitch;
    }

    /**
     * 获取自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     * @return InputType 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * 设置自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     * @param InputType 自定义健康探测内容类型，可选值：text（文本）、hexadecimal（十六进制）。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * 获取探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     * @return LineSeparatorType 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     */
    public Integer getLineSeparatorType() {
        return this.LineSeparatorType;
    }

    /**
     * 设置探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     * @param LineSeparatorType 探测内容类型为文本方式时，针对请求文本中换行替换方式。可选值：1（替换为LF）、2（替换为CR）、3（替换为LF+CR）。
     */
    public void setLineSeparatorType(Integer LineSeparatorType) {
        this.LineSeparatorType = LineSeparatorType;
    }

    /**
     * 获取自定义探测请求内容。
     * @return HealthRequest 自定义探测请求内容。
     */
    public String getHealthRequest() {
        return this.HealthRequest;
    }

    /**
     * 设置自定义探测请求内容。
     * @param HealthRequest 自定义探测请求内容。
     */
    public void setHealthRequest(String HealthRequest) {
        this.HealthRequest = HealthRequest;
    }

    /**
     * 获取自定义探测返回内容。
     * @return HealthResponse 自定义探测返回内容。
     */
    public String getHealthResponse() {
        return this.HealthResponse;
    }

    /**
     * 设置自定义探测返回内容。
     * @param HealthResponse 自定义探测返回内容。
     */
    public void setHealthResponse(String HealthResponse) {
        this.HealthResponse = HealthResponse;
    }

    /**
     * 获取是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     * @return ToaFlag 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     */
    public Integer getToaFlag() {
        return this.ToaFlag;
    }

    /**
     * 设置是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     * @param ToaFlag 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     */
    public void setToaFlag(Integer ToaFlag) {
        this.ToaFlag = ToaFlag;
    }

    /**
     * 获取四层调度方式。wrr，wlc。
     * @return BalanceMode 四层调度方式。wrr，wlc。
     */
    public String getBalanceMode() {
        return this.BalanceMode;
    }

    /**
     * 设置四层调度方式。wrr，wlc。
     * @param BalanceMode 四层调度方式。wrr，wlc。
     */
    public void setBalanceMode(String BalanceMode) {
        this.BalanceMode = BalanceMode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SessionExpire", this.SessionExpire);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "CustomHealthSwitch", this.CustomHealthSwitch);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "LineSeparatorType", this.LineSeparatorType);
        this.setParamSimple(map, prefix + "HealthRequest", this.HealthRequest);
        this.setParamSimple(map, prefix + "HealthResponse", this.HealthResponse);
        this.setParamSimple(map, prefix + "ToaFlag", this.ToaFlag);
        this.setParamSimple(map, prefix + "BalanceMode", this.BalanceMode);

    }
}

