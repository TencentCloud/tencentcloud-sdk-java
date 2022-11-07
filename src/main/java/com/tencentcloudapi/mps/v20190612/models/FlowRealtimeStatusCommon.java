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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowRealtimeStatusCommon extends AbstractModel{

    /**
    * 当前连接状态，Connected|Waiting|Idle。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 连接模式，Listener|Caller。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 已连接时长，单位为ms。
    */
    @SerializedName("ConnectedTime")
    @Expose
    private Long ConnectedTime;

    /**
    * 实时码率，单位为bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 重试次数。
    */
    @SerializedName("Reconnections")
    @Expose
    private Long Reconnections;

    /**
     * Get 当前连接状态，Connected|Waiting|Idle。 
     * @return State 当前连接状态，Connected|Waiting|Idle。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 当前连接状态，Connected|Waiting|Idle。
     * @param State 当前连接状态，Connected|Waiting|Idle。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 连接模式，Listener|Caller。 
     * @return Mode 连接模式，Listener|Caller。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 连接模式，Listener|Caller。
     * @param Mode 连接模式，Listener|Caller。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 已连接时长，单位为ms。 
     * @return ConnectedTime 已连接时长，单位为ms。
     */
    public Long getConnectedTime() {
        return this.ConnectedTime;
    }

    /**
     * Set 已连接时长，单位为ms。
     * @param ConnectedTime 已连接时长，单位为ms。
     */
    public void setConnectedTime(Long ConnectedTime) {
        this.ConnectedTime = ConnectedTime;
    }

    /**
     * Get 实时码率，单位为bps。 
     * @return Bitrate 实时码率，单位为bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 实时码率，单位为bps。
     * @param Bitrate 实时码率，单位为bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 重试次数。 
     * @return Reconnections 重试次数。
     */
    public Long getReconnections() {
        return this.Reconnections;
    }

    /**
     * Set 重试次数。
     * @param Reconnections 重试次数。
     */
    public void setReconnections(Long Reconnections) {
        this.Reconnections = Reconnections;
    }

    public FlowRealtimeStatusCommon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusCommon(FlowRealtimeStatusCommon source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ConnectedTime != null) {
            this.ConnectedTime = new Long(source.ConnectedTime);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Reconnections != null) {
            this.Reconnections = new Long(source.Reconnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ConnectedTime", this.ConnectedTime);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Reconnections", this.Reconnections);

    }
}

