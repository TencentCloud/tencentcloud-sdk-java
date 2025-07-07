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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMonitorRequest extends AbstractModel {

    /**
    * 监控器id
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * 监控器名称
    */
    @SerializedName("MonitorName")
    @Expose
    private String MonitorName;

    /**
    * 检查协议，可选值 PING TCP HTTP HTTPS
    */
    @SerializedName("CheckProtocol")
    @Expose
    private String CheckProtocol;

    /**
    * 检查间隔（秒），可选值 15 60 120 300
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * 超时时间，单位:秒，可选值 2  3  5  10
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 重试次数，可选值为 0，1，2
    */
    @SerializedName("FailTimes")
    @Expose
    private Long FailTimes;

    /**
    * 失败比例，可选值为 20 30 40 50 60 70 80 100，默认值为50
    */
    @SerializedName("FailRate")
    @Expose
    private Long FailRate;

    /**
    * 监控节点类型，可选值有AUTO INTERNAL OVERSEAS IPV6 ALL
    */
    @SerializedName("DetectorStyle")
    @Expose
    private String DetectorStyle;

    /**
    * 探测器组id列表
    */
    @SerializedName("DetectorGroupIds")
    @Expose
    private Long [] DetectorGroupIds;

    /**
    * PING 包数目， 当CheckProtocol=ping时必填，可选值 20 50 100
    */
    @SerializedName("PingNum")
    @Expose
    private Long PingNum;

    /**
    * 检查端口，可选值为1-65535之间的整数
    */
    @SerializedName("TcpPort")
    @Expose
    private Long TcpPort;

    /**
    * Host 设置，默认为业务域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * URL 路径，默认为“/”
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 返回错误码阈值, 可选值为 400 和 500, 默认值500
    */
    @SerializedName("ReturnCodeThreshold")
    @Expose
    private Long ReturnCodeThreshold;

    /**
    * 跟随 3XX 重定向 ，不开启为 DISABLED， 开启为 ENABLED，默认不开启
    */
    @SerializedName("EnableRedirect")
    @Expose
    private String EnableRedirect;

    /**
    * 启用 SNI，不开启为 DISABLED， 开启为 ENABLED，默认不开启
    */
    @SerializedName("EnableSni")
    @Expose
    private String EnableSni;

    /**
    * 丢包率告警阈值，当CheckProtocol=ping时必填，取值在10 30 50 80 90 100
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Long PacketLossRate;

    /**
    * 持续周期数，可选值1-5
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

    /**
     * Get 监控器id 
     * @return MonitorId 监控器id
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控器id
     * @param MonitorId 监控器id
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 监控器名称 
     * @return MonitorName 监控器名称
     */
    public String getMonitorName() {
        return this.MonitorName;
    }

    /**
     * Set 监控器名称
     * @param MonitorName 监控器名称
     */
    public void setMonitorName(String MonitorName) {
        this.MonitorName = MonitorName;
    }

    /**
     * Get 检查协议，可选值 PING TCP HTTP HTTPS 
     * @return CheckProtocol 检查协议，可选值 PING TCP HTTP HTTPS
     */
    public String getCheckProtocol() {
        return this.CheckProtocol;
    }

    /**
     * Set 检查协议，可选值 PING TCP HTTP HTTPS
     * @param CheckProtocol 检查协议，可选值 PING TCP HTTP HTTPS
     */
    public void setCheckProtocol(String CheckProtocol) {
        this.CheckProtocol = CheckProtocol;
    }

    /**
     * Get 检查间隔（秒），可选值 15 60 120 300 
     * @return CheckInterval 检查间隔（秒），可选值 15 60 120 300
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set 检查间隔（秒），可选值 15 60 120 300
     * @param CheckInterval 检查间隔（秒），可选值 15 60 120 300
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get 超时时间，单位:秒，可选值 2  3  5  10 
     * @return Timeout 超时时间，单位:秒，可选值 2  3  5  10
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，单位:秒，可选值 2  3  5  10
     * @param Timeout 超时时间，单位:秒，可选值 2  3  5  10
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 重试次数，可选值为 0，1，2 
     * @return FailTimes 重试次数，可选值为 0，1，2
     */
    public Long getFailTimes() {
        return this.FailTimes;
    }

    /**
     * Set 重试次数，可选值为 0，1，2
     * @param FailTimes 重试次数，可选值为 0，1，2
     */
    public void setFailTimes(Long FailTimes) {
        this.FailTimes = FailTimes;
    }

    /**
     * Get 失败比例，可选值为 20 30 40 50 60 70 80 100，默认值为50 
     * @return FailRate 失败比例，可选值为 20 30 40 50 60 70 80 100，默认值为50
     */
    public Long getFailRate() {
        return this.FailRate;
    }

    /**
     * Set 失败比例，可选值为 20 30 40 50 60 70 80 100，默认值为50
     * @param FailRate 失败比例，可选值为 20 30 40 50 60 70 80 100，默认值为50
     */
    public void setFailRate(Long FailRate) {
        this.FailRate = FailRate;
    }

    /**
     * Get 监控节点类型，可选值有AUTO INTERNAL OVERSEAS IPV6 ALL 
     * @return DetectorStyle 监控节点类型，可选值有AUTO INTERNAL OVERSEAS IPV6 ALL
     */
    public String getDetectorStyle() {
        return this.DetectorStyle;
    }

    /**
     * Set 监控节点类型，可选值有AUTO INTERNAL OVERSEAS IPV6 ALL
     * @param DetectorStyle 监控节点类型，可选值有AUTO INTERNAL OVERSEAS IPV6 ALL
     */
    public void setDetectorStyle(String DetectorStyle) {
        this.DetectorStyle = DetectorStyle;
    }

    /**
     * Get 探测器组id列表 
     * @return DetectorGroupIds 探测器组id列表
     */
    public Long [] getDetectorGroupIds() {
        return this.DetectorGroupIds;
    }

    /**
     * Set 探测器组id列表
     * @param DetectorGroupIds 探测器组id列表
     */
    public void setDetectorGroupIds(Long [] DetectorGroupIds) {
        this.DetectorGroupIds = DetectorGroupIds;
    }

    /**
     * Get PING 包数目， 当CheckProtocol=ping时必填，可选值 20 50 100 
     * @return PingNum PING 包数目， 当CheckProtocol=ping时必填，可选值 20 50 100
     */
    public Long getPingNum() {
        return this.PingNum;
    }

    /**
     * Set PING 包数目， 当CheckProtocol=ping时必填，可选值 20 50 100
     * @param PingNum PING 包数目， 当CheckProtocol=ping时必填，可选值 20 50 100
     */
    public void setPingNum(Long PingNum) {
        this.PingNum = PingNum;
    }

    /**
     * Get 检查端口，可选值为1-65535之间的整数 
     * @return TcpPort 检查端口，可选值为1-65535之间的整数
     */
    public Long getTcpPort() {
        return this.TcpPort;
    }

    /**
     * Set 检查端口，可选值为1-65535之间的整数
     * @param TcpPort 检查端口，可选值为1-65535之间的整数
     */
    public void setTcpPort(Long TcpPort) {
        this.TcpPort = TcpPort;
    }

    /**
     * Get Host 设置，默认为业务域名 
     * @return Host Host 设置，默认为业务域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host 设置，默认为业务域名
     * @param Host Host 设置，默认为业务域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get URL 路径，默认为“/” 
     * @return Path URL 路径，默认为“/”
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set URL 路径，默认为“/”
     * @param Path URL 路径，默认为“/”
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 返回错误码阈值, 可选值为 400 和 500, 默认值500 
     * @return ReturnCodeThreshold 返回错误码阈值, 可选值为 400 和 500, 默认值500
     */
    public Long getReturnCodeThreshold() {
        return this.ReturnCodeThreshold;
    }

    /**
     * Set 返回错误码阈值, 可选值为 400 和 500, 默认值500
     * @param ReturnCodeThreshold 返回错误码阈值, 可选值为 400 和 500, 默认值500
     */
    public void setReturnCodeThreshold(Long ReturnCodeThreshold) {
        this.ReturnCodeThreshold = ReturnCodeThreshold;
    }

    /**
     * Get 跟随 3XX 重定向 ，不开启为 DISABLED， 开启为 ENABLED，默认不开启 
     * @return EnableRedirect 跟随 3XX 重定向 ，不开启为 DISABLED， 开启为 ENABLED，默认不开启
     */
    public String getEnableRedirect() {
        return this.EnableRedirect;
    }

    /**
     * Set 跟随 3XX 重定向 ，不开启为 DISABLED， 开启为 ENABLED，默认不开启
     * @param EnableRedirect 跟随 3XX 重定向 ，不开启为 DISABLED， 开启为 ENABLED，默认不开启
     */
    public void setEnableRedirect(String EnableRedirect) {
        this.EnableRedirect = EnableRedirect;
    }

    /**
     * Get 启用 SNI，不开启为 DISABLED， 开启为 ENABLED，默认不开启 
     * @return EnableSni 启用 SNI，不开启为 DISABLED， 开启为 ENABLED，默认不开启
     */
    public String getEnableSni() {
        return this.EnableSni;
    }

    /**
     * Set 启用 SNI，不开启为 DISABLED， 开启为 ENABLED，默认不开启
     * @param EnableSni 启用 SNI，不开启为 DISABLED， 开启为 ENABLED，默认不开启
     */
    public void setEnableSni(String EnableSni) {
        this.EnableSni = EnableSni;
    }

    /**
     * Get 丢包率告警阈值，当CheckProtocol=ping时必填，取值在10 30 50 80 90 100 
     * @return PacketLossRate 丢包率告警阈值，当CheckProtocol=ping时必填，取值在10 30 50 80 90 100
     */
    public Long getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set 丢包率告警阈值，当CheckProtocol=ping时必填，取值在10 30 50 80 90 100
     * @param PacketLossRate 丢包率告警阈值，当CheckProtocol=ping时必填，取值在10 30 50 80 90 100
     */
    public void setPacketLossRate(Long PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Get 持续周期数，可选值1-5 
     * @return ContinuePeriod 持续周期数，可选值1-5
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set 持续周期数，可选值1-5
     * @param ContinuePeriod 持续周期数，可选值1-5
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    public ModifyMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMonitorRequest(ModifyMonitorRequest source) {
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.MonitorName != null) {
            this.MonitorName = new String(source.MonitorName);
        }
        if (source.CheckProtocol != null) {
            this.CheckProtocol = new String(source.CheckProtocol);
        }
        if (source.CheckInterval != null) {
            this.CheckInterval = new Long(source.CheckInterval);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.FailTimes != null) {
            this.FailTimes = new Long(source.FailTimes);
        }
        if (source.FailRate != null) {
            this.FailRate = new Long(source.FailRate);
        }
        if (source.DetectorStyle != null) {
            this.DetectorStyle = new String(source.DetectorStyle);
        }
        if (source.DetectorGroupIds != null) {
            this.DetectorGroupIds = new Long[source.DetectorGroupIds.length];
            for (int i = 0; i < source.DetectorGroupIds.length; i++) {
                this.DetectorGroupIds[i] = new Long(source.DetectorGroupIds[i]);
            }
        }
        if (source.PingNum != null) {
            this.PingNum = new Long(source.PingNum);
        }
        if (source.TcpPort != null) {
            this.TcpPort = new Long(source.TcpPort);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ReturnCodeThreshold != null) {
            this.ReturnCodeThreshold = new Long(source.ReturnCodeThreshold);
        }
        if (source.EnableRedirect != null) {
            this.EnableRedirect = new String(source.EnableRedirect);
        }
        if (source.EnableSni != null) {
            this.EnableSni = new String(source.EnableSni);
        }
        if (source.PacketLossRate != null) {
            this.PacketLossRate = new Long(source.PacketLossRate);
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new Long(source.ContinuePeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "MonitorName", this.MonitorName);
        this.setParamSimple(map, prefix + "CheckProtocol", this.CheckProtocol);
        this.setParamSimple(map, prefix + "CheckInterval", this.CheckInterval);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FailTimes", this.FailTimes);
        this.setParamSimple(map, prefix + "FailRate", this.FailRate);
        this.setParamSimple(map, prefix + "DetectorStyle", this.DetectorStyle);
        this.setParamArraySimple(map, prefix + "DetectorGroupIds.", this.DetectorGroupIds);
        this.setParamSimple(map, prefix + "PingNum", this.PingNum);
        this.setParamSimple(map, prefix + "TcpPort", this.TcpPort);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ReturnCodeThreshold", this.ReturnCodeThreshold);
        this.setParamSimple(map, prefix + "EnableRedirect", this.EnableRedirect);
        this.setParamSimple(map, prefix + "EnableSni", this.EnableSni);
        this.setParamSimple(map, prefix + "PacketLossRate", this.PacketLossRate);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);

    }
}

