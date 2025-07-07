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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckRechargeKafkaServerRequest extends AbstractModel {

    /**
    * 导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * 腾讯云CKafka实例ID。
KafkaType为0时，KafkaInstance必填
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * 服务地址。
KafkaType为1时，ServerAddr必填
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * 加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
     * Get 导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。 
     * @return KafkaType 导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set 导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。
     * @param KafkaType 导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get 腾讯云CKafka实例ID。
KafkaType为0时，KafkaInstance必填 
     * @return KafkaInstance 腾讯云CKafka实例ID。
KafkaType为0时，KafkaInstance必填
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set 腾讯云CKafka实例ID。
KafkaType为0时，KafkaInstance必填
     * @param KafkaInstance 腾讯云CKafka实例ID。
KafkaType为0时，KafkaInstance必填
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get 服务地址。
KafkaType为1时，ServerAddr必填 
     * @return ServerAddr 服务地址。
KafkaType为1时，ServerAddr必填
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 服务地址。
KafkaType为1时，ServerAddr必填
     * @param ServerAddr 服务地址。
KafkaType为1时，ServerAddr必填
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。 
     * @return IsEncryptionAddr ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。
     * @param IsEncryptionAddr ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get 加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。 
     * @return Protocol 加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
     * @param Protocol 加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    public CheckRechargeKafkaServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckRechargeKafkaServerRequest(CheckRechargeKafkaServerRequest source) {
        if (source.KafkaType != null) {
            this.KafkaType = new Long(source.KafkaType);
        }
        if (source.KafkaInstance != null) {
            this.KafkaInstance = new String(source.KafkaInstance);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.IsEncryptionAddr != null) {
            this.IsEncryptionAddr = new Boolean(source.IsEncryptionAddr);
        }
        if (source.Protocol != null) {
            this.Protocol = new KafkaProtocolInfo(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaType", this.KafkaType);
        this.setParamSimple(map, prefix + "KafkaInstance", this.KafkaInstance);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "IsEncryptionAddr", this.IsEncryptionAddr);
        this.setParamObj(map, prefix + "Protocol.", this.Protocol);

    }
}

