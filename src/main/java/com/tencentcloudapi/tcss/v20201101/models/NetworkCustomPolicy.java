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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkCustomPolicy extends AbstractModel{

    /**
    * 网络策略方向，分为FROM和TO
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 网络策略策略端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ports")
    @Expose
    private NetworkPorts [] Ports;

    /**
    * 网络策略策略对象

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Peer")
    @Expose
    private NetworkPeer [] Peer;

    /**
     * Get 网络策略方向，分为FROM和TO 
     * @return Direction 网络策略方向，分为FROM和TO
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 网络策略方向，分为FROM和TO
     * @param Direction 网络策略方向，分为FROM和TO
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 网络策略策略端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ports 网络策略策略端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkPorts [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 网络策略策略端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ports 网络策略策略端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPorts(NetworkPorts [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 网络策略策略对象

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Peer 网络策略策略对象

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkPeer [] getPeer() {
        return this.Peer;
    }

    /**
     * Set 网络策略策略对象

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
注意：此字段可能返回 null，表示取不到有效值。
     * @param Peer 网络策略策略对象

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeer(NetworkPeer [] Peer) {
        this.Peer = Peer;
    }

    public NetworkCustomPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkCustomPolicy(NetworkCustomPolicy source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Ports != null) {
            this.Ports = new NetworkPorts[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new NetworkPorts(source.Ports[i]);
            }
        }
        if (source.Peer != null) {
            this.Peer = new NetworkPeer[source.Peer.length];
            for (int i = 0; i < source.Peer.length; i++) {
                this.Peer[i] = new NetworkPeer(source.Peer[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "Peer.", this.Peer);

    }
}

