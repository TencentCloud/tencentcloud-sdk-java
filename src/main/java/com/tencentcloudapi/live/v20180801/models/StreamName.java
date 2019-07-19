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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamName  extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流开始时间。
UTC格式时间，
例如：2019-01-07T12:00:00Z。
    */
    @SerializedName("StreamStartTime")
    @Expose
    private String StreamStartTime;

    /**
    * 推流结束时间。
UTC格式时间，
例如：2019-01-07T15:00:00Z。
    */
    @SerializedName("StreamEndTime")
    @Expose
    private String StreamEndTime;

    /**
    * 停止原因。
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * 推流持续时长，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Integer Duration;

    /**
    * 主播IP。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 分辨率。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * 获取流名称。
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取应用名称。
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取推流域名。
     * @return DomainName 推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置推流域名。
     * @param DomainName 推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取推流开始时间。
UTC格式时间，
例如：2019-01-07T12:00:00Z。
     * @return StreamStartTime 推流开始时间。
UTC格式时间，
例如：2019-01-07T12:00:00Z。
     */
    public String getStreamStartTime() {
        return this.StreamStartTime;
    }

    /**
     * 设置推流开始时间。
UTC格式时间，
例如：2019-01-07T12:00:00Z。
     * @param StreamStartTime 推流开始时间。
UTC格式时间，
例如：2019-01-07T12:00:00Z。
     */
    public void setStreamStartTime(String StreamStartTime) {
        this.StreamStartTime = StreamStartTime;
    }

    /**
     * 获取推流结束时间。
UTC格式时间，
例如：2019-01-07T15:00:00Z。
     * @return StreamEndTime 推流结束时间。
UTC格式时间，
例如：2019-01-07T15:00:00Z。
     */
    public String getStreamEndTime() {
        return this.StreamEndTime;
    }

    /**
     * 设置推流结束时间。
UTC格式时间，
例如：2019-01-07T15:00:00Z。
     * @param StreamEndTime 推流结束时间。
UTC格式时间，
例如：2019-01-07T15:00:00Z。
     */
    public void setStreamEndTime(String StreamEndTime) {
        this.StreamEndTime = StreamEndTime;
    }

    /**
     * 获取停止原因。
     * @return StopReason 停止原因。
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * 设置停止原因。
     * @param StopReason 停止原因。
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * 获取推流持续时长，单位：秒。
     * @return Duration 推流持续时长，单位：秒。
     */
    public Integer getDuration() {
        return this.Duration;
    }

    /**
     * 设置推流持续时长，单位：秒。
     * @param Duration 推流持续时长，单位：秒。
     */
    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取主播IP。
     * @return ClientIp 主播IP。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * 设置主播IP。
     * @param ClientIp 主播IP。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * 获取分辨率。
     * @return Resolution 分辨率。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * 设置分辨率。
     * @param Resolution 分辨率。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamStartTime", this.StreamStartTime);
        this.setParamSimple(map, prefix + "StreamEndTime", this.StreamEndTime);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

