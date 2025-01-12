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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionDeviceDetail extends AbstractModel {

    /**
    * 设备类型：field或remote
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 起始点位时间，单位：秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束点位时间，单位：秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 码率，单位：kbps
    */
    @SerializedName("Rate")
    @Expose
    private Long [] Rate;

    /**
    * 帧率
    */
    @SerializedName("Fps")
    @Expose
    private Long [] Fps;

    /**
    * 丢包率，单位：%
    */
    @SerializedName("Lost")
    @Expose
    private Float [] Lost;

    /**
    * 网络时延，单位：ms
    */
    @SerializedName("NetworkLatency")
    @Expose
    private Long [] NetworkLatency;

    /**
    * 视频时延，单位：ms
    */
    @SerializedName("VideoLatency")
    @Expose
    private Long [] VideoLatency;

    /**
    * CPU使用率，单位：%
    */
    @SerializedName("CpuUsed")
    @Expose
    private Float [] CpuUsed;

    /**
    * 内存使用率，单位：%
    */
    @SerializedName("MemUsed")
    @Expose
    private Float [] MemUsed;

    /**
    * 时间偏移量，单位：秒
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long [] TimeOffset;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * sdk版本
    */
    @SerializedName("Ver")
    @Expose
    private String Ver;

    /**
    * 模式(p2p/server)
    */
    @SerializedName("SdkMode")
    @Expose
    private String SdkMode;

    /**
    * 解码耗时，单位：ms
    */
    @SerializedName("DecodeCost")
    @Expose
    private Long [] DecodeCost;

    /**
    * 【已废弃，使用RenderCost】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenderConst")
    @Expose
    private Long [] RenderConst;

    /**
    * 卡顿k100
    */
    @SerializedName("K100")
    @Expose
    private Float [] K100;

    /**
    * 卡顿k150
    */
    @SerializedName("K150")
    @Expose
    private Float [] K150;

    /**
    * nack请求数
    */
    @SerializedName("NACK")
    @Expose
    private Long [] NACK;

    /**
    * 服务端调控码率,单位：kbps
    */
    @SerializedName("BitRateEstimate")
    @Expose
    private Long [] BitRateEstimate;

    /**
    * 宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 编码耗时，单位：ms
    */
    @SerializedName("EncodeCost")
    @Expose
    private Long [] EncodeCost;

    /**
    * 采集耗时，单位：ms
    */
    @SerializedName("CaptureCost")
    @Expose
    private Long [] CaptureCost;

    /**
    * 渲染耗时，单位：ms
    */
    @SerializedName("RenderCost")
    @Expose
    private Long [] RenderCost;

    /**
    * 配置宽度
    */
    @SerializedName("ConfigWidth")
    @Expose
    private Long ConfigWidth;

    /**
    * 配置高度
    */
    @SerializedName("ConfigHeight")
    @Expose
    private Long ConfigHeight;

    /**
    * 平均帧间隔
    */
    @SerializedName("FrameDelta")
    @Expose
    private Long [] FrameDelta;

    /**
    * 最大帧间隔
    */
    @SerializedName("MaxFrameDelta")
    @Expose
    private Long [] MaxFrameDelta;

    /**
    * 总码率评估,单位：kbps
    */
    @SerializedName("TotalBitrateEstimate")
    @Expose
    private Long [] TotalBitrateEstimate;

    /**
    * 帧间隔大于100ms的卡顿时长
    */
    @SerializedName("Lag100Duration")
    @Expose
    private Long [] Lag100Duration;

    /**
    * 帧间隔大于150ms的卡顿时长
    */
    @SerializedName("Lag150Duration")
    @Expose
    private Long [] Lag150Duration;

    /**
    * 是否开启多网：0 单网，1 多网
    */
    @SerializedName("MultiMode")
    @Expose
    private Long MultiMode;

    /**
    * 多网卡信息
    */
    @SerializedName("MultiNet")
    @Expose
    private MultiNet [] MultiNet;

    /**
     * Get 设备类型：field或remote 
     * @return DeviceType 设备类型：field或remote
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型：field或remote
     * @param DeviceType 设备类型：field或remote
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 起始点位时间，单位：秒 
     * @return StartTime 起始点位时间，单位：秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始点位时间，单位：秒
     * @param StartTime 起始点位时间，单位：秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束点位时间，单位：秒 
     * @return EndTime 结束点位时间，单位：秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束点位时间，单位：秒
     * @param EndTime 结束点位时间，单位：秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 会话ID 
     * @return SessionId 会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
     * @param SessionId 会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 码率，单位：kbps 
     * @return Rate 码率，单位：kbps
     */
    public Long [] getRate() {
        return this.Rate;
    }

    /**
     * Set 码率，单位：kbps
     * @param Rate 码率，单位：kbps
     */
    public void setRate(Long [] Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 帧率 
     * @return Fps 帧率
     */
    public Long [] getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率
     * @param Fps 帧率
     */
    public void setFps(Long [] Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 丢包率，单位：% 
     * @return Lost 丢包率，单位：%
     */
    public Float [] getLost() {
        return this.Lost;
    }

    /**
     * Set 丢包率，单位：%
     * @param Lost 丢包率，单位：%
     */
    public void setLost(Float [] Lost) {
        this.Lost = Lost;
    }

    /**
     * Get 网络时延，单位：ms 
     * @return NetworkLatency 网络时延，单位：ms
     */
    public Long [] getNetworkLatency() {
        return this.NetworkLatency;
    }

    /**
     * Set 网络时延，单位：ms
     * @param NetworkLatency 网络时延，单位：ms
     */
    public void setNetworkLatency(Long [] NetworkLatency) {
        this.NetworkLatency = NetworkLatency;
    }

    /**
     * Get 视频时延，单位：ms 
     * @return VideoLatency 视频时延，单位：ms
     */
    public Long [] getVideoLatency() {
        return this.VideoLatency;
    }

    /**
     * Set 视频时延，单位：ms
     * @param VideoLatency 视频时延，单位：ms
     */
    public void setVideoLatency(Long [] VideoLatency) {
        this.VideoLatency = VideoLatency;
    }

    /**
     * Get CPU使用率，单位：% 
     * @return CpuUsed CPU使用率，单位：%
     */
    public Float [] getCpuUsed() {
        return this.CpuUsed;
    }

    /**
     * Set CPU使用率，单位：%
     * @param CpuUsed CPU使用率，单位：%
     */
    public void setCpuUsed(Float [] CpuUsed) {
        this.CpuUsed = CpuUsed;
    }

    /**
     * Get 内存使用率，单位：% 
     * @return MemUsed 内存使用率，单位：%
     */
    public Float [] getMemUsed() {
        return this.MemUsed;
    }

    /**
     * Set 内存使用率，单位：%
     * @param MemUsed 内存使用率，单位：%
     */
    public void setMemUsed(Float [] MemUsed) {
        this.MemUsed = MemUsed;
    }

    /**
     * Get 时间偏移量，单位：秒 
     * @return TimeOffset 时间偏移量，单位：秒
     */
    public Long [] getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set 时间偏移量，单位：秒
     * @param TimeOffset 时间偏移量，单位：秒
     */
    public void setTimeOffset(Long [] TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get sdk版本 
     * @return Ver sdk版本
     */
    public String getVer() {
        return this.Ver;
    }

    /**
     * Set sdk版本
     * @param Ver sdk版本
     */
    public void setVer(String Ver) {
        this.Ver = Ver;
    }

    /**
     * Get 模式(p2p/server) 
     * @return SdkMode 模式(p2p/server)
     */
    public String getSdkMode() {
        return this.SdkMode;
    }

    /**
     * Set 模式(p2p/server)
     * @param SdkMode 模式(p2p/server)
     */
    public void setSdkMode(String SdkMode) {
        this.SdkMode = SdkMode;
    }

    /**
     * Get 解码耗时，单位：ms 
     * @return DecodeCost 解码耗时，单位：ms
     */
    public Long [] getDecodeCost() {
        return this.DecodeCost;
    }

    /**
     * Set 解码耗时，单位：ms
     * @param DecodeCost 解码耗时，单位：ms
     */
    public void setDecodeCost(Long [] DecodeCost) {
        this.DecodeCost = DecodeCost;
    }

    /**
     * Get 【已废弃，使用RenderCost】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenderConst 【已废弃，使用RenderCost】
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long [] getRenderConst() {
        return this.RenderConst;
    }

    /**
     * Set 【已废弃，使用RenderCost】
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenderConst 【已废弃，使用RenderCost】
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setRenderConst(Long [] RenderConst) {
        this.RenderConst = RenderConst;
    }

    /**
     * Get 卡顿k100 
     * @return K100 卡顿k100
     */
    public Float [] getK100() {
        return this.K100;
    }

    /**
     * Set 卡顿k100
     * @param K100 卡顿k100
     */
    public void setK100(Float [] K100) {
        this.K100 = K100;
    }

    /**
     * Get 卡顿k150 
     * @return K150 卡顿k150
     */
    public Float [] getK150() {
        return this.K150;
    }

    /**
     * Set 卡顿k150
     * @param K150 卡顿k150
     */
    public void setK150(Float [] K150) {
        this.K150 = K150;
    }

    /**
     * Get nack请求数 
     * @return NACK nack请求数
     */
    public Long [] getNACK() {
        return this.NACK;
    }

    /**
     * Set nack请求数
     * @param NACK nack请求数
     */
    public void setNACK(Long [] NACK) {
        this.NACK = NACK;
    }

    /**
     * Get 服务端调控码率,单位：kbps 
     * @return BitRateEstimate 服务端调控码率,单位：kbps
     */
    public Long [] getBitRateEstimate() {
        return this.BitRateEstimate;
    }

    /**
     * Set 服务端调控码率,单位：kbps
     * @param BitRateEstimate 服务端调控码率,单位：kbps
     */
    public void setBitRateEstimate(Long [] BitRateEstimate) {
        this.BitRateEstimate = BitRateEstimate;
    }

    /**
     * Get 宽度 
     * @return Width 宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度
     * @param Width 宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高度 
     * @return Height 高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高度
     * @param Height 高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 编码耗时，单位：ms 
     * @return EncodeCost 编码耗时，单位：ms
     */
    public Long [] getEncodeCost() {
        return this.EncodeCost;
    }

    /**
     * Set 编码耗时，单位：ms
     * @param EncodeCost 编码耗时，单位：ms
     */
    public void setEncodeCost(Long [] EncodeCost) {
        this.EncodeCost = EncodeCost;
    }

    /**
     * Get 采集耗时，单位：ms 
     * @return CaptureCost 采集耗时，单位：ms
     */
    public Long [] getCaptureCost() {
        return this.CaptureCost;
    }

    /**
     * Set 采集耗时，单位：ms
     * @param CaptureCost 采集耗时，单位：ms
     */
    public void setCaptureCost(Long [] CaptureCost) {
        this.CaptureCost = CaptureCost;
    }

    /**
     * Get 渲染耗时，单位：ms 
     * @return RenderCost 渲染耗时，单位：ms
     */
    public Long [] getRenderCost() {
        return this.RenderCost;
    }

    /**
     * Set 渲染耗时，单位：ms
     * @param RenderCost 渲染耗时，单位：ms
     */
    public void setRenderCost(Long [] RenderCost) {
        this.RenderCost = RenderCost;
    }

    /**
     * Get 配置宽度 
     * @return ConfigWidth 配置宽度
     */
    public Long getConfigWidth() {
        return this.ConfigWidth;
    }

    /**
     * Set 配置宽度
     * @param ConfigWidth 配置宽度
     */
    public void setConfigWidth(Long ConfigWidth) {
        this.ConfigWidth = ConfigWidth;
    }

    /**
     * Get 配置高度 
     * @return ConfigHeight 配置高度
     */
    public Long getConfigHeight() {
        return this.ConfigHeight;
    }

    /**
     * Set 配置高度
     * @param ConfigHeight 配置高度
     */
    public void setConfigHeight(Long ConfigHeight) {
        this.ConfigHeight = ConfigHeight;
    }

    /**
     * Get 平均帧间隔 
     * @return FrameDelta 平均帧间隔
     */
    public Long [] getFrameDelta() {
        return this.FrameDelta;
    }

    /**
     * Set 平均帧间隔
     * @param FrameDelta 平均帧间隔
     */
    public void setFrameDelta(Long [] FrameDelta) {
        this.FrameDelta = FrameDelta;
    }

    /**
     * Get 最大帧间隔 
     * @return MaxFrameDelta 最大帧间隔
     */
    public Long [] getMaxFrameDelta() {
        return this.MaxFrameDelta;
    }

    /**
     * Set 最大帧间隔
     * @param MaxFrameDelta 最大帧间隔
     */
    public void setMaxFrameDelta(Long [] MaxFrameDelta) {
        this.MaxFrameDelta = MaxFrameDelta;
    }

    /**
     * Get 总码率评估,单位：kbps 
     * @return TotalBitrateEstimate 总码率评估,单位：kbps
     */
    public Long [] getTotalBitrateEstimate() {
        return this.TotalBitrateEstimate;
    }

    /**
     * Set 总码率评估,单位：kbps
     * @param TotalBitrateEstimate 总码率评估,单位：kbps
     */
    public void setTotalBitrateEstimate(Long [] TotalBitrateEstimate) {
        this.TotalBitrateEstimate = TotalBitrateEstimate;
    }

    /**
     * Get 帧间隔大于100ms的卡顿时长 
     * @return Lag100Duration 帧间隔大于100ms的卡顿时长
     */
    public Long [] getLag100Duration() {
        return this.Lag100Duration;
    }

    /**
     * Set 帧间隔大于100ms的卡顿时长
     * @param Lag100Duration 帧间隔大于100ms的卡顿时长
     */
    public void setLag100Duration(Long [] Lag100Duration) {
        this.Lag100Duration = Lag100Duration;
    }

    /**
     * Get 帧间隔大于150ms的卡顿时长 
     * @return Lag150Duration 帧间隔大于150ms的卡顿时长
     */
    public Long [] getLag150Duration() {
        return this.Lag150Duration;
    }

    /**
     * Set 帧间隔大于150ms的卡顿时长
     * @param Lag150Duration 帧间隔大于150ms的卡顿时长
     */
    public void setLag150Duration(Long [] Lag150Duration) {
        this.Lag150Duration = Lag150Duration;
    }

    /**
     * Get 是否开启多网：0 单网，1 多网 
     * @return MultiMode 是否开启多网：0 单网，1 多网
     */
    public Long getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set 是否开启多网：0 单网，1 多网
     * @param MultiMode 是否开启多网：0 单网，1 多网
     */
    public void setMultiMode(Long MultiMode) {
        this.MultiMode = MultiMode;
    }

    /**
     * Get 多网卡信息 
     * @return MultiNet 多网卡信息
     */
    public MultiNet [] getMultiNet() {
        return this.MultiNet;
    }

    /**
     * Set 多网卡信息
     * @param MultiNet 多网卡信息
     */
    public void setMultiNet(MultiNet [] MultiNet) {
        this.MultiNet = MultiNet;
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

    }
}

