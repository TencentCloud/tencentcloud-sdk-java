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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQConnection extends AbstractModel {

    /**
    * 连接名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionName")
    @Expose
    private String ConnectionName;

    /**
    * 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerHost")
    @Expose
    private String PeerHost;

    /**
    * 连接状态，包括 starting、tuning、opening、running、flow、blocking、blocked、closing 和 closed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 连接使用用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 是否开启ssl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSL")
    @Expose
    private Boolean SSL;

    /**
    * 连接协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 连接下的channel数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channels")
    @Expose
    private Long Channels;

    /**
     * Get 连接名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionName 连接名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectionName() {
        return this.ConnectionName;
    }

    /**
     * Set 连接名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionName 连接名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionName(String ConnectionName) {
        this.ConnectionName = ConnectionName;
    }

    /**
     * Get 客户端ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerHost 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerHost() {
        return this.PeerHost;
    }

    /**
     * Set 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerHost 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerHost(String PeerHost) {
        this.PeerHost = PeerHost;
    }

    /**
     * Get 连接状态，包括 starting、tuning、opening、running、flow、blocking、blocked、closing 和 closed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 连接状态，包括 starting、tuning、opening、running、flow、blocking、blocked、closing 和 closed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 连接状态，包括 starting、tuning、opening、running、flow、blocking、blocked、closing 和 closed
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 连接状态，包括 starting、tuning、opening、running、flow、blocking、blocked、closing 和 closed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 连接使用用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 连接使用用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 连接使用用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 连接使用用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 是否开启ssl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSL 是否开启ssl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSSL() {
        return this.SSL;
    }

    /**
     * Set 是否开启ssl
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSL 是否开启ssl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSL(Boolean SSL) {
        this.SSL = SSL;
    }

    /**
     * Get 连接协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 连接协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 连接协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 连接协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 连接下的channel数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channels 连接下的channel数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannels() {
        return this.Channels;
    }

    /**
     * Set 连接下的channel数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channels 连接下的channel数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannels(Long Channels) {
        this.Channels = Channels;
    }

    public RabbitMQConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQConnection(RabbitMQConnection source) {
        if (source.ConnectionName != null) {
            this.ConnectionName = new String(source.ConnectionName);
        }
        if (source.PeerHost != null) {
            this.PeerHost = new String(source.PeerHost);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.SSL != null) {
            this.SSL = new Boolean(source.SSL);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Channels != null) {
            this.Channels = new Long(source.Channels);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionName", this.ConnectionName);
        this.setParamSimple(map, prefix + "PeerHost", this.PeerHost);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "SSL", this.SSL);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Channels", this.Channels);

    }
}

