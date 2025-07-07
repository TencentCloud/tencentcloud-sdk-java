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

public class SessionInfo extends AbstractModel {

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
    * 会话结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 通话质量：good|normal|bad，对应优良差
    */
    @SerializedName("Quality")
    @Expose
    private String Quality;

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
     * Get 会话结束时间 
     * @return EndTime 会话结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 会话结束时间
     * @param EndTime 会话结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通话质量：good|normal|bad，对应优良差 
     * @return Quality 通话质量：good|normal|bad，对应优良差
     */
    public String getQuality() {
        return this.Quality;
    }

    /**
     * Set 通话质量：good|normal|bad，对应优良差
     * @param Quality 通话质量：good|normal|bad，对应优良差
     */
    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public SessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionInfo(SessionInfo source) {
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
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Quality != null) {
            this.Quality = new String(source.Quality);
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
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Quality", this.Quality);

    }
}

