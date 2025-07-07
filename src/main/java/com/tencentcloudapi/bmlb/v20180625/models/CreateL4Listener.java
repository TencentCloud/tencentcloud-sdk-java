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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL4Listener extends AbstractModel {

    /**
    * 监听器监听端口，可选值1~65535。
    */
    @SerializedName("LoadBalancerPort")
    @Expose
    private Long LoadBalancerPort;

    /**
    * 监听器协议类型，可选值tcp，udp。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器的会话保持时间，单位：秒。可选值：900~3600,不传表示不开启会话保持。
    */
    @SerializedName("SessionExpire")
    @Expose
    private Long SessionExpire;

    /**
    * 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * 监听器最大带宽值，用于计费模式为固定带宽计费，可选值：0-1000，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

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
    * 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
    */
    @SerializedName("ToaFlag")
    @Expose
    private Long ToaFlag;

    /**
     * Get 监听器监听端口，可选值1~65535。 
     * @return LoadBalancerPort 监听器监听端口，可选值1~65535。
     */
    public Long getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * Set 监听器监听端口，可选值1~65535。
     * @param LoadBalancerPort 监听器监听端口，可选值1~65535。
     */
    public void setLoadBalancerPort(Long LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * Get 监听器协议类型，可选值tcp，udp。 
     * @return Protocol 监听器协议类型，可选值tcp，udp。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议类型，可选值tcp，udp。
     * @param Protocol 监听器协议类型，可选值tcp，udp。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器名称。 
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器的会话保持时间，单位：秒。可选值：900~3600,不传表示不开启会话保持。 
     * @return SessionExpire 监听器的会话保持时间，单位：秒。可选值：900~3600,不传表示不开启会话保持。
     */
    public Long getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * Set 监听器的会话保持时间，单位：秒。可选值：900~3600,不传表示不开启会话保持。
     * @param SessionExpire 监听器的会话保持时间，单位：秒。可选值：900~3600,不传表示不开启会话保持。
     */
    public void setSessionExpire(Long SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * Get 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。 
     * @return HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     * @param HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。默认值0，表示关闭。
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font> 
     * @return TimeOut 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     * @param TimeOut 健康检查的响应超时时间，可选值：2-60，默认值：2，单位:秒。<br><font color="red">响应超时时间要小于检查间隔时间。</font>
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。 
     * @return IntervalTime 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     * @param IntervalTime 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。 
     * @return HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @param HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。 
     * @return UnhealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @param UnhealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get 监听器最大带宽值，用于计费模式为固定带宽计费，可选值：0-1000，单位：Mbps。 
     * @return Bandwidth 监听器最大带宽值，用于计费模式为固定带宽计费，可选值：0-1000，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 监听器最大带宽值，用于计费模式为固定带宽计费，可选值：0-1000，单位：Mbps。
     * @param Bandwidth 监听器最大带宽值，用于计费模式为固定带宽计费，可选值：0-1000，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
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
     * Get 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效） 
     * @return ToaFlag 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     */
    public Long getToaFlag() {
        return this.ToaFlag;
    }

    /**
     * Set 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     * @param ToaFlag 是否开启toa。可选值：0（关闭）、1（开启），默认关闭。（该字段在负载均衡为fullnat类型下才生效）
     */
    public void setToaFlag(Long ToaFlag) {
        this.ToaFlag = ToaFlag;
    }

    public CreateL4Listener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateL4Listener(CreateL4Listener source) {
        if (source.LoadBalancerPort != null) {
            this.LoadBalancerPort = new Long(source.LoadBalancerPort);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SessionExpire != null) {
            this.SessionExpire = new Long(source.SessionExpire);
        }
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Long(source.HealthSwitch);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.HealthNum != null) {
            this.HealthNum = new Long(source.HealthNum);
        }
        if (source.UnhealthNum != null) {
            this.UnhealthNum = new Long(source.UnhealthNum);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.CustomHealthSwitch != null) {
            this.CustomHealthSwitch = new Long(source.CustomHealthSwitch);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.LineSeparatorType != null) {
            this.LineSeparatorType = new Long(source.LineSeparatorType);
        }
        if (source.HealthRequest != null) {
            this.HealthRequest = new String(source.HealthRequest);
        }
        if (source.HealthResponse != null) {
            this.HealthResponse = new String(source.HealthResponse);
        }
        if (source.ToaFlag != null) {
            this.ToaFlag = new Long(source.ToaFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerPort", this.LoadBalancerPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
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

    }
}

