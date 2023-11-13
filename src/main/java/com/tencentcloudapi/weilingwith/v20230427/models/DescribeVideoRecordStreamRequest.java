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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoRecordStreamRequest extends AbstractModel {

    /**
    * 设备唯一标识
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 枚举如下：
flvsh
rtmp
hls
webrtc
raw (视频原始帧)
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 开始时间（精确到毫秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间（精确到毫秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 倍速 0.5、1、2、4
    */
    @SerializedName("PlayBackRate")
    @Expose
    private Float PlayBackRate;

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 流的唯一标识，播放链接尾缀
    */
    @SerializedName("Stream")
    @Expose
    private String Stream;

    /**
    * 公有云私有化项目传0或者不传；混合云项目一般传空间id
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
     * Get 设备唯一标识 
     * @return WID 设备唯一标识
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备唯一标识
     * @param WID 设备唯一标识
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 枚举如下：
flvsh
rtmp
hls
webrtc
raw (视频原始帧) 
     * @return Protocol 枚举如下：
flvsh
rtmp
hls
webrtc
raw (视频原始帧)
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 枚举如下：
flvsh
rtmp
hls
webrtc
raw (视频原始帧)
     * @param Protocol 枚举如下：
flvsh
rtmp
hls
webrtc
raw (视频原始帧)
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 开始时间（精确到毫秒） 
     * @return StartTime 开始时间（精确到毫秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（精确到毫秒）
     * @param StartTime 开始时间（精确到毫秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（精确到毫秒） 
     * @return EndTime 结束时间（精确到毫秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（精确到毫秒）
     * @param EndTime 结束时间（精确到毫秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 倍速 0.5、1、2、4 
     * @return PlayBackRate 倍速 0.5、1、2、4
     */
    public Float getPlayBackRate() {
        return this.PlayBackRate;
    }

    /**
     * Set 倍速 0.5、1、2、4
     * @param PlayBackRate 倍速 0.5、1、2、4
     */
    public void setPlayBackRate(Float PlayBackRate) {
        this.PlayBackRate = PlayBackRate;
    }

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 流的唯一标识，播放链接尾缀 
     * @return Stream 流的唯一标识，播放链接尾缀
     */
    public String getStream() {
        return this.Stream;
    }

    /**
     * Set 流的唯一标识，播放链接尾缀
     * @param Stream 流的唯一标识，播放链接尾缀
     */
    public void setStream(String Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 公有云私有化项目传0或者不传；混合云项目一般传空间id 
     * @return Env 公有云私有化项目传0或者不传；混合云项目一般传空间id
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 公有云私有化项目传0或者不传；混合云项目一般传空间id
     * @param Env 公有云私有化项目传0或者不传；混合云项目一般传空间id
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    public DescribeVideoRecordStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoRecordStreamRequest(DescribeVideoRecordStreamRequest source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.PlayBackRate != null) {
            this.PlayBackRate = new Float(source.PlayBackRate);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.Stream != null) {
            this.Stream = new String(source.Stream);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PlayBackRate", this.PlayBackRate);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Env", this.Env);

    }
}

