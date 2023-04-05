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

public class RecentSessionInfo extends AbstractModel{

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 远端设备ID
    */
    @SerializedName("RemoteDeviceId")
    @Expose
    private String RemoteDeviceId;

    /**
    * 现场设备ID
    */
    @SerializedName("FieldDeviceId")
    @Expose
    private String FieldDeviceId;

    /**
    * 分辨率
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 会话开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 最后更新时间
    */
    @SerializedName("LatestUpdateTime")
    @Expose
    private Long LatestUpdateTime;

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
     * Get 远端设备ID 
     * @return RemoteDeviceId 远端设备ID
     */
    public String getRemoteDeviceId() {
        return this.RemoteDeviceId;
    }

    /**
     * Set 远端设备ID
     * @param RemoteDeviceId 远端设备ID
     */
    public void setRemoteDeviceId(String RemoteDeviceId) {
        this.RemoteDeviceId = RemoteDeviceId;
    }

    /**
     * Get 现场设备ID 
     * @return FieldDeviceId 现场设备ID
     */
    public String getFieldDeviceId() {
        return this.FieldDeviceId;
    }

    /**
     * Set 现场设备ID
     * @param FieldDeviceId 现场设备ID
     */
    public void setFieldDeviceId(String FieldDeviceId) {
        this.FieldDeviceId = FieldDeviceId;
    }

    /**
     * Get 分辨率 
     * @return Resolution 分辨率
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率
     * @param Resolution 分辨率
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 会话开始时间 
     * @return StartTime 会话开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 会话开始时间
     * @param StartTime 会话开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 最后更新时间 
     * @return LatestUpdateTime 最后更新时间
     */
    public Long getLatestUpdateTime() {
        return this.LatestUpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param LatestUpdateTime 最后更新时间
     */
    public void setLatestUpdateTime(Long LatestUpdateTime) {
        this.LatestUpdateTime = LatestUpdateTime;
    }

    public RecentSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecentSessionInfo(RecentSessionInfo source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RemoteDeviceId != null) {
            this.RemoteDeviceId = new String(source.RemoteDeviceId);
        }
        if (source.FieldDeviceId != null) {
            this.FieldDeviceId = new String(source.FieldDeviceId);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.LatestUpdateTime != null) {
            this.LatestUpdateTime = new Long(source.LatestUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RemoteDeviceId", this.RemoteDeviceId);
        this.setParamSimple(map, prefix + "FieldDeviceId", this.FieldDeviceId);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "LatestUpdateTime", this.LatestUpdateTime);

    }
}

