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
    * <p>导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。</p>
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * <p>腾讯云CKafka实例ID。<br>KafkaType为0时，KafkaInstance必填</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * <p>服务地址。<br>KafkaType为1时，ServerAddr必填</p>
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * <p>ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。</p>
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * <p>加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * <p>网络信息参数</p>
    */
    @SerializedName("NetworkInfo")
    @Expose
    private NetworkInfo NetworkInfo;

    /**
    * <p>用户kafka拓展信息</p>
    */
    @SerializedName("UserKafkaMeta")
    @Expose
    private UserKafkaMeta UserKafkaMeta;

    /**
     * Get <p>导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。</p> 
     * @return KafkaType <p>导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。</p>
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set <p>导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。</p>
     * @param KafkaType <p>导入Kafka类型，0: 腾讯云CKafka；1: 用户自建Kafka。</p>
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get <p>腾讯云CKafka实例ID。<br>KafkaType为0时，KafkaInstance必填</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul> 
     * @return KafkaInstance <p>腾讯云CKafka实例ID。<br>KafkaType为0时，KafkaInstance必填</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set <p>腾讯云CKafka实例ID。<br>KafkaType为0时，KafkaInstance必填</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
     * @param KafkaInstance <p>腾讯云CKafka实例ID。<br>KafkaType为0时，KafkaInstance必填</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get <p>服务地址。<br>KafkaType为1时，ServerAddr必填</p> 
     * @return ServerAddr <p>服务地址。<br>KafkaType为1时，ServerAddr必填</p>
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set <p>服务地址。<br>KafkaType为1时，ServerAddr必填</p>
     * @param ServerAddr <p>服务地址。<br>KafkaType为1时，ServerAddr必填</p>
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get <p>ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。</p> 
     * @return IsEncryptionAddr <p>ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。</p>
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set <p>ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。</p>
     * @param IsEncryptionAddr <p>ServerAddr是否为加密连接，默认值false。当KafkaType为1用户自建kafka时生效。</p>
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get <p>加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p> 
     * @return Protocol <p>加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
     * @param Protocol <p>加密访问协议。KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>网络信息参数</p> 
     * @return NetworkInfo <p>网络信息参数</p>
     */
    public NetworkInfo getNetworkInfo() {
        return this.NetworkInfo;
    }

    /**
     * Set <p>网络信息参数</p>
     * @param NetworkInfo <p>网络信息参数</p>
     */
    public void setNetworkInfo(NetworkInfo NetworkInfo) {
        this.NetworkInfo = NetworkInfo;
    }

    /**
     * Get <p>用户kafka拓展信息</p> 
     * @return UserKafkaMeta <p>用户kafka拓展信息</p>
     */
    public UserKafkaMeta getUserKafkaMeta() {
        return this.UserKafkaMeta;
    }

    /**
     * Set <p>用户kafka拓展信息</p>
     * @param UserKafkaMeta <p>用户kafka拓展信息</p>
     */
    public void setUserKafkaMeta(UserKafkaMeta UserKafkaMeta) {
        this.UserKafkaMeta = UserKafkaMeta;
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
        if (source.NetworkInfo != null) {
            this.NetworkInfo = new NetworkInfo(source.NetworkInfo);
        }
        if (source.UserKafkaMeta != null) {
            this.UserKafkaMeta = new UserKafkaMeta(source.UserKafkaMeta);
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
        this.setParamObj(map, prefix + "NetworkInfo.", this.NetworkInfo);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

