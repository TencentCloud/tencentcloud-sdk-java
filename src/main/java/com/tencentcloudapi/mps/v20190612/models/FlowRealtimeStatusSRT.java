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

public class FlowRealtimeStatusSRT extends AbstractModel{

    /**
    * 延迟，单位为ms。
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * RTT，单位为ms。
    */
    @SerializedName("RTT")
    @Expose
    private Long RTT;

    /**
    * 实时发包数或者收包数。
    */
    @SerializedName("Packets")
    @Expose
    private Long Packets;

    /**
    * 丢包率。
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Float PacketLossRate;

    /**
    * 重传率。
    */
    @SerializedName("RetransmitRate")
    @Expose
    private Float RetransmitRate;

    /**
    * 实时丢包数。
    */
    @SerializedName("DroppedPackets")
    @Expose
    private Long DroppedPackets;

    /**
    * 是否加密，On|Off。
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get 延迟，单位为ms。 
     * @return Latency 延迟，单位为ms。
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set 延迟，单位为ms。
     * @param Latency 延迟，单位为ms。
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get RTT，单位为ms。 
     * @return RTT RTT，单位为ms。
     */
    public Long getRTT() {
        return this.RTT;
    }

    /**
     * Set RTT，单位为ms。
     * @param RTT RTT，单位为ms。
     */
    public void setRTT(Long RTT) {
        this.RTT = RTT;
    }

    /**
     * Get 实时发包数或者收包数。 
     * @return Packets 实时发包数或者收包数。
     */
    public Long getPackets() {
        return this.Packets;
    }

    /**
     * Set 实时发包数或者收包数。
     * @param Packets 实时发包数或者收包数。
     */
    public void setPackets(Long Packets) {
        this.Packets = Packets;
    }

    /**
     * Get 丢包率。 
     * @return PacketLossRate 丢包率。
     */
    public Float getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set 丢包率。
     * @param PacketLossRate 丢包率。
     */
    public void setPacketLossRate(Float PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Get 重传率。 
     * @return RetransmitRate 重传率。
     */
    public Float getRetransmitRate() {
        return this.RetransmitRate;
    }

    /**
     * Set 重传率。
     * @param RetransmitRate 重传率。
     */
    public void setRetransmitRate(Float RetransmitRate) {
        this.RetransmitRate = RetransmitRate;
    }

    /**
     * Get 实时丢包数。 
     * @return DroppedPackets 实时丢包数。
     */
    public Long getDroppedPackets() {
        return this.DroppedPackets;
    }

    /**
     * Set 实时丢包数。
     * @param DroppedPackets 实时丢包数。
     */
    public void setDroppedPackets(Long DroppedPackets) {
        this.DroppedPackets = DroppedPackets;
    }

    /**
     * Get 是否加密，On|Off。 
     * @return Encryption 是否加密，On|Off。
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 是否加密，On|Off。
     * @param Encryption 是否加密，On|Off。
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    public FlowRealtimeStatusSRT() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusSRT(FlowRealtimeStatusSRT source) {
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
        if (source.RTT != null) {
            this.RTT = new Long(source.RTT);
        }
        if (source.Packets != null) {
            this.Packets = new Long(source.Packets);
        }
        if (source.PacketLossRate != null) {
            this.PacketLossRate = new Float(source.PacketLossRate);
        }
        if (source.RetransmitRate != null) {
            this.RetransmitRate = new Float(source.RetransmitRate);
        }
        if (source.DroppedPackets != null) {
            this.DroppedPackets = new Long(source.DroppedPackets);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RTT", this.RTT);
        this.setParamSimple(map, prefix + "Packets", this.Packets);
        this.setParamSimple(map, prefix + "PacketLossRate", this.PacketLossRate);
        this.setParamSimple(map, prefix + "RetransmitRate", this.RetransmitRate);
        this.setParamSimple(map, prefix + "DroppedPackets", this.DroppedPackets);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);

    }
}

