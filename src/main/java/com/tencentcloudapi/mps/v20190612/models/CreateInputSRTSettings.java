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

public class CreateInputSRTSettings extends AbstractModel{

    /**
    * SRT模式，可选[LISTENER|CALLER]，默认为LISTENER。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 流Id，可选大小写字母、数字和特殊字符（.#!:&,=_-），长度为0~512。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 延迟，默认0，单位ms，范围为[0, 3000]。
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * 接收延迟，默认120，单位ms，范围为[0, 3000]。
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * 对端延迟，默认0，单位ms，范围为[0, 3000]。
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * 对端超时时间，默认5000，单位ms，范围为[1000, 10000]。
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * 解密密钥，默认为空，表示不加密。只可填ascii码值，长度为[10, 79]。
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * 密钥长度，默认为0，可选[0|16|24|32]。
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * SRT对端地址，当Mode为CALLER时必填，且只能填1组。
    */
    @SerializedName("SourceAddresses")
    @Expose
    private SRTSourceAddressReq [] SourceAddresses;

    /**
     * Get SRT模式，可选[LISTENER|CALLER]，默认为LISTENER。 
     * @return Mode SRT模式，可选[LISTENER|CALLER]，默认为LISTENER。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set SRT模式，可选[LISTENER|CALLER]，默认为LISTENER。
     * @param Mode SRT模式，可选[LISTENER|CALLER]，默认为LISTENER。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 流Id，可选大小写字母、数字和特殊字符（.#!:&,=_-），长度为0~512。 
     * @return StreamId 流Id，可选大小写字母、数字和特殊字符（.#!:&,=_-），长度为0~512。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流Id，可选大小写字母、数字和特殊字符（.#!:&,=_-），长度为0~512。
     * @param StreamId 流Id，可选大小写字母、数字和特殊字符（.#!:&,=_-），长度为0~512。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 延迟，默认0，单位ms，范围为[0, 3000]。 
     * @return Latency 延迟，默认0，单位ms，范围为[0, 3000]。
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set 延迟，默认0，单位ms，范围为[0, 3000]。
     * @param Latency 延迟，默认0，单位ms，范围为[0, 3000]。
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get 接收延迟，默认120，单位ms，范围为[0, 3000]。 
     * @return RecvLatency 接收延迟，默认120，单位ms，范围为[0, 3000]。
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set 接收延迟，默认120，单位ms，范围为[0, 3000]。
     * @param RecvLatency 接收延迟，默认120，单位ms，范围为[0, 3000]。
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get 对端延迟，默认0，单位ms，范围为[0, 3000]。 
     * @return PeerLatency 对端延迟，默认0，单位ms，范围为[0, 3000]。
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set 对端延迟，默认0，单位ms，范围为[0, 3000]。
     * @param PeerLatency 对端延迟，默认0，单位ms，范围为[0, 3000]。
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get 对端超时时间，默认5000，单位ms，范围为[1000, 10000]。 
     * @return PeerIdleTimeout 对端超时时间，默认5000，单位ms，范围为[1000, 10000]。
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set 对端超时时间，默认5000，单位ms，范围为[1000, 10000]。
     * @param PeerIdleTimeout 对端超时时间，默认5000，单位ms，范围为[1000, 10000]。
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get 解密密钥，默认为空，表示不加密。只可填ascii码值，长度为[10, 79]。 
     * @return Passphrase 解密密钥，默认为空，表示不加密。只可填ascii码值，长度为[10, 79]。
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set 解密密钥，默认为空，表示不加密。只可填ascii码值，长度为[10, 79]。
     * @param Passphrase 解密密钥，默认为空，表示不加密。只可填ascii码值，长度为[10, 79]。
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get 密钥长度，默认为0，可选[0|16|24|32]。 
     * @return PbKeyLen 密钥长度，默认为0，可选[0|16|24|32]。
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set 密钥长度，默认为0，可选[0|16|24|32]。
     * @param PbKeyLen 密钥长度，默认为0，可选[0|16|24|32]。
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Get SRT对端地址，当Mode为CALLER时必填，且只能填1组。 
     * @return SourceAddresses SRT对端地址，当Mode为CALLER时必填，且只能填1组。
     */
    public SRTSourceAddressReq [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set SRT对端地址，当Mode为CALLER时必填，且只能填1组。
     * @param SourceAddresses SRT对端地址，当Mode为CALLER时必填，且只能填1组。
     */
    public void setSourceAddresses(SRTSourceAddressReq [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public CreateInputSRTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInputSRTSettings(CreateInputSRTSettings source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
        if (source.RecvLatency != null) {
            this.RecvLatency = new Long(source.RecvLatency);
        }
        if (source.PeerLatency != null) {
            this.PeerLatency = new Long(source.PeerLatency);
        }
        if (source.PeerIdleTimeout != null) {
            this.PeerIdleTimeout = new Long(source.PeerIdleTimeout);
        }
        if (source.Passphrase != null) {
            this.Passphrase = new String(source.Passphrase);
        }
        if (source.PbKeyLen != null) {
            this.PbKeyLen = new Long(source.PbKeyLen);
        }
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new SRTSourceAddressReq[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new SRTSourceAddressReq(source.SourceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);

    }
}

