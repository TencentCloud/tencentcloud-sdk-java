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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionDeviceDetail extends AbstractModel {

    /**
    * <p>设备类型：field或remote</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>起始点位时间，单位：秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束点位时间，单位：秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>码率，单位：kbps</p>
    */
    @SerializedName("Rate")
    @Expose
    private Long [] Rate;

    /**
    * <p>帧率</p>
    */
    @SerializedName("Fps")
    @Expose
    private Long [] Fps;

    /**
    * <p>丢包率，单位：%</p>
    */
    @SerializedName("Lost")
    @Expose
    private Float [] Lost;

    /**
    * <p>网络时延，单位：ms</p>
    */
    @SerializedName("NetworkLatency")
    @Expose
    private Long [] NetworkLatency;

    /**
    * <p>视频时延，单位：ms</p>
    */
    @SerializedName("VideoLatency")
    @Expose
    private Long [] VideoLatency;

    /**
    * <p>CPU使用率，单位：%</p>
    */
    @SerializedName("CpuUsed")
    @Expose
    private Float [] CpuUsed;

    /**
    * <p>内存使用率，单位：%</p>
    */
    @SerializedName("MemUsed")
    @Expose
    private Float [] MemUsed;

    /**
    * <p>时间偏移量，单位：秒</p>
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long [] TimeOffset;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>设备ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>sdk版本</p>
    */
    @SerializedName("Ver")
    @Expose
    private String Ver;

    /**
    * <p>模式(p2p/server)</p>
    */
    @SerializedName("SdkMode")
    @Expose
    private String SdkMode;

    /**
    * <p>解码耗时，单位：ms</p>
    */
    @SerializedName("DecodeCost")
    @Expose
    private Long [] DecodeCost;

    /**
    * <p>【已废弃，使用RenderCost】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenderConst")
    @Expose
    private Long [] RenderConst;

    /**
    * <p>卡顿k100</p>
    */
    @SerializedName("K100")
    @Expose
    private Float [] K100;

    /**
    * <p>卡顿k150</p>
    */
    @SerializedName("K150")
    @Expose
    private Float [] K150;

    /**
    * <p>nack请求数</p>
    */
    @SerializedName("NACK")
    @Expose
    private Long [] NACK;

    /**
    * <p>服务端调控码率,单位：kbps</p>
    */
    @SerializedName("BitRateEstimate")
    @Expose
    private Long [] BitRateEstimate;

    /**
    * <p>宽度</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>高度</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>编码耗时，单位：ms</p>
    */
    @SerializedName("EncodeCost")
    @Expose
    private Long [] EncodeCost;

    /**
    * <p>采集耗时，单位：ms</p>
    */
    @SerializedName("CaptureCost")
    @Expose
    private Long [] CaptureCost;

    /**
    * <p>渲染耗时，单位：ms</p>
    */
    @SerializedName("RenderCost")
    @Expose
    private Long [] RenderCost;

    /**
    * <p>配置宽度</p>
    */
    @SerializedName("ConfigWidth")
    @Expose
    private Long ConfigWidth;

    /**
    * <p>配置高度</p>
    */
    @SerializedName("ConfigHeight")
    @Expose
    private Long ConfigHeight;

    /**
    * <p>平均帧间隔</p>
    */
    @SerializedName("FrameDelta")
    @Expose
    private Long [] FrameDelta;

    /**
    * <p>最大帧间隔</p>
    */
    @SerializedName("MaxFrameDelta")
    @Expose
    private Long [] MaxFrameDelta;

    /**
    * <p>总码率评估,单位：kbps</p>
    */
    @SerializedName("TotalBitrateEstimate")
    @Expose
    private Long [] TotalBitrateEstimate;

    /**
    * <p>帧间隔大于100ms的卡顿时长</p>
    */
    @SerializedName("Lag100Duration")
    @Expose
    private Long [] Lag100Duration;

    /**
    * <p>帧间隔大于150ms的卡顿时长</p>
    */
    @SerializedName("Lag150Duration")
    @Expose
    private Long [] Lag150Duration;

    /**
    * <p>是否开启多网：0 单网，1 多网</p>
    */
    @SerializedName("MultiMode")
    @Expose
    private Long MultiMode;

    /**
    * <p>多网卡信息</p>
    */
    @SerializedName("MultiNet")
    @Expose
    private MultiNet [] MultiNet;

    /**
    * <p>现场设备和远端设备消息通道往返延迟</p><p>单位：毫秒ms</p>
    */
    @SerializedName("ControlLatency")
    @Expose
    private Long [] ControlLatency;

    /**
     * Get <p>设备类型：field或remote</p> 
     * @return DeviceType <p>设备类型：field或remote</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型：field或remote</p>
     * @param DeviceType <p>设备类型：field或remote</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>起始点位时间，单位：秒</p> 
     * @return StartTime <p>起始点位时间，单位：秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始点位时间，单位：秒</p>
     * @param StartTime <p>起始点位时间，单位：秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束点位时间，单位：秒</p> 
     * @return EndTime <p>结束点位时间，单位：秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束点位时间，单位：秒</p>
     * @param EndTime <p>结束点位时间，单位：秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>会话ID</p> 
     * @return SessionId <p>会话ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话ID</p>
     * @param SessionId <p>会话ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>码率，单位：kbps</p> 
     * @return Rate <p>码率，单位：kbps</p>
     */
    public Long [] getRate() {
        return this.Rate;
    }

    /**
     * Set <p>码率，单位：kbps</p>
     * @param Rate <p>码率，单位：kbps</p>
     */
    public void setRate(Long [] Rate) {
        this.Rate = Rate;
    }

    /**
     * Get <p>帧率</p> 
     * @return Fps <p>帧率</p>
     */
    public Long [] getFps() {
        return this.Fps;
    }

    /**
     * Set <p>帧率</p>
     * @param Fps <p>帧率</p>
     */
    public void setFps(Long [] Fps) {
        this.Fps = Fps;
    }

    /**
     * Get <p>丢包率，单位：%</p> 
     * @return Lost <p>丢包率，单位：%</p>
     */
    public Float [] getLost() {
        return this.Lost;
    }

    /**
     * Set <p>丢包率，单位：%</p>
     * @param Lost <p>丢包率，单位：%</p>
     */
    public void setLost(Float [] Lost) {
        this.Lost = Lost;
    }

    /**
     * Get <p>网络时延，单位：ms</p> 
     * @return NetworkLatency <p>网络时延，单位：ms</p>
     */
    public Long [] getNetworkLatency() {
        return this.NetworkLatency;
    }

    /**
     * Set <p>网络时延，单位：ms</p>
     * @param NetworkLatency <p>网络时延，单位：ms</p>
     */
    public void setNetworkLatency(Long [] NetworkLatency) {
        this.NetworkLatency = NetworkLatency;
    }

    /**
     * Get <p>视频时延，单位：ms</p> 
     * @return VideoLatency <p>视频时延，单位：ms</p>
     */
    public Long [] getVideoLatency() {
        return this.VideoLatency;
    }

    /**
     * Set <p>视频时延，单位：ms</p>
     * @param VideoLatency <p>视频时延，单位：ms</p>
     */
    public void setVideoLatency(Long [] VideoLatency) {
        this.VideoLatency = VideoLatency;
    }

    /**
     * Get <p>CPU使用率，单位：%</p> 
     * @return CpuUsed <p>CPU使用率，单位：%</p>
     */
    public Float [] getCpuUsed() {
        return this.CpuUsed;
    }

    /**
     * Set <p>CPU使用率，单位：%</p>
     * @param CpuUsed <p>CPU使用率，单位：%</p>
     */
    public void setCpuUsed(Float [] CpuUsed) {
        this.CpuUsed = CpuUsed;
    }

    /**
     * Get <p>内存使用率，单位：%</p> 
     * @return MemUsed <p>内存使用率，单位：%</p>
     */
    public Float [] getMemUsed() {
        return this.MemUsed;
    }

    /**
     * Set <p>内存使用率，单位：%</p>
     * @param MemUsed <p>内存使用率，单位：%</p>
     */
    public void setMemUsed(Float [] MemUsed) {
        this.MemUsed = MemUsed;
    }

    /**
     * Get <p>时间偏移量，单位：秒</p> 
     * @return TimeOffset <p>时间偏移量，单位：秒</p>
     */
    public Long [] getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set <p>时间偏移量，单位：秒</p>
     * @param TimeOffset <p>时间偏移量，单位：秒</p>
     */
    public void setTimeOffset(Long [] TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>设备ID</p> 
     * @return DeviceId <p>设备ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID</p>
     * @param DeviceId <p>设备ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>sdk版本</p> 
     * @return Ver <p>sdk版本</p>
     */
    public String getVer() {
        return this.Ver;
    }

    /**
     * Set <p>sdk版本</p>
     * @param Ver <p>sdk版本</p>
     */
    public void setVer(String Ver) {
        this.Ver = Ver;
    }

    /**
     * Get <p>模式(p2p/server)</p> 
     * @return SdkMode <p>模式(p2p/server)</p>
     */
    public String getSdkMode() {
        return this.SdkMode;
    }

    /**
     * Set <p>模式(p2p/server)</p>
     * @param SdkMode <p>模式(p2p/server)</p>
     */
    public void setSdkMode(String SdkMode) {
        this.SdkMode = SdkMode;
    }

    /**
     * Get <p>解码耗时，单位：ms</p> 
     * @return DecodeCost <p>解码耗时，单位：ms</p>
     */
    public Long [] getDecodeCost() {
        return this.DecodeCost;
    }

    /**
     * Set <p>解码耗时，单位：ms</p>
     * @param DecodeCost <p>解码耗时，单位：ms</p>
     */
    public void setDecodeCost(Long [] DecodeCost) {
        this.DecodeCost = DecodeCost;
    }

    /**
     * Get <p>【已废弃，使用RenderCost】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenderConst <p>【已废弃，使用RenderCost】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long [] getRenderConst() {
        return this.RenderConst;
    }

    /**
     * Set <p>【已废弃，使用RenderCost】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenderConst <p>【已废弃，使用RenderCost】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setRenderConst(Long [] RenderConst) {
        this.RenderConst = RenderConst;
    }

    /**
     * Get <p>卡顿k100</p> 
     * @return K100 <p>卡顿k100</p>
     */
    public Float [] getK100() {
        return this.K100;
    }

    /**
     * Set <p>卡顿k100</p>
     * @param K100 <p>卡顿k100</p>
     */
    public void setK100(Float [] K100) {
        this.K100 = K100;
    }

    /**
     * Get <p>卡顿k150</p> 
     * @return K150 <p>卡顿k150</p>
     */
    public Float [] getK150() {
        return this.K150;
    }

    /**
     * Set <p>卡顿k150</p>
     * @param K150 <p>卡顿k150</p>
     */
    public void setK150(Float [] K150) {
        this.K150 = K150;
    }

    /**
     * Get <p>nack请求数</p> 
     * @return NACK <p>nack请求数</p>
     */
    public Long [] getNACK() {
        return this.NACK;
    }

    /**
     * Set <p>nack请求数</p>
     * @param NACK <p>nack请求数</p>
     */
    public void setNACK(Long [] NACK) {
        this.NACK = NACK;
    }

    /**
     * Get <p>服务端调控码率,单位：kbps</p> 
     * @return BitRateEstimate <p>服务端调控码率,单位：kbps</p>
     */
    public Long [] getBitRateEstimate() {
        return this.BitRateEstimate;
    }

    /**
     * Set <p>服务端调控码率,单位：kbps</p>
     * @param BitRateEstimate <p>服务端调控码率,单位：kbps</p>
     */
    public void setBitRateEstimate(Long [] BitRateEstimate) {
        this.BitRateEstimate = BitRateEstimate;
    }

    /**
     * Get <p>宽度</p> 
     * @return Width <p>宽度</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>宽度</p>
     * @param Width <p>宽度</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>高度</p> 
     * @return Height <p>高度</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>高度</p>
     * @param Height <p>高度</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>编码耗时，单位：ms</p> 
     * @return EncodeCost <p>编码耗时，单位：ms</p>
     */
    public Long [] getEncodeCost() {
        return this.EncodeCost;
    }

    /**
     * Set <p>编码耗时，单位：ms</p>
     * @param EncodeCost <p>编码耗时，单位：ms</p>
     */
    public void setEncodeCost(Long [] EncodeCost) {
        this.EncodeCost = EncodeCost;
    }

    /**
     * Get <p>采集耗时，单位：ms</p> 
     * @return CaptureCost <p>采集耗时，单位：ms</p>
     */
    public Long [] getCaptureCost() {
        return this.CaptureCost;
    }

    /**
     * Set <p>采集耗时，单位：ms</p>
     * @param CaptureCost <p>采集耗时，单位：ms</p>
     */
    public void setCaptureCost(Long [] CaptureCost) {
        this.CaptureCost = CaptureCost;
    }

    /**
     * Get <p>渲染耗时，单位：ms</p> 
     * @return RenderCost <p>渲染耗时，单位：ms</p>
     */
    public Long [] getRenderCost() {
        return this.RenderCost;
    }

    /**
     * Set <p>渲染耗时，单位：ms</p>
     * @param RenderCost <p>渲染耗时，单位：ms</p>
     */
    public void setRenderCost(Long [] RenderCost) {
        this.RenderCost = RenderCost;
    }

    /**
     * Get <p>配置宽度</p> 
     * @return ConfigWidth <p>配置宽度</p>
     */
    public Long getConfigWidth() {
        return this.ConfigWidth;
    }

    /**
     * Set <p>配置宽度</p>
     * @param ConfigWidth <p>配置宽度</p>
     */
    public void setConfigWidth(Long ConfigWidth) {
        this.ConfigWidth = ConfigWidth;
    }

    /**
     * Get <p>配置高度</p> 
     * @return ConfigHeight <p>配置高度</p>
     */
    public Long getConfigHeight() {
        return this.ConfigHeight;
    }

    /**
     * Set <p>配置高度</p>
     * @param ConfigHeight <p>配置高度</p>
     */
    public void setConfigHeight(Long ConfigHeight) {
        this.ConfigHeight = ConfigHeight;
    }

    /**
     * Get <p>平均帧间隔</p> 
     * @return FrameDelta <p>平均帧间隔</p>
     */
    public Long [] getFrameDelta() {
        return this.FrameDelta;
    }

    /**
     * Set <p>平均帧间隔</p>
     * @param FrameDelta <p>平均帧间隔</p>
     */
    public void setFrameDelta(Long [] FrameDelta) {
        this.FrameDelta = FrameDelta;
    }

    /**
     * Get <p>最大帧间隔</p> 
     * @return MaxFrameDelta <p>最大帧间隔</p>
     */
    public Long [] getMaxFrameDelta() {
        return this.MaxFrameDelta;
    }

    /**
     * Set <p>最大帧间隔</p>
     * @param MaxFrameDelta <p>最大帧间隔</p>
     */
    public void setMaxFrameDelta(Long [] MaxFrameDelta) {
        this.MaxFrameDelta = MaxFrameDelta;
    }

    /**
     * Get <p>总码率评估,单位：kbps</p> 
     * @return TotalBitrateEstimate <p>总码率评估,单位：kbps</p>
     */
    public Long [] getTotalBitrateEstimate() {
        return this.TotalBitrateEstimate;
    }

    /**
     * Set <p>总码率评估,单位：kbps</p>
     * @param TotalBitrateEstimate <p>总码率评估,单位：kbps</p>
     */
    public void setTotalBitrateEstimate(Long [] TotalBitrateEstimate) {
        this.TotalBitrateEstimate = TotalBitrateEstimate;
    }

    /**
     * Get <p>帧间隔大于100ms的卡顿时长</p> 
     * @return Lag100Duration <p>帧间隔大于100ms的卡顿时长</p>
     */
    public Long [] getLag100Duration() {
        return this.Lag100Duration;
    }

    /**
     * Set <p>帧间隔大于100ms的卡顿时长</p>
     * @param Lag100Duration <p>帧间隔大于100ms的卡顿时长</p>
     */
    public void setLag100Duration(Long [] Lag100Duration) {
        this.Lag100Duration = Lag100Duration;
    }

    /**
     * Get <p>帧间隔大于150ms的卡顿时长</p> 
     * @return Lag150Duration <p>帧间隔大于150ms的卡顿时长</p>
     */
    public Long [] getLag150Duration() {
        return this.Lag150Duration;
    }

    /**
     * Set <p>帧间隔大于150ms的卡顿时长</p>
     * @param Lag150Duration <p>帧间隔大于150ms的卡顿时长</p>
     */
    public void setLag150Duration(Long [] Lag150Duration) {
        this.Lag150Duration = Lag150Duration;
    }

    /**
     * Get <p>是否开启多网：0 单网，1 多网</p> 
     * @return MultiMode <p>是否开启多网：0 单网，1 多网</p>
     */
    public Long getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>是否开启多网：0 单网，1 多网</p>
     * @param MultiMode <p>是否开启多网：0 单网，1 多网</p>
     */
    public void setMultiMode(Long MultiMode) {
        this.MultiMode = MultiMode;
    }

    /**
     * Get <p>多网卡信息</p> 
     * @return MultiNet <p>多网卡信息</p>
     */
    public MultiNet [] getMultiNet() {
        return this.MultiNet;
    }

    /**
     * Set <p>多网卡信息</p>
     * @param MultiNet <p>多网卡信息</p>
     */
    public void setMultiNet(MultiNet [] MultiNet) {
        this.MultiNet = MultiNet;
    }

    /**
     * Get <p>现场设备和远端设备消息通道往返延迟</p><p>单位：毫秒ms</p> 
     * @return ControlLatency <p>现场设备和远端设备消息通道往返延迟</p><p>单位：毫秒ms</p>
     */
    public Long [] getControlLatency() {
        return this.ControlLatency;
    }

    /**
     * Set <p>现场设备和远端设备消息通道往返延迟</p><p>单位：毫秒ms</p>
     * @param ControlLatency <p>现场设备和远端设备消息通道往返延迟</p><p>单位：毫秒ms</p>
     */
    public void setControlLatency(Long [] ControlLatency) {
        this.ControlLatency = ControlLatency;
    }

    public SessionDeviceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionDeviceDetail(SessionDeviceDetail source) {
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Rate != null) {
            this.Rate = new Long[source.Rate.length];
            for (int i = 0; i < source.Rate.length; i++) {
                this.Rate[i] = new Long(source.Rate[i]);
            }
        }
        if (source.Fps != null) {
            this.Fps = new Long[source.Fps.length];
            for (int i = 0; i < source.Fps.length; i++) {
                this.Fps[i] = new Long(source.Fps[i]);
            }
        }
        if (source.Lost != null) {
            this.Lost = new Float[source.Lost.length];
            for (int i = 0; i < source.Lost.length; i++) {
                this.Lost[i] = new Float(source.Lost[i]);
            }
        }
        if (source.NetworkLatency != null) {
            this.NetworkLatency = new Long[source.NetworkLatency.length];
            for (int i = 0; i < source.NetworkLatency.length; i++) {
                this.NetworkLatency[i] = new Long(source.NetworkLatency[i]);
            }
        }
        if (source.VideoLatency != null) {
            this.VideoLatency = new Long[source.VideoLatency.length];
            for (int i = 0; i < source.VideoLatency.length; i++) {
                this.VideoLatency[i] = new Long(source.VideoLatency[i]);
            }
        }
        if (source.CpuUsed != null) {
            this.CpuUsed = new Float[source.CpuUsed.length];
            for (int i = 0; i < source.CpuUsed.length; i++) {
                this.CpuUsed[i] = new Float(source.CpuUsed[i]);
            }
        }
        if (source.MemUsed != null) {
            this.MemUsed = new Float[source.MemUsed.length];
            for (int i = 0; i < source.MemUsed.length; i++) {
                this.MemUsed[i] = new Float(source.MemUsed[i]);
            }
        }
        if (source.TimeOffset != null) {
            this.TimeOffset = new Long[source.TimeOffset.length];
            for (int i = 0; i < source.TimeOffset.length; i++) {
                this.TimeOffset[i] = new Long(source.TimeOffset[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Ver != null) {
            this.Ver = new String(source.Ver);
        }
        if (source.SdkMode != null) {
            this.SdkMode = new String(source.SdkMode);
        }
        if (source.DecodeCost != null) {
            this.DecodeCost = new Long[source.DecodeCost.length];
            for (int i = 0; i < source.DecodeCost.length; i++) {
                this.DecodeCost[i] = new Long(source.DecodeCost[i]);
            }
        }
        if (source.RenderConst != null) {
            this.RenderConst = new Long[source.RenderConst.length];
            for (int i = 0; i < source.RenderConst.length; i++) {
                this.RenderConst[i] = new Long(source.RenderConst[i]);
            }
        }
        if (source.K100 != null) {
            this.K100 = new Float[source.K100.length];
            for (int i = 0; i < source.K100.length; i++) {
                this.K100[i] = new Float(source.K100[i]);
            }
        }
        if (source.K150 != null) {
            this.K150 = new Float[source.K150.length];
            for (int i = 0; i < source.K150.length; i++) {
                this.K150[i] = new Float(source.K150[i]);
            }
        }
        if (source.NACK != null) {
            this.NACK = new Long[source.NACK.length];
            for (int i = 0; i < source.NACK.length; i++) {
                this.NACK[i] = new Long(source.NACK[i]);
            }
        }
        if (source.BitRateEstimate != null) {
            this.BitRateEstimate = new Long[source.BitRateEstimate.length];
            for (int i = 0; i < source.BitRateEstimate.length; i++) {
                this.BitRateEstimate[i] = new Long(source.BitRateEstimate[i]);
            }
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.EncodeCost != null) {
            this.EncodeCost = new Long[source.EncodeCost.length];
            for (int i = 0; i < source.EncodeCost.length; i++) {
                this.EncodeCost[i] = new Long(source.EncodeCost[i]);
            }
        }
        if (source.CaptureCost != null) {
            this.CaptureCost = new Long[source.CaptureCost.length];
            for (int i = 0; i < source.CaptureCost.length; i++) {
                this.CaptureCost[i] = new Long(source.CaptureCost[i]);
            }
        }
        if (source.RenderCost != null) {
            this.RenderCost = new Long[source.RenderCost.length];
            for (int i = 0; i < source.RenderCost.length; i++) {
                this.RenderCost[i] = new Long(source.RenderCost[i]);
            }
        }
        if (source.ConfigWidth != null) {
            this.ConfigWidth = new Long(source.ConfigWidth);
        }
        if (source.ConfigHeight != null) {
            this.ConfigHeight = new Long(source.ConfigHeight);
        }
        if (source.FrameDelta != null) {
            this.FrameDelta = new Long[source.FrameDelta.length];
            for (int i = 0; i < source.FrameDelta.length; i++) {
                this.FrameDelta[i] = new Long(source.FrameDelta[i]);
            }
        }
        if (source.MaxFrameDelta != null) {
            this.MaxFrameDelta = new Long[source.MaxFrameDelta.length];
            for (int i = 0; i < source.MaxFrameDelta.length; i++) {
                this.MaxFrameDelta[i] = new Long(source.MaxFrameDelta[i]);
            }
        }
        if (source.TotalBitrateEstimate != null) {
            this.TotalBitrateEstimate = new Long[source.TotalBitrateEstimate.length];
            for (int i = 0; i < source.TotalBitrateEstimate.length; i++) {
                this.TotalBitrateEstimate[i] = new Long(source.TotalBitrateEstimate[i]);
            }
        }
        if (source.Lag100Duration != null) {
            this.Lag100Duration = new Long[source.Lag100Duration.length];
            for (int i = 0; i < source.Lag100Duration.length; i++) {
                this.Lag100Duration[i] = new Long(source.Lag100Duration[i]);
            }
        }
        if (source.Lag150Duration != null) {
            this.Lag150Duration = new Long[source.Lag150Duration.length];
            for (int i = 0; i < source.Lag150Duration.length; i++) {
                this.Lag150Duration[i] = new Long(source.Lag150Duration[i]);
            }
        }
        if (source.MultiMode != null) {
            this.MultiMode = new Long(source.MultiMode);
        }
        if (source.MultiNet != null) {
            this.MultiNet = new MultiNet[source.MultiNet.length];
            for (int i = 0; i < source.MultiNet.length; i++) {
                this.MultiNet[i] = new MultiNet(source.MultiNet[i]);
            }
        }
        if (source.ControlLatency != null) {
            this.ControlLatency = new Long[source.ControlLatency.length];
            for (int i = 0; i < source.ControlLatency.length; i++) {
                this.ControlLatency[i] = new Long(source.ControlLatency[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArraySimple(map, prefix + "Rate.", this.Rate);
        this.setParamArraySimple(map, prefix + "Fps.", this.Fps);
        this.setParamArraySimple(map, prefix + "Lost.", this.Lost);
        this.setParamArraySimple(map, prefix + "NetworkLatency.", this.NetworkLatency);
        this.setParamArraySimple(map, prefix + "VideoLatency.", this.VideoLatency);
        this.setParamArraySimple(map, prefix + "CpuUsed.", this.CpuUsed);
        this.setParamArraySimple(map, prefix + "MemUsed.", this.MemUsed);
        this.setParamArraySimple(map, prefix + "TimeOffset.", this.TimeOffset);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Ver", this.Ver);
        this.setParamSimple(map, prefix + "SdkMode", this.SdkMode);
        this.setParamArraySimple(map, prefix + "DecodeCost.", this.DecodeCost);
        this.setParamArraySimple(map, prefix + "RenderConst.", this.RenderConst);
        this.setParamArraySimple(map, prefix + "K100.", this.K100);
        this.setParamArraySimple(map, prefix + "K150.", this.K150);
        this.setParamArraySimple(map, prefix + "NACK.", this.NACK);
        this.setParamArraySimple(map, prefix + "BitRateEstimate.", this.BitRateEstimate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArraySimple(map, prefix + "EncodeCost.", this.EncodeCost);
        this.setParamArraySimple(map, prefix + "CaptureCost.", this.CaptureCost);
        this.setParamArraySimple(map, prefix + "RenderCost.", this.RenderCost);
        this.setParamSimple(map, prefix + "ConfigWidth", this.ConfigWidth);
        this.setParamSimple(map, prefix + "ConfigHeight", this.ConfigHeight);
        this.setParamArraySimple(map, prefix + "FrameDelta.", this.FrameDelta);
        this.setParamArraySimple(map, prefix + "MaxFrameDelta.", this.MaxFrameDelta);
        this.setParamArraySimple(map, prefix + "TotalBitrateEstimate.", this.TotalBitrateEstimate);
        this.setParamArraySimple(map, prefix + "Lag100Duration.", this.Lag100Duration);
        this.setParamArraySimple(map, prefix + "Lag150Duration.", this.Lag150Duration);
        this.setParamSimple(map, prefix + "MultiMode", this.MultiMode);
        this.setParamArrayObj(map, prefix + "MultiNet.", this.MultiNet);
        this.setParamArraySimple(map, prefix + "ControlLatency.", this.ControlLatency);

    }
}

