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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiNet extends AbstractModel {

    /**
    * 网卡序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetId")
    @Expose
    private Long NetId;

    /**
    * 网卡IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetIp")
    @Expose
    private String NetIp;

    /**
    * 时延，单位ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rtt")
    @Expose
    private Long [] Rtt;

    /**
    * 丢包率，单位%
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lost")
    @Expose
    private Long [] Lost;

    /**
    * 发送bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendBps")
    @Expose
    private Long [] SendBps;

    /**
    * 接收bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecvBps")
    @Expose
    private Long [] RecvBps;

    /**
     * Get 网卡序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetId 网卡序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetId() {
        return this.NetId;
    }

    /**
     * Set 网卡序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetId 网卡序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetId(Long NetId) {
        this.NetId = NetId;
    }

    /**
     * Get 网卡IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetIp 网卡IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetIp() {
        return this.NetIp;
    }

    /**
     * Set 网卡IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetIp 网卡IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetIp(String NetIp) {
        this.NetIp = NetIp;
    }

    /**
     * Get 时延，单位ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rtt 时延，单位ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRtt() {
        return this.Rtt;
    }

    /**
     * Set 时延，单位ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rtt 时延，单位ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRtt(Long [] Rtt) {
        this.Rtt = Rtt;
    }

    /**
     * Get 丢包率，单位%
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lost 丢包率，单位%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getLost() {
        return this.Lost;
    }

    /**
     * Set 丢包率，单位%
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lost 丢包率，单位%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLost(Long [] Lost) {
        this.Lost = Lost;
    }

    /**
     * Get 发送bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendBps 发送bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSendBps() {
        return this.SendBps;
    }

    /**
     * Set 发送bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendBps 发送bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendBps(Long [] SendBps) {
        this.SendBps = SendBps;
    }

    /**
     * Get 接收bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecvBps 接收bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRecvBps() {
        return this.RecvBps;
    }

    /**
     * Set 接收bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecvBps 接收bps，单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecvBps(Long [] RecvBps) {
        this.RecvBps = RecvBps;
    }

    public MultiNet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiNet(MultiNet source) {
        if (source.NetId != null) {
            this.NetId = new Long(source.NetId);
        }
        if (source.NetIp != null) {
            this.NetIp = new String(source.NetIp);
        }
        if (source.Rtt != null) {
            this.Rtt = new Long[source.Rtt.length];
            for (int i = 0; i < source.Rtt.length; i++) {
                this.Rtt[i] = new Long(source.Rtt[i]);
            }
        }
        if (source.Lost != null) {
            this.Lost = new Long[source.Lost.length];
            for (int i = 0; i < source.Lost.length; i++) {
                this.Lost[i] = new Long(source.Lost[i]);
            }
        }
        if (source.SendBps != null) {
            this.SendBps = new Long[source.SendBps.length];
            for (int i = 0; i < source.SendBps.length; i++) {
                this.SendBps[i] = new Long(source.SendBps[i]);
            }
        }
        if (source.RecvBps != null) {
            this.RecvBps = new Long[source.RecvBps.length];
            for (int i = 0; i < source.RecvBps.length; i++) {
                this.RecvBps[i] = new Long(source.RecvBps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetId", this.NetId);
        this.setParamSimple(map, prefix + "NetIp", this.NetIp);
        this.setParamArraySimple(map, prefix + "Rtt.", this.Rtt);
        this.setParamArraySimple(map, prefix + "Lost.", this.Lost);
        this.setParamArraySimple(map, prefix + "SendBps.", this.SendBps);
        this.setParamArraySimple(map, prefix + "RecvBps.", this.RecvBps);

    }
}

