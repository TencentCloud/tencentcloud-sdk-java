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

public class SessionIntervalStatistic extends AbstractModel{

    /**
    * 活跃现场设备数
    */
    @SerializedName("ActiveFieldDeviceNum")
    @Expose
    private Long ActiveFieldDeviceNum;

    /**
    * 活跃远端设备数
    */
    @SerializedName("ActiveRemoteDeviceNum")
    @Expose
    private Long ActiveRemoteDeviceNum;

    /**
    * 会话数量
    */
    @SerializedName("SessionNum")
    @Expose
    private Long SessionNum;

    /**
    * 会话时长，单位：分钟
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * 时间戳，单位：秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 时间戳，单位：秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 优良会话占比，单位：%
    */
    @SerializedName("NotBadSessionRatio")
    @Expose
    private Long NotBadSessionRatio;

    /**
     * Get 活跃现场设备数 
     * @return ActiveFieldDeviceNum 活跃现场设备数
     */
    public Long getActiveFieldDeviceNum() {
        return this.ActiveFieldDeviceNum;
    }

    /**
     * Set 活跃现场设备数
     * @param ActiveFieldDeviceNum 活跃现场设备数
     */
    public void setActiveFieldDeviceNum(Long ActiveFieldDeviceNum) {
        this.ActiveFieldDeviceNum = ActiveFieldDeviceNum;
    }

    /**
     * Get 活跃远端设备数 
     * @return ActiveRemoteDeviceNum 活跃远端设备数
     */
    public Long getActiveRemoteDeviceNum() {
        return this.ActiveRemoteDeviceNum;
    }

    /**
     * Set 活跃远端设备数
     * @param ActiveRemoteDeviceNum 活跃远端设备数
     */
    public void setActiveRemoteDeviceNum(Long ActiveRemoteDeviceNum) {
        this.ActiveRemoteDeviceNum = ActiveRemoteDeviceNum;
    }

    /**
     * Get 会话数量 
     * @return SessionNum 会话数量
     */
    public Long getSessionNum() {
        return this.SessionNum;
    }

    /**
     * Set 会话数量
     * @param SessionNum 会话数量
     */
    public void setSessionNum(Long SessionNum) {
        this.SessionNum = SessionNum;
    }

    /**
     * Get 会话时长，单位：分钟 
     * @return TotalDuration 会话时长，单位：分钟
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 会话时长，单位：分钟
     * @param TotalDuration 会话时长，单位：分钟
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get 时间戳，单位：秒 
     * @return StartTime 时间戳，单位：秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 时间戳，单位：秒
     * @param StartTime 时间戳，单位：秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 时间戳，单位：秒 
     * @return EndTime 时间戳，单位：秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 时间戳，单位：秒
     * @param EndTime 时间戳，单位：秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 优良会话占比，单位：% 
     * @return NotBadSessionRatio 优良会话占比，单位：%
     */
    public Long getNotBadSessionRatio() {
        return this.NotBadSessionRatio;
    }

    /**
     * Set 优良会话占比，单位：%
     * @param NotBadSessionRatio 优良会话占比，单位：%
     */
    public void setNotBadSessionRatio(Long NotBadSessionRatio) {
        this.NotBadSessionRatio = NotBadSessionRatio;
    }

    public SessionIntervalStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionIntervalStatistic(SessionIntervalStatistic source) {
        if (source.ActiveFieldDeviceNum != null) {
            this.ActiveFieldDeviceNum = new Long(source.ActiveFieldDeviceNum);
        }
        if (source.ActiveRemoteDeviceNum != null) {
            this.ActiveRemoteDeviceNum = new Long(source.ActiveRemoteDeviceNum);
        }
        if (source.SessionNum != null) {
            this.SessionNum = new Long(source.SessionNum);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Long(source.TotalDuration);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NotBadSessionRatio != null) {
            this.NotBadSessionRatio = new Long(source.NotBadSessionRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActiveFieldDeviceNum", this.ActiveFieldDeviceNum);
        this.setParamSimple(map, prefix + "ActiveRemoteDeviceNum", this.ActiveRemoteDeviceNum);
        this.setParamSimple(map, prefix + "SessionNum", this.SessionNum);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NotBadSessionRatio", this.NotBadSessionRatio);

    }
}

