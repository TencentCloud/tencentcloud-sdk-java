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

public class FlowSRTInfo extends AbstractModel{

    /**
    * 时间戳，单位是秒。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 发送丢包率。
    */
    @SerializedName("SendPacketLossRate")
    @Expose
    private Long SendPacketLossRate;

    /**
    * 发送重传率。
    */
    @SerializedName("SendRetransmissionRate")
    @Expose
    private Long SendRetransmissionRate;

    /**
    * 接收丢包率。
    */
    @SerializedName("RecvPacketLossRate")
    @Expose
    private Long RecvPacketLossRate;

    /**
    * 接收重传率。
    */
    @SerializedName("RecvRetransmissionRate")
    @Expose
    private Long RecvRetransmissionRate;

    /**
    * 与对端的RTT时延。
    */
    @SerializedName("RTT")
    @Expose
    private Long RTT;

    /**
    * 标志同一次推流。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 发送弃包数。
    */
    @SerializedName("SendPacketDropNumber")
    @Expose
    private Long SendPacketDropNumber;

    /**
    * 接收弃包数。
    */
    @SerializedName("RecvPacketDropNumber")
    @Expose
    private Long RecvPacketDropNumber;

    /**
     * Get 时间戳，单位是秒。 
     * @return Timestamp 时间戳，单位是秒。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳，单位是秒。
     * @param Timestamp 时间戳，单位是秒。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 发送丢包率。 
     * @return SendPacketLossRate 发送丢包率。
     */
    public Long getSendPacketLossRate() {
        return this.SendPacketLossRate;
    }

    /**
     * Set 发送丢包率。
     * @param SendPacketLossRate 发送丢包率。
     */
    public void setSendPacketLossRate(Long SendPacketLossRate) {
        this.SendPacketLossRate = SendPacketLossRate;
    }

    /**
     * Get 发送重传率。 
     * @return SendRetransmissionRate 发送重传率。
     */
    public Long getSendRetransmissionRate() {
        return this.SendRetransmissionRate;
    }

    /**
     * Set 发送重传率。
     * @param SendRetransmissionRate 发送重传率。
     */
    public void setSendRetransmissionRate(Long SendRetransmissionRate) {
        this.SendRetransmissionRate = SendRetransmissionRate;
    }

    /**
     * Get 接收丢包率。 
     * @return RecvPacketLossRate 接收丢包率。
     */
    public Long getRecvPacketLossRate() {
        return this.RecvPacketLossRate;
    }

    /**
     * Set 接收丢包率。
     * @param RecvPacketLossRate 接收丢包率。
     */
    public void setRecvPacketLossRate(Long RecvPacketLossRate) {
        this.RecvPacketLossRate = RecvPacketLossRate;
    }

    /**
     * Get 接收重传率。 
     * @return RecvRetransmissionRate 接收重传率。
     */
    public Long getRecvRetransmissionRate() {
        return this.RecvRetransmissionRate;
    }

    /**
     * Set 接收重传率。
     * @param RecvRetransmissionRate 接收重传率。
     */
    public void setRecvRetransmissionRate(Long RecvRetransmissionRate) {
        this.RecvRetransmissionRate = RecvRetransmissionRate;
    }

    /**
     * Get 与对端的RTT时延。 
     * @return RTT 与对端的RTT时延。
     */
    public Long getRTT() {
        return this.RTT;
    }

    /**
     * Set 与对端的RTT时延。
     * @param RTT 与对端的RTT时延。
     */
    public void setRTT(Long RTT) {
        this.RTT = RTT;
    }

    /**
     * Get 标志同一次推流。 
     * @return SessionId 标志同一次推流。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 标志同一次推流。
     * @param SessionId 标志同一次推流。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 发送弃包数。 
     * @return SendPacketDropNumber 发送弃包数。
     */
    public Long getSendPacketDropNumber() {
        return this.SendPacketDropNumber;
    }

    /**
     * Set 发送弃包数。
     * @param SendPacketDropNumber 发送弃包数。
     */
    public void setSendPacketDropNumber(Long SendPacketDropNumber) {
        this.SendPacketDropNumber = SendPacketDropNumber;
    }

    /**
     * Get 接收弃包数。 
     * @return RecvPacketDropNumber 接收弃包数。
     */
    public Long getRecvPacketDropNumber() {
        return this.RecvPacketDropNumber;
    }

    /**
     * Set 接收弃包数。
     * @param RecvPacketDropNumber 接收弃包数。
     */
    public void setRecvPacketDropNumber(Long RecvPacketDropNumber) {
        this.RecvPacketDropNumber = RecvPacketDropNumber;
    }

    public FlowSRTInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowSRTInfo(FlowSRTInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.SendPacketLossRate != null) {
            this.SendPacketLossRate = new Long(source.SendPacketLossRate);
        }
        if (source.SendRetransmissionRate != null) {
            this.SendRetransmissionRate = new Long(source.SendRetransmissionRate);
        }
        if (source.RecvPacketLossRate != null) {
            this.RecvPacketLossRate = new Long(source.RecvPacketLossRate);
        }
        if (source.RecvRetransmissionRate != null) {
            this.RecvRetransmissionRate = new Long(source.RecvRetransmissionRate);
        }
        if (source.RTT != null) {
            this.RTT = new Long(source.RTT);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SendPacketDropNumber != null) {
            this.SendPacketDropNumber = new Long(source.SendPacketDropNumber);
        }
        if (source.RecvPacketDropNumber != null) {
            this.RecvPacketDropNumber = new Long(source.RecvPacketDropNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SendPacketLossRate", this.SendPacketLossRate);
        this.setParamSimple(map, prefix + "SendRetransmissionRate", this.SendRetransmissionRate);
        this.setParamSimple(map, prefix + "RecvPacketLossRate", this.RecvPacketLossRate);
        this.setParamSimple(map, prefix + "RecvRetransmissionRate", this.RecvRetransmissionRate);
        this.setParamSimple(map, prefix + "RTT", this.RTT);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SendPacketDropNumber", this.SendPacketDropNumber);
        this.setParamSimple(map, prefix + "RecvPacketDropNumber", this.RecvPacketDropNumber);

    }
}

