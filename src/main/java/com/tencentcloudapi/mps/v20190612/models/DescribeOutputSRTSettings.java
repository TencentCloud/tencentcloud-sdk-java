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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputSRTSettings extends AbstractModel {

    /**
    * <p>转推的目标的地址信息列表，SRT模式为CALLER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destinations")
    @Expose
    private SRTAddressDestination [] Destinations;

    /**
    * <p>流Id。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * <p>接收延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * <p>对端延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * <p>对端空闲超时时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * <p>加密密钥。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * <p>加密密钥长度。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * <p>SRT模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>服务器监听地址，SRT模式为LISTENER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceAddresses")
    @Expose
    private OutputSRTSourceAddressResp [] SourceAddresses;

    /**
    * <p>FEC 配置</p>
    */
    @SerializedName("FEC")
    @Expose
    private SRTFECFullOptions FEC;

    /**
     * Get <p>转推的目标的地址信息列表，SRT模式为CALLER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destinations <p>转推的目标的地址信息列表，SRT模式为CALLER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SRTAddressDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set <p>转推的目标的地址信息列表，SRT模式为CALLER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destinations <p>转推的目标的地址信息列表，SRT模式为CALLER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinations(SRTAddressDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get <p>流Id。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamId <p>流Id。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>流Id。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamId <p>流Id。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Latency <p>延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set <p>延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Latency <p>延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get <p>接收延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecvLatency <p>接收延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set <p>接收延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecvLatency <p>接收延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get <p>对端延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerLatency <p>对端延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set <p>对端延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerLatency <p>对端延迟。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get <p>对端空闲超时时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerIdleTimeout <p>对端空闲超时时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set <p>对端空闲超时时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerIdleTimeout <p>对端空闲超时时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get <p>加密密钥。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Passphrase <p>加密密钥。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set <p>加密密钥。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Passphrase <p>加密密钥。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get <p>加密密钥长度。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PbKeyLen <p>加密密钥长度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set <p>加密密钥长度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PbKeyLen <p>加密密钥长度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Get <p>SRT模式。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode <p>SRT模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>SRT模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode <p>SRT模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>服务器监听地址，SRT模式为LISTENER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceAddresses <p>服务器监听地址，SRT模式为LISTENER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputSRTSourceAddressResp [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set <p>服务器监听地址，SRT模式为LISTENER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceAddresses <p>服务器监听地址，SRT模式为LISTENER时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceAddresses(OutputSRTSourceAddressResp [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    /**
     * Get <p>FEC 配置</p> 
     * @return FEC <p>FEC 配置</p>
     */
    public SRTFECFullOptions getFEC() {
        return this.FEC;
    }

    /**
     * Set <p>FEC 配置</p>
     * @param FEC <p>FEC 配置</p>
     */
    public void setFEC(SRTFECFullOptions FEC) {
        this.FEC = FEC;
    }

    public DescribeOutputSRTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputSRTSettings(DescribeOutputSRTSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new SRTAddressDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new SRTAddressDestination(source.Destinations[i]);
            }
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new OutputSRTSourceAddressResp[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new OutputSRTSourceAddressResp(source.SourceAddresses[i]);
            }
        }
        if (source.FEC != null) {
            this.FEC = new SRTFECFullOptions(source.FEC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);
        this.setParamObj(map, prefix + "FEC.", this.FEC);

    }
}

