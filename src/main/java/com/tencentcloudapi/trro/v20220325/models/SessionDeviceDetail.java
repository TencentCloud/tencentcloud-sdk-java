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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionDeviceDetail extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ver")
    @Expose
    private String Ver;

    /**
    * 模式(p2p/server)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SdkMode")
    @Expose
    private String SdkMode;

    /**
    * 解码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DecodeCost")
    @Expose
    private Long [] DecodeCost;

    /**
    * 渲染耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenderConst")
    @Expose
    private Long [] RenderConst;

    /**
    * 卡顿k100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K100")
    @Expose
    private Float [] K100;

    /**
    * 卡顿k150
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K150")
    @Expose
    private Float [] K150;

    /**
    * nack请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NACK")
    @Expose
    private Long [] NACK;

    /**
    * 服务端调控码率,单位：kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BitRateEstimate")
    @Expose
    private Long [] BitRateEstimate;

    /**
    * 宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 编码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncodeCost")
    @Expose
    private Long [] EncodeCost;

    /**
    * 采集耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaptureCost")
    @Expose
    private Long [] CaptureCost;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ver sdk版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVer() {
        return this.Ver;
    }

    /**
     * Set sdk版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ver sdk版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVer(String Ver) {
        this.Ver = Ver;
    }

    /**
     * Get 模式(p2p/server)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SdkMode 模式(p2p/server)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSdkMode() {
        return this.SdkMode;
    }

    /**
     * Set 模式(p2p/server)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SdkMode 模式(p2p/server)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSdkMode(String SdkMode) {
        this.SdkMode = SdkMode;
    }

    /**
     * Get 解码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DecodeCost 解码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDecodeCost() {
        return this.DecodeCost;
    }

    /**
     * Set 解码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param DecodeCost 解码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDecodeCost(Long [] DecodeCost) {
        this.DecodeCost = DecodeCost;
    }

    /**
     * Get 渲染耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenderConst 渲染耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRenderConst() {
        return this.RenderConst;
    }

    /**
     * Set 渲染耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenderConst 渲染耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenderConst(Long [] RenderConst) {
        this.RenderConst = RenderConst;
    }

    /**
     * Get 卡顿k100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K100 卡顿k100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getK100() {
        return this.K100;
    }

    /**
     * Set 卡顿k100
注意：此字段可能返回 null，表示取不到有效值。
     * @param K100 卡顿k100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK100(Float [] K100) {
        this.K100 = K100;
    }

    /**
     * Get 卡顿k150
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K150 卡顿k150
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getK150() {
        return this.K150;
    }

    /**
     * Set 卡顿k150
注意：此字段可能返回 null，表示取不到有效值。
     * @param K150 卡顿k150
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK150(Float [] K150) {
        this.K150 = K150;
    }

    /**
     * Get nack请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NACK nack请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getNACK() {
        return this.NACK;
    }

    /**
     * Set nack请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NACK nack请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNACK(Long [] NACK) {
        this.NACK = NACK;
    }

    /**
     * Get 服务端调控码率,单位：kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BitRateEstimate 服务端调控码率,单位：kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getBitRateEstimate() {
        return this.BitRateEstimate;
    }

    /**
     * Set 服务端调控码率,单位：kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param BitRateEstimate 服务端调控码率,单位：kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitRateEstimate(Long [] BitRateEstimate) {
        this.BitRateEstimate = BitRateEstimate;
    }

    /**
     * Get 宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 编码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncodeCost 编码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getEncodeCost() {
        return this.EncodeCost;
    }

    /**
     * Set 编码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncodeCost 编码耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncodeCost(Long [] EncodeCost) {
        this.EncodeCost = EncodeCost;
    }

    /**
     * Get 采集耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaptureCost 采集耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCaptureCost() {
        return this.CaptureCost;
    }

    /**
     * Set 采集耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaptureCost 采集耗时，单位：ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaptureCost(Long [] CaptureCost) {
        this.CaptureCost = CaptureCost;
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

    }
}

