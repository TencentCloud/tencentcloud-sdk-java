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

    }
}

