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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerClient extends AbstractModel {

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 客户端地址
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * 客户端SDK语言
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 客户端SDK版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 客户端消费堆积
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * 消费者客户端类型，枚举值如下：

- grpc：GRPC协议
- remoting：Remoting协议
- http：HTTP协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelProtocol")
    @Expose
    private String ChannelProtocol;

    /**
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 客户端地址 
     * @return ClientAddr 客户端地址
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set 客户端地址
     * @param ClientAddr 客户端地址
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get 客户端SDK语言 
     * @return Language 客户端SDK语言
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 客户端SDK语言
     * @param Language 客户端SDK语言
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 客户端SDK版本 
     * @return Version 客户端SDK版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 客户端SDK版本
     * @param Version 客户端SDK版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 客户端消费堆积
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerLag 客户端消费堆积
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set 客户端消费堆积
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerLag 客户端消费堆积
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get 消费者客户端类型，枚举值如下：

- grpc：GRPC协议
- remoting：Remoting协议
- http：HTTP协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelProtocol 消费者客户端类型，枚举值如下：

- grpc：GRPC协议
- remoting：Remoting协议
- http：HTTP协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelProtocol() {
        return this.ChannelProtocol;
    }

    /**
     * Set 消费者客户端类型，枚举值如下：

- grpc：GRPC协议
- remoting：Remoting协议
- http：HTTP协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelProtocol 消费者客户端类型，枚举值如下：

- grpc：GRPC协议
- remoting：Remoting协议
- http：HTTP协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelProtocol(String ChannelProtocol) {
        this.ChannelProtocol = ChannelProtocol;
    }

    public ConsumerClient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerClient(ConsumerClient source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.ChannelProtocol != null) {
            this.ChannelProtocol = new String(source.ChannelProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "ChannelProtocol", this.ChannelProtocol);

    }
}

